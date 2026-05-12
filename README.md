# Concorrencia e Multithreading

Projeto Java para estudos de concorrencia e multithreading.

A estrutura foi preparada com base no formato de execucao do projeto `Concorrencia-Multithreading/aulas` do repositorio publico `eldermoraes/unipds`, sem copiar o codigo de aulas.

## Requisitos

- Java 17+ (local) ou Java 24 no Dev Container
- Maven 3.9+

## Dev Container (VS Code)

Este projeto inclui um [Dev Container](https://containers.dev/) pronto para uso no Visual Studio Code.

### Como usar

1. Instale a extensao [Dev Containers](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers) no VS Code
2. Abra este repositorio no VS Code
3. Quando solicitado, clique em **"Reopen in Container"** (ou use `Ctrl+Shift+P` > `Dev Containers: Reopen in Container`)
4. Aguarde o container ser construido e configurado

O ambiente tera automaticamente:
- **Java 24** (Eclipse Temurin)
- **Maven 3.9.9**
- Extensoes do VS Code para desenvolvimento Java (Language Support, Debugger, Maven, Test Runner)

## Estrutura do projeto Java

- Projeto Maven em raiz (`pom.xml`)
- Classes Java em `src/main/java`
- Testes em `src/test/java`
- Execucao por classes com metodo `main` (padrao de aulas)

## Executando

Compilar e testar:

```bash
mvn clean test
```

Executar uma classe com `main`:

```bash
mvn exec:java -Dexec.mainClass="com.eldermoraes.aula01.ExemploInicial"
```

No VS Code, abra uma classe com `main` e use o botao **Run** acima do metodo.
