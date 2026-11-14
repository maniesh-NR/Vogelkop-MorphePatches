package ads_mobile_sdk;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.SystemClock;
import defpackage.mip;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class j42 extends SQLiteOpenHelper {
    public static final String f = StringsKt.l0("\n      CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)\n      ").toString();
    public final nx5 a;
    public final mip b;
    public final t42 c;
    public final am3 d;
    public final pfe e;

    public j42(Context context, nx5 nx5Var, int i, mip mipVar, t42 t42Var, am3 am3Var) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, i);
        this.a = nx5Var;
        this.b = mipVar;
        this.c = t42Var;
        this.d = am3Var;
        this.e = new pfe();
    }

    public static final void a(j42 j42Var, SQLiteDatabase sQLiteDatabase) {
        j42Var.getClass();
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArrA = j42Var.a(sQLiteDatabase);
            b42 b42Var = b42.a;
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{String.valueOf(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (String str : strArrA) {
                if (str != null) {
                    am3 am3Var = j42Var.d;
                    Uri uri = Uri.parse(str);
                    am3Var.getClass();
                    am3Var.e.b(new Pair(uri, (Object) null));
                }
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public final String[] a(SQLiteDatabase sQLiteDatabase) {
        String strV;
        b42 b42Var = b42.a;
        Cursor cursorQuery = sQLiteDatabase.query("offline_buffered_pings", new String[]{"timestamp", "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
        String[] strArr = new String[cursorQuery.getCount()];
        int i = 0;
        while (cursorQuery.moveToNext()) {
            int columnIndex = cursorQuery.getColumnIndex("timestamp");
            int columnIndex2 = cursorQuery.getColumnIndex("url");
            if (columnIndex2 != -1) {
                long j = cursorQuery.getLong(columnIndex);
                String string = cursorQuery.getString(columnIndex2);
                if (string == null) {
                    strV = "";
                } else {
                    Uri uri = Uri.parse(string);
                    this.b.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                    String encodedQuery = uri.getEncodedQuery();
                    Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                    builderClearQuery.appendQueryParameter("bd", String.valueOf(jElapsedRealtime));
                    strV = sko.v(builderClearQuery.build().toString(), "&", encodedQuery);
                }
                strArr[i] = strV;
            }
            i++;
        }
        cursorQuery.close();
        return strArr;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(f);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
