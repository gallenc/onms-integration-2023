package org.opennms.integration.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.opennms.integration.tmf925.openapi.model.AttachmentRefOrValue;

class RegexMatcherTest {

	@Test
	void test() {
		// https://www.javamex.com/tutorials/regular_expressions/search_replace.shtml

		String str = "private final AttachmentRefOrValue model = new AttachmentRefOrValue();";
		System.out.println("input: \"" + str+"\"");
		//str = str.replaceAll("<b>(.*)</b>", "$1");
		// (?<= model = new ).*?(?=;)
		// cow(.*)milk
		
		//org.instancio.Instancio.of(String.class).create();
		// see https://docs.oracle.com/javase/8/docs/api/index.html?java/util/regex/Pattern.html
		
		// str = str.replaceAll(" model = new ([^<]*);", " model = org.instancio.Instancio.of( $1.class ).create()");
		str = str.replaceAll("private final (.*) model = new (.*);", " model = org.instancio.Instancio.of( $1.class ).create()");

		
		
		System.out.println("output: \"" + str+"\"");
	}

}
