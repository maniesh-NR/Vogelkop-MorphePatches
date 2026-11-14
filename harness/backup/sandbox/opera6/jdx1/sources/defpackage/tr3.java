package defpackage;

import ads_mobile_sdk.gs3;
import ads_mobile_sdk.nt3;
import ads_mobile_sdk.ws3;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class tr3 implements ua6, p9f, y0n {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public tr3(long j, int i) {
        z4o.H(((h01) this.c) == null);
        this.a = j;
        this.b = j + i;
    }

    public tr3(String str, byte[] bArr, long j, long j2) {
        this.c = str;
        this.d = bArr;
        this.a = j;
        this.b = j2;
    }

    public static tr3 a(gs3 gs3Var, byte[] bArr, boolean z) throws ojp, cop, xzo {
        byte[] bArr2;
        gs3Var.a();
        nt3 nt3Var = gs3Var.a;
        int length = bArr.length;
        if (length == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            bArr2 = bArr3;
        }
        nt3Var.c.b = new ws3(bArr2);
        List list = (List) gs3Var.a(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        gs3Var.a(jLongValue, Optional.empty());
        StringBuilder sb = new StringBuilder("3.945319811.");
        sb.append(n63.a.c(gs3.b()));
        sb.append(z ? "-s" : "");
        String string = sb.toString();
        tr3 tr3Var = new tr3();
        tr3Var.d = gs3Var;
        tr3Var.a = jLongValue2;
        tr3Var.b = jLongValue3;
        tr3Var.c = string;
        return tr3Var;
    }

    @Override // defpackage.y0n
    public final boolean b() {
        return true;
    }

    @Override // defpackage.y0n
    public final long c(if1 if1Var, if1 if1Var2, if1 if1Var3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.p9f
    public final twi createSeekMap() {
        z4o.H(this.a != -1);
        return new rv2((u69) this.c, this.a, (byte) 1);
    }

    public final void d(ta6 ta6Var) {
        ui5 ui5Var = (ui5) ta6Var;
        synchronized (this.c) {
            ui5Var.d += this.a;
            ui5Var.e += this.b;
            this.b = 0L;
            this.a = 0L;
        }
    }

    public final ta6 e(GregorianCalendar gregorianCalendar) {
        return new ui5(gregorianCalendar);
    }

    public final ta6 f(String str) throws NumberFormatException {
        String[] strArrSplit = str.split("/");
        int i = Integer.parseInt(strArrSplit[0]);
        int i2 = Integer.parseInt(strArrSplit[1]);
        int i3 = Integer.parseInt(strArrSplit[2]);
        long j = Long.parseLong(strArrSplit[3]);
        long j2 = Long.parseLong(strArrSplit[4]);
        ui5 ui5Var = new ui5(i, i2, i3);
        ui5Var.d = j;
        ui5Var.e = j2;
        return ui5Var;
    }

    @Override // defpackage.p9f
    public final long h(lp6 lp6Var) {
        long j = this.b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.b = -1L;
        return j2;
    }

    public final String i(ta6 ta6Var) {
        ui5 ui5Var = (ui5) ta6Var;
        Locale locale = Locale.US;
        int i = ((ta6) ui5Var).a;
        int i2 = ((ta6) ui5Var).b;
        int i3 = ((ta6) ui5Var).c;
        long j = ui5Var.d;
        long j2 = ui5Var.e;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("/");
        sb.append(i2);
        sb.append("/");
        sb.append(i3);
        p3p.u(sb, "/", j, "/");
        sb.append(j2);
        return sb.toString();
    }

    public final void j(Object obj, Object obj2, dmh dmhVar) {
        dmh dmhVar2 = (dmh) obj2;
        ((bp) ((qq8) this.d).b).a0((wsd) obj, dmhVar2.a, dmhVar2.b, dmhVar2.c);
    }

    public final long k() {
        long j = this.b;
        if (j != -1) {
            return j;
        }
        long jN = 0;
        for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
            jN += n(entry.getKey(), entry.getValue());
        }
        this.b = jN;
        return jN;
    }

    public final long l(long j) {
        long j2 = j + this.b;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.a;
        long j4 = j2 / j3;
        return (((puh) this.d) == puh.a || j4 % 2 == 0) ? j2 - (j4 * j3) : ((j4 + 1) * j3) - j2;
    }

    public final if1 m(long j, if1 if1Var, if1 if1Var2, if1 if1Var3) {
        long j2 = this.b;
        long j3 = j + j2;
        long j4 = this.a;
        return j3 > j4 ? ((a1n) this.c).t(j4 - j2, if1Var, if1Var3, if1Var2) : if1Var2;
    }

    public final long n(Object obj, Object obj2) throws Exception {
        try {
            long j = ((dmh) obj2).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.b = -1L;
            throw e;
        }
    }

    public final void p(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        while (k() > j) {
            if (linkedHashMap.isEmpty()) {
                if (k() != 0) {
                    qp2.n("sizeOf() is returning inconsistent values");
                    return;
                }
                return;
            } else {
                Map.Entry entry = (Map.Entry) CollectionsKt.J(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.b = k() - n(key, value);
                j(key, value, null);
            }
        }
    }

    @Override // defpackage.p9f
    public final void startSeek(long j) {
        long[] jArr = (long[]) ((bpd) this.d).b;
        this.b = jArr[tym.f(jArr, j, true)];
    }

    @Override // defpackage.y0n
    public final if1 t(long j, if1 if1Var, if1 if1Var2, if1 if1Var3) {
        return ((a1n) this.c).t(l(j), if1Var, if1Var2, m(j, if1Var, if1Var3, if1Var2));
    }

    @Override // defpackage.y0n
    public final if1 w(long j, if1 if1Var, if1 if1Var2, if1 if1Var3) {
        return ((a1n) this.c).w(l(j), if1Var, if1Var2, m(j, if1Var, if1Var3, if1Var2));
    }
}
