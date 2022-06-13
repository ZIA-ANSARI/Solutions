import java.util.Arrays;

public class MaximumEarningsFromTaxi {

    public static void main (String[] args) throws java.lang.Exception
    {
          System.out.println("Hwyya");
          int[][] rides = new int[][]{{1,6,1},{3,10,2},{10,12,3},{11,12,2},{12,15,2},{13,18,1}};
          //20
//[[1,6,1],[3,10,2],[10,12,3],[11,12,2],[12,15,2],[13,18,1]]
          int[] nums2 = new int[]{2,7};
          MaximumEarningsFromTaxi maximumEarn = new MaximumEarningsFromTaxi();
          long answer = maximumEarn.maxTaxiEarnings(20, rides);
          System.out.println(answer);
    }

    public long maxTaxiEarnings(int n, int[][] rides) {

        if(n==1){
            return  rides[0][1] - rides[0][0] + rides[0][2];
        }
        int end = 0;
        long curr = 0;
        long ans = 0;
        int idx2 = 0; 
        int k =0;

        boolean notFound = false;
         
        Arrays.sort(rides, (a,b) -> Integer.compare(a[0], b[0]));

        for(int idx = 0; idx < rides.length; idx++){
            curr = rides[idx][1] - rides[idx][0] +rides[idx][2];

            end = rides[idx][1];
            idx2 = idx;
            while(end != n || notFound){
                idx2 = findClosestStart(rides, idx2,end);
                curr = curr + rides[idx2][1] - rides[idx2][0] +rides[idx2][2];
                end = rides[idx2][1];

            }
            ans = Math.max(ans, curr);
        }



        return ans;
        
    }

    private int findClosestStart(int[][] rides, int idx, int end) {
        int mid = -1;
        int l = idx;
        int h = rides.length;

        while(l < h && mid > 0){
            mid = (h-l)/2;
            if(end == rides[mid][0]){
                return mid;
            }
            else if(end > rides[mid][0]){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }

        return l;
    }

    
}
