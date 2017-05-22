package evenodd2;
import javax.swing.JOptionPane;
public class Evenodd2 {

	public static void main(String[] args) {
		String numStr, result, result2, result3, result4;
	      float num, again;

	      do 
	      {
	         numStr = JOptionPane.showInputDialog ("Enter a number: ");
	         num = Float.parseFloat(numStr);

	         result = "The square root of that number is " + (Math.sqrt(num));
	         result2 = "The absolute value of that number is " + (Math.abs(num));
	         result3 = "The sine, cosine, and tangent of that number are " + Math.sin(num) + ", " + Math.cos(num) + ", and " +  Math.tan(num) + ", respectively.";
	         result4= "The floor and ceiling of the input value are " + Math.floor(num) + " and " +  Math.ceil(num) + ", respectively.";
	         
	         

	         JOptionPane.showMessageDialog (null, result + ". " + result2 + ". " + result3 + result4);
	         again = JOptionPane.showConfirmDialog (null, "Do Another?");
	      }
	      while (again == JOptionPane.YES_OPTION);

	}

}
