package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class rk implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wk b;

    public /* synthetic */ rk(wk wkVar, byte b) {
        this.a = b;
        this.b = wkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        wk wkVar = this.b;
        switch (b) {
            case 0:
                ((gjm) wkVar.B.c).e(ij.a, false);
                break;
            default:
                wkVar.z.b.e(vj.a, false);
                break;
        }
    }
}
