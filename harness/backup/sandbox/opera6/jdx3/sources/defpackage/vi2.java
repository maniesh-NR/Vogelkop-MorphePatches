package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class vi2 implements rzh {
    public String a;
    public boolean b;
    public int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public vi2(int i, String str) {
        this.b = false;
        this.a = null;
        this.h = null;
        this.c = i;
        this.g = str;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public vi2(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.b = z;
        this.a = str;
        this.h = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.c = -1;
        this.g = null;
    }

    public vi2(String str, ode odeVar, Function1 function1, oyj oyjVar) {
        this.a = str;
        this.d = odeVar;
        this.e = function1;
        this.f = oyjVar;
        this.g = new pde(ng.a);
        myj myjVar = new myj(this, (byte) 0);
        this.h = myjVar;
        odeVar.k(myjVar);
    }

    public final void a(int i) {
        if (i <= this.c) {
            return;
        }
        this.c = i;
        if (i < this.a.length()) {
            int iCodePointAt = Character.codePointAt(this.a, this.c);
            if (Character.getType(iCodePointAt) == 24) {
                this.c = Character.charCount(iCodePointAt) + this.c;
            }
        }
        ((Function1) this.e).invoke(Integer.valueOf(this.c));
    }

    @Override // defpackage.hh4
    public final void cancel() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((ode) this.d).p((myj) this.h);
        ((pde) this.g).r(og.a);
        a(this.a.length());
    }

    @Override // defpackage.rzh
    public final void l(String str) {
        this.a = str;
    }
}
