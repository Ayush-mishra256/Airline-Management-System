

package airlinemanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Home extends JFrame implements ActionListener {
    
    public Home(){
        
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/front.jpg"));
        JLabel image= new JLabel(i1);
        image.setBounds(0 , 0 , 1366 , 670);
        add(image);
        
        JLabel heading=new JLabel("AIR INDIA WELCOMES YOU");
        heading.setBounds(383,40,1000,40);
        heading.setForeground(Color.BLUE);
        heading.setFont( new Font("Serif" ,Font.BOLD,42));
        image.add(heading);
        
        JMenuBar menubar= new JMenuBar();
        setJMenuBar(menubar);
        
        JMenu details= new JMenu("Details");
        menubar.add(details);
        
        JMenuItem flightDetails= new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        details.add(flightDetails);
        
         JMenuItem customerDetails= new JMenuItem("Add Customer Details");
          customerDetails.addActionListener(this);
        details.add(customerDetails);
        
         JMenuItem bookFlight= new JMenuItem("Book Flight");
         bookFlight.addActionListener(this);
        details.add(bookFlight);
        
         JMenuItem journeyDetails= new JMenuItem("Journey Details");
         journeyDetails.addActionListener(this);
        details.add(journeyDetails);
        
         JMenuItem ticketCancellation= new JMenuItem("cancel ticket");
         ticketCancellation.addActionListener(this);
        details.add(ticketCancellation);
        
        JMenu ticket= new JMenu("Ticket");
        menubar.add(ticket);
        
        JMenuItem boardingpass= new JMenuItem("Boarding Pass");
        boardingpass.addActionListener(this);
        ticket.add(boardingpass);
        
        
        
       setExtendedState(JFrame.MAXIMIZED_BOTH);
      setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String text = ae.getActionCommand();
        
        if(text.equals("Add Customer Details")){
            new AddCustomer();
        
        }else if(text.equals("Flight Details")){
            new FlightInfo();
        
        }else if(text.equals("Book Flight")){
        new BookFlight();
        
        }else if(text.equals("Journey Details")){
        new JourneyDetails();
        }else if(text.equals("cancel ticket")){
            new Cancel();
        
        }
        
    }
        
    public static void main(String args[]){
        new Home();
    
    }
    
}
