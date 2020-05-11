package app.config;

import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//Задание:
//1) Создайте бин Dog, унаследуйте его от Animal.
// Создайте на основе этого класса компонент.
//2) Запустите приложение и проверьте, что было выброшено
// исключение NoUniqueBeanDefinitionException.
// Это произошло из-за того, что существует 2 бина с типом Animal.
//3) Прочитайте о связывании бинов по имени и
// свяжите AnimalCage c бином Dog через интерфейс Animal.
//4) На основе класса Timer создайте бин. Свяжите с
// AnimalCage. Проверьте, что при выполнении метода main время,
// которое пишет таймер, одно и тоже.
@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

//    @Bean(name="Dog")
//    public Dog dog() {
//        Dog dog = new Dog();
//        return dog;
//    }
//
//    @Bean(name="Timer")
//    public Timer timer() {
//        Timer timer = new Timer();
//        return timer;
//    }
}
