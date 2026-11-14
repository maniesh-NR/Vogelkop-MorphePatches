package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class fa6 {
    public final m7h A;
    public final m7h B;
    public final m7h C;
    public final m7h D;
    public final m7h E;
    public final m7h F;
    public final m7h G;
    public final m7h H;
    public final m20 a;
    public final da6 b;
    public final m7h c;
    public final m7h d;
    public final m7h e;
    public final m7h f;
    public final m7h g;
    public final m7h h;
    public final m7h i;
    public final m7h j;
    public final m7h k;
    public final m7h l;
    public final m7h m;
    public final m7h n;
    public final m7h o;
    public final m7h p;
    public final m7h q;
    public final m7h r;
    public final m7h s;
    public final m7h t;
    public final m7h u;
    public final m7h v;
    public final m7h w;
    public final m7h x;
    public final nv6 y = new nv6();
    public final m7h z;

    public fa6(da6 da6Var, m20 m20Var, ivg ivgVar) {
        this.b = da6Var;
        this.a = m20Var;
        this.c = u35.d(da6Var, this, 4);
        this.d = u35.d(da6Var, this, 3);
        this.e = u35.d(da6Var, this, 2);
        this.f = u35.d(da6Var, this, 9);
        this.g = u35.d(da6Var, this, 10);
        this.h = u35.d(da6Var, this, 8);
        this.i = u35.d(da6Var, this, 7);
        this.j = u35.d(da6Var, this, 11);
        this.k = u35.d(da6Var, this, 6);
        this.l = u35.d(da6Var, this, 12);
        this.m = u35.d(da6Var, this, 5);
        this.n = u35.d(da6Var, this, 14);
        this.o = u35.d(da6Var, this, 13);
        this.p = u35.d(da6Var, this, 16);
        this.q = u35.d(da6Var, this, 15);
        this.r = u35.d(da6Var, this, 17);
        this.s = u35.d(da6Var, this, 18);
        this.t = u35.d(da6Var, this, 19);
        this.u = u35.d(da6Var, this, 20);
        this.v = u35.d(da6Var, this, 22);
        this.w = u35.d(da6Var, this, 21);
        this.x = u35.d(da6Var, this, 23);
        this.z = u35.d(da6Var, this, 25);
        this.A = u35.d(da6Var, this, 26);
        this.B = u35.d(da6Var, this, 28);
        this.C = u35.d(da6Var, this, 27);
        this.D = u35.d(da6Var, this, 29);
        this.E = u35.d(da6Var, this, 24);
        this.F = u35.d(da6Var, this, 30);
        this.G = u35.d(da6Var, this, 1);
        this.H = u35.d(da6Var, this, 31);
        byte b = 0;
        nv6.K(this.y, ie7.a(new ea6(da6Var, this, b, b)));
    }

    public final fel a() {
        ygh yghVarA = ((gf4) this.i.get()).a();
        ArrayList arrayListC = yghVarA.c(CaptureIntentPreviewQuirk.class);
        int size = arrayListC.size();
        int i = 0;
        while (true) {
            if (i < size) {
                Object obj = arrayListC.get(i);
                i++;
                if (((CaptureIntentPreviewQuirk) obj).b()) {
                    break;
                }
            } else if (!yghVarA.a(ImageCaptureFailedForVideoSnapshotQuirk.class)) {
                return ujp.l;
            }
        }
        return new za9(yghVarA);
    }

    public final cdo b() {
        Range rangeH;
        pe4 pe4Var = (pe4) this.d.get();
        if ("robolectric".equals(Build.FINGERPRINT)) {
            List<CameraCharacteristics.Key> list = fye.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (CameraCharacteristics.Key key : list) {
                    if (gyg.G(5, "CXCP")) {
                        Objects.toString(key);
                    }
                    if (((ma4) pe4Var.b).c(key) == null) {
                        return new fye(pe4Var);
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 30 && (rangeH = r9n.h(pe4Var.b)) != null) {
            return new ca1(pe4Var, rangeH);
        }
        d5o d5oVar = new d5o();
        d5oVar.a = pe4Var;
        d5oVar.c = (Rect) ((ma4) pe4Var.b).c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return d5oVar;
    }
}
