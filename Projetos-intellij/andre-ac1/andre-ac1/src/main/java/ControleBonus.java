import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<Bonificavel> listaBonusGanhos;

    public ControleBonus() {
        this.listaBonusGanhos = new ArrayList<Bonificavel>();
    }

    public void adicionarValorBonus(Bonificavel bonus){
        listaBonusGanhos.add(bonus);
    }

    public Double calcularTotalBonus(){
        Double totalBonus = 0.0;
        for (Bonificavel bonus : listaBonusGanhos) {
            totalBonus += bonus.getValorBonus();
        }
        return totalBonus;
    }

    public void exibeBonus(){
        System.out.println("\n---------Lista de Bonificação---------");
        for (Bonificavel bonus : listaBonusGanhos) {
            System.out.println(bonus);
            System.out.println("=======================================");
        }
    }
}
