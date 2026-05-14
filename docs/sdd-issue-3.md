# SDD - Issue #3

```json
{
  "contexto": {
    "titulo": "[US] Cadastro de Cachorro",
    "descricao": "Funcionalidade para cadastro de cães com nome, data de nascimento e tipo de raça."
  },
  "requisitos_funcionais": [
    "O sistema deve permitir o cadastro de um cachorro com os campos Nome, Data de Nascimento e Tipo de Raça.",
    "O sistema deve exibir mensagens apropriadas em caso de erro na validação dos dados.",
    "O usuário deve poder cancelar o cadastro, fechando o formulário sem salvar dados."
  ],
  "requisitos_nao_funcionais": [
    "A interface deve utilizar `JInternalFrame` para a tela de cadastro.",
    "O sistema deve seguir o padrão MVC e desacoplar validações da UI."
  ],
  "regras_negocio": [
    {
      "regra": "Nome do cachorro deve ter no mínimo 2 caracteres."
    },
    {
      "regra": "Data de nascimento não pode ser futura."
    },
    {
      "regra": "Tipo de raça pode ser um texto livre ou uma opção de combo pré-definido."
    }
  ],
  "casos_uso": [
    {
      "titulo": "Cadastro de Cachorro",
      "descricao": "Usuário preenche os dados de um cachorro e salva.",
      "atores": [
        "Usuário"
      ],
      "fluxo_principal": [
        "Usuário abre a tela de cadastro.",
        "Usuário preenche os campos obrigatórios.",
        "Usuário clica em 'Salvar'.",
        "Sistema valida e persiste os dados.",
        "Sistema exibe mensagem de sucesso."
      ],
      "fluxo_alternativo": [
        "Usuário tenta salvar sem preencher campo obrigatório.",
        "Sistema exibe mensagem de erro correspondente."
      ]
    },
    {
      "titulo": "Cancelar Cadastro",
      "descricao": "Usuário decide cancelar o cadastro.",
      "atores": [
        "Usuário"
      ],
      "fluxo_principal": [
        "Usuário clica em 'Cancelar'.",
        "Sistema fecha o formulário sem salvar."
      ]
    }
  ],
  "criterios_aceite": [
    {
      "cenario": "Exibição da tela",
      "condicao": "Usuário acessa a funcionalidade de cadastro",
      "resultado": "Tela com campos e botões apropriados é exibida."
    },
    {
      "cenario": "Cadastro válido",
      "condicao": "Usuário preenche todos os campos corretamente",
      "resultado": "Dados são validados, persistidos e mensagem de sucesso exibida."
    },
    {
      "cenario": "Nome obrigatório",
      "condicao": "Campo 'Nome do cachorro' está vazio",
      "resultado": "Sistema deve impedir o cadastro e exibir mensagem de erro."
    },
    {
      "cenario": "Data inválida",
      "condicao": "Data de nascimento é inválida ou futura",
      "resultado": "Sistema deve impedir o cadastro e exibir mensagem de erro."
    },
    {
      "cenario": "Tipo de raça obrigatório",
      "condicao": "Campo 'Tipo de Raça' não foi informado",
      "resultado": "Sistema deve impedir o cadastro e exibir mensagem de erro."
    },
    {
      "cenario": "Cancelamento",
      "condicao": "Usuário clicou em 'Cancelar'",
      "resultado": "Sistema deve fechar o formulário sem salvar dados."
    }
  ]
}
```