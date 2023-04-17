package daily_coding.Coplit.solution11_20;

public class Solution18 {
    // 방법 1
    public static int numberSearch(String str) {
        double total=0;
        double cnt=0;
        if(str.length()==0){
            return 0;
        }
        str = str.replaceAll(" ", "");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) <='9' && str.charAt(i)>='1'){ // 숫자인 경우
                total += Character.getNumericValue(str.charAt(i));
                cnt+=1;
            }
        }
        return (int) Math.round(total/(str.length()-cnt));
    }

    // 방법 2
    public static int numberSearch2(String str) {
        String num = "0123456789";
        double total=0;
        int cnt=0;
        if(str.length()==0) return 0;

        for(int i=0;i<str.length();i++){
            if(num.indexOf(str.charAt(i)) != -1){ // 숫자인 경우
                total += Character.getNumericValue(str.charAt(i));
            } else if (str.charAt(i) != ' ') {// 숫자, 공백을 제외한 길이 세기
                cnt += 1;
            }
        }

        return (int) Math.round((total/cnt));
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
