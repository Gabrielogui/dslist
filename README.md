# Projeto BackEnd Java SpringBoot
Lista de Games 🎮

## Sobre o Projeto

Este projeto é uma API desenvolvida para gerenciar uma lista de jogos previamente cadastrados, permitindo que usuários acessem e manipulem as informações dos games. A API oferece funcionalidades como: Vizualização dos jogos, movimentação da lista. Cada jogo inclui informações detalhadas, como: Título, ano de lançamento, Plataforna, Descrição, Gênero.

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

## FrontEnd do Projeto:

https://github.com/Gabrielogui/FrontEnd-appJava
- Com ele, pode rodar os dois, tendo as experiências do backEnd com o front

## Estrutura do Projeto

## Rotas e EndPoints

| MÉTODO   | ROTAS                       | DESCRIÇÃO                                     |
| -------- | --------------------------- | --------------------------------------------- |
| GET      | /games                      | Informa todos os games                        |
| GET      | /games/{id}                 | Informa detalhes do game requerido            |
| GET      | /lists                      | Informa os tipos de games                     |
| GET      | /lists/{listId}/games       | Retorna todos os games de um determinado tipo |
| POST     | /lists/{listId}/replacement | Movimenta a posição do game                   |

## Contato

- Email: gabrielcsro@gmail.com
- Linkedin: https://www.linkedin.com/in/gabriel-rodrigues-a551012a2/
