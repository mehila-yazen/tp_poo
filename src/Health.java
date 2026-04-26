public enum Health {
    HEALTHY(" is healthy"),
    SICK(" is sick"),
    UNDERWEIGHT(" is underweight"); // 2. Added semicolon here

    private final String healthStatus;

    Health(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getReport(String species) {
        return species + healthStatus;
    }
}
