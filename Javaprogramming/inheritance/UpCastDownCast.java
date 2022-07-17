package inheritance;

public class UpCastDownCast {

	public static void main(String[] args) {
    Fruit f = new Apple();
    f.getTotalCalories();
    
    
    Apple a = (Apple)f;
    f.getTotalCalories();
    a.gefffftOrigin();
    
    Fruit f1 =new Fruit();
    Apple a1 =(Apple) f1;
	}

}
