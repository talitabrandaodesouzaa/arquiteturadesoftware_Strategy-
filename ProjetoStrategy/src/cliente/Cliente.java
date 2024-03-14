//package cliente;
//
//import modelo.Carga;
//import estrategia.*;
//
////esconder a regra de negocios e o if e else
//
//
///**
// *
// * @author talita.bsouza7
// */
//public class Cliente {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        
//        try {
//            Carga carga = new Carga(12, "Livros de design pattern");
//
//        double frete;
//        int opc = 0;
//        frete = ListaEmpresas.values()[opc].calcularFrete(carga);
////         frete=   ListaEmpresas.CBA.calcularFrete(carga);
////         frete=   ListaEmpresas.XPTO.calcularFrete(carga);
//        System.out.println(frete);
//        }         catch (ArrayIndexOutOfBoundsException e) {
//
//        Carga carga = new Carga(12, "Livros de design pattern");
//
//        double frete;
//        int opc = 22;
//        frete = ListaEmpresas.values()[opc].calcularFrete(carga);
////         frete=   ListaEmpresas.CBA.calcularFrete(carga);
////         frete=   ListaEmpresas.XPTO.calcularFrete(carga);
//        System.out.println(frete);
//
//    }
//
////    public static double calcularFrete(String nomeEmpresa, Carga carga) {
////
////        CalcularFrete empresa;
////
////        if (nomeEmpresa.equals("ABC")) {
////            empresa = new ABC();
////        } else if (nomeEmpresa.equals("CBA")) {
////            empresa = new CBA();
////        } else if (nomeEmpresa.equals("XPTO")) {
////            empresa = new XPTO();
////        } else {
////            throw new IllegalArgumentException("Empresa inválida!");
////        }
////        return empresa.calcularFrete(carga);
////    }
//}
package cliente;

import modelo.Carga;
import estrategia.*;
import java.util.Scanner;


public class Cliente {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Digite a opção desejada:");
        int = opcao;
        
                
        try {
            Carga carga = new Carga(12, "Livros de design pattern");

            double frete;
            int opc = 22;
            frete = ListaEmpresas.values()[opc].calcularFrete(carga);
            System.out.println(frete);
        } catch (ArrayIndexOutOfBoundsException e) {
            Carga carga = new Carga(12, "Livros de design pattern");

            double frete;
            int opc = 22;
            frete = ListaEmpresas.values()[opc].calcularFrete(carga);
            System.out.println(frete);
        }
    }

    public Cliente() {
    }
}
