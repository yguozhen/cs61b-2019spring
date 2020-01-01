public class ClassNameHere {
   public static int max(int[] m) {
      int maxNumber = m[0];
      int i = 0;
      while(i < m.length){
         if(maxNumber < m[i]){
            maxNumber = m[i];
         }
         i++;
      }  
       return maxNumber;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};    
      int max2 = max(numbers);
   }
}
