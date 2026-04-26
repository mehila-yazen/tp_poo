public enum SensorStatus {
    ACTIVE("Sensor is working"),
    SUSPENDED("This sensor is suspended Zone under maintenance");

    private String status;

    SensorStatus(String status){
        this.status = status;
    };

    public String getStatus() {
        return status;
    }
}
