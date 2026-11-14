package defpackage;

import android.content.Context;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class e88 extends ny0 {
    @Override // defpackage.ny0, defpackage.h8f
    public final Object b(Context context, l1b l1bVar, mt5 mt5Var) {
        String str = (String) l1bVar.get("payment_ref");
        if (str == null || StringsKt.N(str)) {
            str = null;
        }
        return str != null ? super.b(context, l1bVar, mt5Var) : Boolean.FALSE;
    }

    @Override // defpackage.ny0
    public final s88 d(l1b l1bVar) throws eva {
        String str = (String) l1bVar.get("payment_ref");
        if (str == null || StringsKt.N(str)) {
            str = null;
        }
        if (str != null) {
            return new l88(str);
        }
        throw new eva("payment_ref missing");
    }
}
