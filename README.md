# Sistema ATM

Este projeto é um software de caixa eletrônico que demonstra a aplicação dos princípios da Programação Orientada a Objetos, como encapsulamento e herança. O objetivo é criar um sistema que permita realizar operações bancárias básicas, como depósito, saques e verificação de saldo, para conta corrente e poupança, além de também realizar transferencias entre elas.

## Funcionalidades

- **Depósito:** Permite ao usuário fazer um depósito em uma conta corrente ou poupança selecionada.
- **Saque:** Permite ao usuário fazer um saque de uma conta corrente ou poupança, desde que haja saldo disponível.
- **Verificar Saldo:** Mostra o saldo atual de uma conta corrente ou poupança.
- **Transferência:** Permite ao usuário transferir dinheiro entre uma conta corrente e uma conta poupança.

## Organização do Código

O projeto está estruturado em várias classes que representam as diferentes entidades e serviços:

- **Account (Conta)**: Classe base que representa uma conta bancária, contendo informações como nome, sobrenome, número da conta e PIN.
- **Checking (Conta Corrente)**: Subclasse de Account que representa uma conta corrente, incluindo um saldo específico para essa conta.
- **Savings (Conta Poupança)**: Subclasse de Account que representa uma conta poupança, também incluindo um saldo específico para essa conta.
- **CheckingService (Serviço de Conta Corrente)**: Classe responsável por fornecer as funcionalidades relacionadas a uma conta corrente, como depósito, saque e transferência.
- **SavingsService (Serviço de Conta Poupança)**: Classe responsável por fornecer as funcionalidades relacionadas a uma conta poupança, como depósito, saque e transferência.
- **Login (Login)**: Classe responsável pelo processo de autenticação do usuário.
- **App (Programa Principal)**: Classe que contém o método main e gerencia a interação com o usuário, chamando os serviços apropriados com base nas escolhas do usuário.

## Resultado

  **Fazendo o login na conta**
  
  ![image](https://github.com/IgorWolf99/ATM-System/assets/116234237/2c3d8471-22b8-4edc-a44e-106ebb06bed0)

- **Dados incorretos no login**  ![image](https://github.com/IgorWolf99/ATM-System/assets/116234237/611aea7d-985b-4d86-9f55-e97f5a2ecbeb)
---
**Realizando depósito em uma conta**

![image](https://github.com/IgorWolf99/ATM-System/assets/116234237/c540bc14-5d6a-4c60-a5cd-b7553023a7c0)

**Tentando realizar um saque maior do que o saldo existente na conta**

![image](https://github.com/IgorWolf99/ATM-System/assets/116234237/09a0acf5-72a4-4005-bc9e-b941bed6ffc8)

**Transferência entre as contas**

![image](https://github.com/IgorWolf99/ATM-System/assets/116234237/af10ff21-2db8-46a8-bbd3-2b7725f4c2b3)
