package com.example.Spring.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

/**
 * TiempoServiceImpl
 */
@Service /* se declara el servicio */
@RequestScope /* se inicia el service y este muere cuando devuelve lo que se le pide */
public class TiempoServiceImpl implements TiempoService{ /* se crea la implementacion de TiempoService */

    private Calendar c;
    
    @Override
    public String getTime() {
        
        return c.getTime().toString();
    }

    public TiempoServiceImpl() {
    c = new GregorianCalendar();
    }

    
}