package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.opera.android.OperaApplication;
import com.opera.android.search.behavior.ScrollableToolbarBehavior;
import com.opera.api.Callback;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.TreeSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class b8h {
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.cm a(java.lang.Throwable r5) {
        /*
            boolean r0 = r5 instanceof vjo
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L80
            r0 = r5
            vjo r0 = (vjo) r0
            int r0 = r0.a
            r3 = 1001(0x3e9, float:1.403E-42)
            if (r0 == r3) goto L71
            r3 = 1002(0x3ea, float:1.404E-42)
            if (r0 == r3) goto L71
            r3 = 9006(0x232e, float:1.262E-41)
            if (r0 == r3) goto L71
            if (r0 == r2) goto L80
            if (r0 == 0) goto L69
            r3 = 1
            if (r0 == r3) goto L5a
            r4 = 2
            if (r0 == r4) goto L5a
            switch(r0) {
                case 100: goto L4b;
                case 101: goto L3c;
                case 102: goto L2e;
                case 103: goto L5a;
                case 104: goto L2e;
                case 105: goto L4b;
                case 106: goto L4b;
                default: goto L24;
            }
        L24:
            switch(r0) {
                case 9000: goto L71;
                case 9001: goto L71;
                case 9002: goto L71;
                case 9003: goto L71;
                case 9004: goto L71;
                default: goto L27;
            }
        L27:
            switch(r0) {
                case 9008: goto L71;
                case 9009: goto L71;
                case 9010: goto L71;
                case 9011: goto L71;
                case 9012: goto L71;
                default: goto L2a;
            }
        L2a:
            switch(r0) {
                case 9100: goto L4b;
                case 9101: goto L3c;
                case 9102: goto L71;
                case 9103: goto L3c;
                default: goto L2d;
            }
        L2d:
            goto L80
        L2e:
            java.lang.String r5 = r5.getMessage()
            cm r0 = new cm
            if (r5 != 0) goto L38
            java.lang.String r5 = "Illegal call to SDK API."
        L38:
            r0.<init>(r3, r5, r1)
            return r0
        L3c:
            java.lang.String r5 = r5.getMessage()
            cm r0 = new cm
            if (r5 != 0) goto L46
            java.lang.String r5 = "No suitable ad."
        L46:
            r2 = 5
            r0.<init>(r2, r5, r1)
            return r0
        L4b:
            java.lang.String r5 = r5.getMessage()
            cm r0 = new cm
            if (r5 != 0) goto L55
            java.lang.String r5 = "Network error!"
        L55:
            r2 = 4
            r0.<init>(r2, r5, r1)
            return r0
        L5a:
            java.lang.String r5 = r5.getMessage()
            cm r0 = new cm
            if (r5 != 0) goto L64
            java.lang.String r5 = "Sdk initialization error."
        L64:
            r2 = 6
            r0.<init>(r2, r5, r1)
            return r0
        L69:
            cm r5 = new cm
            java.lang.String r0 = "Should not happen!"
            r5.<init>(r2, r0, r1)
            return r5
        L71:
            java.lang.String r5 = r5.getMessage()
            cm r0 = new cm
            if (r5 != 0) goto L7b
            java.lang.String r5 = "Assets error!"
        L7b:
            r2 = 3
            r0.<init>(r2, r5, r1)
            return r0
        L80:
            java.lang.String r5 = r5.getMessage()
            cm r0 = new cm
            if (r5 != 0) goto L8a
            java.lang.String r5 = "Unknown error!"
        L8a:
            r0.<init>(r2, r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8h.a(java.lang.Throwable):cm");
    }

    public static n63 b(boolean z) {
        if (!z) {
            return n63.a;
        }
        k63 k63Var = n63.b;
        return ((m63) k63Var).e == null ? k63Var : k63Var.h(((m63) k63Var).d, (Character) null);
    }

    public static byte[] c(String str, boolean z) {
        byte[] bArrA = b(z).a(str);
        if (bArrA.length != 0 || str.length() <= 0) {
            return bArrA;
        }
        qp2.o("Unable to decode ".concat(str));
        return null;
    }

    public static final h42 d(ekc ekcVar) {
        h42 h42Var;
        lqh lqhVar = new lqh();
        lqhVar.a = true;
        if (ekcVar.i()) {
            lqhVar.a = false;
            h42Var = new h42(ekcVar.g());
        } else {
            h42Var = new h42();
        }
        h42Var.s(ekcVar, new t7d(new gil((Object) h42Var, (Object) lqhVar, (byte) 7), (byte) 26));
        return h42Var;
    }

    public static final rki e(View view) {
        while (view != null) {
            Object tag = view.getTag(2131365020);
            rki rkiVar = tag instanceof rki ? (rki) tag : null;
            if (rkiVar != null) {
                return rkiVar;
            }
            Object objH = y7h.h(view);
            view = objH instanceof View ? (View) objH : null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.cm g(java.net.URI r4) {
        /*
            r0 = 0
            r1 = -1
            java.net.Proxy r2 = java.net.Proxy.NO_PROXY     // Catch: java.lang.Exception -> L44
            java.net.ProxySelector r3 = java.net.ProxySelector.getDefault()     // Catch: java.lang.IllegalArgumentException -> L14 java.lang.Exception -> L44
            java.util.List r4 = r3.select(r4)     // Catch: java.lang.IllegalArgumentException -> L14 java.lang.Exception -> L44
            r3 = 0
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.IllegalArgumentException -> L14 java.lang.Exception -> L44
            java.net.Proxy r4 = (java.net.Proxy) r4     // Catch: java.lang.IllegalArgumentException -> L14 java.lang.Exception -> L44
            r2 = r4
        L14:
            if (r2 == 0) goto L44
            java.net.Proxy$Type r4 = r2.type()     // Catch: java.lang.Exception -> L44
            java.net.Proxy$Type r3 = java.net.Proxy.Type.HTTP     // Catch: java.lang.Exception -> L44
            if (r4 != r3) goto L44
            java.net.SocketAddress r4 = r2.address()     // Catch: java.lang.Exception -> L44
            boolean r4 = r4 instanceof java.net.InetSocketAddress     // Catch: java.lang.Exception -> L44
            if (r4 == 0) goto L44
            java.net.SocketAddress r4 = r2.address()     // Catch: java.lang.Exception -> L44
            java.net.InetSocketAddress r4 = (java.net.InetSocketAddress) r4     // Catch: java.lang.Exception -> L44
            boolean r2 = r4.isUnresolved()     // Catch: java.lang.Exception -> L44
            if (r2 == 0) goto L37
            java.lang.String r2 = r4.getHostName()     // Catch: java.lang.Exception -> L44
            goto L3f
        L37:
            java.net.InetAddress r2 = r4.getAddress()     // Catch: java.lang.Exception -> L44
            java.lang.String r2 = r2.getHostAddress()     // Catch: java.lang.Exception -> L44
        L3f:
            int r4 = r4.getPort()     // Catch: java.lang.Exception -> L45
            goto L46
        L44:
            r2 = r0
        L45:
            r4 = r1
        L46:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L58
            if (r4 == r1) goto L50
            if (r4 != 0) goto L52
        L50:
            r4 = 80
        L52:
            cm r0 = new cm
            r1 = 7
            r0.<init>(r2, r4, r1)
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8h.g(java.net.URI):cm");
    }

    public static ScrollableToolbarBehavior h(View view) {
        qv5 layoutParams = view.getLayoutParams();
        qv5 qv5Var = layoutParams instanceof qv5 ? layoutParams : null;
        if (qv5Var != null) {
            nv5 nv5Var = qv5Var.a;
            ScrollableToolbarBehavior scrollableToolbarBehavior = nv5Var instanceof ScrollableToolbarBehavior ? (ScrollableToolbarBehavior) nv5Var : null;
            if (scrollableToolbarBehavior != null) {
                return scrollableToolbarBehavior;
            }
        }
        return null;
    }

    public static byte[] i(int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i < byteArray.length) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, byteArray.length - i, bArr, 0, i);
            return bArr;
        }
        if (i <= byteArray.length) {
            return byteArray;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
        return bArr2;
    }

    public static final h42 j(ekc ekcVar, Function1 function1) {
        h42 h42Var = ekcVar.i() ? new h42(function1.invoke(ekcVar.g())) : new h42();
        h42Var.s(ekcVar, new t7d(new gil((Object) h42Var, (Object) function1, (byte) 8), (byte) 26));
        return h42Var;
    }

    public static void k(mil milVar, cy cyVar, njl njlVar, b2c b2cVar, djl djlVar, boolean z, i9f i9fVar) {
        if (z) {
            int i = i9fVar.i(xjl.e(milVar.b));
            String str = wgl.a;
            voh vohVarB = i < njlVar.a.a.b.length() ? njlVar.b(i) : i != 0 ? njlVar.b(i - 1) : new voh(0.0f, 0.0f, 1.0f, (int) (wgl.a((ikl) cyVar.c, (n27) cyVar.d, (mh9) cyVar.e) & 4294967295L));
            float f = vohVarB.b;
            float f2 = vohVarB.a;
            long jU = b2cVar.U((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            voh vohVarA = bwg.a((Float.floatToRawIntBits(Float.intBitsToFloat((int) (jU >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jU & 4294967295L))) & 4294967295L), (Float.floatToRawIntBits(vohVarB.c - f2) << 32) | (Float.floatToRawIntBits(vohVarB.d - f) & 4294967295L));
            if (Intrinsics.a((djl) djlVar.a.b.get(), djlVar)) {
                djlVar.b.g(vohVarA);
            }
        }
    }

    public static s6h l(String str) {
        try {
            if (str.length() != 0) {
                orb orbVar = new orb(str);
                return new s6h(qyn.J(orbVar, "active"), qyn.J(orbVar, "expired"), false);
            }
            a1b a1bVar = h1b.b;
            csh cshVar = csh.e;
            return new s6h(cshVar, cshVar, false);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final void m(Context context, Callback callback) {
        try {
            Intent intentAddCategory = new Intent("android.intent.action.GET_CONTENT").setType("image/*").addCategory("android.intent.category.OPENABLE");
            ((hjf) oi.d(context)).D(intentAddCategory, new qj2(callback, (byte) 13));
        } catch (ActivityNotFoundException unused) {
            az0 az0Var = new az0(context);
            az0Var.a(2132019060);
            az0Var.setNegativeButton(2132020155, (DialogInterface.OnClickListener) null).c();
        }
    }

    public static void n(OperaApplication operaApplication) {
        String[] strArr;
        TreeSet treeSet = new TreeSet();
        PackageInfo packageInfoU = r9n.u(operaApplication, operaApplication.getPackageName(), 0L);
        if (packageInfoU != null && (strArr = packageInfoU.splitNames) != null) {
            treeSet.addAll(Arrays.asList(strArr));
        }
        TreeSet treeSet2 = new TreeSet();
        treeSet2.addAll(operaApplication.K().h());
        treeSet2.removeAll(treeSet);
        ks3.I(36, treeSet.isEmpty() ? "<none>" : TextUtils.join(",", treeSet).replace('.', '$'));
        ks3.I(32, treeSet2.isEmpty() ? "<none>" : TextUtils.join(",", treeSet2).replace('.', '$'));
    }

    public final Drawable f(Context context) {
        if (this instanceof mxh) {
            return ((mxh) this).a;
        }
        if (this instanceof lxh) {
            return w8h.u(((lxh) this).a, context);
        }
        h9o.p();
        return null;
    }
}
