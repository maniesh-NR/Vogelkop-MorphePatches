package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class glj extends o93 {
    public final /* synthetic */ byte c = 0;
    public final gsj d;

    public glj(int i, int i2) {
        this(new rxh(i), i2);
    }

    public glj(pxh pxhVar) {
        this.d = new gsj(pxhVar, 2500, null, 28);
    }

    public glj(pxh pxhVar, int i) {
        this.d = new gsj(pxhVar, i, null);
    }

    public glj(rxh rxhVar, int i, rxh rxhVar2, Function0 function0) {
        this.d = new gsj(rxhVar, i, new bsj(rxhVar2, function0), 24);
    }

    @Override // defpackage.o93
    public final gtj e(View view) {
        gsj gsjVarG = g();
        gtj gtjVarD = gtj.d(view, gsjVarG.a, gsjVarG.b, null);
        bsj bsjVar = gsjVarG.c;
        if (bsjVar != null) {
            gtjVarD.g(bsjVar.a.a(view.getResources()), new h4i((Object) bsjVar, (byte) 10));
        }
        return gtjVarD;
    }

    public final gsj g() {
        byte b = this.c;
        return this.d;
    }
}
