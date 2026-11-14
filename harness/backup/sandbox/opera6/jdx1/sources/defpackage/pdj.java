package defpackage;

import android.media.Image;

/* loaded from: classes.dex */
public final class pdj implements guf {
    public final guf a;
    public final ghf b;
    public final af2 c = c26.i(false);

    public pdj(guf gufVar, ghf ghfVar) {
        this.a = gufVar;
        this.b = ghfVar;
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        if (this.c.b()) {
            return null;
        }
        if (s15Var.equals(uqh.a(pdj.class)) || s15Var.equals(uqh.a(guf.class)) || s15Var.equals(uqh.a(g0b.class))) {
            return this;
        }
        if (!s15Var.equals(uqh.a(Image.class))) {
            return this.a.E(s15Var);
        }
        throw new UnsupportedOperationException("Cannot unwrap " + this + " as android.media.Image. Use setFinalizerinstead and close all outstanding references.");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.c.a()) {
            ghf ghfVar = this.b;
            if (bf2.b.decrementAndGet((bf2) ghfVar.c) == 0) {
                ((n65) ((ef2) ghfVar.d).b((Object) null)).a((guf) ghfVar.b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pdj p() {
        /*
            r5 = this;
            af2 r0 = r5.c
            boolean r0 = r0.b()
            r1 = 0
            if (r0 != 0) goto L31
            ghf r0 = r5.b
            java.lang.Object r2 = r0.c
            bf2 r2 = (bf2) r2
        Lf:
            int r3 = r2.a
            if (r3 != 0) goto L15
            r4 = 0
            goto L17
        L15:
            int r4 = r3 + 1
        L17:
            boolean r3 = r2.a(r3, r4)
            if (r3 == 0) goto Lf
            if (r4 == 0) goto L24
            java.lang.Object r0 = r0.b
            guf r0 = (defpackage.guf) r0
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 == 0) goto L31
            pdj r0 = new pdj
            guf r2 = r5.a
            ghf r5 = r5.b
            r0.<init>(r2, r5)
            goto L32
        L31:
            r0 = r1
        L32:
            if (r0 == 0) goto L35
            return r0
        L35:
            java.lang.String r5 = "Required value was null."
            qp2.n(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdj.p():pdj");
    }

    public final String toString() {
        return this.a.toString();
    }
}
