package Final.wsd.Life.Coffe.controller;


import Final.wsd.Life.Coffe.order.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.PublicKey;

@Controller

public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public String listOrder(Model model){
        model.addAttribute("order", orderService.getAllCoffee());
        return "orders";
    }
}
