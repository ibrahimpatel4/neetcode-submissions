class Solution {
    public int[] replaceElements(int[] arr) {

        int biggest = 0;
        int count = 1;

       for(int b = 0; b < arr.length; b++){
         biggest = 0;
            for(int i = count; i < arr.length; i++){
              if(arr[i] > biggest)
              {
                  biggest = arr[i];
              }
         }
         arr[b] = biggest;
         count++;
       }
        System.out.println(biggest);

        arr[arr.length - 1] = -1;
        return arr;
        
    }
}