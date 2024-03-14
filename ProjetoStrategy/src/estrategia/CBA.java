package estrategia;

import modelo.Carga;

/**
 *
 * @author talita.bsouza7
 */
public class CBA implements CalcularFrete{
    public double calcularFrete (Carga carga) {
     //REGRA DE NEGÓCIO DESSA EMPRESA
            if (carga.getPeso() <= 10) {
                return 10.12;
            } else if (carga.getPeso() <= 20) {
                return 12.34;
            } else {
                return 15.09;
            }
        }
}
