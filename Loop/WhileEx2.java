package loop;

public class WhileEx2 {
    // while 문으로 작성할 때
    /*
    public static void main(String[] args) {
        int i=2;
        while(i<21) {
            if(i%2==0){
                System.out.println(i);
                i++;
            }
            else {
                i++;
            }
        }
    }
    */

    // for문으로 작성할 때
    public static void main(String[] args) {
        for(int i=2; i<21; i+=2){
            System.out.println(i);
        }
    }
}
