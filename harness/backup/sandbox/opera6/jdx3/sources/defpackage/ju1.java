package defpackage;

import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class ju1 extends k8 {
    public final /* synthetic */ byte o;
    public final pde p;
    public final kze q;
    public final kze r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju1(BrowserActivity browserActivity, uul uulVar, byte b) {
        super(uulVar);
        this.o = b;
        switch (b) {
            case 1:
                super(uulVar);
                pde pdeVar = new pde(new avl(uulVar.k().a, true, uulVar.e(), browserActivity.getResources().getDimensionPixelSize(2131167744) + uulVar.e(), 2));
                this.p = pdeVar;
                this.q = new kze(Float.valueOf(((avl) pdeVar.g()).a.a));
                this.r = new kze(Float.valueOf(0.0f));
                ((i7f) uulVar.h).b(new iu1(this, (byte) 1));
                break;
            default:
                pde pdeVar2 = new pde(new avl(uulVar.k().a, false, uulVar.e(), browserActivity.getResources().getDimensionPixelSize(2131167744) + uulVar.e(), 1));
                this.p = pdeVar2;
                this.q = new kze(Float.valueOf(((avl) pdeVar2.g()).a.a));
                this.r = new kze(Float.valueOf(0.0f));
                ((i7f) uulVar.h).b(new iu1(this, (byte) 0));
                break;
        }
    }

    @Override // defpackage.bvl
    public final kze E() {
        switch (this.o) {
        }
        return this.r;
    }

    @Override // defpackage.bvl
    public final kze F() {
        switch (this.o) {
        }
        return this.q;
    }

    @Override // defpackage.bvl
    public final pde getState() {
        switch (this.o) {
        }
        return this.p;
    }
}
