import java.util.*;
public class OddvsEve{
  public static void main(String [] Args){
    Scanner sc= new Scanner(System.in);
    long t = sc.nextLong();
    while(t-->0){
      long N = sc.nextLong();
      
      if((N%2)!=0){
        System.out.println("Odd");
      }else if(N%4==0){
        System.out.println("Even");
      }else{
        System.out.println("Same");
      }
    }
  }
}