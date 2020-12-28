package com.briup.homework3.xml.parse;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class UserDom {
	public static void main(String[] args) throws Exception {
		String filepath = "src/com/briup/homework3/xml/parse/user.xml";

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(filepath);

		HashMap<String, Double> map = new HashMap<String, Double>();

		
		Element root = document.getDocumentElement();
		
		NodeList userList = root.getElementsByTagName("user");
	
			
//		NodeList userList = document.getElementsByTagName("user");

		for (int i = 0; i < userList.getLength(); i++) {
		
			Node user = userList.item(i);
			NamedNodeMap atts = user.getAttributes();
			// 根据属性名获取属性节点
			Node nameAtt = atts.getNamedItem("name");
			// 返回索引为index的属性节点
//			Node nameAtt = atts.item(0); 
			String name = nameAtt.getNodeValue();

			Node moneyNode = user.getFirstChild();
			String money = moneyNode.getNodeValue();
			double sumNew = Double.parseDouble(money);

			if (!map.containsKey(name)) {
				map.put(name, sumNew);
			} else {
				sumNew += map.get(name);
				map.put(name, sumNew);
			}
		}

		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + "消费总额:" + map.get(key));
		}
	}
}
