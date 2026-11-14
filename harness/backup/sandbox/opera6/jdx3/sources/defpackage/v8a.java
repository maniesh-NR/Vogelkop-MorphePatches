package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class v8a implements w6f {
    public final k6l a;
    public final u4l b;
    public final pde c;
    public final t5l d;
    public final t5l e;
    public boolean h;
    public final i7f f = new i7f();
    public Map g = n08.a;
    public final ld9 i = new ld9(this, 17);

    public v8a(pde pdeVar, k6l k6lVar, u4l u4lVar, pde pdeVar2, t5l t5lVar, t5l t5lVar2) {
        this.a = k6lVar;
        this.b = u4lVar;
        this.c = pdeVar2;
        this.d = t5lVar;
        this.e = t5lVar2;
        a26.V(u4lVar, pdeVar, new s8a(this, (byte) 0));
        a26.U(k6lVar, pdeVar, new t8a(this), new al7((Object) this, (byte) 20));
        a26.V(k6lVar.s, pdeVar, new qz(this, (byte) 10));
        a26.T(pdeVar2, pdeVar, new ks6(this, (byte) 18));
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.f.b((f85) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.f.c((f85) obj);
    }

    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.d.invoke(this.i);
    }

    public final void b() {
        this.h = false;
        this.e.invoke(this.i);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : exg.s(this.a, (u3l) this.c.g())) {
            int iIntValue = ((Number) pair.a).intValue();
            linkedHashMap.put(Integer.valueOf(iIntValue), new u8a(this.b.a(iIntValue), ((List) pair.b).size()));
        }
        if (linkedHashMap.equals(this.g)) {
            return;
        }
        this.g = linkedHashMap;
        i7f i7fVar = this.f;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            f85 f85Var = (f85) g7fVarC.next();
            byte b = f85Var.a;
            Object obj = f85Var.b;
            switch (b) {
                case 0:
                    ((h85) obj).a0();
                    break;
                case 1:
                    ((d5a) obj).b();
                    break;
                default:
                    ((d0e) obj).X();
                    break;
            }
        }
    }
}
