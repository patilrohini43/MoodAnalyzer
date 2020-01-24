public class MoodAnalyser {

    String message;

    public MoodAnalyser()
    {

    }

    public MoodAnalyser(String message)
    {
        this.message=message;
    }

    public String analyseMood(String message) throws MoodAnalyserException {
        this.message=message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "Happy";
        }catch (NullPointerException e)
        {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Please Enter Proper Name");
        }
    }

    public boolean equals(MoodAnalyser another)
    {
        if(this.message.equals(another.message))
            return true;
        return false;
    }
}
