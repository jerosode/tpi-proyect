package classes;
import java.util.Date;

public class OA {
	private String titulo, autor, abst, url;
	private Date fechaPublic;
	
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getAbst() {
	return abst;
}
public void setAbst(String abst) {
	this.abst = abst;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public Date getFechaPublic() {
	return fechaPublic;
}
public void setFechaPublic(Date fechaPublic) {
	this.fechaPublic = fechaPublic;
}

}