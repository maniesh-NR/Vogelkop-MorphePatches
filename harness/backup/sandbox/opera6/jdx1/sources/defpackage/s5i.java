package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s5i extends e04 {
    public final /* synthetic */ xbf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5i(xbf xbfVar, int i) {
        super((byte) 2, i);
        this.c = xbfVar;
    }

    @Override // defpackage.e04
    public final void e(to9 to9Var) {
        osk oskVar = new osk(to9Var);
        xbf xbfVar = this.c;
        c6i c6iVar = (c6i) xbfVar.c;
        wsk wskVarH = oskVar.h("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (wskVarH.n()) {
                if (wskVarH.getLong(0) == 0) {
                    z = true;
                }
            }
            fr3.t(wskVarH, null);
            c6iVar.a(oskVar);
            if (!z) {
                ei2 ei2VarG = c6iVar.g(oskVar);
                if (!ei2VarG.b) {
                    j9h.r(ei2VarG.a, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + c6iVar.b + "')");
            c6iVar.c();
            Iterator it = ((List) xbfVar.d).iterator();
            while (it.hasNext()) {
                ((v5i) it.next()).getClass();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fr3.t(wskVarH, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.e04
    public final void f(to9 to9Var, int i, int i2) {
        h(to9Var, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // defpackage.e04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.to9 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5i.g(to9):void");
    }

    @Override // defpackage.e04
    public final void h(to9 to9Var, int i, int i2) {
        osk oskVar = new osk(to9Var);
        xbf xbfVar = this.c;
        c6i c6iVar = (c6i) xbfVar.c;
        ng6 ng6Var = (ng6) xbfVar.b;
        List<ryd> listG = kfo.G(ng6Var.d, i, i2);
        if (listG == null) {
            if (kfo.T(ng6Var, i, i2)) {
                throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
            }
            c6iVar.b(oskVar);
            Iterator it = ((List) xbfVar.d).iterator();
            while (it.hasNext()) {
                ((v5i) it.next()).getClass();
            }
            c6iVar.a(oskVar);
            return;
        }
        c6iVar.f(oskVar);
        for (ryd rydVar : listG) {
            if (!(oskVar instanceof osk)) {
                rydVar.getClass();
                throw new g0f("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
            }
            rydVar.a(oskVar.a);
        }
        ei2 ei2VarG = c6iVar.g(oskVar);
        if (!ei2VarG.b) {
            j9h.r(ei2VarG.a, "Migration didn't properly handle: ");
            return;
        }
        c6iVar.e();
        nxg.k(oskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        nxg.k(oskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + c6iVar.b + "')");
    }
}
