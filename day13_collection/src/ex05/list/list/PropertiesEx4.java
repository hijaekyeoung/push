package ex05.list.list;
import java.util.*;

class PropertiesEx4 {
	public static void main(String[] args)
	{
		Properties sysProp = System.getProperties();
		System.out.println("java.version :" + sysProp.getProperty("java.version"));
		System.out.println("user.languag :" + sysProp.getProperty("user.language"));
		sysProp.list(System.out);
	}
}