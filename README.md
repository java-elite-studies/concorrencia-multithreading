# Concorrencia e Multithreading

Projeto Java para estudos de concorrencia e multithreading.

## Requisitos

- Java 24
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

### Executando os exemplos

Cada classe possui um metodo `main` independente. Para executar:

- Abra o arquivo `.java` desejado
- Clique no botao **Run** que aparece acima do metodo `main`
- Ou use `F5` para executar com debug

Via terminal:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.eldermoraes.aula02.Ex1CpuBoundTasksExample"
```
