import java.util.*;
public class MotuSamosa
{
	public static void main(String args[])
	{
		Scanner xyz=new Scanner (System.in);
		System.out.println("Put Number of Samosa in plate, Quantiry?\t");
		int quantity=xyz.nextInt();
		boolean flag=true;
		while(quantity!=0)
		{	if(flag)
			{
				if(quantity==1)
				{
					System.out.println("You Pick Last One, You Loss The Game!");break;
				}
				else
				{
					System.out.println("Pick Samosa User-Side?\t");
					int samosa=xyz.nextInt();
					if(samosa>=1 && samosa<=4)
					{
						quantity=quantity-samosa;
						
					}
					else	
					{
						System.out.println("Pick Samosa Limt 1 - 4 Only, You Loss The Game!");
						break;
					}
					
					
				}
				flag=false;
			}
			if(flag==false)
			{
				if(quantity>4)
				{
					System.out.println("\nMotu Pick : 4");
					quantity=quantity-4;
				}
				else if(quantity==4)
				{
					System.out.println("\nMotu Pick : 3");
					quantity=quantity-3;
				}
				else if(quantity==3)
				{
					System.out.println("\nMotu Pick : 2");
					quantity=quantity-2;
				}
				else if(quantity==2)
				{
					System.out.println("\nMotu Pick : 1");
					quantity=quantity-1;
				}
				else if(quantity==1)
				{
					System.out.println("\nMotu Loss The Game!");break;
				}
				flag=true;
			}
			
		}
	}
}