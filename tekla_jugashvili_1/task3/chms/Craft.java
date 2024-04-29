package chms;

public class Craft {
    private String name;
    private String description;
    private String region;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Craft{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
