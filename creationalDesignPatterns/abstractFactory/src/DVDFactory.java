public class DVDFactory implements DiscFactory {
    public DVD getInstance(String discClass) {
        return new DVD();
    }
    public DVD getInstance(String discClass, String mediaType) {
        return new DVD(mediaType);
    }
    public DVD getInstance(String discClass, String mediaType, Float memory) {
        return new DVD(mediaType,memory);
    }
}
