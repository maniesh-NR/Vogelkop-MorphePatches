package defpackage;

/* loaded from: classes.dex */
public enum i4i {
    PHONE_PORTRAIT(false, false),
    PHONE_LANDSCAPE(false, true),
    TABLET_PORTRAIT(true, false),
    TABLET_LANDSCAPE(true, true);

    public final boolean a;
    public final boolean b;

    i4i(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
