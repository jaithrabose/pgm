import java.rmi.*;
import java.rmi.server.*;
import java.rmi.Naming.*;
import java.rmi.registry.*;
import java.io.*;
public class Fserv
{
	public static void main(String args[])throws IOException
	{
		try
		{
			FirstImpl f=new FirstImpl();
			Naming.rebind("localhost",f);
			System.out.println("server bound");
		}
		catch(Exception e)
		{}
	}
}
