package invalid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookWarehouse {
    void deliverDigitalBook(DigitalBookInterface digitalBookInterface) {
        digitalBookInterface.deliver();
    }
    void deliverPaperbackBook(PaperbackBookInterface paperbackBookInterface) {
        paperbackBookInterface.deliver();
    }

}
