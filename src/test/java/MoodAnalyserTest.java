import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenAnalayser() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String result=moodAnalyser.analyseMood("I am in any Mood");
        Assert.assertEquals("Happy",result);
    }

    @Test
    public void givenNullMoodAnalyserException() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        String mood=moodAnalyser.analyseMood();
        Assert.assertEquals("Happy",mood);
    }


    @Test
    public void givenMoodAnalyserException()  {
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Happy Mood");
        try {
            moodAnalyser.analyseMood("I am in Happy Mood");
        }
        catch (MoodAnalyserException e) {

            Assert.assertEquals("Please Enter Proper Name", e.getMessage());
        }
    }

    @Test
    public void givenMoodAnalaser_ProperReturn_MoodAnalyserObject() {
        MoodAnalyser moodAnalyser = MoodAnalyserFactory.createAnalayzer("I am in Happy Mood");
        Assert.assertTrue(new MoodAnalyser("I am in Happy Mood").equals(moodAnalyser));
    }

}
