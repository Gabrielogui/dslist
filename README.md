# Projeto BackEnd Java SpringBoot
Lista de Games 🎮

## Sobre o Projeto

Este é um projeto que disponibiliza uma API de uma lista de jogos já cadastrados no qual você pode visualiza-las, vendo as informações curtas, ou buscar o jogo vendo todas as informações do game, além de reposicionar a lista. É um backend no qual cada game tem: Título, ano, plataforma, descrição, gênero e etc.
O usuário pode movimentar a lista, de cada gênero, mudando sua posição/ordem em sua exibição. O FrontEnd ainda não foi feito.

## Tecnologias Utilizadas

- Java: 21
- SpringBoot
- JPA / Hibernate
- Banco de dados H2
- Docker
- PostgreeSql

> [!TIP]
> Para alterar entre as etapas de teste, desenvolvimento e produção, deve-se ir no arquivo __applications.properties__ e substituir o __spring.profiles.active=${APP_PROFILE:test}__ após o __APP_PROFILE:__ entre as palavras 'test', 'dev' e 'prod'.

## Como Executar

1. Clone o repositório: git clone 
2. Execute a aplicação com __mvn spring-boot:run__ ou Rode o arquivo __DslistApplication.Java__ que se localiza nas pastas: src -> main -> java -> com -> devsuperior -> dslist
3. Acesse a API __'http://localhost:8080'__ com a rota desejada (Veja a tabela de rotas)

## Estrutura do Projeto

## Rotas e EndPoints

| MÉTODO   | ROTAS                       | DESCRIÇÃO                                     |
| -------- | --------------------------- | --------------------------------------------- |
| GET      | /games                      | Informa todos os games                        |
| GET      | /games/{id}                 | Informa detalhes do game requerido            |
| GET      | /lists                      | Informa os tipos de games                     |
| GET      | /lists/{listId}/games       | Retorna todos os games de um determinado tipo |
| POST     | /lists/{listId)/replacement | Movimenta a posição do game                   |
