package patterns.creation.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable, Serializable {
	private static final long serialVersionUID = 1L;
	public int id = 0;
	public ReferenceType rt = new ReferenceType();

	/**
	 * Shallow clone
	 * 
	 * @return
	 */
	public Prototype clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();
		return proto;
	}

	/**
	 * Deep clone
	 * 
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Prototype deepClone() throws IOException, ClassNotFoundException {
		// Serialize object
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		// Deserialize object
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (Prototype) ois.readObject();

	}

	public static void main(String[] args) {
		Prototype proto = new Prototype();
		System.out.println(proto);
		System.out.println(proto.rt);

		try {
			Prototype clone1 = proto.clone();
			System.out.println(clone1);
			System.out.println(clone1.rt);

			Prototype clone2 = proto.deepClone();
			System.out.println(clone2);
			System.out.println(clone2.rt);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class ReferenceType implements Serializable {
	private static final long serialVersionUID = 1L;

}