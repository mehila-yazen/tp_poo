public abstract class Sensors {
    static  int globalCode;
    public final int code;
    private final SensorType type;
    private SensorStatus status;

    public Sensors(SensorType type, SensorStatus status ){
        this.status = status;
        this.type = type;
        this.code = globalCode++;
    }

     public String getType(){
        return  type.getType();
    }

    public String getStatus(){
        return status.getStatus();
    }

}
