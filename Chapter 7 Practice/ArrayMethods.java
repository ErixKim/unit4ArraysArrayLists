public class ArrayMethods
{
    //     private int [] values = {1,2,3,4,5};
    //     
    //     public ArrayMethods(int[] initialValues) 
    //     {
    //         values = initialValues;
    //     }
    private int[] values;
    private int currentSize;
    public ArrayMethods()
    {
        this.values = new int[100];
        for (this.currentSize = 0; this.currentSize < 20; this.currentSize++)
        {
            this.values[this.currentSize] = this.currentSize * this.currentSize;
        }
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

    /**
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
     */

    public void moveFront()
    {
        int x = 0;
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] % 2 == 0)
            {
                values[x] = values[i];
                x++;
            }
        }
    }

    public void secondLargest()
    {

        for (int i = 0; i < values.length; i++)
        {

        }
    }

    public void ascendingOrder()
    {
        boolean notAscending = true;
        boolean ascending = true;
        for (int i = 1; i < values.length; i++)
        {
            int currentLargest = values[i];
            int previousLargest = values[i-1];
            if (currentLargest < previousLargest)
            {
                ascending = true;
            }
            else
            {
                notAscending = false;
            }
        }
        System.out.println("Ascending: " + ascending);
        System.out.println("Ascending: " + notAscending);
    }

    public void adjecentElements()
    {
        for (int i = 1; i < values.length; i++)
        {
            int current = values[i];
            int previous = values[i-1];
        }
    }

}
