package Classes;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Brudasoe on 10-Mar-18.
 */
public class TestClass  {

        @Test
        public void testToStringAlarm() {
            Alarm alarm = new Alarm("comp", "test", 23, 1, 5, 1);
            String expected = "Alarm{device='comp'description='test'date='23'channelNr='1'threshold='5.0'direction='1'}";
            Assert.assertEquals(expected, alarm.toString());
        }

        @Test
        public void testToStringTimeHistory()
        {
            TimeHistory th = new TimeHistory("comp", "test", 23, 1,"Hz", 1, 2, 2);
            String expected = "TimeHistory{device='comp'description='test'date='23'channelNr='1'unit='Hz'resolution='1.0'buffer=[null, null]'sensitivity='2.0'}";
            Assert.assertEquals(expected, th.toString());
        }


        @Test
        public void testToStringSpectrum()
        {
            Spectrum spec = new Spectrum("comp", "test", 23, 1,"Hz", 1, 2, "test");
            String expected = "Spectrum{device='comp'description='test'date='23'channelNr='1'unit='Hz'resolution='1.0'buffer=[null, null]'scaling='test'}";
            Assert.assertEquals(expected, spec.toString());
        }

}
