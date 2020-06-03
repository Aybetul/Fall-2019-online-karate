import com.intuit.karate.junit5.Karate;

public class FeatureRunner {
  @Karate.Test
  Karate MetaWeather (){
      return new Karate().tags("@meta_weather").relativeTo(getClass());
  }



}
