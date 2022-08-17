package CW2;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SarangiSansar {

    //Declaring all attributes
    private ArrayList<Instrument> instruments;
    private JFrame frame;
    private JTextField rInstrumentNameTF;
    private JTextField sInstrumentNameTF;
    private JTextField rentOutInstrumentNameTF;
    private JTextField sellInstrumentNameTF;
    private JTextField returnInstrumentNameTF;
    private JTextField priceTF;
    private JTextField chargePerDayTF;
    private JTextField noOfdaysTF;
    private JTextField rCustomerNameTF;
    private JTextField sCustomerNameTF;
    private JTextField rCustomerPhoneNumberTF;
    private JTextField sCustomerPhoneNumberTF;
    private JTextField rPanNumberTF;
    private JTextField sPanNumberTF;
    private JTextField discountPercentTF;

    //constructor of SarangiSansar
    public SarangiSansar() {
        instruments = new ArrayList<>();
        frame = new JFrame("Sarangi Sansar");
        frame.setSize(1400,900);
        rInstrumentNameTF = new JTextField(12);
        sInstrumentNameTF = new JTextField(12);
        rentOutInstrumentNameTF = new JTextField(12);
        sellInstrumentNameTF = new JTextField(12);
        returnInstrumentNameTF = new JTextField(12);
        priceTF = new JTextField(12);
        chargePerDayTF = new JTextField(12);
        noOfdaysTF = new JTextField(12);
        rCustomerNameTF = new JTextField(12);
        sCustomerNameTF = new JTextField(12);
        rCustomerPhoneNumberTF = new JTextField(12);
        sCustomerPhoneNumberTF = new JTextField(12);
        rPanNumberTF = new JTextField(12);
        sPanNumberTF = new JTextField(12);
        discountPercentTF = new JTextField(12);
        frame.setLayout(new GridLayout());
    }
    //void of instrument to rent

    public void instrumentToRent() {
        JPanel panel = new JPanel();
        panel.setSize(500, 500);
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(239, 241,243));
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        //using label for headings

        JLabel addLabel = new JLabel("Add Instrument for rent");
        JLabel rentLabel = new JLabel("Rent the Instrument");
        JLabel returnLabel = new JLabel("Return the Instrument");
        Font font = new Font("SANS SERIF",Font.BOLD,15);

        //for display table

        JTable displayTable = new JTable();
        displayTable.setBackground(Color.CYAN);


        JScrollPane scrollPane = new JScrollPane(displayTable);
        scrollPane.setMinimumSize(new Dimension(600, 100));
        scrollPane.setVisible(false);

        //pop up

        JLabel noResultLabel = new JLabel("Unable to display results.");
        noResultLabel.setVisible(false);
        noResultLabel.setForeground(Color.RED);

        //making grid bag

        GridBagConstraints gbc = new GridBagConstraints();
        JButton addButton = new JButton("Add To Rent");
        JButton rentButton = new JButton("Rent");
        JButton returnButton = new JButton("Return");
        JButton displayButton = new JButton("Display");
        JButton clearButton = new JButton("Clear");

        //adding label as heading

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0,0,7,0);
        addLabel.setFont(font);
        panel.add(addLabel,gbc);


        //instrument name layout and text field

        gbc.gridy++;
        gbc.gridx = 0;
        panel.add(new JLabel("Instrument Name "), gbc);
        gbc.gridx++;
        panel.add(rInstrumentNameTF, gbc);

        //instrument charge per day layout and text field

        gbc.gridx--;
        gbc.gridy++;
        panel.add(new JLabel("Charge Per Day "), gbc);
        gbc.gridx++;
        panel.add(chargePerDayTF, gbc);

        //add to rent button layout and text fields

        gbc.gridy++;
        gbc.insets = new Insets(0,0,30,0);
        panel.add(addButton, gbc);

        //rent button layout and text fields

        gbc.gridy++;
        gbc.gridx =0;
        gbc.insets = new Insets(0,0,7,0);
        rentLabel.setFont(font);
        panel.add(rentLabel,gbc);

        //Customer name layout and text field

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Customer Name "), gbc);
        gbc.gridx++;
        panel.add(rCustomerNameTF, gbc);


        //Customer number layout and text field

        gbc.gridx--;
        gbc.gridy++;
        panel.add(new JLabel("Customer Number "), gbc);
        gbc.gridx++;
        panel.add(rCustomerPhoneNumberTF, gbc);

        //Customer PAN No. layout and text field

        gbc.gridx--;
        gbc.gridy++;
        panel.add(new JLabel("Customer PAN No. "), gbc);
        gbc.gridx++;
        panel.add(rPanNumberTF, gbc);

        //Rent date layout and text field

        JLabel dateLabel = new JLabel("Date");
        String years[] = {"Select Year", "2022", "2023", "2024", "2025", "2026"};
        String months[] = {"Select Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String days[] = {"Select Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
                "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",

                "27", "28", "29", "30", "31"};


        JComboBox yearsComboBox = new JComboBox(years);
        JComboBox monthsComboBox = new JComboBox(months);
        JComboBox daysComboBox = new JComboBox(days);
        JComboBox returnYearsComboBox = new JComboBox(years);
        JComboBox returnMonthsComboBox = new JComboBox(months);
        JComboBox returnDaysComboBox = new JComboBox(days);


        gbc.gridx--;
        gbc.gridy++;
        panel.add(new JLabel("Rent Date "), gbc);

        gbc.gridx++;
        panel.add(yearsComboBox, gbc);

        gbc.gridx++;
        panel.add(monthsComboBox, gbc);

        gbc.gridx++;
        panel.add(daysComboBox, gbc);

        //return date layout and text field
        gbc.gridx=0;
        gbc.gridy++;
        panel.add(new JLabel("Return Date "), gbc);

        gbc.gridx++;
        panel.add(returnYearsComboBox, gbc);

        gbc.gridx++;
        panel.add(returnMonthsComboBox, gbc);

        gbc.gridx++;
        panel.add(returnDaysComboBox, gbc);

        //Instrument name layout and text field
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Instrument Name: "), gbc);
        gbc.gridx++;
        panel.add(rentOutInstrumentNameTF, gbc);

        //No of renting days layout and text field
        gbc.gridx =0;
        gbc.gridy++;
        panel.add(new JLabel("Renting Days "), gbc);
        gbc.gridx++;
        panel.add(noOfdaysTF, gbc);

        //rent button layout and text fields
        gbc.gridy++;
        gbc.insets = new Insets(0,0,30,0);
        panel.add(rentButton, gbc);

        //Return instrument text
        gbc.gridy++;
        gbc.gridx = 0;
        gbc.insets = new Insets(0,0,7,0);
        returnLabel.setFont(font);
        panel.add(returnLabel,gbc);

        //return instrument layout and text field
        gbc.gridx=0;
        gbc.gridy++;
        panel.add(new JLabel("Instrument Name"), gbc);
        gbc.gridx++;
        panel.add(returnInstrumentNameTF, gbc);

        //return button layout and text fields

        gbc.gridx++;
        gbc.insets = new Insets(0,5,0,0);
        panel.add(returnButton, gbc);

        //display button layout and text fields

        gbc.gridy++;
        gbc.gridx =2;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(displayButton, gbc);

        //clear layout and text fields

        gbc.gridx = 1;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(clearButton, gbc);

        // function of display button

        gbc.gridy++;
        gbc.gridx=0;
        panel.add(noResultLabel,gbc);

        gbc.gridy++;
        gbc.gridwidth=4;
        panel.add(scrollPane,gbc);

        //adding pop up button on rent instrument name
        rentOutInstrumentNameTF.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try{
                    String name = rentOutInstrumentNameTF.getText();
                    InstrumentToRent instrumentToRent = getInstrumentToRentByName(name);
                    if (instrumentToRent != null){
                        JOptionPane.showMessageDialog(frame,"Instrument Name : "+instrumentToRent.getInstrumentName()+"\n"+"Charge per day : "+ instrumentToRent.getChargePerDay());
                    }
                }catch (Exception ex){
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        //adding return button

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = returnInstrumentNameTF.getText();
                    InstrumentToRent instrumentToRent = getInstrumentToRentByName(name);
                    if (instrumentToRent.getIsRented()){
                        JOptionPane.showMessageDialog(frame,"Instrument Name : "+instrumentToRent.getInstrumentName()+"\n"+"Customer Name : "+instrumentToRent.getCustomerName()+"\n"+"Customer Phone Number : "+instrumentToRent.getCustomerPhoneNumber()+"\n"+"Customer PAN Number: "+instrumentToRent.getPanNumber()+"\n"+"Rent Date : "+instrumentToRent.getDateOfRent()+"\n"+"Return Date : "+instrumentToRent.getDateOfReturn()+"\n"+"Number of days rented : "+instrumentToRent.getNoOfDays());
                    }

                }catch (Exception ex){

                    JOptionPane.showMessageDialog(frame,"Please enter valid instrument to return");

                }
            }
        });

        //adding add button

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rInstrumentNameTF.getText().isEmpty() || chargePerDayTF.getText().isEmpty() ){
                    JOptionPane.showMessageDialog(frame,"Empty Text Field(s)");
                } else {
                    try {
                        String name = rInstrumentNameTF.getText();
                        int chargePerDay = Integer.parseInt(chargePerDayTF.getText());
                        InstrumentToRent instrumentToRent = new InstrumentToRent(name, chargePerDay);
                        instrumentToRent.setIsRented(false);
                        instrumentToRent.display();
                        instruments.add(instrumentToRent);
                        instrumentToRent.setInstrumentName(name);
                        JOptionPane.showMessageDialog(frame,"Instrument "+rInstrumentNameTF.getText()+" Added for rent");
                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(frame,"Please enter valid charges");
                    }
                }
            }
        });

        //adding rent button

        rentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rentOutInstrumentNameTF.getText().isEmpty() || rCustomerNameTF.getText().isEmpty() || rPanNumberTF.getText().isEmpty()|| rCustomerPhoneNumberTF.getText().isEmpty()||noOfdaysTF.getText().isEmpty() ||
                        yearsComboBox.getSelectedIndex()==0 || monthsComboBox.getSelectedIndex() ==0 || daysComboBox.getSelectedIndex()==0||returnYearsComboBox.getSelectedIndex()==0 || returnMonthsComboBox.getSelectedIndex()==0|| returnDaysComboBox.getSelectedIndex()==0){
                    JOptionPane.showMessageDialog(frame,"Please complete every missing field");
                }else{
                    try {
                        String name = rentOutInstrumentNameTF.getText();
                        String rentDate = yearsComboBox.getSelectedItem()+"-"+ (monthsComboBox.getSelectedItem())+"-"+(daysComboBox.getSelectedItem());
                        String returnDate = returnYearsComboBox.getSelectedItem()+"-"+ (returnMonthsComboBox.getSelectedItem())+"-"+(returnDaysComboBox.getSelectedItem());
                        InstrumentToRent instrumentToRent = getInstrumentToRentByName(name);
                        instrumentToRent.rent(rCustomerNameTF.getText(),rCustomerPhoneNumberTF.getText(),Integer.parseInt(rPanNumberTF.getText()),rentDate,returnDate,Integer.parseInt(noOfdaysTF.getText()));
                        instrumentToRent.display();
                        instrumentToRent.setInstrumentName(name);
                        JOptionPane.showMessageDialog(frame,"Instrument "+rentOutInstrumentNameTF.getText()+" is rented");
                    }catch (NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame,"Type in a valid entry");
                    }
                }
            }
        });

        //adding clear button

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rentClearTF();
                yearsComboBox.setSelectedIndex(0);
                monthsComboBox.setSelectedIndex(0);
                daysComboBox.setSelectedIndex(0);
                returnYearsComboBox.setSelectedIndex(0);
                returnMonthsComboBox.setSelectedIndex(0);
                returnDaysComboBox.setSelectedIndex(0);
                scrollPane.setVisible(false);
                noResultLabel.setVisible(false);
            }
        });

        //adding display button

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] columns = {"Instrument name","Charge Per Day","Customer Name","Customer Phone","Customer PAN","Rent Date","No. of Days Rented"};
                Object[][] data = new Object[instruments.size()][7];
                scrollPane.setVisible(true);

                int row = 0;
                int column = 0;
                boolean hasInstrumentToRentObject = false;
                DefaultTableModel tableModel = new DefaultTableModel();
                for(Instrument instrument : instruments){
                    if (instrument instanceof InstrumentToRent){
                        InstrumentToRent instrumentToRent = (InstrumentToRent) instrument;

                        data[row][column++] = instrumentToRent.getInstrumentName();
                        data[row][column++] = instrumentToRent.getChargePerDay();
                        data[row][column++] = instrumentToRent.getCustomerName();
                        data[row][column++] = instrumentToRent.getCustomerPhoneNumber();
                        data[row][column++] = instrumentToRent.getPanNumber();
                        data[row][column++] = instrumentToRent.getDateOfRent();
                        data[row][column++] = instrumentToRent.getNoOfDays();
                        column=0;
                        row++;
                        hasInstrumentToRentObject = true;
                        instrumentToRent.display();
                    }
                }
                if (hasInstrumentToRentObject){
                    tableModel.setDataVector(data,columns);
                    displayTable.setModel(tableModel);
                    noResultLabel.setVisible(false);
                }else {
                    noResultLabel.setVisible(true);
                    scrollPane.setVisible(false);
                }

                frame.revalidate();
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
    // void of instrument to sell
    public void instrumentToSell() {
        JPanel panel = new JPanel();
        panel.setSize(500, 500);
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(239, 241,243));
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        //for display table

        JTable displayTable = new JTable();
        displayTable.setBackground(Color.CYAN);
        JScrollPane scrollPane = new JScrollPane(displayTable);
        scrollPane.setMinimumSize(new Dimension(600, 100));
        scrollPane.setVisible(false);

        //it is to display while no text is entered

        JLabel noResultLabel = new JLabel("No results to show");
        noResultLabel.setVisible(false);
        noResultLabel.setForeground(Color.RED);

        // making heading of sale and rent

        JLabel addLabel = new JLabel("Add Instrument for sale");
        JLabel sellLabel = new JLabel("Sell the Instrument");
        Font font = new Font("SANS SERIF",Font.BOLD,15);

         // making grid

        GridBagConstraints gbc = new GridBagConstraints();
        JButton addButton = new JButton("Add To Sell");
        JButton sellButton = new JButton("Sell");
        JButton displayButton = new JButton("Display");
        JButton clearButton = new JButton("Clear");

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx =0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0,0,7,0);
        addLabel.setFont(font);
        panel.add(addLabel,gbc);

        //instrument name to sell layout and text field
        gbc.gridx=0;
        gbc.gridy++;
        panel.add(new JLabel("Instrument Name "), gbc);
        gbc.gridx++;
        panel.add(sInstrumentNameTF, gbc);

        //instrument price layout and text field

        gbc.gridx--;
        gbc.gridy++;
        panel.add(new JLabel("Price "), gbc);
        gbc.gridx++;
        panel.add(priceTF, gbc);

        //add to sell button layout and text fields

        gbc.gridy++;
        gbc.insets = new Insets(0,0,30,0);
        panel.add(addButton, gbc);

        //add to sell label

        gbc.gridx=0;
        gbc.gridy++;
        gbc.insets = new Insets(0,0,7,0);
        sellLabel.setFont(font);
        panel.add(sellLabel,gbc);

        //Customer name layout and text field

        gbc.gridx=0;
        gbc.gridy++;
        panel.add(new JLabel("Customer Name "), gbc);
        gbc.gridx++;
        panel.add(sCustomerNameTF, gbc);

        //Customer number layout and text field

        gbc.gridx--;
        gbc.gridy++;
        panel.add(new JLabel("Customer Number "), gbc);
        gbc.gridx++;
        panel.add(sCustomerPhoneNumberTF, gbc);

        //Customer PAN No. layout and text field

        gbc.gridx--;
        gbc.gridy++;
        panel.add(new JLabel("Customer PAN No. "), gbc);
        gbc.gridx++;
        panel.add(sPanNumberTF, gbc);

        //sell date layout and text field

        JLabel dateLabel = new JLabel("Date");
        String years[] = {"Select Year", "2022", "2023", "2024", "2025", "2026"};
        String months[] = {"Select Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String days[] = {"Select Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
                "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",

                "27", "28", "29", "30", "31"};


        JComboBox yearsComboBox = new JComboBox(years);
        JComboBox monthsComboBox = new JComboBox(months);
        JComboBox daysComboBox = new JComboBox(days);

        gbc.gridx--;
        gbc.gridy++;
        panel.add(new JLabel("Sell Date "), gbc);

        gbc.gridx++;
        panel.add(yearsComboBox, gbc);

        gbc.gridx++;
        panel.add(monthsComboBox, gbc);

        gbc.gridx++;
        panel.add(daysComboBox, gbc);

        //sell instrument layout and text field

        gbc.gridx=0;
        gbc.gridy++;
        panel.add(new JLabel("Instrument Name"), gbc);
        gbc.gridx++;
        panel.add(sellInstrumentNameTF, gbc);

        //Discount percent layout and text field

        gbc.gridx=0;
        gbc.gridy++;
        panel.add(new JLabel("Discount percent "), gbc);
        gbc.gridx++;
        panel.add(discountPercentTF, gbc);

        //sell button layout and text fields

        gbc.gridy++;
        panel.add(sellButton, gbc);

        //display button layout and text fields

        gbc.gridx=0;
        gbc.gridy++;
        gbc.insets = new Insets(10,0,0,0);
        panel.add(displayButton, gbc);

        //clear button layout and text fields

        gbc.gridx--;
        gbc.gridx--;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10,0,0,50);
        panel.add(clearButton, gbc);

        //for display buttons

        gbc.gridy++;
        gbc.gridx=0;
        panel.add(noResultLabel,gbc);

        gbc.gridy++;
        gbc.gridwidth=4;
        panel.add(scrollPane,gbc);

        //adding pop up on add button

        sellInstrumentNameTF.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try{
                    String name = sellInstrumentNameTF.getText();
                    InstrumentToSell instrumentToSell = getInstrumentToSellByName(name);
                    if (instrumentToSell != null){
                        JOptionPane.showMessageDialog(frame,"Instrument Name : "+instrumentToSell.getInstrumentName()+"\n"+"Charge per day : "+ instrumentToSell.getPrice());
                    }
                }catch (Exception ex){

                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        //adding function on add button

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sInstrumentNameTF.getText().isEmpty() || priceTF.getText().isEmpty() ){
                    JOptionPane.showMessageDialog(frame,"Unfilled Text Field");
                } else {
                    try {
                        InstrumentToSell instrumentToSell = new InstrumentToSell(sInstrumentNameTF.getText(),Integer.parseInt(priceTF.getText()));
                        instruments.add(instrumentToSell);
                        JOptionPane.showMessageDialog(frame,"Instrument "+sInstrumentNameTF.getText()+" Added for sale");
                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(frame,"Enter valid Price");
                    }
                }

            }
        });

        //adding pop up on sell button

        sellButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sellInstrumentNameTF.getText().isEmpty() || sCustomerNameTF.getText().isEmpty()|| sCustomerPhoneNumberTF.getText().isEmpty()|| sPanNumberTF.getText().isEmpty()
                        || yearsComboBox.getSelectedIndex()==0||monthsComboBox.getSelectedIndex()==0||daysComboBox.getSelectedIndex()==0||discountPercentTF.getText().isEmpty()){

                    JOptionPane.showMessageDialog(frame,"Fill up all the empty Field");
                }else {
                    try {
                        String name = sellInstrumentNameTF.getText();
                        String sellDate = yearsComboBox.getSelectedItem()+"-"+ (monthsComboBox.getSelectedItem())+"-"+(daysComboBox.getSelectedItem());
                        InstrumentToSell instrumentToSell = getInstrumentToSellByName(name);
                        instrumentToSell.toSell(sCustomerNameTF.getText(),sCustomerPhoneNumberTF.getText(),Integer.parseInt(sPanNumberTF.getText()),sellDate,Integer.parseInt(discountPercentTF.getText()));
                        instrumentToSell.setInstrumentName(name);
                        JOptionPane.showMessageDialog(frame,"Instrument "+ sellInstrumentNameTF.getText()+" is sold");
                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(frame,"Enter valid Inputs");
                    }

                }
            }
        });

        //adding function on display button

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] columns = {"Instrument name","Price","Customer Name","Customer Phone","Customer PAN","Sell Date","Discount%"};
                Object[][] data = new Object[instruments.size()][7];
                scrollPane.setVisible(true);

                int row = 0;
                int column = 0;
                boolean hasInstrumentToSellObject = false;
                DefaultTableModel tableModel = new DefaultTableModel();
                for(Instrument instrument : instruments){
                    if (instrument instanceof InstrumentToSell){
                        InstrumentToSell instrumentToSell = (InstrumentToSell) instrument;

                        data[row][column++] = instrumentToSell.getInstrumentName();
                        data[row][column++] = instrumentToSell.getPrice();
                        data[row][column++] = instrumentToSell.getCustomerName();
                        data[row][column++] = instrumentToSell.getCustomerPhoneNumber();
                        data[row][column++] = instrumentToSell.getPanNumber();
                        data[row][column++] = instrumentToSell.getSellDate();
                        data[row][column++] = instrumentToSell.getDiscountPercent();
                        column=0;
                        row++;
                        hasInstrumentToSellObject = true;
                        instrumentToSell.display();
                    }
                }
                if (hasInstrumentToSellObject){
                    tableModel.setDataVector(data,columns);
                    displayTable.setModel(tableModel);
                    noResultLabel.setVisible(false);
                }else {
                    noResultLabel.setVisible(true);
                    scrollPane.setVisible(false);
                }

                frame.revalidate();
            }
        });

        //adding function on clear button

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sellClearTF();
                yearsComboBox.setSelectedIndex(0);
                monthsComboBox.setSelectedIndex(0);
                daysComboBox.setSelectedIndex(0);
                scrollPane.setVisible(false);
                noResultLabel.setVisible(false);
            }
        });


        frame.add(panel);
        frame.setVisible(true);
    }

    // using getter method of instrument to rent by name

    public InstrumentToRent getInstrumentToRentByName(String name){
        for (Instrument instrument : instruments){
            if (instrument.getInstrumentName().equalsIgnoreCase(name) && instrument instanceof InstrumentToRent){
                InstrumentToRent instrumentToRent = (InstrumentToRent) instrument;
                return instrumentToRent;

            }
        }
        return null;
    }

    // using getter method of instrument sell by name

    public InstrumentToSell getInstrumentToSellByName(String name){

        for (Instrument instrument : instruments){
            if (instrument.getInstrumentName().equalsIgnoreCase(name) && instrument instanceof InstrumentToSell){
                InstrumentToSell instrumentToSell = (InstrumentToSell) instrument;
                return instrumentToSell;
            }
        }
        return null;
    }

    // clear button function
    public void sellClearTF(){
        sInstrumentNameTF.setText("");
        priceTF.setText("");
        sellInstrumentNameTF.setText("");
        sCustomerNameTF.setText("");
        sPanNumberTF.setText("");
        sCustomerPhoneNumberTF.setText("");
        discountPercentTF.setText("");

    }

    // clear button function
    public void rentClearTF(){
        rInstrumentNameTF.setText("");
        chargePerDayTF.setText("");
        rentOutInstrumentNameTF.setText("");
        rCustomerNameTF.setText("");
        rPanNumberTF.setText("");
        rCustomerPhoneNumberTF.setText("");
        noOfdaysTF.setText("");
        returnInstrumentNameTF.setText("");

    }

    /*
   getter method of all attributes
   */

    public String getRInstrumentNameTF() {
        return rInstrumentNameTF.getText();
    }

    public String getSInstrumentNameTF() {

        return sInstrumentNameTF.getText();
    }

    public String getRentOutInstrumentNameTF() {

        return rentOutInstrumentNameTF.getText();
    }

    public String getSellInstrumentNameTF() {

        return sellInstrumentNameTF.getText();
    }

    public String getReturnInstrumentNameTF() {

        return returnInstrumentNameTF.getText();
    }

    public Integer getPriceTF() {
        try {
            return Integer.parseInt(priceTF.getText());
        }
        catch (NumberFormatException ex) {
            return null;
        }
    }

    public Integer getChargePerDayTF() {
        try {
            return Integer.parseInt(chargePerDayTF.getText());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public Integer getNoOfdaysTF() {
        try {
            return Integer.parseInt(noOfdaysTF.getText());
        } catch (NumberFormatException ex) {
            return null;
        }
    }
    public String getRCustomerNameTF() {

        return rCustomerNameTF.getText();
    }

    public String getSCustomerNameTF() {

        return sCustomerNameTF.getText();
    }

    public Integer getRCustomerPhoneNumberTF() {
        try {
            return Integer.parseInt(rCustomerPhoneNumberTF.getText());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public Integer getSCustomerPhoneNumberTF() {
        try {
            return Integer.parseInt(sCustomerPhoneNumberTF.getText());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public Integer getRPanNumberTF() {
        try {
            return Integer.parseInt(rPanNumberTF.getText());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public Integer getSPanNumberTF() {
        try {
            return Integer.parseInt(sPanNumberTF.getText());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public Integer getDiscountPercentTF() {
        try {
            return Integer.parseInt(discountPercentTF.getText());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    //main method
    public static void main(String[] args) {
        SarangiSansar myGridlayout = new SarangiSansar();
        myGridlayout.instrumentToRent();
        myGridlayout.instrumentToSell();
        myGridlayout.frame.setVisible(true);

    }

}