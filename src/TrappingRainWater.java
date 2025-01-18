public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[]={6,9,6};
        System.out.println(trappingWater(arr));  // Output: 10  (6+4)
    }
    public static int trappingWater(int arr[]) {
        // code here
        int sum=0;
        int wall=arr[0] > arr[arr.length - 1] ? arr[arr.length - 1] : arr[0];
        for(int i=1;i< arr.length-1;i++){

        int value=wall-arr[i];
        sum=sum+value;
}
        if(sum<0) {
            sum = 0;
        }

        return sum;
    }
}
