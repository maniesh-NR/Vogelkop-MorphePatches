package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class wrm {
    public final vsm a;
    public final ctm b;
    public final zrm c;
    public final n7h d;
    public final n7h e;
    public final n7h f;
    public final int g;
    public final af2 h;
    public final zyk i;
    public final zyk j;
    public final zyk k;

    public wrm(vsm vsmVar, ctm ctmVar, zrm zrmVar, n7h n7hVar, n7h n7hVar2, n7h n7hVar3) {
        this.a = vsmVar;
        this.b = ctmVar;
        this.c = zrmVar;
        this.d = n7hVar;
        this.e = n7hVar2;
        this.f = n7hVar3;
        bf2 bf2Var = xrm.a;
        bf2Var.getClass();
        this.g = bf2.b.incrementAndGet(bf2Var);
        final byte b = 0;
        this.h = c26.i(false);
        if (gyg.G(3, "CXCP")) {
            toString();
        }
        this.i = z4c.b(new Function0(this) { // from class: urm
            public final /* synthetic */ wrm b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                wrm wrmVar = this.b;
                switch (b2) {
                    case 0:
                        return (btm) wrmVar.d.get();
                    case 1:
                        return (w3j) wrmVar.e.get();
                    default:
                        return (ni4) wrmVar.f.get();
                }
            }
        });
        final byte b2 = 1;
        this.j = z4c.b(new Function0(this) { // from class: urm
            public final /* synthetic */ wrm b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                wrm wrmVar = this.b;
                switch (b22) {
                    case 0:
                        return (btm) wrmVar.d.get();
                    case 1:
                        return (w3j) wrmVar.e.get();
                    default:
                        return (ni4) wrmVar.f.get();
                }
            }
        });
        final byte b3 = 2;
        this.k = z4c.b(new Function0(this) { // from class: urm
            public final /* synthetic */ wrm b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b3;
                wrm wrmVar = this.b;
                switch (b22) {
                    case 0:
                        return (btm) wrmVar.d.get();
                    case 1:
                        return (w3j) wrmVar.e.get();
                    default:
                        return (ni4) wrmVar.f.get();
                }
            }
        });
    }

    public final String toString() {
        return "UseCaseCamera-" + this.g;
    }
}
