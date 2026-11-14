package defpackage;

/* loaded from: classes.dex */
public abstract class il8 {
    public static final fl8 a = new fl8();
    public static final fl8 b;

    static {
        y6h y6hVar = y6h.c;
        fl8 fl8Var = null;
        try {
            fl8Var = (fl8) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = fl8Var;
    }
}
