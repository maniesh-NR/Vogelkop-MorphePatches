package defpackage;

import android.database.Cursor;

/* loaded from: classes.dex */
public final class ilh {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public Long i;
    public final String j;
    public final long k;

    public ilh(hlh hlhVar) {
        Cursor cursor = hlhVar.a;
        this.c = cursor.getString(hlhVar.d);
        this.d = cursor.getLong(hlhVar.e);
        this.f = cursor.getString(hlhVar.g);
        this.j = cursor.getString(hlhVar.j);
        this.a = cursor.getLong(hlhVar.b);
        this.e = cursor.getString(hlhVar.f);
        int i = hlhVar.h;
        this.g = cursor.getInt(i) == 1;
        this.h = cursor.getInt(i) == 3;
        this.b = cursor.getString(hlhVar.c);
        int i2 = hlhVar.i;
        this.i = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        this.k = cursor.getLong(hlhVar.k);
    }
}
