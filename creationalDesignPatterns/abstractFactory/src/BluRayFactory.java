public class BluRayFactory implements DiscFactory {
    public BluRay getInstance(String discClass) {
        return new BluRay();
    }
    public BluRay getInstance(String discClass, String mediaType) {
        return new BluRay(mediaType);
    }
    public BluRay getInstance(String discClass, String mediaType, Float memory) {
        return new BluRay(mediaType,memory);
    }
}
