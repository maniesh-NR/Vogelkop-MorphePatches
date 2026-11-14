package ads_mobile_sdk;

/* loaded from: classes.dex */
abstract class qe {
    public static final /* synthetic */ int a = 0;
    private static final Class<?> c;
    private static final boolean d;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        c = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        d = cls2 != null;
    }

    public static Class<?> a() {
        return c;
    }

    public static boolean b() {
        return (c == null || d) ? false : true;
    }
}
