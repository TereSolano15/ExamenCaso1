package Examen;

public interface Observer {
    public void update(Forecast x, WeatherStats y);
    public void update(Forecast x, WeatherStats y, UVIndex u, Wind w);
}
