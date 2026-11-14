package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final /* synthetic */ class hvc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hvc(Object obj, Object obj2, boolean z, boolean z2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                i3j i3jVar = (i3j) obj2;
                cre creVar = (cre) obj;
                ((ta7) i3jVar.a).F(creVar, z2);
                if (!creVar.equals((cre) i3jVar.c) && z) {
                    i3jVar.H(z2, false);
                    break;
                }
                break;
            case 1:
                ((nlh) obj2).K0(Collections.singletonList((ilh) obj), z2, z, false);
                break;
            case 2:
                ev4 ev4Var = (ev4) obj2;
                ((szk) ev4Var.f).a.removeCallbacks((y1n) obj);
                ((wci) ev4Var.d).p(z2, z);
                break;
            default:
                ev4 ev4Var2 = (ev4) obj2;
                ((szk) ev4Var2.f).a.removeCallbacks((ttn) obj);
                ((jvg) ev4Var2.d).E(z2, z);
                break;
        }
    }
}
