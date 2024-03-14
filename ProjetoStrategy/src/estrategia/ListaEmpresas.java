package estrategia;
//ENUM = lista de constantes  >> recurso avançado, ele já é o padrão estratategy

import modelo.Carga;

/**
 *
 * @author talita.bsouza7
 */
public enum ListaEmpresas implements CalcularFrete {
    //Classes internas >> delimita as classes
    ABC {
        @Override
        public double calcularFrete(Carga carga) {
            //REGRA DE NEGÓCIO DESSA EMPRESA
            if (carga.getPeso() <= 10) {
                return 12.56;
            } else if (carga.getPeso() <= 20) {
                return 14.78;
            } else {
                return 17.64;
            }

        }

    },
    CBA {
        @Override
        public double calcularFrete(Carga carga) {
            if (carga.getPeso() <= 10) {
                return 10.12;
            } else if (carga.getPeso() <= 20) {
                return 12.34;
            } else {
                return 15.09;
            }

        }

    },
    XPTO {
        @Override
        public double calcularFrete(Carga carga) {
            if (carga.getPeso() <= 10) {
                return 14.77;
            } else if (carga.getPeso() <= 20) {
                return 16.82;
            } else {
                return 18.13;
            }
        }

    };
}
