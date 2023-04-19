package daily_coding;

public class Main {
    public static void main(String args[]){
        int n = 10;
        System.out.println(new String(new char [n/2+1]).replace("\0", "수박").substring(0,n));
    }
}
