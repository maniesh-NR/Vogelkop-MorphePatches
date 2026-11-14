package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class dzl extends zm9 {
    public final p04 f;
    public d3k g;

    public dzl(spi spiVar, te5 te5Var, n27 n27Var) {
        super(spiVar, te5Var, n27Var);
        this.f = xf8.h(Integer.MAX_VALUE, null, null, 6);
    }

    public static bzl h(p04 p04Var) {
        bzl bzlVar = null;
        k1j k1jVarA = t1j.a(new d((byte) 2, (mt5) null, new nae(p04Var, (byte) 1)));
        while (k1jVarA.hasNext()) {
            bzl bzlVarA = (bzl) k1jVarA.next();
            if (bzlVar != null) {
                bzlVarA = bzlVar.a(bzlVarA);
            }
            bzlVar = bzlVarA;
        }
        return bzlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00db, code lost:
    
        if (r0.invoke(r3, r7) == r8) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.spi r17, defpackage.bzl r18, nt5 r19) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzl.f(spi, bzl, nt5):java.lang.Object");
    }

    public final boolean g(fmg fmgVar) {
        boolean z;
        boolean z2;
        boolean z3;
        p04 p04Var;
        spi spiVar = (spi) ((zm9) this).b;
        lmg lmgVar = (lmg) CollectionsKt.firstOrNull(fmgVar.a);
        if (lmgVar != null) {
            List listB = lmgVar.b();
            int size = listB.size();
            int i = 0;
            z3 = false;
            while (true) {
                p04Var = this.f;
                if (i >= size) {
                    break;
                }
                uba ubaVar = (uba) listB.get(i);
                long j = ubaVar.d ^ (-9223372034707292160L);
                if (!(spiVar.j(spiVar.f(j)) == 0.0f)) {
                    z3 = !(p04Var.b(new bzl(j, ubaVar.a, false)) instanceof ns4) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = lmgVar.l ^ (-9223372034707292160L);
            boolean z4 = fmgVar.f == 12;
            if (!(spiVar.j(spiVar.f(j2)) == 0.0f) || z4) {
                if (!(p04Var.b(new bzl(j2, lmgVar.b, z4)) instanceof ns4) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || ((zm9) this).a) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
