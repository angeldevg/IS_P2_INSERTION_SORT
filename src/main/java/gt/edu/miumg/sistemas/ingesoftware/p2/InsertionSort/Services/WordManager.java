package gt.edu.miumg.sistemas.ingesoftware.p2.InsertionSort.Services;

public class WordManager implements IWordManager{
    
    
    
    public static String[] InsertWord(){

        IIsertionSort sort = new InsertionSort();
        String word[] = {"zorro", "yoyo", "carro", "zapato"};
        
        sort.InsertSort(word, word.length);
        
        return word;
}
    
    

    @Override
    public void ShowWord() {
        
        String w[] =  InsertWord();
        
        for(int i = 0; i < w.length; i++){
        
            System.out.println(w[i]);
            
        
        } 
        
        
    }
            
    }

    

