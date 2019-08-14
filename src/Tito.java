/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 * Objetivo: Esta classe tem como objetivo de imprimir informações sobre o professor Tito 
 * @author Alice/Herlmanoel
 * @since 06/08/20019
 * Última alteração 14/08/2019
 */
public class Tito {
     String Aulas;
     /**
     * Objetivo executar a classe
     * @param args array 
     * Imprime "Tito"
     */
    public static void main(String[] args) {
       String professor= "Tito";
         System.out.println(professor);
    }//Fim do main()

    /**
         * Método para retornar Aula
         *
         * @return String
         */
     public String getAulas (){
         return Aulas;
        }//Fim do getAulas
    
     public void setAulas(String Aulas){
      this.Aulas =  Aulas;
     /**
         * @return Metodo para retorno da Aulas
         * @param Aulas String 
         */
    } //Fim do setAulas
     
}
