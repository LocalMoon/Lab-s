package mypackage;
public class MaClass{ 
  
  static Player[] players = new Player[10];
	
  public static void main(String[] args) {
	  
  
  players[0] = new Player("Jesus", "Arsenal", "striker", "Brazil",26);
  players[1] = new Player("Saka","Arsenal","midfielder","England",21);
  players[2] = new Player("Dembele","Barcelona","striker","France",26);
  players[3] = new Player("Griezmann","Atletico","striker","France",32);
  players[4] = new Player("Trossard","Arsenal","midfielder","Belgium",28);
  players[5] = new Player("Martines","Inter","striker","Argentina",25);
  players[6] = new Player("Messi","PSG","striker","Argentina",35);
  players[7] = new Player("Gabriel","Arsenal","defender","Brazil",25);
  players[8] = new Player("Lewandovski","Barcelona","striker","Poland",34);
  players[9] = new Player("Holland","Manchester City","striker","Norway",22);
  
  //Сортировка по возрасту игроков
  for (int i=0; i < players.length;i++) {
	    int j_max = i;
	    for(int j= i+1; j < players.length; j++) {
	      if (players[j_max].age < players[j].age) {
	        j_max = j;
	      }
	    }
	    Player temp = players[i];
	    players[i] = players[j_max];
	    players[j_max] = temp;
	  }

  for (int i = 0; i<10;i++) {
      System.out.println(players[i].name + "   " + players[i].team + "   " + players[i].position + "   " + players[i].country + " " + players[i].age);
    }  
   } 
  }

class Player{
  String position,name,team,country;
  Integer age;
  
  public Player (String position,String name,String team,String country, Integer age) {
    this.name = name;
    this.team = team;
    this.position = position;
    this.country = country;
    this.age = age;
  }
} 