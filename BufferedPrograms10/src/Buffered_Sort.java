import java.io.*;

public class Buffered_Sort {

          public static void main(String[] args) throws Exception

        {

            int n;

            String temp;

            InputStreamReader u = new InputStreamReader(System.in);
	      	BufferedReader sort = new BufferedReader(u);

            System.out.print("Enter number of names you want to enter:");

            n = Integer.parseInt(sort.readLine());

            String names[] = new String[n];

            
            BufferedReader sort1 = new BufferedReader(u);

            System.out.println("Enter all the names:");

            for(int i = 0; i < n; i++)

            {

                names[i] = sort1.readLine();

            }

            for (int i = 0; i < n; i++) 

            {

                for (int j = i + 1; j < n; j++) 

                {

                    if (names[i].compareTo(names[j])>0) 

                    {

                        temp = names[i];

                        names[i] = names[j];

                        names[j] = temp;

                    }

                }

            }

            System.out.print("Names in Sorted Order:");

            for (int i = 0; i < n - 1; i++) 

            {

                System.out.print(names[i] + ",");

            }

            System.out.print(names[n - 1]);

        }

    }


