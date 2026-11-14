package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class ha2 extends d implements rjm {
    public final ArrayList a = new ArrayList();
    public final LinkedHashMap b = new LinkedHashMap();
    public final aan c = new aan();
    public final f1p d;
    public final ix5 e;
    public final tni f;
    public final tk g;
    public final ga2 h;
    public RecyclerView i;
    public byte j;

    public ha2(tni tniVar) {
        f1p f1pVar = new f1p((byte) 4);
        this.d = f1pVar;
        this.e = new ix5((byte) 27);
        tk tkVar = new tk(this, (byte) 1);
        this.g = tkVar;
        ga2 ga2Var = new ga2(this);
        this.h = ga2Var;
        this.j = (byte) 1;
        this.f = tniVar;
        tniVar.a(tkVar);
        ((HashMap) f1pVar.b).put(rjm.class, ga2Var);
        setHasStableIds(true);
    }

    public static View M(ViewGroup viewGroup, int i, int i2) {
        Context context = viewGroup.getContext();
        if (i2 != 0) {
            context = new dkf(context, i2);
        }
        return LayoutInflater.from(context).inflate(i, viewGroup, false);
    }

    public static void X(ab2 ab2Var) {
        ViewGroup.LayoutParams layoutParams = ((i) ab2Var).itemView.getLayoutParams();
        if (layoutParams instanceof y2k) {
            y2k y2kVar = (y2k) layoutParams;
            boolean z = ab2Var.U() == -1;
            if (y2kVar.f == z) {
                return;
            }
            y2kVar.f = z;
            ((i) ab2Var).itemView.setLayoutParams(layoutParams);
        }
    }

    public final void G(fa2 fa2Var) {
        fa2Var.S().d(0, this.a);
        this.b.put(fa2Var.g(), fa2Var);
        notifyDataSetChanged();
    }

    public final void H(int i, ja2 ja2Var) {
        this.a.add(i, ja2Var);
        notifyItemInserted(i);
    }

    public final void I(u0g u0gVar) {
        Iterator it = Collections.unmodifiableCollection(this.b.values()).iterator();
        while (it.hasNext()) {
            ((fa2) it.next()).v();
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ja2 ja2Var = (ja2) obj;
            ja2Var.a = u0gVar == null ? null : (u0g) u0gVar.get(ja2Var.hashCode());
        }
        bmb it2 = sfe.R((i7f) this.d.a, ya2.class).iterator();
        while (true) {
            bmb bmbVar = it2;
            if (!bmbVar.hasNext()) {
                return;
            } else {
                ((ya2) bmbVar.next()).R();
            }
        }
    }

    public final ja2 J(int i) {
        return (ja2) this.a.get(i);
    }

    public final boolean K(Class cls) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (cls.isAssignableFrom(((ja2) obj).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final int L(Class cls) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (cls.isInstance((ja2) obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // 
    /* renamed from: P */
    public ab2 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ab2 ab2VarK = ((fa2) it.next()).j().k(viewGroup, i);
            if (ab2VarK != null) {
                return ab2VarK;
            }
        }
        String strValueOf = String.valueOf(i);
        if (i != 0) {
            strValueOf = viewGroup.getResources().getResourceEntryName(i);
        }
        yt7.k(String.format(Locale.getDefault(), "No view holder for layout number = [ %d ], layout name = [ %s ]", Integer.valueOf(i), strValueOf));
        return null;
    }

    public void T(ab2 ab2Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void onViewRecycled(ab2 ab2Var) {
        f1p f1pVar = this.d;
        if (((i7f) f1pVar.a).c(ab2Var)) {
            for (Map.Entry entry : ((HashMap) f1pVar.b).entrySet()) {
                if (((Class) entry.getKey()).isInstance(ab2Var)) {
                    ga2 ga2Var = (ga2) entry.getValue();
                    ga2Var.getClass();
                    rjm rjmVar = (rjm) ab2Var;
                    sjm sjmVar = ga2Var.a;
                    qjm qjmVar = sjm.b;
                    if (!sjmVar.equals(qjmVar)) {
                        rjmVar.b(qjmVar);
                    }
                }
            }
            aan aanVar = this.c;
            aanVar.getClass();
            if (ab2Var instanceof y9n) {
                aanVar.a(((i) ab2Var).itemView);
            }
            xf8.G0(ab2Var.c, og.a);
            ab2Var.Y();
            ab2Var.b = null;
        }
    }

    public final void V(ja2 ja2Var) {
        ArrayList arrayList = this.a;
        int iIndexOf = arrayList.indexOf(ja2Var);
        if (iIndexOf == -1) {
            return;
        }
        arrayList.remove(iIndexOf);
        notifyItemRemoved(iIndexOf);
    }

    public final void W(ja2 ja2Var, ja2 ja2Var2) {
        ArrayList arrayList = this.a;
        int iIndexOf = arrayList.indexOf(ja2Var);
        if (iIndexOf < 0) {
            return;
        }
        RecyclerView recyclerView = this.i;
        if (recyclerView != null && recyclerView.b0()) {
            this.i.post(new k3(this, ja2Var, ja2Var2, (byte) 12));
        } else {
            arrayList.set(iIndexOf, ja2Var2);
            notifyItemChanged(iIndexOf);
        }
    }

    @Override // defpackage.rjm
    public final void b(sjm sjmVar) {
        Iterator it = Collections.unmodifiableCollection(this.b.values()).iterator();
        while (it.hasNext()) {
            ((fa2) it.next()).b(sjmVar);
        }
        this.h.b(sjmVar);
        this.c.b(sjmVar.a);
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final long getItemId(int i) {
        return J(i).hashCode();
    }

    public final int getItemViewType(int i) {
        fa2 fa2Var;
        ja2 ja2VarJ = J(i);
        Class<?> cls = ja2VarJ.getClass();
        Class<?> superclass = cls;
        while (true) {
            if (!superclass.equals(ja2.class)) {
                fa2Var = (fa2) this.b.get(superclass);
                if (fa2Var != null) {
                    break;
                }
                superclass = superclass.getSuperclass();
            } else {
                fa2Var = null;
                break;
            }
        }
        if (fa2Var == null) {
            yt7.k("Unsupported item: ".concat(cls.getName()));
            return 0;
        }
        ea2 ea2VarJ = fa2Var.j();
        int iQ = ea2VarJ.q(ja2VarJ, i, new ca2(this.f.b, this.j));
        if (iQ != 0) {
            return iQ;
        }
        throw new UnsupportedOperationException("No layout for item " + cls.getName() + " in " + ea2VarJ.getClass().getName() + " view factory");
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.i = recyclerView;
        this.c.e(recyclerView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBindViewHolder(i iVar, int i) {
        ab2 ab2Var = (ab2) iVar;
        X(ab2Var);
        kze kzeVar = ab2Var.c;
        ja2 ja2VarJ = J(i);
        ja2 ja2Var = ab2Var.b;
        boolean z = false;
        if (ja2Var != null) {
            if (ja2Var.equals(ja2VarJ)) {
                z = true;
            } else {
                xf8.G0(kzeVar, og.a);
                ab2Var.Y();
                ab2Var.b = null;
            }
        }
        ab2Var.b = ja2VarJ;
        ab2Var.V(ja2VarJ, z);
        xf8.G0(kzeVar, ng.a);
        ab2Var.X(z);
        this.c.f(ab2Var);
        f1p f1pVar = this.d;
        if (((i7f) f1pVar.a).b(ab2Var)) {
            for (Map.Entry entry : ((HashMap) f1pVar.b).entrySet()) {
                if (((Class) entry.getKey()).isInstance(ab2Var)) {
                    ga2 ga2Var = (ga2) entry.getValue();
                    ga2Var.getClass();
                    rjm rjmVar = (rjm) ab2Var;
                    if (!ga2Var.a.equals(sjm.b)) {
                        rjmVar.b(ga2Var.a);
                    }
                }
            }
        }
        this.e.getClass();
    }

    public final void onDestroy() {
        this.f.c(this.g);
        Iterator it = Collections.unmodifiableCollection(this.b.values()).iterator();
        while (it.hasNext()) {
            ((fa2) it.next()).onDestroy();
        }
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        aan aanVar = this.c;
        recyclerView.t0(aanVar.d);
        z61 z61Var = aanVar.e;
        if (z61Var != null) {
            recyclerView.removeOnAttachStateChangeListener(z61Var);
            if (recyclerView.isAttachedToWindow()) {
                recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) z61Var.b);
            }
            aanVar.e = null;
        }
        this.i = null;
    }

    public /* bridge */ /* synthetic */ boolean onFailedToRecycleView(i iVar) {
        T((ab2) iVar);
        return true;
    }

    public final void onViewAttachedToWindow(i iVar) {
        ab2 ab2Var = (ab2) iVar;
        super.onViewAttachedToWindow(ab2Var);
        ab2Var.getClass();
        if (ab2Var.getAdapterPosition() != -1) {
            X(ab2Var);
        }
    }

    public final void onViewDetachedFromWindow(i iVar) {
        ab2 ab2Var = (ab2) iVar;
        ab2Var.getClass();
        super.onViewDetachedFromWindow(ab2Var);
    }
}
