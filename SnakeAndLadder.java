public class SnakeAndLadder {
	public static final int Ladder = 0;
	public static final int Snake = 1;

	public static void main(String[] args) {
	int Player_1_Position = 0;
	int SnakeORLadder; 
	//int Player_2_Position = 0;
  while (Player_1_Position < 100)
   {
	int Player_1 = (int)(Math.random() * 10) % 7;
	
	if(Player_1 == 0){
	System.out.println(Player_1_Position);
	}
	else {
	SnakeORLadder = (int)(Math.random() * 10) % 2;
	System.out.println(SnakeORLadder);
	System.out.println(Player_1);

	switch(SnakeORLadder) {
	case Ladder:
	Player_1_Position += Player_1;
	break;
	case Snake:
	Player_1_Position -= Player_1;
		if (Player_1_Position < 0)
			Player_1_Position =0;
	break;
	default:
	System.out.println(Player_1_Position);
	}
	}
	System.out.println("Player-1 Position : "+Player_1_Position );
		if (Player_1_Position > 100)
			Player_1_Position -= Player_1;
   }
	System.out.println(Player_1_Position);
	}
}
