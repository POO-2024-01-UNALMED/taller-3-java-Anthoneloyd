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
    //TV.canalUp();
}