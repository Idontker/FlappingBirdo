import ea.*;
/**
 * Beschreiben Sie hier die Klasse UI.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class UI
{

    /**
     * Der einfache Hintergrund
     */
    private Rechteck[] timer;
    private int zwischenraum = 30;
    private int timer_height = 50;
    private int timer_width = 100;
    private int current_timer;

    public UI(Knoten statischeWurzel, int timerLen) {
        //Hintergrund einstellen und sichtbar machen


        timer = new Rechteck[timerLen];

        for(int i = 0; i < timerLen; i++) {
            int x = i * timer_width + (i+1) * zwischenraum;
            int y = timer_height + zwischenraum;
            timer[i] = new Rechteck(x,y, timer_width, timer_height); 
            timer[i].farbeSetzen("Blau");
            statischeWurzel.add(timer[i]);

        }
        current_timer = timerLen;
    }

    public void setzteTimer(int zustand) {
        for(int i = 0; i < timer.length; i++) {
            if( i <= zustand){
                timer[i].setOpacity(1);
            } else {
                timer[i].setOpacity(0);
                
            }

        }
    }

}
