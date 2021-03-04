Feature: Preencher Seguro
  Scenario: Preencher dados do veiculo 
    Given que acesso a tela inicial
    And seleciono combo "make" com "Audi"
    And seleciono combo "model" com "Scooter"
    And seleciono combo "numberofseats" com "5"
    And seleciono combo "numberofseatsmotorcycle" com "2"
    And seleciono combo "fuel" com "Petrol"
    And depois de um tempo de 5 segundos
	#When clico em ""Next"
	#Then sou redirecionado para "Tela2"
