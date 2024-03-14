package modelo;

/**
 *
 * @author talita.bsouza7
 */
public class Carga {
    private double peso;
    private String descricao;

    public Carga() {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Carga(double peso, String decricao) {
        this.peso = peso;
        this.descricao = decricao;
    }

    public String getDecricao() {
        return descricao;
    }

        
    public void setDecricao(String decricao) {
        this.descricao = decricao;
    }
        @Override
    public String toString () {
    return "Carga{" +"peso"+peso+", descrição"+descricao+']';
    }
    
}
