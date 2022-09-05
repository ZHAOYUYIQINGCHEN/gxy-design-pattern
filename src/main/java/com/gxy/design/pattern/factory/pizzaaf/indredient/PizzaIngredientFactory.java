package com.gxy.design.pattern.factory.pizzaaf.indredient;

/**
 * 抽象工厂
 */
public interface PizzaIngredientFactory {

	/**
	 * 抽象工厂定义了一个接口，所有的具体工厂都必须实现此接口，这个接口包含了一组方法来生产产品
	 * @return
	 */
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
