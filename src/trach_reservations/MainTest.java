/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trach_reservations;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.text.DateFormatter;

/**
 *
 * @author Administrator
 */
public class MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Vector<ReservationEntity> res = new ReservationDAO().getCollection();
//        if(res.isEmpty())
//            System.out.println("NULL");
//        for (ReservationEntity re : res) {
//            System.out.print(re.toString());
//        }
            Date date = new Date();
            date.getTime();
            SimpleDateFormat dt1 = new SimpleDateFormat("dd/MM/yyyyy");
            System.out.println(dt1.format(date));
    }
    
}
