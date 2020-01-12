package com.company.mimismart.web.screens.orderline;

import com.haulmont.cuba.gui.screen.*;
import com.company.mimismart.entity.OrderLine;

@UiController("mimismart_OrderLine.edit")
@UiDescriptor("order-line-edit.xml")
@EditedEntityContainer("orderLineDc")
@LoadDataBeforeShow
public class OrderLineEdit extends StandardEditor<OrderLine> {
}