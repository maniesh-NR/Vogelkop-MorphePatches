package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class tz3 {
    public final bp3 a;
    public final List b;
    public final int c;
    public final int d;
    public final boolean e;
    public final uz3 f;
    public final List g;
    public final /* synthetic */ zg h;

    public tz3(zg zgVar, bp3 bp3Var, List list, int i, int i2) {
        this.h = zgVar;
        this.a = bp3Var;
        this.b = list;
        this.c = i;
        this.d = i2;
        boolean z = list.size() <= 1;
        this.e = z;
        this.f = (uz3) CollectionsKt.M(0, list);
        this.g = z ? l08.a : list.subList(1, list.size());
    }

    public final void a(boolean z) {
        bp3 bp3Var = this.a;
        ((d4l) bp3Var.h).invoke();
        if (z) {
            zg zgVar = this.h;
            zgVar.a = 0;
            zgVar.d = null;
        } else {
            AppCompatImageView appCompatImageView = ((r9l) bp3Var.c).q.d;
            mu5 mu5Var = new mu5(appCompatImageView, new lr2((byte) 1), new cv2((Object) appCompatImageView, (Object) bp3Var, (byte) 12), (byte) 0);
            bp3Var.b = true;
            mu5Var.j(((c9l) bp3Var.d).b.p);
        }
    }

    public final void b(boolean z) {
        if (this.e && !z) {
            a(true);
            return;
        }
        List list = z ? this.b : this.g;
        int i = this.c + (!z ? 1 : 0);
        int i2 = this.d;
        zg zgVar = this.h;
        bp3 bp3Var = this.a;
        ((c9l) bp3Var.d).b.p.postOnAnimation(new fv2(new oc2(new tz3(zgVar, bp3Var, list, i, i2), (byte) 27), (byte) 24));
    }

    public final void c() {
        uz3 uz3Var = this.f;
        if (uz3Var == null) {
            a(true);
            return;
        }
        f9 f9Var = new f9((Object) this.h, (Object) this, (Object) uz3Var, (byte) 16);
        bp3 bp3Var = this.a;
        View viewE = ((r9l) bp3Var.c).e(uz3Var);
        if (viewE == null) {
            f9Var.invoke(vz3.e);
            return;
        }
        rz3 rz3Var = new rz3(new qz3(uz3Var, this.c, this.d, cs5.W(viewE)), viewE, new cv2((Object) bp3Var, (Object) new f9((Object) uz3Var, (Object) viewE, (Object) f9Var, (byte) 17), (byte) 11), uz3Var == uz3.h ? k11.b : k11.a);
        rz3Var.j(((c9l) bp3Var.d).b.p);
        bp3Var.i = rz3Var;
    }
}
