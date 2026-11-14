package defpackage;

import J.N;
import ads_mobile_sdk.fw0;
import ads_mobile_sdk.hh3;
import ads_mobile_sdk.kh3;
import ads_mobile_sdk.mv0;
import ads_mobile_sdk.ou0;
import ads_mobile_sdk.rg3;
import ads_mobile_sdk.tu0;
import ads_mobile_sdk.uw0;
import ads_mobile_sdk.ux2;
import ads_mobile_sdk.vv1;
import ads_mobile_sdk.wk2;
import ads_mobile_sdk.zv1;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class dgh {
    public static int a(String str, int i) {
        return z1m.f(i, 31, str);
    }

    public static vv1 b(ux2 ux2Var, kh3 kh3Var, zv1 zv1Var, FrameLayout frameLayout, Map map, ImageView.ScaleType scaleType) {
        fw0 fw0Var = fw0.CUI_NAME_NATIVE_AD_SIGNAL;
        l08 l08Var = l08.a;
        if (hh3.b().a == null) {
            wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3Var);
            try {
                vv1 vv1Var = new vv1(zv1Var.a(frameLayout, scaleType, map), zv1Var.c(frameLayout), zv1Var.b(frameLayout), zv1Var.a(frameLayout), zv1Var.a());
                wk2VarA.close();
                return vv1Var;
            } catch (Throwable th) {
                try {
                    wk2VarA.b(th);
                    if (th instanceof iyo) {
                        throw th;
                    }
                    wk2VarA.a(th);
                    if (th instanceof kql) {
                        throw new uw0((kql) th);
                    }
                    if (th instanceof CancellationException) {
                        throw new ou0(th);
                    }
                    if (th instanceof mv0) {
                        throw th;
                    }
                    throw new tu0(th);
                } finally {
                }
            }
        } else {
            rg3 rg3VarA = hh3.a(fw0Var, l08Var, true);
            try {
                vv1 vv1Var2 = new vv1(zv1Var.a(frameLayout, scaleType, map), zv1Var.c(frameLayout), zv1Var.b(frameLayout), zv1Var.a(frameLayout), zv1Var.a());
                rg3VarA.close();
                return vv1Var2;
            } catch (Throwable th2) {
                try {
                    rg3VarA.b(th2);
                    if (th2 instanceof iyo) {
                        throw th2;
                    }
                    rg3VarA.a(th2);
                    if (th2 instanceof kql) {
                        throw new uw0((kql) th2);
                    }
                    if (th2 instanceof CancellationException) {
                        throw new ou0(th2);
                    }
                    if (th2 instanceof mv0) {
                        throw th2;
                    }
                    throw new tu0(th2);
                } finally {
                }
            }
        }
    }

    public static final void c(e0g e0gVar, String str, int i, int i2, int i3) {
        if (i2 == -1) {
            int iR = r(i, i3, str);
            int iQ = q(iR, i3, str);
            if (iQ > iR) {
                e0gVar.e(str.substring(iR, iQ), l08.a);
                return;
            }
            return;
        }
        int iR2 = r(i, i2, str);
        int iQ2 = q(iR2, i2, str);
        if (iQ2 > iR2) {
            String strSubstring = str.substring(iR2, iQ2);
            int iR3 = r(i2 + 1, i3, str);
            e0gVar.i(strSubstring, str.substring(iR3, q(iR3, i3, str)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.uuk r7, z53 r8) {
        /*
            boolean r0 = r8 instanceof zyi
            if (r0 == 0) goto L13
            r0 = r8
            zyi r0 = (zyi) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zyi r0 = new zyi
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.u
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            uuk r7 = r0.t
            defpackage.ybh.y(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            r7 = 0
            return r7
        L30:
            defpackage.ybh.y(r8)
        L33:
            gmg r8 = defpackage.gmg.b
            r0.t = r7
            r0.v = r3
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            fmg r8 = (defpackage.fmg) r8
            java.util.List r2 = r8.a
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L4c:
            if (r5 >= r4) goto L5d
            java.lang.Object r6 = r2.get(r5)
            lmg r6 = (defpackage.lmg) r6
            boolean r6 = defpackage.wxe.j(r6)
            if (r6 == 0) goto L33
            int r5 = r5 + 1
            goto L4c
        L5d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgh.d(uuk, z53):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.uuk r7, z53 r8) {
        /*
            boolean r0 = r8 instanceof f5i
            if (r0 == 0) goto L13
            r0 = r8
            f5i r0 = (f5i) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            f5i r0 = new f5i
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.u
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            uuk r7 = r0.t
            defpackage.ybh.y(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            r7 = 0
            return r7
        L30:
            defpackage.ybh.y(r8)
        L33:
            r0.t = r7
            r0.v = r3
            gmg r8 = defpackage.gmg.b
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            fmg r8 = (defpackage.fmg) r8
            int r2 = r8.d
            java.util.List r8 = r8.a
            r2 = r2 & 66
            if (r2 == 0) goto L33
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
            r5 = r4
        L53:
            if (r5 >= r2) goto L64
            java.lang.Object r6 = r8.get(r5)
            lmg r6 = (defpackage.lmg) r6
            boolean r6 = defpackage.wxe.j(r6)
            if (r6 == 0) goto L33
            int r5 = r5 + 1
            goto L53
        L64:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgh.e(uuk, z53):java.lang.Object");
    }

    public static final void f(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            bxl.d(i != i2 ? fki.o(i, i2, "Both size ", " and step ", " must be greater than zero.") : p3p.i(i, "size ", " must be greater than zero."));
        }
    }

    public static final void g(BufferedReader bufferedReader, Function1 function1) throws IOException {
        try {
            Iterator it = new do5(new d82(bufferedReader, (byte) 2)).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vtp.v(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static Uri h() {
        return Uri.parse((String) N.MyM1rQdk());
    }

    public static final boolean i(char c) {
        return '0' <= c && c < ':';
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        if (r3 != r9) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015b, code lost:
    
        if (r3 == r9) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015d, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.uuk r17, eyi r18, defpackage.ro9 r19, defpackage.fmg r20, z53 r21) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgh.j(uuk, eyi, ro9, fmg, z53):java.lang.Object");
    }

    public static b0g k(String str) {
        int i;
        if (StringsKt.J(str) < 0) {
            b0g.b.getClass();
            return a0g.b;
        }
        a0g a0gVar = b0g.b;
        e0g e0gVarH = z4o.h();
        int length = str.length() - 1;
        int i2 = 0;
        int i3 = -1;
        if (length >= 0) {
            int i4 = 0;
            i = 0;
            int i5 = -1;
            while (i2 != 1000) {
                char cCharAt = str.charAt(i4);
                if (cCharAt == '&') {
                    c(e0gVarH, str, i, i5, i4);
                    i = i4 + 1;
                    i2++;
                    i5 = -1;
                } else if (cCharAt == '=' && i5 == -1) {
                    i5 = i4;
                }
                if (i4 != length) {
                    i4++;
                } else {
                    i3 = i5;
                }
            }
            return new g0g(((eik) e0gVarH).b, true);
        }
        i = 0;
        if (i2 != 1000) {
            c(e0gVarH, str, i, i3, str.length());
        }
        return new g0g(((eik) e0gVarH).b, true);
    }

    public static final String l(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        return stringWriter.toString();
    }

    public static final String m(int i, String str) {
        int iK;
        CharSequence charSequenceSubSequence;
        if (str.length() >= i + 12 && StringsKt.F("+-", str.charAt(0)) && (iK = StringsKt.K(str, '-', 1, 4)) >= 12) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (str.charAt(i3) != '0') {
                    break;
                }
                i2 = i3;
            }
            if (iK - i2 < 12) {
                int i4 = iK - 10;
                if (i4 < 1) {
                    h9o.u(p3p.i(i4, "End index (", ") is less than start index (1)."));
                    return null;
                }
                if (i4 == 1) {
                    charSequenceSubSequence = str.subSequence(0, str.length());
                } else {
                    StringBuilder sb = new StringBuilder(str.length() - (iK - 11));
                    sb.append((CharSequence) str, 0, 1);
                    sb.append((CharSequence) str, i4, str.length());
                    charSequenceSubSequence = sb;
                }
                return charSequenceSubSequence.toString();
            }
        }
        return str;
    }

    public static x7m n(x7m x7mVar, String[] strArr, Map map) {
        int i = 0;
        if (x7mVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (x7m) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                x7m x7mVar2 = new x7m();
                int length = strArr.length;
                while (i < length) {
                    x7mVar2.a((x7m) map.get(strArr[i]));
                    i++;
                }
                return x7mVar2;
            }
        } else if (strArr != null) {
            if (strArr.length == 1) {
                x7mVar.a((x7m) map.get(strArr[0]));
                return x7mVar;
            }
            if (strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    x7mVar.a((x7m) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return x7mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (r15 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(defpackage.uuk r12, defpackage.mgl r13, defpackage.fmg r14, z53 r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgh.o(uuk, mgl, fmg, z53):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bf, code lost:
    
        if (r14 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(defpackage.uuk r10, defpackage.mgl r11, defpackage.fmg r12, int r13, z53 r14) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgh.p(uuk, mgl, fmg, int, z53):java.lang.Object");
    }

    public static final int q(int i, int i2, String str) {
        while (i2 > i && CharsKt.c(str.charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    public static final int r(int i, int i2, String str) {
        while (i < i2 && CharsKt.c(str.charAt(i))) {
            i++;
        }
        return i;
    }
}
