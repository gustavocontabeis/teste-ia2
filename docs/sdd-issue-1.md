# SDD - Issue #1

```json
{
  "contexto": {
    "titulo": "[US] Calculadora simples em Java Swing",
    "descricao": "Uma calculadora simples com interface gráfica para realizar operações matemáticas básicas."
  },
  "requisitos_funcionais": [
    "Permitir somar, subtrair, multiplicar e dividir.",
    "Possuir botões numéricos de 0 a 9.",
    "Exibir o resultado em um campo de texto.",
    "Tratar divisão por zero com mensagem de erro."
  ],
  "requisitos_nao_funcionais": [],
  "regras_negocio": [
    {
      "id": 1,
      "descricao": "O usuário deve sempre receber um resultado válido, exceto em caso de divisão por zero."
    },
    {
      "id": 2,
      "descricao": "A interface deve ser intuitiva e fácil de usar."
    }
  ],
  "casos_uso": [
    {
      "id": 1,
      "titulo": "Realizar operação matemática",
      "atores": [
        "Usuário"
      ],
      "descricao": "O usuário seleciona números e uma operação, e recebe o resultado."
    },
    {
      "id": 2,
      "titulo": "Tratar erro de divisão por zero",
      "atores": [
        "Usuário"
      ],
      "descricao": "Quando o usuário tenta dividir um número por zero, uma mensagem de erro é exibida."
    }
  ],
  "criterios_aceite": [
    "A calculadora deve permitir somar, subtrair, multiplicar e dividir.",
    "Devem existir botões para cada número de 0 a 9.",
    "O resultado deve ser mostrado em um campo de texto.",
    "Uma mensagem de erro deve aparecer quando o usuário tentar dividir por zero."
  ]
}
```