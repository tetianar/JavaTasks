package patterns;

/**
 * Created by romas on 24.09.2016.
 */
public class State {
    public static void main (String[] args) {
        Station dfm = new RadioDFM();
        Radio radio = new Radio();
        radio.setStation(dfm);

        for (int i = 0; i < 10; i++){
            radio.nextStation();
            radio.play();
        }
    }
}
//State
interface Station{
    void play();
}

class Radio7 implements Station{
    public void play(){System.out.println("Radio7 ...");}
}

class RadioDFM implements Station{
    public void play(){System.out.println("Radio DFM ...");}
}

class NovunuFM implements Station{
    public void play(){System.out.println("NovunuFM ...");}
}

//Context
class Radio{
    Station station;
    void  setStation (Station st){station = st;}
    void  nextStation (){
        if (station instanceof Radio7){
            setStation(new RadioDFM());
        }
        else if (station instanceof  RadioDFM){
            setStation(new NovunuFM());
        }
        else if (station instanceof NovunuFM){
            setStation(new Radio7());
        }
    }
    void play(){station.play();}
}