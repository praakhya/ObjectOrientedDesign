public class DiscFactory {
    public Disc getInstance(String discClass) {
        return switch (discClass) {
            case "CD" -> new CD();
            case "DVD" -> new DVD();
            case "BluRay" -> new BluRay();
            default -> null;
        };
    }
    public Disc getInstance(String discClass, String mediaType) {
        return switch (discClass) {
            case "CD" -> new CD(mediaType);
            case "DVD" -> new DVD(mediaType);
            case "BluRay" -> new BluRay(mediaType);
            default -> null;
        };
    }
    public Disc getInstance(String discClass, String mediaType, Float memory) {
        return switch (discClass) {
            case "CD" -> new CD(mediaType,memory);
            case "DVD" -> new DVD(mediaType,memory);
            case "BluRay" -> new BluRay(mediaType,memory);
            default -> null;
        };
    }
}
