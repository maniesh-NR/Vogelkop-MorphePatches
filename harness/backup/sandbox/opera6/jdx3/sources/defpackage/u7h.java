package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class u7h extends n1 {
    public final xo c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ w7h e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u7h(w7h w7hVar, xo xoVar, byte b) {
        this(w7hVar, xoVar, (short) 0);
        this.d = b;
        switch (b) {
            case 2:
                Objects.requireNonNull(w7hVar);
                this.e = w7hVar;
                this(w7hVar, xoVar, (short) 0);
                break;
            case 3:
                Objects.requireNonNull(w7hVar);
                this.e = w7hVar;
                this(w7hVar, xoVar, (short) 0);
                break;
            case 4:
                Objects.requireNonNull(w7hVar);
                this.e = w7hVar;
                this(w7hVar, xoVar, (short) 0);
                break;
            default:
                Objects.requireNonNull(w7hVar);
                this.e = w7hVar;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u7h(w7h w7hVar, xo xoVar, il ilVar) {
        this(w7hVar, xoVar, (short) 0);
        this.d = (byte) 1;
        Objects.requireNonNull(w7hVar);
        this.e = w7hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7h(w7h w7hVar, xo xoVar, short s) {
        super(w7hVar);
        Objects.requireNonNull(w7hVar);
        this.c = xoVar;
    }

    @Override // defpackage.n1
    public final dz V(cz czVar) {
        byte b = this.d;
        xo xoVar = this.c;
        w7h w7hVar = this.e;
        switch (b) {
            case 0:
                return new ao(w7hVar.a, w7hVar.b, xoVar.h, xoVar.i, w7hVar.f, w7hVar.j, w7hVar.w, w7hVar.b(czVar), w7hVar.n, ap.b(xoVar.e, xoVar.g), w7hVar.s, xoVar.j, new t7h(w7hVar, (byte) 3), new t7h(w7hVar, (byte) 4), new t7h(w7hVar, (byte) 5));
            case 1:
                return new s00(w7hVar.a, w7hVar.c, w7hVar.v, xoVar.h, xoVar.i, w7hVar.f, w7hVar.j, w7hVar.w, w7hVar.b(czVar), w7hVar.n, ap.b(xoVar.e, xoVar.g), w7hVar.s, w7hVar.m, w7hVar.p);
            case 2:
                return new oo8("FakeAdAdsProvider", w7hVar.a, yo.FAKE_AD, xoVar.h, xoVar.i, w7hVar.f, w7hVar.j, w7hVar.w, w7hVar.b(czVar), w7hVar.n, ap.b(xoVar.e, xoVar.g), w7hVar.s, (byte) 0);
            case 3:
                return new oo8("oo8", w7hVar.a, yo.OPERA, xoVar.h, xoVar.i, w7hVar.f, w7hVar.j, w7hVar.w, w7hVar.b(czVar), w7hVar.n, ap.b(xoVar.e, xoVar.g), w7hVar.s, (byte) 1);
            default:
                return ((qyf) ep7.a.get()).s0(new xo7(w7hVar.a, xoVar.h, xoVar.i, w7hVar.f, w7hVar.j, w7hVar.w, w7hVar.b(czVar), w7hVar.n, ap.b(xoVar.e, xoVar.g), w7hVar.s));
        }
    }

    @Override // defpackage.n1
    public final cz W() {
        xo xoVar = this.c;
        return new cz(xoVar.d, xoVar.h, xoVar.i);
    }
}
