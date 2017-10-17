package Commande;

public class Telecommande {

	Commands commande0;

	public Telecommande(Commands commande0) {
		super();
		this.commande0 = commande0;
	}
	 public void lancer(){
		 commande0.execute();
	 }
}
