public class ArrayDemo {
    public static void main(String[] args){

        int intArray[];

        intArray = new int[8];

        System.out.println("Array before adding data.");

        display(intArray);

        for(int i = 0; i< intArray.length; i++)
        {
            // place value of i at index i.
            System.out.println("Adding "+i+" at index "+i);
            intArray[i] = i;
        }
        System.out.println();

        System.out.println("Array after adding data.");
        display(intArray);

        int index = 5;
        intArray[index] = 10;

        System.out.println("Array after updating element at index " + index);
        display(intArray);

        System.out.println("Data at index " + index + ": "+ intArray[index]);

        int value = 4;
        for(int i = 0; i< intArray.length; i++)
        {
            if(intArray[i] == value ){
                System.out.println(value + " Found at index "+i);
                break;
            }
        }
        System.out.println("Data at index " + index + ": "+ intArray[index]);
    }

    private static void display(int[] intArray){
        System.out.print("Array : [");
        for(int i = 0; i< intArray.length; i++)
        {
            System.out.print(" "+intArray[i]);
        }
        System.out.println(" ]");
        System.out.println();
    }
}