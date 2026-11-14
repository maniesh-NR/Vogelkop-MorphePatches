package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class u00 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v00 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ u00(v00 v00Var, Context context, byte b) {
        this.a = b;
        this.b = v00Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Context context = this.c;
        v00 v00Var = this.b;
        switch (b) {
            case 0:
                v00Var.c(context);
                break;
            default:
                v00Var.d = null;
                v00Var.c(context);
                break;
        }
    }
}
