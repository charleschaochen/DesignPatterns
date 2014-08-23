package patterns.structure.adapter;

/**
 * 相机适配器，将Cellphone实例适配成Camera接口
 * 
 * @author Charles Chen
 * 
 */
public class ObjectCameraAdapter extends Cellphone implements Camera {
	private Cellphone phone;

	public ObjectCameraAdapter(Cellphone phone) {
		this.phone = phone;
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		super.photoByPhone();
	}
}
