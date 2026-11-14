package com.opera.android.bookmarks;

import J.N;
import com.opera.android.bookmarks.BookmarksBridge;
import defpackage.g7f;
import defpackage.h7f;
import defpackage.i7f;
import defpackage.ql3;

/* loaded from: classes.dex */
public final class g implements a {
    public boolean a = true;
    public boolean b;
    public c5o c;
    public final /* synthetic */ h d;

    public g(h hVar) {
        this.d = hVar;
    }

    public final void a(BookmarksBridge.BookmarkNode bookmarkNode, long j) {
        h hVar = this.d;
        h7f h7fVar = hVar.b;
        if (h7fVar.isEmpty() || !d(bookmarkNode)) {
            return;
        }
        e();
        b bVarJ = b.j(hVar, bookmarkNode.j(j));
        c cVarM = c.m(hVar, bookmarkNode);
        if (this.b && N.Mc3pYXd5(bookmarkNode.a) - 1 == j) {
            this.c = new c5o(bVarJ, cVarM);
        }
        if (this.a && this.c == null) {
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((ql3) g7fVarH.next()).A(bVarJ, cVarM);
            }
        }
    }

    public final void b(BookmarksBridge.BookmarkNode bookmarkNode) {
        h hVar = this.d;
        h7f h7fVar = hVar.b;
        if (h7fVar.isEmpty() || !d(bookmarkNode)) {
            return;
        }
        e();
        b bVarJ = b.j(hVar, bookmarkNode);
        c cVarM = c.m(hVar, (BookmarksBridge.BookmarkNode) N.MrHxfo1_(bookmarkNode.a));
        if (this.a) {
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((ql3) g7fVarH.next()).e(bVarJ, cVarM);
            }
        }
    }

    public final void c(BookmarksBridge.BookmarkNode bookmarkNode, BookmarksBridge.BookmarkNode bookmarkNode2) {
        h hVar = this.d;
        h7f h7fVar = hVar.b;
        if (h7fVar.isEmpty() || !d(bookmarkNode)) {
            return;
        }
        e();
        b bVarJ = b.j(hVar, bookmarkNode2);
        c cVarM = c.m(hVar, bookmarkNode);
        if (this.a) {
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((ql3) g7fVarH.next()).y(bVarJ, cVarM);
            }
        }
    }

    public final boolean d(BookmarksBridge.BookmarkNode bookmarkNode) {
        h hVar = this.d;
        if (bookmarkNode.k(hVar.o().b)) {
            return true;
        }
        BookmarksBridge.BookmarkNode bookmarkNode2 = hVar.g;
        if (bookmarkNode2 == null) {
            i7f i7fVar = BookmarksBridge.a;
            bookmarkNode2 = (BookmarksBridge.BookmarkNode) N.M9gFEf_d();
            hVar.g = bookmarkNode2;
        }
        if (bookmarkNode.k(bookmarkNode2)) {
            return true;
        }
        if (hVar.t()) {
            BookmarksBridge.BookmarkNode bookmarkNode3 = hVar.h;
            if (bookmarkNode3 == null) {
                i7f i7fVar2 = BookmarksBridge.a;
                bookmarkNode3 = (BookmarksBridge.BookmarkNode) N.MLsLgy31();
                hVar.h = bookmarkNode3;
            }
            if (bookmarkNode.k(bookmarkNode3)) {
                return true;
            }
        }
        i7f i7fVar3 = BookmarksBridge.a;
        return bookmarkNode.k((BookmarksBridge.BookmarkNode) N.M3hQME_c()) || bookmarkNode.k((BookmarksBridge.BookmarkNode) N.M7dLQgZp());
    }

    public final void e() {
        if (this.c != null) {
            h7f h7fVar = this.d.b;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ql3 ql3Var = (ql3) g7fVarH.next();
                c5o c5oVar = this.c;
                ql3Var.A((b) c5oVar.a, (c) c5oVar.b);
            }
            this.c = null;
        }
    }
}
