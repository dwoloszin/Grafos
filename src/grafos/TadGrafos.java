/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author dario.lwoloszin
 */
public class TadGrafos {
    
    private int v;
    private int[][] matrizadjacente;
    
    
    
    TadGrafos(int v){
        this.v = v;
        this.matrizadjacente = new int [v][v];
        for (int i = 0; i < matrizadjacente.length; i++)
            for (int j = 0; j < matrizadjacente[0].length; j++)
                matrizadjacente[i][j] = 0;
   
    }
    

    public void inserirAresta (int Vorigem, int Vdestino){
            this.matrizadjacente[Vorigem][Vdestino]= 1;
    }
    
    public void removerAresta (int Vorigem, int Vdestino){
            this.matrizadjacente[Vorigem][Vdestino]= 0;
    }
    
    public void existeAresta (int Vorigem, int Vdestino){
            if (this.matrizadjacente[Vorigem][Vdestino] == 1)
                System.out.println("EXISTE");
            else{System.out.println("Não EXISTE");}
       
    }
    
    public void ListaDeVerticesAdjacenciaAoVertice(int vertice){
        System.out.print("Vertices Adjacentes ao vertice:V" + vertice + " =[");
        for(int i = 0; i < matrizadjacente[vertice].length; i++){
            System.out.print(matrizadjacente[vertice][i] + ",");
 
        }
        System.out.println("]");
    
    
    }
    
    
    
    
    
    
}
