import java.util.Scanner;
public class rock_paper_scissor_for_two_users
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first player name");
        String name1=sc.nextLine();
        System.out.println("enter the second player name");
        String name2=sc.nextLine();
        System.out.println("enter the number of levels you wanted to play");
        int levels=sc.nextInt();
        int user1_count=0;
        int user2_count=0;
        while (levels > 0)
        {
        System.out.println(name1+" please enter your choice (1.rock 2.paper 3.scissor)");
        int user1 = sc.nextInt();
        System.out.println(name2+" please enter your choice (1.rock 2.paper 3.scissor)");
        int user2 = sc.nextInt();

            switch (user1)
            {
                case 1:
                    switch (user2)
                    {
                        case 1 ->
                        {
                            System.out.println("both the players got tie");
                            System.out.println(name1+" count is "+user1_count);
                            System.out.println(name2+" count is "+user2_count);
                            System.out.println("------------------------------");

                        }
                        case 2 ->
                        {
                            System.out.println(name2+" won the game");
                            user2_count++;
                            System.out.println(name1+" count is "+user1_count);
                            System.out.println(name2+" count is "+user2_count);
                            System.out.println("------------------------------");
                        }
                        case 3 ->
                        {
                            System.out.println(name1+" won the game");
                            user1_count++;
                            System.out.println(name1+" count is "+user1_count);
                            System.out.println(name2+" count is "+user2_count);
                            System.out.println("------------------------------");
                        }
                        default-> {
                            System.out.println(name2+" you have eneterd the wrong choice,so "+ name1+" gets the point.\n next time please enter the correct choice");
                            user1_count++;
                            System.out.println(name1+" count is "+user1_count);
                            System.out.println(name2+" count is "+user2_count);
                            System.out.println("------------------------------");
                        }
                    }
                    break;
                case 2:
                    switch (user2)
                    {
                        case 1 ->
                        {
                            System.out.println(name1+" wins the game");
                            user1_count++;
                            System.out.println(name1+" count is "+user1_count);
                            System.out.println(name2+" count is "+user2_count);
                            System.out.println("------------------------------");
                        }
                        case 2 ->
                        {
                            System.out.println("both the players got tie");
                            System.out.println(name1+" count is "+user1_count);
                            System.out.println(name2+" count is "+user2_count);
                            System.out.println("------------------------------");
                        }
                        case 3 ->
                        {
                            System.out.println(name2+" won the game");
                            user2_count++;
                            System.out.println(name1+" count is "+user1_count);
                            System.out.println(name2+" count is "+user2_count);
                            System.out.println("------------------------------");
                        }
                        default-> {
                            System.out.println(name2+" you have eneterd the wrong choice,so "+ name1+" gets the point.\n next time please enter the correct choice");
                            user1_count++;
                            System.out.println(name1+" count is "+user1_count);
                            System.out.println(name2+" count is "+user2_count);
                            System.out.println("------------------------------");
                        }
                    }
                    break;
                case 3:
                    switch (user2)
                    {
                        case 1 ->
                        {
                            System.out.println(name2+" won the game");
                            user2_count++;
                            System.out.println(name1+" count is "+user1_count);
                            System.out.println(name2+" count is "+user2_count);
                            System.out.println("------------------------------");
                        }
                        case 2 ->
                        {
                            System.out.println(name1+" won the game");
                            user1_count++;
                            System.out.println(name1+" count is "+user1_count);
                            System.out.println(name2+" count is "+user2_count);
                            System.out.println("------------------------------");
                        }
                        case 3 ->
                        {
                         System.out.println("both the players got tie");
                            System.out.println(name1+" count is "+user1_count);
                            System.out.println(name2+" count is "+user2_count);
                            System.out.println("------------------------------");
                        }
                        default-> {
                            System.out.println(name2+" you have eneterd the wrong choice,so "+ name1+" gets the point.\n next time please enter the correct choice");
                            user1_count++;
                            System.out.println(name1+" count is "+user1_count);
                            System.out.println(name2+" count is "+user2_count);
                            System.out.println("------------------------------");
                        }
                    }
                    break;
                default:
                    if(user2==1 || user2==2 || user2==3) {
                        System.out.println(name1 + " you have eneterd the wrong choice,so " + name2 + " gets the point.\n next time please enter the correct choice");
                        user2_count++;
                        System.out.println(name1 + " count is " + user1_count);
                        System.out.println(name2 + " count is " + user2_count);
                        System.out.println("------------------------------");
                    }
                    else {
                        System.out.println("both the players have entered the wrong choice so no one gets the point");
                        System.out.println(name1 + " count is " + user1_count);
                        System.out.println(name2 + " count is " + user2_count);
                        System.out.println("------------------------------");
                    }

            }
            levels--;
        }
        if(user1_count > user2_count)
        {
            System.out.println(name1+" wins the game");
        }
        else if(user1_count < user2_count)
        {
            System.out.println(name2+" wins the game");
        }
        else
        {
            System.out.println(" both the players got tie \n try the game once again");

        }
    }
}
