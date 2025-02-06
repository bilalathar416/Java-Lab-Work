public class SecondLab{

public static void gotoXY(int x, int y){
System.out.print("\033[" +x+ ";" +y+ "H");
}
public static void printRectangle(int x, int y){

gotoXY(x,y);
System.out.println(" ___________");
gotoXY(x,y+1);
System.out.println("|           |");
gotoXY(x,y+2);	
System.out.println("|           |");
gotoXY(x,y+3);	
System.out.println("|___________|");
}
public static void eraseRectangle(int x, int y){

gotoXY(x,y);	
System.out.println("             ");
gotoXY(x,y+1);	
System.out.println("             ");
gotoXY(x,y+2);	
System.out.println("             ");
gotoXY(x,y+3);
System.out.println("             ");
}
public static void moveRectangle(int x, int y){
	

	eraseRectangle(x, y);

	x+= 25;
	y+= 10;
	gotoXY(x,y);
	if(x==65 && y==45){
	gotoXY(5, 45);
	}
	printRectangle(x, y);
}
public static void main(String [] args){
int x=5, y=5;
while(true){

	printRectangle(x, y);
	try{
	Thread.sleep(1000);
	} catch (InterruptedException e)
	{
	Thread.currentThread().interrupt();
	}	
	moveRectangle(x, y);

}	
	
	




}
}
