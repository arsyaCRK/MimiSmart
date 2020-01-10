package com.company.mimismart.web.screens.supplier;

import com.company.mimismart.entity.Order_from_supplier;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.mimismart.entity.Supplier;

import javax.inject.Inject;

@UiController("mimismart_Supplier.edit")
@UiDescriptor("supplier-edit.xml")
@EditedEntityContainer("supplierDc")

public class SupplierEdit extends StandardEditor<Supplier> {
    @Inject
    private CollectionLoader<Order_from_supplier> order_from_suppliersDl;

    @Inject
    private Table<Order_from_supplier> order_from_supplierTable;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        order_from_suppliersDl.setParameter("supplier", getEditedEntity());
        getScreenData().loadAll();
    }

    @Subscribe
    public void onInit(InitEvent event) {
        order_from_supplierTable.setStyleProvider((entity, property) -> {
                if (property != null) {
                    switch (entity.getStatus().getName()) {
                        case "Новый":
                            return "new";
                        case "Полная поставка":
                            return "full";
                        case "Частичная поставка":
                            return "half";
                    }
                    return null;
                }

                return null;
        });
    }

}