package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final class mp4 extends r22 {
    public final ywh e;

    public mp4(Context context, ga6 ga6Var, d93 d93Var) {
        super(context, (qtm) null, d93Var);
        this.e = ga6Var;
    }

    public /* synthetic */ mp4(Context context, ywh ywhVar, qtm qtmVar) {
        super(context, qtmVar, qtmVar);
        this.e = ywhVar;
    }

    public final void Q(lp4 lp4Var) {
        Uri.Builder builderC = c();
        builderC.appendEncodedPath("v1/category/manifestv2");
        this.e.a(new z7(builderC.build().toString()), new kp4(this, lp4Var, (byte) 0));
    }
}
