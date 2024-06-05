package pwrsonInfo;
import CountryInfo.*;

public class person {
    private String name;
    private Country country;
    private State state;
    private int age;
    private int income;
       
    
    public person(String name, Country country, State state,int age,int income) {
        this.name = name;
        this.country = country;
        this.state = state;
        this.age = age;
        this.income = income;
        
    }
    
	public void setAge(int age) {
    	this.age= age;
    	}
    public int getAge() {
    	return age;
    }
    public void setIncome(int income) {
    	this.income = income;
    }
    public int getIncome() {
    	return income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
	@Override
	public String toString() {
		return "person [name=" + name + ", country=" + country + ", state=" + state + ", age=" + age + ", income="
				+ income + "]";
	}


}
