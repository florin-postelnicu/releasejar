package com.example.radiclass;

class Radio {
    void play()
    {
        System.out.println("Plays music");
    }
}
class Caravan extends Radio {
    void play(){

        System.out.println("Plays old classical hits");
    }
}

class RockAndRoll extends Caravan{
    void play (){
        System.out.println("Rock And Roll is the best baby");
    }
}
class TestRadio {
    public static void main(String[] args) {
        Caravan obj = new Caravan();
        obj.play();
        Radio rad = new Radio();
        rad.play();
        RockAndRoll rcr = new RockAndRoll();
        rcr.play();

}
}