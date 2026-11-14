package defpackage;

import com.leanplum.messagetemplates.MessageTemplateConstants;

/* loaded from: classes.dex */
public final class r4h implements Runnable {
    public final np1 a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;

    public r4h(np1 np1Var) {
        this.a = np1Var;
    }

    public final void a() {
        if (this.g) {
            this.g = false;
            this.a.f(10000);
            vml.a(this);
        }
    }

    public final void b() {
        int i = this.b ? 95 : 60;
        int i2 = this.e;
        int i3 = i * 100;
        int iT = cs5.t(v0g.h(this.d, 100, 5, z1m.d(Math.max(i3, i2), this.e, 5, i2)), MessageTemplateConstants.Values.CENTER_POPUP_WIDTH, i3);
        this.d = 0;
        this.e = iT;
        vml.d(this, 200L);
        if (iT != this.f) {
            this.f = iT;
            this.a.f(iT);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        b();
    }
}
