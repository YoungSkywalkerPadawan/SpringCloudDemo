package cn.itcast.order.web;


import cn.itcast.order.pojo.Order;
import cn.itcast.order.pojo.User;
import cn.itcast.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
public class OrderController {

   @Autowired
   private OrderService orderService;

//   @Resource
//   private UserClient userClient;

//   @GetMapping("{orderId}")
//   public Order queryOrderByUserId(@PathVariable("orderId")Long orderId) {
//        // 根据id查询订单并返回
//        Order order = orderService.queryOrderById(orderId);
//       User user = userClient.findById(order.getUserId());
//       order.setUser(user);
//        return order;
//
//    }

   @Autowired
   private RestTemplate restTemplate;

    @GetMapping("{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId) {
        // 根据id查询订单并返回
        Order order = orderService.queryOrderById(orderId);
        String url = "http://192.168.3.67:8081/user/1";
        User user = restTemplate.getForObject(url, User.class);
        order.setUser(user);
        return order;

    }
}
