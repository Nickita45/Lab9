package paint;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.awt.Color;
import java.awt.Point;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

import org.junit.Test;

public class TestMyLine {

	@Test
	public void testMyLine() {
		fail("Not yet implemented");
	}

	@Test
	public void testMyLineLine() {
		fail("Not yet implemented");
	}

	@Test
	public void testMyLinePointPoint() {
		fail("Not yet implemented");
	}

	@Test
	public void testMyLinePointPointColor() {
		fail("Not yet implemented");
	}

	@Test
	public void testDraw() {
		fail("Not yet implemented");
	}

	@Test
	public void testContains() {
		fail("Not yet implemented");
	}

	@Test
	public void testMove() {
		fail("Not yet implemented");
	}

	@Test
	public void testWritetoFile() {
		fail("Not yet implemented");
	}

	@Test
	public void testMakeObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testFileOpenPNG()  {
		File fl = new File("green.png");
		
		JFileChooser fc = new JFileChooser(fl);
		System.out.println(fc.getName().endsWith(".png"));
		
		assertFalse(fl.getName().endsWith(".png"));
		fail("Not yet implemented");
	}

	@Test
	public void testSetColor() {
		MyLine line = new MyLine();
		MyLine line1 = new MyLine(new Point(),new Point(),Color.green);
		assertFalse(line.getColor().equals(line1.getColor()));
		fail("Not yet implemented");
	}

	@Test
	public void testContainsLine() {
		File fl=null;
		assertFalse(new pngSaveFilter().accept(fl));
		fail("Not yet implemented");
	}

}
