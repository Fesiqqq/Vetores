# Algoritmos I - Lista de Exercícios #9 (Vetores em Java)

Este repositório contém as soluções para a nona lista de exercícios da disciplina de **Algoritmos I**. O foco principal desta lista é o domínio de estruturas de dados lineares simples: os **Vetores (Arrays)** na linguagem Java.

## 🚀 Objetivos de Aprendizado

Nesta etapa, os exercícios foram desenvolvidos para praticar:
* **Declaração e Inicialização**: Criação de arrays com tamanhos fixos e dinâmicos.
* **Acesso por Índice**: Manipulação direta de elementos em posições específicas.
* **Percurso com Laços**: Uso de estruturas `for` e `while` para iterar sobre vetores.
* **Lógica de Acúmulo e Contagem**: Uso de variáveis para somar valores ou contar ocorrências dentro de um array.
* **Controle de Fluxo**: Aplicação de `break` e `continue` em contextos de leitura de dados.

---

## 📋 Exercícios Resolvidos

### 1. Sistema de Notas (Turma)
**Contexto:** Registro de notas e cálculo de média escolar.
* **Funcionalidade:** O programa lê a quantidade de alunos, armazena suas notas em um vetor e calcula a média aritmética da sala.
* **Exemplo:** Entrada `[8, 6, 10]` → Saída `Média: 8.0`.

### 2. Controle de Estoque
**Contexto:** Identificação de produtos com baixo giro ou falta de mercadoria.
* **Funcionalidade:** Armazena as quantidades em estoque e percorre o vetor para contar quantos itens possuem menos de 5 unidades.
* **Conceito:** Filtro e contagem condicional em arrays.

### 3. Placar da Competição
**Contexto:** Análise de resultados esportivos.
* **Funcionalidade:** Lê os placares de diversos participantes e identifica, em uma única passagem pelo vetor, qual foi o maior e o menor valor registrado.
* **Conceito:** Algoritmos de busca de máximo e mínimo.

### 4. Sistema de Votação
**Contexto:** Eleição simplificada entre três candidatos.
* **Funcionalidade:** Utiliza um vetor de tamanho fixo (3 posições) como contadores (acumuladores). Cada voto para um candidato incrementa o índice correspondente no vetor.
* **Destaque:** Determinação do vencedor com base na maior frequência de votos.

### 5. Monitoramento de Sensor
**Contexto:** Leitura de temperaturas com tratamento de dados.
* **Funcionalidade:** O programa lê temperaturas, ignorando valores inválidos (fora do intervalo de -50 a 50) e permitindo a interrupção precoce (comando 999). Ao final, calcula a média e identifica quantos registros estão acima dela.
* **Destaque:** Uso de `break`, `continue` e validação de consistência de dados.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **Entrada de Dados:** `java.util.Scanner`
* **Estrutura de Dados:** Vetores (Arrays unidimensionais)

---

## 📝 Como Executar

1. Certifique-se de ter o **JDK (Java Development Kit)** instalado.
2. Clone o repositório ou copie o código fonte.
3. Compile o arquivo:
   ```bash
   javac NomeDoArquivo.java
