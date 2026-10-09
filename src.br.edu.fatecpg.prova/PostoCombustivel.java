//Array string tipo combustivel
//array doouble preco litro
//array litro disponivel
import java.util.Scanner;



public class PostoCombustivel{
     
    public static String tipoCombustivel [] = new String[3];
    public static double precoLitro [] = new double[3];
    public static int litroDisponivel [] = new int[3];
     


    public static void monitoramentoGlobal(){
        for (int i = 0; i < tipoCombustivel.length; i++)
            {
                System.out.println("Tipo de combustivel: " + tipoCombustivel[i]);
                System.out.println("Preço do combustivel: " + precoLitro[i]);
                System.out.println("Listros disponiveis: " + litroDisponivel[i]);
            } 
    }
    
    public static void avaliacaoPatrimonial(){
        double deneros = 0;
        for (int i = 0; i < tipoCombustivel.length; i++){
            deneros += precoLitro[i] * litroDisponivel[i];
        } 
        System.out.println("Avaliação patrimonial: " + deneros);
    }

    public static void invetario(){
        for (int i = 0; i < tipoCombustivel.length; i++){
            if(litroDisponivel[i] < 10){
                System.out.println("A Bomba " + (i + 1) + " nivel critico!");
            }
            else if(litroDisponivel[i] < 25){
                System.out.println("A Bomba " + (i + 1) + "Está pela metade " );
            }
        }
    }

    public static void operacaoVenda(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos litros o cliente pediu? ");
        int litros = scan.nextInt();
        System.out.println("Qual foi o tipo de combustivel?\n 1-Gasolina Comum \n 2-Aditivada \n3-Alcool");
        int tipo = scan.nextInt();
        tipo -= 1;
        for (int i = 0; i < tipoCombustivel.length; i++){
            if(tipo == 0 && litros < litroDisponivel[0]){
                System.out.println("Venda concluida, cobre o cliente em " + (litros * precoLitro[0]));
                litroDisponivel[0] -= litros;
            }
            else if(tipo == 1 && litros < litroDisponivel[1])
            {
                System.out.println("Venda concluida, cobre o cliente em " + (litros * precoLitro[1]));
                litroDisponivel[1] -= litros;
            }
            else if(tipo == 2 && litros < litroDisponivel[2]){
                System.out.println("Venda concluida, cobre o cliente em " + (litros * precoLitro[2]));
                litroDisponivel[2] -= litros;
            }
            else{
                System.out.println("Erro verifique seus numeros");
            }
        }
        scan.close();
    }

    public static void reabastecimento(){
        for (int i = 0; i < tipoCombustivel.length; i++)
        {
            litroDisponivel[i] += 50;
            if (litroDisponivel[i] >= 50) {
                litroDisponivel[i] = 50;
            }
        }

        System.out.println("Tanques reabastecidos! ");
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
     
        tipoCombustivel[0] = "Gasolina Comum";
        tipoCombustivel[1] = "Aditivada";
        tipoCombustivel[2] = "Alcool";
        precoLitro[0] = 5.7;
        precoLitro[1] = 4.8;
        precoLitro[2] = 3.7;
        litroDisponivel[0] = 50;
        litroDisponivel[1] = 24;
        litroDisponivel[2] = 5;

        int opcao = 0;

        System.out.println("=========Opções==========");
        System.out.println("1-Monitoramento \n 2-Avaliacao De Deneros \n 3-Inventario \n4-Vender \n 5-Reabastecimento");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                monitoramentoGlobal();
                break;
            case 2:
                avaliacaoPatrimonial();
                break;
            case 3:
                invetario();
                break;
            case 4:
                operacaoVenda();
            break;
            case 5:
                reabastecimento();
                break;
                default:
                    System.out.println("Verifique o numero selecionado!! ");
                break;
        }
        scan.close();
}
}