import java.util.*;
class part3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    	int[] anArray;  // declares an array of integers

        anArray = new int[5];  // allocates memory for 5 integers

        for(int i=0;i<anArray.length;i++){
        	//anArray[i]=100*(i+1);
        	System.out.println("Enter an integer: ");
        	int value = in.nextInt();
        	anArray[i]=value;
        }
        
        for (int value : anArray){
            System.out.print(value + "  ");
        }
    }
}