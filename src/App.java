import java.util.Scanner;
import Account.Account;
import Account.Checking;
import Account.Savings;
import Services.CheckingService;
import Services.Login;
import Services.SavingsService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

    //Valores pré definidos para a utilização do sistema
        Account account1 = new Account("Igor", "Wolf", 11223344, 123);
        Checking checking1 = new Checking(200);
        Savings savings1 = new Savings(600);

        CheckingService cs = new CheckingService(checking1, savings1);
        SavingsService ss = new SavingsService(savings1, checking1);

        System.out.println("---------------------------------"
                       + "\n|        SEJA BEM-VINDO!        |"
                       + "\n---------------------------------");

        Login login = new Login(account1);
        login.login();
       
        //Mensagem de bem vindo que se ajusta a quantidade de letras no nome
        login.welcomeMessage();

        boolean exit = false;
        while (!exit) {
            System.out.println("\n---------------------------------"
                             + "\n| O que você gostaria de fazer? |"
                             + "\n---------------------------------"
                             + "\n| 1. Depósito                   |"
                             + "\n| 2. Saque                      |"
                             + "\n| 3. Verificar Saldo            |"
                             + "\n| 4. Transferência              |"
                             + "\n| 5. [Sair]                     |"
                             + "\n---------------------------------");
            int opc = sc.nextInt();

            switch (opc) {

            // Opção Depósito    
                case 1:     
                    System.out.println( "---------------------------------"
                                    + "\n| Qual o tipo de conta?         |"
                                    + "\n---------------------------------"
                                    + "\n| 1. Conta corrente             |"
                                    + "\n| 2. Poupança                   |"
                                    + "\n---------------------------------");
                        int opc1 = sc.nextInt();
                    switch (opc1) {
                        case 1:
                            cs.deposit();
                            break;
                        case 2:
                            ss.deposit();
                            break;
                        default:
                            System.out.println("Opção inválida. Por favor, tente novamente.");
                            break;
                    }
                    break;
                    
            // Opcão Saque
                case 2:    
                    System.out.println( "---------------------------------"
                                    + "\n| Qual o tipo de conta?         |"
                                    + "\n---------------------------------"
                                    + "\n| 1. Conta corrente             |"
                                    + "\n| 2. Poupança                   |"
                                    + "\n---------------------------------");
                        int opc2 = sc.nextInt();
                    switch (opc2) {
                        case 1:
                            cs.withdraw();
                            break;
                        case 2:
                            ss.withdraw();
                            break;
                        default:
                            System.out.println("Opção inválida. Por favor, tente novamente.");
                            break;
                    }
                    break;
                
            // Opção ver saldo
                case 3:
                    System.out.println("---------------------------------"
                            + "\n| Qual o tipo de conta?         |"
                            + "\n---------------------------------"
                            + "\n| 1. Conta corrente             |"
                            + "\n| 2. Poupança                   |"
                            + "\n---------------------------------");

                    int opc3 = sc.nextInt();
                    switch (opc3) {
                        case 1:
                            cs.currentBalance();
                            break;
                        case 2:
                            ss.currentBalance();
                            break;
                        default:
                            System.out.println("Opção inválida. Por favor, tente novamente.");
                            break;
                    }
                    break;

            //Opção Transferencia
                case 4:
                    System.out.println("\n-------------------------------------"
                            + "\n| Selecione o tipo de transferência |"
                            + "\n-------------------------------------"
                            + "\n| 1. Conta Corrente para Poupança  |"
                            + "\n| 2. Poupança para Conta Corrente  |"
                            + "\n-------------------------------------");

                    int opc4 = sc.nextInt();
                    switch(opc4){
                        case 1:
                            cs.transfer();
                            break;
                        case 2:
                            ss.transfer();
                            break;
                        default:
                            System.out.println("Opção inválida. Por favor, tente novamente.");
                            break;
                    }
                    break;

            // Opção Sair
                case 5:
                    System.out.println("Finalizando...");
                    exit = true;
                    break;

                default:
                    System.out.println("Opção inválida: " + opc);
                    System.out.println("Por favor, digite uma opção válida.");
                    break;
            }
        }
        System.out.println("Obrigado, volte sempre!");
        sc.close();
    }
}