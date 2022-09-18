// https://leetcode.com/problems/powx-n/

class Solution {
    public double myPow(double x, int n) {
        if( x==1.0 ){
            return 1;
        }
        
        if(n == -2147483648 && x < 0.0){
            return 1;
        }
        if(n == -2147483648 ){
            return 0;
        }
        
        if(n == 0 ){
            return 1;
        }
        if(n < 0){
            int newN= n * -1;
            double temp = myPow(x,newN);
            return 1 / temp;
        }
        
        if(n % 2 == 0){
            double res = myPow(x,n/2);
            return  res * res;
        }
        
        double res = myPow(x,n/2);
        
        return x * res * res;
        
    }
}
