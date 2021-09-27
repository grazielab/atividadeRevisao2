import java.util.Scanner;

public class financiamentoBradesco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcao;
        char continua = 'N';

        do{
            System.out.println(" ============== Financiamentos Bradesco ============== \n ");
            
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
                    System.out.println("Opção inválida!!");
                break;
            }

            if (opcao > 0 && opcao < 5){
                do{
                    System.out.print("Para voltar ao menu principal, digite 'V'. \n Para sair do sistema, digite 'S': ");
                    continua = sc.nextLine().toUpperCase().charAt(0);
                }while(continua!='V' && continua!='S');
            }
            if (continua == 'S'){
                System.out.println("Obrigado(a) por usar o nosso sistema.");
                System.out.println("\n Programa Finalizado!");
            }
        }while (opcao < 1 || opcao > 4 || continua == 'V');
    
        sc.close();    
         
    }
    
}

    
}
