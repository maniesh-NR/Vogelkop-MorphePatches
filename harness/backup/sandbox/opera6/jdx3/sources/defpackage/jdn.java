package defpackage;

import android.view.View;
import java.util.Collections;

/* loaded from: classes.dex */
public final class jdn extends f73 {
    public final hdn h;
    public fdn i;
    public ac1 j;

    public jdn(View view, tah tahVar, hdn hdnVar) {
        super(owc.a(view), tahVar);
        this.h = hdnVar;
    }

    @Override // defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        ac1 ac1Var;
        if (z) {
            return;
        }
        fdn fdnVar = ((jxc) ja2Var).c;
        String str = fdnVar.c;
        fdn fdnVar2 = fdnVar.f;
        this.i = fdnVar;
        if (fdnVar2 == null) {
            ac1Var = new ac1(str);
        } else {
            ac1Var = new ac1(fdnVar2.c);
            ac1Var.d = str;
            if (Collections.unmodifiableList(fdnVar2.g).size() > 1) {
                int i = ((ydn) this.e.d).c.isEnabled() ? 2130970586 : 2130969303;
                obn obnVar = new obn(this, fdnVar2, (byte) 4);
                ac1Var.a = 2131232031;
                ac1Var.b = i;
                ac1Var.e = obnVar;
            }
        }
        this.j = new ac1((CharSequence) ac1Var.c, (CharSequence) ac1Var.d, ac1Var.a, ac1Var.b, (obn) ac1Var.e);
    }

    @Override // defpackage.f73
    public final ac1 b0() {
        return this.j;
    }

    @Override // defpackage.f73
    public final fdn c0() {
        return this.i;
    }
}
