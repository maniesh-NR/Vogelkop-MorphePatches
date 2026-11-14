package com.opera.android.touch;

import com.opera.android.Lazy;
import defpackage.pc9;
import defpackage.xih;

/* loaded from: classes.dex */
public final class a extends Lazy {
    public final /* synthetic */ pc9 e;

    public a(pc9 pc9Var) {
        this.e = pc9Var;
    }

    @Override // com.opera.android.Lazy
    public final Object d() {
        u5i u5iVarF = xih.f(this.e.a.getApplicationContext(), MessageDatabase.class, "flow_messages");
        u5iVarF.a(new ryd[]{MessageDatabase.l, MessageDatabase.m, MessageDatabase.n});
        return ((MessageDatabase) u5iVarF.b()).x();
    }
}
