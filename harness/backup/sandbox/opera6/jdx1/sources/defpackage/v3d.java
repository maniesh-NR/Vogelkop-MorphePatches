package defpackage;

/* loaded from: classes.dex */
public final class v3d extends n1 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3d(byte b) {
        super((byte) 4);
        this.c = b;
    }

    public final sng H0() {
        switch (this.c) {
            case 0:
                return new u3d(this);
            default:
                return new jpj(this);
        }
    }
}
