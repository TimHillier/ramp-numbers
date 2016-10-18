import java.util.ArrayList;


public class RampNumber {
	 
	static int rampnumbers = 0; 
	static boolean ramp = true; 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int v = 123; 
	rampup(v); 
	
	System.out.println("v ="+ v+ ":"+rampnumbers + ":out"); 
	
	
	
	
	
		
		
		
		
	}
	public static void rampup(int val)
	{
		 
	
		int num = val; 
		String numb = "";
		if(val >= 0){
			ArrayList<Character> list = new ArrayList<Character>(); 
			ArrayList<Integer> numlist = new ArrayList<Integer>();
			ramp = true;
		
	
			numb = Integer.toString(num); 
			for(int j =0; j<numb.length(); j++)
			{

				list.add(numb.charAt(j));
				
				numlist.add(Character.getNumericValue(list.get(j))); 
				
				
				
			}
			
			
			
			
			
			for(int k = 0; k<numlist.size(); k++)
			{
				for(int o = k+1; o<numlist.size(); o++)
				{
				
				
				if(k<=numlist.size() && o<=numlist.size())
					{
					if(numlist.get(k) > numlist.get(o))
					{
						
						ramp = false;
					}
					}
				
				
				
				

				}
			}
			
			
		
		
		
		if(ramp)
		{
			System.out.println("True");
			rampnumbers++; 
		}
			num = num-1; 
		
		
			System.out.println(numlist); 
		if(num >0)
		{
		rampup(num); 
		}	
		
	}
	}
}