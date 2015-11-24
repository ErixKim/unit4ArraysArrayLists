public class ArrayMethods
{
    private int [] values;
    public ArrayMethods(int[] initialValues) 
    {
        values = initialValues;
    }
    public void swapFirstAndLast()
    {
        int temp = values[0];
        values[0] = values[values.length];
        values[values.length] = temp;
    }
    public void shiftRight()
    {
        int temp = values [0];
        int temp2 = values[values.length];
        for (int i = 0; i < values.length - 1; i++)
        {
            int nextNumber = values[i+1];
            values[i] = nextNumber;
        }
        values [0] = temp2;
        values [values.length] = temp;
    }
    public void replaceEven()
    {
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] % 2 == 0)
            {
                values[i] = 0;
            }
        }
    }
    public void removeMiddle()
    {
        if ( values.length % 2 == 0)
        {
            
        }
        else 
        {
            middleNumber = values.length/2;
            values[middleNumber];
        }
    }
}
    