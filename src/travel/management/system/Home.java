
package travel.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;
public class Home extends JFrame {
    String username;
    Home(String username) {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 2000, 250);
        add(p1);
        
        JPanel p4 = new JPanel();
        p4.setLayout(null);
        p4.setBackground(new Color(51, 153, 255));
        p4.setBounds(0, 0, 2000, 150);
        p1.add(p4);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 250, 300, 900);
        add(p2);

        
        
        
        
        JLabel heading = new JLabel("DASHBOARD");
        heading.setBounds(40, 0, 190, 430);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 32));
        p1.add(heading);
        
        
//        JLabel lgin = new JLabel("Login");
//        lgin.setBounds(1645, 180, 300, 40);
//        lgin.setForeground(Color.WHITE);
//        lgin.setFont(new Font("Tahoma", Font.PLAIN, 23));
//        
//        p1.add(lgin);
//        
//        JLabel sign = new JLabel("Sign Up");
//        sign.setBounds(1730, 180, 300, 40);
//        sign.setForeground(Color.WHITE);
//        sign.setFont(new Font("Tahoma", Font.PLAIN, 23));
//        
//        p1.add(sign);
//        
//        JLabel sym = new JLabel("|");
//        sym.setBounds(1705, 180, 300, 40);
//        sym.setForeground(Color.WHITE);
//        sym.setFont(new Font("Tahoma", Font.PLAIN, 37));
//        
//        p1.add(sym);
        
        JButton sign =  new JButton("Sign up");
        sign.setBounds(1730, 180, 100, 40);
        sign.setBackground(new Color(0, 0, 102));
        sign.setForeground(Color.WHITE);
        sign.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //sign.setMargin(new Insets(50, 50, 50, 50));
        p1.add(sign);
        
        sign.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
        new Signup().setVisible(true);
          }
	});
        
        JButton login =  new JButton("Login");
        login.setBounds(1645, 180, 100, 40);
        login.setBackground(new Color(0, 0, 102));
        login.setForeground(Color.WHITE);
        login.setFont(new Font("Tahoma", Font.PLAIN, 20));
        //login.setMargin(new Insets(0, 0, 0, 125));
        p1.add(login);
        
        login.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true);
          }
	});
        
        
        
        
        JButton addPersonalDetails =  new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        p2.add(addPersonalDetails);
        addPersonalDetails.addActionListener((ActionEvent ae) -> {
            try{
                new AddCustomer(username).setVisible(true);
            }catch(SQLException e ){}
        });
        
        JButton updatePersonalDetails =  new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 50, 300, 50);
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
        p2.add(updatePersonalDetails);
        updatePersonalDetails.addActionListener((ActionEvent ae) -> {
            try{
                new UpdateCustomer(username).setVisible(true);
            }catch(SQLException e ){}
        });
        
        JButton viewPersonalDetails =  new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0, 100, 300, 50);
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 40));
        p2.add(viewPersonalDetails);
        viewPersonalDetails.addActionListener((ActionEvent ae) -> {
            try{
                new ViewCustomers().setVisible(true);
            }catch(SQLException e ){}
        });
        
        JButton deletePersonalDetails =  new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 150, 300, 50);
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 40));
        p2.add(deletePersonalDetails);
        deletePersonalDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new DeleteCustomer().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        JButton checkpackage =  new JButton("Check Package");
        checkpackage.setBounds(0, 200, 300, 50);
        checkpackage.setBackground(new Color(0, 0, 102));
        checkpackage.setForeground(Color.WHITE);
        checkpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackage.setMargin(new Insets(0, 0, 0, 110));
        p2.add(checkpackage);
        checkpackage.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new CheckPackage().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        JButton bookpackage =  new JButton("Book Package");
        bookpackage.setBounds(0, 250, 300, 50);
        bookpackage.setBackground(new Color(0, 0, 102));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackage.setMargin(new Insets(0, 0, 0, 120));
        p2.add(bookpackage);
        bookpackage.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new BookPackage(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        JButton viewpackage =  new JButton("View Package");
        viewpackage.setBounds(0, 300, 300, 50);
        viewpackage.setBackground(new Color(0, 0, 102));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackage.setMargin(new Insets(0, 0, 0, 120));
        p2.add(viewpackage);
        viewpackage.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewPackage(username).setVisible(true);
                }catch(Exception e ){}
                
            }
	});
        
        JButton viewhotels =  new JButton("View Hotels");
        viewhotels.setBounds(0, 350, 300, 50);
        viewhotels.setBackground(new Color(0, 0, 102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0, 0, 0, 130));
        p2.add(viewhotels);
        viewhotels.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new CheckHotels().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        JButton bookhotel =  new JButton("Book Hotel");
        bookhotel.setBounds(0, 400, 300, 50);
        bookhotel.setBackground(new Color(0, 0, 102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotel.setMargin(new Insets(0, 0, 0, 140));
        p2.add(bookhotel);
        bookhotel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new BookHotel(username).setVisible(true);
            }
	});
        
        
        JButton viewBookedhotel =  new JButton("View Booked Hotel");
        viewBookedhotel.setBounds(0, 450, 300, 50);
        viewBookedhotel.setBackground(new Color(0, 0, 102));
        viewBookedhotel.setForeground(Color.WHITE);
        viewBookedhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewBookedhotel.setMargin(new Insets(0, 0, 0, 70));
        p2.add(viewBookedhotel);
        viewBookedhotel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewBookedHotel(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        JButton destinations =  new JButton("Destinations");
        destinations.setBounds(0, 500, 300, 50);
        destinations.setBackground(new Color(0, 0, 102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0, 0, 0, 125));
        p2.add(destinations);
        
        destinations.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
        new Destination().setVisible(true);
          }
	});
        
        JButton payments =  new JButton("Payments");
        payments.setBounds(0, 550, 300, 50);
        payments.setBackground(new Color(0, 0, 102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setMargin(new Insets(0, 0, 0, 155));
        p2.add(payments);
        payments.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Payment().setVisible(true);
            }
	});
        
        JButton calculator =  new JButton("Calculator");
        calculator.setBounds(0, 600, 300, 50);
        calculator.setBackground(new Color(0, 0, 102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculator.setMargin(new Insets(0, 0, 0, 145));
        p2.add(calculator);
        calculator.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
        try{
               Runtime.getRuntime().exec("calc.exe");
               }catch(Exception e){ }
           }
	});
        
        JButton notepad =  new JButton("Notepad");
        notepad.setBounds(0, 650, 300, 50);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0, 0, 0, 155));
        p2.add(notepad);
        notepad.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                }catch(Exception e){ }
            }
	});
        
        JButton about =  new JButton("About");
        about.setBounds(0, 700, 300, 50);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0, 175));
        p2.add(about);
        
        about.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
        new About().setVisible(true);
          }
	});
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 2200, 1500);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(200, 25, 2700, 140);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 80));
        p4.add(text);
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new Home("");
        
    }
}






