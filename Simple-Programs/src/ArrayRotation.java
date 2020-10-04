class ArrayRotation {    
 public static void main(String[] args) {   

      
        // n determine the number of times an array should be rotated.    
        int n = 6;  

        //initializing array
        int [] arr = {5,8,9,6,2,3,10};     
        


        //Rotate the given array by n times    
        for(int i = 0; i < n; i++){    
            int j, temp;    
            //Stores the last element of array in temp   
            temp = arr[arr.length-1];    

            for(j = arr.length-1; j > 0; j--){    
                //Shifting element of the array by one position   
                arr[j] = arr[j-1];    
            }    
            //storing temp in last of array 
            arr[0] = temp;    
        }    

        System.out.println();    

        //Displays array after rotation      
        for(int e: arr){    
            System.out.print(e);    
        }    
    }    
}  
