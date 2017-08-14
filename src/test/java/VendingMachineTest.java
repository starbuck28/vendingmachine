import com.elaineoglesbay.VendingMachine;
import org.junit.Assert;
import org.junit.Test;


public class VendingMachineTest {

    @Test
    public void itShouldDisplayInsertCoinWhenEmpty() {
        VendingMachine vendingMachine = new VendingMachine();
        Assert.assertEquals("INSERT COIN", vendingMachine.display(""));
    }

    @Test
    public void itShouldDisplayInsertedAmount() {
        VendingMachine vendingMachine = new VendingMachine();
        Assert.assertEquals("1.50", vendingMachine.display("1.50"));
    }
}
