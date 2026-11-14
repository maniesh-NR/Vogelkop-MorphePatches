package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class wii implements vwh, dkj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iji b;

    public /* synthetic */ wii(iji ijiVar, byte b) {
        this.a = b;
        this.b = ijiVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, dx3] */
    @Override // defpackage.dkj
    public final void a() {
        iji ijiVar = this.b;
        ?? r0 = ijiVar.c;
        w8d w8dVar = new w8d((byte) 2, ijiVar, true);
        int[][] iArr = lg7.a;
        if (r9n.X((Context) r0)) {
            w8dVar.run(Boolean.TRUE);
        } else {
            f03.U(r0.j, "android.permission.WRITE_EXTERNAL_STORAGE", new dz4(w8dVar));
        }
    }

    @Override // defpackage.vwh
    public final void f(o93 o93Var) {
        this.b.R(o93Var);
    }
}
