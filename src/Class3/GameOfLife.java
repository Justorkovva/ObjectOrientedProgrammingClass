package Class3;

public class GameOfLife {

	public static void main(String[] args) {
		
		Universe world = new Universe();
		for(int i=0;i<3;i++)
		{
		System.out.println(world.toString());
		world.nextStep();
		}

	}

}
