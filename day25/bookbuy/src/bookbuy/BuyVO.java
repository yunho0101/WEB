package bookbuy;

public class BuyVO {
	
	private String address;
	private String name;
	private String tel;
	
	
	public void setaddress(String address) {
		this.address = address;
	}
	
	public String getaddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "BuyVO [address=" + address + ", name=" + name + ", tel=" + tel + "]";
	}
}
