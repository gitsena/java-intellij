public class MedicoClinico extends Medico {

    // Atributos
    private Integer qtdConsulta;
    private  Double valorConsulta;

    // Construtor recebe os atributos da super calsse
    public MedicoClinico(Integer crm, String nome, Integer qtdConsulta, Double valorConsulta) {
        super(crm, nome);
        this.qtdConsulta = qtdConsulta;
        this.valorConsulta = valorConsulta;
    }

    // Método herdado da classe abstrata Medico
    @Override
    public Double getGanho() {
        return qtdConsulta * valorConsulta;
    }

    // Método implementado da interface
    @Override
    public Double getValorBonus() {
        return getGanho() * 1.10;
    }


    // Get & Set
    public Integer getQtdConsulta() {
        return qtdConsulta;
    }

    public void setQtdConsulta(Integer qtdConsulta) {
        this.qtdConsulta = qtdConsulta;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    // ToString

    @Override
    public String toString() {
        return  "\nCRM: " + crm +
                "\nNome do Medico Clinico: " + nome +
                "\nQuantidade de Consuta: " + qtdConsulta +
                "\nValor por Consulta: " + valorConsulta +
                super.toString();
    }
}
