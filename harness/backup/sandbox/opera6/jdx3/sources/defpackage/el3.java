package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.opera.android.bookmarks.c;
import com.opera.android.bookmarks.h;
import com.opera.android.widget.SelectableRelativeLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class el3 extends d {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final boolean d;
    public final w8l e;
    public final /* synthetic */ fl3 f;
    public final /* synthetic */ fl3 g;

    public el3(fl3 fl3Var, jl3 jl3Var, boolean z) {
        this.g = fl3Var;
        fl3Var.getResources();
        w8l w8lVar = new w8l((byte) 4);
        this.f = fl3Var;
        this.a = new ArrayList();
        this.b = 2131558550;
        this.c = 2131558550;
        this.d = z;
        this.e = w8lVar;
        H(jl3Var);
    }

    public final boolean G(Resources resources, String str) {
        String strTrim = str.trim();
        if (!strTrim.isEmpty()) {
            ArrayList arrayList = this.f.u.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ll3 ll3Var = (ll3) obj;
                if (ll3Var.d() == 2 && !(ll3Var instanceof kl3) && !(ll3Var instanceof gl3)) {
                    String strC = ll3Var.c(resources);
                    if (strTrim.equals(strC != null ? strC.trim() : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void H(jl3 jl3Var) {
        c cVarP;
        fl3 fl3Var = this.f;
        fl3Var.t = null;
        ArrayList arrayList = this.a;
        arrayList.clear();
        ml3 ml3Var = (ml3) jl3Var.a;
        List<al3> listI = ml3Var.i();
        ArrayList arrayList2 = new ArrayList(listI.size());
        h hVar = (h) jl3Var.b;
        if (ml3Var.h() && alo.G(hVar)) {
            arrayList2.add(new gl3(hVar.l(), hVar, true));
        }
        if (ml3Var.h() && hVar.t() && (cVarP = hVar.p()) != null) {
            arrayList2.add(new jl3(cVarP, hVar, true));
        }
        for (al3 al3Var : listI) {
            arrayList2.add(al3Var.g() ? new jl3((ml3) al3Var, hVar, true) : new il3((pl3) al3Var));
        }
        arrayList.addAll(arrayList2);
        if (this.d) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((ll3) it.next()).d() != 2) {
                    it.remove();
                }
            }
        }
        w8l w8lVar = this.e;
        if (w8lVar != null) {
            Collections.sort(arrayList, w8lVar);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (((ll3) obj).d() != 2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i > 0 && i < arrayList.size()) {
                arrayList.add(i, new hl3(lkj.k(-1L, "", "")));
            }
            if (!((ml3) jl3Var.a).h()) {
                kl3 kl3Var = new kl3((ml3) jl3Var.f().a, this.g.C, true);
                fl3Var.t = kl3Var;
                arrayList.add(0, kl3Var);
            }
        }
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final int getItemViewType(int i) {
        return vep.A(((ll3) this.a.get(i)).d());
    }

    public final void onBindViewHolder(i iVar, int i) {
        z5m z5mVar = (z5m) iVar;
        ArrayList arrayList = this.a;
        z5mVar.U((ll3) arrayList.get(i));
        ll3 ll3Var = (ll3) arrayList.get(i);
        if (ll3Var.d() == 2) {
            fl3 fl3Var = this.g;
            fl3Var.getClass();
            al3 al3Var = ((jl3) ll3Var).a;
            ArrayList arrayList2 = fl3Var.A;
            int size = arrayList2.size();
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i2);
                i2++;
                al3 al3Var2 = (al3) obj;
                if (!((al3Var2 == null || !al3Var2.g()) ? true : al3Var2.equals(al3Var) ? false : !al3Var.e((ml3) al3Var2))) {
                    z = true;
                    break;
                }
            }
            ((SelectableRelativeLayout) ((i) z5mVar).itemView).d(z);
            ((i) z5mVar).itemView.setSelected(z);
            ((i) z5mVar).itemView.setEnabled(!z);
        }
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        int iA = vep.A(vep.B(3)[i]);
        fl3 fl3Var = this.g;
        if (iA == 0) {
            View viewInflate = layoutInflaterFrom.inflate(this.b, viewGroup, false);
            eme emeVar = ((h) fl3Var.C).m;
            Objects.requireNonNull(emeVar);
            return new cl3(fl3Var, viewInflate, emeVar);
        }
        if (iA == 1) {
            return new y5m(fl3Var, layoutInflaterFrom.inflate(this.c, viewGroup, false));
        }
        if (iA != 2) {
            throw new RuntimeException(null, null);
        }
        View viewInflate2 = layoutInflaterFrom.inflate(2131559309, viewGroup, false);
        Objects.requireNonNull(fl3Var);
        return new z5m(viewInflate2);
    }

    public final void onViewRecycled(i iVar) {
        z5m z5mVar = (z5m) iVar;
        z5mVar.V();
        super.onViewRecycled(z5mVar);
    }
}
