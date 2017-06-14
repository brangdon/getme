package com.makemyandroidapp.getme.forecast;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Marcin on 2017-05-19.
 */

public class Forecast {
    /**
     * latitude : 37.8267
     * longitude : -122.4233
     * timezone : America/Los_Angeles
     * offset : -7
     * currently : {"time":1495198553,"summary":"Clear","icon":"clear-night","nearestStormDistance":150,"nearestStormBearing":349,"precipIntensity":0,"precipProbability":0,"temperature":54.21,"apparentTemperature":54.21,"dewPoint":47.8,"humidity":0.79,"windSpeed":3.77,"windBearing":270,"visibility":9.46,"cloudCover":0.06,"pressure":1015.21,"ozone":334.12}
     * minutely : {"summary":"Clear for the hour.","icon":"clear-night","data":[{"time":1495198500,"precipIntensity":0,"precipProbability":0},{"time":1495198560,"precipIntensity":0,"precipProbability":0},{"time":1495198620,"precipIntensity":0,"precipProbability":0},{"time":1495198680,"precipIntensity":0,"precipProbability":0},{"time":1495198740,"precipIntensity":0,"precipProbability":0},{"time":1495198800,"precipIntensity":0,"precipProbability":0},{"time":1495198860,"precipIntensity":0,"precipProbability":0},{"time":1495198920,"precipIntensity":0,"precipProbability":0},{"time":1495198980,"precipIntensity":0,"precipProbability":0},{"time":1495199040,"precipIntensity":0,"precipProbability":0},{"time":1495199100,"precipIntensity":0,"precipProbability":0},{"time":1495199160,"precipIntensity":0,"precipProbability":0},{"time":1495199220,"precipIntensity":0,"precipProbability":0},{"time":1495199280,"precipIntensity":0,"precipProbability":0},{"time":1495199340,"precipIntensity":0,"precipProbability":0},{"time":1495199400,"precipIntensity":0,"precipProbability":0},{"time":1495199460,"precipIntensity":0,"precipProbability":0},{"time":1495199520,"precipIntensity":0,"precipProbability":0},{"time":1495199580,"precipIntensity":0,"precipProbability":0},{"time":1495199640,"precipIntensity":0,"precipProbability":0},{"time":1495199700,"precipIntensity":0,"precipProbability":0},{"time":1495199760,"precipIntensity":0,"precipProbability":0},{"time":1495199820,"precipIntensity":0,"precipProbability":0},{"time":1495199880,"precipIntensity":0,"precipProbability":0},{"time":1495199940,"precipIntensity":0,"precipProbability":0},{"time":1495200000,"precipIntensity":0,"precipProbability":0},{"time":1495200060,"precipIntensity":0,"precipProbability":0},{"time":1495200120,"precipIntensity":0,"precipProbability":0},{"time":1495200180,"precipIntensity":0,"precipProbability":0},{"time":1495200240,"precipIntensity":0,"precipProbability":0},{"time":1495200300,"precipIntensity":0,"precipProbability":0},{"time":1495200360,"precipIntensity":0,"precipProbability":0},{"time":1495200420,"precipIntensity":0,"precipProbability":0},{"time":1495200480,"precipIntensity":0,"precipProbability":0},{"time":1495200540,"precipIntensity":0,"precipProbability":0},{"time":1495200600,"precipIntensity":0,"precipProbability":0},{"time":1495200660,"precipIntensity":0,"precipProbability":0},{"time":1495200720,"precipIntensity":0,"precipProbability":0},{"time":1495200780,"precipIntensity":0,"precipProbability":0},{"time":1495200840,"precipIntensity":0,"precipProbability":0},{"time":1495200900,"precipIntensity":0,"precipProbability":0},{"time":1495200960,"precipIntensity":0,"precipProbability":0},{"time":1495201020,"precipIntensity":0,"precipProbability":0},{"time":1495201080,"precipIntensity":0,"precipProbability":0},{"time":1495201140,"precipIntensity":0,"precipProbability":0},{"time":1495201200,"precipIntensity":0,"precipProbability":0},{"time":1495201260,"precipIntensity":0,"precipProbability":0},{"time":1495201320,"precipIntensity":0,"precipProbability":0},{"time":1495201380,"precipIntensity":0,"precipProbability":0},{"time":1495201440,"precipIntensity":0,"precipProbability":0},{"time":1495201500,"precipIntensity":0,"precipProbability":0},{"time":1495201560,"precipIntensity":0,"precipProbability":0},{"time":1495201620,"precipIntensity":0,"precipProbability":0},{"time":1495201680,"precipIntensity":0,"precipProbability":0},{"time":1495201740,"precipIntensity":0,"precipProbability":0},{"time":1495201800,"precipIntensity":0,"precipProbability":0},{"time":1495201860,"precipIntensity":0,"precipProbability":0},{"time":1495201920,"precipIntensity":0,"precipProbability":0},{"time":1495201980,"precipIntensity":0,"precipProbability":0},{"time":1495202040,"precipIntensity":0,"precipProbability":0},{"time":1495202100,"precipIntensity":0,"precipProbability":0}]}
     * hourly : {"summary":"Partly cloudy starting tonight.","icon":"partly-cloudy-night","data":[{"time":1495195200,"summary":"Clear","icon":"clear-night","precipIntensity":0,"precipProbability":0,"temperature":54.73,"apparentTemperature":54.73,"dewPoint":47.98,"humidity":0.78,"windSpeed":3.85,"windBearing":274,"visibility":9.39,"cloudCover":0.06,"pressure":1015.5,"ozone":334.18},{"time":1495198800,"summary":"Clear","icon":"clear-night","precipIntensity":0,"precipProbability":0,"temperature":54.21,"apparentTemperature":54.21,"dewPoint":47.82,"humidity":0.79,"windSpeed":3.77,"windBearing":270,"visibility":9.46,"cloudCover":0.06,"pressure":1015.19,"ozone":334.12},{"time":1495202400,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":55.37,"apparentTemperature":55.37,"dewPoint":48.62,"humidity":0.78,"windSpeed":3.02,"windBearing":275,"visibility":9.61,"cloudCover":0.13,"pressure":1015.01,"ozone":334.13},{"time":1495206000,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":59.46,"apparentTemperature":59.46,"dewPoint":50.39,"humidity":0.72,"windSpeed":2.43,"windBearing":284,"visibility":9.86,"cloudCover":0.06,"pressure":1014.92,"ozone":334.08},{"time":1495209600,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":62.58,"apparentTemperature":62.58,"dewPoint":51.21,"humidity":0.66,"windSpeed":2.06,"windBearing":298,"visibility":9.93,"cloudCover":0.06,"pressure":1014.89,"ozone":333.91},{"time":1495213200,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":64.77,"apparentTemperature":64.77,"dewPoint":51.27,"humidity":0.62,"windSpeed":2.08,"windBearing":317,"visibility":9.97,"cloudCover":0.07,"pressure":1014.92,"ozone":333.68},{"time":1495216800,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":68.27,"apparentTemperature":68.27,"dewPoint":52.34,"humidity":0.57,"windSpeed":2.39,"windBearing":332,"visibility":10,"cloudCover":0.07,"pressure":1014.83,"ozone":333.47},{"time":1495220400,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":71.66,"apparentTemperature":71.66,"dewPoint":52.96,"humidity":0.52,"windSpeed":3.04,"windBearing":313,"visibility":10,"cloudCover":0.08,"pressure":1014.73,"ozone":333.32},{"time":1495224000,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":75.17,"apparentTemperature":75.17,"dewPoint":54.3,"humidity":0.48,"windSpeed":4.41,"windBearing":295,"visibility":10,"cloudCover":0.08,"pressure":1014.52,"ozone":333.19},{"time":1495227600,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":77.95,"apparentTemperature":77.95,"dewPoint":55.73,"humidity":0.46,"windSpeed":5.98,"windBearing":287,"visibility":10,"cloudCover":0.09,"pressure":1014.29,"ozone":333.01},{"time":1495231200,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":77.54,"apparentTemperature":77.54,"dewPoint":55.49,"humidity":0.47,"windSpeed":7.4,"windBearing":285,"visibility":10,"cloudCover":0.15,"pressure":1014,"ozone":332.76},{"time":1495234800,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":75.62,"apparentTemperature":75.62,"dewPoint":54.49,"humidity":0.48,"windSpeed":8.53,"windBearing":284,"visibility":10,"cloudCover":0.15,"pressure":1013.7,"ozone":332.46},{"time":1495238400,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":73.15,"apparentTemperature":73.15,"dewPoint":53.66,"humidity":0.51,"windSpeed":9,"windBearing":284,"visibility":10,"cloudCover":0.16,"pressure":1013.47,"ozone":332.17},{"time":1495242000,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":70.39,"apparentTemperature":70.39,"dewPoint":52.89,"humidity":0.54,"windSpeed":8.64,"windBearing":283,"visibility":9.98,"cloudCover":0.16,"pressure":1013.36,"ozone":331.89},{"time":1495245600,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":66.69,"apparentTemperature":66.69,"dewPoint":51.65,"humidity":0.58,"windSpeed":7.59,"windBearing":281,"visibility":9.96,"cloudCover":0.16,"pressure":1013.33,"ozone":331.61},{"time":1495249200,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":62.72,"apparentTemperature":62.72,"dewPoint":50.81,"humidity":0.65,"windSpeed":6.46,"windBearing":278,"visibility":9.94,"cloudCover":0.16,"pressure":1013.43,"ozone":331.38},{"time":1495252800,"summary":"Clear","icon":"clear-night","precipIntensity":0,"precipProbability":0,"temperature":60.5,"apparentTemperature":60.5,"dewPoint":50.87,"humidity":0.71,"windSpeed":5.51,"windBearing":273,"visibility":10,"cloudCover":0.17,"pressure":1013.75,"ozone":331.2},{"time":1495256400,"summary":"Clear","icon":"clear-night","precipIntensity":0,"precipProbability":0,"temperature":58.9,"apparentTemperature":58.9,"dewPoint":51.02,"humidity":0.75,"windSpeed":4.53,"windBearing":266,"visibility":10,"cloudCover":0.18,"pressure":1014.17,"ozone":331.07},{"time":1495260000,"summary":"Clear","icon":"clear-night","precipIntensity":0,"precipProbability":0,"temperature":58,"apparentTemperature":58,"dewPoint":51.29,"humidity":0.78,"windSpeed":3.88,"windBearing":256,"visibility":9.94,"cloudCover":0.19,"pressure":1014.44,"ozone":330.99},{"time":1495263600,"summary":"Clear","icon":"clear-night","precipIntensity":0,"precipProbability":0,"temperature":57.22,"apparentTemperature":57.22,"dewPoint":51.36,"humidity":0.81,"windSpeed":3.91,"windBearing":247,"visibility":9.03,"cloudCover":0.2,"pressure":1014.39,"ozone":330.89},{"time":1495267200,"summary":"Clear","icon":"clear-night","precipIntensity":0,"precipProbability":0,"temperature":56.64,"apparentTemperature":56.64,"dewPoint":51.33,"humidity":0.82,"windSpeed":4.24,"windBearing":243,"visibility":7.71,"cloudCover":0.2,"pressure":1014.17,"ozone":330.85},{"time":1495270800,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":55.81,"apparentTemperature":55.81,"dewPoint":51.31,"humidity":0.85,"windSpeed":4.31,"windBearing":241,"visibility":6.7,"cloudCover":0.29,"pressure":1013.99,"ozone":331.02},{"time":1495274400,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":54.75,"apparentTemperature":54.75,"dewPoint":50.68,"humidity":0.86,"windSpeed":4.18,"windBearing":237,"visibility":6.39,"cloudCover":0.32,"pressure":1013.87,"ozone":331.58},{"time":1495278000,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":54.12,"apparentTemperature":54.12,"dewPoint":50.3,"humidity":0.87,"windSpeed":3.76,"windBearing":241,"visibility":6.48,"cloudCover":0.51,"pressure":1013.79,"ozone":332.36},{"time":1495281600,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":52.26,"apparentTemperature":52.26,"dewPoint":48.52,"humidity":0.87,"windSpeed":3.35,"windBearing":245,"visibility":6.57,"cloudCover":0.59,"pressure":1013.8,"ozone":333.02},{"time":1495285200,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":53.25,"apparentTemperature":53.25,"dewPoint":49.59,"humidity":0.87,"windSpeed":2.98,"windBearing":238,"visibility":6.52,"cloudCover":0.56,"pressure":1013.98,"ozone":333.45},{"time":1495288800,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":54.89,"apparentTemperature":54.89,"dewPoint":50.83,"humidity":0.86,"windSpeed":2.66,"windBearing":226,"visibility":6.48,"cloudCover":0.53,"pressure":1014.27,"ozone":333.76},{"time":1495292400,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":57.6,"apparentTemperature":57.6,"dewPoint":52.57,"humidity":0.83,"windSpeed":2.45,"windBearing":220,"visibility":6.61,"cloudCover":0.48,"pressure":1014.53,"ozone":333.99},{"time":1495296000,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":61,"apparentTemperature":61,"dewPoint":54.26,"humidity":0.78,"windSpeed":2.38,"windBearing":228,"visibility":7.1,"cloudCover":0.43,"pressure":1014.7,"ozone":334.08},{"time":1495299600,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":64.01,"apparentTemperature":64.01,"dewPoint":54.82,"humidity":0.72,"windSpeed":2.56,"windBearing":242,"visibility":7.77,"cloudCover":0.34,"pressure":1014.81,"ozone":334.09},{"time":1495303200,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":66.44,"apparentTemperature":66.44,"dewPoint":55.11,"humidity":0.67,"windSpeed":3.06,"windBearing":253,"visibility":8.25,"cloudCover":0.3,"pressure":1014.82,"ozone":334.23},{"time":1495306800,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":68.46,"apparentTemperature":68.46,"dewPoint":55.46,"humidity":0.63,"windSpeed":3.89,"windBearing":256,"visibility":8.32,"cloudCover":0.28,"pressure":1014.71,"ozone":334.59},{"time":1495310400,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":70.31,"apparentTemperature":70.31,"dewPoint":55.94,"humidity":0.6,"windSpeed":4.93,"windBearing":258,"visibility":8.21,"cloudCover":0.29,"pressure":1014.48,"ozone":335.09},{"time":1495314000,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":71.62,"apparentTemperature":71.62,"dewPoint":56.42,"humidity":0.59,"windSpeed":5.96,"windBearing":260,"visibility":8.25,"cloudCover":0.29,"pressure":1014.16,"ozone":335.68},{"time":1495317600,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":72.06,"apparentTemperature":72.06,"dewPoint":56.67,"humidity":0.58,"windSpeed":6.93,"windBearing":265,"visibility":8.67,"cloudCover":0.3,"pressure":1013.66,"ozone":336.31},{"time":1495321200,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":71.23,"apparentTemperature":71.23,"dewPoint":56.3,"humidity":0.59,"windSpeed":7.82,"windBearing":269,"visibility":9.25,"cloudCover":0.31,"pressure":1013.08,"ozone":337.03},{"time":1495324800,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":69.71,"apparentTemperature":69.71,"dewPoint":55.87,"humidity":0.61,"windSpeed":8.24,"windBearing":272,"visibility":9.67,"cloudCover":0.32,"pressure":1012.64,"ozone":337.91},{"time":1495328400,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":67.27,"apparentTemperature":67.27,"dewPoint":55.34,"humidity":0.66,"windSpeed":7.88,"windBearing":271,"visibility":9.88,"cloudCover":0.3,"pressure":1012.43,"ozone":339},{"time":1495332000,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":64.22,"apparentTemperature":64.22,"dewPoint":54.62,"humidity":0.71,"windSpeed":6.93,"windBearing":268,"visibility":9.94,"cloudCover":0.28,"pressure":1012.35,"ozone":340.27},{"time":1495335600,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":61.1,"apparentTemperature":61.1,"dewPoint":53.55,"humidity":0.76,"windSpeed":6.16,"windBearing":264,"visibility":9.67,"cloudCover":0.27,"pressure":1012.39,"ozone":341.68},{"time":1495339200,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":58.65,"apparentTemperature":58.65,"dewPoint":52.7,"humidity":0.81,"windSpeed":5.7,"windBearing":260,"visibility":8.88,"cloudCover":0.28,"pressure":1012.65,"ozone":343.42},{"time":1495342800,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":57,"apparentTemperature":57,"dewPoint":52.39,"humidity":0.85,"windSpeed":5.29,"windBearing":254,"visibility":7.75,"cloudCover":0.31,"pressure":1013,"ozone":345.32},{"time":1495346400,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":55.82,"apparentTemperature":55.82,"dewPoint":52.21,"humidity":0.88,"windSpeed":5,"windBearing":248,"visibility":6.67,"cloudCover":0.36,"pressure":1013.22,"ozone":346.82},{"time":1495350000,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":55.07,"apparentTemperature":55.07,"dewPoint":52.06,"humidity":0.9,"windSpeed":4.98,"windBearing":245,"visibility":5.72,"cloudCover":0.45,"pressure":1013.18,"ozone":347.67},{"time":1495353600,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":54.67,"apparentTemperature":54.67,"dewPoint":51.99,"humidity":0.91,"windSpeed":5.09,"windBearing":243,"visibility":4.81,"cloudCover":0.56,"pressure":1013.02,"ozone":348.13},{"time":1495357200,"summary":"Mostly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":54.26,"apparentTemperature":54.26,"dewPoint":51.87,"humidity":0.92,"windSpeed":5.12,"windBearing":242,"visibility":4.04,"cloudCover":0.65,"pressure":1012.87,"ozone":348.44},{"time":1495360800,"summary":"Mostly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":53.68,"apparentTemperature":53.68,"dewPoint":51.64,"humidity":0.93,"windSpeed":4.93,"windBearing":242,"visibility":3.3,"cloudCover":0.69,"pressure":1012.74,"ozone":348.67},{"time":1495364400,"summary":"Mostly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":53.14,"apparentTemperature":53.14,"dewPoint":51.37,"humidity":0.94,"windSpeed":4.53,"windBearing":241,"visibility":2.7,"cloudCover":0.71,"pressure":1012.64,"ozone":348.76},{"time":1495368000,"summary":"Mostly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":52.91,"apparentTemperature":52.91,"dewPoint":51.19,"humidity":0.94,"windSpeed":4.01,"windBearing":240,"visibility":2.58,"cloudCover":0.73,"pressure":1012.62,"ozone":348.74}]}
     * daily : {"summary":"No precipitation throughout the week, with temperatures falling to 65°F on Friday.","icon":"clear-day","data":[{"time":1495177200,"summary":"Partly cloudy overnight.","icon":"partly-cloudy-night","sunriseTime":1495198663,"sunsetTime":1495250251,"moonPhase":0.78,"precipIntensity":0,"precipIntensityMax":0,"precipProbability":0,"temperatureMin":54.21,"temperatureMinTime":1495198800,"temperatureMax":77.95,"temperatureMaxTime":1495227600,"apparentTemperatureMin":54.21,"apparentTemperatureMinTime":1495198800,"apparentTemperatureMax":77.95,"apparentTemperatureMaxTime":1495227600,"dewPoint":50.92,"humidity":0.65,"windSpeed":4.53,"windBearing":282,"visibility":9.84,"cloudCover":0.09,"pressure":1014.49,"ozone":333.44},{"time":1495263600,"summary":"Partly cloudy throughout the day.","icon":"partly-cloudy-day","sunriseTime":1495285020,"sunsetTime":1495336702,"moonPhase":0.81,"precipIntensity":0,"precipIntensityMax":0,"precipProbability":0,"temperatureMin":52.26,"temperatureMinTime":1495281600,"temperatureMax":72.06,"temperatureMaxTime":1495317600,"apparentTemperatureMin":52.26,"apparentTemperatureMinTime":1495281600,"apparentTemperatureMax":72.06,"apparentTemperatureMaxTime":1495317600,"dewPoint":53.26,"humidity":0.75,"windSpeed":4.64,"windBearing":255,"visibility":7.95,"cloudCover":0.35,"pressure":1013.75,"ozone":336.1},{"time":1495350000,"summary":"Mostly cloudy until afternoon.","icon":"partly-cloudy-day","sunriseTime":1495371379,"sunsetTime":1495423151,"moonPhase":0.85,"precipIntensity":0,"precipIntensityMax":0,"precipProbability":0,"temperatureMin":52.91,"temperatureMinTime":1495368000,"temperatureMax":75.48,"temperatureMaxTime":1495407600,"apparentTemperatureMin":52.91,"apparentTemperatureMinTime":1495368000,"apparentTemperatureMax":75.48,"apparentTemperatureMaxTime":1495407600,"dewPoint":54.47,"humidity":0.78,"windSpeed":4.44,"windBearing":250,"visibility":7.21,"cloudCover":0.46,"pressure":1012.75,"ozone":351.26},{"time":1495436400,"summary":"Partly cloudy until afternoon.","icon":"partly-cloudy-day","sunriseTime":1495457740,"sunsetTime":1495509601,"moonPhase":0.89,"precipIntensity":0,"precipIntensityMax":0,"precipProbability":0,"temperatureMin":51.99,"temperatureMinTime":1495454400,"temperatureMax":77.81,"temperatureMaxTime":1495483200,"apparentTemperatureMin":51.99,"apparentTemperatureMinTime":1495454400,"apparentTemperatureMax":77.81,"apparentTemperatureMaxTime":1495483200,"dewPoint":51.18,"humidity":0.67,"windSpeed":5.23,"windBearing":240,"visibility":3.57,"cloudCover":0.27,"pressure":1013.35,"ozone":330.75},{"time":1495522800,"summary":"Mostly cloudy throughout the day.","icon":"partly-cloudy-day","sunriseTime":1495544102,"sunsetTime":1495596049,"moonPhase":0.92,"precipIntensity":0,"precipIntensityMax":0,"precipProbability":0,"temperatureMin":57.21,"temperatureMinTime":1495540800,"temperatureMax":72.09,"temperatureMaxTime":1495576800,"apparentTemperatureMin":57.21,"apparentTemperatureMinTime":1495540800,"apparentTemperatureMax":72.09,"apparentTemperatureMaxTime":1495576800,"dewPoint":50.42,"humidity":0.65,"windSpeed":5.82,"windBearing":238,"cloudCover":0.61,"pressure":1012.81,"ozone":325.42},{"time":1495609200,"summary":"Clear throughout the day.","icon":"clear-day","sunriseTime":1495630466,"sunsetTime":1495682497,"moonPhase":0.96,"precipIntensity":0,"precipIntensityMax":0,"precipProbability":0,"temperatureMin":55.58,"temperatureMinTime":1495692000,"temperatureMax":68.82,"temperatureMaxTime":1495666800,"apparentTemperatureMin":55.58,"apparentTemperatureMinTime":1495692000,"apparentTemperatureMax":68.82,"apparentTemperatureMaxTime":1495666800,"dewPoint":51.66,"humidity":0.73,"windSpeed":6.6,"windBearing":240,"cloudCover":0.1,"pressure":1012.35,"ozone":334.87},{"time":1495695600,"summary":"Partly cloudy until afternoon.","icon":"partly-cloudy-day","sunriseTime":1495716832,"sunsetTime":1495768944,"moonPhase":0.01,"precipIntensity":0,"precipIntensityMax":0,"precipProbability":0,"temperatureMin":54.33,"temperatureMinTime":1495713600,"temperatureMax":65.05,"temperatureMaxTime":1495753200,"apparentTemperatureMin":54.33,"apparentTemperatureMinTime":1495713600,"apparentTemperatureMax":65.05,"apparentTemperatureMaxTime":1495753200,"dewPoint":50.45,"humidity":0.76,"windSpeed":7.35,"windBearing":243,"cloudCover":0.15,"pressure":1012.36,"ozone":324.03},{"time":1495782000,"summary":"Mostly cloudy until afternoon.","icon":"partly-cloudy-day","sunriseTime":1495803199,"sunsetTime":1495855390,"moonPhase":0.04,"precipIntensity":0,"precipIntensityMax":0,"precipProbability":0,"temperatureMin":54.19,"temperatureMinTime":1495864800,"temperatureMax":64.58,"temperatureMaxTime":1495836000,"apparentTemperatureMin":54.19,"apparentTemperatureMinTime":1495864800,"apparentTemperatureMax":64.58,"apparentTemperatureMaxTime":1495836000,"dewPoint":49.47,"humidity":0.74,"windSpeed":7.9,"windBearing":253,"cloudCover":0.29,"pressure":1014.15,"ozone":326.15}]}
     * flags : {"sources":["lamp","gfs","cmc","nam","rap","rtma","sref","fnmoc","isd","madis","nearest-precip","nwspa","darksky"],"lamp-stations":["KAPC","KCCR","KHWD","KLVK","KNUQ","KOAK","KPAO","KSFO","KSQL"],"isd-stations":["724943-99999","745039-99999","745045-99999","745060-23239","745065-99999","994016-99999","994033-99999","994036-99999","997734-99999","998163-99999","998197-99999","998476-99999","998477-99999","998479-99999","999999-23239","999999-23272"],"madis-stations":["AU915","C5988","C8158","CQ147","CQ188","GGBC1","OKXC1","OMHC1","PPXC1","PXOC1","SFOC1","TIBC1","WTEG"],"units":"us"}
     */

