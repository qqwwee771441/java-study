package move;

public class MoverJUMP implements MovableJUMP {
	@Override
	public void moveUp() {
		System.out.printf("Move Up By %d\n", INTERVAL);
	}
	@Override
	public void moveDown() {
		System.out.printf("Move Down By %d\n", INTERVAL);
	}
	@Override
	public void moveRight() {
		System.out.printf("Move Right By %d\n", INTERVAL);
	}
	@Override
	public void moveLeft() {
		System.out.printf("Move Left By %d\n", INTERVAL);
	}
	@Override
	public void jump() 	{
		System.out.printf("Jump By %d\n", INTERVAL);
	}
}
