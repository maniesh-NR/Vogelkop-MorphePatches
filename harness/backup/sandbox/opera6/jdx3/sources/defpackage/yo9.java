package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class yo9 implements qsk {
    public final Context a;
    public final String b;
    public final e04 c;
    public final boolean d;
    public final boolean e;
    public final zyk f = z4c.b(new al7((Object) this, (byte) 12));
    public boolean g;

    public yo9(Context context, String str, e04 e04Var, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = e04Var;
        this.d = z;
        this.e = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zyk zykVar = this.f;
        if (zykVar.isInitialized()) {
            ((xo9) zykVar.getValue()).close();
        }
    }

    @Override // defpackage.qsk
    public final String getDatabaseName() {
        return this.b;
    }

    @Override // defpackage.qsk
    public final to9 getWritableDatabase() {
        return ((xo9) this.f.getValue()).h(true);
    }

    @Override // defpackage.qsk
    public final void setWriteAheadLoggingEnabled(boolean z) {
        zyk zykVar = this.f;
        if (zykVar.isInitialized()) {
            ((xo9) zykVar.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.g = z;
    }
}
