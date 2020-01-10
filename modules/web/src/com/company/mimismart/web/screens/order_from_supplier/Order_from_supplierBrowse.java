package com.company.mimismart.web.screens.order_from_supplier;

import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.data.GroupInfo;
import com.haulmont.cuba.gui.screen.*;
import com.company.mimismart.entity.Order_from_supplier;
import com.sun.istack.Nullable;

import javax.inject.Inject;

@UiController("mimismart_Order_from_supplier.browse")
@UiDescriptor("order_from_supplier-browse.xml")
@LookupComponent("order_from_suppliersTable")
@LoadDataBeforeShow
public class Order_from_supplierBrowse extends StandardLookup<Order_from_supplier> {
    @Inject
    private GroupTable<Order_from_supplier> order_from_suppliersTable;

    @Subscribe
    public void onInit(InitEvent event) {
        order_from_suppliersTable.setStyleProvider(new GroupTable.GroupStyleProvider<Order_from_supplier>() {
            @Override
            public String getStyleName(GroupInfo info) {
                return null;
            }

            @Override
            public String getStyleName(Order_from_supplier entity, @Nullable String property) {
                if (property != null) {
                    switch (entity.getStatus().getName()) {
                        case "Новый":
                            return "new";
                        case "Полная поставка":
                            return "full";
                        case "Частичная поставка":
                            return "half";
                    }
                }
                return null;
            }

        });
    }

}

