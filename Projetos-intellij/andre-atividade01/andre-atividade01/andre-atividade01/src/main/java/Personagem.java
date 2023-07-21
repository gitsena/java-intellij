public class Personagem {
    private int id;
    private String tipo;
    private String codNome;
    private Double ataque;
    private Double defesa;
    private Integer nivelPoder;

    public Personagem(int id, String tipo, String codNome, Double ataque, Double defesa, Integer nivelPoder) {
        this.id = id;
        this.tipo = tipo;
        this.codNome = codNome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.nivelPoder = nivelPoder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getCodNome() {
        return codNome;
    }

    public void setCodNome(String codNome) {
        this.codNome = codNome;
    }
    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }
    public Double getDefesa() {
        return defesa;
    }

    public void setDefesa(Double defesa) {
        this.defesa = defesa;
    }
    public Integer getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(Integer nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "\nNº Personagem: " + id +
                "\nTipo: " + tipo +
                "\nCodinome: " + codNome +
                "\nAtaque: " + ataque +
                "\nDefesa: " + defesa +
                "\nNivel de Poder: " + nivelPoder;
    }
}
