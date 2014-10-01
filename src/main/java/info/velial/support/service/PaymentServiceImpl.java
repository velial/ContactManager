package info.velial.support.service;

import info.velial.support.dao.PaymentDAO;
import info.velial.support.domain.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Igor on 17.03.14.
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDAO paymentDAO;

    @Transactional
    public List<Payment> paymentList()
    {
        return paymentDAO.listPayments();
    }

    @Transactional
    public List<Payment> listPaymentsLastTen()
    {
        return paymentDAO.listPaymentsLastTen();
    }

    @Transactional
    public Payment getPaymentById(Integer paymentId)
    {
        return paymentDAO.getPaymentById(paymentId);
    }

    @Transactional
    public List<Payment> getPaymentsByFilter(String account, String dateStart, String dateEnd) {
        return paymentDAO.getPaymentsByFilter(account, dateStart, dateEnd);
    }

}
