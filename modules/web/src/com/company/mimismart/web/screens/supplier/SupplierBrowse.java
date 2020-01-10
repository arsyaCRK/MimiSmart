package com.company.mimismart.web.screens.supplier;

import com.haulmont.cuba.gui.screen.*;
import com.company.mimismart.entity.Supplier;

@UiController("mimismart_Supplier.browse")
@UiDescriptor("supplier-browse.xml")
@LookupComponent("suppliersTable")
@LoadDataBeforeShow
public class SupplierBrowse extends StandardLookup<Supplier> {
}