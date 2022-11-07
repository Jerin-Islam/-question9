public class Data
{
    public static <Measurable> double average (Measurable[] objects)
    {
        double sum = 0;
        for (Measurable obj : objects)
        {
            sum = sum + obj.getMeasure();
        }
        if(objects.length > 0) {return sum / objects.length;}
        return 0;
    }

    public static <Measurer> double average(Object[] objects, Measurer meas)
    {
        double sum = 0;
        for (Object obj : objects)
        {
            sum = sum + meas.measure(obj);
        }
        if (objects.length > 0) {return sum/objects.length;}
        else {return 0;}
    }
    public static <Measurer> Object max(Object[] objects, Measurer m) {
        double maxMeasure = m.measure(0);
        int maxIndex = 0;
        for (int i=0; i< objects.length; i++)
        {
            Object obj = objects[i];
            if(maxMeasure<m.measure(i)){
                maxMeasure = m.measure(i);
                maxIndex = i;
            }
        }
        return objects[maxIndex];
    }
}

