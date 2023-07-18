import ea.*;

/**
 * Beschreiben Sie hier die Klasse Main.
 * 
 * @author Karol Bakas
 * @version 18.07.23
 */
public class FlappingBirdo extends Game implements Ticker
{
    /**
     * Der 'Spieler'
     */
    private Hintergrund hintergrund;
    private UI ui;
    private Player player;
    private Kreis kreis;

    /**
     * Konstruktor-Methode.<br />
     * Diese Methode richtet die beiden Grafiken ein.<br />
     * Die Kamera wird hierbei jedoch NICHT eingestellt.
     */
    public FlappingBirdo() {
        super(1280, 720,"Flapping-Birdo");

        //ui = new UI(statischeWurzel);
        hintergrund = new Hintergrund(wurzel, 1280, 720);
        ui = new UI(statischeWurzel,4);

        player = new Player();
        wurzel.add(player);

        //Zusätzlich wird für die kontinuierliche Bewegung der Spielfigur
        //noch das Ticker-Interface angemeldet, damit die tick-Methode
        //alle 20 ms aufgerufen wird.
        tickerAnmelden(this, 20);

        Kreis k2 = new Kreis(250, 165, 20);
        k2.farbeSetzen("Gelb");
        k2.newtonschMachen();

        Rechteck untergrund = new Rechteck(0,720-40, 1280, 40);
        untergrund.farbeSetzen("Gruen");
        untergrund.passivMachen(); 

        k2.aktivMachen();
        wurzel.add(untergrund,k2);

    }

    /**
     * Diese Methode sorgt dafuer, das ab sofort der Kreis im <i>Fokus</i>
     * der Kamera liegt.<br />
     * Als Parameter der Methode <code>fokusSetzen</code> in der Kamera wird 
     * ein beliebiges <code>Raum</code>-Objekt verlangt. Man kann also ein beliebiges 
     * anderes grafisches Objekt hier einsetzen!
     */
    public void fokusMachen() {
        //Den 'Spieler' als Fokus bei der Kamera setzen
        cam.fokusSetzen(player);
    }

    /**
     * Taste-Reagieren-Methode.<br />
     * Hierdrin wird auf den Tasten W/A/S/D der Kreis als Spielfigur bewegt. Auf 
     * den Pfeiltasten wird die Kamera bewegt.<br /><br />
     * 
     * <b>ACHTUNG</b><br />
     * Auch wenn die Methode fuer die Kamera und <code>Raum</code>-Objekte <code>verschieben</code> 
     * heisst, leitet sich die Klasse Kamera <b>nicht</b> aus <code>Raum</code> ab!
     */
    @Override
    public void tasteReagieren(int tastencode) {
    }

    public void tick() {
        //ist gerade die Pfeiltaste rechts gedrückt?
        if(tasteGedrueckt(Taste.RECHTS)) {
            //Verschiebe die Figur um 1 Pixel nach rechts.
            player.bewegen(2, 0);
            //hintergrund.verschieben(2,0);
        }

        //ist gerade die Pfeiltaste links gedrückt?
        if(tasteGedrueckt(Taste.LINKS)) {
            //Verschiebe die Figur um 1 Pixel nach links.
            player.bewegen(-2, 0);
            //hintergrund.verschieben(-2,0);
        }
    }

}
