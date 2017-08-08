
public abstract class Duck {
	Flybehavior flybehavior;//����ä��� Flybehavior
	Quackbehavior quackbehavior;//����ä��� Quackbehavior
	void performQuack(){
		quackbehavior.quack();
	}
	void performFly(){
		flybehavior.fly();
	}
	void setQuackBehavior(Quack qb){
		quackbehavior = qb;
	}
	void setFlyBehevior(Flybehavior fb){
		flybehavior = fb;
	}
	void swim(){
		System.out.println("I'm swimming");
	}
	abstract void display();
}
