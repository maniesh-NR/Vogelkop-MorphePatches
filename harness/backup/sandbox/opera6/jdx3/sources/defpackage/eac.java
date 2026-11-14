package defpackage;

import android.content.Intent;
import com.leanplum.Leanplum;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class eac extends y08 {
    public final r9c a;
    public final k6l b;
    public final du3 c;
    public final boolean d;
    public boolean e;

    public eac(r9c r9cVar, k6l k6lVar, du3 du3Var) {
        this.a = r9cVar;
        this.b = k6lVar;
        this.c = du3Var;
        boolean z = r9cVar.a;
        this.d = z;
        if (z) {
            k6lVar.a(this);
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        if (((d7l) b2lVar).n0()) {
            X();
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void G(b2l b2lVar) {
        if (((d7l) b2lVar).n0()) {
            X();
        }
    }

    public final void W(Intent intent) {
        b2l b2lVar;
        this.e = true;
        if ((intent == null || intent.getAction() == null || intent.getAction().equals("android.intent.action.MAIN")) && this.d && (b2lVar = this.b.o) != null) {
            if (((d7l) b2lVar).n0()) {
                X();
            } else if (((Boolean) this.c.get()).booleanValue()) {
                this.a.getClass();
                Leanplum.trackLocal("User resumed app on web page");
            }
        }
    }

    public final void X() {
        if (this.e && ((Boolean) this.c.get()).booleanValue()) {
            this.a.getClass();
            Leanplum.trackLocal("User entered start page");
        }
    }
}
