#language: pt
#encoding: utf-8

  @test
  Funcionalidade: Realizar Compra no E-commerce

    Cenario: Adicionar produto ao carrinho
      Dado primeiro iniciar o driver
      Dado que um usuario acesse o site "http://automationpractice.com/index.php"
      Entao pesquisa pelo produto "Faded Short Sleeve T-shirts"
      E vai adicionar ao carrinho