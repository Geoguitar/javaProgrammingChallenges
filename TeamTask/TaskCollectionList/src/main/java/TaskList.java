import java.util.ArrayList;
import java.util.List;

public class TaskList {
    public static void main(String[] args) {

//        00-Crie uma lista e execute as operações abaixo;
        List<String> listName = new ArrayList<>();

//        01-Adicione 10 nomes: Juliana,Joana,Claudia,Willian,Paula,Tatiana,Pedro,Carlos,Larissa e João.
//        02-Navegue na lista exibindo cada nome no console.
//        03-Substitua o nome Carlos por Roberto.

//        04-Retorne o nome da posição 1.
        String positionName = listName.get(1);
        System.out.println("Nome na posição 1: " + positionName);

//        05-Remova o nome da posição 4.
//        06-Remova o nome João.
//        07-Retorne a quantidade de itens na lista.

//        08-Verifique se o nome Juliano existe na lista.
        boolean pesquisaNome = listName.contains("Juliano");
        System.out.println("Resultado de pesquisa: " + pesquisaNome);

//        09-Crie uma nova lista com os nomes: Ismael e Rodrigo.
//        10-Adicione todos os itens da nova lista na primeira lista criada.
//        11-Ordene os itens da lista por ordem alfabética.

//        12-Verifique se a lista está vazia.
        boolean listaVazia = listName.isEmpty();
        System.out.println("Lista está vázia? : " + listaVazia);

    }
}
