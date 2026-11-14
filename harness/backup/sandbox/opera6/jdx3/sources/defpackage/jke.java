package defpackage;

import com.opera.android.browser.NavigationEntry;
import com.opera.android.browser.NavigationHistory;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.HashMap;

/* loaded from: classes.dex */
public interface jke extends NavigationHistory {
    void B(ChromiumContent chromiumContent, int i, HashMap map);

    void X(NavigationEntry navigationEntry, boolean z);

    void c();

    boolean isDestroyed();

    void l(int i);

    void u();
}
