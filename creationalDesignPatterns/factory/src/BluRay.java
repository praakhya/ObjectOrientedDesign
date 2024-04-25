import java.util.concurrent.TimeUnit;

public class BluRay implements Disc{
    private String mediaType;
    private Float memory;
    private DataUnit memporyUnit;
    private String data;
    BluRay() {
        this.mediaType = "";
        this.memory = 20f;
        this.memporyUnit = DataUnit.GB;
        this.data = "";
    }
    BluRay(String mediaType) {
        this.mediaType = mediaType;
        this.memory = 20f;
        this.memporyUnit = DataUnit.GB;
        this.data = "";
    }
    BluRay(String mediaType, Float memory) {
        this.mediaType = mediaType;
        this.memory = memory;
        this.memporyUnit = DataUnit.GB;
        this.data = "";
    }
    public String getTypeOfMedia() {
        return this.mediaType;
    }
    public Float getMemory() {
        return DataUnitConvertor.instance.unitToLong(memory, memporyUnit);
    }
    public void play() throws InterruptedException {
        System.out.printf("Playing BluRay: media = '%s'\n",mediaType);
        for (Character c:data.toCharArray()) {
            System.out.print(c);
            TimeUnit.MILLISECONDS.sleep(5);
        }
    }
    public void write(String data, String mediaType) {
        new ProgressBar("Writing to disc",25,10);
        this.data = data;
        this.mediaType = mediaType;
    }
}
