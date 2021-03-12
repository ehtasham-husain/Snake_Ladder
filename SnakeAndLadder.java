public class SnakeAndLadder {
	public static void main(String[] args) {
	int Snake_Position = 0;
	int Ladder_Position = 0;
	double Snake = Math.floor(Math.random() * 10) % 7;
	double Ladder = Math.floor(Math.random() * 10) % 7;
	System.out.println(Snake+","+Ladder);
	}
}
