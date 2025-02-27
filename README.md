# Biblioteca em Java

Este é um projeto simples de um sistema de gerenciamento de biblioteca em Java proposto pelo Professor Salatiel Marinho da FIAP. O sistema permite adicionar e remover livros, registrar e remover membros, emprestar e devolver livros, além de salvar e carregar os dados em arquivos.

## 🚀 Funcionalidades

- 📚 **Gerenciamento de Livros**
  - Adicionar livros
  - Remover livros
  
- 👤 **Gerenciamento de Membros**
  - Registrar membros
  - Listar membros
  
- 🔄 **Empréstimo e Devolução de Livros**
  - Registrar um empréstimo
  - Devolver um livro
  
- 💾 **Persistência de Dados**
  - Salvar os dados em um arquivo
  - Carregar os dados do arquivo

## 🛠️ Tecnologias Utilizadas

- Java SE 11+
- Programação Orientada a Objetos (POO)
- Manipulação de arquivos
- Serialização de objetos

## 📂 Estrutura do Projeto

```
📦 biblioteca-java
 ┣ 📜 Biblioteca.java      # Classe principal de gerenciamento da biblioteca
 ┣ 📜 Livro.java           # Classe que representa um livro
 ┣ 📜 Membro.java          # Classe que representa um membro
 ┣ 📜 Emprestimo.java      # Classe que representa um empréstimo
 ┣ 📜 SistemaBiblioteca.java            # Classe com o método principal (main)
 ┗ 📜 README.md           # Documentação do projeto
```

## 📌 Como Usar

### 🔹 1. Clonar o Repositório
```bash
git clone https://github.com/seu-usuario/biblioteca-java.git
cd biblioteca-java
```

### 🔹 2. Compilar o Código
```bash
javac *.java
```

### 🔹 3. Executar o Programa
```bash
java Main
```

## 📝 Exemplos de Uso

### 🔹 Criando uma Biblioteca e Adicionando Livros e Membros
```java
Biblioteca biblioteca = new Biblioteca();
biblioteca.adicionarLivro(new Livro("Java para Iniciantes", "Autor A", "12345"));
biblioteca.registrarMembro(new Membro("João Silva", 1, "joao@email.com"));
```

### 🔹 Registrando um Empréstimo
```java
biblioteca.registrarEmprestimo(livro, membro);
```

### 🔹 Devolvendo um Livro
```java
biblioteca.devolverLivro(livro, membro);
```

## 🔄 Salvando e Carregando Dados

### 🔹 Salvando os Dados em Arquivo
```java
biblioteca.salvarDadosEmArquivo("biblioteca.dat");
```

### 🔹 Carregando os Dados do Arquivo
```java
biblioteca.carregarDadosDeArquivo("biblioteca.dat");
```

## 🤝 Contribuição

1. Faça um **fork** do projeto
2. Crie uma **branch** para sua feature (`git checkout -b minha-feature`)
3. **Commit** suas alterações (`git commit -m 'Adiciona nova feature'`)
4. Faça um **push** para a branch (`git push origin minha-feature`)
5. Abra um **Pull Request**

## 📜 Licença

Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Feito por [Jean Matheus](https://github.com/JeannMatheuss) 🚀

