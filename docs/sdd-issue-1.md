# SDD - Issue #1

```json
{
  "contexto": {
    "titulo": "[US] Calculadora simples em Java Swing",
    "descricao": "Calculadora com interface gráfica para operações matemáticas básicas."
  },
  "requisitos_funcionais": [
    "Permitir somar, subtrair, multiplicar e dividir.",
    "Possuir botões numéricos de 0 a 9.",
    "Exibir o resultado em um campo de texto.",
    "Tratar divisão por zero com mensagem de erro."
  ],
  "requisitos_nao_funcionais": [
    "A interface deve ser responsiva e intuitiva.",
    "O tempo de resposta para operações deve ser inferior a 1 segundo."
  ],
  "regras_negocio": [
    "A calculadora deve validar a entrada antes de realizar operações.",
    "Operações somente devem ser realizadas com números válidos."
  ],
  "casos_uso": [
    {
      "nome": "Uso da Calculadora",
      "atores": [
        "Usuário"
      ],
      "descricao": "O usuário utiliza a calculadora para realizar operações matemáticas.",
      "fluxo_principal": [
        "Usuário clica em um botão numérico.",
        "Usuário seleciona uma operação (soma, subtração, multiplicação, divisão).",
        "Usuário clica em outro botão numérico.",
        "Usuário confirma a operação.",
        "Sistema exibe o resultado."
      ],
      "fluxo_de_excecao": [
        "Usuário tenta dividir por zero.",
        "Sistema exibe mensagem de erro."
      ]
    }
  ],
  "criterios_aceite": [
    "A calculadora deve permitir somar, subtrair, multiplicar e dividir.",
    "Deve possuir botões numéricos (0–9).",
    "Deve exibir o resultado em um campo de texto.",
    "Deve tratar divisão por zero com mensagem de erro."
  ]
}
```