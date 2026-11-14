package org.chromium.components.autofill;

import java.util.List;

/* loaded from: classes.dex */
public class AutofillAddressEditorUiInfo {
    public final String a;
    public final List b;

    public AutofillAddressEditorUiInfo(String str, List<AutofillAddressUiComponent> list) {
        this.a = str;
        this.b = list;
    }

    public final String getBestLanguageTag() {
        return this.a;
    }

    public final List<AutofillAddressUiComponent> getComponents() {
        return this.b;
    }
}
