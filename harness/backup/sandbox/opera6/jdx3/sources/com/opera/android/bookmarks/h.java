package com.opera.android.bookmarks;

import J.N;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.appsflyer.internal.j;
import com.opera.android.bookmarks.BookmarksBridge;
import com.opera.android.favorites.FavoritesBridge;
import defpackage.al3;
import defpackage.b59;
import defpackage.eme;
import defpackage.eti;
import defpackage.f6e;
import defpackage.frf;
import defpackage.g7f;
import defpackage.grf;
import defpackage.h7f;
import defpackage.i53;
import defpackage.i7f;
import defpackage.jkj;
import defpackage.ml3;
import defpackage.nrl;
import defpackage.p6l;
import defpackage.pl3;
import defpackage.ql3;
import defpackage.shf;
import defpackage.zwk;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends i53 {
    public final nrl a = new nrl((byte) 26);
    public final h7f b = new h7f();
    public final g c = new g(this);
    public c d;
    public c e;
    public c f;
    public BookmarksBridge.BookmarkNode g;
    public BookmarksBridge.BookmarkNode h;
    public c i;
    public b59 j;
    public final cq5 k;
    public grf l;
    public eme m;

    public h(zwk zwkVar, cq5 cq5Var) {
        this.k = cq5Var;
        if (!zwkVar.b) {
            zwkVar.F(new f6e(this, zwkVar));
            return;
        }
        FavoritesBridge.a(new e(this));
        if (N.MyZx5kBs()) {
            r();
        }
    }

    public static b i(al3 al3Var, ml3 ml3Var) {
        List listI = ml3Var.i();
        for (int i = 0; i < listI.size(); i++) {
            al3 al3Var2 = (al3) listI.get(i);
            if (al3Var.g()) {
                if (al3Var2.g() && ((ml3) al3Var).getTitle().equals(((ml3) al3Var2).getTitle())) {
                    return null;
                }
            } else if (al3Var2.g()) {
                continue;
            } else {
                pl3 pl3Var = (pl3) al3Var;
                pl3 pl3Var2 = (pl3) al3Var2;
                if (pl3Var.getTitle().equals(pl3Var2.getTitle()) && ((String) pl3Var.getUrl().a).equals((String) pl3Var2.getUrl().a)) {
                    return null;
                }
            }
        }
        c cVar = (c) ml3Var;
        BookmarksBridge.BookmarkNode bookmarkNode = cVar.b;
        h hVar = cVar.c;
        if (!al3Var.g()) {
            pl3 pl3Var3 = (pl3) al3Var;
            String title = pl3Var3.getTitle();
            shf url = pl3Var3.getUrl();
            BookmarksBridge.BookmarkNode bookmarkNode2 = cVar.e;
            if (bookmarkNode2 != null) {
                bookmarkNode = bookmarkNode2;
            }
            String str = (String) url.a;
            p6l p6lVar = p6l.a;
            String strG = eti.a(str, url, 2).g();
            i7f i7fVar = BookmarksBridge.a;
            return new d(hVar, (BookmarksBridge.BookmarkNode) N.Ma7AURjI(bookmarkNode.a, 0, title, strG));
        }
        ml3 ml3Var2 = (ml3) al3Var;
        String title2 = ml3Var2.getTitle();
        String strB = ml3Var2.b();
        i7f i7fVar2 = BookmarksBridge.a;
        c cVarM = c.m(hVar, (BookmarksBridge.BookmarkNode) N.MnxlR8LZ(bookmarkNode.a, 0, title2));
        N.MzRmE6Wi(cVarM.b.a, strB);
        List listI2 = ml3Var2.i();
        for (int size = listI2.size() - 1; size >= 0; size--) {
            i((al3) listI2.get(size), cVarM);
        }
        return cVarM;
    }

    public static void k(HashSet hashSet, ml3 ml3Var) {
        for (al3 al3Var : ml3Var.i()) {
            if (al3Var instanceof pl3) {
                shf url = ((pl3) al3Var).getUrl();
                if (url != null) {
                    String str = (String) url.a;
                    if (!TextUtils.isEmpty(str)) {
                        hashSet.add(str);
                    }
                }
            } else if (al3Var instanceof ml3) {
                k(hashSet, (ml3) al3Var);
            }
        }
    }

    @Override // defpackage.i53
    public final void a(ql3 ql3Var) {
        this.b.b(ql3Var);
    }

    @Override // defpackage.i53
    public final int b() {
        i7f i7fVar = BookmarksBridge.a;
        if (!N.MtcDgF48()) {
            return 0;
        }
        sa2 sa2Var = new sa2((byte) 4, false);
        o().c(sa2Var);
        l().c(sa2Var);
        n().c(sa2Var);
        return sa2Var.b;
    }

    @Override // defpackage.i53
    public final al3 c(String str) {
        i7f i7fVar = BookmarksBridge.a;
        BookmarksBridge.BookmarkNode bookmarkNode = (BookmarksBridge.BookmarkNode) N.MLjrYLRT(str);
        if (bookmarkNode == null) {
            return null;
        }
        long jM16noF3m = N.M16noF3m(bookmarkNode.a);
        c cVarP = p();
        if (cVarP != null && alo.L(jM16noF3m, cVarP, true) != null) {
            ArrayList arrayListR = alo.r(Arrays.asList(o(), l(), n()));
            int size = arrayListR.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListR.get(i);
                i++;
                pl3 pl3Var = (pl3) obj;
                if (((String) pl3Var.getUrl().b).equals(str)) {
                    return pl3Var;
                }
            }
        }
        return m(jM16noF3m, false);
    }

    @Override // defpackage.i53
    public final boolean d() {
        i7f i7fVar = BookmarksBridge.a;
        if (!N.MtcDgF48()) {
            return true;
        }
        if (alo.G(this)) {
            return false;
        }
        boolean z = alo.j;
        if (!z) {
            z = !n().isEmpty();
            boolean z2 = alo.j;
            if (z2 != z) {
                alo.j = z;
            } else {
                z = z2;
            }
        }
        if (z) {
            return false;
        }
        o().c(new l5b((byte) 1));
        return !r0.b;
    }

    @Override // defpackage.i53
    public final void e(AbstractList abstractList) {
        g gVar = this.c;
        ArrayList arrayList = new ArrayList(abstractList.size());
        try {
            gVar.a = false;
            Iterator it = abstractList.iterator();
            ml3 ml3VarA = null;
            while (it.hasNext()) {
                al3 al3Var = (al3) it.next();
                if (ml3VarA == null) {
                    ml3VarA = al3Var.a(o());
                }
                arrayList.add(jkj.j(al3Var));
                q((b) al3Var);
            }
            gVar.a = true;
            if (abstractList.isEmpty()) {
                return;
            }
            h7f h7fVar = this.b;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((ql3) g7fVarH.next()).D(arrayList, ml3VarA);
            }
        } catch (Throwable th) {
            gVar.a = true;
            throw th;
        }
    }

    @Override // defpackage.i53
    public final void f(ql3 ql3Var) {
        h7f h7fVar = this.b;
        if (h7fVar.c(ql3Var) && h7fVar.isEmpty()) {
            this.c.c = null;
        }
    }

    @Override // defpackage.i53
    public final void h(al3 al3Var, ml3 ml3Var, int i) {
        int iMc3pYXd5;
        b bVar = (b) m(al3Var.getId(), true);
        c cVarA = bVar.a(o());
        int iIndexOf = ((ArrayList) cVarA.i()).indexOf(bVar);
        if (i != -2) {
            iMc3pYXd5 = -1;
            if (i != -1) {
                iMc3pYXd5 = i;
            }
        } else {
            iMc3pYXd5 = iIndexOf;
        }
        boolean zEquals = cVarA.equals(ml3Var);
        boolean z = iIndexOf >= 0 && iIndexOf != i;
        String title = bVar.getTitle();
        BookmarksBridge.BookmarkNode bookmarkNode = bVar.b;
        if (!TextUtils.equals(title, al3Var.getTitle())) {
            String title2 = al3Var.getTitle();
            i7f i7fVar = BookmarksBridge.a;
            N.MZSGPlJd(bookmarkNode.a, title2);
        }
        if (!bVar.g()) {
            d dVar = (d) bVar;
            shf url = dVar.getUrl();
            shf url2 = ((pl3) al3Var).getUrl();
            if (!TextUtils.equals((String) url.b, (String) url2.b)) {
                String str = (String) url2.a;
                BookmarksBridge.BookmarkNode bookmarkNode2 = dVar.b;
                shf url3 = dVar.getUrl();
                p6l p6lVar = p6l.a;
                String strG = eti.a(str, url3, 2).g();
                i7f i7fVar2 = BookmarksBridge.a;
                N.MyRSikZv(bookmarkNode2.a, strG);
            }
        }
        if (bVar.g()) {
            ml3 ml3Var2 = (ml3) al3Var;
            if (!TextUtils.equals(bookmarkNode.b(), ml3Var2.b())) {
                N.MzRmE6Wi(bookmarkNode.a, ml3Var2.b());
            }
        }
        if (!zEquals) {
            c cVar = (c) ml3Var;
            BookmarksBridge.BookmarkNode bookmarkNode3 = cVar.e;
            boolean zG = bVar.g();
            BookmarksBridge.BookmarkNode bookmarkNode4 = cVar.b;
            BookmarksBridge.BookmarkNode bookmarkNode5 = (zG || bookmarkNode3 == null) ? bookmarkNode4 : bookmarkNode3;
            if (iMc3pYXd5 >= 0 && bookmarkNode5 == bookmarkNode3) {
                iMc3pYXd5 -= (int) N.Mc3pYXd5(bookmarkNode4.a);
            }
            c.n(bVar, bookmarkNode5, iMc3pYXd5);
            return;
        }
        if (!z || iIndexOf == iMc3pYXd5) {
            return;
        }
        c cVar2 = (c) ml3Var;
        BookmarksBridge.BookmarkNode bookmarkNode6 = cVar2.e;
        boolean zG2 = bVar.g();
        BookmarksBridge.BookmarkNode bookmarkNode7 = cVar2.b;
        BookmarksBridge.BookmarkNode bookmarkNode8 = (zG2 || bookmarkNode6 == null) ? bookmarkNode7 : bookmarkNode6;
        if (iMc3pYXd5 >= 0 && bookmarkNode8 == bookmarkNode6) {
            iMc3pYXd5 -= (int) N.Mc3pYXd5(bookmarkNode7.a);
        }
        c.n(bVar, bookmarkNode8, iMc3pYXd5);
    }

    public final void j() {
        j.d((SharedPreferences) this.j.get(), "disable_import_promotion_shown", true);
    }

    public final c l() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar;
        }
        i7f i7fVar = BookmarksBridge.a;
        c cVar2 = new c(this, (BookmarksBridge.BookmarkNode) N.M3hQME_c(), 2);
        this.e = cVar2;
        return cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [al3] */
    public final al3 m(long j, boolean z) {
        c cVarP;
        c cVarO = o();
        long j2 = cVarO.a;
        c cVarL = cVarO;
        if (j2 != j) {
            cVarL = alo.L(j, cVarO, true);
        }
        if (cVarL != null) {
            return cVarL;
        }
        c cVarL2 = l();
        if (cVarL2.a == j) {
            return cVarL2;
        }
        al3 al3VarL = alo.L(j, cVarL2, true);
        if (al3VarL != null) {
            return al3VarL;
        }
        c cVarN = n();
        if (cVarN.a == j) {
            return cVarN;
        }
        al3 al3VarL2 = alo.L(j, cVarN, true);
        if (al3VarL2 != null) {
            return al3VarL2;
        }
        if (!z || (cVarP = p()) == null) {
            return null;
        }
        return cVarP.a == j ? cVarP : alo.L(j, cVarP, true);
    }

    public final c n() {
        c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        i7f i7fVar = BookmarksBridge.a;
        c cVar2 = new c(this, (BookmarksBridge.BookmarkNode) N.M7dLQgZp(), 3);
        this.f = cVar2;
        return cVar2;
    }

    public final c o() {
        c cVar = this.d;
        if (cVar != null) {
            return cVar;
        }
        i7f i7fVar = BookmarksBridge.a;
        c cVar2 = new c(this, (BookmarksBridge.BookmarkNode) N.McWLLuCo(), 1);
        this.d = cVar2;
        return cVar2;
    }

    public final c p() {
        c cVar = this.i;
        if (cVar != null) {
            return cVar;
        }
        BookmarksBridge.BookmarkNode bookmarkNode = this.h;
        if (bookmarkNode == null) {
            i7f i7fVar = BookmarksBridge.a;
            bookmarkNode = (BookmarksBridge.BookmarkNode) N.MLsLgy31();
            this.h = bookmarkNode;
        }
        if (bookmarkNode == null) {
            return null;
        }
        c cVar2 = new c(this, bookmarkNode, 4);
        this.i = cVar2;
        return cVar2;
    }

    public final void q(b bVar) {
        if (!(bVar instanceof c)) {
            BookmarksBridge.BookmarkNode bookmarkNode = bVar.b;
            i7f i7fVar = BookmarksBridge.a;
            N.MsQpg03H(bookmarkNode.a);
            return;
        }
        c cVar = (c) bVar;
        ArrayList arrayList = (ArrayList) cVar.i();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q((b) arrayList.get(size));
        }
        if (cVar.equals(o())) {
            return;
        }
        int i = cVar.d;
        if (i == 2) {
            if (alo.i) {
                alo.i = false;
            }
        } else if (i == 3) {
            if (alo.j) {
                alo.j = false;
            }
        } else {
            BookmarksBridge.BookmarkNode bookmarkNode2 = cVar.b;
            i7f i7fVar2 = BookmarksBridge.a;
            N.MsQpg03H(bookmarkNode2.a);
        }
    }

    public final void r() {
        i7f i7fVar = BookmarksBridge.a;
        if (i7fVar.b(this.c) && i7fVar.c == 1) {
            N.MeGodMMj();
        }
        if (N.MtcDgF48()) {
            this.a.K();
        }
    }

    public final boolean s() {
        return (((SharedPreferences) this.j.get()).getBoolean("disable_import_promotion_shown", false) || ((f8f) this.k.getValue()).f()) ? false : true;
    }

    public final boolean t() {
        grf grfVar = this.l;
        return (grfVar == null || (((frf) grfVar.i()).b & 1) == 0) ? false : true;
    }
}
