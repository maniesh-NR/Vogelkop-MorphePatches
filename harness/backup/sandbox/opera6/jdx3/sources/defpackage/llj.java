package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class llj extends o93 {
    public final /* synthetic */ rxh c;
    public final /* synthetic */ short d;
    public final /* synthetic */ mlj e;
    public final /* synthetic */ rxh f;
    public final /* synthetic */ Function0 g;

    /* JADX WARN: Multi-variable type inference failed */
    public llj(rxh rxhVar, int i, mlj mljVar, rxh rxhVar2, Function0 function0) {
        this.c = rxhVar;
        this.d = i;
        this.e = mljVar;
        this.f = rxhVar2;
        this.g = function0;
    }

    @Override // defpackage.o93
    public final gtj e(View view) {
        gtj gtjVarD = gtj.d(view, this.c, this.d, this.e.b);
        gtjVarD.g(this.f.a(view.getResources()), new xt(this.g, (byte) 1));
        return gtjVarD;
    }

    @Override // defpackage.o93
    public final void f(int i) {
        mlj mljVar = this.e;
        if (mljVar.c == this) {
            mljVar.c = null;
        }
    }
}
