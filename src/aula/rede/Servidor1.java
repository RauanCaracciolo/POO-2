package aula.rede;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor1 {
    public static void main(String[] args) throws Exception{ //Nao usar esse throws, foi colocado apenas para evitar try e cattches e deixar o codigo ditadico
        int servicos = 2; //quantidade de conexões
        InetAddress endereco = InetAddress.getByName("10.105.65.32"); // endereço IP
        int porta = 12345; // handshake

        ServerSocket servidor;
        servidor = new ServerSocket(porta, servicos, endereco);

        System.out.println("Servidor Inicializado (" + servidor + ")\n");

        Socket conexao;
        System.out.println("Esperando por conexão;\n");
        conexao = servidor.accept();
        System.out.println("Conexão recebida.");


        ObjectOutputStream outputClienteServidor; // Objeto para output
        outputClienteServidor = new ObjectOutputStream(conexao.getOutputStream());
        outputClienteServidor.flush();


        ObjectInputStream inputClienteServidor; // Objeto para imput
        inputClienteServidor = new ObjectInputStream(conexao.getInputStream());

        System.out.println("Obetencao de fluxos de entrada e saida");


        String mensagem;
        mensagem = "Conexão realizada com sucesso.";
        outputClienteServidor.writeObject(mensagem);
        System.out.println("Mensagem |" + mensagem + "| enviada com sucesso\n");

        mensagem = (String)inputClienteServidor.readObject();
        System.out.println("Mensagem recebida |" + mensagem + "|");

        outputClienteServidor.close();
        inputClienteServidor.close();
        servidor.close();
        System.out.println("Porta encerrada");

    }
}
