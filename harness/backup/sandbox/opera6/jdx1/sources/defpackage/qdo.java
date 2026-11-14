package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class qdo implements pdo {
    public final ge4 a;
    public final zyk b = z4c.b(new m2n(this, 15));
    public final sdo c = new sdo(3, new h9o((byte) 6));
    public boolean d;
    public boolean e;
    public final boolean f;
    public bl9 g;
    public s0b h;

    public qdo(pe4 pe4Var) {
        this.a = pe4Var.b;
        this.f = d77.a(ZslDisablerQuirk.class) != null;
    }

    @Override // defpackage.pdo
    public final void a(q3j q3jVar) throws Exception {
        pyl pylVar = q3jVar.b;
        i();
        if (this.d) {
            pylVar.b = 1;
            return;
        }
        if (this.f) {
            pylVar.b = 1;
            return;
        }
        ge4.Oo.getClass();
        int[] iArr = (int[]) ((ma4) this.a).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            iArr = fe4.b;
        }
        if (!e82.n(iArr, 4)) {
            pylVar.b = 1;
            return;
        }
        zyk zykVar = this.b;
        Iterator it = e82.B(((StreamConfigurationMap) zykVar.getValue()).getInputSizes(34)).iterator();
        if (!it.hasNext()) {
            t3p.y();
            return;
        }
        Object next = it.next();
        if (it.hasNext()) {
            Size size = (Size) next;
            int height = size.getHeight() * size.getWidth();
            do {
                Object next2 = it.next();
                Size size2 = (Size) next2;
                int height2 = size2.getHeight() * size2.getWidth();
                if (height < height2) {
                    next = next2;
                    height = height2;
                }
            } while (it.hasNext());
        }
        Size size3 = (Size) next;
        if (size3 != null) {
            if (gyg.G(3, "CXCP")) {
                size3.toString();
            }
            if (e82.n(((StreamConfigurationMap) zykVar.getValue()).getValidOutputFormatsForInput(34), NotificationCompat.FLAG_LOCAL_ONLY)) {
                txd txdVar = new txd(size3.getWidth(), size3.getHeight(), 34, 9);
                bl9 bl9Var = new bl9(txdVar);
                txdVar.w(new r2n(this, (byte) 28), tjb.a());
                Surface surface = bl9Var.getSurface();
                if (surface == null) {
                    qp2.n("Required value was null.");
                    return;
                }
                s0b s0bVar = new s0b(surface, new Size(bl9Var.getWidth(), bl9Var.getHeight()), 34);
                k1g.O(s0bVar.e).addListener(new li4(bl9Var, (byte) 3), x7d.l());
                q3jVar.a(s0bVar, ip7.d, -1);
                sb4 sb4Var = txdVar.b;
                pylVar.d(sb4Var);
                ArrayList arrayList = q3jVar.e;
                if (!arrayList.contains(sb4Var)) {
                    arrayList.add(sb4Var);
                }
                q3jVar.g = new InputConfiguration(bl9Var.getWidth(), bl9Var.getHeight(), bl9Var.i());
                this.g = bl9Var;
                this.h = s0bVar;
            }
        }
    }

    @Override // defpackage.pdo
    public final void b() throws Exception {
        i();
    }

    @Override // defpackage.pdo
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.pdo
    public final void d(boolean z) {
        this.e = z;
    }

    @Override // defpackage.pdo
    public final void e(boolean z) throws Exception {
        if (this.d != z && z) {
            while (true) {
                sdo sdoVar = this.c;
                if (sdoVar.d()) {
                    break;
                } else {
                    ((qya) sdoVar.a()).close();
                }
            }
        }
        this.d = z;
    }

    @Override // defpackage.pdo
    public final qya f() {
        try {
            return (qya) this.c.a();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    @Override // defpackage.pdo
    public final boolean g(g07 g07Var, u3j u3jVar) {
        InputConfiguration inputConfiguration = u3jVar.i;
        return inputConfiguration != null && g07Var.i == inputConfiguration.getFormat() && g07Var.h.getWidth() == inputConfiguration.getWidth() && g07Var.h.getHeight() == inputConfiguration.getHeight();
    }

    @Override // defpackage.pdo
    public final boolean h() {
        return this.e;
    }

    public final void i() throws Exception {
        s0b s0bVar = this.h;
        if (s0bVar != null) {
            bl9 bl9Var = this.g;
            if (bl9Var != null) {
                k1g.O(s0bVar.e).addListener(new li4(bl9Var, (byte) 4), x7d.l());
                bl9Var.l();
                this.g = null;
            }
            s0bVar.a();
            this.h = null;
        }
        while (true) {
            sdo sdoVar = this.c;
            if (sdoVar.d()) {
                return;
            } else {
                ((qya) sdoVar.a()).close();
            }
        }
    }
}
