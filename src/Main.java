public class Main {

  public static void main(String[] args) {

    String name = "szabi";
    String name2 = "szabiszabiszabi";

    greet(name, name2);

    System.out.println("Hello World!");
    System.out.println("nem értjük mi a baj");

    System.out.println("Hello World!");

    int age = 43;

    System.out.println(age);
  }

  private static void greet(String name, String name2) {
    System.out.println("Hello " + name + name2);
  }

}
