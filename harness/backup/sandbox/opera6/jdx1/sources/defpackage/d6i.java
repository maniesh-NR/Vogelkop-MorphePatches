package defpackage;

import android.database.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d6i extends e04 {
    public ng6 c;
    public final ArrayList d;
    public final tvk e;

    public d6i(ng6 ng6Var, tvk tvkVar) {
        super((byte) 2, 23);
        this.d = ng6Var.e;
        this.c = ng6Var;
        this.e = tvkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // defpackage.e04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.to9 r5) throws android.database.SQLException {
        /*
            r4 = this;
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r0 = r5.r(r0)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            android.database.Cursor r1 = (android.database.Cursor) r1     // Catch: java.lang.Throwable -> L53
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L53
            r3 = 0
            if (r2 == 0) goto L1a
            int r1 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = r3
        L1b:
            r2 = 0
            defpackage.vtp.v(r0, r2)
            tvk.i(r5)
            if (r1 != 0) goto L34
            ei2 r0 = tvk.o(r5)
            boolean r1 = r0.b
            if (r1 != 0) goto L34
            java.lang.String r4 = "Pre-packaged database has an invalid schema: "
            java.lang.String r5 = r0.a
            j9h.u(r5, r4)
            return
        L34:
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r5.n(r0)
            java.lang.String r0 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')"
            r5.n(r0)
            java.util.ArrayList r4 = r4.d
            int r5 = r4.size()
        L44:
            if (r3 >= r5) goto L52
            java.lang.Object r0 = r4.get(r3)
            int r3 = r3 + 1
            v5i r0 = (defpackage.v5i) r0
            r0.getClass()
            goto L44
        L52:
            return
        L53:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L55
        L55:
            r5 = move-exception
            defpackage.vtp.v(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6i.e(to9):void");
    }

    @Override // defpackage.e04
    public final void f(to9 to9Var, int i, int i2) throws SQLException {
        h(to9Var, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // defpackage.e04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.to9 r6) throws android.database.SQLException {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r6.r(r0)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            android.database.Cursor r1 = (android.database.Cursor) r1     // Catch: java.lang.Throwable -> La6
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> La6
            r3 = 0
            if (r2 == 0) goto L1a
            int r1 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = r3
        L1b:
            r2 = 0
            defpackage.vtp.v(r0, r2)
            if (r1 == 0) goto L62
            b30 r0 = new b30
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r4 = 5
            r0.<init>(r4, r1, r3)
            android.database.Cursor r0 = r6.q(r0)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            android.database.Cursor r1 = (android.database.Cursor) r1     // Catch: java.lang.Throwable -> L5b
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L3d
            java.lang.String r1 = r1.getString(r3)     // Catch: java.lang.Throwable -> L5b
            goto L3e
        L3d:
            r1 = r2
        L3e:
            defpackage.vtp.v(r0, r2)
            java.lang.String r0 = "86254750241babac4b8d52996a675549"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L74
            java.lang.String r0 = "1cbd3130fa23b59692c061c594c16cc0"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L74
            java.lang.String r5 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 86254750241babac4b8d52996a675549, found: "
            java.lang.String r5 = sko.j(r5, r1)
            qp2.n(r5)
            return
        L5b:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L5d
        L5d:
            r6 = move-exception
            defpackage.vtp.v(r0, r5)
            throw r6
        L62:
            ei2 r0 = tvk.o(r6)
            boolean r1 = r0.b
            if (r1 == 0) goto L9e
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r6.n(r0)
            java.lang.String r0 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')"
            r6.n(r0)
        L74:
            tvk r0 = r5.e
            java.lang.Object r0 = r0.a
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0
            java.lang.String r1 = "PRAGMA foreign_keys = ON"
            r6.n(r1)
            osk r1 = new osk
            r1.<init>(r6)
            r0.q(r1)
            java.util.ArrayList r0 = r5.d
            int r1 = r0.size()
        L8d:
            if (r3 >= r1) goto L9b
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            v5i r4 = (defpackage.v5i) r4
            r4.a(r6)
            goto L8d
        L9b:
            r5.c = r2
            return
        L9e:
            java.lang.String r5 = "Pre-packaged database has an invalid schema: "
            java.lang.String r6 = r0.a
            j9h.u(r6, r5)
            return
        La6:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> La8
        La8:
            r6 = move-exception
            defpackage.vtp.v(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6i.g(to9):void");
    }

    @Override // defpackage.e04
    public final void h(to9 to9Var, int i, int i2) throws SQLException {
        List listG;
        ng6 ng6Var = this.c;
        if (ng6Var != null && (listG = kfo.G(ng6Var.d, i, i2)) != null) {
            z4o.O(new osk(to9Var));
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                ((ryd) it.next()).a(to9Var);
            }
            ei2 ei2VarO = tvk.o(to9Var);
            if (!ei2VarO.b) {
                j9h.u(ei2VarO.a, "Migration didn't properly handle: ");
                return;
            } else {
                to9Var.n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                to9Var.n("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
                return;
            }
        }
        ng6 ng6Var2 = this.c;
        if (ng6Var2 == null || kfo.T(ng6Var2, i, i2)) {
            qp2.n(fki.o(i, i2, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
            return;
        }
        to9Var.n("DROP TABLE IF EXISTS `Dependency`");
        to9Var.n("DROP TABLE IF EXISTS `WorkSpec`");
        to9Var.n("DROP TABLE IF EXISTS `WorkTag`");
        to9Var.n("DROP TABLE IF EXISTS `SystemIdInfo`");
        to9Var.n("DROP TABLE IF EXISTS `WorkName`");
        to9Var.n("DROP TABLE IF EXISTS `WorkProgress`");
        to9Var.n("DROP TABLE IF EXISTS `Preference`");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((v5i) obj).getClass();
        }
        tvk.i(to9Var);
    }
}
