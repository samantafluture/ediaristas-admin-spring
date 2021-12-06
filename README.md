# Dashboard Administrativo do e-diaristas

Dashboard com funções simples CRUD e login/cadastro, para gerenciar a parte administrativa de uma aplicação web.

## Dependências

- Spring Boot
- Spring Web MVC
- Thymeleaf
- Spring Data JPA
- bean Validation

## Arquitetura

### Entidades 

#### Servico.java

- representação da tabela `servico` no banco de dados
- classe `POJO` tradicional
- sem lógica de negócio, apenas argumentos
- informar que é uma tabela de dados `@Entity`
- usar `LOMBOK` para criar getters, setters etc
- métodos `equals`, `hashcode` e `toString` devem usar apenas o `id` da classe
- por isso temos annotations diferentes que incluem apenas o `id`
- o `id` terá a annotation de `@GeneratedValue` com estratégia de `identity` pois será gerado automaticamente pelo bando de dados

`mvn spring-boot:run` vai criar a tabela `servico` no banco de dados `ediaristas` conectado à aplicação

### Controllers
- métodos crud
- deve ficar com a responsabilidade apenas de web -> requisição e resposta
- controla qual view vai ser renderizada e quais dados vão ser renderizados por aquela view
- qualquer outra coisa de responsabilidade deve ser extraída para outra camada (exemplo `service`)

### DTOs
- irá presentar os dados que vão ser trafegados na aplicação
- uma ótima classe para inserir as validações
- exemplo `ServicoForm.java` tem as propriedades / atributos do formulário de serviço

### Mappers
- responsável por fazer a conversão entre a camada de `DTO` e a camada de `entidade` (e vice-versa)
- `bean spring` -> classe gerenciada pelo Spring, possibilitando acessar ela através de injeção de dependência
- usar o `@Component`

### Service
- é um `bean spring` @Service
- fazer a comunicação com o `repository` e com o `mapper`

### Interfaces

#### ServicoRepository.java

- estende a interface `JpaRepository` e dita os tipos `<T, ID>`, sendo `T` o model do tipo `Servico` e o `id` do tipo `Long`, fincando: `<Servico, Long>`

