package defpackage;

import com.opera.android.browser.NavigationEntry;

/* loaded from: classes.dex */
public final class c7l implements NavigationEntry {
    public final /* synthetic */ knf a;
    public final /* synthetic */ NavigationEntry b;

    public c7l(iuh iuhVar, knf knfVar, NavigationEntry navigationEntry) {
        this.a = knfVar;
        this.b = navigationEntry;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final boolean a() {
        return this.b.a();
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final boolean b() {
        return this.a.b();
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final byte[] c() {
        return this.b.c();
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final String d() {
        return this.a.z();
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final byte[] e() {
        return this.b.e();
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final int getId() {
        return this.b.getId();
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final String getTitle() {
        return this.a.n();
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final String getUrl() {
        return this.a.getUrl();
    }
}
