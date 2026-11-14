package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zld extends d {
    public final RecyclerView a;
    public final xbf b;
    public final z0c c;
    public final we7 d = new we7(this, new xld(this), (byte) 4);
    public final mig e = new mig(new yld(this));
    public final fql f = new fql();
    public List g;
    public List h;
    public boolean i;

    public zld(RecyclerView recyclerView, xbf xbfVar, z0c z0cVar) {
        List list = Collections.EMPTY_LIST;
        this.g = list;
        this.h = list;
        this.a = recyclerView;
        this.b = xbfVar;
        this.c = z0cVar;
        setHasStableIds(true);
        H();
    }

    public final void G() {
        int iIndexOf;
        qjd qjdVarG = ((gig) ((ode) this.b.c).g()).g();
        if (qjdVarG == null || (iIndexOf = this.h.indexOf(qjdVarG)) == -1) {
            return;
        }
        this.a.x0(iIndexOf);
    }

    public final void H() {
        this.i = false;
        gig gigVar = (gig) ((ode) this.b.c).g();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < gigVar.p(); i++) {
            arrayList.add(gigVar.Q(i));
        }
        this.g = arrayList;
        this.h = gigVar.getShuffleModeEnabled() ? w7d.C(gigVar) : this.g;
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        return this.h.size();
    }

    public final long getItemId(int i) {
        return ((qjd) this.h.get(i)).hashCode();
    }

    public final void onBindViewHolder(i iVar, int i) {
        cmd cmdVar = (cmd) iVar;
        qjd qjdVar = (qjd) this.h.get(i);
        qjd qjdVar2 = (qjd) this.h.get(i);
        gql currentTimeline = ((gig) ((ode) this.b.c).g()).getCurrentTimeline();
        int iIndexOf = this.g.indexOf(qjdVar2);
        fql fqlVar = this.f;
        currentTimeline.n(iIndexOf, fqlVar);
        long jC0 = tym.c0(fqlVar.l);
        if (jC0 == -9223372036854775807L) {
            Bundle bundle = qjdVar2.e.I;
            jC0 = bundle != null ? bundle.getLong("android.media.metadata.DURATION", -9223372036854775807L) : -9223372036854775807L;
        }
        cmdVar.e = qjdVar;
        cmdVar.f = jC0;
        ((StylingTextView) cmdVar.c.f).setText(qjdVar.e.a);
        cmdVar.g = ((tjg) cmdVar.b.b).k(qjdVar);
        cmdVar.U();
        cmdVar.V();
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new cmd(this.b, j7c.n(viewGroup, 2131559052, viewGroup, false), new yzb((Object) this, (byte) 28), this.c);
    }
}
