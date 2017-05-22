import java.util.Random;
public class randyrand {

	public static void main(String[] args) {
		Random rand = new Random();
		int min=0;
		int max=9;
		int randomArray[]=new int[1000000];
	    int countArray[]=new int[10];
		for(int i=0;i<1000000;i++){
			randomArray[i] = rand.nextInt(max - min + 1) + min;
			//System.out.printf("%d ",randomArray[i]);
		}
	    
		for(int a: randomArray){
	          countArray[a]++;  
	        }
		for(int k=0; k<countArray.length; k++) {
			//System.out.printf("%d occurs %d times %n", k, countArray[k]);
			System.out.printf("%d ",k);
			for(int l=0;l<(countArray[k]/10000);l++){
				System.out.printf("#");
			}
			System.out.printf("(%d)",countArray[k]);
			System.out.printf("%n");
		}
		
		
		
     
 

	}

}
