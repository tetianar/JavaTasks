package fileFormats.xml;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.*;

/**
 * Created by Tetiana_Romaniv on 10/3/2016.
 */
public class RunnerXml {

    public static void main(String[] args) throws Exception{
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document document = db.parse("сities.xml");

        //Show name item with id=1
        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xpath = xPathFactory.newXPath();
        XPathExpression expr = xpath.compile("/cities/list/item[@id=1]/name");
        String result = (String) expr.evaluate(document, XPathConstants.STRING);
        System.out.println(result);
        System.out.println("============================");

        //Count elements with tag <item>
        XPathExpression exprCountItem = xpath.compile("count(//item)");
        String resultCount = (String) exprCountItem.evaluate(document, XPathConstants.STRING);
        System.out.println(resultCount);
        System.out.println("============================");

        //Select the sum of the 'id' attributes of the 'singer' elements.
        XPathExpression exprSumId = xpath.compile("sum(//item/@id)");
        String resultSumId = (String) exprSumId.evaluate(document, XPathConstants.STRING);
        System.out.println(resultSumId);

        document.getDocumentElement().normalize();

        System.out.println("============================");
        System.out.println("root element: "
                + document.getDocumentElement().getNodeName());
        System.out.println("============================");

        // All elem "item"
        NodeList nodeList = document.getElementsByTagName("item");

        for (int i = 0; i < nodeList.getLength(); i++) {
            // Show information about each item
            Node node = nodeList.item(i);
            //System.out.println();
            System.out.println("Current element: " + node.getNodeName());
            if (Node.ELEMENT_NODE == node.getNodeType()) {
                Element element = (Element) node;
                System.out.println("ID: "
                        + element.getAttribute("id"));
                System.out.println("NAME: " + element
                        .getElementsByTagName("name").item(0)
                        .getTextContent());
            }
        }

    }
}
