/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 * Objetivo: Esta classe tem como objetivo de imprimir informações sobre o professor Nickerson 
 * @author Alice/Herlmanoel
 * @since 06/08/20019
 * Última alteração 14/08/2019
 */
public class Nickerson {
     int Idade;
     /**
     * Objetivo executar a classe
     * @param args array 
     * Imprime "Nickerson"
     * 
     */
    public static void main(int[] args) {
         String professor= "Nickerson";
         System.out.println(professor);
    }//Fim do main()

    /**
         * Método para retornar a idade
         *
         * @return int
         */
     public int getIdade (){
         return Idade;
        }//Fim do getIdade
    
     public void setIdade(int Idade){
      this.Idade =  Idade;
     /**
         * @return Metodo para retorno da idade
         * @param Idade int 
         */
    } //Fim do setIdade
     
}
