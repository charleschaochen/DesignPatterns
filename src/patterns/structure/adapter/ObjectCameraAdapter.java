package patterns.structure.adapter;

/**
 * �������������Cellphoneʵ�������Camera�ӿ�
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
