package com.opera.android.oauth2;

import J.N;
import defpackage.a55;
import defpackage.bhf;
import defpackage.g7f;
import defpackage.i7f;
import defpackage.yf1;

/* loaded from: classes.dex */
public final class OperaAccessSandbox {
    public final a55 b;
    public final yf1 c;
    public long d;
    public int f;
    public final i7f a = new i7f();
    public byte e = 0;

    public OperaAccessSandbox(a55 a55Var, yf1 yf1Var) {
        this.b = a55Var;
        this.c = yf1Var;
    }

    public final void a(int i) {
        this.e = (byte) 5;
        this.f = i != 2 ? 1 : 2;
        g7f g7fVar = new g7f(this.a);
        while (g7fVar.hasNext()) {
            ((bhf) g7fVar.next()).a();
        }
    }

    public final void b() {
        this.e = (byte) 4;
        this.f = 0;
        g7f g7fVar = new g7f(this.a);
        while (g7fVar.hasNext()) {
            ((bhf) g7fVar.next()).a();
        }
    }

    public final void onStarted(int i) {
        if (this.e == 3) {
            if (i == 0) {
                b();
                return;
            } else {
                a(i);
                return;
            }
        }
        long j = this.d;
        if (j == 0 || i != 0) {
            return;
        }
        N.MiD6gAXx(j);
    }
}
