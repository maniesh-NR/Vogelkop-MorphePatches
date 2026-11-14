package defpackage;

/* loaded from: classes.dex */
public final class i3a extends n3a {
    public final byte b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public i3a(int i, boolean z) {
        super("GRAPH_ERROR");
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.n3a
    public final String toString() {
        return this.a + "(cameraError=" + ((Object) yc4.a(this.b)) + ", willAttemptRetry=" + this.c + ')';
    }
}
