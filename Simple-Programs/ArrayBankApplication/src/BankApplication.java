import java.lang.Math;
import java.util.Scanner;
import java.io.*;
public class BankApplication
{
	public static void main(String args[]) throws IOException ,ClassNotFoundException
	{
		int choice,choice1,choice2;
		
		String name,password;
		Scanner scn=new Scanner(System.in);
		Saving obj=new Saving((float)1.5);
		Current obj1=new Current();
		boolean flag;		
		
		Saving obj2=new Saving((float)1.5);	
		Current obj3=new Current();
	
		File f=new File("Saving_Account_Details.txt");
		flag=f.exists();
		if(flag==true)
		{
			//System.out.println("Input Exist");
			FileInputStream fis=new FileInputStream(f);
			ObjectInputStream ois= new ObjectInputStream(fis);
			obj2=(Saving)ois.readObject();
			//System.out.println("Name : "+obj2.userName);
			ois.close();
			fis.close();
			
		}		
		File f1=new File("Current_Account_Details.txt");
		flag=f1.exists();
		if(flag==true)
		{
			//System.out.println("Input Exist");
			
			FileInputStream fis1=new FileInputStream(f1);
			ObjectInputStream ois1= new ObjectInputStream(fis1);
			obj3=(Current)ois1.readObject();
			ois1.close();
			fis1.close();
		}

		do
		{
			System.out.println("\n\n\n 1. Create a new Account : \n 2. Login \n 3. Exit\n Enter Your Choice : ");
			choice=scn.nextInt();
			switch(choice)
			{
				case 1 :
					do
					{
						System.out.println(" \n\n\n 1. Saving \n 2. Current \n 3. Back to Main Menu \n Enter Your Choice : ");
						choice1=scn.nextInt();
						switch(choice1)
						{
							case 1:
								obj.getSavingAccount();
								break;
							case 2 :
								obj1.getCurrentAccount();
								break;
							case 3 :	
								break;
						}
					}
					while(choice1!=3);
				
					break;			
				case 2 :
					do
					{
						System.out.println("\n\n\n 1. Saving \n 2. Current \n 3. Back to Main Menu \n Enter Your Choice : ");
						choice1=scn.nextInt();
						switch(choice1)
						{
							case 1 :
								System.out.println("Enter User Name : ");
								name=scn.next();
								System.out.println("Enter Password : ");
								password=scn.next();
								if(name.equalsIgnoreCase(obj2.userName)&&password.equals(obj2.pass))
								{
									System.out.println("\n\n\n------------------------Login Successfull--------------------------");
									do
									{
										System.out.println("\n\n\n 1. Deposit \n 2. Withdrawl \n 3. Check Balance \n 4. Display Detils \n 5. Log Out\n Enter Your Choice : ");
										choice2=scn.nextInt();
										switch(choice2)
										{
											case 1 :
												obj2.deposit();
												break;
											case 2 :
												obj2.withdrawl();
												break;
											case 3 :
												obj2.checkBalance();
												break;
											case 4 : 	
												obj2.displaySavingAccount();
												break;
											case 5 :
												System.out.println("\n\n\n\n---------------------------Log Out ----------------------------------------------");
												break;
											default :
												System.out.println("\n\nInvalid Choice");
										}
									}
									while(choice2!=5);
								}
								else
								{
									System.out.println("\n\n\n------------------------Login Failed------------------------------");
								}
								

								break;
							case 2 :						
								System.out.println("Enter User Name : ");
								name=scn.next();
								System.out.println("Enter Password : ");
								password=scn.next();
								if(name.equalsIgnoreCase(obj3.userName)&&password.equals(obj3.pass))
								{
									System.out.println("\n\n\n------------------------Login Successfull---------------------------");
									do
									{
										System.out.println("\n\n\n 1. Deposit \n 2. Withdrawl \n 3. Check Balance \n 4. Display Account Details \n 5. Exit\n Enter Your Choice : ");
										choice2=scn.nextInt();
										switch(choice2)
										{
											case 1 :
												obj3.deposit();
												break;
											case 2 :
												obj3.withdrawl();
												break;
											case 3 :
												obj3.checkBalance();
												break;
											case 4 :
												obj3.displayCurrentAccount();
												break;
											case 5 :
												System.out.println("\n\n\n\n-----------------------------Log Out----------------------------------------------------");
												break;
								
											default :
												System.out.println("\n\nInvalid Choice");
								
										}
									}
									while(choice2!=5);
								}
								else
								{
									System.out.println("\n\n\n---------------------Login Failed------------------------------");
								
								}
								
								break;
							case 3 :
								break;
						}
					}
					while(choice1!=3);	
					break;
				case 3 :
					System.out.println("\n\n\n\n----------------------- Exit from the Application ------------------------------");
				
					flag=f.exists();
					if(flag==true)
					{
						FileOutputStream fos=new FileOutputStream(f);
						ObjectOutputStream oos=new ObjectOutputStream(fos);
						//System.out.println("In the exists");
						oos.writeObject(obj2);
						oos.close();
						fos.close();
					
					}
					else if(flag==false)
					{
						f.createNewFile();
					
						FileOutputStream fos=new FileOutputStream(f);
						ObjectOutputStream oos=new ObjectOutputStream(fos);
						//System.out.println(" File New");
						oos.writeObject(obj);
						oos.close();
						fos.close();
					}
					

				
					flag=f1.exists();
					if(flag==true)
					{
						//System.out.println("  Current File Exists");
						FileOutputStream fos1=new FileOutputStream(f1);
						ObjectOutputStream oos1=new ObjectOutputStream(fos1);
						oos1.writeObject(obj3);
						oos1.close();
						fos1.close();
					}
					else if(flag==false)
					{
						f1.createNewFile();
						FileOutputStream fos1=new FileOutputStream(f1);
						ObjectOutputStream oos1=new ObjectOutputStream(fos1);
						//System.out.println("Current File New");
				
						oos1.writeObject(obj1);
						oos1.close();
						fos1.close();
					}
					break;
				default :
					System.out.println("Invalid Choice ");
			
			}
		}
		while(choice !=3);
/*
	}

	catch(EOFException e)
	{
		e.printStackTrace();
		System.out.println("In the EOFException");
	}
	catch(Exception e)
	{
		System.out.println("In the Exception");
	}
*/
	}

}

