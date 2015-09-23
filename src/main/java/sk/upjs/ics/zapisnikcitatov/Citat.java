package sk.upjs.ics.zapisnikcitatov;

import java.util.Date;
import java.util.Objects;


public class Citat {
    private String text;
    
    private String autor;
    
    private Date datumPridania = new Date();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getDatumPridania() {
        return datumPridania;
    }

    public void setDatumPridania(Date datumPridania) {
        this.datumPridania = datumPridania;
    }

    @Override
    public String toString() {
        return this.text + " (" + this.autor + ")";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.text);
        hash = 11 * hash + Objects.hashCode(this.autor);
        hash = 11 * hash + Objects.hashCode(this.datumPridania);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Citat other = (Citat) obj;
        if (!Objects.equals(this.text, other.text)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.datumPridania, other.datumPridania)) {
            return false;
        }
        return true;
    }
    
    
}
