package com.example.Spring.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

/**
 * TiempoServiceImpl
 */
@Service
@RequestScope
public class TiempoServiceImpl implements TiempoService{

    private Calendar c;
    
    @Override
    public String getTime() {
        
        return c.getTime().toString();
    }

    public TiempoServiceImpl() {
    c = new GregorianCalendar();
    }

    
}