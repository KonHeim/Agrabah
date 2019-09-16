public class Main {

  public static void main(String[] args) {

    System.out.println(count(23));
    greet("Hello ", "Balint!");
    cheer();
  }

  public static void greet(String firstParam, String secondParam) {
    System.out.println(firstParam + secondParam);
  }

  private static int count(Integer number) {
    return number;
  }

  private static void cheer() {
    System.out.println("Agrabah!");
  }

}
