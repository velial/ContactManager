package info.velial.support.web;

import info.velial.support.domain.Payment;
import info.velial.support.service.PaymentService;
import info.velial.support.service.ProviderService;
import info.velial.support.service.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Map;

/**
 * Created by Igor on 17.03.14.
 */
@Controller
public class PaymentListController {

    @Autowired
    private PaymentService paymentService;
    @Autowired
    private ProviderService providerService;
    @Autowired
    private TerminalService terminalService;

    @RequestMapping("/payments")
    public String showLastTenPayments(Map<String, Object> map)
    {
        map.put("lastPayments", paymentService.listPaymentsLastTen());

        return "payments/lastPayments";
    }

    @RequestMapping("/payments/{paymentId}")
    public String showPayment(@PathVariable("paymentId") Integer paymentId, ModelMap model)
    {
        Payment payment = paymentService.getPaymentById(paymentId);
        model.addAttribute("payment",payment);
        model.addAttribute("date",new SimpleDateFormat("yyyy-MM-dd").format(payment.getDate()));
        if (payment.getPay_date()!=null){
            model.addAttribute("pay_date",new SimpleDateFormat("yyyy-MM-dd").format(payment.getPay_date()));
        } else {
            model.addAttribute("pay_date","");
        }
        model.addAttribute("provider", providerService.getProviderById(payment.getProvider_id()));
        model.addAttribute("terminal", terminalService.getTerminalById(payment.getTerminal_id()));
        return "/payments/showPayment";
    }

    @RequestMapping(value = "/findPayments")
    public String findPayments(
            HttpServletRequest request,
            Model model)
    {

        String paymentId = "";
        String account = "";
        String dateStart = "";
        String dateEnd = "";
        try {
            paymentId = request.getParameter("inputPaymentsNumber");
        } catch (Exception e) {}
        try {
            account = request.getParameter("inputPhoneNumber");
        } catch (Exception e) {}
        try {
            dateStart = request.getParameter("inputDateStart");
        } catch (Exception e) {}
        try {
            dateEnd = request.getParameter("inputDateEnd");
        } catch (Exception e) {}

        if (paymentId.isEmpty() && account.isEmpty() && dateStart.isEmpty() && dateEnd.isEmpty())
        {
            return "/payments/findPayments";
        }

        model.addAttribute("payments",paymentService.getPaymentsByFilter(account,dateStart,dateEnd));
        return "/payments/findPayments";
    }
}
