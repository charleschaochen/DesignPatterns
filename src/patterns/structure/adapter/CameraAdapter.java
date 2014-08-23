package patterns.structure.adapter;

/**
 * �������������Cellphone�����Camera�ӿ�
 * 
 * @author Charles Chen
 * 
 */
public class CameraAdapter extends Cellphone implements Camera {

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		super.photoByPhone();
	}
}
