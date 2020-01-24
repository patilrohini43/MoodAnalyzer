import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory {

    public static MoodAnalyser createAnalayzer(String value) throws MoodAnalyserException {
        try {
            Class<?> moodAnalyserClass = Class.forName("MoodAalyser");
            Constructor<?> moodConstructor = moodAnalyserClass.getConstructor(String.class);
            Object moodObj = moodConstructor.newInstance(value);
            return (MoodAnalyser) moodObj;

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Please Enter Proper Class Name");
        }


    }

}
