package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class dd1 extends n1 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dd1(List list, byte b) {
        super(list, (byte) 3);
        this.c = b;
    }

    public final a73 D() {
        switch (this.c) {
            case 0:
                return new ka5((List) ((n1) this).b, (byte) 0);
            case 1:
                return new h2a((List) ((n1) this).b, (byte) 0);
            case 2:
                return new ka5((List) ((n1) this).b, (byte) 1);
            case 3:
                return new h2a((List) ((n1) this).b, (byte) 1);
            case 4:
                return new h2a((List) ((n1) this).b, (byte) 2);
            case 5:
                return new dbj((List) ((n1) this).b);
            default:
                return new ka5((List) ((n1) this).b, (byte) 2);
        }
    }
}
