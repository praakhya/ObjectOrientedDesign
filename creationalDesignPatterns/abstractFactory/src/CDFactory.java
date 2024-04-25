public class CDFactory implements DiscFactory {
    public CD getInstance(String discClass) {
        return new CD();
    }
    public CD getInstance(String discClass, String mediaType) {
        return new CD(mediaType);
    }
    public CD getInstance(String discClass, String mediaType, Float memory) {
        return new CD(mediaType,memory);
    }
}
