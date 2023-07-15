package Services;

import java.util.InputMismatchException;
import java.util.Scanner;

import Account.Account;

public class Login {
    Scanner sc = new Scanner(System.in);
    Account acc = new Account();
    
    public Login(Account acc) {
        this.acc = acc;
    }

    public boolean login(){  
        boolean trySair = false;
        while (!trySair) {
            boolean sair = false;
            while (!sair) {
                try {
                    System.out.print("Digite o número da sua conta: ");
                    int accNumber = sc.nextInt();
                    System.out.print("\nDigite a sua senha: ");
                    int accPin = sc.nextInt();

                    if (accNumber != acc.getNumberAccount() || accPin != acc.getPin()){
                        System.out.println(" - Número da conta ou senha incorretos!\n - Tente novamente...\n");       
                    } else {
                        System.out.println("\nAutenticação bem-sucedida. Acesso permitido.\n");
                        sair = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println(" - Entrada inválida! Digite apenas números.\n");
                    sc.nextLine(); // Limpar o buffer do scanner para evitar leituras incorretas
                }
            }
            trySair = true;
        }
        return true;
    }

    // Retorna uma string que se ajusta a quantidade de letras
    public String welcomeMessage() {
        String fullName = acc.getfirstName() + " " + acc.getlastName();
        // Largura total da linha  34

        String nameLine = "|    Bem Vindo, " + String.format("%-16s", fullName) + "|";

        int numCharacters = nameLine.length();

        // Criar sequência de hifens
        StringBuilder hifen = new StringBuilder();
        for (int i = 0; i < numCharacters; i++) {
            hifen.append("-");
        }

        System.out.println(hifen);
        System.out.println(nameLine);
        System.out.println(hifen);
        return " ";
    }
}
