import taller3.televisores;

public class Control{
    private TV tv;

    public void enlazar(TV televisor){
        tv = televisor;
        televisor.setControl(this);
    }

    public TV getTV(){
        return tv;
    }

    public void setTV(TV televisor){
        tv = televisor;
        televisor.setControl(this);
    }

    public void turnOn(){
        tv.turnOn();
    }
    public void turnOff(){
        tv.turnDown();
    }

    public void canalUp(){
        tv.canalUp();
    }
    public void canalDown(){
        tv.canalDown();
    }

    public void volumenUp() {
        tv.volumenUp();
    }
    public void volumenDown(){
        tv.volumenDown();
    }

    public void setCanal(int canal){
        tv.setCanal(canal);
    }
    public void setVolumen(int volumen){
        tv.setVolumen(volumen);
    }
}