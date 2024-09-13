class Elemento{
    String id;
    String dados1;
    String dados2;

    Elemento(String id, String dados1, String dados2){
        this.id = id;
        this.dados1 = dados1;
        this.dados2 = dados2;
    }
}



class Node{
    Elemento elemento;
    Node proximo;

    Node(Elemento elemento){
        this.elemento = elemento;
        this.proximo = null;
    }
}


class Pilha {
    private Node topo;

    Pilha() {
        this.topo = null;
    }

    public void adicionarHistorico(Elemento elemento) {
        Node novoNode = new Node(elemento);
        if (topo != null) {
            novoNode.proximo = topo;
        }
        topo = novoNode;
    }

    
    public Elemento removerHistorico() {
        if (topo == null) {
            System.out.println("Pilha vazia");
            return null;
        }
        Elemento elementoRemovido = topo.elemento;
        topo = topo.proximo;
        return elementoRemovido;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void imprimirHistorico() {
        if (topo == null) {
            System.out.println("o histórico está vazio");
            return;
        }

        Node atual = topo;
        while (atual != null) {
            System.out.println("ID da solicitação: " + atual.elemento.id + ", Descrição: " + atual.elemento.dados1 + ", Data e hora: " + atual.elemento.dados2);
            atual = atual.proximo;
        }
    }
}

class Fila {
    private Node primeiroFila;
    private Node ultimoFila;
    
    Fila() {
        this.primeiroFila = null;
        this.ultimoFila = null;
    }

    public void adicionarFila(Elemento elemento) {
        Node novoNode = new Node(elemento);
        if (ultimoFila != null) {
            ultimoFila.proximo = novoNode;
        }
        ultimoFila = novoNode;
        if (primeiroFila == null) {
            primeiroFila = novoNode;
        }
    }
    public Elemento removerFila() {
        if (primeiroFila == null) {
            System.out.println("Fila vazia");
            return null;
        }
        Elemento elementoRemovido = primeiroFila.elemento;
        primeiroFila = primeiroFila.proximo;
        if (primeiroFila == null) {
            ultimoFila = null;
        }
        return elementoRemovido;
    }

    public boolean estaVazia() {
        return primeiroFila == null;
    }
    public void imprimirFila() {
        if (primeiroFila == null) {
            System.out.println("Fila vazia");
            return;
        }

        Node atual = primeiroFila;
        while (atual != null) {
            System.out.println("Número de identificação: " + atual.elemento.id + ", Nome: " + atual.elemento.dados1 + ", Motivo do atendimento: " + atual.elemento.dados2);
            atual = atual.proximo;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Elemento[] filaAtendimento = new Elemento[] {
            new Elemento("CLI001", "Maria Silva", "Dúvida sobre produto"),
            new Elemento("CLI002", "João Souza", "Reclamação de serviço"),
            new Elemento("CLI003", "Ana Costa", "Solicitação de reembolso"),
            new Elemento("CLI004", "Pedro Alves", "Informações de entrega"),
            new Elemento("CLI005", "Carla Dias", "Agendamento de visita"),
            new Elemento("CLI006", "Lucas Martins", "Alteração de pedido"),
            new Elemento("CLI007", "Patrícia Rocha", "Cancelamento de contrato"),
            new Elemento("CLI008", "Rafael Lima", "Renovação de assinatura"),
            new Elemento("CLI009", "Fernanda Gomes", "Suporte para instalação"),
            new Elemento("CLI010", "Carlos Eduardo", "Pedido de orçamento")
            };
        Elemento[] historico = new Elemento[] {
            new Elemento("REQ001", "Instalação de software", "2024-08-20 10:30"),
            new Elemento("REQ002", "Manutenção preventiva", "2024-08-20 11:00"),
            new Elemento("REQ003", "Atualização de sistema", "2024-08-20 11:30"),
            new Elemento("REQ004", "Suporte técnico", "2024-08-20 12:00"),
            new Elemento("REQ005", "Troca de equipamento", "2024-08-20 12:30"),
            new Elemento("REQ006", "Consulta de garantia", "2024-08-20 13:00"),
            new Elemento("REQ007", "Reparo de impressora", "2024-08-20 13:30"),
            new Elemento("REQ008", "Configuração de rede", "2024-08-20 14:00"),
            new Elemento("REQ009", "Restauração de dados", "2024-08-20 14:30"),
            new Elemento("REQ010", "Consulta técnica", "2024-08-20 15:00")
            };
        
        Pilha historicoDeOrdens = new Pilha();
        Fila ordemDeAtendimento = new Fila();
    
        for (int i = 0; i < 10 ; i++){
            historicoDeOrdens.adicionarHistorico(historico[i]);
            ordemDeAtendimento.adicionarFila(filaAtendimento[i]);
        }     
        System.out.println("Fila de Atendimento: \n");
        ordemDeAtendimento.imprimirFila();
        System.out.println();
        System.out.println("Cliente " + ordemDeAtendimento.removerFila().dados1 + " removido da fila de atendimento." );
        System.out.println();
        System.out.println("Histórico de Atendimentos: \n");
        historicoDeOrdens.imprimirHistorico();
        System.out.println("Solicitação " + historicoDeOrdens.removerHistorico().id + " removido do histórico de atendimentos." );


    }

}