package Vanhack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class SushiOrder {
    private int seatId;
    private ArrayList<String> menuItemIds;

    public SushiOrder(int seatId, ArrayList<String> menuItemIds) {
        this.seatId = seatId;
        this.menuItemIds = menuItemIds;
    }

    public int getSeatId() {
        return seatId;
    }

    public ArrayList<String> getMenuItemIds() {
        return menuItemIds;
    }

    @Override
    public String toString() {
        return "SushiOrder{" +
                "seatId=" + seatId +
                ", menuItemIds=" + menuItemIds +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SushiOrder that = (SushiOrder) o;
        return seatId == that.seatId && Objects.equals(menuItemIds, that.menuItemIds);
    }

}