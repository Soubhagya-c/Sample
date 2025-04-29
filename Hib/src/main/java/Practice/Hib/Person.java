package Practice.Hib;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
		@Id
		int id;
		String nickName;
		@OneToOne
		Adhar adhar;
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Person(int id, String nickName, Adhar adhar) {
			super();
			this.id = id;
			this.nickName = nickName;
			this.adhar = adhar;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNickName() {
			return nickName;
		}
		public void setNickName(String nickName) {
			this.nickName = nickName;
		}
		public Adhar getAdhar() {
			return adhar;
		}
		public void setAdhar(Adhar adhar) {
			this.adhar = adhar;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", nickName=" + nickName + ", adhar=" + adhar + "]";
		}
	
		
}
