package patterns.structure.composite;

import java.util.Date;

public class AbstractFile implements File {
	protected String fileName;
	protected Date creationDate;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
	}

	@Override
	public void addFile(File file) {
		// TODO Auto-generated method stub

	}

	@Override
	public void listFiles() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeFile(File file) {
		// TODO Auto-generated method stub

	}

}
