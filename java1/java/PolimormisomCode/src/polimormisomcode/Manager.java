
package polimormisomcode;


public class Manager extends Employ{
    double bonus,providentfund;
    @Override
    public double calculate(){
        double s = (salary*12)+bonus+providentfund;
        return s;
        
    }
}
