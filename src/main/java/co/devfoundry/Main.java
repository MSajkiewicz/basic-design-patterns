package co.devfoundry;

import co.devfoundry.notification.Email;
import co.devfoundry.notification.MobileApp;
import co.devfoundry.notification.TextMessage;
import co.devfoundry.order.Order;
import co.devfoundry.order.OrderStatus;
import co.devfoundry.practice.media.InternetNews;
import co.devfoundry.practice.media.RadioNews;
import co.devfoundry.practice.media.TvNews;
import co.devfoundry.practice.weatherForecast.WeatherForecast;

public class Main {

    public static void main(String[] args) {

        // Order
        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.changeOrderStatus(OrderStatus.WYSLANE);

        //Weather
        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();

        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);

        weatherForecast.notifyObservers();

        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);

        System.out.println("Nowa prognoza - powiadomienie tylko dla serwisu internetowego:");

        weatherForecast.updateForecast(18, 1007);
    }

}
