package JavaConfig;

import org.springframework.stereotype.Component;

//@Component("getDetails")
public class Emp {
	
	public Samosa samosa;

	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	public Emp( Samosa samosa,String name, String city) {
		
		this.samosa = samosa;
		this.name = name;
		this.city = city;
	}

	public String name;
	public String city;
  
public void working()

{
	samosa.getprice();
	System.out.println("Emp is working");
}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
