public class MyClass {
    public static void main(String args[]) {
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = 0;
        }
        
        for(int i = 0; i < array.length; i++){
            int insert = (int)(Math.random()*10)+1;
            while(inArray(array, insert)){
                insert = (int)(Math.random()*10)+1;
            }
            array[i] = insert;
        }
        System.out.print("Input array: ");
        printArray(array);
        int count = 0;
        while(!isSorted(array)){
            for(int i = 0; i < array.length-1; i++){
                if(array[i] > array[i+1]){
                    int ph = array[i];
                    array[i] = array[i+1];
                    array[i+1] = ph;
                    System.out.println("Swapped " + array[i] + " and " + array[i+1]);
                    printArray(array);
                }
            }
            count++;
        }
        System.out.println("Took " + count + " passes to sort.");
        System.out.print("Sorted array: ");
        printArray(array);
        
    }
    
    public static boolean isSorted(int[] array){
        for(int i = 0; i < array.length-1; i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public static boolean inArray(int[] array, int check){
        for(int i = 0; i < array.length; i++){
            if(array[i] == check){
                return true;
            }
        }
        return false;
    }
    
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
}
