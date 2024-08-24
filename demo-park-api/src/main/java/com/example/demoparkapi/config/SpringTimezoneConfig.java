package com.example.demoparkapi.config;

import java.util.TimeZone;

public class SpringTimezoneConfig {

    public void timezoneConfig() {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }

}
