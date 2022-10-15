class closestEnemy{
    
    public static int ArrayChallenge(int[] arr){
        
        int indexOfOne = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 1) indexOfOne = i ;
        }
        
        int result = Integer.MAX_VALUE;
        int diff = 0;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 2){
                diff = Math.abs(i - indexOfOne);
                result = Math.min(result , diff);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int arr0[] = {0,1,0,0,0,0,2,2,2,2};
        int arr1[] = {0,0,0,2,0,1,2,0,0,2};
        int arr2[] = {2,0,0,0,2,0,1,0,0,2};
        int arr3[] = {2,0,0,0,0,0,0,0,0,1};
        System.out.println(ArrayChallenge(arr0));
        System.out.println(ArrayChallenge(arr1));
        System.out.println(ArrayChallenge(arr2));
        System.out.println(ArrayChallenge(arr3));
    }
}