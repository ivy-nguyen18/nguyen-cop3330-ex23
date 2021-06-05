/*
 *  UCF COP3330 Summer 2021 Assignment 23 Solution
 *  Copyright 2021 Ivy Nguyen
 */


package ex23.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String answer = input.nextLine().toLowerCase();

        if("y".equalsIgnoreCase(answer)){
            System.out.print("Are the terminal batteries corroded? ");
            answer = input.nextLine().toLowerCase();

            if("y".equalsIgnoreCase(answer)){
                System.out.println("Clean terminals and try starting again.");
            }else if("n".equalsIgnoreCase(answer)){
                System.out.println("Replace cables and try again. ");
            }
        }else if ("n".equalsIgnoreCase(answer)){
            System.out.print("Does the car making a slicking noise? ");
            answer = input.nextLine().toLowerCase();

            if("n".equalsIgnoreCase(answer)){
                System.out.print("Does the car crank up but fail to start? ");
                answer = input.nextLine().toLowerCase();

                if("n".equalsIgnoreCase(answer)){
                    System.out.print("Does the engine start and then die? ");
                    answer = input.nextLine().toLowerCase();

                    if("n".equalsIgnoreCase(answer)){
                        System.out.println("This should not be possible.");
                    }else if("y".equalsIgnoreCase(answer)){
                        System.out.print("Does your car have fuel injection? ");
                        answer = input.nextLine().toLowerCase();

                        if("n".equalsIgnoreCase(answer)){
                            System.out.println("Check to ensure the choke is opening and closing.");
                        } else if("y".equalsIgnoreCase(answer)){
                            System.out.println("Get it in for service.");
                        }
                    }
                }else if("y".equalsIgnoreCase(answer)){
                    System.out.println("Check spark plug connections.");
                }
            }else if("y".equalsIgnoreCase(answer)){
                System.out.println("Replace the battery.");
            }
        }
    }
}
