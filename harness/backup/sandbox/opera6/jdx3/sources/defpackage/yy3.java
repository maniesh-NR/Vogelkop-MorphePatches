package defpackage;

import com.opera.android.browser.BrowserTabState;
import com.opera.android.browser.NavigationEntry;

/* loaded from: classes.dex */
public final class yy3 implements NavigationEntry {
    public final /* synthetic */ zy3 a;

    public yy3(BrowserTabState browserTabState, zy3 zy3Var) {
        this.a = zy3Var;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final boolean a() {
        return this.a.e;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final boolean b() {
        return true;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final byte[] c() {
        return this.a.f;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final String d() {
        return this.a.d;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final byte[] e() {
        return this.a.g;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final int getId() {
        return this.a.a;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final String getTitle() {
        return this.a.c;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final String getUrl() {
        return this.a.b;
    }
}
