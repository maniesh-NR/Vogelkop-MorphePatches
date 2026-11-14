package com.leanplum.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.leanplum.Leanplum;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class LeanplumEventDataManager {
    private static final String COLUMN_DATA = "data";
    private static final String DATABASE_NAME = "__leanplum.db";
    private static final int DATABASE_VERSION = 1;
    private static final String EVENT_TABLE_NAME = "event";
    private static final String KEY_ROWID = "rowid";
    private static LeanplumEventDataManager instance;
    private SQLiteDatabase database;
    private LeanplumDataBaseManager databaseManager;
    private ContentValues contentValues = new ContentValues();
    private boolean hasDatabaseError = false;

    private static class LeanplumDataBaseManager extends SQLiteOpenHelper {
        public LeanplumDataBaseManager(Context context) {
            super(context, LeanplumEventDataManager.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS event(data TEXT)");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    private LeanplumEventDataManager() {
        try {
            if (Leanplum.getContext() == null) {
                return;
            }
            LeanplumDataBaseManager leanplumDataBaseManager = this.databaseManager;
            if (leanplumDataBaseManager == null) {
                leanplumDataBaseManager = new LeanplumDataBaseManager(Leanplum.getContext());
                this.databaseManager = leanplumDataBaseManager;
            }
            this.database = leanplumDataBaseManager.getWritableDatabase();
        } catch (Throwable th) {
            handleSQLiteError("Cannot create database.", th);
        }
    }

    private void handleSQLiteError(String str, Throwable th) {
        Log.e(str, th);
        if (this.hasDatabaseError) {
            return;
        }
        this.hasDatabaseError = true;
        Log.exception(th);
    }

    public static LeanplumEventDataManager sharedInstance() {
        LeanplumEventDataManager leanplumEventDataManager = instance;
        if (leanplumEventDataManager != null) {
            return leanplumEventDataManager;
        }
        LeanplumEventDataManager leanplumEventDataManager2 = new LeanplumEventDataManager();
        instance = leanplumEventDataManager2;
        return leanplumEventDataManager2;
    }

    public void deleteEvents(int i) {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            return;
        }
        try {
            sQLiteDatabase.delete("event", "rowid in (select rowid from event ORDER BY rowid ASC LIMIT " + i + ")", null);
            this.hasDatabaseError = false;
        } catch (Throwable th) {
            handleSQLiteError("Unable to delete events from the table.", th);
        }
    }

    public List<Map<String, Object>> getEvents(int i) {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase != null) {
            Cursor cursorQuery = null;
            try {
                cursorQuery = sQLiteDatabase.query("event", new String[]{"data"}, null, null, null, null, "rowid ASC", String.valueOf(i));
                this.hasDatabaseError = false;
                while (cursorQuery.moveToNext()) {
                    arrayList.add(JsonConverter.mapFromJson(new JSONObject(cursorQuery.getString(cursorQuery.getColumnIndex("data")))));
                }
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th) {
                try {
                    handleSQLiteError("Unable to get events from the table.", th);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } finally {
                }
            }
        }
        return arrayList;
    }

    public long getEventsCount() {
        SQLiteDatabase sQLiteDatabase = this.database;
        long jQueryNumEntries = 0;
        if (sQLiteDatabase == null) {
            return 0L;
        }
        try {
            jQueryNumEntries = DatabaseUtils.queryNumEntries(sQLiteDatabase, "event");
            this.hasDatabaseError = false;
            return jQueryNumEntries;
        } catch (Throwable th) {
            handleSQLiteError("Unable to get a number of rows in the table.", th);
            return jQueryNumEntries;
        }
    }

    public boolean hasDatabaseError() {
        return this.hasDatabaseError;
    }

    public void insertEvent(String str) {
        if (this.database == null) {
            return;
        }
        this.contentValues.put("data", str);
        try {
            this.database.insert("event", null, this.contentValues);
            this.hasDatabaseError = false;
        } catch (Throwable th) {
            handleSQLiteError("Unable to insert event to database.", th);
        }
        this.contentValues.clear();
    }
}
