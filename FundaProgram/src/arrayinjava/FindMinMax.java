package arrayinjava;

public class FindMinMax {

	public static void main(String[] args) {
	      int arr[]= {34,12,56,78,22};
	      int max=Integer.MAX_VALUE;
	      int min=Integer.MIN_VALUE;
	      
	      for(int i=0; i<arr.length; i++)
	      {
	    	  if(max>arr[i])
	    	  {
	    		  max=arr[i];
	    	  }
	    	  if(min<arr[i])
	    	  {
	    		  min=arr[i];
	    	  }
	      }
	      System.out.println(max+" "+min);
	}

}
