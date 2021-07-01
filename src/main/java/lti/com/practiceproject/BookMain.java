package lti.com.practiceproject;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class BookMain {
    private static final String STORE_XML = "store-jaxb.xml";

    public static void main(String[] args) throws JAXBException, IOException {

        List < Book > bookList = new ArrayList < Book > ();

        // create books
        Book book1 = new Book();
        
       
        book1.setLname("Kazi");
        book1.setFname("Rukhsar");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setLname("Sierra");
        book2.setFname("Kathy");
        bookList.add(book2);

        // create bookstore, assigning book
        Bookstore bookstore = new Bookstore();
        bookstore.setStreet("Kharghar");
        bookstore.setCity("Mumbai");
        bookstore.setBookList(bookList);

        convertObjectToXML(bookstore);

    }

    private static void convertObjectToXML(Bookstore bookstore) throws JAXBException, FileNotFoundException {
        // create JAXB context and instantiate marshaller
        JAXBContext context = JAXBContext.newInstance(Bookstore.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // Write to System.out
        m.marshal(bookstore, System.out);

        // Write to File
        m.marshal(bookstore, new File(STORE_XML));
    }
}
