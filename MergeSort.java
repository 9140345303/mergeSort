package sorting;



class MergeSort {
    public static void main(String[] args) {
        int arr[] = {2,1,4,5,-5,0};

        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
   public static void mergeSort(int arr[], int start, int end){
        if(start<end){//find mid
            int mid  = start+ (end-start)/2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);

            merge(arr, start, mid, end);

        }
    }

    public static void merge(int arr[], int start, int mid, int end){
        //new array= crr
        int crr[] = new int[end-start+1];

        int i=start;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                crr[k++] = arr[i++];
            } else{
                crr[k++] = arr[j++];
            }
        }
        while(i<=mid){
            crr[k++] = arr[i++];

        }
        while(j<=end){
            crr[k++] = arr[j++];
        }

        int y= start;
        for(int z=0;z<crr.length; z++){
            arr[y++] = crr[z];
        }
    }
}
