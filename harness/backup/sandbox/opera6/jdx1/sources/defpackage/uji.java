package defpackage;

import androidx.core.app.NotificationCompat;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class uji implements sji {
    public static final c67 e = new c67(new rag(26), new u4h((byte) 24));
    public final Map a;
    public final see b;
    public vji c;
    public final tji d;

    public uji(Map map) {
        this.a = map;
        long[] jArr = imi.a;
        this.b = new see();
        this.d = new tji(this, (byte) 0);
    }

    public final void a(Object obj) {
        if (this.b.k(obj) == null) {
            this.a.remove(obj);
        }
    }

    @Override // defpackage.sji
    public final void b(Object obj, ue5 ue5Var, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(533563200);
        if ((i & 6) == 0) {
            i2 = (vt9Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.h(ue5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.h(this) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if (vt9Var.N(i2 & 1, (i2 & 147) != 146)) {
            vt9Var.Z(obj);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                tji tjiVar = this.d;
                if (!((Boolean) tjiVar.invoke(obj)).booleanValue()) {
                    j9h.t(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
                Map map = (Map) this.a.get(obj);
                hp7 hp7Var = xji.a;
                yji yjiVar = new yji(new wji(map, tjiVar));
                vt9Var.g0(yjiVar);
                objK = yjiVar;
            }
            yji yjiVar2 = (yji) objK;
            kfo.d(new k7h[]{xji.a.a(yjiVar2), ovc.a.a(yjiVar2)}, ue5Var, vt9Var, 8 | (i2 & 112));
            Unit unit = Unit.a;
            boolean zH = vt9Var.h(this) | vt9Var.h(obj) | vt9Var.h(yjiVar2);
            Object objK2 = vt9Var.K();
            if (zH || objK2 == zpaVar) {
                objK2 = new yo7(this, obj, yjiVar2, (byte) 29);
                vt9Var.g0(objK2);
            }
            rm5.b(unit, (Function1) objK2, vt9Var);
            if (vt9Var.y && vt9Var.G.i == vt9Var.z) {
                vt9Var.z = -1;
                vt9Var.y = false;
            }
            vt9Var.p(false);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ga1(this, obj, ue5Var, i, (byte) 14);
        }
    }
}
