package loop;

public class WhileEx3 {
    // for 문으로 만들 때
    /*
    public static void main(String[] args) {
        int max=3;
        int sum=0;
        for(int i=1; i<=max; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    */
    // while 문으로 만들 때
    public static void main(String[] args) {
        int i=1;
        int max=3;
        int sum=0;
        while(i<=max){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
