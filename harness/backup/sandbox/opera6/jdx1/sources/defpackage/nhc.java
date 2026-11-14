package defpackage;

/* loaded from: classes.dex */
public abstract class nhc {
    public static final khc a;
    public static final khc b;

    static {
        y6h y6hVar = y6h.c;
        khc khcVar = null;
        try {
            khcVar = (khc) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = khcVar;
        b = new khc();
    }
}
