





public class Solution
{
    // Codifica el método operacion que falta en el siguiente programa.
    //
    //  1
    //  2
    //
    //  3
    //
    //  4
    //
    //  5
    //
    //  6
    //
    //  7
    //
    //  8
    //
    //public class UnMetodo {
    //    public static void main(String args[]) {
    //
    //       double x =7, y = 9, resultado = 0;
    //
    //       for (int i=1; i<5; i++){
    //
    //          operacion (x,y,i);
    //
    //       }
    //
    //    }
    //
    //}
    //
    //Este método tiene tres parámetros:
    //
    //x: primer operando, de tipo double y valor hardcodeado de 7.
    //y: segundo operando, de tipo double y valor hardcodeado de 9.
    //i: indicador de la operación a realizar con los dos parámetros anteriores. Tenemos cuatro posibilidades:
    //La suma: valor 1.
    //La resta: valor 2.
    //La multiplicación: valor 3.
    //La división: valor 4.
    //El método ejecuta la operación indicada y presenta el resultado por pantalla,
    // mostrando el valor de los dos operandos, la operación realizada y el resultado.
    //
    //El método hay que desarrollarlo usando la sentencia de control switch.




    public class UnMetodo {
        public static void main(String args[]) {

            double x =7, y = 9, resultado = 0;

            for (int i=1; i<5; i++){

                operacion (x,y,i);

            }

        }

        static void operacion (double x, double y, int ope){

            switch (ope){

                case 1:

                    System.out.println("La suma de "+ x + "y"  + y + "es igual a" + (x+y) );

                    break;

                case 2:

                    System.out.println("La resta de" + x +  "y"  + y +  "es igual a" + (x-y));

                    break;

                case 3:

                    System.out.println("La multiplicación de" + x +  "y" + y + "es igual a" + (x*y));

                    break;

                case 4:

                    System.out.println("La división de" + x +  "entre" + y +  "es igual a" + (x/y));

                    break;

            }

        }

    }
}
