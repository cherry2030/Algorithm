package daily_coding.solution11_20;

public class Solution18 {
    // 방법 1
    public static int numberSearch(String str) {
        double total=0;
        double cnt=0;
        if(str.length()==0){
            return 0;
        }
        str = str.replaceAll(" ", "");
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) <='9' && str.charAt(i)>='1'){ // 숫자인 경우
                total += Character.getNumericValue(str.charAt(i));
                cnt+=1;
            }
        }
        return (int) Math.round(total/(str.length()-cnt));
    }

    public static void main(String[] args) {
        int output = numberSearch("Hello6 ");
        System.out.println(output); // --> 1

        output = numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }
}
