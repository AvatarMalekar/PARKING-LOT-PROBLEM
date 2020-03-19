package MainTest;

import ParkingLotMain.ParkingLot;
import org.junit.Test;

public class ParkingLotTest {
    @Test
    public void Welcome_Message() {
        ParkingLot parkingLot=new ParkingLot();
        parkingLot.showMessage();
    }
}
