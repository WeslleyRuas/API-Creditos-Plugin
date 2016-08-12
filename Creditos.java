package me.weslleyruas.wrblockcmds;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Creditos {
	public static void createCreditos()
	{
		File file = new File(Main.c.getDataFolder(), "creditos.txt");
        BufferedWriter escrever = null;
        /* Se o arquivo creditos.txt na pasta do plugin nao existir, ele cria */
        if(!file.exists())
        {
        	try 
        	{
        		escrever = new BufferedWriter(new FileWriter(file));
        		escrever.write("Criador : Weslley Ruas");
        		escrever.newLine();
        		escrever.write("FB: https://www.facebook.com/weslleysaantoss");
        		escrever.newLine();
        		escrever.write("GamersBoard Profile: http://gamersboard.com.br/user/12344-weslleyruas/");
        	} 
        	catch ( IOException e ) 
        	{
        		e.printStackTrace();
        	} 
        	finally 
        	{
        		if ( escrever != null ) 
        		{
        			try 
        			{
        				escrever.close();
        			} 
        			catch (IOException e) 
        			{
        				e.printStackTrace();
        			}
        		}
        	}
		}
		/* Se o arquivo creditos.txt existir ele checa se o arquivo esta sem os creditos devidos */
        else
        {
			try {
				String line1 = (String) FileUtils.readLines(file).get(0);
				String line2 = (String) FileUtils.readLines(file).get(1);
				String line3 = (String) FileUtils.readLines(file).get(2);
				if(!line1.equalsIgnoreCase("Criador : Weslley Ruas") || line2.equalsIgnoreCase("FB: https://www.facebook.com/weslleysaantoss") || line3.equalsIgnoreCase("GamersBoard Profile: http://gamersboard.com.br/user/12344-weslleyruas/"))
				{
					file.delete();
					System.out.println("Creditos nao detectado, deletando e criando novamente!");
					try 
		        	{
		        		escrever = new BufferedWriter(new FileWriter(file));
		        		escrever.write("Criador : Weslley Ruas");
		        		escrever.newLine();
		        		escrever.write("FB: https://www.facebook.com/weslleysaantoss");
		        		escrever.newLine();
		        		escrever.write("GamersBoard Profile: http://gamersboard.com.br/user/12344-weslleyruas/");
		        	} 
		        	catch ( IOException e ) 
		        	{
		        		e.printStackTrace();
		        	} 
		        	finally 
		        	{
		        		if ( escrever != null ) 
		        		{
		        			try 
		        			{
		        				escrever.close();
		        			} 
		        			catch (IOException e) 
		        			{
		        				e.printStackTrace();
		        			}
		        		}
		        	}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
	}
}
