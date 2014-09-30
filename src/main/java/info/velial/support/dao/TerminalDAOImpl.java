package info.velial.support.dao;

import info.velial.support.domain.Terminal;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Igor on 20.03.2014.
 */
@Repository
public class TerminalDAOImpl implements TerminalDAO {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Terminal> terminalList() {
        return sessionFactory.getCurrentSession().createQuery("from terminals").list();
    }

    @Override
    public Terminal getTerminalById(Integer terminalId) {
        return (Terminal) sessionFactory.getCurrentSession()
                .createQuery("from terminals where id=?")
                .setInteger(0,terminalId)
                .setCacheable(true)
                .uniqueResult();
    }
}
