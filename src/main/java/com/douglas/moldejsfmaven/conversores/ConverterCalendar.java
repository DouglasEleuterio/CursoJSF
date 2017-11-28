package com.douglas.moldejsfmaven.conversores;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * Conversor para datas.
 *
 * @author douglas
 */
@FacesConverter(value = "converterCalendar")
@SessionScoped
public class ConverterCalendar implements Converter {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

//    Converte da Tela para o Objeto
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String string) {
        Calendar c = Calendar.getInstance();
//        Para aceitar somenta datas validas
        sdf.setLenient(false);
        try {
            c.setTime(sdf.parse(string));
        } catch (Exception e) {
            return null;
        }
        return c;
    }

//    Converte do objeto para a tela
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object obj) {
        Calendar c = (Calendar) obj;
        String str = sdf.format(c.getTime());
        return str;
    }

}
