import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main {
    public static void main(String[] args){
        // List of currencies
        String[] currencies = {"US DOLLAR", "NZ DOLLAR", "AUSTRALIAN DOLLAR", "INDONESIAN RUPIAH", "EURO",
        "POUND STERLING", "FIJIAN DOLLAR", "INDIAN RUPEE"};

        // Creating frame
        JFrame jFrame = new JFrame("Currency Converter");

        // Creating panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Creating combo box
        JTextArea textArea = new JTextArea("All currency conversion rates are correct as on Tuesday, 3 November 2020");
        JLabel convertFromLabel = new JLabel("Converting from: ");
        JComboBox<String> currencyListFrom = new JComboBox<>(currencies);
        currencyListFrom.setSelectedIndex(0);
        JLabel convertToLabel = new JLabel("Converting to: ");
        JComboBox<String> currencyListTo = new JComboBox<>(currencies);
        currencyListTo.setSelectedIndex(1);
        JLabel resultLabel = new JLabel("------------");
        JTextField convertFromText = new JTextField(7); // 7 columns in the text field
        JButton convertButton = new JButton("CONVERT");

        // Adding graphics objects to the panel
        panel.add(textArea);
        panel.add(new JLabel()); // an empty label
        panel.add(convertFromLabel);
        panel.add(currencyListFrom);
        panel.add(convertFromText);
        panel.add(convertToLabel);
        panel.add(currencyListTo);
        panel.add(resultLabel);
        panel.add(convertButton);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Initialising important variables
                double convertFromValue, convertToValue;

                try {
                    // Checking what we currencies we are converting to and from
                    String currencyFrom = (String) currencyListFrom.getSelectedItem();
                    String currencyTo = (String) currencyListTo.getSelectedItem();
                    convertFromValue = Double.parseDouble(convertFromText.getText());
                    assert currencyFrom != null && currencyTo != null;
                    if (currencyFrom.equals("US DOLLAR") && currencyTo.equals("NZ DOLLAR")) {
                        convertToValue = convertFromValue * 1.51;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("US DOLLAR") && currencyTo.equals("AUSTRALIAN DOLLAR")) {
                        convertToValue = convertFromValue * 1.42;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("US DOLLAR") && currencyTo.equals("INDONESIAN RUPIAH")) {
                        convertToValue = convertFromValue * 14675;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("US DOLLAR") && currencyTo.equals("EURO")) {
                        convertToValue = convertFromValue * 0.86;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("US DOLLAR") && currencyTo.equals("POUND STERLING")) {
                        convertToValue = convertFromValue * 0.77;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("US DOLLAR") && currencyTo.equals("FIJIAN DOLLAR")) {
                        convertToValue = convertFromValue * 2.14;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("US DOLLAR") && currencyTo.equals("INDIAN RUPEE")) {
                        convertToValue = convertFromValue * 74.48;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("NZ DOLLAR") && currencyTo.equals("US DOLLAR")) {
                        convertToValue = convertFromValue * 0.66;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("NZ DOLLAR") && currencyTo.equals("AUSTRALIAN DOLLAR")) {
                        convertToValue = convertFromValue * 0.94;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("NZ DOLLAR") && currencyTo.equals("INDONESIAN RUPIAH")) {
                        convertToValue = convertFromValue * 9687.73;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("NZ DOLLAR") && currencyTo.equals("EURO")) {
                        convertToValue = convertFromValue * 0.57;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("NZ DOLLAR") && currencyTo.equals("POUND STERLING")) {
                        convertToValue = convertFromValue * 0.51;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("NZ DOLLAR") && currencyTo.equals("FIJIAN DOLLAR")) {
                        convertToValue = convertFromValue * 1.42;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("NZ DOLLAR") && currencyTo.equals("INDIAN RUPEE")) {
                        convertToValue = convertFromValue * 49.40;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("AUSTRALIAN DOLLAR") && currencyTo.equals("US DOLLAR")) {
                        convertToValue = convertFromValue * 0.71;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("AUSTRALIAN DOLLAR") && currencyTo.equals("NZ DOLLAR")) {
                        convertToValue = convertFromValue * 1.06;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("AUSTRALIAN DOLLAR") && currencyTo.equals("INDONESIAN RUPIAH")) {
                        convertToValue = convertFromValue * 10304.72;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("AUSTRALIAN DOLLAR") && currencyTo.equals("EURO")) {
                        convertToValue = convertFromValue * 0.61;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("AUSTRALIAN DOLLAR") && currencyTo.equals("POUND STERLING")) {
                        convertToValue = convertFromValue * 0.55;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("AUSTRALIAN DOLLAR") && currencyTo.equals("FIJIAN DOLLAR")) {
                        convertToValue = convertFromValue * 1.51;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("AUSTRALIAN DOLLAR") && currencyTo.equals("INDIAN RUPEE")) {
                        convertToValue = convertFromValue * 52.55;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("INDONESIAN RUPIAH") && currencyTo.equals("US DOLLAR")) {
                        convertToValue = convertFromValue * 0.000068;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("INDONESIAN RUPIAH") && currencyTo.equals("NZ DOLLAR")) {
                        convertToValue = convertFromValue * 0.00010;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("INDONESIAN RUPIAH") && currencyTo.equals("AUSTRALIAN DOLLAR")) {
                        convertToValue = convertFromValue * 0.000097;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("INDONESIAN RUPIAH") && currencyTo.equals("EURO")) {
                        convertToValue = convertFromValue / 17010.62;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("INDONESIAN RUPIAH") && currencyTo.equals("POUND STERLING")) {
                        convertToValue = convertFromValue / 18882.17;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("INDONESIAN RUPIAH") && currencyTo.equals("FIJIAN DOLLAR")) {
                        convertToValue = convertFromValue * 0.00015;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("INDONESIAN RUPIAH") && currencyTo.equals("INDIAN RUPEE")) {
                        convertToValue = convertFromValue * 0.0051;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("EURO") && currencyTo.equals("US DOLLAR")) {
                        convertToValue = convertFromValue * 1.16;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("EURO") && currencyTo.equals("NZ DOLLAR")) {
                        convertToValue = convertFromValue * 1.76;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("EURO") && currencyTo.equals("AUSTRALIAN DOLLAR")) {
                        convertToValue = convertFromValue * 1.65;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("EURO") && currencyTo.equals("INDONESIAN RUPIAH")) {
                        convertToValue = convertFromValue * 17023.08;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("EURO") && currencyTo.equals("POUND STERLING")) {
                        convertToValue = convertFromValue * 0.90;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("EURO") && currencyTo.equals("FIJIAN DOLLAR")) {
                        convertToValue = convertFromValue * 2.49;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("EURO") && currencyTo.equals("INDIAN RUPEE")) {
                        convertToValue = convertFromValue * 86.77;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("POUND STERLING") && currencyTo.equals("US DOLLAR")) {
                        convertToValue = convertFromValue * 1.29;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("POUND STERLING") && currencyTo.equals("NZ DOLLAR")) {
                        convertToValue = convertFromValue * 1.95;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("POUND STERLING") && currencyTo.equals("AUSTRALIAN DOLLAR")) {
                        convertToValue = convertFromValue * 1.83;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("POUND STERLING") && currencyTo.equals("INDONESIAN RUPIAH")) {
                        convertToValue = convertFromValue * 18912.74;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("POUND STERLING") && currencyTo.equals("EURO")) {
                        convertToValue = convertFromValue * 1.11;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("POUND STERLING") && currencyTo.equals("FIJIAN DOLLAR")) {
                        convertToValue = convertFromValue * 2.76;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("POUND STERLING") && currencyTo.equals("INDIAN RUPEE")) {
                        convertToValue = convertFromValue * 96.53;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("FIJIAN DOLLAR") && currencyTo.equals("US DOLLAR")) {
                        convertToValue = convertFromValue * 0.47;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("FIJIAN DOLLAR") && currencyTo.equals("NZ DOLLAR")) {
                        convertToValue = convertFromValue * 0.71;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("FIJIAN DOLLAR") && currencyTo.equals("AUSTRALIAN DOLLAR")) {
                        convertToValue = convertFromValue * 0.66;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("FIJIAN DOLLAR") && currencyTo.equals("INDONESIAN RUPIAH")) {
                        convertToValue = convertFromValue * 6839.05;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("FIJIAN DOLLAR") && currencyTo.equals("EURO")) {
                        convertToValue = convertFromValue * 0.40;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("FIJIAN DOLLAR") && currencyTo.equals("POUND STERLING")) {
                        convertToValue = convertFromValue * 0.36;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("FIJIAN DOLLAR") && currencyTo.equals("INDIAN RUPEE")) {
                        convertToValue = convertFromValue * 34.81;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("INDIAN RUPEE") && currencyTo.equals("US DOLLAR")) {
                        convertToValue = convertFromValue * 0.013;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("INDIAN RUPEE") && currencyTo.equals("NZ DOLLAR")) {
                        convertToValue = convertFromValue * 0.020;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("INDIAN RUPEE") && currencyTo.equals("AUSTRALIAN DOLLAR")) {
                        convertToValue = convertFromValue * 0.019;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("INDIAN RUPEE") && currencyTo.equals("INDONESIAN RUPIAH")) {
                        convertToValue = convertFromValue * 196.50;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("INDIAN RUPEE") && currencyTo.equals("EURO")) {
                        convertToValue = convertFromValue * 0.012;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("INDIAN RUPEE") && currencyTo.equals("POUND STERLING")) {
                        convertToValue = convertFromValue * 0.010;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else if (currencyFrom.equals("INDIAN RUPEE") && currencyTo.equals("FIJIAN DOLLAR")) {
                        convertToValue = convertFromValue * 0.029;
                        resultLabel.setText(Double.toString(convertToValue));
                    } else {
                        // Do nothing
                    }
                }
                catch (Exception ex){
                    // Do nothing
                }
            }
        });

        // Adding the panel to the frame
        jFrame.add(panel);

        // Setting size of the window
        jFrame.setSize(800, 640);

        // Making the frame visible
        jFrame.setVisible(true);
    }
}
