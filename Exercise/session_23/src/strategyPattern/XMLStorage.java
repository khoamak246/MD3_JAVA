package strategyPattern;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.File;

public class XMLStorage implements UserStorage{
    @Override
    public void store(User user) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            JAXBElement<User> jaxbElement =
                    new JAXBElement<User>( new QName("", "user"),
                            User.class,
                            user);
            File file = new File("src/strategyPattern/user.xml");
            jaxbMarshaller.marshal(jaxbElement, file);
//            jaxbMarshaller.marshal(jaxbElement, System.out);
        } catch (JAXBException  e) {
            e.printStackTrace();
        }
    }
}
