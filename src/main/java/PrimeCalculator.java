class PrimeCalculator {

    int nth(int nth) {
        if(nth<1)
            throw new IllegalArgumentException();
            int n = nth;
        int count =0 ;
        boolean flag = true;
        int i = 2;
        while(flag){
            if(isPrime(i)){
                count++;
                if(count == n)
                    break;
            }
            i++;
        }
        return i;
    }
   boolean isPrime(int n){
       if(n == 3 | n==2)
           return true;
       else if(n%2 == 0)
           return false;
       else{
       for(int i = 3 ; i <= Math.sqrt(n) ; i+=2){
           if(n % i == 0)
               return false;
       }
        }
    return true;
   }
}
