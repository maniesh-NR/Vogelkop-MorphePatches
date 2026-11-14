package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import com.opera.api.Callback;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class ni2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ni2(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    public /* synthetic */ ni2(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ih4 crkVar;
        final pc9 pc9VarQ;
        byte b = this.a;
        byte b2 = 0;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                pi2 pi2Var = (pi2) obj2;
                if (!((ei2) obj).b) {
                    pi2Var.h = pi2Var.k(j, null, new ab(pi2Var, (byte) 22));
                    break;
                } else {
                    oi2 oi2Var = new oi2(pi2Var, j, b2);
                    mi2 mi2Var = new mi2(pi2Var, j, (byte) 3);
                    db dbVar = pi2Var.a.b;
                    if (dbVar.f()) {
                        crkVar = new crk(dbVar.g(true, oi2Var, mi2Var), (byte) 4);
                    } else {
                        mi2Var.run("Not signed in");
                        crkVar = bf9.A;
                    }
                    pi2Var.h = crkVar;
                    break;
                }
            case 1:
                ((lg4) obj2).a.onCaptureSequenceCompleted((CameraCaptureSession) obj, -1, j);
                break;
            case 2:
                ((ivh) obj2).p((owh) obj, j);
                break;
            case 3:
                String str = (String) obj;
                pd7 pd7Var = (pd7) ((nv6) obj2).a;
                Map map = pd7Var.n;
                if (map == null) {
                    pd7Var.i();
                    map = pd7Var.n;
                }
                map.put(str, new od7(pn7.f(j) + System.currentTimeMillis()));
                pd7Var.g(rbd.i(map));
                break;
            case 4:
                final String str2 = (String) obj;
                bf9 bf9Var = (bf9) ((j4c) obj2).get();
                if (bf9Var.r() >= 2 && (pc9VarQ = bf9Var.q()) != null) {
                    le9 le9Var = bf9Var.e;
                    final long j2 = this.b;
                    Callback callback = new Callback() { // from class: re9
                        @Override // com.opera.api.Callback
                        public final void run(Object obj3) {
                            je9 je9Var = (je9) obj3;
                            long j3 = je9Var.a;
                            String str3 = je9Var.b;
                            if (j2 == j3 && str2.equals(str3)) {
                                pc9VarQ.f(je9Var.a, str3, je9Var.c, je9Var.d, je9Var.e, je9Var.f, je9Var.g, true);
                            }
                        }
                    };
                    vk2 vk2Var = new vk2((byte) 13);
                    le9Var.getClass();
                    le9.c(new yx(le9Var, j2, (Object) callback, vk2Var, (byte) 4), vk2Var);
                    break;
                }
                break;
            case 5:
                glh glhVar = (glh) obj2;
                Runnable runnable = (Runnable) obj;
                glhVar.g(j, false);
                h7f h7fVar = glhVar.b;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((clh) g7fVarH.next()).e(j);
                }
                runnable.run();
                break;
            default:
                mi8 mi8Var = (mi8) ((iuh) obj2).c;
                String str3 = tym.a;
                qi8 qi8Var = mi8Var.a;
                el6 el6Var = qi8Var.t;
                d11 d11VarU = el6Var.U();
                el6Var.V(d11VarU, 26, new id5(d11VarU, obj, j));
                if (qi8Var.U == obj) {
                    qi8Var.n.i(26, new yt7((byte) 14));
                    break;
                }
                break;
        }
    }
}
