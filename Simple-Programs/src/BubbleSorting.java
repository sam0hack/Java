public class BubbleSorting{  
    
  
    
    public static void main(String[] args) {  
        
        // Array that has to sort
      int arr[] ={3,60,35,2,45,320,5};
        
      // Sorting length of arr[] in int n            
      int n = arr.length;  
        
       // Initialize temp that help us for swaping values 
        int temp = 0;  
        
        // For loop that Iterating the array
         for(int i=0; i < n; i++){  
             // For loop check for swaping
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         } 
                         } 
   
        }  
         // Printing sorted array   
        for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + " ");  
    } 

    
}
}  
