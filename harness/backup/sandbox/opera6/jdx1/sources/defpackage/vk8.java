package defpackage;

/* loaded from: classes.dex */
public final class vk8 {
    static final Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    static final String FULL_REGISTRY_CLASS_NAME = "com.google.protobuf.ExtensionRegistry";

    public static yk8 create() {
        yk8 yk8VarInvokeSubclassFactory = invokeSubclassFactory("newInstance");
        return yk8VarInvokeSubclassFactory != null ? yk8VarInvokeSubclassFactory : new yk8();
    }

    public static yk8 createEmpty() {
        yk8 yk8VarInvokeSubclassFactory = invokeSubclassFactory("getEmptyRegistry");
        return yk8VarInvokeSubclassFactory != null ? yk8VarInvokeSubclassFactory : yk8.EMPTY_REGISTRY_LITE;
    }

    private static final yk8 invokeSubclassFactory(String str) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls == null) {
            return null;
        }
        try {
            return (yk8) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isFullRegistry(yk8 yk8Var) {
        Class<?> cls;
        return (m21.assumeLiteRuntime || (cls = EXTENSION_REGISTRY_CLASS) == null || !cls.isAssignableFrom(yk8Var.getClass())) ? false : true;
    }

    public static Class<?> reflectExtensionRegistry() {
        try {
            return Class.forName(FULL_REGISTRY_CLASS_NAME);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
