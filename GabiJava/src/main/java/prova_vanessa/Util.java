/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_vanessa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Aluno
 */
public class Util {
    
    public static String FormatarData(LocalDate data){
    DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/YYYY");
    return formatar.format(data); 
    }  
    
  public static String FormatarBrl(double valor){
      
   NumberFormatter formatar = NumberFormatter.getCurrencyInstance();
   return formatar.format(valor);
  }
}
