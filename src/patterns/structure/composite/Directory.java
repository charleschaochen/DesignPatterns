package patterns.structure.composite;

import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Vector;
import java.util.Date;

/**
 * д©б╪нд╪Ч
 * 
 * @author Charles Chen
 * 
 */
public class Directory extends AbstractFile {
	private Vector<File> files = new Vector<File>();

	/**
	 * Constructor
	 * 
	 * @param fileName
	 * @param creationDate
	 */
	public Directory(String fileName, Date creationDate) {
		this.fileName = fileName;
		this.creationDate = creationDate;
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("Directory Name: "
				+ fileName
				+ ", Creation Date: "
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
						.format(creationDate));
	}

	@Override
	public void listFiles() {
		// TODO Auto-generated method stub
		Enumeration<File> fileEnum = files.elements();
		while (fileEnum.hasMoreElements()) {
			File file = fileEnum.nextElement();
			file.description();
			file.listFiles();
		}
	}

	@Override
	public void addFile(File file) {
		// TODO Auto-generated method stub
		files.add(file);
	}

	@Override
	public void removeFile(File file) {
		// TODO Auto-generated method stub
		files.remove(file);
	}

}
