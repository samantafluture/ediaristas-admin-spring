# Dashboard Administrativo do e-diaristas

Construído com: Java 17, Spring Boot, Thymeleaf, Maven, Lombok, JPA, Hibernate, MySql, AdminETL.

## Classe Servico.java
- classe `POJO` tradicional
- sem lógica de negócio, apenas argumentos
- informar que é uma tabela de dados `@Entity`
- usar `LOMBOK` para criar getters, setters etc
- métodos `equals`, `hashcode` e `toString` devem usar apenas o `id` da classe
- por isso temos annotations diferentes que incluem apenas o `id`


