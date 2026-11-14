package defpackage;

import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z94 implements ivh {
    public final Object a = new Object();
    public final Object b = new Object();
    public u59 c = new u59((byte) 20);
    public cd5 d;
    public cd5 e;

    @Override // defpackage.ivh
    public final void D(owh owhVar, long j, w61 w61Var) {
        synchronized (this.b) {
            cd5 cd5Var = this.d;
            if (cd5Var != null) {
                if (Intrinsics.a(((hbl) owhVar.b(kbl.a, hbl.b)).a.get("Camera2CameraControl.tag"), Integer.valueOf(cd5Var.hashCode()))) {
                    cd5Var.j0((Object) null);
                    this.d = null;
                    cd5 cd5Var2 = this.e;
                    if (cd5Var2 != null) {
                        cd5Var2.j0((Object) null);
                        this.e = null;
                    }
                }
            }
        }
    }

    public final cd5 a(zrm zrmVar, boolean z) {
        eb4 eb4VarB;
        cd5 cd5Var = new cd5();
        synchronized (this.a) {
            eb4VarB = this.c.b();
        }
        synchronized (this.b) {
            if (zrmVar != null) {
                cd5 cd5Var2 = this.d;
                if (z) {
                    if (cd5Var2 != null) {
                        cd5Var2.B0(new gc4("Camera2CameraControl was updated with new options."));
                    }
                } else if (cd5Var2 != null) {
                    p37.f0(cd5Var, cd5Var2);
                }
                this.d = cd5Var;
                zrmVar.i(eb4VarB, Collections.singletonMap("Camera2CameraControl.tag", Integer.valueOf(cd5Var.hashCode())));
            } else {
                cd5 cd5Var3 = this.e;
                if (cd5Var3 != null) {
                    cd5Var3.B0(new gc4("Camera2CameraControl was updated with new options."));
                }
                this.e = cd5Var;
            }
        }
        return cd5Var;
    }
}
