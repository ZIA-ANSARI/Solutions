import java.util.Arrays;

public class FillInTruck {

    public static void main (String[] args) throws java.lang.Exception
    {
          System.out.println("Hwyya");
          int[][] question = new int[][]{{3,1},{2,2},{1, 3}};
          FillInTruck fillInTruck = new FillInTruck();
          int ans = fillInTruck.maximumUnits(question, 4);
          System.out.println(ans);
    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (b,a) -> Integer.compare(a[1], b[1]));
        System.out.println(boxTypes[0][1]);
        int capacity = 0;
        int res = 0;
        int index = 0;
        int temp = 0;
        while(truckSize>0 && index < boxTypes.length){
            if( boxTypes[index][0] <= truckSize){
                System.out.println(boxTypes[index][0]);
            temp = boxTypes[index][0] * boxTypes[index][1]  ;
            res = res + temp;
            System.out.println(truckSize + ":truckSize before");
            System.out.println(res + ":res");
            truckSize = truckSize - boxTypes[index][0];
            index++;
            System.out.println(truckSize + ":truckSize after");
            }else{
                System.out.println( "in else");
                temp = truckSize * boxTypes[index][1];
                res = res + temp;
                truckSize = 0;
                return res;
            }

        }
        return res;
    }
}
