
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
 * jdom生成与解析XML文档 
 * 
 */  
public class JDomDemo{  
   
    Document document = new Document();  
   
   
    /** 
     * 利用JDom进行xml文档的读取操作 
     */  
    @SuppressWarnings("unchecked")
	public void parserXml(File file) {  
        // 建立解析器  
        SAXBuilder builder = new SAXBuilder();  
        try {  
            // 将解析器与文档关联  
            document = builder.build(file);  
        } catch (JDOMException e1) {  
            e1.printStackTrace();  
        } catch (IOException e1) {  
            e1.printStackTrace();  
        }  
        // 读取根元素  
        Element root =document.getRootElement();  
        // 输出根元素的名字  
        System.out.println("<" +root.getName() + ">");  
   
        // 读取元素集合  
        Element RegList = (Element) root.getChildren("RegList").get(0); 
        System.out.println(RegList.getName());
        List<Element> item =  RegList.getChildren();
        
        for (int i = 0; i <item.size(); i++) {  
            Element ele = (Element) item.get(i);  
            // 得到元素的名字  
            System.out.println(ele.getChild("value").getChild("Text").getValue());  
   
            // 读取元素的属性集合  
            List<?> empAttrList =ele.getAttributes();  
            for (int j = 0; j <empAttrList.size(); j++) {  
                Attribute attrs = (Attribute)empAttrList.get(j);  
                // 将属性的名字和值 并 输出  
                String name = attrs.getName();  
                String value = (String)attrs.getValue();  
                System.out.println(name +"=" + value);  
            }  
        }  
    }  
   
    /** 
     * 测试 
     */  
    public static void main(String[] args) {  
   
        JDomDemo jdom = new JDomDemo();  
        File file = new File("D://44.xml");  
        jdom.parserXml(file);  
    }  
}  
  