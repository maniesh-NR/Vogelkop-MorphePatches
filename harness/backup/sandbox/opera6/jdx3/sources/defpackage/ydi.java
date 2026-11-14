package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ydi implements Closeable {
    public static final p28 f = new p28("proto");
    public final dni a;
    public final t55 b;
    public final t55 c;
    public final kn2 d;
    public final n7h e;

    public ydi(t55 t55Var, t55 t55Var2, kn2 kn2Var, dni dniVar, n7h n7hVar) {
        this.a = dniVar;
        this.b = t55Var;
        this.c = t55Var2;
        this.d = kn2Var;
        this.e = n7hVar;
    }

    public static Long k(SQLiteDatabase sQLiteDatabase, dp2 dp2Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(dp2Var.a, String.valueOf(ryg.a(dp2Var.c))));
        byte[] bArr = dp2Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            Cursor cursor = cursorQuery;
            return !cursor.moveToNext() ? null : Long.valueOf(cursor.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String p(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(((fo2) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object q(Cursor cursor, wdi wdiVar) {
        try {
            return wdiVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final SQLiteDatabase h() {
        dni dniVar = this.a;
        Objects.requireNonNull(dniVar);
        t55 t55Var = this.c;
        long jD = t55Var.d();
        while (true) {
            try {
                return dniVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (t55Var.d() >= this.d.c + jD) {
                    throw new xyk("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object l(wdi wdiVar) {
        SQLiteDatabase sQLiteDatabaseH = h();
        sQLiteDatabaseH.beginTransaction();
        try {
            Object objApply = wdiVar.apply(sQLiteDatabaseH);
            sQLiteDatabaseH.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseH.endTransaction();
        }
    }

    public final ArrayList m(SQLiteDatabase sQLiteDatabase, dp2 dp2Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long lK = k(sQLiteDatabase, dp2Var);
        if (lK == null) {
            return arrayList;
        }
        q(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob", "experiment_ids_encrypted_list_blob", "pseudonymous_id_update_receiver_class_name"}, "context_id = ?", new String[]{lK.toString()}, null, null, null, String.valueOf(i)), new vdi(this, arrayList, dp2Var, (byte) 0));
        return arrayList;
    }

    public final void n(long j, xyc xycVar, String str) {
        l(new zx(j, str, xycVar));
    }

    public final Object o(yyk yykVar) {
        SQLiteDatabase sQLiteDatabaseH = h();
        t55 t55Var = this.c;
        long jD = t55Var.d();
        while (true) {
            try {
                sQLiteDatabaseH.beginTransaction();
                try {
                    Object objExecute = yykVar.execute();
                    sQLiteDatabaseH.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseH.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (t55Var.d() >= this.d.c + jD) {
                    throw new xyk("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
