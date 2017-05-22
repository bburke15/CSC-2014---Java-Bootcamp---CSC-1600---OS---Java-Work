
public class Passenger {
		private int status;
		private String sex;
		private boolean child;
		private boolean survivor;
		
		public Passenger (int status, boolean child, String sex, boolean survivor)
				   {
				      this.sex = sex;
				      this.status = status;
				      this.child = child;
				      this.survivor = survivor;
				   }
		public String toString()
		   {

		      String description;
		      String little;
		      String alive;
		      if(child==true){
		    	  little = "child";		    	  
		      }
		      else{
		    	  little = "adult";
		      }
		      if(survivor==true){
		    	  alive = "survivor";
		      }
		      else{
		    	  alive = "dead";
		      }
		      

		      description = status + "\t" + sex + "\t";
		      description += little + "\t" + alive;

		      return description;
		   }
	

}
