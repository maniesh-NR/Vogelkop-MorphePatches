package defpackage;

import ads_mobile_sdk.fo;
import ads_mobile_sdk.i83;
import ads_mobile_sdk.lw0;
import ads_mobile_sdk.qr0;
import ads_mobile_sdk.vq;
import ads_mobile_sdk.wq;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Rect;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.opera.android.BrowserActivity;
import com.opera.android.IntentDispatcherActivity;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public abstract class w1h {
    public static void A(c04 c04Var, CharSequence charSequence) {
        long j;
        long j2;
        int length = charSequence.length();
        Charsets charsets = Charsets.a;
        String string = charSequence.toString();
        wyh.k(string.length(), 0L, length);
        int i = 0;
        while (i < length) {
            nqh nqhVar = new nqh();
            char cCharAt = string.charAt(i);
            nqhVar.a = cCharAt;
            if (cCharAt < 128) {
                cxi cxiVarR = c04Var.r(1);
                byte[] bArr = cxiVarR.a;
                int i2 = -i;
                int iMin = Math.min(length, cxiVarR.a() + i);
                bArr[cxiVarR.c + i + i2] = (byte) nqhVar.a;
                i++;
                while (i < iMin) {
                    char cCharAt2 = string.charAt(i);
                    nqhVar.a = cCharAt2;
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[cxiVarR.c + i + i2] = (byte) cCharAt2;
                    i++;
                }
                int i3 = i2 + i;
                if (i3 == 1) {
                    cxiVarR.c += i3;
                    c04Var.c += i3;
                } else {
                    if (i3 < 0 || i3 > cxiVarR.a()) {
                        StringBuilder sbO = p3p.o(i3, "Invalid number of bytes written: ", ". Should be in 0..");
                        sbO.append(cxiVarR.a());
                        throw new IllegalStateException(sbO.toString().toString());
                    }
                    if (i3 != 0) {
                        cxiVarR.c += i3;
                        c04Var.c += i3;
                    } else if (cxiVarR.b() == 0) {
                        c04Var.n();
                    }
                }
            } else {
                if (cCharAt < 2048) {
                    cxi cxiVarR2 = c04Var.r(2);
                    int i4 = nqhVar.a;
                    byte b = (byte) ((i4 >> 6) | 192);
                    byte b2 = (byte) ((i4 & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                    byte[] bArr2 = cxiVarR2.a;
                    int i5 = cxiVarR2.c;
                    bArr2[i5] = b;
                    bArr2[i5 + 1] = b2;
                    cxiVarR2.c = i5 + 2;
                    j = c04Var.c;
                    j2 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    cxi cxiVarR3 = c04Var.r(3);
                    int i6 = nqhVar.a;
                    byte b3 = (byte) ((i6 >> 12) | 224);
                    byte b4 = (byte) (((i6 >> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                    byte b5 = (byte) ((i6 & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                    byte[] bArr3 = cxiVarR3.a;
                    int i7 = cxiVarR3.c;
                    bArr3[i7] = b3;
                    bArr3[i7 + 1] = b4;
                    bArr3[i7 + 2] = b5;
                    cxiVarR3.c = i7 + 3;
                    j = c04Var.c;
                    j2 = 3;
                } else {
                    int i8 = i + 1;
                    char cCharAt3 = i8 < length ? string.charAt(i8) : (char) 0;
                    int i9 = nqhVar.a;
                    if (i9 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        c04Var.D((byte) 63);
                        i = i8;
                    } else {
                        int i10 = (((i9 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        cxi cxiVarR4 = c04Var.r(4);
                        byte b6 = (byte) ((i10 >> 18) | 240);
                        byte b7 = (byte) (((i10 >> 12) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                        byte b8 = (byte) (((i10 >> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                        byte b9 = (byte) ((i10 & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                        byte[] bArr4 = cxiVarR4.a;
                        int i11 = cxiVarR4.c;
                        bArr4[i11] = b6;
                        bArr4[i11 + 1] = b7;
                        bArr4[i11 + 2] = b8;
                        bArr4[i11 + 3] = b9;
                        cxiVarR4.c = i11 + 4;
                        c04Var.c += 4;
                        i += 2;
                    }
                }
                c04Var.c = j + j2;
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.c8e r26, defpackage.ue5 r27, defpackage.ue5 r28, defpackage.ue5 r29, defpackage.ue5 r30, int r31, long r32, long r34, defpackage.tlm r36, defpackage.ue5 r37, defpackage.ih5 r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w1h.a(c8e, ue5, ue5, ue5, ue5, int, long, long, tlm, ue5, ih5, int, int):void");
    }

    public static final void b(final int i, ue5 ue5Var, ue5 ue5Var2, ue5 ue5Var3, ue5 ue5Var4, final g2o g2oVar, ue5 ue5Var5, ih5 ih5Var, int i2) {
        int i3;
        int i4;
        int i5;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-280287501);
        int i6 = i2 | (vt9Var.d(i) ? 4 : 2) | (vt9Var.h(ue5Var) ? 32 : 16) | (vt9Var.h(ue5Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.h(ue5Var3) ? 2048 : 1024) | (vt9Var.h(ue5Var4) ? 16384 : 8192) | (vt9Var.f(g2oVar) ? 131072 : 65536) | (vt9Var.h(ue5Var5) ? 1048576 : 524288);
        if (vt9Var.N(i6 & 1, (599187 & i6) != 599186)) {
            Object objK = vt9Var.K();
            Object obj = hh5.a;
            if (objK == obj) {
                objK = new ili();
                vt9Var.g0(objK);
            }
            final ili iliVar = (ili) objK;
            boolean z = (i6 & 112) == 32;
            Object objK2 = vt9Var.K();
            byte b = 5;
            if (z || objK2 == obj) {
                objK2 = new ue5(605195056, new jk4(ue5Var, b), true);
                vt9Var.g0(objK2);
            }
            final Function2 function2 = (Function2) objK2;
            boolean z2 = (i6 & 7168) == 2048;
            Object objK3 = vt9Var.K();
            if (z2 || objK3 == obj) {
                objK3 = new ue5(418899191, new jk4(ue5Var3, (byte) 4), true);
                vt9Var.g0(objK3);
            }
            final Function2 function22 = (Function2) objK3;
            boolean z3 = (57344 & i6) == 16384;
            Object objK4 = vt9Var.K();
            if (z3 || objK4 == obj) {
                objK4 = new ue5(338600263, new jk4(ue5Var4, (byte) 3), true);
                vt9Var.g0(objK4);
            }
            final Function2 function23 = (Function2) objK4;
            boolean z4 = (i6 & 896) == 256;
            Object objK5 = vt9Var.K();
            if (z4 || objK5 == obj) {
                i3 = i6;
                objK5 = new ue5(-1776388365, new ub3(ue5Var2, (Object) iliVar, (byte) 5), true);
                vt9Var.g0(objK5);
            } else {
                i3 = i6;
            }
            final Function2 function24 = (Function2) objK5;
            boolean z5 = (i3 & 3670016) == 1048576;
            Object objK6 = vt9Var.K();
            if (z5 || objK6 == obj) {
                objK6 = new ue5(-1731662488, new jk4(ue5Var5, (byte) 2), true);
                vt9Var.g0(objK6);
            }
            final Function2 function25 = (Function2) objK6;
            boolean zF = ((i3 & 458752) == 131072) | vt9Var.f(function2) | vt9Var.f(function22) | vt9Var.f(function23) | ((i3 & 14) == 4) | vt9Var.f(function25) | vt9Var.f(function24);
            Object objK7 = vt9Var.K();
            if (zF || objK7 == obj) {
                i4 = 0;
                i5 = 1;
                Object obj2 = new Function2() { // from class: eli
                    public final Object invoke(Object obj3, Object obj4) {
                        int i7;
                        int iM;
                        int iM2;
                        fr frVar;
                        Integer numValueOf;
                        int i8;
                        int iIntValue;
                        int iM3;
                        int iC;
                        final ikk ikkVar = (ikk) obj3;
                        yo5 yo5Var = (yo5) obj4;
                        final int iH = yo5.h(yo5Var.a);
                        final int iG = yo5.g(yo5Var.a);
                        long jA = yo5.a(0, 0, 0, 0, 10, yo5Var.a);
                        d2c layoutDirection = ikkVar.getLayoutDirection();
                        final g2o g2oVar2 = g2oVar;
                        int iD = g2oVar2.d(ikkVar, layoutDirection);
                        int iB = g2oVar2.b(ikkVar, ikkVar.getLayoutDirection());
                        int iC2 = g2oVar2.c(ikkVar);
                        final ifg ifgVarN = ((pfd) CollectionsKt.K(ikkVar.i(jli.a, function2))).N(jA);
                        int i9 = (-iD) - iB;
                        int i10 = -iC2;
                        final ifg ifgVarN2 = ((pfd) CollectionsKt.K(ikkVar.i(jli.c, function22))).N(ap5.i(i9, i10, jA));
                        final ifg ifgVarN3 = ((pfd) CollectionsKt.K(ikkVar.i(jli.d, function23))).N(ap5.i(i9, i10, jA));
                        int i11 = ifgVarN3.a;
                        byte b2 = i;
                        if (i11 == 0 && ifgVarN3.b == 0) {
                            frVar = null;
                        } else {
                            int i12 = ifgVarN3.b;
                            if (b2 == 0) {
                                i7 = iD;
                                if (ikkVar.getLayoutDirection() == d2c.a) {
                                    iM = ikkVar.M(16.0f);
                                    iM2 = iM + i7;
                                    frVar = new fr(iM2, i12, (byte) 7);
                                } else {
                                    iM2 = ((iH - ikkVar.M(16.0f)) - i11) - iB;
                                    frVar = new fr(iM2, i12, (byte) 7);
                                }
                            } else {
                                i7 = iD;
                                if (b2 != 2 && b2 != 3) {
                                    iM2 = (((iH - i11) + i7) - iB) / 2;
                                } else if (ikkVar.getLayoutDirection() == d2c.a) {
                                    iM2 = ((iH - ikkVar.M(16.0f)) - i11) - iB;
                                } else {
                                    iM = ikkVar.M(16.0f);
                                    iM2 = iM + i7;
                                }
                                frVar = new fr(iM2, i12, (byte) 7);
                            }
                        }
                        final ifg ifgVarN4 = ((pfd) CollectionsKt.K(ikkVar.i(jli.e, function25))).N(jA);
                        boolean z6 = ifgVarN4.a == 0 && ifgVarN4.b == 0;
                        if (frVar != null) {
                            int i13 = frVar.c;
                            if (z6 || b2 == 3) {
                                iM3 = ikkVar.M(16.0f) + i13;
                                iC = g2oVar2.c(ikkVar);
                            } else {
                                iM3 = ifgVarN4.b + i13;
                                iC = ikkVar.M(16.0f);
                            }
                            numValueOf = Integer.valueOf(iC + iM3);
                        } else {
                            numValueOf = null;
                        }
                        int i14 = ifgVarN2.b;
                        if (i14 != 0) {
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            } else {
                                Integer numValueOf2 = Integer.valueOf(ifgVarN4.b);
                                if (z6) {
                                    numValueOf2 = null;
                                }
                                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : g2oVar2.c(ikkVar);
                            }
                            i8 = i14 + iIntValue;
                        } else {
                            i8 = 0;
                        }
                        aab aabVar = new aab(g2oVar2, ikkVar);
                        final fr frVar2 = frVar;
                        iliVar.a.setValue(new zvf(a26.q(aabVar, ikkVar.getLayoutDirection()), (ifgVarN.a == 0 && ifgVarN.b == 0) ? aabVar.d() : ikkVar.j0(ifgVarN.b), a26.p(aabVar, ikkVar.getLayoutDirection()), z6 ? aabVar.a() : ikkVar.j0(ifgVarN4.b)));
                        final ifg ifgVarN5 = ((pfd) CollectionsKt.K(ikkVar.i(jli.b, function24))).N(jA);
                        final Integer num = numValueOf;
                        final int i15 = i8;
                        return ikkVar.b0(iH, iG, n08.a, new Function1() { // from class: gli
                            public final Object invoke(Object obj5) {
                                p1d p1dVar = (p1d) obj5;
                                p1d.f(p1dVar, ifgVarN5, 0, 0);
                                p1d.f(p1dVar, ifgVarN, 0, 0);
                                ifg ifgVar = ifgVarN2;
                                int i16 = iH - ifgVar.a;
                                ikk ikkVar2 = ikkVar;
                                d2c layoutDirection2 = ikkVar2.getLayoutDirection();
                                g2o g2oVar3 = g2oVar2;
                                int iD2 = ((g2oVar3.d(ikkVar2, layoutDirection2) + i16) - g2oVar3.b(ikkVar2, ikkVar2.getLayoutDirection())) / 2;
                                int i17 = iG;
                                p1d.f(p1dVar, ifgVar, iD2, i17 - i15);
                                ifg ifgVar2 = ifgVarN4;
                                p1d.f(p1dVar, ifgVar2, 0, i17 - ifgVar2.b);
                                fr frVar3 = frVar2;
                                if (frVar3 != null) {
                                    p1d.f(p1dVar, ifgVarN3, frVar3.b, i17 - num.intValue());
                                }
                                return Unit.a;
                            }
                        });
                    }
                };
                vt9Var.g0(obj2);
                objK7 = obj2;
            } else {
                i4 = 0;
                i5 = 1;
            }
            dkk.a(null, (Function2) objK7, vt9Var, i4, i5);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fli(i, ue5Var, ue5Var2, ue5Var3, ue5Var4, g2oVar, ue5Var5, i2);
        }
    }

    public static long c(prb prbVar, prb prbVar2, lw0 lw0Var, long j) throws Exception {
        try {
            try {
                on7 on7Var = pn7.b;
                return cs5.y0(prbVar.u(String.valueOf(lw0Var.getNumber())).j(), un7.d);
            } catch (Exception unused) {
                on7 on7Var2 = pn7.b;
                return cs5.y0(prbVar2.u(String.valueOf(lw0Var.getNumber())).j(), un7.d);
            }
        } catch (Exception unused2) {
            if (vq.a == wq.a) {
                return j;
            }
            throw new Exception("No default value for signal: " + lw0Var);
        }
    }

    public static long d(qr0 qr0Var, lw0 lw0Var) {
        qr0Var.getClass();
        prb prbVar = qr0.C;
        return c((prb) qr0Var.a("gads:signal_source_timeouts_ms", prbVar, fo.a$13), prbVar, lw0Var, i83.c.a);
    }

    public static String e(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static boolean f(prb prbVar, prb prbVar2, lw0 lw0Var) throws Exception {
        try {
            try {
                return prbVar.u(String.valueOf(lw0Var.getNumber())).c();
            } catch (Exception unused) {
                if (vq.a == wq.a) {
                    return false;
                }
                throw new Exception("No default value for signal: " + lw0Var);
            }
        } catch (Exception unused2) {
            return prbVar2.u(String.valueOf(lw0Var.getNumber())).c();
        }
    }

    public static void g(Spannable spannable, Object obj, int i, int i2) {
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == 33) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i2, 33);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(z1h r5, kotlin.jvm.functions.Function0 r6, mt5 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.v1h
            if (r0 == 0) goto L13
            r0 = r7
            v1h r0 = (defpackage.v1h) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            v1h r0 = new v1h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.u
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            kotlin.jvm.functions.Function0 r6 = r0.t
            defpackage.ybh.y(r7)     // Catch: java.lang.Throwable -> L66
            goto L60
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L30:
            defpackage.ybh.y(r7)
            kotlin.coroutines.CoroutineContext r7 = r0.getContext()
            ulp r2 = defpackage.ulp.h
            kotlin.coroutines.CoroutineContext$Element r7 = r7.get(r2)
            if (r7 != r5) goto L6b
            r0.t = r6     // Catch: java.lang.Throwable -> L66
            r0.v = r4     // Catch: java.lang.Throwable -> L66
            nh4 r7 = new nh4     // Catch: java.lang.Throwable -> L66
            mt5 r0 = hib.b(r0)     // Catch: java.lang.Throwable -> L66
            r7.<init>(r4, r0)     // Catch: java.lang.Throwable -> L66
            r7.s()     // Catch: java.lang.Throwable -> L66
            v91 r0 = new v91     // Catch: java.lang.Throwable -> L66
            r2 = 9
            r0.<init>(r7, r2)     // Catch: java.lang.Throwable -> L66
            r5.a(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.Object r5 = r7.q()     // Catch: java.lang.Throwable -> L66
            if (r5 != r1) goto L60
            return r1
        L60:
            r6.invoke()
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L66:
            r5 = move-exception
            r6.invoke()
            throw r5
        L6b:
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            qp2.n(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w1h.h(z1h, kotlin.jvm.functions.Function0, mt5):java.lang.Object");
    }

    public static nhj i(ContextWrapper contextWrapper, Locale locale) {
        Context contextH = wwc.h(contextWrapper, locale);
        nhj nhjVar = new nhj();
        nhjVar.a = contextH;
        nhjVar.b = "uninstall";
        nhjVar.h = IconCompat.c(2131820551, contextH);
        nhjVar.e = contextH.getString(2132022245);
        nhjVar.l = 0;
        nhjVar.c = new Intent[]{new Intent().setAction("com.opera.android.action.UNINSTALL_SHORTCUT").setPackage(contextWrapper.getPackageName()).setClass(contextWrapper, IntentDispatcherActivity.class)};
        if (TextUtils.isEmpty(nhjVar.e)) {
            qp2.o("Shortcut must have a non-empty label");
            return null;
        }
        Intent[] intentArr = nhjVar.c;
        if (intentArr != null && intentArr.length != 0) {
            return nhjVar;
        }
        qp2.o("Shortcut must have an intent");
        return null;
    }

    public static View j(int i, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static final String k(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static b59 l(Context context, tcl tclVar, String str, bg1... bg1VarArr) {
        b59 b59Var = new b59(context.getApplicationContext(), str, (byte) 2);
        if (bg1VarArr.length > 0) {
            b59Var.a(new sz5((byte) 3));
            for (bg1 bg1Var : bg1VarArr) {
                b59Var.a(bg1Var);
            }
        }
        if (b59Var.c()) {
            return b59Var;
        }
        vx vxVar = new vx(b59Var, (byte) 21);
        tclVar.getClass();
        umi umiVar = (umi) tclVar;
        new nml(umiVar, new crk(vxVar, (byte) 8), umiVar.c).a((Object) null);
        return b59Var;
    }

    public static HashSet m(SharedPreferences sharedPreferences, String str) {
        Set<String> stringSet = sharedPreferences.getStringSet(str, null);
        return stringSet == null ? new HashSet() : new HashSet(stringSet);
    }

    public static mlm n(ContextWrapper contextWrapper) {
        List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) contextWrapper.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            nhj nhjVar = (nhj) new mhj(contextWrapper, it.next()).a;
            if (TextUtils.isEmpty(nhjVar.e)) {
                qp2.o("Shortcut must have a non-empty label");
                return null;
            }
            Intent[] intentArr = nhjVar.c;
            if (intentArr == null || intentArr.length == 0) {
                qp2.o("Shortcut must have an intent");
                return null;
            }
            arrayList.add(nhjVar);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nhj nhjVar2 = (nhj) obj;
            if (Intrinsics.a(nhjVar2.b, "uninstall")) {
                return new mlm(true, nhjVar2.n);
            }
        }
        return new mlm(false, false);
    }

    public static Set o(SharedPreferences sharedPreferences, String str, Set set) {
        Set<String> stringSet = sharedPreferences.getStringSet(str, set);
        return stringSet == null ? stringSet : Collections.unmodifiableSet(stringSet);
    }

    public static final void r(BrowserActivity browserActivity, BrowserActivity browserActivity2, umi umiVar, cq5 cq5Var) {
        xf8.u(cq5Var).j(browserActivity2, new glm(new nfh(browserActivity, umiVar, (byte) 1), (byte) 2));
    }

    public static final Object s(Object[] objArr, c67 c67Var, Function0 function0, ih5 ih5Var, int i) {
        Object[] objArr2;
        c67 c67Var2;
        Object obj;
        Object objE;
        vt9 vt9Var = (vt9) ih5Var;
        String string = Long.toString(vt9Var.T, CharsKt.checkRadix(36));
        vji vjiVar = (vji) vt9Var.j(xji.a);
        Object objK = vt9Var.K();
        zpa zpaVar = hh5.a;
        if (objK == zpaVar) {
            Object objInvoke = (vjiVar == null || (objE = vjiVar.e(string)) == null) ? null : c67Var.b.invoke(objE);
            if (objInvoke == null) {
                objInvoke = function0.invoke();
            }
            objArr2 = objArr;
            c67Var2 = c67Var;
            rji rjiVar = new rji(c67Var2, vjiVar, string, objInvoke, objArr2);
            vt9Var.g0(rjiVar);
            objK = rjiVar;
        } else {
            objArr2 = objArr;
            c67Var2 = c67Var;
        }
        rji rjiVar2 = (rji) objK;
        Object objInvoke2 = Arrays.equals(objArr2, rjiVar2.e) ? rjiVar2.d : null;
        if (objInvoke2 == null) {
            objInvoke2 = function0.invoke();
        }
        boolean zH = vt9Var.h(rjiVar2) | vt9Var.h(c67Var2) | vt9Var.h(vjiVar) | vt9Var.f(string) | vt9Var.h(objInvoke2) | vt9Var.h(objArr2);
        Object objK2 = vt9Var.K();
        if (zH || objK2 == zpaVar) {
            Object[] objArr3 = objArr2;
            obj = objInvoke2;
            kkc kkcVar = new kkc(rjiVar2, c67Var2, vjiVar, string, obj, objArr3, (byte) 2);
            vt9Var.g0(kkcVar);
            objK2 = kkcVar;
        } else {
            obj = objInvoke2;
        }
        rm5.L(vt9Var, (Function0) objK2);
        return obj;
    }

    public static final Object t(Object[] objArr, Function0 function0, ih5 ih5Var) {
        return s(Arrays.copyOf(objArr, objArr.length), vki.a, function0, ih5Var, 3456);
    }

    public static final Object u(Object[] objArr, c67 c67Var, Function0 function0, ih5 ih5Var, int i) {
        return s(Arrays.copyOf(objArr, objArr.length), c67Var, function0, ih5Var, 384 | ((i << 3) & 7168));
    }

    public static boolean y(Context context, Rect rect) {
        int iOrdinal = ddh.s(rect.height(), context).ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            h9o.p();
        }
        return false;
    }

    public static final byte[] z(String str, Charset charset) {
        Charset charset2 = Charsets.UTF_8;
        return Intrinsics.a(charset, charset2) ? str.getBytes(charset2) : w7d.s(charset.newEncoder(), str, 0, str.length());
    }

    public abstract void p(int i);

    public abstract boolean q();

    public abstract void v(boolean z);

    public abstract void w(boolean z);

    public abstract void x();
}
