package com.opera.android.settings.cleardata;

import android.os.Bundle;
import defpackage.l24;
import defpackage.m24;
import defpackage.ozk;

/* loaded from: classes.dex */
public class StorageActivity extends fp1 implements m24 {
    public final pad a = new pad((byte) 7);

    @Override // defpackage.m24
    public final void a(l24 l24Var) {
        this.a.t(l24Var);
    }

    @Override // defpackage.m24
    public final void c(l24 l24Var) {
        this.a.A(l24Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object getSystemService(String str) {
        return "com.opera.android.BPR_SERVICE".equals(str) ? this : super/*android.content.Context*/.getSystemService(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.r*/.onCreate(bundle);
        ocp.p(getWindow(), false);
        ozk.a(getTheme(), true);
        setContentView(2131559381);
        f03.f(this);
    }
}
