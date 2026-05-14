# SDD - Issue #9

```json
{
  "contexto": {
    "titulo": "[UC] Cadastro de Peixe",
    "descricao": "Cadastro de Peixe através de uma tela interna no sistema."
  },
  "requisitos_funcionais": [
    "A tela de cadastro deve ser implementada usando JInternalFrame.",
    "Os campos de entrada devem permitir o cadastro das informações básicas do peixe."
  ],
  "requisitos_nao_funcionais": [
    "A tela deve abrir centralizada dentro do sistema.",
    "Deve permitir navegação entre campos via teclado (TAB).",
    "A interface deve seguir boas práticas de design de UI."
  ],
  "regras_negocio": [
    "O nome do peixe não pode estar vazio.",
    "O tipo de água deve ser obrigatoriamente selecionado.",
    "A data de nascimento não pode ser futura.",
    "O peso deve ser maior que zero.",
    "Pode haver mais de um peixe com o mesmo nome (não é chave única)."
  ],
  "casos_uso": [
    {
      "titulo": "Cadastrar Peixe",
      "descricao": "Usuário cadastra um novo peixe com informações básicas."
    }
  ],
  "criterios_aceite": [
    "A tela deve ser exibida dentro de um JInternalFrame.",
    "Todos os campos obrigatórios devem ser validados antes do envio: Nome do Peixe e Tipo de Água.",
    "O campo Data de Nascimento deve aceitar apenas datas válidas.",
    "O campo Peso deve aceitar apenas valores numéricos.",
    "O botão 'Salvar' deve validar os campos e exibir mensagens de sucesso ou erro.",
    "Deve existir um botão 'Cancelar' que limpa os campos ou fecha a tela.",
    "Após salvar com sucesso, os campos devem ser limpos para novo cadastro."
  ]
}
```