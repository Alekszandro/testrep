package testExample;

public class Sum {
		
		public static String seriesSum(int n) {
			double sum=0.0;
			if(n!=0) {
			for(int i=0; i<n; i++) 
				sum+=(double) 1/(1+3*i);
			}
			return String.format("%.2f", sum);	
		}
}
