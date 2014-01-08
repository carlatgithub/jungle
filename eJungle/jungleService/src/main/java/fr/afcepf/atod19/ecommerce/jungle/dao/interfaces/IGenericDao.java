package fr.afcepf.atod19.ecommerce.jungle.dao.interfaces;

public interface IGenericDao {
	<T> void deleteEntity(Class<T> entity, Long pk);
	<T> void updateEntity(T entity);
	<T> T getEntityByPk(Class<T> c, Long pk);
	<T> void persistNewEntity(T entity);

}