    private double latitude;
    private double longitude;
    private String timezone;
    private int offset;
    private CurrentlyBean currently;
    private MinutelyBean minutely;
    private HourlyBean hourly;
    private DailyBean daily;
    private FlagsBean flags;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public CurrentlyBean getCurrently() {
        return currently;
    }

    public void setCurrently(CurrentlyBean currently) {
        this.currently = currently;
    }

    public MinutelyBean getMinutely() {
        return minutely;
    }

    public void setMinutely(MinutelyBean minutely) {
        this.minutely = minutely;
    }

    public HourlyBean getHourly() {
        return hourly;
    }

    public void setHourly(HourlyBean hourly) {
        this.hourly = hourly;
    }

    public DailyBean getDaily() {
        return daily;
    }

    public void setDaily(DailyBean daily) {
        this.daily = daily;
    }

    public FlagsBean getFlags() {
        return flags;
    }

    public void setFlags(FlagsBean flags) {
        this.flags = flags;
    }

    public static class CurrentlyBean {
        /**
         * time : 1495198553
         * summary : Clear
         * icon : clear-night
         * nearestStormDistance : 150
         * nearestStormBearing : 349
         * precipIntensity : 0
         * precipProbability : 0
         * temperature : 54.21
         * apparentTemperature : 54.21
         * dewPoint : 47.8
         * humidity : 0.79
         * windSpeed : 3.77
         * windBearing : 270
         * visibility : 9.46
         * cloudCover : 0.06
         * pressure : 1015.21
         * ozone : 334.12
         */

