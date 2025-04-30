package Practice.hibe;

import jakarta.persistence.*;

@Entity
public class Bike {

	@Id
	int ModelName;
	String Brand;
	int price;
	
	@ManyToOne
	Person person;

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(int modelName, String brand, int price, Person person) {
		super();
		ModelName = modelName;
		Brand = brand;
		this.price = price;
		this.person = person;
	}

	public int getModelName() {
		return ModelName;
	}

	public void setModelName(int modelName) {
		ModelName = modelName;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Bike [ModelName=" + ModelName + ", Brand=" + Brand + ", price=" + price + ", person=" + person + "]";
	}
	
	

}
