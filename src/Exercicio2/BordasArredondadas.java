package Exercicio2;

public class BordasArredondadas {

    public class BordasArredondadas extends Retangulo {
        public BordasArredondadas(String texto) {
            super(texto);
        }

        @Override
        public void desenhar() {
            // Implementação para desenhar um retângulo com bordas arredondadas
            System.out.println("Retângulo com bordas arredondadas:");
            System.out.println("*************");
            System.out.println("*           *");
            System.out.println("*  " + texto + "  *");
            System.out.println("*           *");
            System.out.println("*************");
        }
    }


}
