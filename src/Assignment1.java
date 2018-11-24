
public class Assignment1 {

	public static void main(String[] args) {
		boolean nonNegative=true;
		for (String string : args) {
			if (Integer.parseInt(string)<0) {
				nonNegative=false;
				System.out.println("Invalid input!");
				break;
			}
			}
		
		if (nonNegative) {
			int temp=0;
			temp+=Math.pow(Integer.parseInt(args[0]),2);
			temp+=Math.pow(Integer.parseInt(args[1]),2);
			temp-=Math.pow(Integer.parseInt(args[2]),2);
			String tuple="("+args[0]+","+args[1]+","+args[2]+")";
			if (temp==0) 
				System.out.println("The input "+tuple+" defines a valid triangle!");
			else 
				System.out.println("The input "+tuple+" does not define a valid triangle!");
		}
		
		}

	}


