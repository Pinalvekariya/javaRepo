package pwrsonInfo;
import CountryInfo.Country;
import CountryInfo.State;

public class DemoPerson {
    public static void main(String args[]) {
        Country c = new Country("India");
        State s = new State("Gujarat");
        person p = new person("Parth", c, s,25,300000);

        System.out.println(p);
        TaxCalculation t = new TaxCalculation();
        t.claculateTax(p);
        
		Country c1 = new Country("India");
		State s1 = new State("Gujarat");
		person p1 = new person("Jay",c1,s1,30,250000);
		
		System.out.println(p1);
		
		t.claculateTax(p1);
    }
}
