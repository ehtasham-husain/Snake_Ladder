public class SnakeAndLadder {
	public static final int Ladder = 0;
	public static final int Snake = 1;

	public static void main(String[] args) {
	int Player_1_Position = 0;
	int Player_2_Position = 0;
	int SnakeORLadder; 
	
	int RollsDice = 0;
	
  while (Player_1_Position < 20 && Player_2_Position < 20)
   {
	RollsDice = ++RollsDice;
	int Player_1 = (int)(Math.random() * 10) % 7;
	
	System.out.println("Player-1 dice Number : " +Player_1);
	
	if(Player_1 == 0)
	{
		System.out.println("Player-1 position : "+Player_1_Position);
	}
	
	else 
	{
		SnakeORLadder = (int)(Math.random() * 10) % 2;
		

		switch(SnakeORLadder) 
		{
			case Ladder:
			System.out.println("LADDER");
			Player_1_Position += Player_1;
			System.out.println("Player-1 Position : "+ Player_1_Position);
			break;
		case Snake:
			System.out.println("SNAKE");
			Player_1_Position -= Player_1;
				if (Player_1_Position < 0)
				Player_1_Position =0;
				System.out.println("Player-1 Position : "+ Player_1_Position);
			break;
		default:
			System.out.println(Player_1_Position);
		}
	}

	//System.out.println("Player-2 Rolls the Dice **);
	int Player_2 = (int)(Math.random() * 10) % 7;
	System.out.println("Player-2 dice Number :" +Player_2);
	if(Player_2 == 0)
        {
                System.out.println("Player-2 position : "+Player_2_Position);
        }

        else
        {
                SnakeORLadder = (int)(Math.random() * 10) % 2;
                //System.out.println(SnakeORLadder);
                //System.out.println(Player_2);

                switch(SnakeORLadder)
                {
                        case Ladder:
			System.out.println("LADDER");
                        Player_2_Position += Player_2;
			System.out.println("Player-2 Position : "+ Player_2_Position);
                        break;
                case Snake:
			System.out.println("SNAKE");
                        Player_2_Position -= Player_2;
                                if (Player_2_Position < 0)
                                Player_2_Position =0;
				System.out.println("Player-2 Position : "+ Player_2_Position);
                        break;
                default:
                        System.out.println(Player_2_Position);
                }
        }
	//System.out.println("Player-1 Position : "+ Player_1_Position);
	//System.out.println("Player-2 Position : "+ Player_2_Position);
		if (Player_1_Position > 20)
			Player_1_Position -= Player_1;
		else if (Player_2_Position > 20)
                        Player_2_Position -= Player_2;

   }
	
	System.out.println("Total Number of rolls the Dice : "+ RollsDice);
	if (Player_1_Position == 20 )
	System.out.println("***PLAYER-1 WON THE GAME ***");
	else if(Player_2_Position == 20)
	System.out.println("***PLAYER-2 WON THE GAME ***");
	}
}
