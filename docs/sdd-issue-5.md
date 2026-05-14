# SDD - Issue #5

```json
{
  "contexto": {
    "titulo": "Tela principal da aplicação",
    "descricao": "Desenvolvimento da estrutura inicial de uma aplicação desktop utilizando Java Swing"
  },
  "requisitos_funcionais": [
    "A aplicação deve ter uma janela principal utilizando JFrame.",
    "A janela principal deve iniciar maximizada.",
    "A aplicação deve possuir um menu principal utilizando JMenuBar.",
    "A janela deve conter um JDesktopPane para gerenciamento de múltiplas janelas internas.",
    "Deve existir um JInternalFrame de exemplo acessível pelo menu principal.",
    "Ao clicar no menu, o JInternalFrame deve ser aberto dentro do JDesktopPane."
  ],
  "requisitos_nao_funcionais": [
    "Utilizar boas práticas de organização de código.",
    "Separar responsabilidades entre classes."
  ],
  "regras_negocio": [
    "O JInternalFrame deve ser reutilizado em vez de ser recriado desnecessariamente."
  ],
  "casos_uso": [
    {
      "titulo": "Abrir JInternalFrame",
      "descricao": "Usuário clica no menu para abrir o JInternalFrame de exemplo."
    }
  ],
  "criterios_aceite": [
    "Janela principal criada com JFrame.",
    "Janela principal inicia maximizada.",
    "Menu principal criado com JMenuBar.",
    "JDesktopPane está presente e funcional.",
    "JInternalFrame de exemplo acessível pelo menu.",
    "JInternalFrame abre corretamente dentro do JDesktopPane ao clicar no menu."
  ]
}
```