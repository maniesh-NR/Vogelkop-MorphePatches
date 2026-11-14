package ads_mobile_sdk;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import defpackage.dvj;
import defpackage.fsg;
import defpackage.o5p;
import defpackage.oca;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.h;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class ax0 {
    public static final dvj f = new dvj(16);
    public static final AtomicReference g;
    public static final Regex h;
    public static final Regex i;
    public final Context a;
    public final g0 b;
    public final qr0 c;
    public final l0 d;
    public final Class e;

    static {
        Arrays.asList("/aclk", "/pcs/click", "/dbm/clk");
        g = new AtomicReference(null);
        h = new Regex("^(ca-app-pub-[0-9]{16})~([0-9]{10})$");
        i = new Regex("^(ca-app-pub-[a-zA-Z0-9\\-]+)/([a-zA-Z0-9_\\-]+)(/.*)?$");
    }

    public ax0(Context context, g0 g0Var, qr0 qr0Var, l0 l0Var, Class cls) {
        this.a = context;
        this.b = g0Var;
        this.c = qr0Var;
        this.d = l0Var;
        this.e = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ads_mobile_sdk.zw0 a(android.content.Context r3) {
        /*
            ads_mobile_sdk.zw0 r0 = new ads_mobile_sdk.zw0
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getLanguage()
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.getCountry()
            r0.<init>(r1, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L2a
            java.lang.Class<android.app.LocaleManager> r1 = android.app.LocaleManager.class
            java.lang.Object r3 = r3.getSystemService(r1)
            android.app.LocaleManager r3 = (android.app.LocaleManager) r3
            if (r3 == 0) goto L3b
            android.os.LocaleList r3 = r3.getSystemLocales()
            goto L3c
        L2a:
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L3b
            android.content.res.Configuration r3 = r3.getConfiguration()
            if (r3 == 0) goto L3b
            android.os.LocaleList r3 = r3.getLocales()
            goto L3c
        L3b:
            r3 = 0
        L3c:
            if (r3 == 0) goto L56
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L56
            r0 = 0
            java.util.Locale r3 = r3.get(r0)
            ads_mobile_sdk.zw0 r0 = new ads_mobile_sdk.zw0
            java.lang.String r1 = r3.getLanguage()
            java.lang.String r3 = r3.getCountry()
            r0.<init>(r1, r3)
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ax0.a(android.content.Context):ads_mobile_sdk.zw0");
    }

    public final long a() {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        int i2 = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i2 < 33) {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), NotificationCompat.FLAG_HIGH_PRIORITY)) == null) ? 0 : packageInfo.versionCode;
        }
        PackageManager packageManager2 = context.getPackageManager();
        if (packageManager2 == null || (packageInfo2 = packageManager2.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(128L))) == null) {
            return 0L;
        }
        return packageInfo2.getLongVersionCode();
    }

    public final Intent a(Context context, o5p o5pVar) {
        Intent intent = new Intent(context, (Class<?>) this.e);
        Bundle bundle = new Bundle();
        l0 l0Var = this.d;
        l0Var.getClass();
        int andIncrement = l0Var.c.getAndIncrement();
        mt5 mt5Var = null;
        byte b = 3;
        d3k d3kVarB = defpackage.na2.B(l0Var.a, h.a, null, new fsg(new oca(l0Var, andIncrement, mt5Var, b), mt5Var, b), 2);
        l0Var.d.put(Integer.valueOf(andIncrement), new j0(o5pVar, d3kVarB));
        bundle.putInt("ad_activity_delegate", andIncrement);
        intent.putExtra("ad_activity_delegate_bundle", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    public final boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        Context contextB = this.b.b();
        if (contextB == null) {
            contextB = this.a;
        }
        if (!(contextB instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            contextB.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            xh3.a("Exception starting Activity: " + e, null, 6);
            return false;
        }
    }

    public final boolean a(Uri uri) {
        if (!b(uri)) {
            return false;
        }
        String string = uri.toString();
        qr0 qr0Var = this.c;
        qr0Var.getClass();
        List list = (List) qr0Var.a("gads:click_url_pattern_match", Collections.singletonList("^[^?]*(/aclk|/pcs/click|/dbm/clk).*"), fo.a$15);
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (new Regex((String) it.next()).a.matcher(string).find()) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(Uri uri) {
        String host = uri.getHost();
        if (host != null) {
            qr0 qr0Var = this.c;
            qr0Var.getClass();
            List list = (List) qr0Var.a("gads:google_ad_domain_suffixes", Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"), fo.a$15);
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (kotlin.text.c.l(host, (String) it.next(), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean c(Uri uri) {
        if (!b(uri)) {
            return false;
        }
        String string = uri.toString();
        qr0 qr0Var = this.c;
        qr0Var.getClass();
        List list = (List) qr0Var.a("gads:impression_url_pattern_match", Collections.singletonList("^[^?]*(/adview|/pcs/view).*"), fo.a$15);
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (new Regex((String) it.next()).a.matcher(string).find()) {
                return true;
            }
        }
        return false;
    }

    public final Map d(Uri uri) {
        String encodedQuery;
        qr0 qr0Var = this.c;
        qr0Var.getClass();
        if (!((Boolean) qr0Var.a("gads:uri_query_to_map:enabled", Boolean.TRUE, fo.a)).booleanValue()) {
            if (uri.isOpaque()) {
                return n08.a;
            }
            v39 v39VarC = y1j.c(new d82(uri.getQueryParameterNames(), (byte) 1), fo.a$28);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            u39 u39Var = new u39(v39VarC);
            while (u39Var.hasNext()) {
                Object next = u39Var.next();
                linkedHashMap.put(next, uri.getQueryParameter((String) next));
            }
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int length = encodedQuery.length();
            int i2 = 0;
            while (true) {
                int iK = StringsKt.K(encodedQuery, '&', i2, 4);
                int i3 = iK != -1 ? iK : length;
                int iK2 = StringsKt.K(encodedQuery, '=', i2, 4);
                if (iK2 > i3 || iK2 == -1) {
                    iK2 = i3;
                }
                linkedHashMap2.put(Uri.decode(encodedQuery.substring(i2, iK2)), iK2 == i3 ? "" : Uri.decode(encodedQuery.substring(iK2 + 1, i3)));
                if (iK == -1) {
                    break;
                }
                i2 = iK + 1;
            }
        }
        return linkedHashMap2;
    }
}
