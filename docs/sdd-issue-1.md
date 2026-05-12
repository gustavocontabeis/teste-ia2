# SDD - Issue #1

```json
{
  "contexto": {
    "titulo": "[US] Calculadora simples em Java Swing",
    "descricao": "Calculadora com interface gráfica para realizar operações matemáticas simples."
  },
  "requisitos_funcionais": [
    "Permitir somar, subtrair, multiplicar e dividir.",
    "Possuir botões numéricos de 0 a 9.",
    "Exibir o resultado em um campo de texto.",
    "Tratar divisão por zero com uma mensagem de erro."
  ],
  "requisitos_nao_funcionais": [
    "A interface deve ser intuitiva e fácil de usar.",
    "A calculadora deve ser responsiva e funcionar em diferentes tamanhos de tela."
  ],
  "regras_negocio": [
    "A soma, subtração, multiplicação e divisão devem ser calculadas corretamente.",
    "Se o usuário tentar dividir por zero, uma mensagem de erro apropriada deve ser apresentada."
  ],
  "casos_uso": [
    {
      "nome": "Calcular Soma",
      "descricao": "Usuário insere dois números e clica no botão de soma.",
      "fluxo": "1. Usuário insere o primeiro número. 2. Usuário insere o segundo número. 3. Usuário clica em 'Soma'. 4. Resultado é exibido."
    },
    {
      "nome": "Calcular Subtração",
      "descricao": "Usuário insere dois números e clica no botão de subtração.",
      "fluxo": "1. Usuário insere o primeiro número. 2. Usuário insere o segundo número. 3. Usuário clica em 'Subtração'. 4. Resultado é exibido."
    },
    {
      "nome": "Calcular Multiplicação",
      "descricao": "Usuário insere dois números e clica no botão de multiplicação.",
      "fluxo": "1. Usuário insere o primeiro número. 2. Usuário insere o segundo número. 3. Usuário clica em 'Multiplicação'. 4. Resultado é exibido."
    },
    {
      "nome": "Calcular Divisão",
      "descricao": "Usuário insere dois números e clica no botão de divisão.",
      "fluxo": "1. Usuário insere o primeiro número. 2. Usuário insere o segundo número. 3. Usuário clica em 'Divisão'. 4. Resultado é exibido ou mensagem de erro se divisor for zero."
    }
  ],
  "criterios_aceite": [
    "A calculadora deve somar, subtrair, multiplicar e dividir corretamente.",
    "Os botões numéricos devem estar disponíveis e funcionais.",
    "O resultado deve ser visível em um campo de texto dedicado.",
    "Uma mensagem de erro deve ser mostrada ao tentar dividir por zero."
  ]
}
```