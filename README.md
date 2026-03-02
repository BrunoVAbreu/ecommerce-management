[LICENSE__BADGE]: https://img.shields.io/github/license/Fernanda-Kipper/Readme-Templates?style=for-the-badge
[JAVA_BADGE]:https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[SPRING_BADGE]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white
[PRS_BADGE]:https://img.shields.io/badge/PRs-welcome-green?style=for-the-badge

<h1 align="center" style="font-weight: bold;">Ecommerce Management 🛒</h1>

![license][LICENSE__BADGE]
![java][JAVA_BADGE]
![spring][SPRING_BADGE]
![prs][PRS_BADGE]

<details open="open">
<summary>Índice</summary>

- [🚀 Como executar](#started)
  - [Pré-requisitos](#prerequisites)
  - [Clonando](#cloning)
  - [Iniciando](#starting)
- [📍 Endpoints da API](#routes)
  - [Usuários](#users)
  - [Produtos](#products)
  - [Pedidos](#orders)
  - [Categorias](#categories)


</details>

<p align="center">
  <b>Uma API RESTful para gerenciamento de ecommerce desenvolvida com Spring Boot. Gerencia usuários, produtos, pedidos e categorias utilizando JPA/Hibernate com banco de dados H2 em memória para testes.</b>
</p>

<h2 id="started">🚀 Como executar</h2>

<h3 id="prerequisites">Pré-requisitos</h3>

- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)

<h3 id="cloning">Clonando</h3>

```bash
git clone https://github.com/BrunoVAbreu/ecommerce-management.git
```

<h3 id="starting">Iniciando</h3>

```bash
cd ecommerce-management
./mvnw spring-boot:run
```

A aplicação será iniciada em `http://localhost:8080`.

> O console do H2 está disponível em `http://localhost:8080/h2-console`
> - JDBC URL: `jdbc:h2:mem:testdb`
> - Usuário: `sa`
> - Senha: *(deixe em branco)*

<h2 id="routes">📍 Endpoints da API</h2>

### Usuários

| Rota | Descrição |
|------|-----------|
| `GET /users` | Lista todos os usuários |
| `GET /users/{id}` | Busca usuário por ID |
| `POST /users` | Cria um novo usuário |
| `PUT /users/{id}` | Atualiza um usuário |
| `DELETE /users/{id}` | Remove um usuário |

**POST /users — Requisição**
```json
{
  "name": "João Silva",
  "email": "joao@email.com",
  "phone": "11999999999",
  "password": "123456"
}
```

**GET /users/{id} — Resposta**
```json
{
  "id": 1,
  "name": "João Silva",
  "email": "joao@email.com",
  "phone": "11999999999"
}
```

---

### Produtos

| Rota | Descrição |
|------|-----------|
| `GET /products` | Lista todos os produtos |
| `GET /products/{id}` | Busca produto por ID |

**GET /products/{id} — Resposta**
```json
{
  "id": 1,
  "name": "Nome do Produto",
  "description": "Descrição do produto",
  "price": 99.90,
}
```

---

### Pedidos

| Rota | Descrição |
|------|-----------|
| `GET /orders` | Lista todos os pedidos |
| `GET /orders/{id}` | Busca pedido por ID |

**GET /orders/{id} — Resposta**
```json
{
  "id": 1,
  "moment": "2024-01-01T10:00:00Z",
  "orderStatus": "PAID",
  "client": { "id": 1, "name": "João Silva" },
  "items": [],
  "payment": { "id": 1, "moment": "2024-01-01T10:05:00Z" },
  "total": 199.80
}
```

---

### Categorias

| Rota | Descrição |
|------|-----------|
| `GET /categories` | Lista todas as categorias |
| `GET /categories/{id}` | Busca categoria por ID |

**GET /categories/{id} — Resposta**
```json
{
  "id": 1,
  "name": "Eletrônicos"
}
```


