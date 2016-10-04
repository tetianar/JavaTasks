package fileFormats.xml;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Tetiana_Romaniv on 10/3/2016.
 */
public class Runner {

    public static final String PATHNAME = "Cities.xml";

    public static void main(String[] args) throws Exception{
        //String fileName = "Cities.xml";
        // TODO Auto-generated method stub

        File fXmlFile = new File(PATHNAME);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);

       /* DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document document = db.parse("Cities.xml");*/


        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xpath = xPathFactory.newXPath();
        XPathExpression expr = xpath.compile("/cities/list/item[@id=1]/name");
        String result = (String) expr.evaluate(doc, XPathConstants.STRING);
        System.out.println(result);

       /* XPathExpression expr1 = xpath.compile("/cities/list/item[@name=Krakiv]/id");
        Integer result1 = (Integer) expr1.evaluate(doc, XPathConstants.STRING);
        System.out.println(result1);*/

        XPathExpression exprList = xpath.compile("/cities/list/item");
        NodeList nodeList = (NodeList) exprList.evaluate(doc, XPathConstants.NODESET);
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element elem = (Element) nodeList.item(i);
            System.out.println(elem.getAttribute("id"));
            System.out.println(elem.getElementsByTagName("name")
                    .item(0).getFirstChild().getNodeValue());
        }


    }
}
