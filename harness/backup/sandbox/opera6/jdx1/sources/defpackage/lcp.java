package defpackage;

import ads_mobile_sdk.bw2;
import ads_mobile_sdk.c13;
import ads_mobile_sdk.ob3;
import ads_mobile_sdk.pd;
import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.opera.android.browser.BrowserUtils;
import com.usercentrics.sdk.ui.components.UCImageView;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class lcp implements SessionManagerListener {
    public static bxk o = null;
    public static int q = 99;
    public static String r;
    public static final Object[] a = new Object[0];
    public static final o5h b = new o5h("list-item-type");
    public static final o5h c = new o5h("bullet-list-item-level");
    public static final o5h d = new o5h("ordered-list-item-number");
    public static final o5h e = new o5h("heading-level");
    public static final o5h f = new o5h("link-destination");
    public static final o5h g = new o5h("paragraph-is-in-tight-list");
    public static final o5h h = new o5h("code-block-info");
    public static final xm5 i = new xm5(Boolean.TRUE);
    public static final int[] j = {R.attr.state_pressed};
    public static final int[] k = {R.attr.state_focused};
    public static final int[] l = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] m = {R.attr.state_selected};
    public static final Object n = new Object();
    public static final eko p = new eko(8);

    public static final void C(Context context, jzd jzdVar) {
        String str = jzdVar.a;
        String strK = sko.k("utm_source%3DOfA%26utm_medium%3D", str, "%26utm_campaign%3Dofa_to_gp");
        String strK2 = sko.k("https://cash.minipay.xyz/?campaign=ofa_to_minipay&medium=", str, "&source=OfA");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.opera.minipay");
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setAction("android.intent.action.VIEW");
            launchIntentForPackage.setData(Uri.parse(strK2));
            context.startActivity(launchIntentForPackage);
            return;
        }
        String strC = a26.C(strK2);
        if ("com.android.vending".equals(r9n.l(context))) {
            uup.y(context, "com.opera.minipay", strK, strC);
            return;
        }
        vx3 vx3VarA = ay3.a(p3p.w("https://play.google.com/store/apps/details?id=com.opera.minipay&referrer=", strK, "&url=", strC), lqm.D, false);
        vx3VarA.b = 1;
        o18.t(vx3VarA, true, vx3VarA);
    }

    public static void D(DataInputStream dataInputStream, long j2) throws IOException {
        while (j2 > 0) {
            long jSkip = dataInputStream.skip(j2);
            if (jSkip != 0) {
                j2 -= jSkip;
            } else {
                if (dataInputStream.read() < 0) {
                    s49.m("Trying to skip past EOF on InputStream");
                    return;
                }
                j2--;
            }
        }
    }

    public static ColorStateList E(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }

    public static void F(Context context, String str, boolean z) {
        ClipData clipDataNewPlainText = ClipData.newPlainText(null, str);
        if (z) {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", true);
            clipDataNewPlainText.getDescription().setExtras(persistableBundle);
        }
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
            if (Build.VERSION.SDK_INT >= 33) {
                return;
            }
            Toast.makeText(context, context.getString(2132018397), 0).show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void G(dx3 r3, android.net.Uri r4, boolean r5, com.opera.api.Callback r6) {
        /*
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT_TREE"
            r0.<init>(r1)
            boolean r1 = s29.g(r4)
            if (r1 == 0) goto L22
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 <= r2) goto L15
            if (r5 == 0) goto L35
        L15:
            java.io.File r5 = new java.io.File
            java.lang.String r4 = r4.getPath()
            r5.<init>(r4)
            android.net.Uri r4 = v61.a(r5)
        L22:
            boolean r5 = android.provider.DocumentsContract.isTreeUri(r4)
            if (r5 == 0) goto L30
            java.lang.String r5 = android.provider.DocumentsContract.getTreeDocumentId(r4)
            android.net.Uri r4 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r4, r5)
        L30:
            java.lang.String r5 = "android.provider.extra.INITIAL_URI"
            r0.putExtra(r5, r4)
        L35:
            java.lang.String r4 = "android.content.extra.SHOW_ADVANCED"
            r5 = 1
            r0.putExtra(r4, r5)
            qi r4 = r3.j
            mf7 r5 = new mf7
            r5.<init>(r3, r6)
            r3 = 0
            r4.t(r0, r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcp.G(dx3, android.net.Uri, boolean, com.opera.api.Callback):void");
    }

    public static final long H(long j2, float f2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    public static int I(String str, char c2, int i2, int i3) {
        while (i2 < i3) {
            if (str.charAt(i2) != c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int J(CharSequence charSequence, int i2, int i3) {
        while (i2 < i3) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final Object[] K(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                t3p.x();
                                return null;
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArrCopyOf, i3);
                    }
                    i2 = i3;
                }
            }
        }
        return a;
    }

    public static final Object[] L(Collection collection, Object[] objArr) {
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                t3p.x();
                                return null;
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final Bundle M(a98 a98Var) {
        return ic4.m(new Pair("ESIM_ATTRIBUTION_RESOLVED", Boolean.TRUE), new Pair("ESIM_SOURCE", a98Var.a), new Pair("ESIM_CAMPAIGN", a98Var.b));
    }

    public static void N(Parcel parcel, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i2);
        }
    }

    public static final void a(Boolean bool, qf5 qf5Var, ndc ndcVar, Function1 function1, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(696924721);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.h(bool) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(qf5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var.h(function1) ? 2048 : 1024;
        }
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            vt9Var.S();
            if ((i2 & 1) == 0 || vt9Var.x()) {
                ndcVar = (ndc) vt9Var.j(tuc.a);
            } else {
                vt9Var.Q();
            }
            int i4 = i3 & (-897);
            vt9Var.q();
            boolean zF = vt9Var.f(bool) | vt9Var.f(qf5Var) | vt9Var.f(ndcVar);
            Object objK = vt9Var.K();
            if (zF || objK == hh5.a) {
                objK = new vdc(ndcVar.getLifecycle());
                vt9Var.g0(objK);
            }
            b(ndcVar, (vdc) objK, function1, vt9Var, (i4 >> 3) & 896);
        } else {
            vt9Var.Q();
        }
        ndc ndcVar2 = ndcVar;
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fz0((Object) bool, (Object) qf5Var, (Object) ndcVar2, (br9) function1, i2, (byte) 5);
        }
    }

    public static final void b(ndc ndcVar, vdc vdcVar, Function1 function1, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(228371534);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.h(ndcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(vdcVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.h(function1) ? 256 : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            boolean zH = vt9Var.h(vdcVar) | ((i3 & 896) == 256) | vt9Var.h(ndcVar);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                objK = new yo7(ndcVar, vdcVar, function1, (byte) 11);
                vt9Var.g0(objK);
            }
            rm5.a(ndcVar, vdcVar, (Function1) objK, vt9Var);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ga1((Object) ndcVar, (Object) vdcVar, (Object) function1, i2, (byte) 10);
        }
    }

    public static final void c(long j2, Function0 function0, ih5 ih5Var, int i2) {
        int i3;
        Function0 function02 = function0;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1484368789);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.e(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(function02) ? 32 : 16;
        }
        int i4 = i3;
        byte b2 = 18;
        if (vt9Var.N(i4 & 1, (i4 & 19) != 18)) {
            i39 i39Var = mpj.a;
            c8e c8eVarX = a26.X(i39Var, 24.0f);
            db5 db5VarA = cb5.a(new x62(12.0f, false, new t40(b2)), rbe.n, vt9Var, 6);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarX);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z = vt9Var.S;
            fza fzaVar = m3c.S;
            if (z) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var, db5VarA, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var, oagVarL, ah5Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var3 = ujp.g;
            y4h.o(vt9Var, numValueOf, ah5Var3);
            y4h.m(vt9Var);
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var, c8eVarP, ah5Var4);
            String strQ = uyg.q((shk) ahk.L0.getValue(), vt9Var);
            hp7 hp7Var = abm.a;
            ijl.b(strQ, i39Var, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).f, vt9Var, 48, 0, 131068);
            ijl.b(uyg.q((shk) ahk.M0.getValue(), vt9Var), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).k, vt9Var, 0, 0, 131070);
            o9i o9iVarA = m9i.a(b72.a, rbe.l, vt9Var, 48);
            int iHashCode2 = Long.hashCode(vt9Var.T);
            oag oagVarL2 = vt9Var.l();
            z7e z7eVar = z7e.b;
            c8e c8eVarP2 = qyn.P(vt9Var, z7eVar);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ah5Var);
            y4h.o(vt9Var, oagVarL2, ah5Var2);
            u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP2, ah5Var4);
            ijl.b(uyg.q((shk) dhk.F.getValue(), vt9Var), new g4c(1.0f, false), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).l, vt9Var, 0, 0, 131068);
            ocp.c(vt9Var, mpj.l(z7eVar, 8.0f));
            xf8.j(iza.a((dl7) tk7.u.getValue(), vt9Var), "points", mpj.h(z7eVar, 14.0f), null, null, 0.0f, null, vt9Var, 440, 120);
            vt9Var = vt9Var;
            ocp.c(vt9Var, mpj.l(z7eVar, 4.0f));
            ijl.b(String.valueOf(j2), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).n, vt9Var, 0, 0, 131070);
            vt9Var.p(true);
            function02 = function0;
            yi4.a(function02, i39Var, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, aib.c, vt9Var, ((i4 >> 3) & 14) | 805306416, 508);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new e0f(j2, function02, i2);
        }
    }

    public static final void d(final long j2, Function0 function0, final Function0 function02, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1892483463);
        int i3 = i2 | (vt9Var2.e(j2) ? 4 : 2) | (vt9Var2.h(function0) ? 32 : 16) | (vt9Var2.h(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var2.N(i3 & 1, (i3 & 147) != 146)) {
            vt9Var = vt9Var2;
            i7e.a(function0, null, i7e.f(null, vt9Var2, 0, 3), 0.0f, false, null, 0L, 0L, 0L, null, null, null, gyg.P(-309943209, new cr9() { // from class: d0f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ih5 ih5Var2 = (ih5) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    vt9 vt9Var3 = (vt9) ih5Var2;
                    if (vt9Var3.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        lcp.c(j2, function02, vt9Var3, 0);
                    } else {
                        vt9Var3.Q();
                    }
                    return Unit.a;
                }
            }, vt9Var2), vt9Var, (i3 >> 3) & 14, 7162);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new v41(j2, function0, function02, i2, (byte) 2);
        }
    }

    public static final void e(ue5 ue5Var, c8e c8eVar, ue5 ue5Var2, float f2, ih5 ih5Var, int i2) {
        ue5 ue5Var3;
        ue5 ue5Var4;
        c8e c8eVar2;
        d2c d2cVar;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-674345404);
        int i3 = i2 | 48 | (vt9Var.h(ue5Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.c(f2) ? 2048 : 1024) | 24576;
        if (vt9Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            float f3 = ujf.a;
            h7c h7cVar = (h7c) ((c2o) vt9Var.j(mi5.u));
            t0g t0gVarK = h7cVar.b;
            if (t0gVarK == null) {
                r94 r94Var = h7cVar.a;
                t0gVarK = hyg.k(r94Var != null ? (g37) r94Var.invoke() : g37.c);
                h7cVar.b = t0gVarK;
                h7cVar.a = null;
            }
            int iA = gh7.a(kh7.a(((g37) t0gVarK.getValue()).b), ujf.a);
            z7e z7eVar = z7e.b;
            if (iA >= 0) {
                vt9Var.W(-1861394487);
                tfd tfdVarC = nr3.c(rbe.b, true);
                int iHashCode = Long.hashCode(vt9Var.T);
                oag oagVarL = vt9Var.l();
                c8e c8eVarP = qyn.P(vt9Var, z7eVar);
                bh5.To.getClass();
                vt9Var.a0();
                if (vt9Var.S) {
                    vt9Var.k(m3c.S);
                } else {
                    vt9Var.j0();
                }
                y4h.o(vt9Var, tfdVarC, ujp.f);
                y4h.o(vt9Var, oagVarL, ujp.e);
                y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
                y4h.m(vt9Var);
                y4h.o(vt9Var, c8eVarP, ujp.d);
                hp7 hp7Var = mi5.n;
                d2c d2cVar2 = (d2c) vt9Var.j(hp7Var);
                int iOrdinal = d2cVar2.ordinal();
                if (iOrdinal == 0) {
                    d2cVar = d2c.b;
                } else {
                    if (iOrdinal != 1) {
                        h9o.p();
                        return;
                    }
                    d2cVar = d2c.a;
                }
                kfo.c(hp7Var.a(d2cVar), gyg.P(-1669157531, new vjf(f2, d2cVar2, ue5Var, ue5Var2), vt9Var), vt9Var, 56);
                vt9Var.p(true);
                vt9Var.p(false);
                ue5Var3 = ue5Var;
                ue5Var4 = ue5Var2;
            } else {
                vt9Var.W(-1860490155);
                ue5Var3 = ue5Var;
                ue5Var4 = ue5Var2;
                f(ue5Var3, z7eVar, ue5Var4, new x62(f2, true, new t40((byte) 19)), vt9Var, i3 & 1022);
                vt9Var.p(false);
            }
            c8eVar2 = z7eVar;
        } else {
            ue5Var3 = ue5Var;
            ue5Var4 = ue5Var2;
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new vjf(ue5Var3, c8eVar2, ue5Var4, f2, i2);
        }
    }

    public static final void f(ue5 ue5Var, c8e c8eVar, ue5 ue5Var2, x62 x62Var, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(997168537);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.h(ue5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.f(c8eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.h(ue5Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var.f(x62Var) ? 2048 : 1024;
        }
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 >> 3;
            o9i o9iVarA = m9i.a(x62Var, rbe.k, vt9Var, (((i4 & 14) | ((i3 >> 6) & 112)) >> 3) & 14);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            Object obj = q9i.a;
            if (ue5Var2 == null) {
                vt9Var.W(1398343488);
            } else {
                vt9Var.W(-1478912799);
                ue5Var2.invoke(obj, vt9Var, Integer.valueOf((i4 & 112) | 6));
            }
            vt9Var.p(false);
            ue5Var.invoke(obj, vt9Var, Integer.valueOf(6 | ((i3 << 3) & 112)));
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fz0(ue5Var, c8eVar, ue5Var2, x62Var, i2);
        }
    }

    public static final void g(ue5 ue5Var, c8e c8eVar, ue5 ue5Var2, x62 x62Var, ih5 ih5Var, int i2) {
        c8e c8eVar2;
        x62 x62Var2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-730954791);
        int i3 = i2 | 48 | (vt9Var.h(ue5Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | 3072;
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            float f2 = ujf.a;
            x62 x62Var3 = new x62(0.0f, true, new t40((byte) 19));
            int i4 = i3 >> 3;
            db5 db5VarA = cb5.a(x62Var3, rbe.n, vt9Var, 6);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            z7e z7eVar = z7e.b;
            c8e c8eVarP = qyn.P(vt9Var, z7eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            Object obj = eb5.a;
            ue5Var.invoke(obj, vt9Var, 54);
            if (ue5Var2 == null) {
                vt9Var.W(-1056067438);
            } else {
                vt9Var.W(-1558087345);
                ue5Var2.invoke(obj, vt9Var, Integer.valueOf(6 | (i4 & 112)));
            }
            vt9Var.p(false);
            vt9Var.p(true);
            x62Var2 = x62Var3;
            c8eVar2 = z7eVar;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
            x62Var2 = x62Var;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new px0(ue5Var, c8eVar2, ue5Var2, x62Var2, i2);
        }
    }

    public static ob3 h(prb prbVar) {
        c13 c13Var;
        wpb wpbVarE;
        if (prbVar.a.containsKey("video_auto_play_start_time")) {
            String strN = prbVar.u("video_auto_play_start_time").n();
            try {
                c13Var = (c13) Enum.valueOf(c13.class, strN.toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException e2) {
                throw new Exception(p3p.w("Invalid for value enum ", lcp.class.getName(), ": ", strN), e2);
            }
        } else {
            c13Var = null;
        }
        prb prbVarA = bw2.a(prbVar, "url_mapping", (prb) null);
        String strA = prbVarA != null ? bw2.a(prbVarA, "click_url", "") : null;
        ArrayList arrayList = new ArrayList();
        if (prbVarA != null && (wpbVarE = bw2.e(prbVarA, "interaction_types")) != null) {
            ArrayList arrayList2 = wpbVarE.a;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                int i4 = i2 + 1;
                if (i2 < 0) {
                    j95.n();
                    throw null;
                }
                String strN2 = ((pqb) obj).n();
                if (strN2 != null) {
                    arrayList.add(strN2);
                }
                i2 = i4;
            }
        }
        return new ob3(bw2.a(prbVar, "required_screen_hold_sec", 0), c13Var, strA, arrayList);
    }

    public static final void i(k0j k0jVar, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        f0j f0jVar = k0jVar.d;
        see seeVar = f0jVar.a;
        Object objG = f0jVar.a.g(n0j.z);
        if (objG == null) {
            objG = null;
        }
        q5i q5iVar = (q5i) objG;
        if (cqp.N(k0jVar)) {
            if (q5iVar == null || q5iVar.a != 8) {
                Object objG2 = seeVar.g(e0j.y);
                if (objG2 == null) {
                    objG2 = null;
                }
                c8 c8Var = (c8) objG2;
                if (c8Var != null) {
                    accessibilityNodeInfoCompat.b(new s8(R.id.accessibilityActionPageUp, c8Var.a));
                }
                Object objG3 = seeVar.g(e0j.A);
                if (objG3 == null) {
                    objG3 = null;
                }
                c8 c8Var2 = (c8) objG3;
                if (c8Var2 != null) {
                    accessibilityNodeInfoCompat.b(new s8(R.id.accessibilityActionPageDown, c8Var2.a));
                }
                Object objG4 = seeVar.g(e0j.z);
                if (objG4 == null) {
                    objG4 = null;
                }
                c8 c8Var3 = (c8) objG4;
                if (c8Var3 != null) {
                    accessibilityNodeInfoCompat.b(new s8(R.id.accessibilityActionPageLeft, c8Var3.a));
                }
                Object objG5 = seeVar.g(e0j.B);
                c8 c8Var4 = (c8) (objG5 != null ? objG5 : null);
                if (c8Var4 != null) {
                    accessibilityNodeInfoCompat.b(new s8(R.id.accessibilityActionPageRight, c8Var4.a));
                }
            }
        }
    }

    public static final c8e j(c8e c8eVar, float f2, long j2, paj pajVar) {
        return c8eVar.d(new fo3(f2, new nvj(j2), pajVar));
    }

    public static nd6 k(evh evhVar, String str, bjh bjhVar, int i2) {
        Map map = Collections.EMPTY_MAP;
        Uri uriP = n6h.p(str, bjhVar.c);
        long j2 = bjhVar.a;
        long j3 = bjhVar.b;
        String strB = evhVar.b();
        if (strB == null) {
            strB = n6h.p(((oa3) evhVar.b.get(0)).a, bjhVar.c).toString();
        }
        String str2 = strB;
        z4o.D(uriP, "The uri must be set.");
        return new nd6(uriP, 1, null, hsh.d, j2, j3, str2, i2);
    }

    public static final void l(afc afcVar, int i2) {
        d3k d3kVar;
        UCImageView uCImageViewFindViewById = afcVar.findViewById(i2);
        if (uCImageViewFindViewById == null || (d3kVar = uCImageViewFindViewById.d) == null) {
            return;
        }
        d3kVar.k((CancellationException) null);
    }

    public static void m(Context context, String str) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("url", BrowserUtils.getExternalUrlWithFallback(str)));
            if (Build.VERSION.SDK_INT < 33) {
                Toast.makeText(context, context.getString(2132018397), 0).show();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.o92 n(android.content.Context r21, p92 r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcp.n(android.content.Context, p92, int):o92");
    }

    public static final Fragment o(w wVar, Class cls) {
        for (Fragment fragment : wVar.c.f()) {
            if (cls.isAssignableFrom(fragment.getClass())) {
                return fragment;
            }
        }
        return null;
    }

    public static String p(Context context) {
        CastSession currentCastSession;
        CastDevice castDevice;
        CastContext sharedInstance = CastContext.getSharedInstance();
        String friendlyName = (sharedInstance == null || (currentCastSession = sharedInstance.getSessionManager().getCurrentCastSession()) == null || (castDevice = currentCastSession.getCastDevice()) == null) ? null : castDevice.getFriendlyName();
        if (friendlyName == null) {
            return null;
        }
        return context.getString(2132019743, friendlyName);
    }

    public static int q(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return ab5.l(colorForState, Math.min(Color.alpha(colorForState) << 1, 255));
    }

    public static int r(cq7 cq7Var) {
        BigInteger bigInteger = cq7Var.d;
        return bigInteger == null ? cq7Var.l() + 1 : bigInteger.bitLength();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class s(itb itbVar) {
        Class clsA = ((n15) itbVar).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static final boolean t(Uri uri) {
        if (uri == null) {
            String[] strArr = wqm.a;
            return false;
        }
        if (wqm.D(uri) && "www.opera.com".equals(uri.getHost())) {
            return "/ofa/ofa-beta/config-bundle".equals(uri.getPath());
        }
        return false;
    }

    public static boolean u(int i2, CharSequence charSequence) {
        if (i2 >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i2);
        switch (cCharAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (cCharAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (cCharAt) {
                            case '[':
                            case pd.N0 /* 92 */:
                            case pd.O0 /* 93 */:
                            case pd.P0 /* 94 */:
                            case pd.p0 /* 95 */:
                            case pd.A0 /* 96 */:
                                return true;
                            default:
                                switch (cCharAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onSessionStarting(CastSession castSession) {
    }

    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void onSessionSuspended(CastSession castSession, int i2) {
    }

    public final void onSessionEnding(Session session) {
    }

    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void onSessionResumeFailed(CastSession castSession, int i2) {
    }

    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void onSessionResumed(CastSession castSession, boolean z) {
    }

    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void onSessionResuming(CastSession castSession, String str) {
    }

    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void onSessionStartFailed(CastSession castSession, int i2) {
    }

    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onSessionStarted(CastSession castSession, String str) {
    }
}
