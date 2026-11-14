package defpackage;

import ads_mobile_sdk.bw2;
import ads_mobile_sdk.cw2;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.view.View;
import android.view.ViewGroup;
import com.leanplum.core.BuildConfig;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class y4h {
    public static final int a(Context context, NetworkCapabilities networkCapabilities) {
        if (context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && networkCapabilities != null) {
            if (networkCapabilities.hasTransport(3)) {
                return 9;
            }
            if (networkCapabilities.hasTransport(1)) {
                return 1;
            }
            if (networkCapabilities.hasTransport(0)) {
                return 0;
            }
        }
        return -1;
    }

    public static final cw2 b(pqb pqbVar) {
        pqbVar.getClass();
        if (!(pqbVar instanceof wpb)) {
            return null;
        }
        ArrayList arrayList = pqbVar.g().a;
        if (arrayList.isEmpty()) {
            return null;
        }
        pqb pqbVar2 = (pqb) arrayList.get(0);
        pqbVar2.getClass();
        if (!(pqbVar2 instanceof prb)) {
            return null;
        }
        prb prbVarH = pqbVar2.h();
        return new cw2(bw2.a(prbVarH, "rb_type", ""), bw2.a(prbVarH, "rb_amount", 1));
    }

    public static final void c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                c(viewGroup.getChildAt(i));
            }
        }
    }

    public static final int d(Context context) {
        if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0 || (Build.VERSION.SDK_INT >= 33 && context.checkSelfPermission("android.permission.READ_BASIC_PHONE_STATE") == 0)) {
            return ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getDataNetworkType();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.hmi e(java.lang.String r17, int r18, defpackage.gmi r19) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y4h.e(java.lang.String, int, gmi):hmi");
    }

    public static final String f(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            y1 y1Var = (y1) obj;
            sb.append(y1Var.a.e(y1Var.b));
        }
        return sb.toString();
    }

    public static final int g(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                qp2.o("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static Exception h(String str) {
        try {
            crb crbVar = ehj.k;
            crbVar.getClass();
            lgj lgjVar = (lgj) crbVar.a(str, lgj.Companion.serializer());
            h58 h58Var = xej.d;
            h58Var.getClass();
            w4 w4Var = new w4(h58Var, (byte) 0);
            while (w4Var.hasNext()) {
                xej xejVar = (xej) w4Var.next();
                if (xejVar.a.equals(lgjVar.a)) {
                    return new yej(xejVar);
                }
            }
        } catch (JSONException unused) {
        }
        return new lv0("Error response: 422");
    }

    public static final byte[] i(String str) {
        if (str.length() != 0 && str.length() % 2 != 0) {
            str = BuildConfig.BUILD_NUMBER.concat(str);
        }
        return naa.c(str);
    }

    public static final void j(ih5 ih5Var, Integer num) {
        ah5 ah5Var = ujp.g;
        if (((vt9) ih5Var).S) {
            ((vt9) ih5Var).b(num, ah5Var);
        }
    }

    public static boolean k(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("tel:") || str.startsWith("callto:");
    }

    public static long l(int i, int i2, int i3, int i4) {
        return (i & 32767) | ((i2 & 32767) << 15) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
    }

    public static final void m(ih5 ih5Var) {
        ((vt9) ih5Var).b(Unit.a, new sul((byte) 8));
    }

    public static final void n(Spannable spannable, s15 s15Var) {
        k1j k1jVarA = t1j.a(new exj(spannable, spannable.length(), s15Var, null));
        while (k1jVarA.hasNext()) {
            Object obj = ((pwj) k1jVarA.next()).a;
            if (obj != null) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static final void o(ih5 ih5Var, Object obj, Function2 function2) {
        if (((vt9) ih5Var).S || !Intrinsics.a(((vt9) ih5Var).K(), obj)) {
            vt9 vt9Var = (vt9) ih5Var;
            vt9Var.g0(obj);
            vt9Var.b(obj, function2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(View view, String str) {
        Locale locale = uup.g;
        if (str != null && str.length() != 0 && locale != null) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new LocaleSpan(locale), 0, spannableString.length(), 33);
            str = spannableString;
        }
        view.setContentDescription(str);
    }

    public static final void q(View view, int i, int i2, boolean z) {
        lph lphVar = new lph(-1, -2);
        lphVar.setMarginStart(i);
        ((ViewGroup.MarginLayoutParams) lphVar).topMargin = i2;
        lphVar.setMarginEnd(i);
        if (!z) {
            i2 = 0;
        }
        ((ViewGroup.MarginLayoutParams) lphVar).bottomMargin = i2;
        view.setLayoutParams(lphVar);
    }

    public static final bab r(r9b r9bVar) {
        return new bab(r9bVar.a, r9bVar.b, r9bVar.c, r9bVar.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(java.lang.String r7, defpackage.tth r8) throws defpackage.hth {
        /*
            qpb r0 = rpb.d
            r0.getClass()
            sqb r1 = sqb.a
            java.lang.Object r7 = r0.a(r7, r1)
            kotlinx.serialization.json.b r7 = (kotlinx.serialization.json.b) r7
            kotlinx.serialization.json.c r7 = qqb.h(r7)
            java.lang.String r1 = "error"
            java.lang.Object r1 = r7.get(r1)
            kotlinx.serialization.json.b r1 = (kotlinx.serialization.json.b) r1
            r2 = 0
            if (r1 == 0) goto L23
            boolean r3 = r1 instanceof kotlinx.serialization.json.c
            if (r3 == 0) goto L23
            kotlinx.serialization.json.c r1 = (kotlinx.serialization.json.c) r1
            goto L24
        L23:
            r1 = r2
        L24:
            if (r1 == 0) goto La3
            hth r7 = new hth
            java.lang.String r8 = "code"
            java.lang.Object r8 = r1.get(r8)
            if (r8 == 0) goto L9d
            kotlinx.serialization.json.b r8 = (kotlinx.serialization.json.b) r8
            kotlinx.serialization.json.d r8 = qqb.i(r8)
            long r3 = qqb.j(r8)     // Catch: oqb -> L94
            r5 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L79
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L79
            int r8 = (int) r3
            java.lang.String r0 = "message"
            java.lang.Object r0 = r1.get(r0)
            kotlinx.serialization.json.b r0 = (kotlinx.serialization.json.b) r0
            if (r0 == 0) goto L68
            boolean r1 = r0 instanceof kotlinx.serialization.json.d
            if (r1 == 0) goto L5a
            kotlinx.serialization.json.d r0 = (kotlinx.serialization.json.d) r0
            goto L5b
        L5a:
            r0 = r2
        L5b:
            if (r0 == 0) goto L68
            boolean r1 = r0.c()
            if (r1 == 0) goto L68
            java.lang.String r0 = r0.b()
            goto L69
        L68:
            r0 = r2
        L69:
            if (r0 != 0) goto L6d
            java.lang.String r0 = "No error message provided"
        L6d:
            java.lang.String r1 = "["
            java.lang.String r3 = "]: "
            java.lang.String r8 = p3p.j(r8, r1, r3, r0)
            r7.<init>(r8, r2)
            throw r7
        L79:
            java.lang.NumberFormatException r7 = new java.lang.NumberFormatException
            java.lang.String r8 = r8.b()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = " is not an Int"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L94:
            r7 = move-exception
            java.lang.NumberFormatException r8 = new java.lang.NumberFormatException
            java.lang.String r7 = r7.a
            r8.<init>(r7)
            throw r8
        L9d:
            java.lang.String r7 = "Required value was null."
            defpackage.qp2.o(r7)
            return r2
        La3:
            java.lang.String r1 = "result"
            java.lang.Object r1 = r7.get(r1)
            kotlinx.serialization.json.b r1 = (kotlinx.serialization.json.b) r1
            if (r1 == 0) goto Ldf
            boolean r3 = r1 instanceof kotlinx.serialization.json.JsonNull
            if (r3 == 0) goto Lb3
            r0 = r2
            goto Lca
        Lb3:
            boolean r3 = r1 instanceof kotlinx.serialization.json.d
            if (r3 == 0) goto Lbe
            kotlinx.serialization.json.d r1 = (kotlinx.serialization.json.d) r1
            java.lang.String r0 = r1.b()
            goto Lca
        Lbe:
            kotlinx.serialization.json.JsonElement$Companion r3 = kotlinx.serialization.json.b.Companion
            kotlinx.serialization.KSerializer r3 = r3.serializer()
            kotlinx.serialization.KSerializer r3 = (kotlinx.serialization.KSerializer) r3
            java.lang.String r0 = r0.b(r1, r3)
        Lca:
            if (r0 == 0) goto Ldf
            kotlin.jvm.functions.Function1 r7 = r8.c
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 == 0) goto Ld5
            return r7
        Ld5:
            java.lang.String r7 = "Could not decode response: "
            java.lang.String r7 = r7.concat(r0)
            s49.m(r7)
            return r2
        Ldf:
            java.lang.String r8 = "No result in: "
            n57.d(r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y4h.s(java.lang.String, tth):java.lang.Object");
    }

    public static Intent t(String str, String str2, Map map) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority("play.google.com").path("store/apps/details").appendQueryParameter("id", str).appendQueryParameter("referrer", str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                if (!str3.equals("id") && !str3.equals("referrer")) {
                    builderAppendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
                }
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", builderAppendQueryParameter.build());
        intent.setPackage("com.android.vending");
        return intent;
    }

    public static Intent u(String str, String str2, String str3, Map map) {
        Intent intent = new Intent("android.intent.action.VIEW", v(str, str2, map));
        intent.setPackage("com.android.vending");
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", str3);
        intent.putExtra("hsdp_caller_source", "hpoa");
        return intent;
    }

    public static Uri v(String str, String str2, Map map) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority("play.google.com").path("d").appendQueryParameter("id", str).appendQueryParameter("referrer", str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                if (!str3.equals("id") && !str3.equals("referrer")) {
                    builderAppendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
                }
            }
        }
        return builderAppendQueryParameter.build();
    }
}