        private int time;
        private String summary;
        private String icon;
        private int nearestStormDistance;
        private int nearestStormBearing;
        private int precipIntensity;
        private int precipProbability;
        private double temperature;
        private double apparentTemperature;
        private double dewPoint;
        private double humidity;
        private double windSpeed;
        private int windBearing;
        private double visibility;
        private double cloudCover;
        private double pressure;
        private double ozone;

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getNearestStormDistance() {
            return nearestStormDistance;
        }

        public void setNearestStormDistance(int nearestStormDistance) {
            this.nearestStormDistance = nearestStormDistance;
        }

        public int getNearestStormBearing() {
            return nearestStormBearing;
        }

        public void setNearestStormBearing(int nearestStormBearing) {
            this.nearestStormBearing = nearestStormBearing;
        }

        public int getPrecipIntensity() {
            return precipIntensity;
        }

        public void setPrecipIntensity(int precipIntensity) {
            this.precipIntensity = precipIntensity;
        }

        public int getPrecipProbability() {
            return precipProbability;
        }

        public void setPrecipProbability(int precipProbability) {
            this.precipProbability = precipProbability;
        }

        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }

        public double getApparentTemperature() {
            return apparentTemperature;
        }

        public void setApparentTemperature(double apparentTemperature) {
            this.apparentTemperature = apparentTemperature;
        }

