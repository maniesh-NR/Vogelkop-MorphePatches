package com.opera.android.bookmarks;

import J.N;
import com.opera.android.bookmarks.BookmarksBridge;

/* loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ h a;

    public f(h hVar) {
        this.a = hVar;
    }

    public static BookmarksBridge.BookmarkNode a(BookmarksBridge.BookmarkNode bookmarkNode) {
        int i = 0;
        while (true) {
            long j = i;
            if (j >= N.Mc3pYXd5(bookmarkNode.a)) {
                return null;
            }
            BookmarksBridge.BookmarkNode bookmarkNodeJ = bookmarkNode.j(j);
            if (!N.MIH0RDIG(bookmarkNodeJ.a)) {
                return bookmarkNodeJ;
            }
            i++;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        BookmarksBridge.BookmarkNode bookmarkNode;
        h hVar = this.a;
        g gVar = hVar.c;
        try {
            gVar.a = false;
            c cVarO = hVar.o();
            BookmarksBridge.BookmarkNode bookmarkNode2 = cVarO.b;
            for (BookmarksBridge.BookmarkNode bookmarkNodeA = a(bookmarkNode2); bookmarkNodeA != null; bookmarkNodeA = a(bookmarkNode2)) {
                b bVarJ = b.j(hVar, bookmarkNodeA);
                if (bVarJ.g() || (bookmarkNode = cVarO.e) == null) {
                    bookmarkNode = bookmarkNode2;
                }
                c.n(bVarJ, bookmarkNode, 0);
            }
        } finally {
            gVar.a = true;
        }
    }
}
