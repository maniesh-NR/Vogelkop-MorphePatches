package ads_mobile_sdk;

/* loaded from: classes.dex */
public abstract class tl0 {
    public static final Class a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }

    public static final ul0 a(String str) {
        Class cls = a;
        if (cls != null) {
            try {
                return (ul0) cls.getDeclaredMethod(str, null).invoke(null, null);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
