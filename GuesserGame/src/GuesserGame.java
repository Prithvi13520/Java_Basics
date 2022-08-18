import java.util.Scanner;

class Guesser
{
	int guessNum;
	public int guessNumber()
	{
		System.out.println("Guesser Kindly Guess the Number");
		Scanner in=new Scanner(System.in);
		guessNum=in.nextInt();
		return guessNum;
	}
}

class Player1
{
	
	int p1guessNum;
	public int guessNumber()
	{
		System.out.println("Player1 Kindly Guess the Number");
		Scanner in=new Scanner(System.in);
		p1guessNum=in.nextInt();
		return p1guessNum;
	}
}

class Player2
{
	
	int p2guessNum;
	public int guessNumber()
	{
		System.out.println("Player2 Kindly Guess the Number");
		Scanner in=new Scanner(System.in);
		p2guessNum=in.nextInt();
		return p2guessNum;
	}
}

class Player3
{
	
	public int p3guessNum;
	int guessNumber()
	{
		System.out.println("Player3 Kindly Guess the Number");
		Scanner in=new Scanner(System.in);
		p3guessNum=in.nextInt();
		return p3guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
	}
	
	void collectNumFromPlayers()
	{
		
		Player1 p1=new Player1();
		Player2 p2=new Player2();
		Player3 p3=new Player3();
		numFromPlayer1=p1.guessNumber();
		numFromPlayer2=p2.guessNumber();
		numFromPlayer3=p3.guessNumber();
	}
	
	void compare() 
	{
		if(numFromGuesser<=10&&numFromPlayer1<=10&&numFromPlayer2<=10&&numFromPlayer3<=10)
		{
		if(numFromGuesser==numFromPlayer1) 
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) 
			{
				System.out.println("Game Tied!!");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("player1 and player2 won the game!");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("player1 and player3 won the game!");
			}
			else
			{
				System.out.println("player1 won the game!");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("player2 and player3 won the game!");
			}
			else
			{
				System.out.println("player2 won the game!");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("player3 won the game!");
		}
		else
		{
			System.out.println("Invalid Guess!!");
		}
				
	}
	else
	{
		System.out.println("Invalid Input");
	}
	}
	
}

public class GuesserGame 
{

	public static void main(String[] args) 
	{
    	Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();

	}

}
