

import javax.jws.WebService;


@WebService( targetNamespace ="http://localhost:8085/ws_server/weather")
public class WeatherService implements WeatherServiceImpl {

    @Override
    public String getWeatherByCityname(String name) {
        return name + "天气晴朗！";
    }
}