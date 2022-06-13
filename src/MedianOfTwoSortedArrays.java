public class MedianOfTwoSortedArrays {


    public static void main (String[] args) throws java.lang.Exception
    {
          System.out.println("Hwyya");
          int[] question = new int[]{1,3};
          int[] nums2 = new int[]{2,7};
          MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
          System.out.print(medianOfTwoSortedArrays.findMedianSortedArrays(question, nums2));


    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int l = 0, r =0;
        double medianFront = 0, medianBack = 0;

        int n = nums1.length + nums2.length;
        
        int counter = (n/2) + 1;
        
        while(counter > 0 && l < nums1.length && r < nums2.length){

            if(nums1[l] < nums2[r]){
                counter--;
                medianBack = medianFront;
                medianFront = nums1[l];
                l++;

            }
            else {
                counter--;
                medianBack = medianFront;
                medianFront = nums2[r];
                r++;

            }

        }

        if(counter >= 1){
            if(r == nums2.length ){
                while(counter > 0){
                counter--;
                medianBack = medianFront;
                medianFront = nums1[l];
                l++;
                }
            }
            else{
                while(counter > 0){
                    counter--;
                    medianBack = medianFront;
                    medianFront = nums2[r];
                    r++;
                    }

            }
        }




        
        if(n%2 == 0){
            return (medianFront + medianBack)/2;
        }
        return medianFront;
    }
    
}
