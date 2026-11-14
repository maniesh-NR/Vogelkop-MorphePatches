package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.opera.android.Lazy;
import com.opera.android.bookmarks.h;
import com.opera.android.undo.UndoBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class ul3 {
    public final in3 a;
    public final x5f b;
    public final i53 c;
    public final Lazy d;
    public final gx3 e;
    public final gx3 f;
    public final fx3 g;
    public final ole h = new ole(this);
    public UndoBar i;

    public ul3(in3 in3Var, x5f x5fVar, i53 i53Var, Lazy lazy, gx3 gx3Var, gx3 gx3Var2, fx3 fx3Var) {
        this.a = in3Var;
        this.b = x5fVar;
        this.c = i53Var;
        this.d = lazy;
        this.e = gx3Var;
        this.f = gx3Var2;
        this.g = fx3Var;
    }

    public final void a() {
        b2l b2lVar = ((k6l) this.f.get()).o;
        if (b2lVar != null) {
            d7l d7lVar = (d7l) b2lVar;
            if (TextUtils.isEmpty(d7lVar.l0()) || d7lVar.n0()) {
                return;
            }
            String url = d7lVar.j.getUrl();
            String strH0 = d7lVar.h0();
            in3 in3Var = this.a;
            in3Var.getClass();
            ArrayList arrayList = in3Var.b;
            i53 i53Var = in3Var.a;
            if (!z5i.a0(url)) {
                url = strH0;
            }
            al3 al3VarC = i53Var.c(url);
            pl3 pl3Var = null;
            if (al3VarC == null || arrayList.contains(al3VarC)) {
                al3VarC = null;
            }
            if (al3VarC != null) {
                b(al3VarC);
                return;
            }
            String strL0 = d7lVar.l0();
            String url2 = z5i.a0(d7lVar.j.getUrl()) ? d7lVar.j.getUrl() : d7lVar.h0();
            h hVar = (h) i53Var;
            al3 al3VarM = hVar.m(((SharedPreferences) hVar.j.get()).getLong("last_folder", -1L), true);
            ml3 ml3VarO = al3VarM instanceof ml3 ? (ml3) al3VarM : null;
            if (ml3VarO == null) {
                ml3VarO = ((h) i53Var).o();
            }
            if (y9m.p(arrayList).remove(i53Var.c(url2))) {
                in3Var.a();
            } else {
                pl3Var = (pl3) h.i(lkj.k(-1L, strL0, url2), ml3VarO);
            }
            byte b = 0;
            if (pl3Var != null) {
                ysj ysjVar = ((qim) this.e.get()).e;
                tl3 tl3Var = new tl3(this, pl3Var, b);
                ysjVar.getClass();
                ysjVar.b(tl3Var, ijm.b);
                return;
            }
            UndoBar undoBar = this.i;
            if (undoBar != null) {
                mhk mhkVar = (mhk) undoBar.c.b;
                mhkVar.b = 0;
                ((LinkedList) mhkVar.c).clear();
                undoBar.a(false);
            }
        }
    }

    public final void b(al3 al3Var) {
        ss7 ts7Var;
        ll9 ll9Var = ((qim) this.e.get()).b;
        gjm gjmVar = (gjm) this.g.get();
        boolean zG = al3Var.g();
        w80 w80Var = w80.c;
        ole oleVar = this.h;
        if (zG) {
            ts7Var = new as(gjmVar);
            ss7.L0(al3Var, null, ts7Var, w80Var, oleVar);
        } else {
            ts7Var = new ts7();
            ss7.L0(al3Var, null, ts7Var, w80Var, oleVar);
        }
        ll9Var.b(new zhj(new wzg(ts7Var, ts7Var.getClass(), (byte) 4), null, 2, -1, null, false, Arrays.asList(new n6h[0])));
    }
}
