package defpackage;

import java.math.BigInteger;
import java.util.ArrayList;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class n0m implements l0m {
    public final sjj a;

    public n0m(sjj sjjVar) {
        this.a = sjjVar;
    }

    public static byte[] a(lkh lkhVar, ljj ljjVar) {
        int iIntValue;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(lkhVar.a));
        arrayList.add(lkhVar.b);
        arrayList.add(lkhVar.g);
        arrayList.add(lkhVar.h);
        arrayList.add(lkhVar.c);
        wv wvVar = lkhVar.d;
        if (wvVar != null) {
            arrayList.add(naa.c(wvVar.b));
        } else {
            arrayList.add("");
        }
        arrayList.add(lkhVar.e);
        arrayList.add(naa.c(StringsKt.T(lkhVar.f, "0x")));
        arrayList.add(l08.a);
        wv wvVar2 = lkhVar.i;
        if (wvVar2 != null) {
            arrayList.add(naa.c(wvVar2.b));
        } else {
            arrayList.add("");
        }
        if (ljjVar != null) {
            long j = lkhVar.a;
            BigInteger bigInteger = new BigInteger(1, ljjVar.a.a);
            BigInteger bigIntegerD = mkh.D(27);
            BigInteger bigIntegerD2 = mkh.D(28);
            BigInteger bigIntegerD3 = mkh.D(37);
            BigInteger bigIntegerD4 = mkh.D(35);
            if (bigInteger.equals(bigIntegerD) || bigInteger.equals(bigIntegerD2)) {
                iIntValue = bigInteger.subtract(bigIntegerD).intValue();
            } else {
                if (bigInteger.compareTo(bigIntegerD3) < 0) {
                    s49.l(bigInteger, "Unsupported v parameter: ");
                    return null;
                }
                iIntValue = bigInteger.subtract(new BigInteger(String.valueOf(j)).multiply(pe3.c)).subtract(bigIntegerD4).intValue();
            }
            arrayList.add(mkh.D(iIntValue));
            arrayList.add(rm5.W(ljjVar.b.a));
            arrayList.add(rm5.W(ljjVar.c.a));
        }
        byte[] bArrJ = rih.j(arrayList);
        ro9 ro9Var = new ro9((byte) 8);
        kkh[] kkhVarArr = kkh.a;
        byte[] bArr = (byte[]) ro9Var.d;
        int i = ro9Var.b;
        ro9Var.b = i + 1;
        bArr[i] = 123;
        ro9Var.d(bArrJ);
        return ro9Var.b0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(defpackage.lkh r6, avb r7, nt5 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.m0m
            if (r0 == 0) goto L13
            r0 = r8
            m0m r0 = (defpackage.m0m) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            m0m r0 = new m0m
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            lkh r6 = r0.t
            ybh.y(r8)
            goto L46
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r4
        L30:
            ybh.y(r8)
            byte[] r8 = a(r6, r4)
            r0.t = r6
            r0.w = r3
            sjj r5 = r5.a
            qa1 r5 = (defpackage.qa1) r5
            java.lang.Object r8 = r5.a(r8, r7, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            ljj r8 = (defpackage.ljj) r8
            byte[] r5 = a(r6, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n0m.b(lkh, avb, nt5):java.io.Serializable");
    }
}
