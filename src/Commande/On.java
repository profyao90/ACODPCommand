package Commande;

public class On implements Commands {

	private DeviceElectric tv1;
	public On(DeviceElectric tv1) {
		super();
		this.tv1 = tv1;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv1.On();
	}

}
