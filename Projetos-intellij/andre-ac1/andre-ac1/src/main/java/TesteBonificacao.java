public class TesteBonificacao {
    public static void main(String[] args) {

        // Criando objeto Medico Cirurgico
        MedicoCirurgiao mCirurgico1 = new MedicoCirurgiao (123, "André", 2,500.0,100.0);
        MedicoCirurgiao mCirurgico2 = new MedicoCirurgiao (456, "Rafael", 5,300.0, 100.0);

        // Criando objeto Medico Clinico
        MedicoClinico mclinico1 = new MedicoClinico(765,"Fernanda", 10, 200.0);
        MedicoClinico mclinico2 = new MedicoClinico(654,"Vivian", 7, 600.0);

        // Criando objeto Acionista
        Acionista a1 = new Acionista("Ronaldo", 2, 1000.0);
        Acionista a2 = new Acionista("Flavio", 10, 1200.0);

        // Criando objeto ControleBonus
        ControleBonus bonus = new ControleBonus();

        // Adiccionar cada obejto na lista
        bonus.adicionarValorBonus(mCirurgico1);
        bonus.adicionarValorBonus(mCirurgico2);

        bonus.adicionarValorBonus(mclinico1);
        bonus.adicionarValorBonus(mclinico2);

        bonus.adicionarValorBonus(a1);
        bonus.adicionarValorBonus(a2);

        // Exibir todos os bonus
        bonus.exibeBonus();

        // Exibir o valor total de bonus ganhos
        System.out.printf("Total de bonos ganhos: RS %.2f\n",
                bonus.calcularTotalBonus());
    }
}
