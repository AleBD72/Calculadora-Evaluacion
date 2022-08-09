import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Objects;

public class Calculadora extends JFrame{
    private JLabel ScreenTXT;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnDelete;
    private JPanel calcuPanel;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnTimes;
    private JButton btnDivide;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btn0;
    private JButton btnpoint;
    private JButton btnEXP;
    private JButton btnANS;
    private JButton btnEqual;
    private JButton btnClear;
    private JLabel Screen2TXT;
    private JButton btnSen;
    private JButton btnCos;
    private JButton btnTan;
    private JButton btnOff;
    private JButton btnON;
    private JButton lightButton;
    private JButton darkButton;
    private JButton shiftButton;
    private JButton btnElevado;
    private JButton btnFact;

    //VARIABLES
    double num1=0;
    String operador="";
    double num2=0;
    double result=0;
    boolean encendido=false;
    boolean shift = false;

    //ELIMINA NOTACION CIENTIFICA EN EXP
    DecimalFormat df = new DecimalFormat("#");

    public Calculadora() {
        setContentPane(calcuPanel);
        setTitle("Calculadora");
        setMinimumSize(new Dimension(600,500));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        //NUMEROS Y PTO (BOTONES)
        btnpoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(ScreenTXT.getText().contains(".")) && encendido){ //colocar una sola vez
                    ScreenTXT.setText(ScreenTXT.getText()+".");
                }
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    if (ScreenTXT.getText().length()!=0){
                        if ((ScreenTXT.getText().charAt(0))=='0' && !ScreenTXT.getText().contains(".")){
                            ScreenTXT.setText("");
                        }
                    }
                    ScreenTXT.setText(ScreenTXT.getText()+"0");
                }
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    if (ScreenTXT.getText().length()!=0){
                        if ((ScreenTXT.getText().charAt(0))=='0' && !ScreenTXT.getText().contains(".")){
                            ScreenTXT.setText("");
                        }
                    }
                    ScreenTXT.setText(ScreenTXT.getText()+"1");
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    if (ScreenTXT.getText().length()!=0){
                        if ((ScreenTXT.getText().charAt(0))=='0' && !ScreenTXT.getText().contains(".")){
                            ScreenTXT.setText("");
                        }
                    }
                    ScreenTXT.setText(ScreenTXT.getText()+"2");
                }
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    if (ScreenTXT.getText().length()!=0){
                        if ((ScreenTXT.getText().charAt(0))=='0' && !ScreenTXT.getText().contains(".")){
                            ScreenTXT.setText("");
                        }
                    }
                    ScreenTXT.setText(ScreenTXT.getText()+"3");
                }
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    if (ScreenTXT.getText().length()!=0){
                        if ((ScreenTXT.getText().charAt(0))=='0' && !ScreenTXT.getText().contains(".")){
                            ScreenTXT.setText("");
                        }
                    }
                    ScreenTXT.setText(ScreenTXT.getText()+"4");
                }
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    if (ScreenTXT.getText().length()!=0){
                        if ((ScreenTXT.getText().charAt(0))=='0' && !ScreenTXT.getText().contains(".")){
                            ScreenTXT.setText("");
                        }
                    }
                    ScreenTXT.setText(ScreenTXT.getText()+"5");
                }
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    if (ScreenTXT.getText().length()!=0){
                        if ((ScreenTXT.getText().charAt(0))=='0' && !ScreenTXT.getText().contains(".")){
                            ScreenTXT.setText("");
                        }
                    }
                    ScreenTXT.setText(ScreenTXT.getText()+"6");
                }
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    if (ScreenTXT.getText().length()!=0){
                        if ((ScreenTXT.getText().charAt(0))=='0' && !ScreenTXT.getText().contains(".")){
                            ScreenTXT.setText("");
                        }
                    }
                    ScreenTXT.setText(ScreenTXT.getText()+"7");
                }
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    if (ScreenTXT.getText().length()!=0){
                        if ((ScreenTXT.getText().charAt(0))=='0' && !ScreenTXT.getText().contains(".")){
                            ScreenTXT.setText("");
                        }
                    }
                    ScreenTXT.setText(ScreenTXT.getText()+"8");
                }
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    if (ScreenTXT.getText().length()!=0){
                        if ((ScreenTXT.getText().charAt(0))=='0' && !ScreenTXT.getText().contains(".")){
                            ScreenTXT.setText("");
                        }
                    }
                    ScreenTXT.setText(ScreenTXT.getText()+"9");
                }
            }
        });

        //OPERACIONES (BOTONES)
        btnEXP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    num1=Double.parseDouble(ScreenTXT.getText());
                    operador="E";
                    ScreenTXT.setText("");
                    Screen2TXT.setText(num1+operador);
                }
            }
        });
        btnANS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    ScreenTXT.setText(""+formatearDecimales(result,4));
                }
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    num1=Double.parseDouble(ScreenTXT.getText());
                    operador="+";
                    ScreenTXT.setText("");
                    Screen2TXT.setText(num1+operador);
                }
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    num1=Double.parseDouble(ScreenTXT.getText());
                    operador="-";
                    ScreenTXT.setText("");
                    Screen2TXT.setText(num1+operador);
                }
            }
        });
        btnTimes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    num1=Double.parseDouble(ScreenTXT.getText());
                    operador="x";
                    ScreenTXT.setText("");
                    Screen2TXT.setText(num1+operador);
                }
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    num1=Double.parseDouble(ScreenTXT.getText());
                    operador="÷";
                    ScreenTXT.setText("");
                    Screen2TXT.setText(num1+operador);
                }
            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    Screen2TXT.setText("");
                    if (ScreenTXT.getText().length()>1){
                        ScreenTXT.setText(ScreenTXT.getText().substring(0,ScreenTXT.getText().length()-1));
                    } else if (ScreenTXT.getText().length()==1){
                        ScreenTXT.setText("0");
                    }
                }
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    ScreenTXT.setText("0");
                    Screen2TXT.setText("");
                }
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    if (!Objects.equals(operador, "!")){
                        num2=Double.parseDouble(ScreenTXT.getText());
                        Screen2TXT.setText(Screen2TXT.getText()+num2);
                    }

                    switch (operador){
                        case "+":
                            result=num1+num2;
                            break;
                        case "-":
                            result=num1-num2;
                            break;
                        case "x":
                            result = num1*num2;
                            break;
                        case "÷":
                            result=num1/num2;
                            break;
                        case "E":
                            result=num1;
                            for (int i=0; i<num2;i++){
                                result*=10;
                            }
                            break;
                        case "sen":
                            if (!shift){
                                /*grados -> rad junto a la función seno*/
                                result= Math.sin(Math.toRadians(num2));
                            } else {
                                result = 1 / (Math.sin(Math.toRadians(num2)));
                            }
                            break;
                        case "cos":
                            if (!shift){
                                result= Math.cos(Math.toRadians(num2));
                            }else {
                                result= 1 / (Math.cos(Math.toRadians(num2)));
                            }
                            break;
                        case "tan":
                            if (!shift){
                                result= Math.tan(Math.toRadians(num2));
                            } else {
                                result= 1/(Math.tan(Math.toRadians(num2)));
                            }
                            break;
                        case "^":
                            if (!shift){
                                result= Math.pow(num1,num2);
                            } else {
                                result= Math.pow(num2, (1 / num1));
                            }
                            break;
                        case "!":
                            result = factorial(num1);
                            break;
                    }

                    if (shift){
                        shift=false;
                        shiftButton.setBackground(btnON.getBackground());
                        shiftButton.setForeground(Color.black);
                    }

                    num1 = num2 = 0;

                    if (result%1==0.0){ // elimina decimal .0 en enteros
                        String check = Double.toString(result); //resuelve si dentro de la variable existe la letra E
                        if (!check.contains("E")){
                            String int_woD=Double.toString(result); // Int without Decimals
                            int_woD = int_woD.substring(0, int_woD.length()-2);
                            ScreenTXT.setText(int_woD);
                            result = Double.parseDouble(int_woD);
                        }else{
                            //ELIMINA NOTACION
                            ScreenTXT.setText(""+df.format(formatearDecimales(result,4)));
                        }
                    } else {
                        ScreenTXT.setText(""+formatearDecimales(result,4));
                    }
                }
            }
        });

        btnON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                encendido=true;
                Screen2TXT.setText("");
                ScreenTXT.setText("0");
            }
        });
        btnOff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                encendido=false;
                ScreenTXT.setText("");
                Screen2TXT.setText("");
                operador="";
                num2 = num1 = 0;
            }
        });
        btnSen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    num1=0;
                    operador="sen";
                    if (!shift){
                        Screen2TXT.setText("sen ");
                    } else {
                        Screen2TXT.setText("cosec ");
                    }

                }
            }
        });
        btnCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    num1=0;
                    operador="cos";
                    if (!shift){
                        Screen2TXT.setText("cos ");
                    } else {
                        Screen2TXT.setText("sec ");
                    }

                }
            }
        });
        btnTan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    num1=0;
                    operador="tan";
                    if (!shift){
                        Screen2TXT.setText("tan ");
                    }else {
                        Screen2TXT.setText("cotg ");
                    }
                }
            }
        });
        lightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    calcuPanel.setBackground(Color.LIGHT_GRAY);
                }
            }
        });
        darkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    calcuPanel.setBackground(Color.DARK_GRAY);
                }
            }
        });
        shiftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    if (shift){
                        shift=false;
                        shiftButton.setBackground(btnON.getBackground());
                        shiftButton.setForeground(Color.black);
                    } else {
                        shift=true;
                        shiftButton.setBackground(Color.white);
                        shiftButton.setForeground(Color.red);
                    }
                }
            }
        });
        btnElevado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    num1=Double.parseDouble(ScreenTXT.getText());
                    operador="^";
                    if (!shift){
                        ScreenTXT.setText("");
                        Screen2TXT.setText(num1+"^");
                    }else{
                        ScreenTXT.setText("");
                        Screen2TXT.setText(num1+"√");
                    }
                }
            }
        });
        btnFact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (encendido){
                    num1=Double.parseDouble(ScreenTXT.getText());
                    operador="!";

                    Screen2TXT.setText(num1+operador);
                }
            }
        });
    }
    public static Double formatearDecimales(Double numero, Integer numeroDecimales) {
        return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
    }

    public static Double factorial (double numero){
        if (numero==0){
            return 1d;
        }else {
            return numero * factorial(numero-1);
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
    }
}
