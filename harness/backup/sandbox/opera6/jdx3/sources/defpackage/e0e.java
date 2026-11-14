package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0e extends f0e {
    public static final cyj n = new cyj(jsc.d, null, null, new rxj(0, 0), null, null, null, null, 246);
    public final s9i i;
    public final qz j;
    public final kol k;
    public zzd l;
    public zzd m;

    public e0e(sf2 sf2Var, pde pdeVar, pde pdeVar2, yhe yheVar, pde pdeVar3, yqa yqaVar, s9i s9iVar, s2 s2Var) {
        super(sf2Var, pdeVar, pdeVar2, yheVar, pdeVar3);
        this.i = s9iVar;
        tsd tsdVarB = xf8.B(xf8.V(pdeVar2, new uvc((byte) 13)));
        this.j = new qz(this, (byte) 13);
        ImageView imageView = sf2Var.b;
        this.k = new kol(imageView.getContext(), this.f, tsdVarB, yqaVar, new rkc((Object) sf2Var, (byte) 17));
        this.f.k(new iwa(new rkc((Object) this, (byte) 18), (byte) 9));
        imageView.setOnClickListener(new jf7(this, s2Var, (byte) 24));
        a26.T((pde) s9iVar.c, this.f, new d8d(this, (byte) 7));
    }

    @Override // defpackage.f0e
    public final View V() {
        b2l b2lVar;
        zzd zzdVar = this.m;
        if (zzdVar == null) {
            return null;
        }
        int id = ((d7l) zzdVar.a).j.getId();
        RecyclerView recyclerView = ((z5l) this.d.b).f;
        h6n it = new g6n(recyclerView).iterator();
        while (true) {
            h6n h6nVar = it;
            if (!h6nVar.hasNext()) {
                return null;
            }
            View view = (View) h6nVar.next();
            i iVarT = recyclerView.T(view);
            if ((iVarT instanceof h5l) && (b2lVar = (b2l) CollectionsKt.firstOrNull(((h5l) iVarT).X())) != null && id == ((d7l) b2lVar).j.getId()) {
                return view;
            }
        }
    }

    public final void X() {
        zzd zzdVar = this.m;
        if (zzdVar != null) {
            b2l b2lVar = zzdVar.a;
            ImageView imageView = this.b.b;
            s9i s9iVar = this.i;
            imageView.setSelected(s9iVar.Y() && ((LinkedHashSet) ((pde) s9iVar.c).g()).contains(b2lVar));
        }
    }

    public final void Y() {
        zzd zzdVar = this.m;
        if (zzdVar != null) {
            b2l b2lVar = zzdVar.a;
            d7l d7lVar = (d7l) b2lVar;
            String strH0 = d7lVar.h0();
            this.k.j(new fol(d7lVar.j.getId(), b2lVar.T(), strH0));
        }
    }

    public final void Z() {
        zzd zzdVar = Intrinsics.a(this.f.g(), ng.a) ? this.l : null;
        if (Intrinsics.a(zzdVar, this.m)) {
            return;
        }
        zzd zzdVar2 = this.m;
        qz qzVar = this.j;
        if (zzdVar2 != null) {
            ((d7l) zzdVar2.a).H(qzVar);
        }
        this.m = zzdVar;
        if (zzdVar != null) {
            ((d7l) zzdVar.a).F(qzVar);
            Y();
            X();
        }
    }
}
