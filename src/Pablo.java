/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 * Objetivo: Esta classe tem como objetivo de imprimir informações sobre o professor Pablo 
 * @author Alice/Herlmanoel
 * @since 06/08/20019
 * Última alteração 14/08/2019
 */
public class Pablo {
     String Formação;
     /**
     * Objetivo executar a classe
     * @param args array 
     * Imprime "Pablo"
     * 
     */
    public static void main(String[] args) {
       String professor= "Pablo";
         System.out.println(professor);
    }//Fim do main()

    /**
         * Método para retornar Formação
         *
         * @return String
         */
     public String getFormação (){
         return Formação;
        }//Fim do getFormação
    
     public void setMateria(String Formação){
      this.Formação =  Formação;
     /**
         * @return Metodo para retorno da Formação
         * @param Formação String 
         */
    } //Fim do setFormação
     
    
}
