package defpackage;

/* loaded from: classes.dex */
public class xu9 implements ovd {
    private static final xu9 instance = new xu9();

    private xu9() {
    }

    public static xu9 getInstance() {
        return instance;
    }

    @Override // defpackage.ovd
    public boolean isSupported(Class<?> cls) {
        return gv9.class.isAssignableFrom(cls);
    }

    @Override // defpackage.ovd
    public mvd messageInfoFor(Class<?> cls) {
        if (!gv9.class.isAssignableFrom(cls)) {
            qp2.o("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (mvd) gv9.getDefaultInstance(cls.asSubclass(gv9.class)).buildMessageInfo();
        } catch (Exception e) {
            h9o.s("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }
}
