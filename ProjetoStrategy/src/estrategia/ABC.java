package estrategia;

import modelo.Carga;

/**
 *
 * @author talita.bsouza7
 */
public class ABC implements CalcularFrete{
   @Override
   public double calcularFrete (Carga carga) {
           //REGRA DE NEGÓCIO DESSA EMPRESA
            if (carga.getPeso() <= 10) {
                return 12.56;
            } else if (carga.getPeso() <= 20) {
                return 14.78;
            } else {
                return 17.64;
            }
}
}
