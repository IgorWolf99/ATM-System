package Services;

import java.util.Scanner;
import Account.Checking;
import Account.Savings;

public class SavingsService {
    Scanner sc = new Scanner(System.in);
    Checking cc = new Checking();
    Savings ss = new Savings();
    
    public SavingsService(Savings ss, Checking cc) {
        this.cc = cc;
        this.ss = ss;
    }

    public void currentBalance(){
        System.out.printf(String.format("Saldo Poupança: R$ %.2f.\n", ss.getBalance()));
    }

    public void deposit() {
        System.out.print("Digite o valor do depósito: R$ ");
        double valor = sc.nextDouble();
        
        double newBalance = valor + ss.getBalance();
        System.out.println(" - Depósito de " + String.format("R$ %.2f", valor) + " efetuado com sucesso.");
        ss.setBalance(newBalance);  // Atualiza o saldo da poupança
    }

    public void withdraw() {
        System.out.print("Digite o valor do saque: R$ ");
        double valor = sc.nextDouble();

        if (valor > ss.getBalance()) {
            System.out.printf("Você não possui fundos suficientes para realizar um saque no valor de R$ %.2f.\n", valor);
        } else { 
            double newBalance = ss.getBalance() - valor;
            System.out.println(" - Saque de " + String.format("R$ %.2f", valor) + " efetuado com sucesso.");
            ss.setBalance(newBalance);  // Atualiza o saldo da poupança
        }
    }

    public void transfer() {
            System.out.println("Poupança >> Conta Corrente");
            System.out.print("Digite o valor que deseja transferir: R$ ");
            double valor = sc.nextDouble();
            
            if (valor > ss.getBalance()) {
                System.out.printf(" - Você não possui fundos suficientes na sua poupança para realizar essa transferência.");
            } else { 
                double checkingNewBalance = cc.getBalance() + valor;
                double savingsNewBalance = ss.getBalance() - valor;
                System.out.printf(" - Transferência no valor de R$ %.2f realizada com sucesso.", valor);
                ss.setBalance(savingsNewBalance); // Atualiza o saldo da poupança
                cc.setBalance(checkingNewBalance); // Atualiza o saldo da conta corrente
            }
     }
}

