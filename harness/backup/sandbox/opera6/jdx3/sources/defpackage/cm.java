package defpackage;

import android.text.TextUtils;
import java.util.List;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class cm implements qyl, d2i, mjo {
    public final /* synthetic */ byte a;
    public int b;
    public final String c;

    public /* synthetic */ cm(int i, String str, byte b) {
        this.a = b;
        this.b = i;
        this.c = str;
    }

    public cm(String str) {
        this.a = (byte) 6;
        this.c = str;
    }

    public /* synthetic */ cm(String str, int i, byte b) {
        this.a = b;
        this.c = str;
        this.b = i;
    }

    @Override // defpackage.mjo
    public final kro a() {
        return phj.r;
    }

    @Override // defpackage.qyl
    public final Boolean b() {
        return null;
    }

    @Override // defpackage.qyl
    public final yn0 c() {
        return vep.A(this.b) != 1 ? yn0.i : yn0.k;
    }

    @Override // defpackage.mjo
    public final void d(qio qioVar) {
        int i = this.b;
        boolean z = qioVar instanceof lio;
        if (!z) {
            sko.x(i);
        }
        if (z) {
            Exception exc = ((lio) qioVar).a;
            sko.x(i);
            exc.getMessage();
            List list = sjo.a;
            String str = this.c;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            gxo gxoVar = gxo.c;
            gxoVar.b.execute(new et2(str, (byte) 5));
        }
    }

    @Override // defpackage.qyl
    public final boolean e() {
        return false;
    }

    @Override // defpackage.qyl
    public final String f() {
        return this.c;
    }

    @Override // defpackage.qyl
    public final boolean g() {
        return false;
    }

    public final int getAmount() {
        return this.b;
    }

    public final String getType() {
        return this.c;
    }

    @Override // defpackage.qyl
    public final boolean h() {
        return false;
    }

    @Override // defpackage.qyl
    public final zn0 i() {
        int iA = vep.A(this.b);
        return iA != 2 ? iA != 3 ? zn0.c : zn0.n : zn0.m;
    }

    @Override // defpackage.qyl
    public final boolean j() {
        return false;
    }

    public final void k(boolean z) throws lv0 {
        if (z) {
            return;
        }
        s();
        throw null;
    }

    public final char l() throws lv0 {
        char cR = r();
        this.b++;
        return cR;
    }

    public final int m() throws lv0 {
        k(Character.isDigit(r()));
        int i = this.b;
        int iCharAt = 0;
        while (true) {
            String str = this.c;
            if (i >= str.length() || !Character.isDigit(str.charAt(i))) {
                break;
            }
            iCharAt = (iCharAt * 10) + (str.charAt(i) - '0');
            i++;
        }
        this.b = i;
        return iCharAt;
    }

    public final void n() {
        while (true) {
            int i = this.b;
            String str = this.c;
            if (i >= str.length() || !CharsKt.c(str.charAt(this.b))) {
                return;
            } else {
                this.b++;
            }
        }
    }

    public final sfe o() throws lv0 {
        jlg jlgVarQ = q();
        while (true) {
            n();
            Character chA = pik.A(this.b, this.c);
            if (chA == null || chA.charValue() != 'a') {
                break;
            }
            l();
            boolean z = false;
            k(l() == 'n');
            if (l() == 'd') {
                z = true;
            }
            k(z);
            jlgVarQ = new flg(jlgVarQ, q());
        }
        return jlgVarQ;
    }

    public final IntRange p() throws lv0 {
        n();
        int iM = m();
        Character chA = pik.A(this.b, this.c);
        if (chA == null || chA.charValue() != '.') {
            return new IntRange(iM, iM, 1);
        }
        l();
        k(l() == '.');
        return new IntRange(iM, m(), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jlg q() throws lv0 {
        /*
            r7 = this;
            r7.n()
            char r0 = r7.l()
            r1 = 99
            r2 = 0
            if (r0 == r1) goto L3e
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L3b
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L38
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L35
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L3e
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L32
            r1 = 118(0x76, float:1.65E-43)
            if (r0 == r1) goto L2f
            r1 = 119(0x77, float:1.67E-43)
            if (r0 != r1) goto L2b
            hlg r0 = defpackage.hlg.d
            goto L40
        L2b:
            r7.s()
            throw r2
        L2f:
            hlg r0 = defpackage.hlg.c
            goto L40
        L32:
            hlg r0 = defpackage.hlg.e
            goto L40
        L35:
            hlg r0 = defpackage.hlg.f
            goto L40
        L38:
            hlg r0 = defpackage.hlg.a
            goto L40
        L3b:
            hlg r0 = defpackage.hlg.b
            goto L40
        L3e:
            hlg r0 = defpackage.hlg.g
        L40:
            r7.n()
            char r1 = r7.r()
            r3 = 37
            if (r1 != r3) goto L5a
            r7.l()
            r7.n()
            int r1 = r7.m()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L5b
        L5a:
            r1 = r2
        L5b:
            r7.n()
            char r3 = r7.r()
            r4 = 33
            r5 = 0
            r6 = 61
            if (r3 == r4) goto L74
            if (r3 != r6) goto L70
            r7.l()
            r3 = r5
            goto L84
        L70:
            r7.s()
            throw r2
        L74:
            r7.l()
            char r2 = r7.l()
            r3 = 1
            if (r2 != r6) goto L80
            r2 = r3
            goto L81
        L80:
            r2 = r5
        L81:
            r7.k(r2)
        L84:
            kotlin.ranges.IntRange r2 = r7.p()
            kotlin.ranges.IntRange[] r2 = new kotlin.ranges.IntRange[]{r2}
            java.util.ArrayList r2 = j95.j(r2)
        L90:
            java.lang.String r4 = r7.c
            int r6 = r7.b
            java.lang.Character r4 = pik.A(r6, r4)
            if (r4 == 0) goto Lad
            char r4 = r4.charValue()
            r6 = 44
            if (r4 != r6) goto Lad
            r7.l()
            kotlin.ranges.IntRange r4 = r7.p()
            r2.add(r4)
            goto L90
        Lad:
            jlg r7 = new jlg
            kotlin.ranges.IntRange[] r4 = new kotlin.ranges.IntRange[r5]
            java.lang.Object[] r2 = r2.toArray(r4)
            kotlin.ranges.IntRange[] r2 = (kotlin.ranges.IntRange[]) r2
            r7.<init>(r0, r1, r3, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm.q():jlg");
    }

    public final char r() throws lv0 {
        Character chA = pik.A(this.b, this.c);
        if (chA != null) {
            return chA.charValue();
        }
        s();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: lv0 */
    public final void s() throws lv0 {
        throw new lv0(p3p.j(this.b + 1, "Invalid syntax at position ", ": ", this.c));
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("AdError(code=");
                sb.append(this.b);
                sb.append(", message='");
                return z1m.l(sb, this.c, "')");
            default:
                return super.toString();
        }
    }
}
