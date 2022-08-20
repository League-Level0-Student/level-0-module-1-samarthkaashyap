package _05_for_loops._2_badgers;

public class Badgers {
public static void main(String[] args) {
int x = 0;
int finalx = 12;
int y = 0;
int finaly = 2;
int z = 0;
int finalz = 2;
for (z=0; z<=2; z+=1) {	
for (x=0; x<=finalx; x+=1) {
		System.out.print(" Badger,");
	}
	for (y=0; y<finaly; y+=1) {
		System.out.print(" Mushroom,");
	}
}
System.out.print(" A Snake!!!");

}
}


