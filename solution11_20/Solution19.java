package daily_coding.solution11_20;

public class Solution19 {
    // 방법 1
    public static String decryptCaesarCipher(String str, int secret) {
        String result="";
        if(str.length()==0) return result;

        // 복호화 - secret 만큼 앞당져줘야 한다.
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                result+= " ";
                continue;
            }
            char c = (char) (str.charAt(i) - secret);
            if(c < 'a'){ // z로 순환
                c = (char)('z' - (secret -1 - (str.charAt(i)-'a')));
            }
            result+= c;
        }
        return result;
    }
    public static void main(String[] args) {
        // a b c d e f g h i j k l m n o p q r s t u v w x y z
        String output = decryptCaesarCipher("khoor", 3);
        System.out.println(output); // --> hello

        output = decryptCaesarCipher("zruog", 3);
        System.out.println(output); // --> world

        output = decryptCaesarCipher("nzop delepd dfaazced jzf", 11);
        System.out.println(output);

    }

}
