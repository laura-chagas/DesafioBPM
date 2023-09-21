# _DESAFIO BPM2 - 21/09/23_ :pencil:

<hr>

## Os códigos foram desenvolvido por: [Laura Chagas](https://github.com/laura-chagas) :raising_hand_woman: :heart:

<hr>

## Exercicios: :computer:

### [Desafio 1: Ordenando Números Pares e Ímpares](https://github.com/laura-chagas/DesafioBPM/tree/DESAFIOBPM2/src/main/java/org/example/desafioUm) :heavy_division_sign: :smile:

<p> Crie um programa onde você receberá valores inteiros não negativos como
entrada. </p>

- Ordene estes valores de acordo com o seguinte critério:

    1. Primeiro os Pares
    2. Depois os Ímpares
    3. Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

- Entrada

    1. A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000). Este é o número de linhas de
       entrada que vem logo a seguir.
    2. As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.

- Saída

    1. Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
    2. Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.

<hr>

### [Desafio 2: Conversão de Tempo](https://github.com/laura-chagas/DesafioBPM/tree/DESAFIOBPM2/src/main/java/org/example/desafioDois) :timer_clock: :calendar:

 <p> Você terá o desafio de ler um valor inteiro, faça a conversão desse valor para date e informe-o expresso no formato dia/mês/ano horas:minutos:segundos.</p> 

- Entrada

    1. O arquivo de entrada contém um valor inteiro N.

- Saída

    1. Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo
       fornecido.

- Obs

1. Utilize UTC (GMT-0)

- Exemplo:

    1. Entrada: 1693225566
    2. Saída: 28/Aug/2023 12:26:06

<hr>

### [Desafio 3: Sequência de Fibonacci (Recursividade)](https://github.com/laura-chagas/DesafioBPM/tree/DESAFIOBPM2/src/main/java/org/example/desafioTres) :thinking: :abacus:

<p>A Sequência de Fibonacci tem como primeiros termos os números 0 e 1 e, a seguir, cada termo subsequente é obtido pela soma dos dois termos predecessores: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...</p>

- Fibonacci(0) = 0
- Fibonacci(1) = 1
- Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)


- Entrada

    1. O arquivo de entrada contém um valor inteiro N.

- Saída

1. Imprima o valor relativo ao N número da sequência de Fibonacci, exemplo:

    - N = 0 => saída "Fib = 0"
    - N = 1 => saída "Fib = 1"
    - N = 3 => saída "Fib = 2"
    - N = 29 => saída "Fib = 514229"