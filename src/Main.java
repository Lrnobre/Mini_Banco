import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Jaqueline Oliveira";
        int contaTipo = 0 ; // 0 = Corrente e 1 = Poupança
        double saldo = 2500;
        boolean finalizou = true;
        double valor=0;

        while (finalizou){
            System.out.println(String.format("""
                        ***********************
                            Seja Bem Vindo(a) %s   
                            Sua conta atualmente é %s        
                            Qual Operação deseja executar?
                                            
                            1- Consultar saldos
                            2- Receber valor
                            3- Transferir valor
                            4- Sair
                            
                         ***********************
                    """,nome,contaTipo));
            int opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println(String.format("Seu saldo é R$%f",saldo));
            }
            else if (opcao == 2){
                System.out.println("Quanto você deseja depositar?");
                valor = scanner.nextFloat();
                saldo = saldo + valor;
            }

            else if (opcao == 3){
                System.out.println("Quanto você deseja transferir?");
                valor = scanner.nextFloat();
                if (valor > saldo){
                    System.out.println("Saldo Insuficente");
                }
                else {
                    saldo = saldo - valor;
                }
            }

            else if (opcao == 4){
                System.out.println("Finalizando Mini Banco");
                break;
            }
            else {
                System.out.println("Opção Invalida, por favor escolher outra");
            }

        }

    }
}