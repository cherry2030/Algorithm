class Solution {
    public int solution(int n, int k) {
        int answer = -1;
        String s = "";
        String real_s = "";
        String[] primes;
        
        // k진수로 변경
        while(n != 0){
            int na = n % k;
            n /= k;
            s += (na + "");
        }
        
        // 뒤집기
        for(int i=s.length() - 1;i >=0;i--){
            real_s += (s.charAt(i) + "");
        }
        
        // System.out.println(real_s);
        
        int cnt = 0;
        
        // 0을 기준으로 자르기
        primes = real_s.split("0");
        
        if(primes.length == 0){
            if(check(real_s)){
                cnt = 1;
            }
            else{
                cnt = 0;
            }
        }
        else{
            // prime인지 체크하기
            for(String ss: primes){
                //System.out.println(ss);
                if(check(ss)){
                    System.out.println(ss);
                    cnt++;
                }
            }
        }
        
        
        return cnt;
    }
    
    public boolean check(String prime){
        if(prime.equals("")){
            return false;
        }
        long a = Long.parseLong(prime);
        if(a == 1){
            return false;
        }
        if(a == 2){
            return true;
        }
        if(a%2 == 0){
            return false;
        }
        
        for(int i=3;i<= Math.sqrt(a);i+=2){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
}