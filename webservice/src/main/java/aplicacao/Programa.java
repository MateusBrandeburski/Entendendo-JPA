package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.user;

public class Programa {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		user p1 = em.find(user.class, 1);
		
		System.out.println(p1);
		System.out.println("Pronto");
		
		em.close();
		emf.close();
	}

}
