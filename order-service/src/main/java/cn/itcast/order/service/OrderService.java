package cn.itcast.order.service;

import cn.itcast.order.pojo.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

//    @Autowired
//    private OrderMapper orderMapper;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
//        Order order = orderMapper.findById(orderId);
        Order order = new Order();
        order.setId(new Long(1));
        order.setName("a001");
        order.setNum(100);
        order.setUserId(new Long(1));
        return order;
    }
}
