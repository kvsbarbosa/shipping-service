package com.kvsb.kstore.service;

import com.kvsb.kstore.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public ShippingService() {
    }

    public double shipment(Order order) {
        if (order.getBasic() < 100.00) {
            return 20.00;
        }

        if (order.getBasic() < 200) {
            return 12.00;
        }

        return 00.00;
    }

}
