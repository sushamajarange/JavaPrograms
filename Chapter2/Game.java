
class Animal {
	 void moveAnimal() {
	}
}
 interface Animatable {
	void animate();
}

public class Game extends Animal implements Animatable{
	Game(){
		System.out.print("Game...");
	}
	 public void animate() {
		System.out.print("Animating");
	}
	 public static void main(String[] args){
		 Game g = new Game();
		 Object o = g;
		 // Animal a = o ;		// We can't initialize an Object class's object to other class's object
	 }
}

