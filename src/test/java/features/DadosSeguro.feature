Feature: Preencher Seguro
  Scenario: Preencher dados do veiculo 
    Given usuario esta na pagina inicial
    And seleciono combo "make" com "Audi"
    And seleciono combo "model" com "Scooter"
    And preencho o campo "cylindercapacity" com "1000"
    And preencho o campo "engineperformance" com "90"
    And seleciono data com "09/25/2013"
    And seleciono combo "numberofseats" com "5"
    And seleciono handDrive com "yes"
    And preencho o campo "payload" com "700"
    And preencho o campo "totalweight" com "1200"
    And preencho o campo "listprice" com "45000"
    And preencho o campo "licenseplatenumber" com "XYZ9876"
    And preencho o campo "annualmileage" com "15000"    
    And seleciono combo "numberofseatsmotorcycle" com "2"
    And seleciono combo "fuel" com "Petrol"
    And depois de um tempo de 1 segundos
	When clico em Next
	
  Scenario: Preencher dados do segurado
    Given usuario esta na segunda pagina
    Then verifico que estou no tab 2
    And preencho o campo "firstname" segurado com "Alex"
    And preencho o campo "lastname" segurado com "Andre"
    And seleciono data segurado com "09/25/1975"
    And seleciono gender segurado com "male"
    And preencho o campo "streetaddress" segurado com "Rua 5"
    And seleciono combo "country" segurado com "Brazil"
    And preencho o campo "zipcode" segurado com "13091410"
    And preencho o campo "city" segurado com "Campinas"
    And seleciono combo "occupation" segurado com "Employee"
    And seleciono hobby segurado com "Speeding"
    And preencho o campo "website" segurado com "www.teste.com"
	When clico em Next tela segurado

  Scenario: Preencher dados do produto
    Given usuario esta na terceira pagina
    Then verifico que estou no tab 3
    And seleciono data produto com "09/25/2021"
    And seleciono combo "insurancesum" produto com "3.000.000,00"
    And seleciono combo "meritrating" produto com "Super Bonus"
    And seleciono combo "damageinsurance" produto com "Partial Coverage"
    And seleciono optional products com "EuroProtection"
    And seleciono combo "courtesycar" produto com "Yes"
    When clico em Next tela produto

  Scenario: Verificar cotacoes e escolher
    Given usuario esta na quarta pagina
    Then verifico que estou no tab 4
    And verifico presenca do texto "Price Per Year ($)"
    And verifico presenca do texto "Online Claim"
    And verifico presenca do texto "Claims Discount (%)"
    And verifico presenca do texto "Worldwide Cover"
    And verifico presenca do texto "View Quote"
    And verifico presenca do texto "Download Quote"
    And seleciono cotacao com "Platinum"
    When clico em Next tela preco

  Scenario: Enviar email
    Given usuario esta na quinta pagina
    Then verifico que estou no tab 5
    And preencho campo "email" com "xyzw@gmail.com" para envio de email
    And preencho campo "phone" com "987654321" para envio de email
    And preencho campo "username" com "xyzw" para envio de email
    And preencho campo "password" com "Wzyx!714" para envio de email
    And preencho campo "confirmpassword" com "Wzyx!714" para envio de email
    And preencho campo "comments" com "Teste de comentarios" para envio de email
    When clico em Send para envio de email
    Then verifico presenca do texto final "Sending e-mail success!"