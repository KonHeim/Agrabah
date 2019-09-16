public class Main {

  public static void main(String[] args) {

    greet("Hello ", "Balint!");
    cheer();

  }

  public static void greet(String firstParam, String secondParam) {
    System.out.println(firstParam + secondParam);
  }

  private static void cheer() {
    System.out.println("Agrabah!");
  }
}
