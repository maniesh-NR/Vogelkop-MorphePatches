package com.opera.android.autofill;

import J.N;
import androidx.annotation.NonNull;
import defpackage.m4g;
import defpackage.n4g;
import defpackage.o8f;
import defpackage.vdf;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class PasswordImporter {
    public final m4g a;
    public ArrayList b = new ArrayList();
    public long c;

    public PasswordImporter(m4g m4gVar) {
        this.a = m4gVar;
    }

    public final void a(String str) {
        long jMykmBerU = this.c;
        if (jMykmBerU == 0) {
            jMykmBerU = N.MykmBerU(this);
            this.c = jMykmBerU;
        }
        N.M1JiKHyV(jMykmBerU, str);
    }

    public final void addConflictEntry(int i, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        this.b.add(new n4g(i));
    }

    public final void onConflict() {
        ArrayList arrayList = this.b;
        this.b = new ArrayList();
        this.a.t(arrayList, new o8f(this, (byte) 9), new vdf(this, (byte) 14));
    }

    public final void onFailure(int i) {
        long j = this.c;
        if (j != 0) {
            N.MZLGJDmT(j);
            this.c = 0L;
        }
        this.a.a(i);
    }

    public final void onSuccess(int i) {
        long j = this.c;
        if (j != 0) {
            N.MZLGJDmT(j);
            this.c = 0L;
        }
        this.a.g(i);
    }
}
