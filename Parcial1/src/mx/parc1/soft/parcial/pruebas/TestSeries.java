package mx.parc1.soft.parcial.pruebas;
import mx.parc1.soft.parcial.series.*;
public class TestSeries {

    public static void main(String[] args) {

        Serie s = new Serie(18);

        int m = s.genNumero(100);
        System.out.println(s.primos(m));
        

        //int o = s.primoN(m/10);

        //System.out.println(o);

        //int n = s.genNumero(100);

        //s.fibo(n);

        //int p = s.fiboN(3, 11);

        //System.out.println(p);

    }

}