import java.util.*;
public abstract class EatsFood {
	List<Food> diet = new ArrayList<Food>();
	
	void addFood(Food f) {
		diet.add(f);
	}
	void removeFood(Food f) {
		diet.remove(f);
	}
	List<Food> listFood() {
		return diet;
	}
	abstract void consume();
}
