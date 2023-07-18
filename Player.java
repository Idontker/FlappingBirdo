import ea.*;

/**
 * Beschreiben Sie hier die Klasse Player.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Player extends Figur   
{   
    public Player() {
        super(0, 600, "./res/Birdo2.eaf");
        aktivMachen();
    }

    public void bewegen(int x, int y){
        this.verschieben(x,y); 

    }

}
