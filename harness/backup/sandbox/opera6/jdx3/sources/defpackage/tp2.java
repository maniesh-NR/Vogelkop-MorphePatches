package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class tp2 extends hq2 {
    public final /* synthetic */ iq2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp2(iq2 iq2Var, View view) {
        super(view);
        Objects.requireNonNull(iq2Var);
        this.b = iq2Var;
    }

    public abstract void V(fw fwVar);

    public final String X(fw fwVar) {
        String str = fwVar.b;
        iq2 iq2Var = this.b;
        return ((iq2Var.K.contains(yp2.a) && fwVar.c) || (iq2Var.K.contains(yp2.c) && fwVar.a == ew.RECIPIENT)) ? sko.u(str, "*") : str;
    }

    public final void Y(fw fwVar, String str) {
        iq2 iq2Var = this.b;
        if (((iq2Var.K.contains(yp2.a) && fwVar.c) || (iq2Var.K.contains(yp2.c) && fwVar.a == ew.RECIPIENT)) && TextUtils.getTrimmedLength(str) == 0) {
            fwVar.e = iq2Var.getString(2132020533);
        } else {
            fwVar.e = null;
        }
    }
}
