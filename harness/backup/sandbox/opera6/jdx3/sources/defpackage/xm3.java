package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.google.android.material.button.MaterialButton;
import com.opera.android.bookmarks.ImportBookmarksBanner;
import com.opera.android.bookmarks.b;
import com.opera.android.bookmarks.c;
import com.opera.android.bookmarks.h;
import com.opera.android.custom_views.StylingImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class xm3 extends d implements ql3, kkm {
    public final h a;
    public final HashSet b;
    public ml3 c;
    public final c5o d;
    public xvj e;
    public Boolean f;
    public Boolean g;
    public final qhc h;
    public int i;
    public boolean j;
    public int k;
    public final /* synthetic */ gn3 l;

    public xm3(gn3 gn3Var, i53 i53Var, int i) {
        Objects.requireNonNull(gn3Var);
        this.l = gn3Var;
        this.b = new HashSet();
        c5o c5oVar = new c5o();
        c5oVar.b = this;
        this.d = c5oVar;
        this.h = new qhc(lkj.k(-2L, "", ""), 6);
        this.k = -1;
        this.a = (h) i53Var;
        this.i = i;
        this.e = new xvj(qhc.class, new k53(this, this, i));
        setHasStableIds(true);
        registerAdapterDataObserver(new j53(this));
    }

    public static boolean G(Object obj, ml3 ml3Var) {
        return obj == null ? ml3Var == null : obj.equals(ml3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    @Override // defpackage.ql3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(defpackage.al3 r10, defpackage.ml3 r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm3.A(al3, ml3):void");
    }

    @Override // defpackage.ql3
    public final void D(Collection collection, ml3 ml3Var) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.l.A.d(qhc.b((al3) it.next()));
        }
        if (!G(this.c, ml3Var)) {
            P(ml3Var);
        } else {
            this.d.a = null;
            L(alo.k(collection));
        }
    }

    @Override // defpackage.ql3
    public final void E() {
        this.j = true;
    }

    public final qhc H(int i) {
        return (qhc) this.e.f(i);
    }

    public final int I(qhc qhcVar) {
        int i = 0;
        while (true) {
            xvj xvjVar = this.e;
            if (i >= xvjVar.h) {
                return -1;
            }
            if (((qhc) xvjVar.f(i)).equals(qhcVar)) {
                return i;
            }
            i++;
        }
    }

    public final void J() {
        List listK;
        c cVarP;
        gn3 gn3Var = this.l;
        tzi tziVar = gn3Var.u;
        h hVar = gn3Var.b;
        tziVar.a.clear();
        c5o c5oVar = this.d;
        ml3 ml3VarA = null;
        c5oVar.a = null;
        this.f = null;
        this.g = null;
        this.e.d();
        this.e = new xvj(qhc.class, new k53(this, this, this.i));
        ml3 ml3Var = this.c;
        if (ml3Var == null) {
            listK = Collections.EMPTY_LIST;
        } else {
            List listI = (List) c5oVar.a;
            if (listI == null) {
                ml3 ml3Var2 = ((xm3) c5oVar.b).c;
                listI = ml3Var2 == null ? Collections.EMPTY_LIST : ml3Var2.i();
                c5oVar.a = listI;
            }
            listK = alo.k(listI);
        }
        if (ml3Var != null) {
            ml3 ml3VarA2 = gn3Var.a();
            if (ml3VarA2 != null && !ml3VarA2.h()) {
                ml3VarA = ml3VarA2.a(hVar.o());
            }
            if (ml3VarA != null) {
                listK.add(new qhc(ml3VarA, 2));
            } else {
                if (alo.G(hVar)) {
                    listK.add(qhc.b(hVar.l()));
                }
                boolean z = alo.j;
                if (!z) {
                    z = !hVar.n().isEmpty();
                    boolean z2 = alo.j;
                    if (z2 != z) {
                        alo.j = z;
                    } else {
                        z = z2;
                    }
                }
                if (z) {
                    listK.add(qhc.b(hVar.n()));
                }
                if (hVar.t() && (cVarP = hVar.p()) != null) {
                    listK.add(new qhc(cVarP, 5));
                }
                db dbVar = gn3Var.i;
                zwk zwkVar = gn3Var.h;
                if (!xgh.a && xgh.s(dbVar, zwkVar)) {
                    listK.add(0, new qhc(lkj.k(-2L, "", ""), 8));
                } else if (gn3Var.H.R(1)) {
                    listK.add(0, new qhc(lkj.k(-2L, "", ""), 7));
                } else if (!listK.isEmpty() && hVar.s()) {
                    listK.add(0, new qhc(lkj.k(-2L, "", ""), 9));
                }
            }
        }
        this.e.c(listK);
        xw xwVar = gn3Var.D;
        if (xwVar != null) {
            xwVar.b();
        }
    }

    public final void K(qhc qhcVar) {
        if (qhcVar == null) {
            return;
        }
        L(Collections.singletonList(qhcVar));
    }

    public final void L(List list) {
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            int I = I((qhc) it.next());
            if (I != -1) {
                xvj xvjVar = this.e;
                xvjVar.i();
                xvjVar.f(I);
                xvjVar.h(I, true);
                z = true;
            }
        }
        if (z) {
            List list2 = list;
            gn3 gn3Var = this.l;
            xw xwVar = gn3Var.D;
            if (xwVar == null || !list2.contains(xwVar.h)) {
                return;
            }
            gn3Var.D.b();
        }
    }

    public final void M() {
        gn3 gn3Var = this.l;
        gn3Var.y.q();
        this.e.d();
        this.e = new xvj(qhc.class, new k53(this, this, 1));
        ne5 ne5Var = gn3Var.f;
        rm3 rm3Var = gn3Var.y;
        String str = (String) rm3Var.a;
        String[] strArr = aik.a;
        if (str == null) {
            str = "";
        }
        ArrayList arrayList = (ArrayList) ne5Var.d;
        String str2 = (String) ne5Var.c;
        ne5Var.c = str;
        ArrayList arrayList2 = (ArrayList) ne5Var.b;
        int i = 0;
        if (str2 != null && StringsKt.E(str, str2, false)) {
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (ne5Var.t((al3) obj, str)) {
                arrayList3.add(obj);
            }
        }
        arrayList.clear();
        arrayList.addAll(arrayList3);
        this.e.c(alo.k(arrayList3));
        if (arrayList3.isEmpty()) {
            rm3Var.S(null);
        }
    }

    @Override // defpackage.kkm
    public final e5d N(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qhc qhcVar = (qhc) it.next();
            this.e.g(qhcVar);
            arrayList.add(new guh(qhcVar, 0));
        }
        List list2 = list;
        gn3 gn3Var = this.l;
        xw xwVar = gn3Var.D;
        if (xwVar != null && list2.contains(xwVar.h)) {
            gn3Var.D.b();
        }
        return new e5d(arrayList, Collections.EMPTY_LIST, (byte) 2);
    }

    @Override // defpackage.kkm
    public final void O(l46 l46Var) {
    }

    public final void P(ml3 ml3Var) {
        c cVarO = this.a.o();
        while (true) {
            if (ml3Var == null) {
                ml3Var = null;
                break;
            } else if (G(this.c, ml3Var.a(cVarO))) {
                break;
            } else {
                ml3Var = ml3Var.a(cVarO);
            }
        }
        if (ml3Var != null) {
            qhc qhcVarB = qhc.b(ml3Var);
            if (this.j) {
                this.b.add(qhcVarB);
                return;
            }
            int I = I(qhcVarB);
            if (I != -1) {
                notifyItemChanged(I);
            }
        }
    }

    @Override // defpackage.ql3
    public final void a(b bVar, c cVar, c cVar2) {
        d(Collections.singletonList(bVar), cVar, cVar2);
    }

    @Override // defpackage.ql3
    public final void d(Collection collection, ml3 ml3Var, ml3 ml3Var2) {
        if (this.l.e()) {
            M();
            return;
        }
        c5o c5oVar = this.d;
        c5oVar.a = null;
        if (G(this.c, ml3Var)) {
            c5oVar.a = null;
            L(alo.k(collection));
            P(ml3Var2);
        } else if (!G(this.c, ml3Var2)) {
            P(ml3Var);
            P(ml3Var2);
        } else {
            c5oVar.a = null;
            this.e.c(alo.k(collection));
            P(ml3Var);
        }
    }

    @Override // defpackage.ql3
    public final void e(b bVar, c cVar) {
        qhc qhcVarB;
        int I;
        this.d.a = null;
        if (!G(this.c, cVar) || (I = I((qhcVarB = qhc.b(bVar)))) < 0) {
            return;
        }
        xvj xvjVar = this.e;
        xvjVar.i();
        Object objF = xvjVar.f(I);
        boolean z = objF == qhcVarB || !xvjVar.f.a(objF, qhcVarB);
        if (objF != qhcVarB && xvjVar.f.compare(objF, qhcVarB) == 0) {
            xvjVar.a[I] = qhcVarB;
            if (z) {
                qw4 qw4Var = xvjVar.f;
                qw4Var.I(I, 1, qw4Var.d(objF, qhcVarB));
                return;
            }
            return;
        }
        if (z) {
            qw4 qw4Var2 = xvjVar.f;
            qw4Var2.I(I, 1, qw4Var2.d(objF, qhcVarB));
        }
        xvjVar.h(I, false);
        int iB = xvjVar.b(qhcVarB, false);
        if (I != iB) {
            xvjVar.f.S(I, iB);
        }
    }

    public final int getItemCount() {
        return this.e.h;
    }

    public final long getItemId(int i) {
        return ((qhc) this.e.f(i)).a.getId();
    }

    public final int getItemViewType(int i) {
        return vep.A(H(i).c());
    }

    @Override // defpackage.ql3
    public final void m() {
        gn3 gn3Var = this.l;
        um3 um3Var = gn3Var.A;
        mhk mhkVar = (mhk) um3Var.c.b;
        mhkVar.b = 0;
        ((LinkedList) mhkVar.c).clear();
        um3Var.a(false);
        if (gn3Var.e()) {
            M();
        } else {
            J();
        }
    }

    public final void onBindViewHolder(i iVar, int i) {
        e7n e7nVar = (e7n) iVar;
        qhc qhcVarH = H(i);
        boolean z = this.i == 3;
        e7nVar.i = qhcVarH;
        e7nVar.j = z;
        e7nVar.U();
        e7nVar.k0(e7nVar.i);
        if (e7nVar instanceof d7n) {
            ((d7n) e7nVar).n.setVisibility(this.l.e() ? 0 : 8);
        }
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        i c7nVar;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        gn3 gn3Var = this.l;
        if (i == 0) {
            return new e7n(layoutInflaterFrom.inflate(2131559309, viewGroup, false), gn3Var.u);
        }
        if (i == 4) {
            return new dn3(gn3Var, layoutInflaterFrom.inflate(2131559400, viewGroup, false), gn3Var.u, (byte) 1);
        }
        if (i == 3) {
            return new dn3(gn3Var, layoutInflaterFrom.inflate(2131559397, viewGroup, false), gn3Var.u, (byte) 0);
        }
        if (i == 5) {
            ImportBookmarksBanner importBookmarksBanner = new ImportBookmarksBanner(viewGroup.getContext(), null, 6);
            an3 an3Var = new an3(importBookmarksBanner, gn3Var.u);
            gf gfVar = new gf((Object) gn3Var, (byte) 25);
            ov0 ov0Var = importBookmarksBanner.a;
            ((MaterialButton) ov0Var.d).setOnClickListener(gfVar);
            ((StylingImageView) ov0Var.c).setOnClickListener(new nf(an3Var, gn3Var, (byte) 18));
            return an3Var;
        }
        if (i == 1) {
            c7nVar = new b7n(layoutInflaterFrom.inflate(2131559449, viewGroup, false), gn3Var.u, gn3Var.b);
        } else {
            View viewInflate = layoutInflaterFrom.inflate(2131559449, viewGroup, false);
            eme emeVar = gn3Var.b.m;
            Objects.requireNonNull(emeVar);
            c7nVar = new c7n(viewInflate, emeVar, gn3Var.u, gn3Var.b);
        }
        c7nVar.itemView.setOnClickListener(t0h.i(gn3Var));
        c7nVar.itemView.setOnLongClickListener(gn3Var);
        c7nVar.itemView.findViewById(2131363258).setOnClickListener(t0h.i(gn3Var));
        return c7nVar;
    }

    public final void onViewRecycled(i iVar) {
        ((e7n) iVar).e0();
    }

    @Override // defpackage.ql3
    public final void p() {
        this.j = false;
        HashSet hashSet = this.b;
        int[] iArr = new int[hashSet.size()];
        Iterator it = hashSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            int I = I((qhc) it.next());
            if (I != -1) {
                iArr[i] = I;
                i++;
            }
        }
        Arrays.sort(iArr, 0, i);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 == 0) {
                i3 = iArr[i4];
                i2 = 1;
            } else if (iArr[i4] == i3 + i2) {
                i2++;
            } else {
                notifyItemRangeChanged(i3, i2);
                i2 = 0;
            }
        }
        if (i2 > 0) {
            notifyItemRangeChanged(i3, i2);
        }
        hashSet.clear();
        int i5 = this.k;
        if (i5 != -1) {
            this.l.r.x0(i5);
            this.k = -1;
        }
    }

    @Override // defpackage.ql3
    public final void s(b bVar, c cVar) {
        if (G(this.c, cVar)) {
            if (bVar == null) {
                J();
                return;
            }
            this.d.a = null;
            int I = I(qhc.b(bVar));
            if (I != -1) {
                xvj xvjVar = this.e;
                xvjVar.i();
                Object objF = xvjVar.f(I);
                xvjVar.h(I, false);
                int iB = xvjVar.b(objF, false);
                if (I != iB) {
                    xvjVar.f.S(I, iB);
                }
            }
        }
    }

    @Override // defpackage.kkm
    public final void t(e5d e5dVar) {
        Iterator it = e5dVar.iterator();
        while (it.hasNext()) {
            this.e.a((qhc) ((guh) it.next()).a);
        }
    }

    @Override // defpackage.ql3
    public final void y(b bVar, c cVar) {
        this.l.A.d(qhc.b(bVar));
        D(Collections.singletonList(bVar), cVar);
    }
}
