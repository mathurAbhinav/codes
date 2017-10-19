import java.io.*;
class Question2
{
	public static void main(String args[])throws IOException
	{
		try
		{
			FileInputStream fin=new FileInputStream("/home/160905122/Chantal/Week10/Test.txt");
			int charc,num,word,line,i;
			char charcs;
			charc=num=word=line=0;
			i=fin.read();
			while(i!=-1)
			{
				charcs=(char)i;
				if(Character.isDigit(charcs))
					{num++;}
				else if(Character.isLetter(charcs))
					{charc++;}
				else if(charcs=='.'||charcs==' '||charcs=='\n')
					{word++;}
				if(charcs=='\r'||charcs=='\n')
					{line++;}
				i=fin.read();
			}
			System.out.println("Characters= "+charc+"\nNumbers= "+num+"\nWords= "+word+"\nLines= "+line);
			fin.close();
		}
	  	catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}	
