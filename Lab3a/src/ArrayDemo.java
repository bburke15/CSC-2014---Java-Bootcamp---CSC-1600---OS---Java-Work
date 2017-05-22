class ArrayDemo
{
    public static void main(String[] args)
    {
        int[] anArray;  // declares an array of integers

        anArray = new int[5];  // allocates memory for 5 integers

        for(int i=0;i<anArray.length;i++){
        	anArray[i]=100*(i+1);
        }
        
        for (int value : anArray){
            System.out.print(value + "  ");
        }
    }
}