public class Main {

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void print(int[] arr){
        for(int x : arr) System.out.print(x+" ");
    }
    public static void main(String[] args) {

        int[] arr = {12,45,3,64,34,9};

        bubbleSort(arr);
        print(arr);
    }
}