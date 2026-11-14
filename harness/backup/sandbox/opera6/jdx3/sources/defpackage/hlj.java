package defpackage;

import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.NavigationEntry;
import com.opera.android.browser.UrlMangler;

/* loaded from: classes.dex */
public final class hlj implements NavigationEntry {
    public final /* synthetic */ int a;
    public final /* synthetic */ lsc b;

    public hlj(int i, lsc lscVar) {
        this.a = i;
        this.b = lscVar;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final boolean a() {
        return this.b.h == 2;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final boolean b() {
        return true;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final byte[] c() {
        return null;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final String d() {
        return this.b.a;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final byte[] e() {
        return null;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final int getId() {
        return this.a;
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final String getTitle() {
        return UrlMangler.a(this.b.a, "title");
    }

    @Override // com.opera.android.browser.NavigationEntry
    public final String getUrl() {
        return BrowserUtils.getRendererUrl(this.b.a);
    }
}
