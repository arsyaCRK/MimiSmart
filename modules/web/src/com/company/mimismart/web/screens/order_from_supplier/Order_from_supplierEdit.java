package com.company.mimismart.web.screens.order_from_supplier;

import com.company.mimismart.entity.OrderLine;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.mimismart.entity.Order_from_supplier;
import com.sun.istack.Nullable;

import javax.inject.Inject;
import java.util.Date;
import java.util.Map;
import java.util.UUID;


@UiController("mimismart_Order_from_supplier.edit")
@UiDescriptor("order_from_supplier-edit.xml")
@EditedEntityContainer("order_from_supplierDc")
@LoadDataBeforeShow
public class Order_from_supplierEdit extends StandardEditor<Order_from_supplier> {

    @Inject
    private DateField<Date> dateField;
    @Inject
    private DataGrid<OrderLine> order_from_supplierOrderlinesDataGrid;
    @Inject
    private Metadata metadata;
    @Inject
    private CollectionPropertyContainer<OrderLine> order_from_supplierOrderlinesesDc;
    @Inject
    private Button myButton;


    @Subscribe
    public void onInit(InitEvent event) {
        dateField.setRangeEnd(new Date());
    }

    @Nullable
    public void init(Map<String, Object> params) {
        Action addAction = new BaseAction("addOrderLine").withHandler(actionPerformedEvent -> {
            OrderLine orderline = metadata.create(OrderLine.class);
            order_from_supplierOrderlinesesDc.getItems().add(orderline);

            order_from_supplierOrderlinesDataGrid.edit(orderline);
        });
        myButton.setAction(addAction);
    }

}
