package com.example.Spring.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Service;

/**
 * TiempoServiceImpl
 */
@Service
public class TiempoServiceImpl implements TiempoService{

    @Override
    public String getTime() {
        Calendar c = new GregorianCalendar();

        return c.getTime().toString();
    }

    
}