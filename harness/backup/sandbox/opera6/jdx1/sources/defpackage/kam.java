package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class kam {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final cyd b;
    public volatile int c = 0;

    public kam(cyd cydVar, int i) {
        this.b = cydVar;
        this.a = i;
    }

    public final vxd a() {
        ThreadLocal threadLocal = d;
        vxd vxdVar = (vxd) threadLocal.get();
        if (vxdVar == null) {
            vxdVar = new vxd();
            threadLocal.set(vxdVar);
        }
        ((wxd) this.b.c).d(vxdVar, this.a);
        return vxdVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        vxd vxdVarA = a();
        int iA = vxdVarA.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) ((t9d) vxdVarA).d).getInt(iA + ((t9d) vxdVarA).a) : 0));
        sb.append(", codepoints:");
        int iE = a().e();
        for (int i = 0; i < iE; i++) {
            sb.append(Integer.toHexString(a().d(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
