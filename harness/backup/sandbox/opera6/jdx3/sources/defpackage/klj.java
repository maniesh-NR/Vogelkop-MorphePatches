package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class klj extends o93 {
    public final /* synthetic */ rxh c;
    public final /* synthetic */ short d;
    public final /* synthetic */ mlj e;

    /* JADX WARN: Multi-variable type inference failed */
    public klj(rxh rxhVar, int i, mlj mljVar) {
        this.c = rxhVar;
        this.d = i;
        this.e = mljVar;
    }

    @Override // defpackage.o93
    public final gtj e(View view) {
        return gtj.d(view, this.c, this.d, this.e.b);
    }

    @Override // defpackage.o93
    public final void f(int i) {
        mlj mljVar = this.e;
        if (mljVar.c == this) {
            mljVar.c = null;
        }
    }
}
