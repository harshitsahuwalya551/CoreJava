package entities;

class Cat{
	int j;
	Cat(int j){
		this.j = j;
	}
}
class Dog implements Cloneable{
    Cat c;
    int i;

    Dog(Cat c, int i) {
        this.c = c;
        this.i = i;
    }

	@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Launch2 {
	public static void main(String[] args)throws CloneNotSupportedException {
		Cat c = new Cat(10);
		Dog d = new Dog(c, 20);
		
		Dog d1 = (Dog)d.clone();
		d1.c.j=100;
		d1.i=200;
		System.out.println(d.c.j+"=====>"+d.i);
		System.out.println(d1.c.j+"=====>"+d1.i);
	}
}
