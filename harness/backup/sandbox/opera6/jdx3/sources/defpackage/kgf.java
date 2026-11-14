package defpackage;

import android.os.Bundle;
import com.opera.android.BrowserActivity;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class kgf extends s0f {
    public final t88 c;
    public final s88 d;
    public final a98 e;

    public kgf(Bundle bundle) {
        s88 s88Var;
        Object next;
        t88 t88Var;
        Object next2;
        super(bundle);
        int i = bundle.getInt("action_open_esim_entry_point_id", -1);
        jgf.a.getClass();
        Iterator it = jgf.c.iterator();
        while (true) {
            s88Var = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ((jgf) next).getClass();
            if (1 == i) {
                break;
            }
        }
        jgf jgfVar = (jgf) next;
        if (jgfVar == null) {
            t88Var = null;
        } else {
            if (hgf.a[jgfVar.ordinal()] != 1) {
                h9o.p();
                throw null;
            }
            String string = bundle.getString("action_open_esim_plan_id");
            if (string == null) {
                throw new djb("action_open_esim_plan_id");
            }
            t88Var = new t88(string);
        }
        this.c = t88Var;
        int i2 = bundle.getInt("action_open_esim_destination_id", -1);
        if (i2 != -1) {
            igf.b.getClass();
            Iterator it2 = igf.d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it2.next();
                    if (((igf) next2).a == i2) {
                        break;
                    }
                }
            }
            igf igfVar = (igf) next2;
            if (igfVar == null) {
                throw new djb("action_open_esim_destination_id", null);
            }
            int iOrdinal = igfVar.ordinal();
            if (iOrdinal == 0) {
                s88Var = m88.a;
            } else if (iOrdinal == 1) {
                s88Var = r88.a;
            } else {
                if (iOrdinal != 2) {
                    h9o.p();
                    throw null;
                }
                s88Var = n88.a;
            }
        }
        this.d = s88Var;
        this.e = !bundle.getBoolean("ESIM_ATTRIBUTION_RESOLVED", false) ? a98.c : new a98(bundle.getString("ESIM_SOURCE"), bundle.getString("ESIM_CAMPAIGN"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s0f
    public final boolean e(BrowserActivity browserActivity) {
        BrowserActivity browserActivityO = q9n.o(browserActivity);
        if (browserActivityO == null) {
            return false;
        }
        new ggf(browserActivityO, this.c, this.e, this.d).execute();
        return true;
    }
}
