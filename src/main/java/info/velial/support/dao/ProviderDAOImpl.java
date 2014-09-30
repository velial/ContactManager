package info.velial.support.dao;

import info.velial.support.domain.Provider;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Igor on 20.03.2014.
 */
@Repository
public class ProviderDAOImpl implements ProviderDAO{

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Provider> providersList() {
        return sessionFactory.getCurrentSession().createQuery("from providers").list();
    }

    @Override
    public Provider getProviderById(Integer providerId) {
        return (Provider) sessionFactory.getCurrentSession().createQuery("from providers where id=?").setInteger(0,providerId).setCacheable(true).uniqueResult();
    }
}
