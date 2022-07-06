import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write an integer.");
        int b = input.nextInt();
        if(b>0){
            for(int a=0; a<=b;a++){
                if (a%3==0&&a%4==0){
                    System.out.println(a);
                }
            }

        }
    }
}

