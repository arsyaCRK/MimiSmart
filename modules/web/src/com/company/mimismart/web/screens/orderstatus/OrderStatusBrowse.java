package com.company.mimismart.web.screens.orderstatus;

import com.haulmont.cuba.gui.screen.*;
import com.company.mimismart.entity.OrderStatus;

@UiController("mimismart_OrderStatus.browse")
@UiDescriptor("order-status-browse.xml")
@LookupComponent("orderStatusesTable")
@LoadDataBeforeShow
public class OrderStatusBrowse extends StandardLookup<OrderStatus> {
}