package com.opera.android.bookmarks;

import J.N;
import androidx.annotation.NonNull;
import com.opera.api.Callback;
import defpackage.g7f;
import defpackage.h7f;
import defpackage.i7f;
import defpackage.ol3;
import defpackage.ql3;

/* loaded from: classes.dex */
public final class BookmarksBridge {
    public static final i7f a = new i7f();

    public static class BookmarkNode implements ol3 {
        public final long a;

        public BookmarkNode(long j) {
            this.a = j;
        }

        @Override // defpackage.ol3
        public final String b() {
            return (String) N.Mzrfke01(this.a);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof BookmarkNode) {
                return this.a == ((BookmarkNode) obj).a;
            }
            return false;
        }

        @Override // defpackage.ol3
        public final boolean g() {
            return N.MIH0RDIG(this.a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final BookmarkNode j(long j) {
            return (BookmarkNode) N.M9PJ8BaX(this.a, j);
        }

        public final boolean k(BookmarkNode bookmarkNode) {
            return bookmarkNode != null && N.MRvTVnzt(this.a, bookmarkNode.a);
        }
    }

    public static void bookmarkAllUserNodesRemoved() {
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            g gVar = (g) ((a) g7fVarC.next());
            h7f h7fVar = gVar.d.b;
            if (!h7fVar.isEmpty()) {
                gVar.e();
                if (gVar.a) {
                    g7f g7fVarH = am2.h(h7fVar, h7fVar);
                    while (g7fVarH.hasNext()) {
                        ((ql3) g7fVarH.next()).m();
                    }
                }
            }
        }
    }

    public static void bookmarkMetaInfoChanged(@NonNull BookmarkNode bookmarkNode) {
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((g) ((a) g7fVarC.next())).b(bookmarkNode);
        }
    }

    public static void bookmarkModelLoaded() {
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((g) ((a) g7fVarC.next())).d.a.K();
        }
    }

    public static void bookmarkNodeAdded(@NonNull BookmarkNode bookmarkNode, long j) {
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((g) ((a) g7fVarC.next())).a(bookmarkNode, j);
        }
    }

    public static void bookmarkNodeChanged(@NonNull BookmarkNode bookmarkNode) {
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((g) ((a) g7fVarC.next())).b(bookmarkNode);
        }
    }

    public static void bookmarkNodeChildrenReordered(@NonNull BookmarkNode bookmarkNode) {
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            g gVar = (g) ((a) g7fVarC.next());
            h hVar = gVar.d;
            h7f h7fVar = hVar.b;
            if (!h7fVar.isEmpty() && gVar.d(bookmarkNode)) {
                gVar.e();
                c cVarM = c.m(hVar, bookmarkNode);
                if (gVar.a) {
                    g7f g7fVarH = am2.h(h7fVar, h7fVar);
                    while (g7fVarH.hasNext()) {
                        ((ql3) g7fVarH.next()).s(null, cVarM);
                    }
                }
            }
        }
    }

    public static void bookmarkNodeMoved(@NonNull BookmarkNode bookmarkNode, long j, @NonNull BookmarkNode bookmarkNode2, long j2) {
        c5o c5oVar;
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            g gVar = (g) ((a) g7fVarC.next());
            h hVar = gVar.d;
            h7f h7fVar = hVar.b;
            if (!h7fVar.isEmpty()) {
                if (gVar.d(bookmarkNode)) {
                    if (gVar.d(bookmarkNode2)) {
                        b bVarJ = b.j(hVar, bookmarkNode2.j(j2));
                        c cVarM = c.m(hVar, bookmarkNode);
                        c cVarM2 = c.m(hVar, bookmarkNode2);
                        boolean zEquals = cVarM.equals(cVarM2);
                        boolean z = (zEquals && (c5oVar = gVar.c) != null && ((b) c5oVar.a).equals(bVarJ) && ((c) c5oVar.b).equals(cVarM2) && j2 == 0) ? false : true;
                        gVar.e();
                        if (gVar.a) {
                            if (!zEquals) {
                                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                                while (g7fVarH.hasNext()) {
                                    ((ql3) g7fVarH.next()).a(bVarJ, cVarM, cVarM2);
                                }
                            } else if (z) {
                                g7f g7fVarH2 = am2.h(h7fVar, h7fVar);
                                while (g7fVarH2.hasNext()) {
                                    ((ql3) g7fVarH2.next()).s(bVarJ, cVarM2);
                                }
                            }
                        }
                    } else {
                        gVar.c(bookmarkNode, bookmarkNode2.j(j2));
                    }
                } else if (gVar.d(bookmarkNode2)) {
                    gVar.a(bookmarkNode2, j2);
                }
            }
        }
    }

    public static void bookmarkNodeRemoved(@NonNull BookmarkNode bookmarkNode, long j, @NonNull BookmarkNode bookmarkNode2) {
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((g) ((a) g7fVarC.next())).c(bookmarkNode, bookmarkNode2);
        }
    }

    public static void callBooleanCallback(@NonNull Callback callback, boolean z) {
        callback.run(Boolean.valueOf(z));
    }

    public static void extensiveBookmarkChangesBeginning() {
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            g gVar = (g) ((a) g7fVarC.next());
            gVar.b = true;
            h7f h7fVar = gVar.d.b;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((ql3) g7fVarH.next()).E();
            }
        }
    }

    public static void extensiveBookmarkChangesEnded() {
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            g gVar = (g) ((a) g7fVarC.next());
            gVar.e();
            boolean z = false;
            gVar.b = false;
            h hVar = gVar.d;
            boolean z2 = !hVar.l().isEmpty();
            if (alo.i != z2) {
                alo.i = z2;
                z = true;
            }
            h7f h7fVar = hVar.b;
            if (z && !alo.G(hVar)) {
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((ql3) g7fVarH.next()).y(hVar.l(), hVar.o());
                }
            }
            boolean zIsEmpty = hVar.n().isEmpty();
            boolean z3 = !zIsEmpty;
            if (alo.j != z3) {
                alo.j = z3;
                if (zIsEmpty) {
                    z3 = !hVar.n().isEmpty();
                    boolean z4 = alo.j;
                    if (z4 != z3) {
                        alo.j = z3;
                    } else {
                        z3 = z4;
                    }
                }
                if (!z3) {
                    g7f g7fVarH2 = am2.h(h7fVar, h7fVar);
                    while (g7fVarH2.hasNext()) {
                        ((ql3) g7fVarH2.next()).y(hVar.n(), hVar.o());
                    }
                }
            }
            g7f g7fVarH3 = am2.h(h7fVar, h7fVar);
            while (g7fVarH3.hasNext()) {
                ((ql3) g7fVarH3.next()).p();
            }
        }
    }
}
