# Contador de Números

## Descrição
Este projeto Java implementa um contador de números baseado em dois parâmetros fornecidos pelo usuário. Ele demonstra o uso de exceções personalizadas (ParametrosInvalidosException) para lidar com condições específicas de entrada inválida.

## Como Executar
1. Certifique-se de ter o Java Runtime Environment (JRE) instalado.

2. Navegue até a pasta onde o arquivo compilado Contador.class está localizado (pasta bin).

3. Execute o programa com o comando:

      ````sh
      java Contador

## Funcionalidades
1.Solicitação e leitura do primeiro parâmetro.

2.Solicitação e leitura do segundo parâmetro.

## Validação dos parâmetros:
1.Verifica se o primeiro parâmetro é maior que o segundo.

2.Lança uma exceção ParametrosInvalidosException caso a validação falhe.

3.Contagem e exibição dos números entre os parâmetros fornecidos.

4.Tratamento de exceções para garantir feedback adequado ao usuário.

5.Fechamento seguro do recurso Scanner no final da execução.

## Exemplo de Uso
Ao executar o programa, você verá as seguintes instruções no terminal:


    Digite o primeiro parâmetro:
    [Digite o primeiro número]

Posteriormente: 
    
    Digite o segundo parâmetro:
    [Digite o segundo número]

## Após fornecer os dados válidos, o programa exibirá a contagem após verificação da diferença do valor dois para o valor um :
Exemplo: Valor 10 e 20, a diferença é 10, então resultaria em:

    Imprimindo o número 1
    Imprimindo o número 2
    Imprimindo o número 3
    ... Até o valor 10.

Este programa oferece uma maneira simples de contar e exibir números sequenciais a partir de dois parâmetros fornecidos pelo usuário, mostrando como lidar com exceções e garantir a liberação adequada de recursos.
