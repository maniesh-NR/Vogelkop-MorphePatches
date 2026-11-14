package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public interface oi {
    static oi d(Context context) {
        oi oiVar = (oi) context.getSystemService("com.opera.android.ui.ACTIVITY_STARTER_SERVICE");
        if (oiVar != null) {
            return oiVar;
        }
        qp2.g("Trying to use a Context without support?");
        return null;
    }
}
