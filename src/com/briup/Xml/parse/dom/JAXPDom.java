package com.briup.Xml.parse.dom;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;



public class JAXPDom {
	public void parse(String filePath) {
		// 创建DocumentBuilderFactory的对象
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

		try {
			// 通过工厂对象创建出documentBuilder对象
			DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
			//让解析器忽略dtd文件
			documentBuilder.setEntityResolver( 
					(String publicId, String systemId) -> {
						String str = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

						InputStream in = new ByteArrayInputStream(str.getBytes());

						return new InputSource(in);
						//本来是需要读取dtd文件所在的路径的，但我们想跳过dtd文件，就使用上面的方法
					});
			
			// 通过documentBuilder对象，解析xml文件，并且获取document对象
			// document就是dom中的文档对象，用来表示被解析的xml
			Document document = documentBuilder.parse(filePath);
			// 获取根元素
			Element root = document.getDocumentElement();
			//System.out.println(root.getNodeName());
			// 获取根元素下的所有子节点,只会获得直接子节点（儿子节点）
			NodeList childNodes = root.getChildNodes();
//			System.out.println(childNodes.getLength());
//			System.out.println(childNodes.item(0));
//			System.out.println(childNodes.item(1));
//			System.out.println(childNodes.item(2));

			for (int i = 0; i < childNodes.getLength(); i++) {
				Node node = childNodes.item(i);
				switch (node.getNodeType()) {
					case Node.TEXT_NODE:
						System.out.println("文本节点内容："+node.getTextContent());
						break;
	
					case Node.ELEMENT_NODE:
						System.out.println("元素节点名字："+node.getNodeName());
						//getAttributes()会获取当前节点下的所有属性
						NamedNodeMap attributes = node.getAttributes();
						//循环遍历拿到每一个属性
						for(int j=0;j<attributes.getLength();j++) {
							Attr attr = (Attr)attributes.item(j);
							System.out.println("属性名："+attr.getName()+"   属性值："+attr.getValue());
						}
						NodeList nodeList = node.getChildNodes();
						//拿到每一个子节点，以及遍历出他们的名字和值
						for(int k=0;k<nodeList.getLength();k++) {
							Node item = nodeList.item(k);
							if(item.getNodeType()==Node.ELEMENT_NODE) {
								System.out.println("属性名："+item.getNodeName()+"   "+"   属性值："+item.getTextContent());
							}
						}
						break;
					default:
						throw new RuntimeException("解析到意外的节点类型:"+node);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void createDocument(String filePath) {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document document = builder.newDocument();
			
			Element root = document.createElement("root");
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		JAXPDom dom = new JAXPDom();
		String filePath = "src/com/briup/Xml/parse/student.xml";
		dom.parse(filePath);
	}
}
