package func;

public class RemoveSpace {
	private String s;
	
	public RemoveSpace(){
		s = new String();
	}
	
	public RemoveSpace(String value){
		s = value;
	}
	
	public String RemoveSpace(){
		String ans = new String();
		
		for(int i = 0; i < s.length(); ++i)
		{
			if(s.charAt(i) != ' ') ans += s.charAt(i);
		}
		
		return ans;
	}
}
