package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class mu6 {
    public final ydn a;
    public final hd b;

    public mu6(ydn ydnVar, k6l k6lVar, hd hdVar) {
        this.a = ydnVar;
        this.b = hdVar;
        new w43(k6lVar, hdVar, new uk6((Object) this, (byte) 5));
    }

    public final boolean a(b2l b2lVar, String str) {
        if (((d7l) b2lVar).j.m()) {
            return false;
        }
        ydn ydnVar = this.a;
        if (!ydnVar.d.a()) {
            return true;
        }
        if (ydnVar.c.isEnabled()) {
            return false;
        }
        if (str != null) {
            return ydnVar.t(str);
        }
        return true;
    }

    public final void b(String str, b2l b2lVar, jo0 jo0Var) {
        if (a(b2lVar, str)) {
            hd hdVar = this.b;
            if (hdVar.b) {
                String strG = aik.g(str);
                String path = null;
                if (strG.length() == 0) {
                    strG = null;
                }
                try {
                    path = new URL(str).getPath();
                } catch (MalformedURLException unused) {
                }
                if (strG == null || path == null) {
                    return;
                }
                n9a n9aVar = (n9a) hdVar.d;
                w56 w56VarO = n9a.o();
                new bk0(n9aVar, w56VarO).a(strG, new jkc(path, jo0Var, (byte) 29));
                if (((mgh) hdVar.g).c(w56VarO)) {
                    return;
                }
                new rml(Unit.a, (umi) hdVar.c).a(new o5f((Object) hdVar, (byte) 18)).m((qie) hdVar.f);
            }
        }
    }
}
