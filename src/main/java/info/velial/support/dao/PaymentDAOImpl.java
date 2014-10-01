package info.velial.support.dao;

import info.velial.support.domain.Payment;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Igor on 17.03.14.
 */
@Repository
public class PaymentDAOImpl implements PaymentDAO {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<Payment> listPayments()
    {
//        return sessionFactory.getCurrentSession().createSQLQuery("select id, sp_id, sd_id,status,spstatusid, phone, amount, amount_cash from payments order by id desc limit 10").list();
        return sessionFactory.getCurrentSession().createQuery("from payments").setFirstResult(0).setMaxResults(10).list();
    }

    @SuppressWarnings("unchecked")
    public List<Payment> listPaymentsLastTen()
    {
        return sessionFactory.getCurrentSession().createQuery("from payments order by id desc").setFirstResult(0).setMaxResults(10).list();
    }

    @SuppressWarnings("unchecked")
    public Payment getPaymentById(Integer paymentId)
    {
        return (Payment) sessionFactory.getCurrentSession().
                createQuery("from payments where id=?")
                .setInteger(0,paymentId)
                .uniqueResult();
    }

    @SuppressWarnings("unchecked")
    public List<Payment> getPaymentsByFilter(String account, String dateStart, String dateEnd)
    {
        if (!account.isEmpty() && dateStart.isEmpty() && dateEnd.isEmpty()) {
            return sessionFactory.getCurrentSession()
                    .createQuery("from payments where phone=?")
                    .setString(0,account)
                    .setFirstResult(0)
                    .setMaxResults(1)
                    .list();
        }

        if (!account.isEmpty() && !dateStart.isEmpty() && dateEnd.isEmpty()) {
            return sessionFactory.getCurrentSession()
                    .createQuery("from payments where phone=? and date>=?")
                    .setString(0,account)
                    .setString(1,dateStart)
                    .setFirstResult(0)
                    .setMaxResults(1)
                    .list();
        }

        if (!account.isEmpty() && dateStart.isEmpty() && !dateEnd.isEmpty()) {
            return sessionFactory.getCurrentSession()
                    .createQuery("from payments where phone=? and date<=?")
                    .setString(0,account)
                    .setString(1,dateEnd)
                    .setFirstResult(0)
                    .setMaxResults(1)
                    .list();
        }

        return sessionFactory.getCurrentSession()
                .createQuery("from payments where phone=? and date>=? and date<=?")
                .setString(0,account)
                .setString(1,dateStart)
                .setString(2,dateEnd)
                .setFirstResult(0)
                .setMaxResults(1)
                .list();
    }
}
