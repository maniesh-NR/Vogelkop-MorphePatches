package defpackage;

/* loaded from: classes.dex */
public final class own {
    public final String a;
    public final nwn b;

    public own(String str, nwn nwnVar) {
        if (str.isEmpty() || str.charAt(0) != '/') {
            qp2.o("Path should start with a slash '/'.");
            throw null;
        }
        if (!str.endsWith("/")) {
            qp2.o("Path should end with a slash '/'");
            throw null;
        }
        this.a = str;
        this.b = nwnVar;
    }
}
