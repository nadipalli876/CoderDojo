package Client;

import DataBase.PetInfo;
import model.Pet;

public class PetDetail {

	public static void main(String[] args) {
		PetInfo info = new PetInfo();
		Pet lab = info.getpet("Labrodor retriever");
		System.out.println(lab.breed + " is the breed");
		System.out.println("Description " + lab.Des);
		lab = info.getpet("Golden Retriever");
		System.out.println(lab.breed + " is the breed");
		System.out.println("Description " + lab.Des);

	}

}
