Feature: Login
  Scenario: Realizar login com sucesso na 
    Given que acessei na tela inicial
    And preenchi o campo Usuario
	And preenchi o campo Senha
	And clico no botão em acessar
	When posiciono o mouse sobre o Usuário no menu
	Then sou redirecionado para Home
