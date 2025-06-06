public class DisLikeofThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int K = sc.nextInt();
            // checking for 2 digit last numbers
            for(int i =1 ; i++){
                if(i%3==0 || i%10==3){
                    continue;
                }if(--K==0){
                    System.out.println(i);
                    break;;
                }
            }
        }
    }
}
