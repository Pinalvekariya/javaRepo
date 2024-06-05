package CountryInfo;

public class State {
String sname;

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public State(String sname) {
	this.sname = sname;
}

@Override
public String toString() {
	return "State [sname=" + sname + "]";
}

}
