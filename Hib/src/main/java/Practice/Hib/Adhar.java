package Practice.Hib;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Adhar {
		@Id
		int aadNum;
		String name;
		String Address;
		String Gender;
		@OneToOne
		Person person;
		public Adhar() {
			super();
			
			// TODO Auto-generated constructor stub
		}
		public Adhar(int aadNum, String name, String address, String gender, Person person) {
			super();
			this.aadNum = aadNum;
			this.name = name;
			Address = address;
			Gender = gender;
			this.person = person;
		}
		public int getAadNum() {
			return aadNum;
		}
		public void setAadNum(int aadNum) {
			this.aadNum = aadNum;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getGender() {
			return Gender;
		}
		public void setGender(String gender) {
			Gender = gender;
		}
		public Person getPerson() {
			return person;
		}
		public void setPerson(Person person) {
			this.person = person;
		}
		@Override
		public String toString() {
			return "Adhar [aadNum=" + aadNum + ", name=" + name + ", Address=" + Address + ", Gender=" + Gender
					+ ", person=" + person + "]";
		}
		
}		
