package patterns.structure.composite;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 普通单个文件类
 * 
 * @author Charles Chen
 * 
 */
public class TextFile extends AbstractFile {
	/**
	 * Constructor
	 * 
	 * @param fileName
	 * @param creationDate
	 */
	public TextFile(String fileName, Date creationDate) {
		this.fileName = fileName;
		this.creationDate = creationDate;
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("File Name: "
				+ fileName
				+ ", Creation Date: "
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
						.format(creationDate));
	}
}
