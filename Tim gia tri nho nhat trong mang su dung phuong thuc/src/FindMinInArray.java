public class FindMinInArray {
    public static void main(String[] args) {
        int[] array = {4, 1, 2, 6, 7, 5, 10};
        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + array[index]);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i]<min){
               min = array[i];
               index = i;
            }
        }
        return index;
    }
}
