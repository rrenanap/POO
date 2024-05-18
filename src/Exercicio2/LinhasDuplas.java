package Exercicio2;

public class LinhasDuplas {

    public class LinhasDuplas extends Retangulo {
        public LinhasDuplas(String texto) {
            super(texto);
        }

        @Override
        public void desenhar() {
            System.out.println("Retângulo com linhas duplas:");
            System.out.println("=============");
            System.out.println("==         ==");
            System.out.println("==  " + texto + "  ==");
            System.out.println("==         ==");
            System.out.println("=============");
        }
    }


}
