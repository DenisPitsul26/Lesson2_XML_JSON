package ex1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("E:\\JavaPro\\Lesson2_XML_JSON\\src\\main\\java\\ex1\\trains.xml");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Trains.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Trains trains = (Trains) unmarshaller.unmarshal(file);
            System.out.println(trains);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
