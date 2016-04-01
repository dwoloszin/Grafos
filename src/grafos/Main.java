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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        TadGrafos grafo = new TadGrafos(4);
        
        
        
        grafo.inserirAresta(0, 3);
        grafo.inserirAresta(1, 2);
        grafo.inserirAresta(1, 3);
        grafo.inserirAresta(2, 1);
        grafo.inserirAresta(2, 3);
        grafo.inserirAresta(3, 0);
        grafo.inserirAresta(3, 1);
        grafo.inserirAresta(3, 2);
        
        grafo.existeAresta(1, 2);
        
        grafo.ListaDeVerticesAdjacenciaAoVertice(0);
        grafo.ListaDeVerticesAdjacenciaAoVertice(1);
        grafo.ListaDeVerticesAdjacenciaAoVertice(2);
        grafo.ListaDeVerticesAdjacenciaAoVertice(3);
   
    }
 
    
}
