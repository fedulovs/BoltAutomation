package models;

public enum SocialNetwork {

    FACEBOOK("Facebook"),
    TWITTER("Twitter"),
    INSTAGRAM("Instagram"),
    LINKEDIN("LinkedIn"),
    TIKTOK("Tiktok");

    private String networkName;

    SocialNetwork(String networkName) {
        this.networkName = networkName;
    }

    public String getName() {
        return networkName;
    }
}
