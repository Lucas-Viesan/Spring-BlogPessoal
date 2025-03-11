# Spring Blog Pessoal

Este projeto foi desenvolvido utilizando Java e Spring Boot e tem como objetivo criar uma plataforma de blog pessoal onde os usuários podem interagir por meio de postagens categorizadas por temas.

🚀 ## Funcionalidades

🔐 Autenticação JWT para garantir segurança na aplicação.

👤 Gerenciamento de Usuários: Cadastro e autenticação.

📝 Postagens: Crie, edite e visualize postagens.

📂 Temas: Organização e classificação das postagens por temas específicos.

🛠️ ## Tecnologias Utilizadas

Java 17

Spring Boot

Spring Security

JWT (JSON Web Token)

MySQL (para persistência de dados)

Swagger (para documentação da API)

📋 ##  Entidades

Usuário: Controla as informações pessoais e credenciais de acesso.

Postagens: Representa o conteúdo publicado pelos usuários.

Temas: Define categorias para organizar as postagens.

🔧 ## Como Executar o Projeto

Clone o repositório:

git clone https://github.com/Lucas-Viesan/Spring-BlogPessoal.git

Abra o projeto na sua IDE preferida (IntelliJ, Eclipse, VSCode, etc.).

Configure o banco de dados no arquivo application.properties com suas credenciais:

spring.datasource.url=jdbc:mysql://localhost:3306/blog_pessoal
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

Execute a aplicação e acesse o Swagger para testar os endpoints:

http://localhost:8080/swagger-ui.html

🧩 ## Endpoints Principais

/usuarios - Cadastro e login de usuários.

/postagens - CRUD completo para postagens.

/temas - CRUD completo para temas.

🤝##  Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests. 😊


