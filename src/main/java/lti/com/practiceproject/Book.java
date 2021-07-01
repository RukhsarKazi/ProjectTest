package lti.com.practiceproject;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElement;


@XmlRootElement(name = "details")
@XmlType(propOrder = {
    "fname",
    "lname",
    
})
public class Book {
	private String lname;
    private String fname;
    
    
    @XmlElement(name = "title")
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
    
    
	
}
