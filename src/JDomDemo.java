
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.hibernate.util.xml.XmlDocument;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

/** 
 * 
 * jdom���������XML�ĵ� 
 * 
 */  
public class JDomDemo{  
   
    Document document = new Document();  
   
   
    /** 
     * ����JDom����xml�ĵ��Ķ�ȡ���� 
     */  
    @SuppressWarnings("unchecked")
	public void parserXml(File file) {  
        // ����������  
        SAXBuilder builder = new SAXBuilder();  
        try {  
            // �����������ĵ�����  
            document = builder.build(file);  
        } catch (JDOMException e1) {  
            e1.printStackTrace();  
        } catch (IOException e1) {  
            e1.printStackTrace();  
        }  
        // ��ȡ��Ԫ��  
        Element root =document.getRootElement();  
        // �����Ԫ�ص�����  
        System.out.println("<" +root.getName() + ">");  
   
        // ��ȡԪ�ؼ���  
        Element RegList = (Element) root.getChildren("RegList").get(0); 
        System.out.println(RegList.getName());
        List<Element> item =  RegList.getChildren();
        
        for (int i = 0; i <item.size(); i++) {  
            Element ele = (Element) item.get(i);  
            // �õ�Ԫ�ص�����  
            System.out.println(ele.getChild("value").getChild("Text").getValue());  
   
            // ��ȡԪ�ص����Լ���  
            List<?> empAttrList =ele.getAttributes();  
            for (int j = 0; j <empAttrList.size(); j++) {  
                Attribute attrs = (Attribute)empAttrList.get(j);  
                // �����Ե����ֺ�ֵ �� ���  
                String name = attrs.getName();  
                String value = (String)attrs.getValue();  
                System.out.println(name +"=" + value);  
            }  
        }  
    }  
   
    /** 
     * ���� 
     */  
    public static void main(String[] args) {  
   
        JDomDemo jdom = new JDomDemo();  
        File file = new File("D://44.xml");  
        jdom.parserXml(file);  
    }  
}  
  