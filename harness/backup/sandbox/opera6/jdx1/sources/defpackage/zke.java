package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zke extends yee {
    public final yee o;
    public boolean p;

    public zke(long j, xtj xtjVar, Function1 function1, Function1 function12, yee yeeVar) {
        super(j, xtjVar, function1, function12);
        this.o = yeeVar;
        yeeVar.k();
    }

    @Override // defpackage.yee, defpackage.ttj
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.yee
    public final zwg w() {
        zke zkeVar;
        yee yeeVar = this.o;
        if (yeeVar.m || yeeVar.c) {
            return new utj(this);
        }
        tee teeVar = this.h;
        long j = this.b;
        HashMap mapM = teeVar != null ? ytj.m(yeeVar.g(), this, this.o.d()) : null;
        Object obj = ytj.c;
        synchronized (obj) {
            ytj.v(this);
            if (teeVar == null || teeVar.d == 0) {
                zkeVar = this;
                zkeVar.a();
            } else {
                zkeVar = this;
                zwg zwgVarZ = zkeVar.z(this.o.g(), teeVar, mapM, this.o.d());
                if (!zwgVarZ.equals(vtj.a)) {
                    return zwgVarZ;
                }
                tee teeVarX = zkeVar.o.x();
                if (teeVarX != null) {
                    teeVarX.j(teeVar);
                } else {
                    zkeVar.o.B(teeVar);
                    zkeVar.h = null;
                }
            }
            if (Intrinsics.c(zkeVar.o.g(), j) < 0) {
                zkeVar.o.v();
            }
            yee yeeVar2 = zkeVar.o;
            yeeVar2.r(yeeVar2.d().c(j).b(zkeVar.j));
            zkeVar.o.A(j);
            yee yeeVar3 = zkeVar.o;
            int i = zkeVar.d;
            zkeVar.d = -1;
            if (i >= 0) {
                int[] iArr = yeeVar3.k;
                int length = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                iArrCopyOf[length] = i;
                yeeVar3.k = iArrCopyOf;
            } else {
                yeeVar3.getClass();
            }
            yee yeeVar4 = zkeVar.o;
            xtj xtjVar = zkeVar.j;
            yeeVar4.getClass();
            synchronized (obj) {
                yeeVar4.j = yeeVar4.j.e(xtjVar);
                yee yeeVar5 = zkeVar.o;
                int[] iArr2 = zkeVar.k;
                yeeVar5.getClass();
                if (iArr2.length != 0) {
                    int[] iArr3 = yeeVar5.k;
                    if (iArr3.length != 0) {
                        int length2 = iArr3.length;
                        int length3 = iArr2.length;
                        int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                        System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                        iArr2 = iArrCopyOf2;
                    }
                    yeeVar5.k = iArr2;
                }
            }
            zkeVar.m = true;
            if (!zkeVar.p) {
                zkeVar.p = true;
                zkeVar.o.l();
            }
            return vtj.a;
        }
    }
}
