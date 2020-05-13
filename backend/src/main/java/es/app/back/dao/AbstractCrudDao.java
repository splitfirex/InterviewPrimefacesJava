package es.app.back.dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
public abstract class AbstractCrudDao<T> {

    @Autowired
    private SessionFactory sessionFactory;

    abstract Class<T> getEntityClass();

    public T save(T entity) {
        sessionFactory.getCurrentSession().save(entity);
        return entity;
    }

    public T merge(T entity) {
        sessionFactory.getCurrentSession().merge(entity);
        return entity;
    }

    public void delete(T entity) {
        sessionFactory.getCurrentSession().delete(entity);
    }

    public T find(long id) {
        return (T) sessionFactory.getCurrentSession().get(getEntityClass(), id);
    }

    public List<T> list() {
        Criteria query = sessionFactory.getCurrentSession().createCriteria(getEntityClass());
        return query.list();
    }

    public List<T> list(int fistPage, int pageSize) {
        Criteria query = sessionFactory.getCurrentSession().createCriteria(getEntityClass());
        return query.setFirstResult(fistPage).setMaxResults(pageSize).list();
    }

}