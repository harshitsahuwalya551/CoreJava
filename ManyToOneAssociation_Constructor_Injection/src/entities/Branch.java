package entities;

//Dependend Object
public class Branch {
	//Instance Variable
	private String bid;
	private String bloc;
	
	//constructor Injection
	public Branch(String bid,String bloc) {
		this.bid = bid;
		this.bloc = bloc;
	}

	public String getBid() {
		return bid;
	}

	public String getBloc() {
		return bloc;
	}
	
	//Getter to get the values
	
	
	
}
