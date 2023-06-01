import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMin {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(10,
                100,
                300,
                200,
                1000,
                20,
                30);

        System.out.println(maxMin(3,list));
    }

    public static int maxMin(int k, List<Integer> arr) {
        // Write your code here

        if(k > arr.size()){
            return -1;
        }

        Collections.sort(arr);

        List<Integer> subList = arr.subList(0,k);
        int tmpDiff= Collections.max(subList) - Collections.min(subList);

        for(int i = 1; i <= arr.size() - k; i++){

            int tmpDiff2 = arr.get(i + (k - 1)) - arr.get(i);

            if(tmpDiff == 0){
                return 0;
            }

            if(tmpDiff > tmpDiff2){
                tmpDiff = tmpDiff2;
            }

        }



        return tmpDiff;
    }
}