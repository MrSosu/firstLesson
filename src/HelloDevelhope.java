public class HelloDevelhope {

    /* metodo = funzione definita all'interno di una classe.
    un metodo in Java si definisce  nel seguente modo:

    modificatori_visibilita   altri_modificatori  tipo_ritorno  nomeMetodo(par1,...,parN)

     */
    public static void main(String[] args) {
        System.out.println("Benvenuti al corso Java!");

        int x = 5;
        int y = 5;
        System.out.println(x);

        int[] array = { 1, 2, 3 };
        System.out.println(array);

        int[] array2 = { 1, 2, 3 };
        System.out.println(array2);

        System.out.println(x == y);
        System.out.println(array == array2);

    }

}
