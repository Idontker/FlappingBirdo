import ea.*;
/**
 * Beschreiben Sie hier die Klasse Hintergrund.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Hintergrund
{

    /**
     * Der einfache Hintergrund
     */
    private Rechteck hintergrund;

    public Hintergrund(Knoten wurzel, int width, int height)
    {
        //Hintergrund einstellen und sichtbar machen
        hintergrund = new Rechteck(0, 0, width, height);
        hintergrund.farbeSetzen("Grau");
        wurzel.add(hintergrund);
        
    }
    
    public void verschieben(int x,int y) {
        hintergrund.verschieben(x,y);
    }
}
