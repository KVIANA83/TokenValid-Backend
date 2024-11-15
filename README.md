# Projeto de Validação de Token - `tokenValid`

Este projeto foi desenvolvido em **Java** utilizando o framework **Spring Boot** para criar uma API REST que autentica usuários e valida tokens JWT. O sistema implementa boas práticas de segurança, tratamento de exceções e organização modularizada do código.

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.3.5**
  - `spring-boot-starter-data-jpa` (para persistência com JPA)
  - `spring-boot-starter-security` (para segurança e autenticação)
  - `spring-boot-starter-web` (para construção de APIs REST)
  - `spring-boot-starter-validation` (para validação de dados)
  - `spring-boot-starter-oauth2-client` (para autenticação baseada em OAuth2)
  - `spring-boot-starter-oauth2-resource-server` (para validação de recursos protegidos via OAuth2)
  - `spring-boot-starter-test` (para testes unitários)
- **JWT (JSON Web Token)** com a biblioteca `jjwt` (para gerar e validar tokens JWT)
- **H2 Database** (banco de dados em memória para desenvolvimento/testes)
- **Lombok** (para simplificação do código)

---

## ⚙️ Funcionalidades

1. **Autenticação de Usuários**  
   - Endpoint de login para geração de tokens JWT.
   - Validação de credenciais com resposta apropriada (sucesso ou erro).

2. **Validação de Token**  
   - Implementação de middleware para verificar a autenticidade e validade do token JWT em endpoints protegidos.

3. **Gestão de Usuários**  
   - Cadastro, consulta e manipulação de usuários na base de dados.

4. **Tratamento de Exceções**  
   - Tratamento centralizado de erros usando um `GlobalExceptionHandler`.
   - Respostas consistentes para erros de autenticação, validação e recursos não encontrados.

5. **Banco de Dados H2**  
   - Configuração simples para armazenamento em memória de usuários e credenciais.

---

## 🛠️ Como Executar o Projeto

1. **Clone o Repositório**
   ```bash
   git clone https://github.com/seu-usuario/tokenValid.git
   cd tokenValid
   ```

2. **Configure o Ambiente**
   - Certifique-se de ter o **Java 17** e o **Maven** instalados em sua máquina.

3. **Instale as Dependências**
   ```bash
   mvn clean install
   ```

4. **Execute a Aplicação**
   ```bash
   mvn spring-boot:run
   ```

5. **Acesse a API**
   - A aplicação estará disponível em: `http://localhost:8080`

---

## 🔗 Endpoints da API

### **Autenticação**

- **POST** `/login`  
  Envia credenciais para gerar um token JWT.  
  **Exemplo de Requisição:**
  ```json
  {
    "login": "usuario@example.com",
    "password": "senha123"
  }
  ```
  **Resposta de Sucesso:**
  ```json
  {
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
  }
  ```
  **Resposta de Erro:**
  ```json
  {
    "status": 401,
    "message": "Credenciais inválidas"
  }
  ```

### **Usuários**
- Endpoints relacionados a criação, busca e atualização de usuários serão adicionados em breve.

---

## 🗂️ Estrutura do Projeto

```plaintext
src/main/java/com/project/tokenValid
├── controller          # Controladores REST
├── dto                 # Objetos de transferência de dados (DTOs)
├── exceptions          # Classes para tratamento de exceções
├── model               # Classes de modelo (entidades JPA)
├── repositories        # Repositórios JPA
├── service             # Lógica de negócio
└── TokenValidApplication.java   # Classe principal da aplicação
```

---

## 🧪 Testes

- Testes automatizados foram desenvolvidos para o controlador de login utilizando **MockMvc**.
- Para executar os testes:
  ```bash
  mvn test
  ```

---

## 🔒 Segurança

- Implementação de autenticação baseada em tokens JWT.
- As senhas dos usuários devem ser armazenadas com criptografia **BCrypt**.
- Endpoint de login protegido contra ataques de força bruta com limitação de tentativas (não implementado, mas pode ser adicionado com Redis).

---

## ✍️ Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir **Issues** e **Pull Requests** para melhorias ou novas funcionalidades.


