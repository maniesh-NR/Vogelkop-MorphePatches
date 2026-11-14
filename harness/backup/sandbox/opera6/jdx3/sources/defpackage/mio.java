package defpackage;

/* loaded from: classes.dex */
public final class mio extends qio {
    public final Object a;

    public mio(Object obj) {
        this.a = obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(");
        Object obj = this.a;
        return z1m.l(sb, obj != null ? obj.toString() : "No data", ")");
    }
}
