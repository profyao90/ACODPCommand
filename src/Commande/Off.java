package Commande;

public class Off implements Commands {

	private DeviceElectric tv;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.Off();
		
	}
	public Off(DeviceElectric tv) {
		super();
		this.tv = tv;
	}

}
