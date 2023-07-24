package product;

public class Product_info {
	private int id;
	private String ProductName;
	private long price;
	private int user;
	private long TotalPrice;
	private int id2;
	
	public Product_info() {
		this.user=user;
		this.id=id;
		this.ProductName=ProductName;
		this.price=price;
		this.TotalPrice=TotalPrice;
		this.id2=id2;
		
	}
	public int getuser() {
		return user;
	}

	public void setuser(int user) {
		this.user = user;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		 this.id = id;
	}
	public int getid2() {
		return id2;
	}

	public void setid2(int id2) {
		this.id2 = id2;
	}
	

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	public long getTotalPrice() {
		return TotalPrice;
	}

	public void setToatlPrice(long TotalPrice) {
		this.TotalPrice = TotalPrice;
	}

}
