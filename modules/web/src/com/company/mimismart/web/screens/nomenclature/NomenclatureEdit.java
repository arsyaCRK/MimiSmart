package com.company.mimismart.web.screens.nomenclature;

import com.haulmont.cuba.gui.screen.*;
import com.company.mimismart.entity.Nomenclature;

@UiController("mimismart_Nomenclature.edit")
@UiDescriptor("nomenclature-edit.xml")
@EditedEntityContainer("nomenclatureDc")
@LoadDataBeforeShow
public class NomenclatureEdit extends StandardEditor<Nomenclature> {
}