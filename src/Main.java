import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ConsultarCep consultarCep = new ConsultarCep();

        System.out.println("Digite um cep para busca:");
        String cep = input.nextLine();

        try {
            Endereco novoEndereco = consultarCep.buscaEndereco(cep);
            System.out.println(novoEndereco);

            GerarArquivo gerarArquivo = new GerarArquivo();
            gerarArquivo.salvaJson(novoEndereco);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}