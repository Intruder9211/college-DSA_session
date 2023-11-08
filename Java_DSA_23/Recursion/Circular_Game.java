package ADVANCED;

import java.util.Scanner;

//josephus problem or circular game



public class Circular_Game {
    static int solve(int n, int k){
        if(n==1){
            return 0;
        }
        return(solve(n-1,k)+k)%n;

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter all participants");

            int n=sc.nextInt();
            System.out.println("enter the killing position");
            int k= sc.nextInt();
            int ans = solve(n,k)+1;
            System.out.print("the winner is--> ");
            System.out.println(ans);
        }
    }
    
}
