package defpackage;

import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class pu3 {
    public final boolean a;
    public final long b = System.currentTimeMillis();
    public final long c;
    public final xnh d;
    public final vy e;
    public boolean f;
    public final /* synthetic */ BrowserActivity g;

    /* JADX WARN: Multi-variable type inference failed */
    public pu3(BrowserActivity browserActivity, boolean z) {
        this.g = browserActivity;
        this.a = z;
        on7 on7Var = pn7.b;
        this.c = pn7.f(cs5.x0(30, un7.f));
        xnh xnhVarT = xnh.t(browserActivity.getApplicationContext());
        this.d = xnhVarT;
        vy vyVar = new vy(this, (byte) 2);
        this.e = vyVar;
        this.f = true;
        xnhVarT.F(vyVar);
    }
}
