package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import java.util.Locale;

/* loaded from: classes.dex */
public final class la3 extends oa3 {
    public final Context d;
    public final ki0 e;
    public final qr0 f;
    public final ax0 g;

    public la3(Context context, ki0 ki0Var, qr0 qr0Var, ax0 ax0Var) {
        super(fw0.CUI_NAME_SDKINIT_INIT_DEVICE_SIGNAL, 2);
        this.d = context;
        this.e = ki0Var;
        this.f = qr0Var;
        this.g = ax0Var;
    }

    @Override // defpackage.wdp
    /* renamed from: a */
    public final lw0 mo15a() {
        return lw0.STATIC_DEVICE;
    }

    @Override // defpackage.wdp
    public final Object d(mt5 mt5Var) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        int i;
        String str3 = Build.FINGERPRINT;
        ki0 ki0Var = this.e;
        boolean z3 = ki0Var.c.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), 65536) != null;
        boolean z4 = ki0Var.c.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 65536) != null;
        String country = Locale.getDefault().getCountry();
        boolean zBooleanValue = ((Boolean) ki0Var.f.getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) ki0Var.k.getValue()).booleanValue();
        boolean zBooleanValue3 = ((Boolean) ki0Var.h.getValue()).booleanValue();
        boolean zBooleanValue4 = ((Boolean) ki0Var.g.getValue()).booleanValue();
        String language = Locale.getDefault().getLanguage();
        ehc ehcVarB = kotlin.collections.a.b();
        LocaleList localeList = LocaleList.getDefault();
        int size = localeList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ehcVarB.add(localeList.get(i2).getLanguage());
        }
        ehc ehcVarA = kotlin.collections.a.a(ehcVarB);
        String str4 = (String) ki0Var.j.getValue();
        String str5 = (String) ki0Var.i.getValue();
        long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        boolean zBooleanValue5 = ((Boolean) ki0Var.m.getValue()).booleanValue();
        qr0 qr0Var = this.f;
        qr0Var.getClass();
        boolean zBooleanValue6 = ((Boolean) qr0Var.a("gads:add_system_default_locale", Boolean.FALSE, fo.a)).booleanValue();
        Context context = this.d;
        if (zBooleanValue6) {
            this.g.getClass();
            zw0 zw0VarA = ax0.a(context);
            String str6 = zw0VarA.b;
            str2 = zw0VarA.a;
            str = str6;
        } else {
            str = null;
            str2 = null;
        }
        String str7 = Build.MODEL;
        int i3 = Build.VERSION.SDK_INT;
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        int identifier2 = context.getResources().getIdentifier("Theme.GoogleMobileAds", "style", context.getPackageName());
        if (identifier == 0 && identifier2 == 0) {
            xu0.b("Please set theme of AdActivity to @style/Theme.GoogleMobileAds to enable\n      transparent background interstitial ads.", null);
            z2 = false;
        } else {
            try {
                z = false;
            } catch (PackageManager.NameNotFoundException e) {
                e = e;
                z = false;
            }
            try {
                i = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.libraries.ads.mobile.sdk.common.AdActivity"), 0).theme;
            } catch (PackageManager.NameNotFoundException e2) {
                e = e2;
                vr3 vr3Var = xu0.a;
                xu0.c("Failed to fetch AdActivity theme: " + e, null);
                xu0.b("Please set theme of AdActivity to @style/Theme.GoogleMobileAds to enable\n      transparent background interstitial ads.", null);
                z2 = z;
                return new hv0(new ka3(z3, z4, country, str, zBooleanValue3, zBooleanValue4, language, ehcVarA, str2, str4, availableBytes, zBooleanValue2, str5, zBooleanValue, i3, z2, zBooleanValue5));
            }
            if (i == identifier || i == identifier2) {
                z2 = true;
            } else {
                xu0.b("Please set theme of AdActivity to @style/Theme.GoogleMobileAds to enable\n      transparent background interstitial ads.", null);
                z2 = z;
            }
        }
        return new hv0(new ka3(z3, z4, country, str, zBooleanValue3, zBooleanValue4, language, ehcVarA, str2, str4, availableBytes, zBooleanValue2, str5, zBooleanValue, i3, z2, zBooleanValue5));
    }
}
