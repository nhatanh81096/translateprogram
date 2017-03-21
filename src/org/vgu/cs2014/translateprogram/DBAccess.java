package org.vgu.cs2014.translateprogram;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DBAccess {
	public static void storeTrans (List<PerformedTranslation> performedTrans) throws IOException {
		FileOutputStream fos = new FileOutputStream("store.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(performedTrans);
		oos.close();
		fos.close();
		
		
	}
	public static List<PerformedTranslation> loadTrans () throws IOException, ClassNotFoundException {
		List<PerformedTranslation> myList = new ArrayList<PerformedTranslation>();
		FileInputStream fis = new FileInputStream("store.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		myList =  (List<PerformedTranslation>) ois.readObject();
		
		ois.close();
		fis.close();
		return myList;
	}
}