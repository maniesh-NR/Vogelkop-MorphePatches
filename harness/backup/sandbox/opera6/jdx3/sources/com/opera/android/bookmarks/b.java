package com.opera.android.bookmarks;

import J.N;
import com.opera.android.bookmarks.BookmarksBridge;
import defpackage.al3;
import defpackage.i7f;
import defpackage.ml3;
import defpackage.zk3;

/* loaded from: classes.dex */
public abstract class b implements al3 {
    public final long a;
    public final BookmarksBridge.BookmarkNode b;
    public final h c;

    public b(h hVar, BookmarksBridge.BookmarkNode bookmarkNode) {
        this.a = N.M16noF3m(bookmarkNode.a);
        this.b = bookmarkNode;
        this.c = hVar;
    }

    public static b j(h hVar, BookmarksBridge.BookmarkNode bookmarkNode) {
        return N.MIH0RDIG(bookmarkNode.a) ? c.m(hVar, bookmarkNode) : new d(hVar, bookmarkNode);
    }

    public static boolean l(BookmarksBridge.BookmarkNode bookmarkNode, zk3 zk3Var) {
        boolean zC = zk3Var.c(bookmarkNode);
        long j = bookmarkNode.a;
        if (zC) {
            if (!N.MIH0RDIG(j)) {
                return true;
            }
            int i = 0;
            while (true) {
                long j2 = i;
                if (j2 >= N.Mc3pYXd5(j)) {
                    return true;
                }
                if (!l(bookmarkNode.j(j2), zk3Var)) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    @Override // defpackage.al3
    public boolean c(zk3 zk3Var) {
        return l(this.b, zk3Var);
    }

    @Override // defpackage.al3
    public final boolean e(ml3 ml3Var) {
        h hVar = this.c;
        for (c cVarA = a(hVar.o()); cVarA != null; cVarA = cVarA.a(hVar.o())) {
            if (cVarA.equals(ml3Var)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof al3) {
            return this.a == ((al3) obj).getId();
        }
        return false;
    }

    @Override // defpackage.al3
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.al3
    public final String getTitle() {
        return (String) N.MeTSvCdg(this.b.a);
    }

    public final int hashCode() {
        return (int) this.a;
    }

    @Override // defpackage.al3
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c a(c cVar) {
        BookmarksBridge.BookmarkNode bookmarkNode = (BookmarksBridge.BookmarkNode) N.MrHxfo1_(this.b.a);
        if (bookmarkNode == null) {
            return null;
        }
        h hVar = this.c;
        BookmarksBridge.BookmarkNode bookmarkNode2 = hVar.g;
        if (bookmarkNode2 == null) {
            i7f i7fVar = BookmarksBridge.a;
            bookmarkNode2 = (BookmarksBridge.BookmarkNode) N.M9gFEf_d();
            hVar.g = bookmarkNode2;
        }
        return bookmarkNode.equals(bookmarkNode2) ? cVar : (c) j(hVar, bookmarkNode);
    }

    public String toString() {
        return "";
    }
}
