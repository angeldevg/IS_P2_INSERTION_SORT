package gt.edu.miumg.sistemas.ingesoftware.p2.InsertionSort;

import gt.edu.miumg.sistemas.ingesoftware.p2.InsertionSort.Services.IWordManager;
import gt.edu.miumg.sistemas.ingesoftware.p2.InsertionSort.Services.WordManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InsertionSortApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(InsertionSortApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        
         IWordManager word = new WordManager();
         word.ShowWord();
        
    }

}
