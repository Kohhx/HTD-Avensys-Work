package Assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

interface DataProvider{
    int[] provideData();
}

@Component
@Primary
class FirstDataCollector implements DataProvider {
    @Override
    public int[] provideData() {
        return new int[] {10,20,30,40,50};
    }
}

@Component
class SecondDataCollector implements DataProvider {
    @Override
    public int[] provideData() {
        return new int[] {1,3,5,7,9};
    }
}

@Component
class BusinessCalculator{
    public DataProvider dataProvider;

    @Autowired
    public BusinessCalculator(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public int findMaxValue() {
        return Arrays.stream(dataProvider.provideData()).max().orElse(0);
    }
}

@Configuration
@ComponentScan("Assignment")
public class DataApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DataApplication.class)) {
            System.out.println("Max Value: " + context.getBean(BusinessCalculator.class).findMaxValue());
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
