package info.velial.support.dao;

import info.velial.support.domain.Payment;

import java.util.List;

/**
 * Created by Igor on 17.03.14.
 */
public interface PaymentDAO {
    public List<Payment> listPayments();

    public List<Payment> listPaymentsLastTen();

    public Payment getPaymentById(Integer paymentId);

    public List<Payment> getPaymentsByFilter(Integer paymentId, String dateStart, String dateEnd, String account);

}
