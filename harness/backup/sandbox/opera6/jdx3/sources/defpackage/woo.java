package defpackage;

/* loaded from: classes.dex */
public class woo implements vm {
    public final vm a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;

    public woo(vm vmVar) {
        this.a = vmVar;
    }

    @Override // defpackage.vm
    public final void C(cm cmVar) {
        if (b()) {
            return;
        }
        this.e = true;
        this.a.C(cmVar);
    }

    public final boolean b() {
        return this.d || this.e;
    }

    @Override // defpackage.vm
    public final void g() {
        if (b()) {
            return;
        }
        int i = this.c + 1;
        this.c = i;
        if (i > 1) {
            return;
        }
        this.a.g();
    }

    @Override // defpackage.vm
    public final void onAdClicked() {
        if (b()) {
            return;
        }
        this.a.onAdClicked();
    }

    @Override // defpackage.vm
    public final void onAdDismissed() {
        if (b()) {
            return;
        }
        this.d = true;
        this.a.onAdDismissed();
    }

    @Override // defpackage.vm
    public final void onAdOpened() {
        if (b() || this.b) {
            return;
        }
        this.b = true;
        this.a.onAdOpened();
    }
}
