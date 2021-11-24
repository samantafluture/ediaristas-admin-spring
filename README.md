# Dashboard Administrativo do e-diaristas

Construído com: Java 17, Spring Boot, Thymeleaf, Maven, Lombok, JPA, Hibernate, MySql, AdminETL.

## Entidades 

### Servico.java
- representação da tabela `servico` no banco de dados
- classe `POJO` tradicional
- sem lógica de negócio, apenas argumentos
- informar que é uma tabela de dados `@Entity`
- usar `LOMBOK` para criar getters, setters etc
- métodos `equals`, `hashcode` e `toString` devem usar apenas o `id` da classe
- por isso temos annotations diferentes que incluem apenas o `id`
- o `id` terá a annotation de `@GeneratedValue` com estratégia de `identity` pois será gerado automaticamente pelo bando de dados

`mvn spring-boot:run` vai criar a tabela `servico` no banco de dados `ediaristas` conectado à aplicação

## Controllers
- métodos crud
- recebe o `repository` como injeção de dependência

## DTOs
- irá presentar os dados que vão ser trafegados na aplicação
- uma ótima classe para inserir as validações
- exemplo `ServicoForm.java` tem as propriedades / atributos do formulário de serviço

## Mappers
- responsável por fazer a conversão entre a camada de `DTO` e a camada de `entidade` (e vice-versa)
- `bean spring` -> classe gerenciada pelo Spring, possibilitando acessar ela através de injeção de dependência
- usar o `@Component`

## Interfaces

### ServicoRepository.java
- estende a interface `JpaRepository` e dita os tipos `<T, ID>`, sendo `T` o model do tipo `Servico` e o `id` do tipo `Long`, fincando: `<Servico, Long>`

