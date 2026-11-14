package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class znh {
    public fi5 a;
    public int b;
    public qt9 c;
    public Function2 d;
    public int e;
    public zde f;
    public see g;

    public znh(fi5 fi5Var) {
        this.a = fi5Var;
    }

    public final boolean a() {
        if (this.a != null) {
            qt9 qt9Var = this.c;
            if (qt9Var != null ? qt9Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final mjb b(Object obj) {
        mjb mjbVarS;
        fi5 fi5Var = this.a;
        return (fi5Var == null || (mjbVarS = fi5Var.s(this, obj)) == null) ? mjb.a : mjbVarS;
    }

    public final void c() {
        fi5 fi5Var = this.a;
        if (fi5Var != null) {
            fi5Var.o = true;
            fi5Var.t.r0();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
