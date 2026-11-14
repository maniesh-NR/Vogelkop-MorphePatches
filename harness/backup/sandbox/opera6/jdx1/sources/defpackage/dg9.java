package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class dg9 implements trm, xsm {
    public final pe4 a;
    public final hyd b;
    public final hak c;
    public final ctm d;
    public final cdo e;
    public zrm f;
    public Rational g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final boolean k;
    public final ArrayList l;
    public final ArrayList m;
    public cd5 n;
    public cd5 o;
    public d3k p;
    public d3k q;

    public dg9(pe4 pe4Var, hyd hydVar, hak hakVar, ctm ctmVar, cdo cdoVar) {
        ArrayList arrayList;
        Object next;
        this.a = pe4Var;
        this.b = hydVar;
        this.c = hakVar;
        this.d = ctmVar;
        this.e = cdoVar;
        ge4 ge4Var = pe4Var.b;
        ge4 ge4Var2 = pe4Var.b;
        Object objC = ((ma4) ge4Var).c(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        this.h = (Integer) (objC == null ? obj : objC);
        Object objC2 = ((ma4) ge4Var2).c(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        this.i = (Integer) (objC2 == null ? obj : objC2);
        Object objC3 = ((ma4) ge4Var2).c(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        this.j = (Integer) (objC3 != null ? objC3 : 0);
        ge4.Oo.getClass();
        this.k = fe4.a(ge4Var2);
        int[] iArr = (int[]) ((ma4) ge4Var2).c(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        ArrayList arrayList2 = null;
        if (iArr != null) {
            arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                List list = y10.b;
                arrayList.add(wxe.z(i));
            }
        } else {
            arrayList = null;
        }
        this.l = arrayList;
        int[] iArr2 = (int[]) ((ma4) this.a.b).c(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr2 != null) {
            ArrayList arrayList3 = new ArrayList(iArr2.length);
            for (int i2 : iArr2) {
                Iterator it = v40.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((v40) next).a == i2) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                arrayList3.add((v40) next);
            }
            arrayList2 = arrayList3;
        }
        this.m = arrayList2;
    }

    @Override // defpackage.xsm
    public final void a(LinkedHashSet linkedHashSet) {
        Size sizeD;
        this.g = null;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            qrm qrmVar = (qrm) it.next();
            if ((qrmVar instanceof swg) && (sizeD = ((swg) qrmVar).d()) != null) {
                this.g = new Rational(sizeD.getWidth(), sizeD.getHeight());
            }
        }
    }

    @Override // defpackage.trm
    public final void b(zrm zrmVar) {
        this.f = zrmVar;
    }

    public final Rational c() {
        Rational rational = this.g;
        if (rational != null) {
            return rational;
        }
        cdo cdoVar = this.e;
        return new Rational(cdoVar.l().width(), cdoVar.l().height());
    }

    @Override // defpackage.trm
    public final void reset() {
        this.g = null;
        cd5 cd5Var = new cd5();
        zrm zrmVar = this.f;
        if (zrmVar == null) {
            am2.z("Camera is not active.", cd5Var);
            return;
        }
        d3k d3kVar = this.p;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        d3k d3kVar2 = this.q;
        if (d3kVar2 != null) {
            d3kVar2.k((CancellationException) null);
        }
        cd5 cd5Var2 = this.o;
        if (cd5Var2 != null) {
            am2.z("Cancelled by another cancelFocusAndMetering()", cd5Var2);
        }
        this.o = cd5Var;
        cd5 cd5Var3 = this.n;
        if (cd5Var3 != null) {
            am2.z("Cancelled by cancelFocusAndMetering()", cd5Var3);
        }
        hak hakVar = this.c;
        synchronized (hakVar.d) {
            hakVar.l = null;
        }
        hakVar.f();
        p37.f0(zrmVar.e(), cd5Var);
    }
}
