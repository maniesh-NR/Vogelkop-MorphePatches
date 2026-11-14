package defpackage;

import J.N;
import android.net.Uri;
import com.opera.android.browser.SimpleUrlLoader;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class ynj implements hh4 {
    public final doj a;
    public final deg b;
    public final qfl c;
    public final qnl d;
    public final hoj e;
    public hh4 f;
    public hh4 g;
    public SimpleUrlLoader h;
    public nwa i;
    public boolean j;
    public final /* synthetic */ eoj k;

    public ynj(eoj eojVar, doj dojVar, deg degVar, qfl qflVar, boolean z, qnl qnlVar) {
        hoj hojVar;
        x4l x4lVar;
        hh4 i9cVar;
        z4l z4lVar;
        hh4 hdVar;
        String str = dojVar.a;
        this.k = eojVar;
        this.a = dojVar;
        this.b = degVar;
        this.c = qflVar;
        this.d = qnlVar;
        p6l p6lVar = dojVar.b;
        int iOrdinal = p6lVar.ordinal();
        if (iOrdinal == 0) {
            hojVar = eojVar.c;
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                throw null;
            }
            hojVar = eojVar.d;
        }
        this.e = hojVar;
        eojVar.e.add(this);
        a5l a5lVar = eojVar.b;
        if (!z) {
            xnj xnjVar = new xnj(this, (byte) 0);
            a5lVar.getClass();
            int iOrdinal2 = p6lVar.ordinal();
            if (iOrdinal2 == 0) {
                x4lVar = (x4l) ((LinkedHashMap) a5lVar.c.b).get(str);
            } else {
                if (iOrdinal2 != 1) {
                    h9o.p();
                    throw null;
                }
                x4lVar = (x4l) ((LinkedHashMap) a5lVar.d.b).get(str);
            }
            if (x4lVar == null || x4lVar.b()) {
                i9cVar = new i9c(a5lVar, str, p6lVar, xnjVar);
            } else {
                xnjVar.invoke(x4lVar);
                i9cVar = a5l.l;
            }
            this.g = i9cVar;
            return;
        }
        hda hdaVar = new hda(this, eojVar, (byte) 29);
        a5lVar.getClass();
        gpk gpkVar = a5l.l;
        Uri uri = Uri.parse(str);
        String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).build().toString();
        int iOrdinal3 = p6lVar.ordinal();
        if (iOrdinal3 == 0) {
            z4lVar = (z4l) ((LinkedHashMap) a5lVar.c.c).get(new y4l(string));
        } else {
            if (iOrdinal3 != 1) {
                h9o.p();
                throw null;
            }
            z4lVar = (z4l) ((LinkedHashMap) a5lVar.d.c).get(new y4l(string));
        }
        if (z4lVar != null) {
            hdaVar.invoke(Integer.valueOf(z4lVar.a), Integer.valueOf(z4lVar.b));
            hdVar = a5l.l;
        } else {
            hdVar = new hd(a5lVar, string, p6lVar, new n6k((Object) hdaVar, (byte) 19));
        }
        this.f = hdVar;
    }

    public final void a(coj cojVar) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.k.e.remove(this);
        this.d.invoke(cojVar);
    }

    @Override // defpackage.hh4
    public final void cancel() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.k.e.remove(this);
        hh4 hh4Var = this.f;
        if (hh4Var != null) {
            hh4Var.cancel();
        }
        hh4 hh4Var2 = this.g;
        if (hh4Var2 != null) {
            hh4Var2.cancel();
        }
        SimpleUrlLoader simpleUrlLoader = this.h;
        if (simpleUrlLoader != null) {
            long j = simpleUrlLoader.a;
            if (j != 0) {
                N.Mnq_7cIN(j);
                simpleUrlLoader.a = 0L;
            }
        }
        nwa nwaVar = this.i;
        if (nwaVar != null) {
            this.b.a(nwaVar);
        }
    }
}
