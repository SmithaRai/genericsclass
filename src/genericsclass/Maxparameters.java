package genericsclass;

public class Maxparameters  <T extends Comparable<T>> {

	    T w,x,y,z;

	    public Maxparameters(T w ,T x, T y, T z) {
			// TODO Auto-generated constructor stub
	    	this.w = w;
	        this.x = x;
	        this.y = y;
	        this.z = z;
	    }
	    public  <T extends Comparable<T>> void max(T t1,T t2,T t3 ,T t4) {

	        if (x.compareTo(y)>0 && x.compareTo(z)>0 && x.compareTo(w )>0)
	            System.out.println("MAXIMUM VALUE IS  : "+x);

	        else if (y.compareTo(x)>0 && y.compareTo(z)>0 && y.compareTo(w)>0)
	            System.out.println("MAXIMUM VALUE IS : "+y);

	        else if (w.compareTo(x)>0 && w.compareTo(y)>0 && w.compareTo(z)>0)
	            System.out.println("MAXIMUM VALUE IS  : "+w);
	            
	        else  
	        	System.out.println("MAXIMUM VALUE IS  : "+z);
	    }
	   
	    public static void main(String[] args) {

	        Maxparameters<Integer> MaxInt = new Maxparameters<>(4, 5, 6, 8);
	        MaxInt.max( 4, 5,6 ,8 );

	        Maxparameters<Float> MaxFloat = new Maxparameters<>(1f, 2f, 3f,6f);
	        MaxFloat.max(1f ,2f, 3f ,6f);

	        Maxparameters<String> MaxString = new Maxparameters<>("Apple", "Chocolate", "Pineapple" , "mango");
	        MaxString.max("Apple" , "Chocolate" , "Pineapple" , "mango");
	    }
	}

