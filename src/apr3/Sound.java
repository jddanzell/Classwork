package apr3;

public class Sound
{
    private int[] samples;

    public int LimitAmplitude(int limit)
    {
        int count = 0;
        for (int i = 0; i < samples.length; i++)
        {
            if (samples[i] > limit)
            {
                samples[i] = limit;
                count++;
            } else if (samples[i] > -limit) {

                samples[i] = limit;
                count++;
            }
        }
        return count;
    }
}