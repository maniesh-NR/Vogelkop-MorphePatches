package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class elh implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ glh b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ elh(glh glhVar, long j, String str, byte b) {
        this.a = b;
        this.b = glhVar;
        this.c = j;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteDatabase writableDatabase;
        byte b = this.a;
        String str = this.d;
        long j = this.c;
        glh glhVar = this.b;
        switch (b) {
            case 0:
                writableDatabase = glhVar.a.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(j)};
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("title", str);
                    writableDatabase.update("reading", contentValues, "id=?", strArr);
                    writableDatabase.setTransactionSuccessful();
                    return;
                } finally {
                }
            default:
                writableDatabase = glhVar.a.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    String[] strArr2 = {Long.toString(j)};
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("content_path", str);
                    writableDatabase.update("reading", contentValues2, "id=?", strArr2);
                    writableDatabase.setTransactionSuccessful();
                    return;
                } finally {
                }
        }
    }
}
