package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
	
		public static void main (String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 1L);
		usuario.setNome("Waguim");
		usuario.setEmail("wgnrsf0809@gmail.com");
		
		em.merge(usuario);//responsavel por fazer um update de um objeto no banco de dados
		
		em.getTransaction().commit();

		em.close();
		emf.close();
		
		}
}
