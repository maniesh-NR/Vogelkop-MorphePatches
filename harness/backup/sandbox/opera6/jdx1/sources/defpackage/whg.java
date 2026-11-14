package defpackage;

import android.content.Context;
import android.util.Range;

/* loaded from: classes.dex */
public final class whg {
    public final Context a;
    public final a4n b;
    public zhg c;
    public boolean d;
    public kzk e;
    public boolean f;
    public long g = 15000;
    public final b4n h;

    public whg(Context context, a4n a4nVar) {
        this.a = context.getApplicationContext();
        this.b = a4nVar;
        b4n b4nVar = new b4n();
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        b4nVar.d = range;
        b4nVar.c = ((Double) range.getUpper()).doubleValue();
        b4nVar.a = -9223372036854775807L;
        b4nVar.b = -9223372036854775807L;
        this.h = b4nVar;
        this.e = kzk.a;
    }
}
