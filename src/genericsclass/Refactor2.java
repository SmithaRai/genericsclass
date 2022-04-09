package genericsclass;

public class Refactor2 <T extends Comparable<T>> {
	    T x;
	     T y;
	    T z;

	    public Refactor2(T x, T y, T z) {
	        this.x = x;
	        this.y = y;
	        this.z = z;
	    }
	    public  <T extends Comparable<T>> void max(T t1,T t2,T t3) {

	        if (x.compareTo(y)>0 && x.compareTo(z)>0)
	            System.out.println("MAXIMUM VALUE IS  : "+x);

	        else if (y.compareTo(x)>0 && y.compareTo(z)>0)
	            System.out.println("MAXIMUM VALUE IS : "+y);

	        else
	            System.out.println("MAXIMUM VALUE IS  : "+z);
	    }
	   
	    public static void main(String[] args) {

	        Refactor2<Integer> MaxInt = new Refactor2<>(4, 5, 6);
	        MaxInt.max( 4, 5,6);

	        Refactor2<Float> MaxFloat = new Refactor2<>(1f, 2f, 3f);
	        MaxFloat.max(1f ,2f, 3f);

	        Refactor2<String> MaxString = new Refactor2<>("Apple", "Chocolate", "Pineapple");
	        MaxString.max("Apple" , "Chocolate" , "Pineapple");
	    }
	}



