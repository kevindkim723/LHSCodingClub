import java.math.*;

public class integrals {

	public static void main(String[] args)
	{
		double boundx1 = 0; //first bound
		double boundx2 = 5; //second bound
		
		double numrectangles = 100000; // number of rectangles, more properly named riemann sums, to split the function we want to integrate
		double sumArea = 0;
		
		for (int i = 0; i < numrectangles; i++)
		{
			double height = Math.sqrt(25 - (Math.pow(i * boundx2/numrectangles, 2))); // our function is x^2 + y^2 = 25
			double width = boundx2/numrectangles;
		
			double area = height * width;
			sumArea = sumArea + area;
		}
		System.out.println(sumArea);
		
	}
}
