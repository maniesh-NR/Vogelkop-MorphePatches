package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Locale;

/* loaded from: classes.dex */
public final class xcj extends SQLiteOpenHelper {
    public final Object a;
    public SQLiteDatabase b;

    public xcj(Context context) {
        super(context, "share_target.db", (SQLiteDatabase.CursorFactory) null, 3);
        this.a = new Object();
    }

    public final SQLiteDatabase h() {
        synchronized (this.a) {
            SQLiteDatabase sQLiteDatabase = this.b;
            if (sQLiteDatabase != null) {
                return sQLiteDatabase;
            }
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.b = writableDatabase;
            writableDatabase.setLocale(Locale.US);
            return this.b;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE targets (target TEXT PRIMARY KEY, priority DOUBLE NOT NULL,time LONG NOT NULL,version LONG NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        if (i < 2) {
            sQLiteDatabase.execSQL("ALTER TABLE targets ADD COLUMN time LONG DEFAULT 0;");
        }
        if (i < 3) {
            sQLiteDatabase.execSQL("ALTER TABLE targets ADD COLUMN version LONG DEFAULT 2;");
        }
    }
}
