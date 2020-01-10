package com.company.mimismart.web.screens.nomenclature;

import com.haulmont.cuba.gui.screen.*;
import com.company.mimismart.entity.Nomenclature;

@UiController("mimismart_Nomenclature.browse")
@UiDescriptor("nomenclature-browse.xml")
@LookupComponent("nomenclaturesTable")
@LoadDataBeforeShow
public class NomenclatureBrowse extends StandardLookup<Nomenclature> {
}