package defpackage;

import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class rjh extends y08 implements ti5 {
    public final /* synthetic */ sjh a;

    public rjh(sjh sjhVar) {
        this.a = sjhVar;
    }

    @Override // defpackage.ti5
    public final void B() {
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        boolean z = navigationHandle.h;
        sjh sjhVar = this.a;
        if (z && (navigationHandle.d & 16777216) == 0) {
            sjhVar.l++;
        }
        sjhVar.a();
    }

    @Override // defpackage.ti5
    public final void y() {
        this.a.a();
    }
}
