package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.mediarouter.app.OperaMediaRouteActionProvider;

/* loaded from: classes.dex */
public abstract class ff {
    public final Context a;
    public ne b;
    public wub c;

    public ff(Context context) {
        this.a = context;
    }

    public boolean a() {
        return this instanceof ShareActionProvider;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(ptd ptdVar) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(akk akkVar) {
    }

    public boolean g() {
        return this instanceof OperaMediaRouteActionProvider;
    }

    public final void h() {
        wub wubVar = this.c;
        if (wubVar != null) {
            b();
            itd itdVar = ((ptd) wubVar.a).n;
            itdVar.h = true;
            itdVar.p(true);
        }
    }

    public void i(wub wubVar) {
        this.c = wubVar;
    }

    public final void j(boolean z) {
        ne neVar = this.b;
        if (neVar != null) {
            if (z) {
                kud kudVar = neVar.e;
                if (kudVar != null) {
                    kudVar.p(neVar.c);
                    return;
                }
                return;
            }
            itd itdVar = neVar.c;
            if (itdVar != null) {
                itdVar.c(false);
            }
        }
    }
}
