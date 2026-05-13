# SDD - Issue #9

```json
{
  "contexto": {
    "titulo": "[UC] Cadastro de Peixe",
    "descricao": "Cadastro de peixe utilizando JInternalFrame com informações básicas para controle e registro."
  },
  "requisitos_funcionais": [
    "Exibir uma tela de cadastro de peixe dentro de um JInternalFrame.",
    "Permitir o preenchimento dos campos: Nome do Peixe, Data de Nascimento, Tipo de Água, Espécie, e Peso.",
    "Validar campos obrigatórios antes do envio.",
    "Salvar as informações ao pressionar o botão \"Salvar\".",
    "Limpar campos ao salvar com sucesso ou pressionar o botão \"Cancelar\"."
  ],
  "requisitos_nao_funcionais": [
    "A tela deve ser responsiva e abrir centralizada.",
    "Navegação entre os campos deve ser possível via teclado (TAB).",
    "Mensagens devem ser exibidas utilizando JOptionPane ou equivalente."
  ],
  "regras_negocio": [
    "O nome do peixe não pode estar vazio.",
    "O tipo de água deve ser obrigatoriamente selecionado.",
    "A data de nascimento não pode ser futura.",
    "O peso deve ser maior que zero.",
    "Permitir mais de um peixe com o mesmo nome."
  ],
  "casos_uso": [
    {
      "id": "UC1",
      "descricao": "Cadastrar um peixe com informações válidas."
    },
    {
      "id": "UC2",
      "descricao": "Cancelar cadastro e limpar os campos."
    },
    {
      "id": "UC3",
      "descricao": "Tentar cadastrar um peixe sem informar campos obrigatórios."
    }
  ],
  "criterios_aceite": [
    "A tela deve ser exibida dentro de um JInternalFrame.",
    "Todos os campos obrigatórios (Nome do Peixe e Tipo de Água) devem ser validados antes do envio.",
    "O campo Data de Nascimento deve aceitar apenas datas válidas.",
    "O campo Peso deve aceitar apenas valores numéricos.",
    "O botão \"Salvar\" deve validar os campos e exibir mensagens de sucesso ou erro.",
    "O botão \"Cancelar\" deve limpar os campos ou fechar a tela.",
    "Após salvar com sucesso, os campos devem ser limpos para novo cadastro."
  ]
}
```