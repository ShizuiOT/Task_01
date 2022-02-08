package task_1;

import java.util.Scanner;

public class Vozv {
    public Vozv() {

    }
    void summ(){
        int n;
        long otv =0;
        Scanner in = new Scanner(System.in);
        System.out.print("input a number: ");
        n=in.nextInt();
        while(n>0){
            otv+=n%10;
            n/=10;
        }
        System.out.println(otv);
    }

}
