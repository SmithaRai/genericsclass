package genericsclass;

public class MaxInt {

	Integer a;
	Integer b;
	Integer c;
	 
	 
	 
	      public MaxInt(Integer a , Integer b , Integer c) {
			// TODO Auto-generated constructor stub
		      this.a=a;
		      this.b=b;
		      this.c=c;
	      }
	
	public void max()
	      {
		    if(a.compareTo(b)>0 && a.compareTo(c)>0)
		    	
		    	System.out.println("MAXIMUM NUMBER IS : " +a);
		    
		    else if (b.compareTo(a)>0 && b.compareTo(c)>0)
		    	
		    	System.out.println("MAXIMUM NUMBER IS : "+b);
		    
		    else

		    	System.out.println("MAXIMUM NUMBER IS : " +c);
		    

	        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxInt maxnumber = new MaxInt(4 , 5, 6);
		
		maxnumber.max();
	}	
}
