//Binary search

class BinarySearchJava{
    
    boolean binary(int arr[],int target){
        int start =-1, end=arr.length;
        while (start+1 < end){
            distance_between = end-start;
            mid = distance_between /(int)2;
            mid_updated = mid+start;
            if(nums[mid_updated]==target){
                return true;
            } 
            if(nums[mid_updated]<target){
                start=mid_updated;
            }
            else{
                end=mid_updated;
            }
        } 
        return false;
    }
    
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7};
        BinarySearchJava bsj =new BinarySearchJava();
        boolean result = bsj.binary(arr,4);
        if(result){ System.out.println("Found"); }
        else{ System.out.println("Not Found");}
    }
}