package Commande;

public class VolummeUp implements Commands {
	private DeviceElectric tv2;
	public VolummeUp(DeviceElectric tv2) {
		super();
		this.tv2 = tv2;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv2.volumeUp();
		
	}

}
