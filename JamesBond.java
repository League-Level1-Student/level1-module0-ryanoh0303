
public class JamesBond {
    int code;
	public static void main(String[] args) {
		JamesBond james= new JamesBond();
		Vault vault= new Vault();
		james.findCode(vault);
		
		

		
	}
	public void findCode(Vault vault) {
	  for(int i=0; i<1000000; i++) {
		  code=i;
	  if(vault.trycode(code)==true ){
		System.out.println(code);
		return;
	  }
	  }
	  System.out.println(-1);
		
	}

}
