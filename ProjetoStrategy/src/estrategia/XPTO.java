package estrategia;

import modelo.Carga;

/**
 *
 * @author talita.bsouza7
 */
public class XPTO implements CalcularFrete{
    public double calcularFrete (Carga carga) {
   //REGRA DE NEGÓCIO DESSA EMPRESA
           if (carga.getPeso() <= 10) {
            return 14.77;
        } else if (carga.getPeso() <= 20) {
            return 16.82;
        } else {
            return 18.13;
        }
        } 
}

