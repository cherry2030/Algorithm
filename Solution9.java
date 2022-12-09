package daily_coding;

public class Solution9 {
    public static boolean ABCheck(String str) {
        // TODO:
        char[] charArray = str.toCharArray();

        for(int i=0;i<charArray.length-4;i++){
            if(charArray[i]== 'a' || charArray[i]== 'A'){
                System.out.println("a,A 등장"+ i);
                if(charArray[i+4] == 'B' || charArray[i+4] == 'b'){
                    System.out.println("b,B 등장"+ i+5);
                    return true;
                }
            }
            if(charArray[i]== 'B' || charArray[i]== 'b'){
                System.out.println("b,B 등장"+ i);
                if(charArray[i+4] == 'A' || charArray[i+4] == 'a'){
                    System.out.println("a,A 등장"+ (i+5));
                    return true;
                }
            }
        }
        return false;



    }
    public static void main(String[] args) {
        boolean output = ABCheck("TgDrnjAz6kAbdEaxFkrKIsa");
        System.out.println(output); // --> true
    }
}
