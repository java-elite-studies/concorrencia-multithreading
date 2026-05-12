# Concorrencia e Multithreading

Projeto Java para estudos de concorrência e multithreading.

A estrutura foi preparada com base no formato de execução do projeto `Concorrencia-Multithreading/aulas` do repositório público `eldermoraes/unipds`, sem copiar o código de aulas.

## Requisitos

- Java 17+ (local) ou Java 24 no Dev Container
- Maven 3.9+

## Dev Container (VS Code)

Este projeto inclui um [Dev Container](https://containers.dev/) pronto para uso no Visual Studio Code.

### Como usar

1. Instale a extensão [Dev Containers](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers) no VS Code
2. Abra este repositório no VS Code
3. Quando solicitado, clique em **"Reopen in Container"** (ou use `Ctrl+Shift+P` > `Dev Containers: Reopen in Container`)
4. Aguarde o container ser construído e configurado

O ambiente terá automaticamente:
- **Java 24** (Eclipse Temurin)
- **Maven 3.9.9**
- Extensões do VS Code para desenvolvimento Java (Language Support, Debugger, Maven, Test Runner)

## Estrutura do projeto Java

- Projeto Maven em raiz (`pom.xml`)
- Classes Java em `src/main/java`
- Testes em `src/test/java`
- Execução por classes com método `main` (padrão de aulas)

## Executando

Compilar e testar:

```bash
mvn clean test
```

Executar uma classe com `main`:

```bash
mvn exec:java -Dexec.mainClass="com.eldermoraes.aula01.ExemploInicial"
```

No VS Code, abra uma classe com `main` e use o botão **Run** acima do método.
