package question01;

public class Resolution {
    //Crie um código em Java capaz de verificar se os dois últimos caracteres de
    //uma string são iguais aos dois primeiros de outra string.
    public static void main(String[] args) {
        String pg = "programação";
        String ao = "ão";

        String um = pg.substring(pg.length()-2);

        System.out.println(um.equalsIgnoreCase(ao));
    }
}
