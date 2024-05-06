# learn-spring-books

## Introdução

Este Projeto foi criado com o objetivo de aplicar os conceitos ensinados na série de livros **spring in action**.

## Docker
Atualmente a unica dependencia utilizada é o banco de dado postgress que pode ser criado executando este comando:

~~~docker
docker run --name db-learn-spring -e POSTGRES_PASSWORD=minha_senha -e POSTGRES_DB=learn -p 5432:5432 -d postgres
~~~

### OU

Apenas executando o docker compose:

~~~ docker
docker compose up -d
~~~