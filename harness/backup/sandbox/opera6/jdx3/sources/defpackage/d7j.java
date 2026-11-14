package defpackage;

/* loaded from: classes.dex */
public enum d7j {
    DEFAULT("com.opera.Opera", 2131231915, 2131231759, false, 0, false),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCHER_1("com.opera.Launcher1", 2131231916, 2131231760, false, 1, false),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCHER_2("com.opera.Launcher2", 2131231919, 2131231764, false, 2, false),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCHER_3("com.opera.Launcher3", 2131231920, 2131231765, false, 3, false),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCHER_4("com.opera.Launcher4", 2131231921, 2131231766, false, 4, false),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCHER_5("com.opera.Launcher5", 2131231922, 2131231767, false, 5, false),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCHER_6("com.opera.Launcher6", 2131231923, 2131231768, true, 6, true),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCHER_7("com.opera.Launcher7", 2131231924, 2131231769, false, 7, true),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCHER_8("com.opera.Launcher8", 2131231925, 2131231770, false, 8, true),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCHER_9("com.opera.Launcher9", 2131231926, 2131231771, false, 9, true),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCHER_10("com.opera.Launcher10", 2131231917, 2131231761, false, 10, true),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCHER_11("com.opera.Launcher11", 2131231918, 2131231762, false, 11, true);

    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final byte e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    d7j(String str, int i, int i2, boolean z, int i3, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
        this.f = z2;
    }

    public static d7j d(int i) {
        for (d7j d7jVar : values()) {
            if (d7jVar.e == i) {
                return d7jVar;
            }
        }
        return DEFAULT;
    }
}
