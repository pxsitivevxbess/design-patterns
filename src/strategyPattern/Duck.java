package strategyPattern;

public abstract class Duck {
	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;
	public void performFly()
	{
		flyBehaviour.fly();
	}
	public void performQuack() {
		quackBehaviour.quack();
	}

}
