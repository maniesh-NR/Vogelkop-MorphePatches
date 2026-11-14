package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class vn6 implements dm7 {
    public final am7 a;
    public xl7 b;
    public boolean c;
    public final /* synthetic */ wn6 d;

    public vn6(wn6 wn6Var, am7 am7Var) {
        this.d = wn6Var;
        this.a = am7Var;
    }

    @Override // defpackage.dm7
    public final void release() {
        Handler handler = this.d.u;
        handler.getClass();
        tym.S(handler, new bl6(this, (byte) 3));
    }
}
