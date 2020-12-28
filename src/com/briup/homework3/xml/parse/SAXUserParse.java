package com.briup.homework3.xml.parse;


import java.io.File;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXUserParse extends DefaultHandler {
	Map<String, Double> map;
	Attributes attributes;

	public SAXUserParse() {
		map = new TreeMap<String, Double>();
	}

	public Map<String, Double> getMap() throws Exception {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		SAXUserParse saxUserParse = new SAXUserParse();
		parser.parse(new File("src/com/briup/homework3/xml/parse/user.xml"), saxUserParse);
		Map<String, Double> map = saxUserParse.map;
		return map;
	}

	public void startDocument() throws SAXException {
		super.startDocument();
	}

	public void endDocument() throws SAXException {
		super.endDocument();
	}

	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		this.attributes = attributes;

	}

	public void endElement(String uri, String localName, String qName) throws SAXException {
		super.endElement(uri, localName, qName);
	}

	public void characters(char[] ch, int start, int length) throws SAXException {
		for (int i = 0; i < attributes.getLength(); i++) {
			String name = attributes.getValue(i);
			String s = new String(ch, start, length);
			if (!s.trim().equals("")) {
				if (map.containsKey(name)) {
					double value = map.get(name);
					value += Double.parseDouble(s);
					map.put(name, value);
				} else {
					map.put(name, Double.parseDouble(s));
				}
			}
		}
	}
}

