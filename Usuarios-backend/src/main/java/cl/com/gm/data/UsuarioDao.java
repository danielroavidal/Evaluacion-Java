package cl.com.gm.data;

import java.util.List;
import mx.com.gm.domain.Persona;

public interface UsuarioDao {
    
    public List<Usuario> encontrarTodasUsuarios();
    
    public Usuario encontrarUsuario(Usuario Usuario);
    
    public void insertarUsuario(Usuario Usuario);
    
    public void actualizarUsuario(Usuario Usuario);
    
    public void eliminarUsuario(Usuario Usuario);
    
}
