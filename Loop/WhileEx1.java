package loop;

public class WhileEx1 {
    // for문으로 만드는 방법
    /*
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }*/

    // while문으로 만드는 방법
    public static void main(String[] args) {
        int i=1;
        while(i<11) {
            System.out.println(i);
            i++;
        }
    }
}
