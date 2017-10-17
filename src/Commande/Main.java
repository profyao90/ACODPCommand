package Commande;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeviceElectric r = new DeviceElectric();
		Commands c = new On(r);
		Telecommande t = new Telecommande(c);
		t.lancer();
		/*Commands c0 = new Off(r);
		Telecommande t0 = new Telecommande(c0);
		t0.lancer();
		Commands c1 = new VolummeUp(r);
		Telecommande t1 = new Telecommande(c1);
		t1.lancer();*/


	}

}
