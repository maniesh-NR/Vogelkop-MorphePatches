package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class c4m extends o93 {
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View.OnClickListener e;

    public c4m(ghf ghfVar, String str, int i, View.OnClickListener onClickListener) {
        this.c = str;
        this.d = i;
        this.e = onClickListener;
    }

    @Override // defpackage.o93
    public final gtj e(View view) {
        gtj gtjVarE = gtj.e(view, this.c, 5000);
        gtjVarE.f(this.d, this.e);
        return gtjVarE;
    }
}
