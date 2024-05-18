package Exercicio1;

public class Main {


    public class Main {
        public static void main(String[] args) {

            Funcionario f1 = new Funcionario("João", 20.0f, 160);
            Lider l1 = new Lider("Maria", 25.0f, 160);
            Gerente g1 = new Gerente("Pedro", 30.0f, 160);

            System.out.println("Salário de " + f1.getNome() + ": R$" + f1.calcularSalario());
            System.out.println("Salário de " + l1.getNome() + ": R$" + l1.calcularSalario());
            System.out.println("Salário de " + g1.getNome() + ": R$" + g1.calcularSalario());
        }
    }
}