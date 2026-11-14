package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class kxl implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ x77 b;

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        x77 x77Var = this.b;
        switch (b) {
            case 0:
                ((Callback) x77Var.b).run(Boolean.TRUE);
                break;
            default:
                ((od9) x77Var.c).g0();
                ((Callback) x77Var.b).run(Boolean.FALSE);
                break;
        }
    }
}
