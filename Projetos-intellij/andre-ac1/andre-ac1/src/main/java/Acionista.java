public class Acionista implements Bonificavel{

    // Atributos
    private String nome;
    private Integer qtdAcoes;
    private Double precoAcao;

    // Construtor
    public Acionista(String nome, Integer qtdAcoes, Double precoAcao) {
        this.nome = nome;
        this.qtdAcoes = qtdAcoes;
        this.precoAcao = precoAcao;
    }

    // Método implementado da interface
    @Override
    public Double getValorBonus() {
        return (qtdAcoes * precoAcao ) * 0.25;
    }

    // Get & Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdAcoes() {
        return qtdAcoes;
    }

    public void setQtdAcoes(Integer qtdAcoes) {
        this.qtdAcoes = qtdAcoes;
    }

    public Double getPrecoAcao() {
        return precoAcao;
    }

    public void setPrecoAcao(Double precoAcao) {
        this.precoAcao = precoAcao;
    }

    // ToString

    @Override
    public String toString() {
        return "Acionista" +
                "\nNome do Acionista: " + nome +
                "\nQuantidade de Ações: " + qtdAcoes +
                "\nPreço da Ação; R$" + precoAcao +
                "\nBonificação: " + getValorBonus();
    }
}
