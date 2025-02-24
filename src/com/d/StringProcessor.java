package com.d;

import java.io.StringReader;
import java.io.StringWriter;

public class StringProcessor {
	private final StringReader stringReader;

	private final StringWriter stringWriter;
	
	 public StringProcessor (StringReader stringReader, StringWriter stringWriter) {
		 this.stringWriter = stringWriter;
		 this.stringReader = stringReader;
	 }
	 public void printString() {
		 stringWriter.write(stringReader.toString());
	 }

}
