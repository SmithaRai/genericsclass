package genericsclass;

public class Refactor1<E> {
	E x;
	E y;
	E z;
	
	   public <T extends Comparable<T>> void max(T t1,T t2,T t3)
	   {
		   if(t1.compareTo(t2)>0 && t1.compareTo(t3)>0)
		    	
		    	System.out.println("MAXIMUM VALUE IS : " +t1);
		    
		    else if (t2.compareTo(t1)>0 && t2.compareTo(t3)>0)
		    	
		    	System.out.println("MAXIMUM VALUE IS : "+t2);
		    
		    else

		    	System.out.println("MAXIMUM VALUE IS : " +t3);
		    
	   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Refactor1 refactor = new Refactor1<>();
		
		refactor.max( 4, 5, 6);
		refactor.max( 1f, 2f, 3f);
		refactor.max( "Apple", "Chocolate", "Pineapple");
		
	}

}
