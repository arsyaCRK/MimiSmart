package com.company.mimismart.web.screens.orderline;

import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.screen.*;
import com.company.mimismart.entity.OrderLine;

import javax.inject.Inject;
import java.util.Date;

@UiController("mimismart_OrderLine.edit")
@UiDescriptor("order-line-edit.xml")
@EditedEntityContainer("orderLineDc")
@LoadDataBeforeShow
public class OrderLineEdit extends StandardEditor<OrderLine> {

    @Inject
    private DateField<Date> dateFieldDate;

    @Subscribe
    public void onInit(InitEvent event) {
       dateFieldDate.setRangeEnd(new Date());
    }
    
    
}