package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class y91 implements wa1 {
    public final ap9 a;

    public y91(ap9 ap9Var) {
        this.a = ap9Var;
    }

    public final void close() throws IOException {
        this.a.close();
    }

    public final long execute() {
        return this.a.h();
    }

    public final void w(int i, String str) {
        ap9 ap9Var = this.a;
        int i2 = i + 1;
        if (str == null) {
            ap9Var.j1(i2);
        } else {
            ap9Var.w(i2, str);
        }
    }

    public final void x(int i, Long l) {
        ap9 ap9Var = this.a;
        int i2 = i + 1;
        if (l == null) {
            ap9Var.j1(i2);
        } else {
            ap9Var.T0(i2, l.longValue());
        }
    }

    public final Object y(Function1 function1) {
        throw new UnsupportedOperationException();
    }

    public final void z(int i, byte[] bArr) {
        ap9 ap9Var = this.a;
        int i2 = i + 1;
        if (bArr == null) {
            ap9Var.j1(i2);
        } else {
            ap9Var.Z0(i2, bArr);
        }
    }
}
