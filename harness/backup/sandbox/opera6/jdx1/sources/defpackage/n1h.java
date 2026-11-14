package defpackage;

import ads_mobile_sdk.e7;
import ads_mobile_sdk.fo;
import ads_mobile_sdk.pb1;
import ads_mobile_sdk.qr0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.ApiVersion;

/* loaded from: classes.dex */
public abstract class n1h {
    public static long a = 3000;
    public static long b = 30000;
    public static int c = 3;

    public static void a(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                uri.toString();
                return;
            }
            if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                HashMap map = new HashMap();
                for (String str : uri.getQueryParameterNames()) {
                    map.put(str, uri.getQueryParameter(str));
                }
                try {
                    cgh.d(pb1.b.a.getApplicationContext(), (String) map.get("mechanism"), new e7(map));
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            uri.toString();
        }
    }

    public static void b(ThreadPoolExecutor threadPoolExecutor, int i, qr0 qr0Var) {
        on7 on7Var = pn7.b;
        threadPoolExecutor.setKeepAliveTime(pn7.f(((pn7) qr0Var.a("gad:thread_keep_alive_time", u0h.b(10, un7.e), fo.a$18)).a), TimeUnit.MILLISECONDS);
        if (i > threadPoolExecutor.getMaximumPoolSize()) {
            threadPoolExecutor.setMaximumPoolSize(i);
            threadPoolExecutor.setCorePoolSize(i);
        } else {
            threadPoolExecutor.setCorePoolSize(i);
            threadPoolExecutor.setMaximumPoolSize(i);
        }
    }

    public static final void c(ifl iflVar, Context context, final boolean z, final String str, final long j) {
        if (xjl.c(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) wyh.g.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        dee deeVar = iflVar.a;
        dee deeVar2 = iflVar.a;
        wfl wflVar = wfl.b;
        deeVar.a(wflVar);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            deeVar2.a(new sfl(new l1h(i), resolveInfo.loadLabel(packageManager).toString(), 0, new Function1() { // from class: m1h
                public final Object invoke(Object obj) {
                    wyh.h.m(context2, resolveInfo, Boolean.valueOf(z), str, new xjl(j));
                    ((xfl) obj).close();
                    return Unit.a;
                }
            }));
            i++;
            context2 = context;
        }
        deeVar2.a(wflVar);
    }

    public static SpannableString d(String str, owj... owjVarArr) {
        Object[] objArr;
        for (owj owjVar : owjVarArr) {
            int iIndexOf = str.indexOf(owjVar.a);
            owjVar.d = iIndexOf;
            owjVar.e = str.indexOf(owjVar.b, owjVar.a.length() + iIndexOf);
        }
        Arrays.sort(owjVarArr);
        StringBuilder sb = new StringBuilder(str.length());
        int length = 0;
        for (owj owjVar2 : owjVarArr) {
            int i = owjVar2.d;
            String str2 = owjVar2.b;
            String str3 = owjVar2.a;
            if (i == -1 || owjVar2.e == -1 || i < length) {
                owjVar2.d = -1;
                qp2.o(sko.l("Input string is missing tags ", str3, str2, ": ", str));
                return null;
            }
            sb.append((CharSequence) str, length, i);
            int length2 = str3.length() + owjVar2.d;
            owjVar2.d = sb.length();
            sb.append((CharSequence) str, length2, owjVar2.e);
            length = owjVar2.e + str2.length();
            owjVar2.e = sb.length();
        }
        sb.append((CharSequence) str, length, str.length());
        SpannableString spannableString = new SpannableString(sb);
        for (owj owjVar3 : owjVarArr) {
            if (owjVar3.d != -1 && (objArr = owjVar3.c) != null && objArr.length != 0) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        spannableString.setSpan(obj, owjVar3.d, owjVar3.e, 0);
                    }
                }
            }
        }
        return spannableString;
    }

    public static File e(Context context, String str, String str2) {
        File file = new File(ojm.b(context), "share");
        if (!file.exists() && !file.mkdir()) {
            return null;
        }
        return File.createTempFile(str + System.currentTimeMillis(), str2, file);
    }

    public static String f(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }

    public static int g() {
        return Integer.parseInt(ApiVersion.getCronetVersion().split("\\.")[0]) < 59 ? ApiVersion.getApiLevel() : ApiVersion.getMaximumAvailableApiLevel();
    }

    public static final Bundle h(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        qp2.o(sko.k("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    public static int i(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        qp2.o(sko.i(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static String j(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length << 4));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) strValueOf, i2, iIndexOf);
            sb.append(k(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i2, strValueOf.length());
        if (i < objArr.length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(k(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String k(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str), (Throwable) e);
            StringBuilder sbS = p3p.s("<", str, " threw ");
            sbS.append(e.getClass().getName());
            sbS.append(">");
            return sbS.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(android.content.Context r14, defpackage.y2d r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, nt5 r20) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1h.l(android.content.Context, y2d, java.lang.String, java.lang.String, java.lang.String, java.lang.String, nt5):java.lang.Object");
    }

    public static final n3d m(Context context, y2d y2dVar, String str) {
        if (y2dVar != null) {
            return Intrinsics.a(str, "__LottieInternalDefaultCacheKey__") ? u2d.e(context, 2131951675, u2d.j(2131951675, context)) : u2d.e(context, 2131951675, str);
        }
        h9o.p();
        return null;
    }

    public static void n(View view, int i, int i2) {
        String string = i == 0 ? null : view.getResources().getString(i);
        view.setContentDescription(string);
        o(view, string, i2);
    }

    public static void o(View view, CharSequence charSequence, int i) {
        if (charSequence == null) {
            charSequence = null;
        } else if (i != 0) {
            String str = ((Object) charSequence) + "\u200b\u200b";
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ttl(view, i, (byte) 0), str.length() - 2, str.length() - 1, 18);
            spannableString.setSpan(new ttl(view, i, (byte) 1), str.length() - 1, str.length(), 18);
            charSequence = spannableString;
        }
        view.setTooltipText(charSequence);
    }

    public static final void p(BrowserActivity browserActivity, umi umiVar, SettingsManager settingsManager) {
        lqh lqhVar = new lqh();
        lqhVar.a = true;
        uyg.e(settingsManager, "ga_usage_statistics", new qfl(settingsManager, (byte) 18)).j(browserActivity, new glm(new rg(lqhVar, browserActivity, umiVar, settingsManager, (byte) 17), (byte) 1));
    }
}
