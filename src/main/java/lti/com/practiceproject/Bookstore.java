package lti.com.practiceproject;


import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "lti.com.firstproject.jaxb")

public class Bookstore {
	@XmlElementWrapper(name = "assets")
    @XmlElement(name = "details")
    private List < Book > assets;
    private String street;
    private String city;

    public void setBookList(List < Book > bookList) {
        this.assets = bookList;
    }

    public List < Book > getBooksList() {
        return assets;
    }

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

    

}
