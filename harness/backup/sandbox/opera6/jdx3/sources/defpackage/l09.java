package defpackage;

import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public final class l09 extends p09 {
    public l09() {
        super("TEXT", 1);
    }

    @Override // defpackage.p09
    public final AutofillValue d(String str) {
        if ((str != null ? str : null) != null) {
            return AutofillValue.forText(str);
        }
        return null;
    }
}
