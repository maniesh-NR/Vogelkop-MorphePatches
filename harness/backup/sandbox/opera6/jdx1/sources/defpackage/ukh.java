package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ukh {
    public static final ukh e;
    public static final ukh f;
    public final /* synthetic */ byte a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        boolean z = false;
        e = new ukh(z, z, z, (byte) 0);
        f = new ukh(z, z, true, (byte) 0);
    }

    public /* synthetic */ ukh(boolean z, boolean z2, boolean z3, byte b) {
        this.a = b;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final rg2 a() {
        if (this.b || !(this.c || this.d)) {
            return new rg2(this);
        }
        qp2.n("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }

    public final boolean b() {
        return (this.d || this.c) && this.b;
    }

    public final int hashCode() {
        switch (this.a) {
            case 5:
                return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d));
            default:
                return super.hashCode();
        }
    }
}
