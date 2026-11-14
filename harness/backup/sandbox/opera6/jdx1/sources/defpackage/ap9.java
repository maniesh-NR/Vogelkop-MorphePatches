package defpackage;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class ap9 extends zo9 implements rsk {
    public final SQLiteStatement b;

    public ap9(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    public final int h() {
        return this.b.executeUpdateDelete();
    }
}
