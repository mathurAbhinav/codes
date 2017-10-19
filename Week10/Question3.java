import java.io.*;
public class Question3
{
	public static void main(String args[])
	{
		try 
		{
			String stringSearch="hell";
			BufferedReader bf=new BufferedReader(new FileReader("/home/160905122/Chantal/Week10/Test.txt"));
			int linecount=0;
			String line;
			System.out.println("Searching for " +stringSearch+" in file");
			while((line=bf.readLine())!=null)
			{
				linecount++;
				int indexfound=line.indexOf(stringSearch);
				if(indexfound>-1)
				{
					System.out.println(line);
					System.out.println("Word at pos "+indexfound+" on line "+linecount);
				}
			}
			bf.close();
		}
		catch(IOException e)
		{
			System.out.println("IO Error: "+e.toString());
		}
	}
}
