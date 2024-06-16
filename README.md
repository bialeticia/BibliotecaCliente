# Biblioteca Cliente

Este projeto implementa um cliente para comunicação com servidor.

## Dependências

É necessário clonar e utilizar o Servidor que se encontra no repositório: https://github.com/bialeticia/BibliotecaServidor

## Funcionalidades

- Conectar a um servidor especificado pelo HOST e PORT.
- Enviar comandos ao servidor e exibir as respostas no console.
- Processar e exibir respostas de listagem de livros em formato de lista.

## Interação
- Iniciar o cliente: Ao iniciar o cliente, ele tentará se conectar ao servidor especificado pelo HOST e PORT.
- Enviar comandos: Após a conexão, você pode digitar comandos no console. O cliente enviará esses comandos ao servidor.
- Receber respostas: O cliente exibirá as respostas do servidor no console.
- Comando de listagem: Para comandos que começam com LISTAR, a resposta será processada e exibida como uma lista de livros.
