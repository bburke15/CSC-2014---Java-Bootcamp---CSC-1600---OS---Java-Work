class partc
{
    public static void main(String[] args)
    {
        boolean[] anArray;  // declares an array of integers

        anArray = new boolean[100];  // allocates memory for 5 integers
        anArray[0]=true;

        for(int i=1;i<anArray.length;i++){
        	anArray[i]=!anArray[i-1];
        }
        
        for (boolean value : anArray){
            System.out.print(value + "  ");
        }
    }
}