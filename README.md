# Dashboard Administrativo do e-diaristas

Construído com: Java 17, Spring Boot, Thymeleaf, Maven, Lombok, JPA, Hibernate, MySql, AdminETL.

## Classes 

### Servico.java
- classe `POJO` tradicional
- sem lógica de negócio, apenas argumentos
- informar que é uma tabela de dados `@Entity`
- usar `LOMBOK` para criar getters, setters etc
- métodos `equals`, `hashcode` e `toString` devem usar apenas o `id` da classe
- por isso temos annotations diferentes que incluem apenas o `id`
- o `id` terá a annotation de `@GeneratedValue` com estratégia de `identity` pois será gerado automaticamente pelo bando de dados

`mvn spring-boot:run` vai criar a tabela `servico` no banco de dados `ediaristas` conectado à aplicação

## Interfaces

### ServicoRepository.java
- estende a interface `JpaRepository` e dita os tipos `<T, ID>`, sendo `T` o model do tipo `Servico` e o `id` do tipo `Long`, fincando: `<Servico, Long>`
