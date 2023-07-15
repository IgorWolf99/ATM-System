package Services;

import java.util.Scanner;
import Account.Checking;
import Account.Savings;

public class CheckingService {
    Scanner sc = new Scanner(System.in);
    Checking cc = new Checking();
    Savings ss = new Savings();
    
    public CheckingService(Checking cc, Savings ss) {
        this.cc = cc;
        this.ss = ss;
    }

    public void currentBalance(){
        System.out.printf(String.format("Saldo Conta Corrente: R$ %.2f.\n", cc.getBalance()));
    }
    
    public void deposit() {
        System.out.print("Digite o valor do depósito: R$ ");
        double valor = sc.nextDouble();
        
        double newBalance = valor + cc.getBalance();
        System.out.println(" - Depósito de " + String.format("R$ %.2f", valor) + " efetuado com sucesso.");
        cc.setBalance(newBalance);  // Atualiza o saldo da conta corrente
    }

    public void withdraw(){
        System.out.print("Digite o valor do saque: R$ ");
        double valor = sc.nextDouble();

        if (valor > cc.getBalance()){
            System.out.printf(" - Você não possui fundos suficientes para realizar um saque no valor de R$ %.2f.\n", valor);
        }  else{ 
            Double newBalance = cc.getBalance() - valor;
            System.out.println(" - Saque de " + String.format("R$ %.2f", valor) + " efetuado com sucesso.");
            cc.setBalance(newBalance);  // Atualiza o saldo da conta corrente
        }
    }

    public void transfer() {
            System.out.println("Conta Corrente >> Poupança");
            System.out.print("Digite o valor que deseja transferir: R$ ");
            double valor = sc.nextDouble();

            if (valor > cc.getBalance()) {
                System.out.printf(" - Você não possui fundos suficientes na sua conta Corrente para realizar essa transferência.");
            } else { 
                double savingsNewBalance = ss.getBalance() + valor;
                double checkingNewBalance = cc.getBalance() - valor;
                System.out.printf(" - Transferência no valor de R$ %.2f realizada com sucesso.", valor);
                ss.setBalance(savingsNewBalance); // Atualiza o saldo da poupança
                cc.setBalance(checkingNewBalance); // Atualiza o saldo da conta corrente
            }
    }
    
}
