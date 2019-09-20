/***
 * Grading Comments:
 * Beautiful.  Definitely got the idea on how to reduce work using
 * methods. 
 *  Compile/Works: 15/15
 *  Desired Output: 6/6
 *  Consistency: 2/2 - clean, you adopted good conventions and stuck with them.
 *  Efficiency: 2/2 - Great.   Got the idea of nesting methods and ran with it.
 *   You could still improve by creating a method that just does a 'print' 
 *   instead of 'println' with "There was an old lady who swallowed a"
 *   and then call it followed by System.out.println("fly"); (bird, spider...)
 *   But what you've done is clean and great and nearly optimal.
 *  25/25
 */
public class OldLady {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fly();
		System.out.println("");
		Spider();
		System.out.println("");
		Bird();
		System.out.println("");
		Cat();
		System.out.println("");
		Dog();
		System.out.println("");
		Horse();
	}
	
	public static void Perhaps() {
		System.out.println("Perhaps she'll die.");
	}
	public static void IDK() {
		System.out.println("I don't know why she swallowed that fly,");
	}
	public static void SSTSpider() {
		System.out.println("She swallowed the spider to catch the fly,");
	}
	public static void SSTBird() {
		System.out.println("She swallowed the bird to catch the spider,");
	}
	public static void SSTCat() {
		System.out.println("She swallowed the cat to catch the bird,");
	}
	public static void SSTDog() {
		System.out.println("She swallowed the dog to catch the cat,");
	}
	public static void Fly() {
		System.out.println("There was an old lady who swallowed a fly.");
		IDK();
		Perhaps();
	}
	public static void Spider() {
		System.out.println("There was an old lady who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		SSTSpider();
		IDK();
		Perhaps();
	}
	public static void Bird() {
		System.out.println("There was an old lady who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		SSTBird();
		SSTSpider();
		Perhaps();
	}
	public static void Cat() {
		System.out.println("There was an old lady who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
		SSTCat();
		SSTBird();
		SSTSpider();
		IDK();
		Perhaps();
	}
	public static void Dog() {
		System.out.println("There was an old lady who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
		SSTDog();
		SSTCat();
		SSTBird();
		SSTSpider();
		IDK();
		Perhaps();
	}
	public static void Horse() {
		System.out.println("There was an old lady who swallowed a horse,");
		System.out.println("She died of couse.");
	}

}
