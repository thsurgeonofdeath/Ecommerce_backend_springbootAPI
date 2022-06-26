package ecom.backend;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import ecom.backend.dao.CategoryRepository;
import ecom.backend.dao.ProductRepository;
import ecom.backend.entities.Category;
import ecom.backend.entities.Product;
import net.bytebuddy.utility.RandomString;

@EnableJpaRepositories("ecom.backend.dao")
@SpringBootApplication
public class EcommerceBackendApplication implements CommandLineRunner {
	
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(EcommerceBackendApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		
		repositoryRestConfiguration.exposeIdsFor(Product.class,Category.class);
		
		
//		categoryRepository.save(new Category(null, "Laptops",null,null,null));
//		categoryRepository.save(new Category(null, "Printers",null,null,null));
//		categoryRepository.save(new Category(null, "Smartphones",null,null,null));
//		Random rnd=new Random();
//        categoryRepository.findAll().forEach(c->{
//            for (int i = 0; i <3 ; i++) {
//                Product p=new Product();
//                p.setName(RandomString.make(18));
//                p.setCurrentPrice(100+rnd.nextInt(10000));
//                p.setAvailable(rnd.nextBoolean());
//                p.setPromotion(rnd.nextBoolean());
//                p.setSelected(rnd.nextBoolean());
//                p.setCategory(c);
//                p.setPhotoName("unknown.png");
//                productRepository.save(p);
//            }
//        });
	}

}
