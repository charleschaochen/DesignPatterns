package patterns.structure.adapter;

/**
 * 相机适配器，将Cellphone适配成Camera接口
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
