package com.mooldi.otherclasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

	public void saveMultiGameToFile(Player player, MultiGame game){
		int points = player.getPoints();
		int completed = player.getCompleted();
		int[][] resultArr = game.getResultArr();
		String fileName = "gamefiles/" + player.getName() + ".txt";
		File file = new File(fileName);
		try{
			//file.mkdir();		TODO! Mappen ska skapas om den inte finns
			file.createNewFile();
		
			FileWriter writer = new FileWriter(file);
			
			writer.write(points+"\n");
						writer.write(completed+"\n");
			
			for (int x = 0; x < 13; x++){
				for (int y = 0; y < 13; y++){
					writer.write(resultArr[x][y]+"\n");
				}
			}
			
			writer.flush();
			writer.close();
		
		} catch(IOException e){
			System.out.println(e.getMessage());
		} catch(SecurityException e){
			System.out.println(e.getMessage());
		}
	}

	public void saveDivGameToFile(Player player, DivGame game){

	}

	public boolean startMultiGame(Player player, MultiGame game){
		String fileName = "gamefiles/" + player.getName() + ".txt";
		File file = new File(fileName);
		Boolean exists = file.exists();
		
		try{
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			player.setPoints(Integer.parseInt(bufferedReader.readLine()));
			player.setCompleted(Integer.parseInt(bufferedReader.readLine()));
			
			for (int x = 0; x < 13; x++){
				for (int y = 0; y < 13; y++){
					game.resultArr[x][y] = Integer.parseInt(bufferedReader.readLine());
				}
			}
			bufferedReader.close();
		} catch (FileNotFoundException e){
			e.getMessage();
		} catch (IOException e){
			e.getMessage();
		} 

		return exists;
	}

	public boolean startDivGame(Player player, DivGame game){


		return true;
	}
}
