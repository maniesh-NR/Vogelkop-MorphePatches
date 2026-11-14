package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class hua implements ed6 {
    public final ed6 a;
    public final int b;
    public final d5h c;
    public final byte[] d;
    public int e;

    public hua(ed6 ed6Var, int i, d5h d5hVar) {
        z4o.w(i > 0);
        this.a = ed6Var;
        this.b = i;
        this.c = d5hVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // defpackage.ed6
    public final long b(nd6 nd6Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ed6
    public final void c(pl6 pl6Var) {
        pl6Var.getClass();
        this.a.c(pl6Var);
    }

    @Override // defpackage.ed6
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ed6
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // defpackage.ed6
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.oc6
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        ed6 ed6Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (ed6Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = ed6Var.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (true) {
                        if (i5 <= 0) {
                            break;
                        }
                        if (bArr3[i5 - 1] == 0) {
                            i5--;
                        } else {
                            g1g g1gVar = new g1g(bArr3, i5);
                            d5h d5hVar = this.c;
                            long jMax = !d5hVar.l ? d5hVar.i : Math.max(d5hVar.m.l(true), d5hVar.i);
                            int iA = g1gVar.a();
                            hyl hylVar = d5hVar.k;
                            hylVar.getClass();
                            hylVar.f(iA, g1gVar);
                            hylVar.a(jMax, 1, iA, 0, null);
                            d5hVar.l = true;
                        }
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int i8 = ed6Var.read(bArr, i, Math.min(i3, i2));
        if (i8 != -1) {
            this.e -= i8;
        }
        return i8;
    }
}
