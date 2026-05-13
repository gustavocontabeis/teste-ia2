# SDD - Issue #3

```json
{
  "contexto": {
    "titulo": "[US] Cadastro de Cachorro",
    "descricao": "Cadastrar um cachorro informando nome, data de nascimento e tipo de raça para manter um registro organizado."
  },
  "requisitos_funcionais": [
    "O sistema deve exibir um `JInternalFrame` com campos para nome, data de nascimento e tipo de raça.",
    "O sistema deve permitir o cadastro de um cachorro validando os dados inseridos.",
    "O sistema deve exibir mensagens de erro apropriadas quando as validações falharem.",
    "O sistema deve permitir o cancelamento do cadastro, fechando o `JInternalFrame` sem salvar dados."
  ],
  "requisitos_nao_funcionais": [
    "A tela deve ser implementada utilizando `JInternalFrame`.",
    "Deve seguir o padrão MVC e desacoplar a validação da UI."
  ],
  "regras_negocio": [
    {
      "regra": "Nome do cachorro deve ter no mínimo 2 caracteres."
    },
    {
      "regra": "Data de nascimento não pode ser futura."
    },
    {
      "regra": "Tipo de raça pode ser um campo texto livre ou um combo pré-definido."
    }
  ],
  "casos_uso": [
    {
      "titulo": "Exibição da tela",
      "descricao": "O usuário acessa a funcionalidade de cadastro e vê o formulário adequado."
    },
    {
      "titulo": "Cadastro válido",
      "descricao": "O usuário preenche todos os campos corretamente e o sistema valida e persiste os dados."
    },
    {
      "titulo": "Nome obrigatório",
      "descricao": "O sistema impede o cadastro se o nome do cachorro estiver vazio."
    },
    {
      "titulo": "Data inválida",
      "descricao": "O sistema impede o cadastro se a data de nascimento for inválida ou futura."
    },
    {
      "titulo": "Tipo de raça obrigatório",
      "descricao": "O sistema impede o cadastro se o tipo de raça não for informado."
    },
    {
      "titulo": "Cancelamento",
      "descricao": "O usuário pode cancelar o cadastro e fechar o formulário sem salvar."
    }
  ],
  "criterios_aceite": [
    {
      "cenário": "Exibição da tela",
      "condição": "O `JInternalFrame` deve conter os campos e botões especificados."
    },
    {
      "cenário": "Cadastro válido",
      "condição": "Dados válidos devem ser salvos com sucesso e o usuário deve ver uma mensagem de sucesso."
    },
    {
      "cenário": "Nome obrigatório",
      "condição": "Exibir mensagem 'Nome do cachorro é obrigatório' se o campo estiver vazio."
    },
    {
      "cenário": "Data inválida",
      "condição": "Exibir mensagem 'Data de nascimento inválida' se a data for inválida ou futura."
    },
    {
      "cenário": "Tipo de raça obrigatório",
      "condição": "Exibir mensagem 'Tipo de raça é obrigatório' se o campo não for preenchido."
    },
    {
      "cenário": "Cancelamento",
      "condição": "Fechar o `JInternalFrame` sem salvar as informações se o usuário clicar em 'Cancelar'."
    }
  ]
}
```