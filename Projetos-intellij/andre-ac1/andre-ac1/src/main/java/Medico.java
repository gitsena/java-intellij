public abstract class Medico implements Bonificavel{

    // Atributo
    protected Integer crm;
    protected String nome;

    // Construtor
    public Medico(Integer crm, String nome) {
        this.crm = crm;
        this.nome = nome;
    }

    // Método getGanho
    public abstract Double getGanho();

    // Get & Set


    public Integer getCrm() {
        return crm;
    }

    public void setCrm(Integer crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // ToString

    @Override
    public String toString() {
        return "\nValor da Bonificação: " + getValorBonus();

    }
}
