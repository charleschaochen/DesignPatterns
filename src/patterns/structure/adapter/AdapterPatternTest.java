package patterns.structure.adapter;


public class AdapterPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cellphone phone = new Cellphone();
		ObjectCameraAdapter adapter = new ObjectCameraAdapter(phone);
		takePhoto(adapter);
	}

	public static void takePhoto(Camera camera) {
		camera.photo();
	}
}
