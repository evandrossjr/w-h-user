```markdown
# WH Full System - Microservices Architecture

Este projeto reúne três microserviços independentes, desenvolvidos em Java com Spring Boot, que juntos formam um sistema completo para gerenciamento de **usuários**, **produtos/estoque** e **compras/pedidos**.

---

## 📁 Estrutura de Pastas

```bash
wh-full-system/
├── wh-shopping   # Serviço de compras e pedidos
├── wh-user       # Serviço de autenticação e usuários
└── wh-product    # Serviço de produtos e estoque
```

---

## 🔧 Tecnologias Principais

- Java 17+
- Spring Boot
- Spring Data JPA
- Spring Security (JWT)
- REST APIs
- Maven
- Docker (futuramente)
- Banco de dados (H2/PostgreSQL/MySQL)

---

## 🧩 Descrição dos Serviços

### ✅ wh-user (Serviço de Usuários)
Responsável por:
- Cadastro e autenticação de usuários
- Geração de tokens JWT
- Consulta de perfil

### 📦 wh-product (Serviço de Produtos)
Responsável por:
- Cadastro e gerenciamento de produtos
- Controle de estoque
- Listagem de produtos disponíveis

### 🛒 wh-shopping (Serviço de Compras)
Responsável por:
- Criação e gerenciamento de pedidos
- Integração com os serviços de usuário e produto
- Registro de compras realizadas

---

## 🚀 Como Executar Localmente

> É necessário ter **Java 17+** e **Maven** instalados.

### 1. Clone o repositório
```bash
git clone https://github.com/evandrossjr/wh-full-system.git
cd wh-full-system
```

### 2. Compile os serviços individualmente

```bash
cd wh-user
mvn spring-boot:run

# Em novos terminais:
cd ../wh-product
mvn spring-boot:run

cd ../wh-shopping
mvn spring-boot:run
```

> Cada serviço escuta em uma porta diferente. Certifique-se de verificar ou configurar no `application.properties`.

---

## 🧪 Testes

Você pode usar ferramentas como:
- **Postman** para testar endpoints REST.
- **Swagger** (se implementado) acessando `/swagger-ui.html` em cada serviço.

---

## 📌 Melhorias Futuras

- Integração com Docker e Docker Compose
- Gateway com Spring Cloud Gateway
- Service Discovery com Eureka
- Banco de dados real (PostgreSQL)
- Autenticação centralizada
- Documentação via Swagger

---

## 📄 Licença

Este projeto é baseado no Livro Back-End Java, Microserviços, Spring Boot e Kubernetes de Eduardo Felipe Zambom Santana

---

## 🙋‍♂️ Autor

Desenvolvido por **Evandros Jr**  
[GitHub: evandrossjr](https://github.com/evandrossjr)

```
