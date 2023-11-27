package Final.wsd.Life.Coffe.controller;


import Final.wsd.Life.Coffe.order.OrderService;
import Final.wsd.Life.Coffe.order.OrderServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.PublicKey;

@Controller

public class OrderController {

    private OrderServiceImpl orderService;

    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public String listOrder(Model model){
        model.addAttribute("order", orderService.getAllCoffee());
        return "orders";
    }
}
