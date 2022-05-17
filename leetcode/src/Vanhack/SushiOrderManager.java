package Vanhack;

import java.util.*;
import java.util.stream.Collectors;

class SushiOrderManager {
    int orderId = 0;

    private ArrayList<SushiOrder> orderList ;
    private List<SushiOrder> sortedOrders;
    private int counter =0;
    private int itemCounter = 0;
    private int next = 1;
    private Map<Integer,List<SushiOrder>> finalOrder;
    public SushiOrderManager() {
        /* initialize class state */
        orderList = new ArrayList<>();
        sortedOrders = new ArrayList<>();
        finalOrder = new HashMap<>();
    }
  
    public void addOrder(ArrayList<SushiOrder> request) {
        List<SushiOrder> list = new ArrayList<>(request).stream().sorted(Comparator.comparing(item->item.getSeatId())).collect(Collectors.toList());

        /* add request to current batch of orders */
        for(SushiOrder sushiOrder:list){
            orderList.add(sushiOrder);
            sortedOrders =orderList.stream().collect(Collectors.toList());
        }
        orderId++;
        finalOrder.put(orderId,sortedOrders);

    }

    private SushiOrder getExisting(List<SushiOrder> orderList, SushiOrder sushiOrder) {
        for(SushiOrder order:orderList){
            if(sushiOrder.getSeatId()==order.getSeatId()){
                return order;
            }
        }
        return null;
    }

    public SushiItem nextItem() {
        // return next roll object in the format
        // new SushiItem(/*seatId*/ 1, /*menuItemId*/ "tuna");
        // or null if no order is pending
        SushiItem sushiItem = null;
        ;
        for(List<SushiOrder> s:finalOrder.values()){
            sortedOrders.addAll(s);
        }
        sortedOrders = sortedOrders.stream().distinct().collect(Collectors.toList());
        if(sortedOrders==null||sortedOrders.size()<=0) return null;
        sushiItem = new SushiItem(sortedOrders.get(counter)!=null?sortedOrders.get(counter).getSeatId():null,getNextItem(sortedOrders.get(counter).getMenuItemIds()));
       counter++;
       if(sushiItem.getMenuItemId()==null) return null;
       List<SushiOrder> removableList = new ArrayList<>();
       for(SushiOrder sushiOrder:sortedOrders){
           if(sushiOrder.getMenuItemIds().isEmpty() || sushiOrder.getMenuItemIds()==null){
               removableList.add(sushiOrder);
           }
       }
       sortedOrders.removeAll(removableList);
        if(counter>=sortedOrders.size()){
            counter=0;
        }
        next++;
        return sushiItem;
    }

    private String getNextItem(ArrayList<String> menuItemIds) {
        if(itemCounter<menuItemIds.size()){
           return menuItemIds!=null?menuItemIds.remove(itemCounter):null;
        }//else itemCounter=0;
        return null;

    }
}