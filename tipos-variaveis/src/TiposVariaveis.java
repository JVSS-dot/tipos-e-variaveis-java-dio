public class TiposVariaveis {

  public static void main(String[] args) throws Exception {
    String primeiroNome = "Jorge ";
    String segundoNome = "Vasconcelo";
    String resultado = primeiroNome == segundoNome ? "verdadeiro" : "falso";
    System.out.println("O nome é: " + resultado);


    boolean a = true;
    boolean b = false;

    if (a || b) {
        System.out.println("Uma das condições é verdadeira");
    }
    if (b && (7 > 2)) {
        System.out.println("condição de teste");
    }

  }
}
