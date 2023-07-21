public class MedicoCirurgiao extends Medico{

    // Atributos
    private Integer qtdCirurgia;

    private Double valorCirurgia;
    private Double valorAplicacaoAnestesia;

    public MedicoCirurgiao(Integer crm, String nome, Integer qtdCirurgia, Double valorCirurgia, Double valorAplicacaoAnestesia) {
        super(crm, nome);
        this.qtdCirurgia = qtdCirurgia;
        this.valorCirurgia = valorCirurgia;
        this.valorAplicacaoAnestesia = valorAplicacaoAnestesia;
    }

    // Método herdado da classe abstrata Medico
    @Override
    public Double getGanho() {
        return (qtdCirurgia * valorCirurgia) + valorAplicacaoAnestesia;
    }

    // Método implementado da interface
    @Override
    public Double getValorBonus() {
        return getGanho() * 1.15;
    }

    // Get & Set
    public Integer getQtdCirurgia() {
        return qtdCirurgia;
    }

    public void setQtdCirurgia(Integer qtdCirurgia) {
        this.qtdCirurgia = qtdCirurgia;
    }

    public Double getValorCirurgia() {
        return valorCirurgia;
    }

    public void setValorCirurgia(Double valorCirurgia) {
        this.valorCirurgia = valorCirurgia;
    }

    public Double getValorAplicacaoAnestesia() {
        return valorAplicacaoAnestesia;
    }

    public void setValorAplicacaoAnestesia(Double valorAplicacaoAnestesia) {
        this.valorAplicacaoAnestesia = valorAplicacaoAnestesia;
    }

    // ToString
    @Override
    public String toString() {
        return  "\nCRM: " + crm +
                "\nNome do Medico Cirurgico: " + nome +
                "\nValor da Cirurgia: R$ " + valorCirurgia +
                "\nQuantidade de Cirurgia: " + qtdCirurgia +
                "\nValor por Aplicação de Anestesia: R$" + valorAplicacaoAnestesia +
                super.toString();
    }
}
