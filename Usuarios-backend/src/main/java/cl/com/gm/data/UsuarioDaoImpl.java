package cl.com.gm.data;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import mx.com.gm.domain.Persona;

@Stateless
public class PersonaDaoImpl implements UsuarioDao{
    
    @PersistenceContext (unitName = "UsuarioPU")
    EntityManager em;

    @Override
    public List<Usuario> encontrarTodasUsuarios() {
        return em.createNamedQuery("Usuario.encontrarTodasUsuarios").getResultList();
    }

    @Override
    public Usuario encontrarUsuario(Usuario Usuario) {
        return em.find(Usuario.class, persona.getIdUsuario());
    }

    @Override
    public void insertarUsuario(Usuario usuario) {
        em.persist(Usuario);
        em.flush();
    }

    @Override
    public void actualizarUsuario(Usuario Usuario) {
        em.merge(Usuario);
    }

    @Override
    public void eliminarUsuario(Usuario Usuario) {
        em.remove(em.merge(Usuario));
    }
}
