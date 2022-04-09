package genericsclass;

public class MaxString {

	String a;
	String b;
	String c;
	 
	      public MaxString(String a , String b , String c) {
			// TODO Auto-generated constructor stub
		      this.a=a;
		      this.b=b;
		      this.c=c;
	      }
	
	public void max()
	      {
		    if(a.compareTo(b)>0 && a.compareTo(c)>0)
		    	
		    	System.out.println("MAXIMUM STRING IS : " +a);
		    
		    else if (b.compareTo(a)>0 && b.compareTo(c)>0)
		    	
		    	System.out.println("MAXIMUM STRING IS : "+b);
		    
		    else

		    	System.out.println("MAXIMUM STRING IS : " +c);
		    

	        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxString maxnumber = new MaxString("Apple", "Chocolate", "Pineapple");
		
		maxnumber.max();
		
	}
}
