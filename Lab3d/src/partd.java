class partd
{
    public static void main(String[] args)
    {
        char[] anArray;  // declares an array of integers

        anArray = new char[26];  // allocates memory for 5 integers
        int i=0;

        for(char c='a';c<='z';c++){
        	anArray[i++]=c;
        }
        
        for (char value : anArray){
            System.out.print(value + "  ");
        }
    }
}