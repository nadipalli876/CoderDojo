package DataBase;

import model.Pet;

public class PetInfo {

		public Pet getpet(String breed) {
			if(breed.equals("Labrodor retriever")){
			Pet lr=new Pet();
			lr.breed=breed;
			lr.Des="The Lab makes his 25th straight appearance as the number one breed. And why not? This family-friendly, smart, and fun-loving breed is a favorite in households across America. Their desire to please and gentle disposition also help them excel as guide dogs and search-and-rescue dogs.";
			return lr;
			}
			else if (breed.equals("German shepherd")) {
				 Pet gs = new Pet();
		            gs.breed = breed;
		            gs.Des= "A true dog lover’s pet, the German Shepherd Dog is intelligent and hardworking. They are also known to be extremely versatile and courageous. No wonder they are so often trained to "
		                + "assist people with disabilities, the  police, the military, and other service organizations.";
		            return gs;
				
			}
			else if(breed.equals("Golden Retriever")) {
				Pet gr=new Pet();
				gr.breed=breed;
				gr.Des="A very athletic breed, the Golden Retriever is another family-friendly pet with a fantastic demeanor. Because they love to run and play, they’re a great fit for families with young children. Also skilled workers, Goldens are popular hunting companions, guide dogs, and search-and-rescue dogs.";
				return gr;
			}
			else if(breed.equals("Bulldog")) {
				Pet bd=new Pet();
				bd.breed=breed;
				bd.Des="One of the fastest-growing breeds in terms of popularity, Bulldogs are fun and loveable. They are very calm when compared with the previously mentioned breeds, and they make great companions. They don’t need a ton of exercise—they actually prefer to stay home and relax most of the time.\n"
						+ "\n"
						+ "";
				return bd;
			}
			else if(breed.equals("French Bulldog")) {
				Pet fbd=new Pet();
				fbd.breed=breed;
				fbd.Des="French Bulldogs have mixed demeanors—sometimes they love to run and play, and sometimes they just want to lie around and be loved. They thrive from human contact and attention, so this isn’t a breed to be kept alone for hours at a time.";
				return fbd;
			}
			else if(breed.equals("Yorkshire Terrier")) {
				Pet yt=new Pet();
				yt.breed=breed;
				yt.Des="“Yorkies” are the most popular small dog breed in America. They become extremely devoted to their owners, and their small stature makes them a great choice for people who live in condos or apartments. They can be a bit feisty at times, but overall this brave and energetic breed is excellent for anyone wanting a small companion.";
				return yt;
			}
			else if(breed.equals("Poodle")) {
				Pet p=new Pet();
				p.breed=breed;
				p.Des="Poodles are known for making regular appearances in dog shows. Their elegant form never goes unnoticed, but their personalities are just as charming as their looks. They’re smart, easy to train, eager to please, and lots of fun to be around.";
				return p;
			}
			else if(breed.equals("Rottweiler")) {
				Pet rw=new Pet();
				rw.breed=breed;
				rw.Des="Large and powerful, Rottweilers are sometimes misunderstood because of their stature. They are actually very intelligent, easily trained, and willing to work. Their broad chests and muscular bodies stand out, but Rottweilers have even bigger hearts and make for devoted companions.";
				return rw;
			}
			else if(breed.equals("Boxer")) {
				Pet bo=new Pet();
				bo.breed=breed;
				bo.Des="Boxers have endless energy and love to play. Although they can be headstrong at times, Boxers are extremely loyal to their owners. They are great with kids while also being alert and courageous.";
				return bo;
			}
			return null;
		}
}
