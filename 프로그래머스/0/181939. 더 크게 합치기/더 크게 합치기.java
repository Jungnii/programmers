class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String c = Integer.toString(a)+Integer.toString(b);
        String d = Integer.toString(b)+Integer.toString(a);
        
        if(Integer.valueOf(c)>Integer.valueOf(d)){
            return Integer.valueOf(c);
        }
        else{
            return Integer.valueOf(d);
        }
    
            }
}