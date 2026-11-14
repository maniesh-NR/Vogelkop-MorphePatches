package com.opera.android.favorites;

import J.N;
import defpackage.g7f;
import defpackage.i7f;
import defpackage.us8;

/* loaded from: classes.dex */
public final class FavoritesBridge {
    public static final i7f a = new i7f();

    public static class Favorite {
        public final long a;

        public Favorite(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Favorite) {
                return this.a == ((Favorite) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }
    }

    public static class Folder extends Favorite {
        public Folder(long j) {
            super(j);
        }
    }

    public static class SavedPage extends Favorite {
        public SavedPage(long j) {
            super(j);
        }
    }

    public static void a(us8 us8Var) {
        i7f i7fVar = a;
        if (i7fVar.b(us8Var) && i7fVar.c == 1) {
            N.Mw8NBrqz();
        }
    }

    public static void onAdded(long j, long j2, int i) {
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((us8) g7fVarC.next()).b(j, j2, i);
        }
    }

    public static void onChanged(long j, long j2, long j3) {
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((us8) g7fVarC.next()).d(j, j2, j3);
        }
    }

    public static void onLoaded() {
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((us8) g7fVarC.next()).g();
        }
    }

    public static void onLocalRootUpdated() {
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((us8) g7fVarC.next()).c();
        }
    }

    public static void onMoved(long j, long j2, int i, long j3, int i2) {
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((us8) g7fVarC.next()).a(i2, j, j2, j3);
        }
    }

    public static void onReady() {
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((us8) g7fVarC.next()).f();
        }
    }

    public static void onRemoved(long j, long j2, int i, boolean z) {
        i7f i7fVar = a;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((us8) g7fVarC.next()).e(j, j2);
        }
    }
}
