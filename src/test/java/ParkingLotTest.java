import ParkingLotMain.ParkingLot;
import org.junit.Assert;
import org.junit.Test;

public class ParkingLotTest {
    @Test
    public void givenVehicle_whenParked_ShouldReturnTrue() {
        ParkingLot parkingLot=new ParkingLot();
        boolean park = parkingLot.park(new Object());
        Assert.assertEquals(true,park);
    }
}
