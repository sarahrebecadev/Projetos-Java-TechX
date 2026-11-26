# Sprint 3 - Sistema de Controle de Elevador

Projeto desenvolvido em Java para a Trilha Backend - Sprint 3.

## Objetivo

Criar um sistema de controle de elevador aplicando conceitos de Programação Orientada a Objetos (POO).

O elevador possui:

- Andar atual;
- Peso máximo suportado;
- Peso atual.

O sistema verifica o peso antes de permitir que o elevador suba.

## Conceitos utilizados

- Programação Orientada a Objetos;
- Classes e objetos;
- Encapsulamento;
- Atributos privados;
- Métodos;
- Construtor;
- Estruturas condicionais.

## Cenários demonstrados

### 1. Subida bem-sucedida

Quando o peso atual está dentro do limite, o elevador sobe um andar.

### 2. Excesso de peso

Quando o peso atual ultrapassa o peso máximo, o elevador não sobe e exibe uma mensagem no console.

## Como executar

1. Abra o projeto em uma IDE Java, como IntelliJ IDEA, Eclipse ou VS Code.
2. Execute o arquivo `Main.java`.
3. Verifique o resultado no console.

## Resultado esperado

```text
=== CONTROLE DO ELEVADOR ===

--- Subida normal ---
Elevador subiu e parou no andar 1.

--- Excesso de peso ---
Excesso de peso! O elevador não vai sair do andar 1.