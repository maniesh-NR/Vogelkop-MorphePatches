package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lpy3;", "", "", "a", "Ljava/lang/Boolean;", "isDefaultBrowserCustomTabsCapable", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class py3 {

    /* renamed from: a, reason: from kotlin metadata */
    @t2j("is_browser_custom_tabs_capable")
    public Boolean isDefaultBrowserCustomTabsCapable;

    public py3() {
        this(0);
    }

    public py3(int i) {
        this.isDefaultBrowserCustomTabsCapable = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof py3) && Intrinsics.a(this.isDefaultBrowserCustomTabsCapable, ((py3) obj).isDefaultBrowserCustomTabsCapable);
    }

    public final int hashCode() {
        Boolean bool = this.isDefaultBrowserCustomTabsCapable;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "BrowserSignals(isDefaultBrowserCustomTabsCapable=" + this.isDefaultBrowserCustomTabsCapable + ")";
    }
}
