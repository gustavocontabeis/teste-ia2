# SDD - Issue #5

```json
{
  "contexto": {
    "titulo": "[US] Tela principal da aplicação",
    "descricao": "Criação da estrutura base da aplicação Java Swing para desenvolvimento de funcionalidades."
  },
  "requisitos_funcionais": [
    "Criar uma janela principal utilizando JFrame.",
    "A janela deve iniciar maximizada.",
    "Incluir um menu principal utilizando JMenuBar.",
    "Implementar um JDesktopPane para gerenciamento de múltiplas janelas internas.",
    "Adicionar um JInternalFrame de exemplo acessível através do menu principal.",
    "Garantir que ao clicar no menu, o JInternalFrame seja aberto dentro do JDesktopPane."
  ],
  "requisitos_nao_funcionais": [
    "Seguir boas práticas de organização de código.",
    "Separar responsabilidades em diferentes classes."
  ],
  "regras_negocio": [
    "A janela principal deve sempre iniciar maximizada.",
    "O JInternalFrame deve ser reutilizado ao invés de ser recriado desnecessariamente."
  ],
  "casos_uso": [
    {
      "titulo": "Abrir janela principal",
      "descricao": "O desenvolvedor inicia a aplicação e a janela principal é exibida maximizada.",
      "atores": [
        "Desenvolvedor"
      ]
    },
    {
      "titulo": "Acessar JInternalFrame",
      "descricao": "O desenvolvedor clica na opção do menu e o JInternalFrame de exemplo é aberto no JDesktopPane.",
      "atores": [
        "Desenvolvedor"
      ]
    }
  ],
  "criterios_aceite": [
    "A janela principal deve ser criada utilizando JFrame.",
    "A janela deve ser iniciada maximizada.",
    "Deve haver um menu principal com JMenuBar.",
    "O JDesktopPane deve estar presente e funcional.",
    "O JInternalFrame de exemplo deve estar acessível pelo menu.",
    "O JInternalFrame deve abrir corretamente dentro do JDesktopPane ao clicar no menu."
  ]
}
```