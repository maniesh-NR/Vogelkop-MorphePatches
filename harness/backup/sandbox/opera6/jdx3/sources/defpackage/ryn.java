package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class ryn {
    public final String a;
    public final String b;
    public Bitmap c;
    public Drawable d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public ryn() {
        this.a = null;
        this.b = null;
        this.e = 0;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = 2147483648L;
        this.j = 2147483648L;
        this.k = 0;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.o = true;
    }

    public ryn(Intent intent) {
        this.a = intent.getStringExtra("com.opera.android.webapp.extra_id");
        this.b = intent.getStringExtra("org.opera.browser.webapp_icon");
        this.e = intent.getIntExtra("org.opera.browser.webapp_icon_res", 0);
        this.j = intent.getLongExtra("org.opera.browser.background_color", 2147483648L);
        this.i = intent.getLongExtra("org.opera.browser.theme_color", 2147483648L);
        this.k = intent.getIntExtra("org.chromium.content_public.common.orientation", 0);
        this.l = intent.getIntExtra("org.opera.browser.webapp_display_mode", 0);
        this.m = intent.getBooleanExtra("org.opera.browser.allow_multiple_contents", false);
        this.n = intent.getBooleanExtra("org.opera.browser.is_topup", false);
        this.o = intent.getBooleanExtra("org.opera.browser.allow_incognito", true);
        String stringExtra = intent.getStringExtra("org.opera.browser.webapp_short_name");
        this.f = stringExtra == null ? intent.getStringExtra("org.opera.browser.webapp_title") : stringExtra;
        String stringExtra2 = intent.getStringExtra("org.opera.browser.webapp_name");
        this.g = stringExtra2 == null ? intent.getStringExtra("org.opera.browser.webapp_title") : stringExtra2;
        String stringExtra3 = intent.getStringExtra("org.opera.browser.webapp_url");
        this.h = stringExtra3 == null ? intent.getDataString() : stringExtra3;
    }
}
