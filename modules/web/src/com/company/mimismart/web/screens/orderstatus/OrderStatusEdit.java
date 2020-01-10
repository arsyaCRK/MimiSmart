package com.company.mimismart.web.screens.orderstatus;

import com.haulmont.cuba.gui.screen.*;
import com.company.mimismart.entity.OrderStatus;

@UiController("mimismart_OrderStatus.edit")
@UiDescriptor("order-status-edit.xml")
@EditedEntityContainer("orderStatusDc")
@LoadDataBeforeShow
public class OrderStatusEdit extends StandardEditor<OrderStatus> {
}