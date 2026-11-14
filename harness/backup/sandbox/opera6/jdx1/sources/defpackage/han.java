package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class han implements wc4 {
    public final v21 a;
    public final Object b = new Object();
    public boolean c;

    public han(v21 v21Var) {
        this.a = v21Var;
    }

    @Override // defpackage.wc4
    public final boolean D(jl8 jl8Var) {
        boolean zD;
        synchronized (this.b) {
            if (this.c) {
                jl8Var.g.a();
                zD = false;
            } else {
                zD = this.a.D(jl8Var);
            }
        }
        return zD;
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        return this.a.E(s15Var);
    }

    @Override // defpackage.wc4
    public final String G() {
        return this.a.c;
    }

    @Override // defpackage.wc4
    public final CaptureRequest.Builder H(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Builder builderH;
        synchronized (this.b) {
            builderH = this.c ? null : this.a.H(totalCaptureResult);
        }
        return builderH;
    }

    @Override // defpackage.wc4
    public final void I(int i) {
        this.a.I(i);
    }

    @Override // defpackage.wc4
    public final boolean P(x3j x3jVar) {
        boolean zP;
        synchronized (this.b) {
            if (this.c) {
                x3jVar.e.a();
                zP = false;
            } else {
                zP = this.a.P(x3jVar);
            }
        }
        return zP;
    }

    @Override // defpackage.wc4
    public final boolean T(List list, dk4 dk4Var) {
        boolean zT;
        synchronized (this.b) {
            if (this.c) {
                dk4Var.a();
                zT = false;
            } else {
                zT = this.a.T(list, dk4Var);
            }
        }
        return zT;
    }

    @Override // defpackage.wc4
    public final void V() {
        this.a.V();
    }

    @Override // defpackage.wc4
    public final boolean W(ArrayList arrayList, dk4 dk4Var) {
        boolean zW;
        synchronized (this.b) {
            if (this.c) {
                dk4Var.a();
                zW = false;
            } else {
                zW = this.a.W(arrayList, dk4Var);
            }
        }
        return zW;
    }

    @Override // defpackage.wc4
    public final boolean h(m8b m8bVar, ArrayList arrayList, dk4 dk4Var) {
        boolean zH;
        synchronized (this.b) {
            if (this.c) {
                dk4Var.a();
                zH = false;
            } else {
                zH = this.a.h(m8bVar, arrayList, dk4Var);
            }
        }
        return zH;
    }

    @Override // defpackage.wc4
    public final boolean k(ArrayList arrayList, dk4 dk4Var) {
        boolean zK;
        synchronized (this.b) {
            if (this.c) {
                dk4Var.a();
                zK = false;
            } else {
                zK = this.a.k(arrayList, dk4Var);
            }
        }
        return zK;
    }

    @Override // defpackage.wc4
    public final boolean l(InputConfiguration inputConfiguration, ArrayList arrayList, dk4 dk4Var) {
        boolean zL;
        synchronized (this.b) {
            if (this.c) {
                dk4Var.a();
                zL = false;
            } else {
                zL = this.a.l(inputConfiguration, arrayList, dk4Var);
            }
        }
        return zL;
    }

    @Override // defpackage.wc4
    public final void n() {
        this.a.n();
    }

    @Override // defpackage.wc4
    public final CaptureRequest.Builder o(int i) {
        CaptureRequest.Builder builderO;
        synchronized (this.b) {
            builderO = this.c ? null : this.a.o(i);
        }
        return builderO;
    }
}
