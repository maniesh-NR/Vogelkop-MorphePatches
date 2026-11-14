package com.opera.android.bookmarks;

import J.N;
import com.opera.android.bookmarks.BookmarksBridge;
import defpackage.i7f;
import defpackage.ml3;
import defpackage.zk3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends b implements ml3 {
    public final int d;
    public final BookmarksBridge.BookmarkNode e;

    public c(h hVar, BookmarksBridge.BookmarkNode bookmarkNode, int i) {
        BookmarksBridge.BookmarkNode bookmarkNode2;
        super(hVar, bookmarkNode);
        this.d = i;
        if (h()) {
            i7f i7fVar = BookmarksBridge.a;
            bookmarkNode2 = (BookmarksBridge.BookmarkNode) N.M9gFEf_d();
        } else {
            bookmarkNode2 = null;
        }
        this.e = bookmarkNode2;
    }

    public static c m(h hVar, BookmarksBridge.BookmarkNode bookmarkNode) {
        c cVarO = hVar.o();
        if (cVarO.b.equals(bookmarkNode) || cVarO.e.equals(bookmarkNode)) {
            return cVarO;
        }
        c cVarL = hVar.l();
        if (cVarL.b.equals(bookmarkNode)) {
            return cVarL;
        }
        c cVarN = hVar.n();
        if (cVarN.b.equals(bookmarkNode)) {
            return cVarN;
        }
        c cVarP = hVar.p();
        return (cVarP == null || !cVarP.b.equals(bookmarkNode)) ? new c(hVar, bookmarkNode, 5) : cVarP;
    }

    public static void n(b bVar, BookmarksBridge.BookmarkNode bookmarkNode, int i) {
        BookmarksBridge.BookmarkNode bookmarkNode2 = bVar.b;
        int i2 = -1;
        if (i != -1) {
            int i3 = 0;
            while (true) {
                long j = i3;
                if (j >= N.Mc3pYXd5(bookmarkNode.a)) {
                    break;
                }
                if (bookmarkNode2.equals(bookmarkNode.j(j))) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            if (i2 >= 0 && i2 < i) {
                i++;
            }
        } else {
            i = (int) N.Mc3pYXd5(bookmarkNode.a);
        }
        long j2 = i;
        i7f i7fVar = BookmarksBridge.a;
        N.MEmZnfJz(bookmarkNode2.a, bookmarkNode.a, j2);
    }

    @Override // defpackage.ol3
    public final String b() {
        return this.b.b();
    }

    @Override // com.opera.android.bookmarks.b, defpackage.al3
    public final boolean c(zk3 zk3Var) {
        if (!b.l(this.b, zk3Var)) {
            return false;
        }
        BookmarksBridge.BookmarkNode bookmarkNode = this.e;
        return bookmarkNode == null || b.l(bookmarkNode, zk3Var);
    }

    @Override // defpackage.al3
    public final long d() {
        return N.MNmBobM5(this.b.a);
    }

    @Override // defpackage.ol3
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ml3
    public final boolean h() {
        return this.d == 1;
    }

    @Override // defpackage.ml3
    public final List i() {
        h hVar;
        BookmarksBridge.BookmarkNode bookmarkNode = this.b;
        int iMc3pYXd5 = (int) N.Mc3pYXd5(bookmarkNode.a);
        BookmarksBridge.BookmarkNode bookmarkNode2 = this.e;
        if (bookmarkNode2 != null) {
            iMc3pYXd5 += (int) N.Mc3pYXd5(bookmarkNode2.a);
        }
        ArrayList arrayList = new ArrayList(iMc3pYXd5);
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = i2;
            long jMc3pYXd5 = N.Mc3pYXd5(bookmarkNode.a);
            hVar = this.c;
            if (j >= jMc3pYXd5) {
                break;
            }
            arrayList.add(b.j(hVar, bookmarkNode.j(j)));
            i2++;
        }
        if (bookmarkNode2 != null) {
            while (true) {
                long j2 = i;
                if (j2 >= N.Mc3pYXd5(bookmarkNode2.a)) {
                    break;
                }
                arrayList.add(b.j(hVar, bookmarkNode2.j(j2)));
                i++;
            }
        }
        return arrayList;
    }

    @Override // defpackage.ml3
    public final boolean isEmpty() {
        int iMc3pYXd5 = (int) N.Mc3pYXd5(this.b.a);
        BookmarksBridge.BookmarkNode bookmarkNode = this.e;
        if (bookmarkNode != null) {
            iMc3pYXd5 += (int) N.Mc3pYXd5(bookmarkNode.a);
        }
        return iMc3pYXd5 == 0;
    }

    @Override // com.opera.android.bookmarks.b, defpackage.al3
    /* renamed from: k */
    public final c a(c cVar) {
        int i = this.d;
        return (i == 2 || i == 3 || i == 4) ? cVar : super.a(cVar);
    }

    @Override // com.opera.android.bookmarks.b
    public final String toString() {
        return "";
    }
}
