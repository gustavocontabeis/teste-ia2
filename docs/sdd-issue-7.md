# SDD - Issue #7

```json
{
  "contexto": {
    "titulo": "[US] Cadastro de Gato",
    "descricao": "Cadastro de um gato informando dados básicos para controle no sistema."
  },
  "requisitos_funcionais": {
    "tela_cadastro": {
      "campos": [
        {
          "nome": "Nome do Gato",
          "tipo": "texto",
          "obrigatorio": true
        },
        {
          "nome": "Data de Nascimento do Gato",
          "tipo": "data",
          "obrigatorio": true
        },
        {
          "nome": "Sexo do Gato",
          "tipo": "JComboBox",
          "opcoes": [
            "Macho",
            "Fêmea"
          ],
          "obrigatorio": true
        }
      ],
      "botao_salvar": true
    }
  },
  "requisitos_nao_funcionais": {
    "tecnologia": [
      "JInternalFrame",
      "JTextField",
      "JFormattedTextField",
      "JComboBox"
    ],
    "organizacao": "Separar UI, modelo e lógica"
  },
  "regras_negocio": [
    "Todos os campos obrigatórios devem ser preenchidos para o cadastro ser aceito.",
    "Em caso de sucesso no cadastro, o sistema deve exibir uma mensagem de confirmação.",
    "Em caso de erro, o sistema deve informar quais campos estão inválidos."
  ],
  "casos_uso": [
    {
      "nome": "Cadastrar Gato",
      "atores": [
        "Usuário"
      ],
      "fluxo_principal": [
        "Usuário acessa a tela de cadastro de gato.",
        "Usuário preenche todos os campos obrigatórios.",
        "Usuário clica no botão de salvar.",
        "Sistema valida os campos.",
        "Se todos os campos estiverem corretos, sistema salva e exibe mensagem de confirmação.",
        "Se houver campos inválidos, sistema exibe mensagem de erro."
      ]
    }
  ],
  "criterios_aceite": [
    "Deve existir uma tela de cadastro de gato.",
    "A tela deve conter campos obrigatórios conforme especificado.",
    "Deve existir um botão para salvar o cadastro.",
    "O sistema deve validar o preenchimento dos campos obrigatórios ao salvar.",
    "Exibição de mensagem de confirmação em caso de sucesso.",
    "Exibição de mensagem de erro em caso de campos inválidos."
  ]
}
```