package com.opera.android.uninstall;

import android.os.Bundle;
import defpackage.l24;
import defpackage.m24;
import defpackage.n7n;
import defpackage.p7l;
import defpackage.qfl;
import defpackage.r7n;
import defpackage.v78;
import defpackage.vml;
import defpackage.w6j;
import defpackage.xg7;
import defpackage.xt2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/opera/android/uninstall/UninstallActivity;", "Lfp1;", "Ln7n;", "Lm24;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UninstallActivity extends fp1 implements n7n, m24 {
    public static final /* synthetic */ int e = 0;
    public final xg7 a;
    public final v78 b;
    public final pad c;
    public w6j d;

    public UninstallActivity() {
        xg7 xg7Var = new xg7(this);
        this.a = xg7Var;
        this.b = new v78(h1b.v(xg7Var), (byte) 1);
        this.c = new pad((byte) 7);
    }

    @Override // defpackage.m24
    public final void a(l24 l24Var) {
        this.c.t(l24Var);
    }

    @Override // defpackage.m24
    public final void c(l24 l24Var) {
        this.c.A(l24Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object getSystemService(String str) {
        return "com.opera.android.BPR_SERVICE".equals(str) ? this : super/*android.content.Context*/.getSystemService(str);
    }

    @Override // defpackage.n7n
    public final r7n j() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.r*/.onCreate(bundle);
        ocp.p(getWindow(), false);
        this.d = new w6j(getApplicationContext(), vml.d, new qfl(this, (byte) 13), new p7l(this, (byte) 25));
        getSupportFragmentManager().B = new ul9(h1b.v(this.a), (byte) 1);
        setContentView(2131559494);
        f03.f(this);
        getOnBackPressedDispatcher().a(this, new xt2(this, (byte) 9));
    }
}
