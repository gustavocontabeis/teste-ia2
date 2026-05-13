# SDD - Issue #7

```json
{
  "contexto": {
    "titulo": "[US] Cadastro de Gato",
    "descricao": "Usuário deseja cadastrar um gato informando seus dados básicos para manter o controle e registro dos gatos no sistema."
  },
  "requisitos_funcionais": [
    "Deve existir uma tela de cadastro de gato.",
    "A tela deve conter os campos 'Nome do Gato', 'Data de Nascimento do Gato' e 'Sexo do Gato'.",
    "O botão para salvar o cadastro deve estar presente.",
    "O sistema deve validar o preenchimento dos campos obrigatórios ao salvar."
  ],
  "requisitos_nao_funcionais": [
    "Implementar a tela utilizando JInternalFrame.",
    "Utilizar JTextField para o nome e JComboBox para o sexo.",
    "Utilizar um componente apropriado para data."
  ],
  "regras_negocio": [
    "O nome do gato deve ser um campo obrigatório.",
    "A data de nascimento deve ser um campo obrigatório.",
    "O sexo do gato deve ser um campo obrigatório com opções 'Macho' e 'Fêmea'."
  ],
  "casos_uso": [
    {
      "titulo": "Cadastrar Gato",
      "atores": [
        "Usuário"
      ],
      "descricao": "Usuário preenche os dados do gato e solicita o cadastro."
    }
  ],
  "criterios_aceite": [
    "Tela de cadastro de gato deve estar disponível.",
    "Todos os campos obrigatórios devem ser validados.",
    "Mensagem de sucesso deve ser exibida em caso de cadastro bem-sucedido.",
    "Mensagem de erro deve ser exibida informando campos inválidos."
  ]
}
```