class Saving implements Serializable
{
	double accNo;
	String userName;
	String pass;
	float balance;
	float rate;
	float time;	
	float time1;
	public Saving(float x)
	{
		rate=x;
	}

	void getSavingAccount()
	{
		Scanner scn2=new Scanner(System.in);

		System.out.println("Enter UserName : ");
		userName=scn2.nextLine();
		System.out.println("Enter Password : ");
		pass=scn2.next();
		do
		{
		System.out.println("Enter Balance : ");
		balance = scn2.nextFloat();
		if(balance<=5000)
		{
			System.out.println("Please deposit more than 5000");
			
		}
		}
		while(balance<=5000);
		accNo=Math.random()*1000;
	
		System.out.println("Enter a Time in a Year  : ");
		time=scn2.nextFloat();
		balance=balance+(balance*rate*time)/100;		
	}
	void displaySavingAccount()
	{
		System.out.println("\n\nAccount Number : "+accNo+"\nUser Name : "+userName+"\nBalance : "+balance);
		
		System.out.println("Rate : "+rate+"\nTime :"+time);
	}
	void deposit()
	{
		Scanner scn2=new Scanner(System.in);

		int amount;
		System.out.println("Enter Amount For deposit : ");
		amount=scn2.nextInt();
		System.out.println("Enter Time : ");
		time1=scn2.nextFloat();
		if(amount<0||time1<0)
		{
			System.out.println("\n\n\n--------------------------Deposit Fail--------------------------------------");
		
		}
		else
		{
			balance=balance+amount+(amount*time1*rate)/100;
			System.out.println("\n\n\n------------------------Deposit Successfull--------------------------------------");
		}
	}
	void withdrawl()
	{
		Scanner scn2=new Scanner(System.in);

		int amount;
		System.out.println("Enter Amount for Withdrawl : ");
		amount=scn2.nextInt();
		if(balance-amount<=5000)
		{
			System.out.println("\n\n------------------Withdrawl Declined------------------------ ");
		}
		else
		{
			balance=balance-amount;
			System.out.println("\n\n------------------Withdrawl Successfull------------------------ ");
		}
	}
	void checkBalance()
	{
		System.out. println("Balance : "+balance);
	}
	
}
class Current implements Serializable
{
	double accNo;
	String userName;
	String pass;
	float balance;
 
	void deposit()
	{
		Scanner scn3=new Scanner(System.in);
		int amount;
		
		System.out.println("Enter Amount for deposit : ");
		amount=scn3.nextInt();
		if(amount<0)
		{
			System.out.println("\n\n\n-------------------------------Deposit Fail--------------------------------------");
			
		}
		else
		{
			balance=balance+amount;
			System.out.println("\n\n\n-------------------------------Deposit Successfull--------------------------------------");
		}
	}
	void getCurrentAccount()
	{
		Scanner scn3=new Scanner(System.in);
		System.out.println("Enter UserName : ");
		userName=scn3.nextLine();
		System.out.println("Enter Password : ");
		pass=scn3.next();
		do
		{
		System.out.println("Enter Balance : ");
		balance = scn3.nextFloat();
		if(balance<=5000)
		{
			System.out.println("Please deposit more than 5000");
			
		}
		}
		while(balance<=5000);
		accNo=Math.random()*1000;
	
	}
	void displayCurrentAccount()
	{
		System.out.println("\n\nAccount Number : "+accNo+"\nUser Name : "+userName+"\nBalance : "+balance);
		
	}
	void withdrawl()
	{
		Scanner scn3=new Scanner(System.in);
		int amount;
		System.out.println("Enter Amount for Withdrawl : ");
		amount=scn3.nextInt();
		if(balance-amount<=5000)
		{
			System.out.println("\n\n------------------Withdrawl Declined------------------------ ");
		}
		else
		{
			balance=balance-amount;
			System.out.println("\n\n------------------Withdrawl Successfull------------------------ ");
		}
	}
	void checkBalance()
	{
		System.out. println("Balance : "+balance);
	}
	
}