import java.util.Scanner;

public class financiamentoBradesco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcao;
        char continua = 'N';

        System.out.println(" ============== Bradesco Financiamentos ============== \n ");

        do{
            System.out.println("Insira a opção desejada: \n");
            System.out.println("1 - Crédito Pessoal");
            System.out.println("2 - Crédito Imobiliário");
            System.out.println("3 - Crédito Empresarial");
            System.out.println("4 - Empréstimo Consignado");
            
            opcao = Byte.parseByte(sc.nextLine());

            switch(opcao){
                case 1:
                    System.out.println("Opção escolhida: Crédito Pessoal. \n");
                break;
                
                case 2:
                    System.out.println("Opção escolhida: Crédito Imobiliário. \n");
                break;
                
                case 3:
                    System.out.println("Opção escolhida: Crédito Empresarial. \n");
                break;
                
                case 4:
                    System.out.println("Opção escolhida: Empréstimo Consignado. \n");
                break;
            
                default:
                    System.out.println(" *** Opção inválida!! *** ");
                    System.out.println("Tente novamente inserindo uma opção válida. \n");
                break;
            }

            if (opcao > 0 && opcao < 5){
                do{
                    System.out.print("Para voltar ao menu principal, digite 'V'. \nPara sair do sistema, digite 'S': \n");
                    continua = sc.nextLine().toUpperCase().charAt(0);
                }while(continua!='V' && continua!='S');
            }
            if (continua == 'S'){
                System.out.println("Obrigado(a) por o Bradesco Financiamentos.");
                System.out.println("\nPrograma Finalizado!");
            }
        }while (opcao < 1 || opcao > 4 || continua == 'V');
    
        sc.close();    
         
    }
}
