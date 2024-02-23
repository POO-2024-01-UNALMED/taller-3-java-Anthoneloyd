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
        TV.turnOn();
    }
    public void turnOff(){
        TV.turnDown();
    }

    public void canalUp(){
        TV.canalUp();
    }
    public void canalDown(){
        TV.canalDown();
    }

    public void volumenUp() {
        TV.volumenUp();
    }
    public void volumenDown(){
        TV.volumenDown();
    }

    public void setCanal(int canal){
        TV.setCanal(int canal);
    }
    public void setVolumen(int volumen){
        TV.setVolumen(int volumen);
    }
}