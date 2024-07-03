package question01;

public class Resolution {
    //Crie um código em Java capaz de verificar se os dois últimos caracteres de
    //uma string são iguais aos dois primeiros de outra string.
    public static void main(String[] args) {
        String pg = "programação";
        String ao = "ão";

        boolean eIgual = false;

        String compara = "";

        for (int i = 0; i < pg.toCharArray().length; i++) {
            if (i == pg.toCharArray().length - 1){
                compara = "" + pg.toCharArray()[i-1] + pg.toCharArray()[i];

                if (compara.equalsIgnoreCase(ao)) eIgual = true;
            }
        }

        System.out.println(eIgual);
    }
}
