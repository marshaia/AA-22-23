/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: vicshadow(Universidade do Minho)
 * License Type: Academic
 */
package sicavibe;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class UtilizadorDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(UtilizadorDAO.class);
	public static Utilizador loadUtilizadorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = sicavibe.SicaVibeMainVPPersistentManager.instance().getSession();
			return loadUtilizadorByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadUtilizadorByORMID(int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Utilizador getUtilizadorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = sicavibe.SicaVibeMainVPPersistentManager.instance().getSession();
			return getUtilizadorByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getUtilizadorByORMID(int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Utilizador loadUtilizadorByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sicavibe.SicaVibeMainVPPersistentManager.instance().getSession();
			return loadUtilizadorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadUtilizadorByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Utilizador getUtilizadorByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sicavibe.SicaVibeMainVPPersistentManager.instance().getSession();
			return getUtilizadorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getUtilizadorByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Utilizador loadUtilizadorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Utilizador) session.load(sicavibe.Utilizador.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			_logger.error("loadUtilizadorByORMID(PersistentSession session, int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Utilizador getUtilizadorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Utilizador) session.get(sicavibe.Utilizador.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			_logger.error("getUtilizadorByORMID(PersistentSession session, int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Utilizador loadUtilizadorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Utilizador) session.load(sicavibe.Utilizador.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadUtilizadorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Utilizador getUtilizadorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Utilizador) session.get(sicavibe.Utilizador.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getUtilizadorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilizador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sicavibe.SicaVibeMainVPPersistentManager.instance().getSession();
			return queryUtilizador(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("queryUtilizador(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilizador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sicavibe.SicaVibeMainVPPersistentManager.instance().getSession();
			return queryUtilizador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("queryUtilizador(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Utilizador[] listUtilizadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sicavibe.SicaVibeMainVPPersistentManager.instance().getSession();
			return listUtilizadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listUtilizadorByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Utilizador[] listUtilizadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sicavibe.SicaVibeMainVPPersistentManager.instance().getSession();
			return listUtilizadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listUtilizadorByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilizador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sicavibe.Utilizador as Utilizador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listUtilizadorByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilizador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sicavibe.Utilizador as Utilizador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Utilizador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listUtilizadorByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Utilizador[] listUtilizadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUtilizador(session, condition, orderBy);
			return (Utilizador[]) list.toArray(new Utilizador[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listUtilizadorByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Utilizador[] listUtilizadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUtilizador(session, condition, orderBy, lockMode);
			return (Utilizador[]) list.toArray(new Utilizador[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listUtilizadorByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Utilizador loadUtilizadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sicavibe.SicaVibeMainVPPersistentManager.instance().getSession();
			return loadUtilizadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadUtilizadorByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Utilizador loadUtilizadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sicavibe.SicaVibeMainVPPersistentManager.instance().getSession();
			return loadUtilizadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadUtilizadorByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Utilizador loadUtilizadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Utilizador[] utilizadors = listUtilizadorByQuery(session, condition, orderBy);
		if (utilizadors != null && utilizadors.length > 0)
			return utilizadors[0];
		else
			return null;
	}
	
	public static Utilizador loadUtilizadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Utilizador[] utilizadors = listUtilizadorByQuery(session, condition, orderBy, lockMode);
		if (utilizadors != null && utilizadors.length > 0)
			return utilizadors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUtilizadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sicavibe.SicaVibeMainVPPersistentManager.instance().getSession();
			return iterateUtilizadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateUtilizadorByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUtilizadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sicavibe.SicaVibeMainVPPersistentManager.instance().getSession();
			return iterateUtilizadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateUtilizadorByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUtilizadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sicavibe.Utilizador as Utilizador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateUtilizadorByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUtilizadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sicavibe.Utilizador as Utilizador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Utilizador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateUtilizadorByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean save(sicavibe.Utilizador utilizador) throws PersistentException {
		try {
			sicavibe.SicaVibeMainVPPersistentManager.instance().saveObject(utilizador);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(SicaVibe.Utilizador utilizador)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(sicavibe.Utilizador utilizador) throws PersistentException {
		try {
			sicavibe.SicaVibeMainVPPersistentManager.instance().deleteObject(utilizador);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(SicaVibe.Utilizador utilizador)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(sicavibe.Utilizador utilizador) throws PersistentException {
		try {
			sicavibe.SicaVibeMainVPPersistentManager.instance().getSession().refresh(utilizador);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(SicaVibe.Utilizador utilizador)", e);
			throw new PersistentException(e);
		}
	}

	
	public static boolean evict(sicavibe.Utilizador utilizador) throws PersistentException {
		try {
			sicavibe.SicaVibeMainVPPersistentManager.instance().getSession().evict(utilizador);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(SicaVibe.Utilizador utilizador)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Utilizador loadUtilizadorByCriteria(UtilizadorCriteria utilizadorCriteria) {
		Utilizador[] utilizadors = listUtilizadorByCriteria(utilizadorCriteria);
		if(utilizadors == null || utilizadors.length == 0) {
			return null;
		}
		return utilizadors[0];
	}
	
	public static Utilizador[] listUtilizadorByCriteria(UtilizadorCriteria utilizadorCriteria) {
		return utilizadorCriteria.listUtilizador();
	}
}
