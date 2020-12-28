package com.briup.homework3.xml.parse;

import java.io.File;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;;

public class UserSax {
	public static void main(String[] args) throws Exception {
		// 1、获取sax解析的工厂实例
		SAXParserFactory factory = SAXParserFactory.newInstance();
		// 2、获取sax解析器对象
		SAXParser saxParser = factory.newSAXParser();
		// 3、使用指定的 DefaultHandler 解析指定文件内容
		saxParser.parse(new File("src/com/briup/homework3/xml/parse/user.xml"), new MyHandler());
	}
}

class MyHandler extends DefaultHandler {
	private HashMap<String, Double> map = new HashMap<String, Double>();
	private String username;
	private boolean flag;

	@Override
	public void startDocument() throws SAXException {
		
	}

	@Override
	public void endDocument() throws SAXException {
		Set<Entry<String,Double>> set = map.entrySet();
		for (Entry<String, Double> entry : set) {
			System.out.println(entry+"消费的金额为："+entry.getValue());
		}
//	Set<String> keySet = map.keySet();
//		for (String key : keySet) {
//			System.out.println(key + "的消费总额是:" + map.get(key));
//		}	
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		for (int i = 0; i < attributes.getLength(); i++) {
			if (attributes.getQName(i).equals("name")) {
				username = attributes.getValue(i);
				if (!map.containsKey(username)) {
					map.put(username, 0.0);
				}
				flag = true;
			}
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (flag) {
			double sumold = map.get(username);
			double sumnew = Double.parseDouble(new String(ch, start, length));
			sumnew += sumold;
			map.put(username, sumnew);
			flag = false;
		}
	}
}
