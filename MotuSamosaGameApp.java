import java.util.*;
public class MotuSamosaGameApp
{
	public static void main(String args[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Put Samosas in Plate?\t");
		int range=xyz.nextInt();
		while(range!=0)
		{
			System.out.println("Pick Samosa, Range 1 - 4 only :\t");
			int samosa=xyz.nextInt();
			if(samosa>4)
			{
				System.out.println("pick samosa range 1 to 4 only");break;
			}
			else 
			{
				if(range==1)
				{
					System.out.println("You Loss!");break;
				}
				else
					range=range-samosa;
		
				if(range>4)
					{
						System.out.println("Motu Pick Samosa : 4");
						range=range-4;
					}
					else if(range==4)
					{
						System.out.println("Motu Pick Samosa : 3");
						range=range-3;
					}
					else if(range==3)
					{
						System.out.println("Motu Pick Samosa : 2");
						range=range-2;
					}
					else if(range==2)
					{
						System.out.println("Motu Pick Samosa : 1");
						range=range-1;
					}
					else if(range==1)
					{
						System.out.println("Motu Loss!");
						break;
					}
			}
		}
	}
}