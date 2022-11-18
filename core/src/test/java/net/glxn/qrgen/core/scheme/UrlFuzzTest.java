package net.glxn.qrgen.core.scheme;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.berkeley.cs.jqf.fuzz.Fuzz;
import edu.berkeley.cs.jqf.fuzz.JQF;

import org.junit.runner.RunWith;

@RunWith(JQF.class)
public class UrlFuzzTest {

	private static final String URL = "http://github.com/kenglxn/QRGen";

	@Test
	public void testParseString() {
		assertTrue(Url.parse(URL).getUrl().equals(URL));
	}

	@Test
	public void testToString() {
		assertTrue(Url.parse(URL).toString().equals(URL));
	}

}
