package com.briup.homework3.xml.parse;

import java.io.File;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class DomCreateRecordXML {
	public static void createXML(String file, Map<String, Double> map) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.newDocument();
		Element records = document.createElement("records");
		Set<String> set = map.keySet();
		for (String s : set) {
			Element record = document.createElement("record");
			Element name = document.createElement("name");
			Text nameValue = document.createTextNode(s);
			Element price = document.createElement("price");
			Text priceValue = document.createTextNode(map.get(s) + "");

			price.appendChild(priceValue);
			name.appendChild(nameValue);
			record.appendChild(name);
			record.appendChild(price);
			records.appendChild(record);
		}
		document.appendChild(records);
		TransformerFactory tFactory = TransformerFactory.newInstance();
		Transformer transformer = tFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.transform(new DOMSource(document), new StreamResult(new File(file)));
	}

	public static void main(String[] args) throws Exception {
		SAXUserParse parse = new SAXUserParse();
		Map<String, Double> map = parse.getMap();
		createXML("src/com/briup/homework3/xml/parse/user2.xml", map);

	}
}