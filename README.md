# trabalho1-PilhasFilas

Estruturas :

Classe Elemento: representa um elemento de atendimento, contendo 3 parametros: 
	-id = que representa o ID da solicitação caso o elemento seja usado em uma pilha 	 e representa o numero de identificação caso seja utilizado em uma fila

	-dados1 = que representa a descrição do serviço quando utilizado na pilha e 	 representa o nome do cliente quando usado na fila

	-dados2 = representa a data e hora do serviço quando utilizado na pilha e o 	 motivo do atendimento quando utilizado na fila





Classe Node: encapsula um objeto da classe Elemento e um ponteiro para o próximo nó. 

As classes Node e Elemento vão ser usadas para as classes de Pilha e Fila





Classe Pilha: Implementação de uma pilha para armazenar o histórico de atendimentos, onde  o último atendimento inserido é o primeiro a ser removido 

Métodos:

	-adicionarHistorico(Elemento elemento): Adiciona um atendimento ao histórico.

	-removerHistorico(): Remove o ultimo atendimento adicionado ao histórico.

	-estaVazia(): Faz a verificação se a pilha esta vazia.

	-imprimeHistorico(): Faz o print de todos elementos dentro da pilha




Classe Fila: Implementação de uma fila para gerenciar a ordem de atendimento dos clientes, onde o primeiro atendimento inserido é o primeiro a ser removido 

Métodos:
	-adicionarFila(Elemento elemento): Adiciona um cliente na fila de atendimento.

	-removerFila(): Remove o primeiro cliente da fila.
	
	-estaVazia(): Faz a verificação se a fila esta vazia.

	-imprimirFila(): Faz o print de todos elementos dentro da fila.




Classe Main:

	-Adiciona 10 clientes na fila de atendimento.

	-Exibe os clientes na fila.

	-Remove o primeiro cliente da fila.


	-Adiciona 10 solicitações no histórico.

	-Exibe todas as solicitações no histórico.

	-Remove a ultima solicitação do histórico.Estruturas Implementadas

