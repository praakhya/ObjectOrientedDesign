public interface DiscFactory {
    public Disc getInstance(String discClass);
    public Disc getInstance(String discClass, String mediaType);
    public Disc getInstance(String discClass, String mediaType, Float memory);
}
