package defpackage;

/* loaded from: classes.dex */
public abstract class nad {
    public static final kad a;
    public static final kad b;

    static {
        y6h y6hVar = y6h.c;
        kad kadVar = null;
        try {
            kadVar = (kad) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = kadVar;
        b = new kad();
    }
}
