package defpackage;

import android.database.Cursor;

/* loaded from: classes.dex */
public final class t41 {
    public final Cursor a;

    public t41(Cursor cursor) {
        this.a = cursor;
    }

    public final Long a(int i) {
        Cursor cursor = this.a;
        if (cursor.isNull(i)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i));
    }

    public final String b(int i) {
        Cursor cursor = this.a;
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }

    public final hgh c() {
        return new hgh(Boolean.valueOf(this.a.moveToNext()));
    }
}
