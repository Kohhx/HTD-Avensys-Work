import React, { useState, useEffect } from "react";
import axios from "axios";
import "./WeatherForecast.css";

function WeatherForecast() {
  // Define weather state to store weather data using useState hook
  const [weatherForecast, setWeatherForecast] = useState(null);

  // Define longitude and latitude of Singapore
  const lon = 103.851959;
  const lat = 1.29027;

  const api = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${process.env.REACT_APP_WEATHER_API_KEY}&units=metric`;

  // Use useEffect hook to fetch weather data from OpenWeatherMap API on first render
  useEffect(() => {
    // Define async function to fetch weather data
    const fetchWeather = async () => {
      const weather = await axios.get(api);
      setWeatherForecast(weather.data);
      console.log(weather.data);
    };

    // Call fetchweather on first render
    fetchWeather();

    // Call fetchweather every 5mins=(300,000ms) after first render
    let interval = setInterval(() => {
      fetchWeather();
    }, 300000);

    // Unmount and clean up seInterval instance after component unmount to prevent memory leak
    return () => {
      clearInterval(interval);
    };

    // Use an empty array dependency as second argument to prevent useEffect from running on every re-render
    // Only run useEffect once upon first render
  }, []);

  // console.log(weatherForecast);
  return (
    <>
      <div className="d-flex align-items-center justify-content-center vh-100 flex-column ">
      <h1 className="weather-title">My Weather App</h1>
        {weatherForecast && (
          <div className="weather-card">
            <h1>Weather in {weatherForecast.sys.country}</h1>
            <h3>
              {new Date().toLocaleDateString("en-US", {
                weekday: "long",
                year: "numeric",
                month: "long",
                day: "numeric",
                hour: "numeric",
                minute: "numeric",
              })}
            </h3>
            <p>{weatherForecast.weather[0].description}</p>
            <div className="d-flex gap-3">
              <img
                src={`https://openweathermap.org/img/w/${weatherForecast.weather[0].icon}.png`}
                alt="weather icon"
              />
              <h3>{weatherForecast.main.temp}°C</h3>
            </div>
          </div>
        )}
      </div>
    </>
  );
}

export default WeatherForecast;
