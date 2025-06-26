class letter{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(countInversion(str));

    }public static int countInversion(String str){
        int n = str.length();
        int upper []  = new int [n];
        int lower [] = new int [n];
        for(int i = 0 ; i< n ; i++){
            char ch = str.charAt(i);
            if(ch.isLowerCase()){
                lower[i+1] =lower[i]+1;
            }else{
                lower[i+1] = lower[i];
            }
        }

        for(int i = n-1 ; i >=0 ; i--){
            if(ch.isUpperCase()){
                upper[i-1] = upper[i]+1;
            }else{
                upper[i-1] = upper[i];
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i =0; i <= n ; i++){
            min = Math.min((lower[i] + upper[i]), min)
        }
        retur min;
    }
}