package defpackage;

/* loaded from: classes.dex */
public abstract class dkc {
    public final f7f a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ ekc d;

    public dkc(ekc ekcVar, f7f f7fVar) {
        this.d = ekcVar;
        this.a = f7fVar;
    }

    public final void a(boolean z) {
        if (z != this.b) {
            this.b = z;
            int i = z ? 1 : -1;
            ekc ekcVar = this.d;
            int i2 = ekcVar.c;
            ekcVar.c = i + i2;
            if (!ekcVar.d) {
                ekcVar.d = true;
                while (true) {
                    try {
                        int i3 = ekcVar.c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            ekcVar.l();
                        } else if (z3) {
                            ekcVar.m();
                        }
                        i2 = i3;
                    } finally {
                        ekcVar.d = false;
                    }
                }
            }
            if (this.b) {
                ekcVar.f(this);
            }
        }
    }

    public void b() {
    }

    public boolean c(ndc ndcVar) {
        return false;
    }

    public boolean d() {
        return true;
    }
}
