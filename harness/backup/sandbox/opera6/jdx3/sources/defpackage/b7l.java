package defpackage;

import com.opera.android.browser.NavigationEntry;
import com.opera.android.browser.NavigationHistory;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class b7l {
    public final /* synthetic */ d7l a;

    public b7l(d7l d7lVar) {
        this.a = d7lVar;
    }

    public final void a(NavigationHandle navigationHandle) {
        boolean z = navigationHandle.h;
        d7l d7lVar = this.a;
        if (z) {
            iuh iuhVar = (iuh) d7lVar.i();
            NavigationHistory navigationHistory = (NavigationHistory) iuhVar.b;
            if (navigationHistory.d() > 0) {
                NavigationEntry navigationEntryI = iuhVar.i(navigationHistory.j());
                w6j w6jVar = d7lVar.e;
                knf knfVarI = w6jVar.i(navigationEntryI.getId(), navigationEntryI.getUrl());
                knf knfVar = (knf) w6jVar.d;
                if (knfVarI != knfVar) {
                    w6jVar.d = knfVarI;
                    d7l d7lVar2 = (d7l) w6jVar.e;
                    if (d7lVar2.j.isActive()) {
                        if (knfVar != null) {
                            knfVar.a();
                        }
                        if (knfVarI != null) {
                            knfVarI.F();
                        }
                        d7lVar2.p0();
                    }
                }
            }
        }
        h7f h7fVar = d7lVar.g;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((a2l) g7fVarH.next()).E(d7lVar, navigationHandle);
        }
        d7lVar.p0();
    }

    public final void b() {
        d7l d7lVar = this.a;
        h7f h7fVar = d7lVar.g;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((a2l) g7fVarH.next()).v(d7lVar);
        }
    }

    public final void c(NavigationHandle navigationHandle) {
        d7l d7lVar = this.a;
        h7f h7fVar = d7lVar.g;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((a2l) g7fVarH.next()).Q(d7lVar, navigationHandle);
        }
        d7lVar.p0();
    }

    public final void d() {
        d7l d7lVar = this.a;
        h7f h7fVar = d7lVar.g;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((a2l) g7fVarH.next()).j(d7lVar);
        }
    }
}
