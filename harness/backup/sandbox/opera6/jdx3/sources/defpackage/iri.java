package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ImagesContract;
import com.opera.android.annotations.RequiredForTest;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class iri extends SQLiteOpenHelper {
    public final Context a;

    public iri(Context context) {
        super(context, "searchengines.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.a = context;
    }

    public static void o(int i, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.delete("searchengines", fki.u(5) + " = " + vep.A(i), null);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static Object p(Callable callable, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            try {
                Object objCall = callable.call();
                sQLiteDatabase.setTransactionSuccessful();
                return objCall;
            } catch (Exception e) {
                throw new RuntimeException("Database update failed.", e);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        return h(false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        return h(true);
    }

    public final SQLiteDatabase h(boolean z) {
        try {
            return z ? super.getWritableDatabase() : super.getReadableDatabase();
        } catch (SQLiteException unused) {
            File fileK = k();
            if (fileK != null) {
                fileK.delete();
            }
            return z ? super.getWritableDatabase() : super.getReadableDatabase();
        }
    }

    @Nullable
    @RequiredForTest
    public File k() {
        return this.a.getDatabasePath("searchengines.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0114 A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:3:0x0011, B:5:0x0088, B:7:0x00cd, B:9:0x00d3, B:24:0x0137, B:10:0x00ef, B:12:0x00ff, B:14:0x0109, B:15:0x010f, B:17:0x0114, B:19:0x011e, B:20:0x0124, B:22:0x012c, B:23:0x0132), top: B:32:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0132 A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:3:0x0011, B:5:0x0088, B:7:0x00cd, B:9:0x00d3, B:24:0x0137, B:10:0x00ef, B:12:0x00ff, B:14:0x0109, B:15:0x010f, B:17:0x0114, B:19:0x011e, B:20:0x0124, B:22:0x012c, B:23:0x0132), top: B:32:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014e A[LOOP:0: B:5:0x0088->B:28:0x014e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014a A[EDGE_INSN: B:34:0x014a->B:26:0x014a BREAK  A[LOOP:0: B:5:0x0088->B:28:0x014e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList l(defpackage.wzg r19, defpackage.p1 r20, defpackage.k6e r21) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iri.l(wzg, p1, k6e):java.util.ArrayList");
    }

    public final ArrayList m(ArrayList arrayList) throws Throwable {
        int i;
        Closeable gt6Var;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (arrayList.isEmpty()) {
            return arrayList2;
        }
        SQLiteDatabase sQLiteDatabaseH = h(true);
        sQLiteDatabaseH.beginTransaction();
        int i2 = 0;
        Closeable closeable = null;
        try {
            i = ((j6e) arrayList.get(0)).a.h;
            gt6Var = new gt6(sQLiteDatabaseH, System.currentTimeMillis());
        } catch (Throwable th) {
            th = th;
        }
        try {
            int size = arrayList.size();
            long j = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                j6e j6eVar = (j6e) obj;
                int i3 = j6eVar.a.h;
                if (i3 != i) {
                    j = 0;
                    i = i3;
                }
                arrayList2.add(gt6Var.k(j6eVar, j));
                j = 1 + j;
            }
            sQLiteDatabaseH.setTransactionSuccessful();
            xvg.l(gt6Var);
            sQLiteDatabaseH.endTransaction();
            return arrayList2;
        } catch (Throwable th2) {
            th = th2;
            closeable = gt6Var;
            xvg.l(closeable);
            sQLiteDatabaseH.endTransaction();
            throw th;
        }
    }

    public final boolean n(l6e l6eVar) {
        long j = l6eVar.b;
        if (j < 0) {
            return false;
        }
        SQLiteDatabase sQLiteDatabaseH = h(true);
        sQLiteDatabaseH.beginTransaction();
        try {
            int iDelete = sQLiteDatabaseH.delete("searchengines", fki.u(1) + " = " + j, null);
            sQLiteDatabaseH.setTransactionSuccessful();
            return iDelete > 0;
        } finally {
            sQLiteDatabaseH.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        String str;
        StringBuilder sb = new StringBuilder("CREATE TABLE searchengines (");
        for (int i : vep.B(8)) {
            switch (i) {
                case 1:
                    str = "id";
                    break;
                case 2:
                    str = "title";
                    break;
                case 3:
                    str = ImagesContract.URL;
                    break;
                case 4:
                    str = "icon";
                    break;
                case 5:
                    str = "source";
                    break;
                case 6:
                    str = "suggest_url";
                    break;
                case 7:
                    str = "position";
                    break;
                case 8:
                    str = "timestamp";
                    break;
                default:
                    throw null;
            }
            sb.append(str);
            sb.append(' ');
            String str2 = "INTEGER NOT NULL DEFAULT 0";
            switch (i) {
                case 1:
                    str2 = "INTEGER PRIMARY KEY AUTOINCREMENT";
                    break;
                case 2:
                case 3:
                    str2 = "TEXT NOT NULL";
                    break;
                case 4:
                case 6:
                    str2 = "TEXT NULL";
                    break;
                case 5:
                    str2 = "INTEGER NOT NULL";
                    break;
                case 7:
                case 8:
                    break;
                default:
                    throw null;
            }
            sb.append(str2);
            sb.append(',');
        }
        sb.setCharAt(sb.length() - 1, ')');
        sQLiteDatabase.execSQL(sb.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != 1 || i2 < 2) {
            return;
        }
        p(new y97(this, sQLiteDatabase), sQLiteDatabase);
    }

    public final boolean q(l6e l6eVar, String str) {
        SQLiteDatabase sQLiteDatabaseH = h(true);
        sQLiteDatabaseH.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("icon", str);
            int iUpdate = sQLiteDatabaseH.update("searchengines", contentValues, fki.u(1).concat("=?"), new String[]{Long.toString(l6eVar.b)});
            sQLiteDatabaseH.setTransactionSuccessful();
            return iUpdate > 0;
        } finally {
            sQLiteDatabaseH.endTransaction();
        }
    }
}
