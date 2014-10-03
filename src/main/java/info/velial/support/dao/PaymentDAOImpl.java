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
        return sessionFactory.getCurrentSession()
                .createQuery("from payments order by id desc")
                .setFirstResult(0)
                .setMaxResults(10)
                .list();
    }

    @SuppressWarnings("unchecked")
    public List<Payment> listPaymentsLastTen()
    {
        return sessionFactory.getCurrentSession()
                .createQuery("from payments order by id desc")
                .setFirstResult(0)
                .setMaxResults(10)
                .list();
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
    public List<Payment> getPaymentsByFilter(Integer paymentId, String dateStart, String dateEnd, String account)
    {
        if (paymentId>0)
        {
            return sessionFactory.getCurrentSession()
                    .createQuery("from payments where id=? order by id desc")
                    .setInteger(0,paymentId)
                    .setFirstResult(0)
                    .setMaxResults(10)
                    .list();
        }

        if (!account.isEmpty() && dateStart.isEmpty() && dateEnd.isEmpty()) {
            return sessionFactory.getCurrentSession()
                    .createQuery("from payments where phone=? order by id desc")
                    .setString(0,account)
                    .setFirstResult(0)
                    .setMaxResults(10)
                    .list();
        }

        if (!account.isEmpty() && !dateStart.isEmpty() && dateEnd.isEmpty()) {
            return sessionFactory.getCurrentSession()
                    .createQuery("from payments where phone=? and date>=? order by id desc")
                    .setString(0,account)
                    .setString(1,dateStart)
                    .setFirstResult(0)
                    .setMaxResults(10)
                    .list();
        }

        if (!account.isEmpty() && dateStart.isEmpty() && !dateEnd.isEmpty()) {
            return sessionFactory.getCurrentSession()
                    .createQuery("from payments where phone=? and date<=? order by id desc")
                    .setString(0,account)
                    .setString(1,dateEnd)
                    .setFirstResult(0)
                    .setMaxResults(10)
                    .list();
        }

        return sessionFactory.getCurrentSession()
                .createQuery("from payments where phone=? and date>=? and date<=? order by id desc")
                .setString(0,account)
                .setString(1,dateStart)
                .setString(2,dateEnd)
                .setFirstResult(0)
                .setMaxResults(10)
                .list();
    }
}
