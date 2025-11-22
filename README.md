# Agência API  
API desenvolvida em **Spring Boot** para gerenciar destinos, pacotes, hotéis e atividades de uma agência de viagens.  
O projeto inclui integração com **PostgreSQL**, **Spring Data JPA** e **Spring Security com autenticação baseada em banco de dados**.


## 📝 Descrição  
Esta API foi construída para permitir a gestão de recursos de uma agência 
Ela fornece endpoints REST protegidos por autenticação via **usuários armazenados no banco**.


### 🔐 Segurança  
- Login com usuário e senha cadastrados no PostgreSQL  
- Controle de acesso com **Spring Security**  
- Diferentes permissões baseadas em perfis (`ROLE_USER`, `ROLE_ADMIN`)  
- Redirecionamento automático para o painel após login  


## 🧱 Tecnologias utilizadas  
- **Java 21**  
- **Spring Boot 3.x**  
- **Maven**  
- **PostgreSQL**  
- **Spring Data JPA**  
- **Spring Security**  
- **BCrypt** para hashing de senha  
- HTML + JavaScript  


## 📦 Requisitos para rodar o projeto  

Antes de executar, tenha:

- Java 21  
- Maven 3.8+  
- PostgreSQL instalado  
- Um banco criado (ex.: `agencia_db`)

### Configure o arquivo `application.properties`:

substitua pelas credenciais da sua máquina:
### Antes de executar o projeto, é necessário configurar o acesso ao banco de dados PostgreSQL.

```properties
spring.application.name=agencia-api

## Configuração do banco PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/agencia_db
spring.datasource.username=SEU_USUARIO_DO_POSTGRES
spring.datasource.password=SUA_SENHA_DO_POSTGRES

## Configurações JPA / Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect


### Como executar

### Clone o repositório:

```bash
git clone https://github.com/Mizaelaa/agencia-api.git
```

## Entre na pasta:

```bash
cd agencia-api
```

## Execute o projeto com Maven instalado:

```bash
mvn spring-boot:run
```

## Acesse no navegador

### Tela de login:
```bash
http://localhost:8080/login
```

### Painel (index.html):
```bash
http://localhost:8080/
```

### API de destinos: 
```bash
http://localhost:8080/destinos
```
<img width="1903" height="558" alt="Captura de tela 2025-11-22 144005" src="https://github.com/user-attachments/assets/8f4f5327-830e-4b70-a7db-402983772b1f" />

<img width="1660" height="755" alt="Captura de tela 2025-11-22 160025" src="https://github.com/user-attachments/assets/e9b79e81-9c94-45b2-9fd4-2bcb74bf0546" />

### Mizaela e Aline 

🔗 [Mizaela](https://github.com/Mizaelaa)  
🔗 [Aline](https://github.com/23Aline)
