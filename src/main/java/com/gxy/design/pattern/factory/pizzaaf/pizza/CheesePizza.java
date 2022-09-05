package com.gxy.design.pattern.factory.pizzaaf.pizza;

import com.gxy.design.pattern.factory.pizzaaf.indredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	/**
	 * 要制作披萨需要原料，
	 * 所以每个披萨类都需要从构造器参数中得到一个工厂
	 * 并把这个工厂存储到一个实例变量中
	 * @param ingredientFactory
	 */
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	public void prepare() {
		/**
		 * prepare 方法以一步步的创建芝士披萨，需要原料，和工厂要
		 */
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
