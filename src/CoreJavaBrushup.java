public class CoreJavaBrushup {

    public static void main(String[] args) {
        
        // Variable / DataType examples
        int mynum = 5;
        String w = "Rahul Shetty Academy";
        char letter = 'r';
        double dec = 5.99;
        boolean mycard = true;

        System.out.println(mynum);
        System.out.println(mynum + " Manish");

        // Arrays - multiple values
        // Way 1: Declare with size
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // Way 2: Declare with values directly
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Accessing a single element
        System.out.println("First element: " + arr2[0]);

        // Accessing all elements using a loop
        System.out.print("All elements: ");
        for (int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i] + " ");
        }
        
       
        //this string array
        String[] name = {"rahul", "Shetty", "Selenium"    };
        
        for(int i=0; i<name.length; i++)
        {
        
			System.out.println(name[i]);
        }
        for (String s: name)
        {System.out.println(s); }
        

        
        
        
        
        
    }
}
