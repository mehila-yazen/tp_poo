public enum SensorType {
    SOIL("soil sensor"),
    ENVIRONMENTAL("environmental sensor"),
    WATER("water sensor"),
    BIOMETRIC("biometric sensor"),
    GPS("GPS collar sensor");

    private String type;

    SensorType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

}
