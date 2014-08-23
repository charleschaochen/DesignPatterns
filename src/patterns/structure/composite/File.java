package patterns.structure.composite;

public interface File {
	void description();

	void listFiles();

	void addFile(File file);

	void removeFile(File file);
}
