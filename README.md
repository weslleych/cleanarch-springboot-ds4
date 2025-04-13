# Clean Architecture Spring Boot - Quotes API

## 📋 Descrição
API de citações aleatórias implementando Clean Architecture com:
- Spring Boot 3.4.4
- Banco H2 em memória
- Java 21
- Separação em 4 camadas (Domínio, Aplicação, Infraestrutura, Apresentação)

## 🚀 Como Executar

### Pré-requisitos
- JDK 21 instalado
- Maven 3.8+
- IDE (opcional)

### ⚙️ Configuração

1. **Clone o projeto**:
```bash
git clone https://github.com/weslleych/cleanarch-springboot-ds4.git
cd cleanarch-springboot-ds4
```
2. **Instale as dependências**
```bash
mvn clean install
```
3. **Inicie a aplicação**
```bash
mvn spring-boot:run
```

## 🌐 Acesso
- API: http://localhost:8080
- H2 Console: http://localhost:8080/h2-console
  - JDBC URL: jdbc:h2:mem:quotesdb
  - User: sa
  - Senha: (vazia)

## 🔍 Endpoints

### GET `/quotes/random`
Retorna uma citação aleatória

Exemplo de resposta
```json
{
  "id":3,
  "text":"A vida é o que acontece enquanto você está ocupado fazendo outros planos.",
  "author":"John Lennon",
  "size":63
}
```

## 💡 Dicas

### 1. Para acessar o banco de dados durante a execução:
Acesse o H2 console.<br>
Utilize as credenciais citadas anteriormente.

### 2. Os dados iniciais estão em:
`src/main/resources/data.sql`