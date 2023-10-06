package lf.dev.basic.smarttv.domain;

public class SmartTv {
    public boolean on = false;
    public int channel = 1;
    public int volume = 25;

    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }

    public void turnUpVolume(){
        volume++;
    }

    public void turnDownVolume(){
        volume--;
    }

    public void turnUpChannel(){
        channel++;
    }

    public void turnDownChannel(){
        channel--;
    }

    public void changeChannel(int newChannel){
        channel = newChannel;

    }

}
