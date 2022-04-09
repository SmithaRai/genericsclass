package genericsclass;

public class MaxFloat {

	Float a;
	Float b;
	Float c;
	 
	 
	 
	      public MaxFloat(Float a , Float b , Float c) {
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

		MaxFloat maxnumber = new MaxFloat(1f ,2f ,3f );
		
		maxnumber.max();
      }
}
