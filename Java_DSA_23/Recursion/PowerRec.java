package ADVANCED;

public class PowerRec {
    static int findPower(int base, int exp){
        if(exp==1){
            return base;
        }
        else{
            return base*findPower(base, exp-1);
        }
    }
    public static void main(String[] args) {
        int res = findPower(2,4);
        System.out.println(res);
    }
    
}
