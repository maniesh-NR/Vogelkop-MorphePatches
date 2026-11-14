package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class b0e extends dt1 {
    public static final nv6 n = new nv6(new uvc((byte) 12));
    public final pde e;
    public final k6l f;
    public final pde g;
    public final g0e h;
    public final yqa i;
    public final i0e j;
    public final rn9 k = new rn9(this);
    public final tsd l;
    public x77 m;

    public b0e(pde pdeVar, k6l k6lVar, u4l u4lVar, pde pdeVar2, v8a v8aVar, s9i s9iVar, pde pdeVar3, yhe yheVar, pde pdeVar4, g0e g0eVar, yqa yqaVar, i0e i0eVar) {
        this.e = pdeVar;
        this.f = k6lVar;
        this.g = pdeVar3;
        this.h = g0eVar;
        this.i = yqaVar;
        this.j = i0eVar;
        tsd tsdVarB = xf8.B(xf8.Y((Object) null, pdeVar2, (pde) ((p9l) i0eVar.a.a).m, new nf8((byte) 15)));
        this.l = tsdVarB;
        this.m = new x77((List) l08.a);
        a0e a0eVar = new a0e(this);
        qz qzVar = new qz(this, (byte) 12);
        final byte b = 1;
        setHasStableIds(true);
        J(zzd.class, new ws1(this, yheVar, pdeVar4, s9iVar, (byte) 10), new rqd((byte) 4), new a3j((byte) 4));
        J(yzd.class, new vw1(this, u4lVar, v8aVar, yheVar, pdeVar4, s9iVar, (byte) 3), new rqd((byte) 5), new a3j((byte) 4));
        final byte b2 = 0;
        a26.U(k6lVar, pdeVar, a0eVar, new Function0(this) { // from class: uzd
            public final /* synthetic */ b0e b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b3 = b2;
                b0e b0eVar = this.b;
                switch (b3) {
                    case 0:
                        b0eVar.k.N();
                        break;
                    default:
                        b0eVar.k.N();
                        break;
                }
                return Unit.a;
            }
        });
        a26.U(k6lVar.s, pdeVar, qzVar, new Function0(this) { // from class: uzd
            public final /* synthetic */ b0e b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b3 = b;
                b0e b0eVar = this.b;
                switch (b3) {
                    case 0:
                        b0eVar.k.N();
                        break;
                    default:
                        b0eVar.k.N();
                        break;
                }
                return Unit.a;
            }
        });
        a26.T(tsdVarB, pdeVar, new d8d(this, (byte) 6));
    }

    @Override // defpackage.dt1
    public final long getItemId(int i) {
        return ((vzd) ((ArrayList) this.d).get(i)).getId();
    }
}
