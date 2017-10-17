package Commande;

public class DeviceElectric {
	
	private int volume = 0;
	public void On(){
		System.out.println("on");
	}
	public void Off(){
		System.out.println("off");
	}
	public void volumeUp(){
		volume ++;
		System.out.println("le volume est :"+volume);
	}

}
