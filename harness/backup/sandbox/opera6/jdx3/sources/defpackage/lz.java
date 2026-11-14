package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class lz implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ e00 b;
    public final /* synthetic */ mz c;
    public final /* synthetic */ Context d;

    public /* synthetic */ lz(Context context, e00 e00Var, mz mzVar) {
        this.d = context;
        this.b = e00Var;
        this.c = mzVar;
    }

    public /* synthetic */ lz(e00 e00Var, mz mzVar, Context context) {
        this.b = e00Var;
        this.c = mzVar;
        this.d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Context context = this.d;
        mz mzVar = this.c;
        e00 e00Var = this.b;
        switch (b) {
            case 0:
                v1.u(context).b(new lz(e00Var, mzVar, context));
                break;
            default:
                e00Var.a(new wx(mzVar, context, (byte) 2));
                break;
        }
    }
}
