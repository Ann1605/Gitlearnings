import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
        System.out.println("Your Entered Number is:"+ num);
        int n = num;
        System.out.println("Hellllooooo" + "Hi,This is sow");
        System.out.println(n);
        System.out.println("This is mangai");
        System.out.println("This is sowmi");
        int res =0;
        while(n!=0){
            int rem = n%10;
            res += Math.pow(rem,3);
            n = n/10;
        }
        if(res == num)
            System.out.println("The given number is armstrong number" + res + "This is edited by Rio");
        else
            System.out.println("The given number is not armstrong number"+ res+"Edited by mangai");
    }

}
