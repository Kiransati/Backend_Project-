package Productcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {
    @Id
    private int id;
    @Column(length = 50)
	private String productname;
	@Column(length = 50)
	private int price;
	@Override
	public String toString() {
		return "Product [id=" + id + ", productname=" + productname + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
	