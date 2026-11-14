package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class hji extends cej {
    @Override // defpackage.cej
    public final mej createSheetHost(Context context) {
        wq3 wq3Var = new wq3(context, (byte) 1);
        wq3Var.a.getWindow().setSoftInputMode(32);
        return wq3Var;
    }
}
