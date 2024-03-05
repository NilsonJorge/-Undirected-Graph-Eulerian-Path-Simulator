package caminho_euller;




import java.util.ArrayList;
 

//grafo não orientado usando lista adjacente
public class Grafo {
 
    private int vertices; // Numero de vertices
    private ArrayList<Integer>[] adj; // lista adjacente
    
    // Constructor
    Grafo(int Num_vertices)
    {
        
        this.vertices = Num_vertices;
 
        
        initGraph();
    }
 
    // inicia a lista adjacente para cada vertice
    private void initGraph()
    {
        adj = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i] = new ArrayList<>();
        }
    }
 
    //adiciona a aresta que liga o vertice u ao vertice v
    public void Add_aresta_nao_orientado(Integer u, Integer v)
    {
        int verifica = 0;
        for (int i = 0; i < adj[u].size(); i++) {//verifica se a aresta ja existe
            if(adj[u].get(i) == v){
                verifica = 1;
            }
        }
        if(verifica == 0){
        adj[u].add(v);
        adj[v].add(u);
        }
    }
 
    // remove a aresta que liga o vertice u ao vertice v
    private void Remover_aresta_nao_orientado(Integer u, Integer v)
    {
        adj[u].remove(v);
        adj[v].remove(u);
    }
    
    
    //verifica se o grafo satifaz os requisitos para possuir um caminho euleriano
    public int verifica_grafo_nao_orientado(){
        int cont =0;
        for (int i = 0; i < vertices; i++) {
            if (adj[i].size() % 2 == 1) {
                cont++;
            }
        }
        if(cont <=2){
            return 1;//se o grafo tiver caminho
        }
        return 0;
    }
    
    /*Função responsável por iniciar a impressão do caminho Euleriano.
    Primeiro é procurado um vertice com grau impar, caso exista, é chamada a função 
     printEulerUtil_nao_orientado que realiza a impressão do caminho a partir deste vertice.
     Se não existir vertice impar, o caminho se inicia pelo vertice 0.
    Também é verificado se o grafo possui caminho euleriano*/
    public String imprime_caminho_euleriano_nao_orientado() 
    {
        String resultado  = "";
        
        if(verifica_grafo_nao_orientado() == 1){
          Integer u = 0;
        for (int i = 0; i < vertices; i++) {//encontrar um vertice com grau impar
            if (adj[i].size() % 2 == 1) {
                u = i;
                break;
            }
        }
 
        //Começa a imprimir o caminho a partir do vertice impar, se existir
        resultado =  imprime_caminho_euleriano_aux_nao_orientado(u,resultado);   
        }else{
            resultado = "O grafo não possui caminho euleriano";
        }
        
       
        System.out.println();
        return resultado;
    }
     //Imprime o caminho de Euller a partir do vertice u
    private String imprime_caminho_euleriano_aux_nao_orientado(Integer u, String resultado) 
    {
       //Percorre todos os vertices adjacentes ao vertice u
        for (int i = 0; i < adj[u].size(); i++) {
            Integer v = adj[u].get(i);
            // Se a aresta u-v é uma próxima aresta válida
            if (e_proxima_aresta_valida_nao_orientado(u, v)) {
            
                resultado = resultado + (u+1) + "-" + (v+1) + " ";
              
                Remover_aresta_nao_orientado(u, v);//Remove a aresta após ela ser utilizada
                return imprime_caminho_euleriano_aux_nao_orientado(v, resultado);
            }
            
        }
        return resultado;
    }

    //verifica se a aresta u-v pode ser considerada 
    //como próxima aresta do caminho euleriano
    private boolean e_proxima_aresta_valida_nao_orientado(Integer u, Integer v)
    {
        
        //A aresta u-v é válida em um dos dois casos a seguir:
        
        // 1) Se v é o único vertice adjacente de u, o tamanho da lista de vertices adjacentes é 1
        if (adj[u].size() == 1) {
            return true;
        }
 
        /* 2) Se houver vários adjacentes, então
        u-v não é uma ponte Faça os seguintes passos
        para verificar se u-v é uma ponte*/
        
        // 2.a) contagem de vértices alcançáveis ​​de u
        boolean[] Foi_visitado = new boolean[this.vertices];
        int cont1 = dfsCont(u, Foi_visitado);
 
        // 2.b) Remova a aresta (u, v) e após a remoção
        //da aresta, conta os vértices alcançáveis ​​de u
        Remover_aresta_nao_orientado(u, v);
        Foi_visitado = new boolean[this.vertices];
        int cont2 = dfsCont(u, Foi_visitado);
 
        // 2.c) Adicione a aresta de volta ao grafo
        Add_aresta_nao_orientado(u, v);
        return (cont1 > cont2) ? false : true;
    }
    
    
 
    //função de dfs que conta os vertices alcançáveis por V
    private int dfsCont(Integer v, boolean[] foiVisitado)
    {
        // Marca o vertice atual como visitado
        foiVisitado[v] = true;
        int cont = 1;
        //Recorre para todos os vértices adjacentes a este vértice
        for (int adj : adj[v]) {
            if (!foiVisitado[adj]) {
                cont = cont + dfsCont(adj, foiVisitado);
            }
        }
        return cont;
    }
 
}