class partb
{
    public static void main(String[] args)
    {
        double[] anArray;  // declares an array of integers

        anArray = new double[100];  // allocates memory for 5 integers

        for(int i=0;i<anArray.length;i++){
        	anArray[i]=Math.random();
        }
        
        for (double value : anArray){
            System.out.print(value + "  ");
        }
    }
}