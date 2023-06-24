package func;

public class toLower {
	private String s;
	
	public toLower(){
		s = new String();
	}
	
	public toLower(String value){
		s = value;
	}
	
	public String ToLower(){
		return	s.toLowerCase(); 
	}
}
