package br.com.treinaweb.ediaristas.core.models;

import java.math.BigDecimal;

import javax.persistence.Entity;

import br.com.treinaweb.ediaristas.core.enums.Icone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class Servico {

    @EqualsAndHashCode.Include
    @ToString.Include
    private Long id;

    private String nome;

    private BigDecimal valorMinimo;

    private Integer qtdHoras;

    private BigDecimal porcentagemComissao;

    private Integer horasQuarto;

    private BigDecimal valorQuarto;

    private Integer horasSala;

    private BigDecimal valorSala;

    private Integer horasBanheiro;

    private BigDecimal valorBanheiro;

    private Integer horasCozinha;

    private BigDecimal valorCozinha;

    private Integer horasQuintas;

    private BigDecimal valorQuintas;

    private Integer horasOutros;

    private BigDecimal valorOutros;

    private Icone icone;

    private Integer posicao;

}
