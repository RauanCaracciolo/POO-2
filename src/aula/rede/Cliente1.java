package aula.rede;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Cliente1{
    public static void main(String[] args) throws Exception{//Nao usar esse throws, foi colocado apenas para evitar try e cattches e deixar o codigo ditadico
        InetAddress endereco = InetAddress.getByName("10.105.65.32"); // endereço IP
        int porta = 12345; // handshake

        Socket cliente;
        cliente = new Socket(endereco, porta);

        ObjectOutputStream outputServidorCliente; // Objeto para output
        outputServidorCliente = new ObjectOutputStream(cliente.getOutputStream());
        outputServidorCliente.flush();

        ObjectInputStream inputServidorCliente; // Objeto para imput
        inputServidorCliente = new ObjectInputStream(cliente.getInputStream());

        System.out.println("Obetencao de fluxos de entrada e saida");


        String mensagem =  (String)inputServidorCliente.readObject();
        System.out.println("Mensagem recebida |" + mensagem + "|\n");

        mensagem = "Ola servidor!";
        outputServidorCliente.writeObject(mensagem);
        System.out.println("Mensagem enviada |" + mensagem + "|");

        outputServidorCliente.close();
        inputServidorCliente.close();
        cliente.close();

    }
}
