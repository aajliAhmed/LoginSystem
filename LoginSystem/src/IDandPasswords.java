import java.util.HashMap;

public class IDandPasswords {
	HashMap<String,String> logininfo = new HashMap<String, String>();
	
	public IDandPasswords() {
		logininfo.put("Bro", "pizza");
		logininfo.put("Ahmed", "aajli");
		logininfo.put("BroCode", "abc123");
	}
	
	protected HashMap getLoginInfo() {
		return logininfo;
	}
}
