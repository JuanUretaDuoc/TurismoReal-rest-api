package cl.portafolioduoc.arriendos.controller.paymentinfo;

import cl.portafolioduoc.arriendos.service.paymentinfo.PaymentInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentInfoController {
    private PaymentInfoService paymentInfoService;
}
