/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** Classe para dado de determinado professor.
 *
 * @author Alice/Herlmanoel
 * @since 06/08/20019
 */
public class Lucas {

    String Materia;

    /**
     * Objetivo executar a classe
     * @param args 
     * 
     * Imprime "pro"
     */
    public static void main(String[] args) {
       
        String professor= "Lucas";
         System.out.println(professor);
    }

    public String getMateria() {
        return Materia;
        /**
         * Método para retornar a materia
         *
         * @return String
         */
    } //Fim do método

    public void setMateria(String Materia) {
        this.Materia = Materia;

        /**
         * @return Metodo para retorno da materia
         * @param Materia String -
         */
    }

}
