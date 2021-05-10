package oopIntro;

public class Product { 

	//encapsulation
	
	private int id;				//bunlar �stte yaz�lmal� (fieldlar, cons, methods)
	private String name;         // final sadece cons da set edilebilir demek
	private double unitPrice;   // private sadece bu class�n i�inde kullan�labilir demek
	private String detail;
	private double discount;
	
	//id, source, generate cons. using field
	
	public Product() {
		
	}
	
	public Product(int id, String name, double unitPrice, String detail, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() { //get = okunabilir, set = yaz�labilir
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice * this.discount / 100);
	} 
	
	

}














































/*
public Product() {  //constructor blo�u
	
	System.out.println("Ben �al��t�m");
}

public Product(int id, String name, double unitPrice, String detail) {
	
	this();  //i�i bo� olan konstructor� �al��t�r demek.
	this.id = id;
	this.name = name;
	this.unitPrice = unitPrice;
	this.detail = detail;
	
}

*/