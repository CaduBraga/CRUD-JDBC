# 🎓 CRUD-JDBC - Sistema de Gerenciamento com Java

## 📚 Sobre o Projeto

Este projeto foi desenvolvido com fins de aprendizagem para o **Curso de Desenvolvimento de Sistemas da Turma MIDS 77**, na matéria de **Programação Back-end**. 

### 👨‍🏫 Professor Responsável
**Vinícius Trindade** - [Repositório de Referência](https://github.com/viiniciustrindade/java-jdbc.git)

### 🎯 Objetivos do Projeto
- Implementar operações **CRUD** (Create, Read, Update, Delete) utilizando **JDBC** (Java Database Connectivity)
- Aplicar o padrão de arquitetura **MVC** (Model-View-Controller) como adicional ao projeto base
- Praticar conexão com banco de dados **MySQL** através de Java
- Desenvolver habilidades em programação orientada a objetos e manipulação de dados

## 🏗️ Arquitetura do Projeto

### Padrão MVC Implementado
- **Model**: Classes DAO (Data Access Object) para acesso aos dados
- **View**: Interface de usuário via console (`MainView.java`)
- **Controller/Service**: Classes de serviço que coordenam as operações (`Gerenciamento.java`, `Create.java`, `Read.java`, `Update.java`, `Delete.java`)

### Estrutura de Pacotes
```
src/main/java/org/example/
├── config/
│   └── Conexao.java          # Configuração de conexão com banco
├── main/
│   └── Main.java             # Ponto de entrada da aplicação
├── service/
│   ├── Gerenciamento.java    # Controlador principal
│   ├── Create.java           # Operações de criação
│   ├── Read.java             # Operações de leitura
│   ├── Update.java           # Operações de atualização
│   ├── Delete.java           # Operações de exclusão
│   └── dao/                  # Data Access Objects
│       ├── AlunoDAO.java
│       ├── FuncionariosDAO.java
│       ├── LivrosDAO.java
│       ├── PedidosDAO.java
│       ├── ProdutosDAO.java
│       └── UsuarioDAO.java
└── view/
    └── MainView.java         # Interface do usuário
```

## 🗄️ Banco de Dados

### Configuração
- **SGBD**: MySQL
- **Banco**: MYSQLTESTE
- **Conector**: MySQL Connector/J 8.0.33

### Tabelas Implementadas
1. **usuarios** - Gerenciamento de usuários
2. **alunos** - Cadastro de estudantes
3. **produtos** - Controle de produtos
4. **pedidos** - Gestão de pedidos
5. **livros** - Biblioteca de livros
6. **funcionarios** - Cadastro de funcionários

## 🚀 Como Executar

### Pré-requisitos
- Java 22 ou superior
- Maven 3.6+
- MySQL Server
- MySQL Connector/J

### Configuração do Banco
1. Execute o script SQL em `resources/db/database.sql`
2. Configure as credenciais em `src/main/java/org/example/config/Conexao.java`

### Executando o Projeto
```bash
# Clone o repositório
git clone [URL_DO_REPOSITORIO]

# Navegue até o diretório
cd CRUD-JDBC

# Compile o projeto
mvn compile

# Execute a aplicação
mvn exec:java -Dexec.mainClass="org.example.main.Main"
```

## 💻 Funcionalidades

### Menu Principal
O sistema apresenta um menu interativo com as seguintes opções:

1. **Seleção de Tabela**
   - Alunos
   - Funcionários
   - Livros
   - Pedidos
   - Produtos
   - Usuários

2. **Operações CRUD**
   - **Create**: Inserir novos registros
   - **Read**: Consultar registros existentes
   - **Update**: Atualizar dados
   - **Delete**: Remover registros

## 🛠️ Tecnologias Utilizadas

- **Java 22** - Linguagem de programação
- **Maven** - Gerenciamento de dependências
- **MySQL** - Banco de dados
- **JDBC** - API para conexão com banco de dados
- **PreparedStatement** - Prevenção de SQL Injection

## 📋 Características Técnicas

### Segurança
- Uso de `PreparedStatement` para prevenir SQL Injection
- Validação de entrada de dados
- Tratamento de exceções

### Boas Práticas
- Separação de responsabilidades (MVC)
- Código modular e reutilizável
- Documentação clara
- Tratamento adequado de recursos (try-with-resources)

## 🎓 Aprendizados

Este projeto proporcionou o desenvolvimento das seguintes competências:

- **JDBC**: Conexão e manipulação de banco de dados
- **CRUD**: Operações básicas de persistência
- **MVC**: Arquitetura de software
- **MySQL**: Linguagem SQL e gerenciamento de dados
- **Java**: Programação orientada a objetos
- **Maven**: Gerenciamento de dependências

## 📝 Licença

Este projeto é destinado exclusivamente para fins educacionais.

---

**Desenvolvido por** Carlos Eduardo Braga  
**Turma MIDS 77** - Curso de Desenvolvimento de Sistemas  
**Professor**: Vinícius Trindade

## 📋 Documentação do Projeto

Para mais informações sobre este projeto, consulte:

- **[CHANGELOG.md](CHANGELOG.md)** - Histórico de mudanças e versões
- **[LICENSE](LICENSE)** - Licença educacional do projeto
- **[CONTRIBUTING.md](CONTRIBUTING.md)** - Guia para contribuições
- **[CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md)** - Código de conduta da comunidade

---

*Última atualização: Agosto 2025*