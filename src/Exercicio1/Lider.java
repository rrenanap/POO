package Exercicio1;

class Lider extends Funcionario {
    private static final float BONUS_LIDER = 0.02f;

    public Lider(String nome, float valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    @Override
    public float calcularSalario() {
        float salarioBase = super.calcularSalario();
        return salarioBase + (salarioBase * BONUS_LIDER);
    }
}