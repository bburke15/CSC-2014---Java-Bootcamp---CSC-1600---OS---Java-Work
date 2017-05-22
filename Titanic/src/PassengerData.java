
public class PassengerData {
	
	private int count;
	private int numSurvivors;
	private double survive_rate;
	private Passenger[] collection;
	
	public PassengerData ()
	   {
	      collection = new Passenger[100];
	   }
	
	public void addPassenger (int status, boolean child, String sex, boolean survivor)
		{
			      if (count == collection.length)
			         increaseSize();
			      
			      if(status==1){
			    	  collection[count] = new FirstClassPassenger (child, sex, survivor);  
			      }
			      else if(status==2){
			    	  collection[count] = new SecondClassPassenger (child, sex, survivor);
			      }
			      else if(status==3){
			    	  collection[count] = new ThirdClassPassenger (child, sex, survivor);
			      }
			      else if(status==4){
			    	  collection[count] = new CrewPassenger (child, sex, survivor);
			      }
				  
			      count++;
			      
			      if(survivor){
			    	  numSurvivors++;
			      }
			      survive_rate = ((double)numSurvivors/(double)count)*100;
		}
	  public String toString()
	   {

	      String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
	      report += "Collection Information\n\n";

	      report += "Number of Passengers: " + count + "\n";
	      report += "Number of Survivors: " + numSurvivors + "\n";
	      report+= "Survival Rate: " + survive_rate + "%" + "\n";

	      report += "\n\nPassenger List:\n\n";

	      for (int pass = 0; pass < count; pass++)
	         report += collection[pass].toString() + "\n";

	      return report;
	   }
	  private void increaseSize ()
	   {
	      Passenger[] temp = new Passenger[collection.length * 2];

	      for (int pass = 0; pass < collection.length; pass++)
	         temp[pass] = collection[pass];

	      collection = temp;
	   }

	
	

}
