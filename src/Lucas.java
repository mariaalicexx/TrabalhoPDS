/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** 
 * Objetivo: Esta classe tem como objetivo de imprimir informações sobre o professor Lucas 
 * @author Alice/Herlmanoel
 * @since 06/08/20019
 * Última alteração 14/08/2019
 */

public class Lucas {

    String Materia;

    /**
     * Objetivo executar a classe
     * @param args array
     * Imprime "Lucas"
     * 
     */
    public static void main(String[] args) {
       
        String professor= "Lucas";
         System.out.println(professor);
    }//Fim do main()
/**
         * Método para retornar a materia
         *
         * @return String
         */
    public String getMateria() {
        return Materia;
        
    } //Fim do getMateria()

    public void setMateria(String Materia) {
        this.Materia = Materia;

        /**
         * @return Metodo para retorno da materia
         * @param Materia String 
         */
    } //Fim do setMateria

}
