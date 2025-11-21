# Agência API  
Projeto Spring Boot (Maven) com integração **PostgreSQL** via **Spring Data JPA** + **Spring Security (JWT)**

## 📝 Descrição  
Este projeto é uma API para “agência” (por exemplo, agência de viagens ou agência de serviços) construída com Spring Boot. Ele utiliza:  
- Java + Spring Boot  
- Maven como sistema de build  
- Banco de dados PostgreSQL  
- Spring Data JPA para persistência de dados  
- Spring Security com JWT para autenticação/segurança  

## 🚀 Funcionalidades principais  
- Cadastro, leitura, atualização e remoção (CRUD) de recursos (clientes, serviços, prestações, etc) — depende de quais entidades você tiver definido.  
- Persistência dos dados no PostgreSQL.  
- Autenticação de usuários via JWT (JSON Web Token).  
- Regras de autorização para proteger endpoints sensíveis.  

## 🧱 Tecnologias utilizadas  
- Java  
- Spring Boot  
- Maven  
- PostgreSQL  
- Spring Data JPA  
- Spring Security (com JWT)  
- (Possivelmente) ModelMapper ou DTOs — adapte conforme seu código  
- (Possivelmente) Swagger/OpenAPI — adapte se estiver incluso  

## 📦 Requisitos para rodar localmente  
Antes de rodar o projeto, verifique:  
- Ter o Java (versão compatível) instalado.  
- Ter o Maven instalado ou usar o wrapper incluído (`mvnw` / `mvnw.cmd`).  
- Ter o PostgreSQL instalado e configurado.  
- Criar um banco de dados no PostgreSQL para este projeto.  
- Configurar as credenciais de acesso ao banco no `application.properties` ou `application.yml`.  
  Exemplo (arquivo `src/main/resources/application.properties`):  
  ```properties
  spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
  spring.datasource.username=usuario
  spring.datasource.password=senha
  spring.jpa.hibernate.ddl-auto=update


## 🧑‍💻 Como executar

Clone o repositório:

```bash
git clone https://github.com/Mizaelaa/agencia-api.git
```

Entre na pasta:

```bash
cd agencia-api
```

Execute o projeto com Maven instalado:

```bash
mvn spring-boot:run
```

### Mizaela e Aline 

🔗 [Mizaela](https://github.com/Mizaelaa)  
🔗 [Aline](https://github.com/23Aline)
