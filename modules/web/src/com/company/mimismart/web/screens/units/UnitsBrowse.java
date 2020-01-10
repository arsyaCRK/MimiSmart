package com.company.mimismart.web.screens.units;

import com.haulmont.cuba.gui.screen.*;
import com.company.mimismart.entity.Units;

@UiController("mimismart_Units.browse")
@UiDescriptor("units-browse.xml")
@LookupComponent("unitsesTable")
@LoadDataBeforeShow
public class UnitsBrowse extends StandardLookup<Units> {
}