package com.opera.android.browser;

import J.N;
import androidx.annotation.Nullable;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.history.HistoryManager;
import com.opera.android.settings.SettingsManager;
import defpackage.b2l;
import defpackage.c23;
import defpackage.d23;
import defpackage.d7l;
import defpackage.dx3;
import defpackage.dz8;
import defpackage.e23;
import defpackage.e7l;
import defpackage.i0l;
import defpackage.ks3;
import defpackage.p5j;
import defpackage.vk2;
import defpackage.vml;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class BannerBlockerHelper implements p5j {
    public static final String[] b = {"AD", "AL", "AM", "AT", "AX", "AZ", "BA", "BE", "BG", "BY", "CH", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FO", "FR", "GB", "GE", "GG", "GI", "GL", "GR", "HR", "HU", "IE", "IM", "IS", "IT", "JE", "KZ", "LI", "LT", "LU", "LV", "MC", "MD", "ME", "MK", "MT", "NL", "NO", "PL", "PT", "RO", "RS", "RU", "SE", "SI", "SJ", "SK", "SM", "TR", "UA", "VA", "XK"};
    public static int c = 1;
    public final SettingsManager a;

    public BannerBlockerHelper(SettingsManager settingsManager) {
        this.a = settingsManager;
        a();
        settingsManager.F(this);
    }

    public static void onBadData(long j) {
        Locale locale = Locale.ROOT;
        ks3.B("Bad bannerblocker list", "size: " + j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity, dx3] */
    public static void onMissedBannerBlockOpportunity(@Nullable WebContents webContents) {
        ?? r0;
        b2l b2lVarV;
        if (webContents != null) {
            dx3 dx3VarL = dx3.L(webContents);
            if (!(dx3VarL instanceof BrowserActivity) || (b2lVarV = (r0 = (BrowserActivity) dx3VarL).V(webContents)) == null) {
                return;
            }
            int iA = vep.A(c);
            if (iA == 0) {
                c = 4;
                Lazy lazyH = i0l.h(r0);
                vk2 vk2Var = new vk2((byte) 3);
                ScheduledExecutorService scheduledExecutorService = vml.a;
                lazyH.a(new dz8(vk2Var, (byte) 1));
            } else if (iA == 1) {
                return;
            }
            e23 e23Var = new e23(r0, b2lVarV);
            d7l d7lVar = (d7l) b2lVarV;
            boolean zIsLoading = d7lVar.j.isLoading();
            e7l e7lVar = d7lVar.j;
            if (zIsLoading) {
                d7lVar.F(new c23(e23Var, e7lVar.I(), (byte) 0));
            } else {
                String url = e7lVar.getUrl();
                if (!e23Var.b) {
                    e23Var.c = url;
                    vml.d(e23Var, 5000L);
                }
            }
            String[] strArr = OperaApplication.K;
            N.MpaqgRo7(((HistoryManager) ((OperaApplication) r0.getApplication()).r.R.get()).a, d7lVar.j.getUrl(), new d23(e23Var, (byte) 0));
        }
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("banner_blocker".equals(str) || "ad_blocking".equals(str)) {
            a();
        }
    }

    public final void a() {
        N.Mlri5RoO(this.a.h());
    }
}
