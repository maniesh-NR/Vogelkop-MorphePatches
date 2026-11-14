package defpackage;

/* loaded from: classes.dex */
public abstract class wsk implements AutoCloseable {
    public final to9 a;
    public final String b;
    public boolean c;

    public wsk(to9 to9Var, String str) {
        this.a = to9Var;
        this.b = str;
    }

    public abstract void B(int i, double d);

    public abstract void T0(int i, long j);

    public abstract void Z0(int i, byte[] bArr);

    public abstract byte[] getBlob(int i);

    public abstract int getColumnCount();

    public abstract String getColumnName(int i);

    public abstract double getDouble(int i);

    public abstract long getLong(int i);

    public abstract void h(int i, String str);

    public abstract boolean isNull(int i);

    public abstract void j1(int i);

    public boolean k() {
        return getLong(0) != 0;
    }

    public abstract String l(int i);

    public void m() {
        o();
    }

    public abstract boolean n();

    public final void o() {
        if (this.c) {
            nxg.u(21, "statement is closed");
            throw null;
        }
    }
}
