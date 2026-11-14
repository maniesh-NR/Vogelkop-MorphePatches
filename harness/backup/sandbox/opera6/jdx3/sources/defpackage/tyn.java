package defpackage;

import com.opera.android.browser.chromium.ChromiumContent;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class tyn extends iz4 {
    public final LinkedHashMap a = new LinkedHashMap();
    public ChromiumContent b;
    public rpf c;

    public tyn(ChromiumContent chromiumContent) {
        this.b = chromiumContent;
        chromiumContent.k(this);
    }

    public final void M() {
        rpf rpfVar = this.c;
        if (rpfVar != null) {
            rpfVar.a();
        }
        this.c = null;
        LinkedHashMap linkedHashMap = this.a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((cej) it.next()).finish(hjm.b);
        }
        linkedHashMap.clear();
        ChromiumContent chromiumContent = this.b;
        if (chromiumContent != null) {
            chromiumContent.y(this);
        }
        this.b = null;
    }

    @Override // defpackage.iz4
    public final void j(ChromiumContent chromiumContent) {
        M();
    }
}
