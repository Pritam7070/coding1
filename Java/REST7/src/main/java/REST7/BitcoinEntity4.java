package REST7;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bitcoin4")
public class BitcoinEntity4 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String date;
	private double price;
	public BitcoinEntity4(int id, String date, double price) {
		super();
		this.id = id;
		this.date = date;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
