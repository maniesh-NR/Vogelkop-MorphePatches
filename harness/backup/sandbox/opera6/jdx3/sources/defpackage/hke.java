package defpackage;

import com.opera.android.browser.NavigationEntry;

/* loaded from: classes.dex */
public final class hke implements NavigationEntry {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final byte[] f;
    public final boolean g;
    public final byte[] h;

    public hke(NavigationEntry navigationEntry) {
        this.a = navigationEntry.getId();
        this.b = navigationEntry.getUrl();
        this.c = navigationEntry.d();
        this.d = navigationEntry.getTitle();
        this.e = navigationEntry.a();
        this.f = navigationEntry.c();
        this.g = navigationEntry.b();
        this.h = navigationEntry.e();
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final boolean a() {
        return this.e;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final boolean b() {
        return this.g;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final byte[] c() {
        return this.f;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final String d() {
        return this.c;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final byte[] e() {
        return this.h;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final int getId() {
        return this.a;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final String getTitle() {
        return this.d;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final String getUrl() {
        return this.b;
    }
}
