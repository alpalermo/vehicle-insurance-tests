Feature: Preencher Seguro
  Scenario: Preencher dados do veiculo 
    Given que acesso a tela inicial
    And seleciono combo "make" com "Audi"
    And seleciono combo "model" com "Scooter"
    And preenchi o campo "cylindercapacity" com "1000"
    And preenchi o campo "engineperformance" com "90"
    And preenchi o campo "payload" com "700"
    And preenchi o campo "totalweight" com "1200"
    And preenchi o campo "listprice" com "45000"
    And preenchi o campo "licenseplatenumber" com "XYZ9876"
    And preenchi o campo "annualmilleage" com "15000"
    And seleciono combo "numberofseats" com "5"
    And seleciono combo "numberofseatsmotorcycle" com "2"
    And seleciono combo "fuel" com "Petrol"
    And depois de um tempo de 5 segundos
	#When clico em ""Next"
	#Then sou redirecionado para "Tela2"
