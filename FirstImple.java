import java.net.*;
import java.lang.String;
import java.rmi.*;
import java.rmi.server.*;
public class FirstImple extends UnicastRemoteObject implements First
{
    
	public  FirstImpl()throws RemoteException
	{
	//	throw new RemoteException();
	}
	public void cmpr(String s1,String s2)throws RemoteException
 	{
		int l=s1.length();
		int l2=s2.length();
		int c=0;
		if(l==l2)
		{
			for(int i=0;i<=l;i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
				c++;
				else
				c=0;	
			}
		}
		if(c!=0)
		{
			System.out.println("Strings are equal");
		}
		else
			System.out.println("strings are not equal");
	}
	public void rvs(String s1)throws RemoteException
	{
		String rev="";
		int l=s1.length();
		for(int i=l-1;i>0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println("Reverse:"+rev);
	}
	public void ct(String s1,String s2)throws RemoteException
	{
		s1=s1+s2;
	}
	public void cs(String s1,String s2)throws RemoteException
	{
		s1=s1.toLowerCase();
		System.out.println("lower:"+s1);
		s2=s2.toUpperCase();
		System.out.println("upper:"+s2);
	}
	
}