        public double getDewPoint() {
            return dewPoint;
        }

        public void setDewPoint(double dewPoint) {
            this.dewPoint = dewPoint;
        }

        public double getHumidity() {
            return humidity;
        }

        public void setHumidity(double humidity) {
            this.humidity = humidity;
        }

        public double getWindSpeed() {
            return windSpeed;
        }

        public void setWindSpeed(double windSpeed) {
            this.windSpeed = windSpeed;
        }

        public int getWindBearing() {
            return windBearing;
        }

        public void setWindBearing(int windBearing) {
            this.windBearing = windBearing;
        }

        public double getVisibility() {
            return visibility;
        }

        public void setVisibility(double visibility) {
            this.visibility = visibility;
        }

        public double getCloudCover() {
            return cloudCover;
        }

        public void setCloudCover(double cloudCover) {
            this.cloudCover = cloudCover;
        }

        public double getPressure() {
            return pressure;
        }

        public void setPressure(double pressure) {
            this.pressure = pressure;
        }

        public double getOzone() {
            return ozone;
        }

        public void setOzone(double ozone) {
            this.ozone = ozone;
        }
    }

    public static class MinutelyBean {
        /**
         * summary : Clear for the hour.
         * icon : clear-night
         * data : [{"time":1495198500,"precipIntensity":0,"precipProbability":0},{"time":1495198560,"precipIntensity":0,"precipProbability":0},{"time":1495198620,"precipIntensity":0,"precipProbability":0},{"time":1495198680,"precipIntensity":0,"precipProbability":0},{"time":1495198740,"precipIntensity":0,"precipProbability":0},{"time":1495198800,"precipIntensity":0,"precipProbability":0},{"time":1495198860,"precipIntensity":0,"precipProbability":0},{"time":1495198920,"precipIntensity":0,"precipProbability":0},{"time":1495198980,"precipIntensity":0,"precipProbability":0},{"time":1495199040,"precipIntensity":0,"precipProbability":0},{"time":1495199100,"precipIntensity":0,"precipProbability":0},{"time":1495199160,"precipIntensity":0,"precipProbability":0},{"time":1495199220,"precipIntensity":0,"precipProbability":0},{"time":1495199280,"precipIntensity":0,"precipProbability":0},{"time":1495199340,"precipIntensity":0,"precipProbability":0},{"time":1495199400,"precipIntensity":0,"precipProbability":0},{"time":1495199460,"precipIntensity":0,"precipProbability":0},{"time":1495199520,"precipIntensity":0,"precipProbability":0},{"time":1495199580,"precipIntensity":0,"precipProbability":0},{"time":1495199640,"precipIntensity":0,"precipProbability":0},{"time":1495199700,"precipIntensity":0,"precipProbability":0},{"time":1495199760,"precipIntensity":0,"precipProbability":0},{"time":1495199820,"precipIntensity":0,"precipProbability":0},{"time":1495199880,"precipIntensity":0,"precipProbability":0},{"time":1495199940,"precipIntensity":0,"precipProbability":0},{"time":1495200000,"precipIntensity":0,"precipProbability":0},{"time":1495200060,"precipIntensity":0,"precipProbability":0},{"time":1495200120,"precipIntensity":0,"precipProbability":0},{"time":1495200180,"precipIntensity":0,"precipProbability":0},{"time":1495200240,"precipIntensity":0,"precipProbability":0},{"time":1495200300,"precipIntensity":0,"precipProbability":0},{"time":1495200360,"precipIntensity":0,"precipProbability":0},{"time":1495200420,"precipIntensity":0,"precipProbability":0},{"time":1495200480,"precipIntensity":0,"precipProbability":0},{"time":1495200540,"precipIntensity":0,"precipProbability":0},{"time":1495200600,"precipIntensity":0,"precipProbability":0},{"time":1495200660,"precipIntensity":0,"precipProbability":0},{"time":1495200720,"precipIntensity":0,"precipProbability":0},{"time":1495200780,"precipIntensity":0,"precipProbability":0},{"time":1495200840,"precipIntensity":0,"precipProbability":0},{"time":1495200900,"precipIntensity":0,"precipProbability":0},{"time":1495200960,"precipIntensity":0,"precipProbability":0},{"time":1495201020,"precipIntensity":0,"precipProbability":0},{"time":1495201080,"precipIntensity":0,"precipProbability":0},{"time":1495201140,"precipIntensity":0,"precipProbability":0},{"time":1495201200,"precipIntensity":0,"precipProbability":0},{"time":1495201260,"precipIntensity":0,"precipProbability":0},{"time":1495201320,"precipIntensity":0,"precipProbability":0},{"time":1495201380,"precipIntensity":0,"precipProbability":0},{"time":1495201440,"precipIntensity":0,"precipProbability":0},{"time":1495201500,"precipIntensity":0,"precipProbability":0},{"time":1495201560,"precipIntensity":0,"precipProbability":0},{"time":1495201620,"precipIntensity":0,"precipProbability":0},{"time":1495201680,"precipIntensity":0,"precipProbability":0},{"time":1495201740,"precipIntensity":0,"precipProbability":0},{"time":1495201800,"precipIntensity":0,"precipProbability":0},{"time":1495201860,"precipIntensity":0,"precipProbability":0},{"time":1495201920,"precipIntensity":0,"precipProbability":0},{"time":1495201980,"precipIntensity":0,"precipProbability":0},{"time":1495202040,"precipIntensity":0,"precipProbability":0},{"time":1495202100,"precipIntensity":0,"precipProbability":0}]
         */

        private String summary;
        private String icon;
        private List<DataBean> data;

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * time : 1495198500
             * precipIntensity : 0
             * precipProbability : 0
             */

            private int time;
            private int precipIntensity;
            private int precipProbability;

            public int getTime() {
                return time;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public int getPrecipIntensity() {
                return precipIntensity;
            }

            public void setPrecipIntensity(int precipIntensity) {
                this.precipIntensity = precipIntensity;
            }

            public int getPrecipProbability() {
                return precipProbability;
            }

            public void setPrecipProbability(int precipProbability) {
                this.precipProbability = precipProbability;
            }
        }
    }

    public static class HourlyBean {
        /**
         * summary : Partly cloudy starting tonight.
         * icon : partly-cloudy-night
         * data : [{"time":1495195200,"summary":"Clear","icon":"clear-night","precipIntensity":0,"precipProbability":0,"temperature":54.73,"apparentTemperature":54.73,"dewPoint":47.98,"humidity":0.78,"windSpeed":3.85,"windBearing":274,"visibility":9.39,"cloudCover":0.06,"pressure":1015.5,"ozone":334.18},{"time":1495198800,"summary":"Clear","icon":"clear-night","precipIntensity":0,"precipProbability":0,"temperature":54.21,"apparentTemperature":54.21,"dewPoint":47.82,"humidity":0.79,"windSpeed":3.77,"windBearing":270,"visibility":9.46,"cloudCover":0.06,"pressure":1015.19,"ozone":334.12},{"time":1495202400,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":55.37,"apparentTemperature":55.37,"dewPoint":48.62,"humidity":0.78,"windSpeed":3.02,"windBearing":275,"visibility":9.61,"cloudCover":0.13,"pressure":1015.01,"ozone":334.13},{"time":1495206000,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":59.46,"apparentTemperature":59.46,"dewPoint":50.39,"humidity":0.72,"windSpeed":2.43,"windBearing":284,"visibility":9.86,"cloudCover":0.06,"pressure":1014.92,"ozone":334.08},{"time":1495209600,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":62.58,"apparentTemperature":62.58,"dewPoint":51.21,"humidity":0.66,"windSpeed":2.06,"windBearing":298,"visibility":9.93,"cloudCover":0.06,"pressure":1014.89,"ozone":333.91},{"time":1495213200,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":64.77,"apparentTemperature":64.77,"dewPoint":51.27,"humidity":0.62,"windSpeed":2.08,"windBearing":317,"visibility":9.97,"cloudCover":0.07,"pressure":1014.92,"ozone":333.68},{"time":1495216800,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":68.27,"apparentTemperature":68.27,"dewPoint":52.34,"humidity":0.57,"windSpeed":2.39,"windBearing":332,"visibility":10,"cloudCover":0.07,"pressure":1014.83,"ozone":333.47},{"time":1495220400,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":71.66,"apparentTemperature":71.66,"dewPoint":52.96,"humidity":0.52,"windSpeed":3.04,"windBearing":313,"visibility":10,"cloudCover":0.08,"pressure":1014.73,"ozone":333.32},{"time":1495224000,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":75.17,"apparentTemperature":75.17,"dewPoint":54.3,"humidity":0.48,"windSpeed":4.41,"windBearing":295,"visibility":10,"cloudCover":0.08,"pressure":1014.52,"ozone":333.19},{"time":1495227600,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":77.95,"apparentTemperature":77.95,"dewPoint":55.73,"humidity":0.46,"windSpeed":5.98,"windBearing":287,"visibility":10,"cloudCover":0.09,"pressure":1014.29,"ozone":333.01},{"time":1495231200,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":77.54,"apparentTemperature":77.54,"dewPoint":55.49,"humidity":0.47,"windSpeed":7.4,"windBearing":285,"visibility":10,"cloudCover":0.15,"pressure":1014,"ozone":332.76},{"time":1495234800,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":75.62,"apparentTemperature":75.62,"dewPoint":54.49,"humidity":0.48,"windSpeed":8.53,"windBearing":284,"visibility":10,"cloudCover":0.15,"pressure":1013.7,"ozone":332.46},{"time":1495238400,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":73.15,"apparentTemperature":73.15,"dewPoint":53.66,"humidity":0.51,"windSpeed":9,"windBearing":284,"visibility":10,"cloudCover":0.16,"pressure":1013.47,"ozone":332.17},{"time":1495242000,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":70.39,"apparentTemperature":70.39,"dewPoint":52.89,"humidity":0.54,"windSpeed":8.64,"windBearing":283,"visibility":9.98,"cloudCover":0.16,"pressure":1013.36,"ozone":331.89},{"time":1495245600,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":66.69,"apparentTemperature":66.69,"dewPoint":51.65,"humidity":0.58,"windSpeed":7.59,"windBearing":281,"visibility":9.96,"cloudCover":0.16,"pressure":1013.33,"ozone":331.61},{"time":1495249200,"summary":"Clear","icon":"clear-day","precipIntensity":0,"precipProbability":0,"temperature":62.72,"apparentTemperature":62.72,"dewPoint":50.81,"humidity":0.65,"windSpeed":6.46,"windBearing":278,"visibility":9.94,"cloudCover":0.16,"pressure":1013.43,"ozone":331.38},{"time":1495252800,"summary":"Clear","icon":"clear-night","precipIntensity":0,"precipProbability":0,"temperature":60.5,"apparentTemperature":60.5,"dewPoint":50.87,"humidity":0.71,"windSpeed":5.51,"windBearing":273,"visibility":10,"cloudCover":0.17,"pressure":1013.75,"ozone":331.2},{"time":1495256400,"summary":"Clear","icon":"clear-night","precipIntensity":0,"precipProbability":0,"temperature":58.9,"apparentTemperature":58.9,"dewPoint":51.02,"humidity":0.75,"windSpeed":4.53,"windBearing":266,"visibility":10,"cloudCover":0.18,"pressure":1014.17,"ozone":331.07},{"time":1495260000,"summary":"Clear","icon":"clear-night","precipIntensity":0,"precipProbability":0,"temperature":58,"apparentTemperature":58,"dewPoint":51.29,"humidity":0.78,"windSpeed":3.88,"windBearing":256,"visibility":9.94,"cloudCover":0.19,"pressure":1014.44,"ozone":330.99},{"time":1495263600,"summary":"Clear","icon":"clear-night","precipIntensity":0,"precipProbability":0,"temperature":57.22,"apparentTemperature":57.22,"dewPoint":51.36,"humidity":0.81,"windSpeed":3.91,"windBearing":247,"visibility":9.03,"cloudCover":0.2,"pressure":1014.39,"ozone":330.89},{"time":1495267200,"summary":"Clear","icon":"clear-night","precipIntensity":0,"precipProbability":0,"temperature":56.64,"apparentTemperature":56.64,"dewPoint":51.33,"humidity":0.82,"windSpeed":4.24,"windBearing":243,"visibility":7.71,"cloudCover":0.2,"pressure":1014.17,"ozone":330.85},{"time":1495270800,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":55.81,"apparentTemperature":55.81,"dewPoint":51.31,"humidity":0.85,"windSpeed":4.31,"windBearing":241,"visibility":6.7,"cloudCover":0.29,"pressure":1013.99,"ozone":331.02},{"time":1495274400,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":54.75,"apparentTemperature":54.75,"dewPoint":50.68,"humidity":0.86,"windSpeed":4.18,"windBearing":237,"visibility":6.39,"cloudCover":0.32,"pressure":1013.87,"ozone":331.58},{"time":1495278000,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":54.12,"apparentTemperature":54.12,"dewPoint":50.3,"humidity":0.87,"windSpeed":3.76,"windBearing":241,"visibility":6.48,"cloudCover":0.51,"pressure":1013.79,"ozone":332.36},{"time":1495281600,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":52.26,"apparentTemperature":52.26,"dewPoint":48.52,"humidity":0.87,"windSpeed":3.35,"windBearing":245,"visibility":6.57,"cloudCover":0.59,"pressure":1013.8,"ozone":333.02},{"time":1495285200,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":53.25,"apparentTemperature":53.25,"dewPoint":49.59,"humidity":0.87,"windSpeed":2.98,"windBearing":238,"visibility":6.52,"cloudCover":0.56,"pressure":1013.98,"ozone":333.45},{"time":1495288800,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":54.89,"apparentTemperature":54.89,"dewPoint":50.83,"humidity":0.86,"windSpeed":2.66,"windBearing":226,"visibility":6.48,"cloudCover":0.53,"pressure":1014.27,"ozone":333.76},{"time":1495292400,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":57.6,"apparentTemperature":57.6,"dewPoint":52.57,"humidity":0.83,"windSpeed":2.45,"windBearing":220,"visibility":6.61,"cloudCover":0.48,"pressure":1014.53,"ozone":333.99},{"time":1495296000,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":61,"apparentTemperature":61,"dewPoint":54.26,"humidity":0.78,"windSpeed":2.38,"windBearing":228,"visibility":7.1,"cloudCover":0.43,"pressure":1014.7,"ozone":334.08},{"time":1495299600,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":64.01,"apparentTemperature":64.01,"dewPoint":54.82,"humidity":0.72,"windSpeed":2.56,"windBearing":242,"visibility":7.77,"cloudCover":0.34,"pressure":1014.81,"ozone":334.09},{"time":1495303200,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":66.44,"apparentTemperature":66.44,"dewPoint":55.11,"humidity":0.67,"windSpeed":3.06,"windBearing":253,"visibility":8.25,"cloudCover":0.3,"pressure":1014.82,"ozone":334.23},{"time":1495306800,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":68.46,"apparentTemperature":68.46,"dewPoint":55.46,"humidity":0.63,"windSpeed":3.89,"windBearing":256,"visibility":8.32,"cloudCover":0.28,"pressure":1014.71,"ozone":334.59},{"time":1495310400,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":70.31,"apparentTemperature":70.31,"dewPoint":55.94,"humidity":0.6,"windSpeed":4.93,"windBearing":258,"visibility":8.21,"cloudCover":0.29,"pressure":1014.48,"ozone":335.09},{"time":1495314000,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":71.62,"apparentTemperature":71.62,"dewPoint":56.42,"humidity":0.59,"windSpeed":5.96,"windBearing":260,"visibility":8.25,"cloudCover":0.29,"pressure":1014.16,"ozone":335.68},{"time":1495317600,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":72.06,"apparentTemperature":72.06,"dewPoint":56.67,"humidity":0.58,"windSpeed":6.93,"windBearing":265,"visibility":8.67,"cloudCover":0.3,"pressure":1013.66,"ozone":336.31},{"time":1495321200,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":71.23,"apparentTemperature":71.23,"dewPoint":56.3,"humidity":0.59,"windSpeed":7.82,"windBearing":269,"visibility":9.25,"cloudCover":0.31,"pressure":1013.08,"ozone":337.03},{"time":1495324800,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":69.71,"apparentTemperature":69.71,"dewPoint":55.87,"humidity":0.61,"windSpeed":8.24,"windBearing":272,"visibility":9.67,"cloudCover":0.32,"pressure":1012.64,"ozone":337.91},{"time":1495328400,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":67.27,"apparentTemperature":67.27,"dewPoint":55.34,"humidity":0.66,"windSpeed":7.88,"windBearing":271,"visibility":9.88,"cloudCover":0.3,"pressure":1012.43,"ozone":339},{"time":1495332000,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":64.22,"apparentTemperature":64.22,"dewPoint":54.62,"humidity":0.71,"windSpeed":6.93,"windBearing":268,"visibility":9.94,"cloudCover":0.28,"pressure":1012.35,"ozone":340.27},{"time":1495335600,"summary":"Partly Cloudy","icon":"partly-cloudy-day","precipIntensity":0,"precipProbability":0,"temperature":61.1,"apparentTemperature":61.1,"dewPoint":53.55,"humidity":0.76,"windSpeed":6.16,"windBearing":264,"visibility":9.67,"cloudCover":0.27,"pressure":1012.39,"ozone":341.68},{"time":1495339200,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":58.65,"apparentTemperature":58.65,"dewPoint":52.7,"humidity":0.81,"windSpeed":5.7,"windBearing":260,"visibility":8.88,"cloudCover":0.28,"pressure":1012.65,"ozone":343.42},{"time":1495342800,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":57,"apparentTemperature":57,"dewPoint":52.39,"humidity":0.85,"windSpeed":5.29,"windBearing":254,"visibility":7.75,"cloudCover":0.31,"pressure":1013,"ozone":345.32},{"time":1495346400,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":55.82,"apparentTemperature":55.82,"dewPoint":52.21,"humidity":0.88,"windSpeed":5,"windBearing":248,"visibility":6.67,"cloudCover":0.36,"pressure":1013.22,"ozone":346.82},{"time":1495350000,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":55.07,"apparentTemperature":55.07,"dewPoint":52.06,"humidity":0.9,"windSpeed":4.98,"windBearing":245,"visibility":5.72,"cloudCover":0.45,"pressure":1013.18,"ozone":347.67},{"time":1495353600,"summary":"Partly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":54.67,"apparentTemperature":54.67,"dewPoint":51.99,"humidity":0.91,"windSpeed":5.09,"windBearing":243,"visibility":4.81,"cloudCover":0.56,"pressure":1013.02,"ozone":348.13},{"time":1495357200,"summary":"Mostly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":54.26,"apparentTemperature":54.26,"dewPoint":51.87,"humidity":0.92,"windSpeed":5.12,"windBearing":242,"visibility":4.04,"cloudCover":0.65,"pressure":1012.87,"ozone":348.44},{"time":1495360800,"summary":"Mostly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":53.68,"apparentTemperature":53.68,"dewPoint":51.64,"humidity":0.93,"windSpeed":4.93,"windBearing":242,"visibility":3.3,"cloudCover":0.69,"pressure":1012.74,"ozone":348.67},{"time":1495364400,"summary":"Mostly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":53.14,"apparentTemperature":53.14,"dewPoint":51.37,"humidity":0.94,"windSpeed":4.53,"windBearing":241,"visibility":2.7,"cloudCover":0.71,"pressure":1012.64,"ozone":348.76},{"time":1495368000,"summary":"Mostly Cloudy","icon":"partly-cloudy-night","precipIntensity":0,"precipProbability":0,"temperature":52.91,"apparentTemperature":52.91,"dewPoint":51.19,"humidity":0.94,"windSpeed":4.01,"windBearing":240,"visibility":2.58,"cloudCover":0.73,"pressure":1012.62,"ozone":348.74}]
         */

        private String summary;
        private String icon;
        private List<DataBeanX> data;

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public List<DataBeanX> getData() {
            return data;
        }

        public void setData(List<DataBeanX> data) {
            this.data = data;
        }

        public static class DataBeanX {
            /**
             * time : 1495195200
             * summary : Clear
             * icon : clear-night
             * precipIntensity : 0
             * precipProbability : 0
             * temperature : 54.73
             * apparentTemperature : 54.73
             * dewPoint : 47.98
             * humidity : 0.78
             * windSpeed : 3.85
             * windBearing : 274
             * visibility : 9.39
             * cloudCover : 0.06
             * pressure : 1015.5
             * ozone : 334.18
             */

            private int time;
            private String summary;
            private String icon;
            private int precipIntensity;
            private int precipProbability;
            private double temperature;
            private double apparentTemperature;
            private double dewPoint;
            private double humidity;
            private double windSpeed;
            private int windBearing;
            private double visibility;
            private double cloudCover;
            private double pressure;
            private double ozone;

            public int getTime() {
                return time;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public int getPrecipIntensity() {
                return precipIntensity;
            }

            public void setPrecipIntensity(int precipIntensity) {
                this.precipIntensity = precipIntensity;
            }

            public int getPrecipProbability() {
                return precipProbability;
            }

            public void setPrecipProbability(int precipProbability) {
                this.precipProbability = precipProbability;
            }

            public double getTemperature() {
                return temperature;
            }

            public void setTemperature(double temperature) {
                this.temperature = temperature;
            }

            public double getApparentTemperature() {
                return apparentTemperature;
            }

            public void setApparentTemperature(double apparentTemperature) {
                this.apparentTemperature = apparentTemperature;
            }

            public double getDewPoint() {
                return dewPoint;
            }

            public void setDewPoint(double dewPoint) {
                this.dewPoint = dewPoint;
            }

            public double getHumidity() {
                return humidity;
            }

            public void setHumidity(double humidity) {
                this.humidity = humidity;
            }

            public double getWindSpeed() {
                return windSpeed;
            }

            public void setWindSpeed(double windSpeed) {
                this.windSpeed = windSpeed;
            }

            public int getWindBearing() {
                return windBearing;
            }

            public void setWindBearing(int windBearing) {
                this.windBearing = windBearing;
            }

            public double getVisibility() {
                return visibility;
            }

            public void setVisibility(double visibility) {
                this.visibility = visibility;
            }

            public double getCloudCover() {
                return cloudCover;
            }

            public void setCloudCover(double cloudCover) {
                this.cloudCover = cloudCover;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getOzone() {
                return ozone;
            }

            public void setOzone(double ozone) {
                this.ozone = ozone;
            }
        }
    }

    public static class DailyBean {
        /**
         * summary : No precipitation throughout the week, with temperatures falling to 65°F on Friday.
         * icon : clear-day
         * data : [{"time":1495177200,"summary":"Partly cloudy overnight.","icon":"partly-cloudy-night","sunriseTime":1495198663,"sunsetTime":1495250251,"moonPhase":0.78,"precipIntensity":0,"precipIntensityMax":0,"precipProbability":0,"temperatureMin":54.21,"temperatureMinTime":1495198800,"temperatureMax":77.95,"temperatureMaxTime":1495227600,"apparentTemperatureMin":54.21,"apparentTemperatureMinTime":1495198800,"apparentTemperatureMax":77.95,"apparentTemperatureMaxTime":1495227600,"dewPoint":50.92,"humidity":0.65,"windSpeed":4.53,"windBearing":282,"visibility":9.84,"cloudCover":0.09,"pressure":1014.49,"ozone":333.44},{"time":1495263600,"summary":"Partly cloudy throughout the day.","icon":"partly-cloudy-day","sunriseTime":1495285020,"sunsetTime":1495336702,"moonPhase":0.81,"precipIntensity":0,"precipIntensityMax":0,"precipProbability":0,"temperatureMin":52.26,"temperatureMinTime":1495281600,"temperatureMax":72.06,"temperatureMaxTime":1495317600,"apparentTemperatureMin":52.26,"apparentTemperatureMinTime":1495281600,"apparentTemperatureMax":72.06,"apparentTemperatureMaxTime":1495317600,"dewPoint":53.26,"humidity":0.75,"windSpeed":4.64,"windBearing":255,"visibility":7.95,"cloudCover":0.35,"pressure":1013.75,"ozone":336.1},{"time":1495350000,"summary":"Mostly cloudy until afternoon.","icon":"partly-cloudy-day","sunriseTime":1495371379,"sunsetTime":1495423151,"moonPhase":0.85,"precipIntensity":0,"precipIntensityMax":0,"precipProbability":0,"temperatureMin":52.91,"temperatureMinTime":1495368000,"temperatureMax":75.48,"temperatureMaxTime":1495407600,"apparentTemperatureMin":52.91,"apparentTemperatureMinTime":1495368000,"apparentTemperatureMax":75.48,"apparentTemperatureMaxTime":1495407600,"dewPoint":54.47,"humidity":0.78,"windSpeed":4.44,"windBearing":250,"visibility":7.21,"cloudCover":0.46,"pressure":1012.75,"ozone":351.26},{"time":1495436400,"summary":"Partly cloudy until afternoon.","icon":"partly-cloudy-day","sunriseTime":1495457740,"sunsetTime":1495509601,"moonPhase":0.89,"precipIntensity":0,"precipIntensityMax":0,"precipProbability":0,"temperatureMin":51.99,"temperatureMinTime":1495454400,"temperatureMax":77.81,"temperatureMaxTime":1495483200,"apparentTemperatureMin":51.99,"apparentTemperatureMinTime":1495454400,"apparentTemperatureMax":77.81,"apparentTemperatureMaxTime":1495483200,"dewPoint":51.18,"humidity":0.67,"windSpeed":5.23,"windBearing":240,"visibility":3.57,"cloudCover":0.27,"pressure":1013.35,"ozone":330.75},{"time":1495522800,"summary":"Mostly cloudy throughout the day.","icon":"partly-cloudy-day","sunriseTime":1495544102,"sunsetTime":1495596049,"moonPhase":0.92,"precipIntensity":0,"precipIntensityMax":0,"precipProbability":0,"temperatureMin":57.21,"temperatureMinTime":1495540800,"temperatureMax":72.09,"temperatureMaxTime":1495576800,"apparentTemperatureMin":57.21,"apparentTemperatureMinTime":1495540800,"apparentTemperatureMax":72.09,"apparentTemperatureMaxTime":1495576800,"dewPoint":50.42,"humidity":0.65,"windSpeed":5.82,"windBearing":238,"cloudCover":0.61,"pressure":1012.81,"ozone":325.42},{"time":1495609200,"summary":"Clear throughout the day.","icon":"clear-day","sunriseTime":1495630466,"sunsetTime":1495682497,"moonPhase":0.96,"precipIntensity":0,"precipIntensityMax":0,"precipProbability":0,"temperatureMin":55.58,"temperatureMinTime":1495692000,"temperatureMax":68.82,"temperatureMaxTime":1495666800,"apparentTemperatureMin":55.58,"apparentTemperatureMinTime":1495692000,"apparentTemperatureMax":68.82,"apparentTemperatureMaxTime":1495666800,"dewPoint":51.66,"humidity":0.73,"windSpeed":6.6,"windBearing":240,"cloudCover":0.1,"pressure":1012.35,"ozone":334.87},{"time":1495695600,"summary":"Partly cloudy until afternoon.","icon":"partly-cloudy-day","sunriseTime":1495716832,"sunsetTime":1495768944,"moonPhase":0.01,"precipIntensity":0,"precipIntensityMax":0,"precipProbability":0,"temperatureMin":54.33,"temperatureMinTime":1495713600,"temperatureMax":65.05,"temperatureMaxTime":1495753200,"apparentTemperatureMin":54.33,"apparentTemperatureMinTime":1495713600,"apparentTemperatureMax":65.05,"apparentTemperatureMaxTime":1495753200,"dewPoint":50.45,"humidity":0.76,"windSpeed":7.35,"windBearing":243,"cloudCover":0.15,"pressure":1012.36,"ozone":324.03},{"time":1495782000,"summary":"Mostly cloudy until afternoon.","icon":"partly-cloudy-day","sunriseTime":1495803199,"sunsetTime":1495855390,"moonPhase":0.04,"precipIntensity":0,"precipIntensityMax":0,"precipProbability":0,"temperatureMin":54.19,"temperatureMinTime":1495864800,"temperatureMax":64.58,"temperatureMaxTime":1495836000,"apparentTemperatureMin":54.19,"apparentTemperatureMinTime":1495864800,"apparentTemperatureMax":64.58,"apparentTemperatureMaxTime":1495836000,"dewPoint":49.47,"humidity":0.74,"windSpeed":7.9,"windBearing":253,"cloudCover":0.29,"pressure":1014.15,"ozone":326.15}]
         */

        private String summary;
        private String icon;
        private List<DataBeanXX> data;

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public List<DataBeanXX> getData() {
            return data;
        }

        public void setData(List<DataBeanXX> data) {
            this.data = data;
        }

        public static class DataBeanXX {
            /**
             * time : 1495177200
             * summary : Partly cloudy overnight.
             * icon : partly-cloudy-night
             * sunriseTime : 1495198663
             * sunsetTime : 1495250251
             * moonPhase : 0.78
             * precipIntensity : 0
             * precipIntensityMax : 0
             * precipProbability : 0
             * temperatureMin : 54.21
             * temperatureMinTime : 1495198800
             * temperatureMax : 77.95
             * temperatureMaxTime : 1495227600
             * apparentTemperatureMin : 54.21
             * apparentTemperatureMinTime : 1495198800
             * apparentTemperatureMax : 77.95
             * apparentTemperatureMaxTime : 1495227600
             * dewPoint : 50.92
             * humidity : 0.65
             * windSpeed : 4.53
             * windBearing : 282
             * visibility : 9.84
             * cloudCover : 0.09
             * pressure : 1014.49
             * ozone : 333.44
             */

            private int time;
            private String summary;
            private String icon;
            private int sunriseTime;
            private int sunsetTime;
            private double moonPhase;
            private int precipIntensity;
            private int precipIntensityMax;
            private int precipProbability;
            private double temperatureMin;
            private int temperatureMinTime;
            private double temperatureMax;
            private int temperatureMaxTime;
            private double apparentTemperatureMin;
            private int apparentTemperatureMinTime;
            private double apparentTemperatureMax;
            private int apparentTemperatureMaxTime;
            private double dewPoint;
            private double humidity;
            private double windSpeed;
            private int windBearing;
            private double visibility;
            private double cloudCover;
            private double pressure;
            private double ozone;

            public int getTime() {
                return time;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public int getSunriseTime() {
                return sunriseTime;
            }

            public void setSunriseTime(int sunriseTime) {
                this.sunriseTime = sunriseTime;
            }

            public int getSunsetTime() {
                return sunsetTime;
            }

            public void setSunsetTime(int sunsetTime) {
                this.sunsetTime = sunsetTime;
            }

            public double getMoonPhase() {
                return moonPhase;
            }

            public void setMoonPhase(double moonPhase) {
                this.moonPhase = moonPhase;
            }

            public int getPrecipIntensity() {
                return precipIntensity;
            }

            public void setPrecipIntensity(int precipIntensity) {
                this.precipIntensity = precipIntensity;
            }

            public int getPrecipIntensityMax() {
                return precipIntensityMax;
            }

            public void setPrecipIntensityMax(int precipIntensityMax) {
                this.precipIntensityMax = precipIntensityMax;
            }

            public int getPrecipProbability() {
                return precipProbability;
            }

            public void setPrecipProbability(int precipProbability) {
                this.precipProbability = precipProbability;
            }

            public double getTemperatureMin() {
                return temperatureMin;
            }

            public void setTemperatureMin(double temperatureMin) {
                this.temperatureMin = temperatureMin;
            }

            public int getTemperatureMinTime() {
                return temperatureMinTime;
            }

            public void setTemperatureMinTime(int temperatureMinTime) {
                this.temperatureMinTime = temperatureMinTime;
            }

            public double getTemperatureMax() {
                return temperatureMax;
            }

            public void setTemperatureMax(double temperatureMax) {
                this.temperatureMax = temperatureMax;
            }

            public int getTemperatureMaxTime() {
                return temperatureMaxTime;
            }

            public void setTemperatureMaxTime(int temperatureMaxTime) {
                this.temperatureMaxTime = temperatureMaxTime;
            }

            public double getApparentTemperatureMin() {
                return apparentTemperatureMin;
            }

            public void setApparentTemperatureMin(double apparentTemperatureMin) {
                this.apparentTemperatureMin = apparentTemperatureMin;
            }

            public int getApparentTemperatureMinTime() {
                return apparentTemperatureMinTime;
            }

            public void setApparentTemperatureMinTime(int apparentTemperatureMinTime) {
                this.apparentTemperatureMinTime = apparentTemperatureMinTime;
            }

            public double getApparentTemperatureMax() {
                return apparentTemperatureMax;
            }

            public void setApparentTemperatureMax(double apparentTemperatureMax) {
                this.apparentTemperatureMax = apparentTemperatureMax;
            }

            public int getApparentTemperatureMaxTime() {
                return apparentTemperatureMaxTime;
            }

            public void setApparentTemperatureMaxTime(int apparentTemperatureMaxTime) {
                this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
            }

            public double getDewPoint() {
                return dewPoint;
            }

            public void setDewPoint(double dewPoint) {
                this.dewPoint = dewPoint;
            }

            public double getHumidity() {
                return humidity;
            }

            public void setHumidity(double humidity) {
                this.humidity = humidity;
            }

            public double getWindSpeed() {
                return windSpeed;
            }

            public void setWindSpeed(double windSpeed) {
                this.windSpeed = windSpeed;
            }

            public int getWindBearing() {
                return windBearing;
            }

            public void setWindBearing(int windBearing) {
                this.windBearing = windBearing;
            }

            public double getVisibility() {
                return visibility;
            }

            public void setVisibility(double visibility) {
                this.visibility = visibility;
            }

            public double getCloudCover() {
                return cloudCover;
            }

            public void setCloudCover(double cloudCover) {
                this.cloudCover = cloudCover;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getOzone() {
                return ozone;
            }

            public void setOzone(double ozone) {
                this.ozone = ozone;
            }
        }
    }

    public static class FlagsBean {
        /**
         * sources : ["lamp","gfs","cmc","nam","rap","rtma","sref","fnmoc","isd","madis","nearest-precip","nwspa","darksky"]
         * lamp-stations : ["KAPC","KCCR","KHWD","KLVK","KNUQ","KOAK","KPAO","KSFO","KSQL"]
         * isd-stations : ["724943-99999","745039-99999","745045-99999","745060-23239","745065-99999","994016-99999","994033-99999","994036-99999","997734-99999","998163-99999","998197-99999","998476-99999","998477-99999","998479-99999","999999-23239","999999-23272"]
         * madis-stations : ["AU915","C5988","C8158","CQ147","CQ188","GGBC1","OKXC1","OMHC1","PPXC1","PXOC1","SFOC1","TIBC1","WTEG"]
         * units : us
         */

        private String units;
        private List<String> sources;
        @SerializedName("lamp-stations")
        private List<String> lampstations;
        @SerializedName("isd-stations")
        private List<String> isdstations;
        @SerializedName("madis-stations")
        private List<String> madisstations;

        public String getUnits() {
            return units;
        }

        public void setUnits(String units) {
            this.units = units;
        }

        public List<String> getSources() {
            return sources;
        }

        public void setSources(List<String> sources) {
            this.sources = sources;
        }

        public List<String> getLampstations() {
            return lampstations;
        }

        public void setLampstations(List<String> lampstations) {
            this.lampstations = lampstations;
        }

        public List<String> getIsdstations() {
            return isdstations;
        }

        public void setIsdstations(List<String> isdstations) {
            this.isdstations = isdstations;
        }

        public List<String> getMadisstations() {
            return madisstations;
        }

        public void setMadisstations(List<String> madisstations) {
            this.madisstations = madisstations;
        }
    }
}
