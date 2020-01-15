package com.company.mimismart.web.screens.order_from_supplier;

import com.company.mimismart.entity.OrderLine;
import com.haulmont.cuba.gui.actions.list.EditAction;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.DatePicker;
import com.haulmont.cuba.gui.screen.*;
import com.company.mimismart.entity.Order_from_supplier;

import javax.inject.Inject;
import java.util.Date;


@UiController("mimismart_Order_from_supplier.edit")
@UiDescriptor("order_from_supplier-edit.xml")
@EditedEntityContainer("order_from_supplierDc")
@LoadDataBeforeShow
public class Order_from_supplierEdit extends StandardEditor<Order_from_supplier> {

    @Inject
    private DateField<Date> dateField;
    @Inject
    private DataGrid<OrderLine> order_from_supplierOrderlinesDataGrid;

    @Subscribe
    public void onInit(InitEvent event) {
        dateField.setRangeEnd(new Date());
        order_from_supplierOrderlinesDataGrid.getColumnNN("date");
    }
    
        
}
