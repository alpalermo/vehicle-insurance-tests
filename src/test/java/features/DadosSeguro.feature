Feature: Preencher Seguro
  Scenario: Preencher dados do veiculo 
    Given que acesso a tela inicial
    And seleciono combo "make" com "Audi"
    And seleciono combo "model" com "Scooter"
    And preenchi o campo "cylindercapacity" com "1000"
    And preenchi o campo "engineperformance" com "90"
    And seleciono data com "09/25/2013"
    And seleciono combo "numberofseats" com "5"
    And seleciono handDrive com "yes"
    And preenchi o campo "payload" com "700"
    And preenchi o campo "totalweight" com "1200"
    And preenchi o campo "listprice" com "45000"
    And preenchi o campo "licenseplatenumber" com "XYZ9876"
    And preenchi o campo "annualmileage" com "15000"    
    And seleciono combo "numberofseatsmotorcycle" com "2"
    And seleciono combo "fuel" com "Petrol"
    And depois de um tempo de 1 segundos
	When clico em Next
	And depois de um tempo de 5 segundos
	#Then sou redirecionado para "Tela2"
