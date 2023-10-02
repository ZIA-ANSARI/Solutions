package BinarySearch;

public class KokoEatingBananas {
    
    public static void main(String[] args) {

        //System.out.println(7/3);
        KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();
        int[] piles = new int[]{805306368,805306368,805306368};
        kokoEatingBananas.minEatingSpeed(piles,1000000000);
        
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(Integer p : piles)
            max = Math.max(max, p);
        System.out.println(max + ": max");
        Integer l = 1;
        Integer r = max;
        Integer mid = 0;
        Integer res = r;

        while(l <=r){ 
            mid = l + (r-l)/2;
            long k =checkOk(piles, h, mid);
            //System.out.println(mid + ": mid");
            if(k <= h){
                res  = Math.min(res, mid);
                r = mid-1;
            }else {
                l = mid+1;}
        }
        System.out.println("outside");
        System.out.println(res+ ": res");
        return res; 
    }

    public long checkOk(int[] piles, int h, int input){
        long sum = 0;
        for(Integer p : piles){
            if(p%input > 0)
                sum+= p/input +1;
            else
                sum+= p/input;

           
           System.out.println( p + "/" + input + " = " + sum);
        }
        System.out.println(sum + ": sum " + input + " : mid" );
        return sum;
    }
}
/*
312884470 - pile
312884469 - h
 */