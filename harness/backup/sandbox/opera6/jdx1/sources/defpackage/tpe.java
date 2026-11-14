package defpackage;

/* loaded from: classes.dex */
public abstract class tpe {
    public static final qpe a;
    public static final qpe b;

    static {
        y6h y6hVar = y6h.c;
        qpe qpeVar = null;
        try {
            qpeVar = (qpe) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = qpeVar;
        b = new qpe();
    }
}
