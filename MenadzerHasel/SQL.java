package MenadzerHasel;

import javax.swing.*;
import java.sql.*;

public class SQL {

    public void TestPolaczenia(){

        Connection connection = null;


        try {
            String url = "jdbc:sqlite:C:\\bazy\\klasa4pp\\";
            String filesdb = "menadzer.db";
            connection = DriverManager.getConnection(url+filesdb);

            System.out.println("Połączono z bazą: "+filesdb);

        } catch(SQLException ex){
            String msg = "SQLState: " + ((SQLException)ex).getSQLState() +"\n"+
                    "Error Code: " + ((SQLException)ex).getErrorCode() +" \n " +
                    "Message: " + ex.getMessage();
            JOptionPane.showMessageDialog(
                    null,
                    msg,
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }

    }




    public void NowyWpis(String login,String password, String linkURL) {

        Connection connection = null;

        String query = "INSERT INTO dane(login,password,linkURL) VALUES (?,?,?)";

        try {
            String url = "jdbc:sqlite:C:\\bazy\\klasa4pp\\";
            String filesdb = "menadzer.db";
            connection = DriverManager.getConnection(url+filesdb);

            PreparedStatement sql = connection.prepareStatement(query);
            sql.setString(1,login);
            sql.setString(2,password);
            sql.setString(3,linkURL);
            sql.executeUpdate();

        } catch(SQLException ex){

            JOptionPane.showMessageDialog(
                    null,
                    "Błędne zapytanie!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
        finally {

            connection = null;

        }


    }

    public void UsunWpisLogin(String login) {

        Connection connection = null;

        String query = "DELETE FROM dane WHERE login = " + login;

        try {

            String url = "jdbc:sqlite:C:\\bazy\\klasa4pp\\";
            String filesdb = "menadzer.db";
            connection = DriverManager.getConnection(url+filesdb);

            PreparedStatement sql = connection.prepareStatement(query);
            sql.executeUpdate();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
        finally {

            connection = null;

        }


    }

    public void UsunWpisPassword(String password) {

        Connection connection = null;

        String query = "DELETE FROM dane WHERE password = " + password;

        try {

            String url = "jdbc:sqlite:C:\\bazy\\klasa4pp\\";
            String filesdb = "menadzer.db";
            connection = DriverManager.getConnection(url+filesdb);

            PreparedStatement sql = connection.prepareStatement(query);
            sql.executeUpdate();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
        finally {

            connection = null;

        }


    }

    public void SzukajAdres(String linkUrlpodany) {

        Connection connection = null;
        String[][] dane = new String[100][4];

        String query = "SELECT id,login,password,linkURL FROM Dane WHERE linkURL LIKE '%"+linkUrlpodany+"%'";

        try {
            String url = "jdbc:sqlite:C:\\bazy\\klasa4pp\\";
            String filesdb = "menadzer.db";
            connection = DriverManager.getConnection(url + filesdb);

            try (
                    Statement stmt = connection.createStatement();

                    ResultSet show = stmt.executeQuery(query)) {

                int i = 0;
                while (show.next()){

                    String id = Integer.toString(show.getInt("id"));
                    String login = show.getString("login");
                    String password = show.getString("password");
                    String linkURL = show.getString("linkURL");


                    dane[i][0] = id;
                    dane[i][1] = login;
                    dane[i][2] = password;
                    dane[i][3] = linkURL;

                    i++;
                }

                String column[] = {"ID","Login","Password","link URL"};
                JFrame ramka = new JFrame("Szukaj w/g Adresu URL - WYNIK");
                JTable tabela = new JTable(dane,column);

                tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
                tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
                tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
                tabela.getColumnModel().getColumn(3).setPreferredWidth(400);
                tabela.setBounds(0,0,600,300);

                JScrollPane scrollPane = new JScrollPane(tabela);
                ramka.add(scrollPane);
                ramka.setSize(600,300);
                ramka.setVisible(true);

            } catch (SQLException e){
                JOptionPane.showMessageDialog(
                        null,
                        "Zapytanie błędne",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            connection=null;
        }
    }


    public void SzukajLogin(String loginPodany) {

        Connection connection = null;
        String[][] dane = new String[100][4];

            String query = "SELECT id,login,password,linkURL FROM Dane WHERE login LIKE '%"+loginPodany+"%'";

            try {
                String url = "jdbc:sqlite:C:\\bazy\\klasa4pp\\";
                String filesdb = "menadzer.db";
                connection = DriverManager.getConnection(url + filesdb);

                try (
                        Statement stmt = connection.createStatement();

                        ResultSet show = stmt.executeQuery(query)) {

                    int i = 0;
                    while (show.next()){

                        String id = Integer.toString(show.getInt("id"));
                        String login = show.getString("login");
                        String password = show.getString("password");
                        String linkURL = show.getString("linkURL");


                        dane[i][0] = id;
                        dane[i][1] = login;
                        dane[i][2] = password;
                        dane[i][3] = linkURL;

                        i++;
                    }

                    String column[] = {"ID","Login","Password","link URL"};
                    JFrame ramka = new JFrame("Szukaj w/g Loginu - WYNIK");
                    JTable tabela = new JTable(dane,column);

                    tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                    tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
                    tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
                    tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
                    tabela.getColumnModel().getColumn(3).setPreferredWidth(400);
                    tabela.setBounds(0,0,600,300);

                    JScrollPane scrollPane = new JScrollPane(tabela);
                    ramka.add(scrollPane);
                    ramka.setSize(600,300);
                    ramka.setVisible(true);

                } catch (SQLException e){
                    JOptionPane.showMessageDialog(
                            null,
                            "Zapytanie błędne",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }


            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally {
                connection=null;
            }
        }


}
