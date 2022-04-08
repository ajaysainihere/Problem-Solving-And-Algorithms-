public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {2,5,7,9,11,13,15};
        int counter = 70;

        int result = search(arr, counter);
        if(result == -1){
            System.out.println("Key Not Found!!");
        }
        else{
            System.out.println("Key Found!!");
        }
    }
    
    public static int search(int[] arr, int counter){

        for(int i=0; i<arr.length;i++){
            if(arr[i]==counter){
                return i;
            }
        }
        return -1;

    }
}

//*********************
//Result = Key Not Found!!