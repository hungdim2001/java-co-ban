public class Array {

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5 };
    int[] b = new int[10];
    System.out.println("mang a:");
    for (int i = 0; i < 5; i++) {
      System.out.println(a[i]);
    }
    System.out.println("mang b:");
    for (int i = 0; i < 9; i++) {
      b[i] = i++;
      System.out.println(b[i]);
    }
  }
}
