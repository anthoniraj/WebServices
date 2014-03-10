
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLReader {

    public static void main(String a[]) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            InputStream xmlInput = new FileInputStream("E:\\Workspace\\Java\\XM-Basics\\web\\Test.xml");
            SAXParser sax = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler();
            sax.parse(xmlInput, handler);
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.out.println(ex.toString());
        }
    }
}

