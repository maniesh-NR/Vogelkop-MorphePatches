package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class to9 implements Closeable {
    public static final String[] b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] c = new String[0];
    public static final l4c d;
    public static final l4c e;
    public final SQLiteDatabase a;

    static {
        f7c f7cVar = f7c.b;
        d = z4c.a(f7cVar, new be8((byte) 10));
        e = z4c.a(f7cVar, new be8((byte) 11));
    }

    public to9(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final void h() {
        this.a.beginTransaction();
    }

    public final boolean isOpen() {
        return this.a.isOpen();
    }

    public final void k() {
        this.a.beginTransactionNonExclusive();
    }

    public final ap9 l(String str) {
        return new ap9(this.a.compileStatement(str));
    }

    public final void m() {
        this.a.endTransaction();
    }

    public final void n(String str) throws SQLException {
        this.a.execSQL(str);
    }

    public final void o(String str, Object[] objArr) throws SQLException {
        this.a.execSQL(str, objArr);
    }

    public final boolean p() {
        return this.a.inTransaction();
    }

    public final Cursor q(ssk sskVar) {
        final b91 b91Var = new b91(sskVar, (byte) 1);
        return this.a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: so9
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) b91Var.j(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, sskVar.h(), c, null);
    }

    public final Cursor r(String str) {
        return q(new b30((byte) 5, str, false));
    }

    public final void s() {
        this.a.setTransactionSuccessful();
    }
}
