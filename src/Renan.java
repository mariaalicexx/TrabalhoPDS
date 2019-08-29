/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 * Objetivo: Esta classe tem como objetivo de imprimir informações sobre o professor Renan 
 * @author Alice/Herlmanoel
 * @since 06/08/20019
 * Última alteração 14/08/2019
 */
public class Renan {
     String Endereço;
     /**
     * Objetivo executar a classe
     * @param args array 
     * Imprime "Renan"
     * 
     */
    public static void main(String[] args) {
       String professor= "Renan";
         System.out.println(professor);
    }//Fim do main()

    /**
         * Método para retornar o Endereço
         
         * @return String
         */
     public String getEndereço (){
         return Endereço;
        }//Fim do getEndereço
    
     public void setMateria(String Endereço){
      this.Endereço =  Endereço;
     /**
         * @return Metodo para retorno da Endereço
         * @param Endereço String 
         */
    } //Fim do setEndereço
     
}
