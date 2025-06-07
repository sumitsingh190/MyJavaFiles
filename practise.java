public class practise{
    public static int maxSubarraySum(int[] arr){
        int max=Integer.MIN_VALUE;
        int start=0;
        int ansStart=-1;
        int ansEnd=-1;
        int sum=0;


        for(int i=0;i<arr.length;i++){
            if(sum==0){
                start=i;
            }
            sum=sum+arr[i];

            if(sum>max){
                max=sum;
                ansStart=start;
                ansEnd=i;
            }

            if(sum<0){
                sum=0;
            }}

            for(int i=ansStart;i<=ansEnd;i++){
                System.out.print(arr[i]+" ");

            }
            System.out.println("null");

            if(max<0) max=0;

            return max;
        }
        public static void main(String[] args) {
            int[] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
            System.out.print(maxSubarraySum(arr));
        }
    }
