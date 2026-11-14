package com.opera.android.search;

import J.N;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumContent;
import defpackage.b59;
import defpackage.bco;
import defpackage.bg1;
import defpackage.cz4;
import defpackage.eco;
import defpackage.eej;
import defpackage.eri;
import defpackage.lx3;
import defpackage.p12;
import defpackage.q6e;
import defpackage.s2g;
import defpackage.t5d;
import defpackage.vml;
import defpackage.x5f;
import java.util.Objects;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class YandexPromotionTabHelper {
    public p12 a;
    public long b;
    public final eco c;

    /* JADX WARN: Multi-variable type inference failed */
    public YandexPromotionTabHelper(WebContents webContents, eej eejVar, t5d t5dVar, x5f x5fVar) {
        eco ecoVar = new eco(this);
        this.c = ecoVar;
        this.b = N.MBXzlX8k(this, webContents);
        String[] strArr = OperaApplication.K;
        q6e q6eVarI = ((OperaApplication) t5dVar.getApplicationContext()).I();
        GURL gurl = ChromiumContent.V;
        ChromiumContent chromiumContent = (ChromiumContent) N.Mo8CJari(webContents);
        Objects.requireNonNull(chromiumContent);
        cz4 cz4Var = new cz4(chromiumContent);
        p12 p12Var = new p12();
        p12Var.b = q6eVarI;
        p12Var.e = cz4Var;
        p12Var.c = t5dVar;
        p12Var.d = eejVar;
        p12Var.a = w1h.l(t5dVar, vml.d, "yandex_search_deal", new bg1[0]);
        p12Var.f = x5fVar;
        this.a = p12Var;
        lx3.a.b(ecoVar);
    }

    public final void askToSetAsDefault(@NonNull String str, int i) {
        bco bcoVar;
        p12 p12Var = this.a;
        p94 p94Var = new p94(this, i, (byte) 5);
        if (!p12Var.b()) {
            p94Var.run();
            return;
        }
        boolean z = ((SharedPreferences) ((b59) p12Var.a).get()).getBoolean("infobar_shown_before", false);
        t5d t5dVar = (t5d) p12Var.c;
        if (z) {
            Resources resources = t5dVar.getResources();
            bcoVar = new bco(p12Var, resources, resources, (byte) 1);
        } else {
            Resources resources2 = t5dVar.getResources();
            bcoVar = new bco(p12Var, resources2, resources2, (byte) 0);
        }
        s2g s2gVar = new s2g(p12Var, p94Var, bcoVar, (byte) 16);
        eri eriVar = (eri) p12Var.g;
        if (eriVar != null) {
            eriVar.h(null, s2gVar);
        } else {
            s2gVar.run(null);
        }
    }

    public final boolean canAskToSetAsDefault(@NonNull String str) {
        return this.a.b();
    }

    public final void destroy() {
        lx3.a.c(this.c);
        this.a = null;
        this.b = 0L;
    }
}
