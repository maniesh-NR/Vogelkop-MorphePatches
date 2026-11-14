package defpackage;

import ads_mobile_sdk.bw2;
import ads_mobile_sdk.fz2;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URI;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class z7h {
    public static final long a(float f, float f2) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        int i = a2m.c;
        return jFloatToRawIntBits;
    }

    public static fz2 b(prb prbVar) {
        fz2 fz2Var = null;
        try {
            String strA = bw2.a(prbVar, "click_string", "");
            String strA2 = bw2.a(prbVar, "report_url", "");
            int i = 0;
            boolean zA = bw2.a(prbVar, "non_malicious_reporting_enabled", false);
            boolean zA2 = bw2.a(prbVar, "protection_enabled", false);
            wpb wpbVarE = bw2.e(prbVar, "allowed_headers");
            ArrayList arrayList = new ArrayList();
            if (wpbVarE != null) {
                ArrayList arrayList2 = wpbVarE.a;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    int i3 = i + 1;
                    if (i < 0) {
                        j95.n();
                        throw null;
                    }
                    String strN = ((pqb) obj).n();
                    if (strN != null) {
                        arrayList.add(strN);
                    }
                    i = i3;
                }
            }
            fz2Var = new fz2(strA, strA2, zA, zA2, arrayList);
        } catch (Exception e) {
            ArrayList arrayList3 = w8h.a(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList3.add(message);
        }
        return fz2Var == null ? new fz2() : fz2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(java.io.File r6, java.io.File r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.jfp
            if (r0 == 0) goto L13
            r0 = r8
            jfp r0 = (defpackage.jfp) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            jfp r0 = new jfp
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.t
            px5 r1 = px5.a
            int r2 = r0.u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.ybh.y(r8)     // Catch: java.lang.Throwable -> L4c
            goto L47
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L2e:
            defpackage.ybh.y(r8)
            p0i r8 = t0i.b     // Catch: java.lang.Throwable -> L4c
            cv6 r8 = bb7.a     // Catch: java.lang.Throwable -> L4c
            mr6 r8 = mr6.b     // Catch: java.lang.Throwable -> L4c
            eno r2 = new eno     // Catch: java.lang.Throwable -> L4c
            r5 = 13
            r2.<init>(r6, r7, r3, r5)     // Catch: java.lang.Throwable -> L4c
            r0.u = r4     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r8 = defpackage.na2.Z(r8, r2, r0)     // Catch: java.lang.Throwable -> L4c
            if (r8 != r1) goto L47
            return r1
        L47:
            java.io.File r8 = (java.io.File) r8     // Catch: java.lang.Throwable -> L4c
            p0i r6 = t0i.b     // Catch: java.lang.Throwable -> L4c
            goto L54
        L4c:
            r6 = move-exception
            p0i r7 = t0i.b
            q0i r8 = new q0i
            r8.<init>(r6)
        L54:
            boolean r6 = r8 instanceof q0i
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7h.c(java.io.File, java.io.File, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.kpi r5, float r6, defpackage.e8m r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof moi
            if (r0 == 0) goto L13
            r0 = r8
            moi r0 = (moi) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            moi r0 = new moi
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.u
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            mqh r5 = r0.t
            defpackage.ybh.y(r8)
            goto L4b
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L30:
            defpackage.ybh.y(r8)
            mqh r8 = new mqh
            r8.<init>()
            noi r2 = new noi
            r2.<init>(r6, r7, r8, r3)
            r0.t = r8
            r0.v = r4
            gfe r6 = defpackage.gfe.a
            java.lang.Object r5 = r5.b(r6, r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            r5 = r8
        L4b:
            float r5 = r5.a
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7h.d(kpi, float, e8m, nt5):java.lang.Object");
    }

    public static final LinkedHashSet e(byte[] bArr) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        linkedHashSet.add(new wo5(objectInputStream.readBoolean(), Uri.parse(objectInputStream.readUTF())));
                    }
                    objectInputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        byteArrayInputStream.close();
        return linkedHashSet;
    }

    public static final int h(Context context, float f) {
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static final float i(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    public static final ndc j(View view) {
        while (view != null) {
            Object tag = view.getTag(2131365017);
            ndc ndcVar = tag instanceof ndc ? (ndc) tag : null;
            if (ndcVar != null) {
                return ndcVar;
            }
            Object objH = y7h.h(view);
            view = objH instanceof View ? (View) objH : null;
        }
        return null;
    }

    public static final String k(String str, double d) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        if (currencyInstance instanceof DecimalFormat) {
            ((DecimalFormat) currencyInstance).setCurrency(Currency.getInstance(str));
        }
        return currencyInstance.format(d);
    }

    public static final String l(String str) {
        String strM;
        URI uriA;
        return (!s(str) || (strM = wqm.m(Uri.parse(str), "url")) == null || (uriA = wqm.a("https://", strM)) == null) ? str : String.valueOf(uriA);
    }

    public static SharedPreferences m(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final t4n n(ArrayList arrayList, Function1 function1) {
        drj drjVar = t4n.a;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            int iR = ((qsm) function1.invoke((qrm) obj)).r();
            if (iR != 0) {
                i2 = iR;
            }
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            int iO = ((qsm) function1.invoke((qrm) obj2)).o();
            if (iO != 0) {
                i = iO;
            }
        }
        drjVar.getClass();
        return (i2 == 1 || i == 1) ? t4n.c : i2 == 2 ? t4n.e : i == 2 ? t4n.d : t4n.b;
    }

    public static final int o(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        qp2.o(p3p.i(i, "Could not convert ", " to BackoffPolicy"));
        return 0;
    }

    public static final int p(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return 6;
        }
        qp2.o(p3p.i(i, "Could not convert ", " to NetworkType"));
        return 0;
    }

    public static final int q(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        qp2.o(p3p.i(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return 0;
    }

    public static final int r(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        qp2.o(p3p.i(i, "Could not convert ", " to State"));
        return 0;
    }

    public static final boolean s(String str) {
        if (str.length() == 0) {
            return false;
        }
        Uri uri = Uri.parse(str);
        Uri uri2 = Uri.parse(TextUtils.isEmpty(dyg.a) ? "https://redirect.opera.com/r" : dyg.a);
        return Intrinsics.a(uri.getScheme(), uri2.getScheme()) && Intrinsics.a(uri.getHost(), uri2.getHost()) && Intrinsics.a(uri.getPath(), uri2.getPath());
    }

    public static final boolean t(qrm qrmVar) {
        if (qrmVar.h.g(qsm.Sp)) {
            return qrmVar.h.C() == ssm.d;
        }
        qrmVar.toString();
        return false;
    }

    public static final long u(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : u95.b(j, u95.c(j) * f);
    }

    public static final void v(View view, ndc ndcVar) {
        view.setTag(2131365017, ndcVar);
    }

    public static final int w(int i) {
        int iA = vep.A(i);
        if (iA == 0) {
            return 0;
        }
        int i2 = 1;
        if (iA != 1) {
            i2 = 2;
            if (iA != 2) {
                i2 = 3;
                if (iA != 3) {
                    i2 = 4;
                    if (iA != 4) {
                        if (iA == 5) {
                            return 5;
                        }
                        h9o.p();
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public static final koe x(byte[] bArr) throws IOException {
        if (bArr.length == 0) {
            return new koe(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                koe koeVarP = fsp.p(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return koeVarP;
            } finally {
            }
        } finally {
        }
    }

    public final lxd f(uxd uxdVar) {
        ByteBuffer byteBuffer = uxdVar.e;
        byteBuffer.getClass();
        z4o.w(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return g(uxdVar, byteBuffer);
    }

    public abstract lxd g(uxd uxdVar, ByteBuffer byteBuffer);
}
