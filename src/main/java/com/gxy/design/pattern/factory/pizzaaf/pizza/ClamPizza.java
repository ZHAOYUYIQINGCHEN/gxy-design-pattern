package com.gxy.design.pattern.factory.pizzaaf.pizza;

import com.gxy.design.pattern.factory.pizzaaf.indredient.PizzaIngredientFactory;
import com.gxy.design.pattern.factory.pizzaaf.pizza.Pizza;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
 
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}
}
