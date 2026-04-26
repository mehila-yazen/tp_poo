public class GpsCollarSensor extends Sensors{

    public GeographicalPosition zone;
    private Position currentPos;

    public GpsCollarSensor(SensorStatus status, GeographicalPosition zone) {
        super(SensorType.GPS, status);
        this.zone = zone;
    }

    public void setCurrentPos(Position p){
        currentPos = p;
    }

    public Position getPosition(){
        return currentPos;
    }


}
