package InventryManagementLLD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderController {

        List<Order> OrderList;
        Map<Integer,List<Order>> userIDVsOrders;


        OrderController(){
            OrderList = new ArrayList<>();
            userIDVsOrders = new HashMap<>();
         }


         public Order createNewOrder(User user,Warehouse warehouse)
         {
             Order order = new Order(user,warehouse);
             OrderList.add(order);

             if(userIDVsOrders.containsKey(user.userId))
             {
                 List<Order> userOrders = userIDVsOrders.get(user.userId);
                 userOrders.add(order);
                 userIDVsOrders.put(user.userId, userOrders);
             }
             else
             {
                 List<Order> userOrders = new ArrayList<>();
                 userOrders.add(order);
                 userIDVsOrders.put(user.userId, userOrders);
             }
             return order;
         }

    public void removeOrder(Order order){

        //remove order capability goes here
    }

    public List<Order> getOrderByCustomerId(int userId){
        return null;
    }

    public Order getOrderByOrderId(int orderId){
        return null;
    }


}
