package defpackage;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
public class zo9 implements rsk {
    public final SQLiteProgram a;

    public zo9(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // defpackage.rsk
    public final void B(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.rsk
    public final void T0(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.rsk
    public final void Z0(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.rsk
    public final void j1(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.rsk
    public final void w(int i, String str) {
        this.a.bindString(i, str);
    }
}
