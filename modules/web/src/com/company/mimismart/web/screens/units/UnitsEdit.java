package com.company.mimismart.web.screens.units;

import com.haulmont.cuba.gui.screen.*;
import com.company.mimismart.entity.Units;

@UiController("mimismart_Units.edit")
@UiDescriptor("units-edit.xml")
@EditedEntityContainer("unitsDc")
@LoadDataBeforeShow
public class UnitsEdit extends StandardEditor<Units> {
}