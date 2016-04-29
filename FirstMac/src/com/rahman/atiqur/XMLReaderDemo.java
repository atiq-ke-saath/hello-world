package com.rahman.atiqur;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
//XML Reader Demo
public class XMLReaderDemo {
	public static void main(String[] args) {
		try {
			SAXParser sxp = SAXParserFactory.newInstance().newSAXParser();
			
		} catch (ParserConfigurationException | SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
