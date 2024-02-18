class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String c = Integer.toString(a)+Integer.toString(b);
        int d = 2*Integer.valueOf(a)*Integer.valueOf(b);
        
        if(Integer.valueOf(c)>d){
            return Integer.valueOf(c);
        }else{
            return Integer.valueOf(d);
        }
        
    }
}