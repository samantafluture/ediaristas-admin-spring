package br.com.treinaweb.ediaristas.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treinaweb.ediaristas.core.exceptions.ServicoNaoEncontradoException;
import br.com.treinaweb.ediaristas.core.models.Servico;
import br.com.treinaweb.ediaristas.core.repositories.ServicoRepository;
import br.com.treinaweb.ediaristas.web.dtos.ServicoForm;
import br.com.treinaweb.ediaristas.web.mappers.WebServicoMapper;

@Service
public class WebServicoService {

    @Autowired
    private ServicoRepository repository;

    @Autowired
    private WebServicoMapper mapper;

    public List<Servico> buscarTodos() {
        return repository.findAll();
    }

    public Servico cadastrar(ServicoForm form) {
        var model = mapper.toModel(form);

        return repository.save(model);
    }

    public Servico buscaPorId(Long id) {
        var servicoEncontrado = repository.findById(id);

        if (servicoEncontrado.isPresent()) {
            return servicoEncontrado.get();
        }

        var mensagem = String.format("Serviço com %id não encontrado", id);
        throw new ServicoNaoEncontradoException(mensagem);
    }

    public Servico editar(ServicoForm form, Long id) {
        var servicoEncontrado = buscaPorId(id);

        var model = mapper.toModel(form);
        model.setId(servicoEncontrado.getId());

        return repository.save(model);
    }

    public void excluirPorId(Long id) {
        var servicoEncontrado = buscaPorId(id);

        repository.delete(servicoEncontrado);
    }

}
