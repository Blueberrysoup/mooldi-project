package com.mooldi.otherclasses;

import java.util.Random;

import com.mooldi.interfaces.GameInterface;

public class DivGame implements GameInterface{
	
	int[][] resultArr = new int[13][13];
	final int EASY = 2;
	final int MEDIUM = 5;	
	final int HARD = 10;
	Random rand = new Random();
	Integer currX = 0;
	Integer currY = 0;
	
	public void newDivArrays(){
		//initiera nya matriser när man spelar första gången
		//ange här vilka tal som ska anses vara EASY, MEDIUM och HARD
		//strunta i tabellerna 0 och 1
	}
	
	public String runGame(){
		//slumpa fram divisionstal
		//returnera som en sträng att visa i GUI:t, t.ex. 63 / 7
		return "";
	}
	
	public boolean checkAnswer(int answer){
		//ta in svaret som spelaren angivit
		//räkna ut talet currX / currY och se om det är == answer
		//returnera true/false beroende på om det är rätt svar
		return true;
	}
	
	public boolean isCleared(){
		//returnera true om ett tal (dvs currX / currY) är "avklarat" dvs om antal återstående försök på det talet är 0
		return false;
	}

	public int[][] getResultArr(){
		//returnera resultatmatriserna - används av FileHandlern när den ska spara ner nuvarande resultat i en fil
		//behöver ändras så att man kan hämta en mängd matriser istället för bara en (som man gör vid multiplikation)
		return resultArr;
	}
	
}
