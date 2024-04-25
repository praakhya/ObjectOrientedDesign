import java.util.HashMap;
import java.util.Map;

public class DataUnitConvertor {
    public static final DataUnitConvertor instance = new DataUnitConvertor();
    private DataUnitConvertor(){}
    Float unitToLong(Float value, DataUnit unit) {
        return switch (unit) {
            case KB -> value * 1000;
            case MB -> value * 1000 * 1000;
            case GB -> value * 1000 * 1000 * 1000;
            case TB -> value * 1000 * 1000 * 1000 * 1000;
            default -> -1f;
        };
    }
    Map<Float,DataUnit> FloatToUnit(Float value) {
        DataUnit finalUnit = DataUnit.KB;
        Map<Float,DataUnit> result = new HashMap<>();
        Float bytes = 1000f;
        if (value%bytes > 0) {
            bytes*=1000;
            if (value%bytes > 0) {
                bytes*=1000;
                if (value%bytes >0) {
                    bytes*=1000;
                    if (value%bytes > 0) {
                        result.put(value%bytes,DataUnit.TB);
                        return result;
                    }
                    result.put(value%bytes,DataUnit.GB);
                    return result;
                }
                result.put(value%bytes,DataUnit.MB);
                return result;
            }
            result.put(value%bytes,DataUnit.KB);
            return result;
        }
        result.put(value/bytes,DataUnit.KB);
        return result;
    }
}
