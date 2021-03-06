/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;
import BusinessLogicLayer.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
/**
 *
 * @author Christopher
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        //Example of how the Presentation will interact with the business layer, In this example we display the firstname of each client in the Client table in the DB
        User clientObj = new User();
        List<User> clients = new ArrayList<User>();
        clients = clientObj.GetUsers();
        
        for (User cl:clients) {
            System.out.println(cl.getFirstName());
        }
        
        User user = clientObj.GetUserByID(4);
        if (user==null) {
            System.out.println("Not found"); 
        }
        else{
           System.out.println(user.getFirstName()); 
        }
        
        User userObj = new User();
        User userToLogin = userObj.GetUserByUserNameAndPassword("JohnSmith", "123");
        System.out.println(userToLogin.getFirstName());
        
        int nextBookingNum;
        Booking bookingObj = new Booking();
        nextBookingNum = bookingObj.GetNextBookingNum();
        System.out.println(nextBookingNum);
        
        Booking booking = new Booking(1,0,"Type","THeme","COm",new Date(21,12,15),"A","B","C",12,4,1);
        booking.AddToDatabase();
        //User clientToInsert =  new User("Admin","123",true,"Nick", "Morris", LocalDate.of(1990, Month.FEBRUARY, 24), "0735932363", "nick.morris@gmail.com","9002244626963");
        //boolean insertSuccesful = clientToInsert.TryAddToDatabase();
        //System.out.println(insertSuccesful);
        
        Booking b = new Booking();
        int days = b.GetDaysBeforeBooking(1);
        double price  = b.GetTotalPriceBooking(1);
        double payments = b.GetTotalPaymentsMadeForBooking(1);
        System.out.println(days);
        System.out.println(price);
        System.out.println(payments);
        //Example of updating a client in the database
        
        
        
    }
}
