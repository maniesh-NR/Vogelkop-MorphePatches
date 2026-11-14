package defpackage;

import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.Surface;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class jg4 implements qp5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jg4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                break;
            case 1:
                xf8.F0((pde) ((ole) obj3).a, ((xd5) obj2).getResources().getConfiguration());
                break;
            case 2:
                ow6 ow6Var = (ow6) obj3;
                vtk vtkVar = (vtk) obj2;
                vtkVar.close();
                Surface surface = (Surface) ow6Var.h.remove(vtkVar);
                if (surface != null) {
                    lgf lgfVar = ow6Var.a;
                    rs9.d((AtomicBoolean) lgfVar.b, true);
                    rs9.c((Thread) lgfVar.d);
                    lgfVar.i(surface, true);
                    break;
                }
                break;
            case 3:
                en7 en7Var = (en7) obj3;
                vtk vtkVar2 = (vtk) obj2;
                vtkVar2.close();
                Surface surface2 = (Surface) en7Var.h.remove(vtkVar2);
                if (surface2 != null) {
                    an7 an7Var = en7Var.a;
                    rs9.d((AtomicBoolean) ((lgf) an7Var).b, true);
                    rs9.c((Thread) ((lgf) an7Var).d);
                    an7Var.i(surface2, true);
                    break;
                }
                break;
            default:
                h8d h8dVar = (h8d) obj3;
                amk amkVar = (amk) obj2;
                String str = (String) obj;
                g8d g8dVar = h8dVar.g;
                boolean zEquals = TextUtils.equals(h8dVar.e, amkVar.a.a);
                qb7 qb7Var = h8dVar.f;
                byte b3 = 0;
                if (!zEquals) {
                    String strU = g8dVar.u();
                    String strQ = g8dVar.Q();
                    Objects.requireNonNull(strQ);
                    e8d e8dVar = new e8d(h8dVar, b2);
                    if (((lh4) qb7Var.c).b == null) {
                        lh4 lh4Var = new lh4(new xx1((Object) qb7Var, (Object) str, (Object) amkVar, (Object) e8dVar, (byte) 1), (byte) 0);
                        qb7Var.c = lh4Var;
                        af3 af3Var = (af3) qb7Var.a;
                        nsh nshVar = amkVar.b;
                        xlk xlkVar = amkVar.c;
                        String str2 = xlkVar.d;
                        boolean z = xlkVar.f;
                        if (!af3Var.h) {
                            lh4Var.run(new ff3(new gf3(), jf3.c));
                            break;
                        } else {
                            tn tnVar = new tn();
                            ei2 ei2Var = new ei2();
                            ei2Var.b = true;
                            tnVar.d = ei2Var;
                            if (!TextUtils.isEmpty(strU)) {
                                r40 r40Var = new r40();
                                r40Var.b = strU;
                                ei2 ei2Var2 = new ei2();
                                ei2Var2.a = r40Var.b;
                                tnVar.d = ei2Var2;
                                wyh.V(tnVar, nshVar, str2, z, strQ);
                                if (str != null) {
                                    tnVar.b = str;
                                }
                                af3Var.e(new ue3(af3Var, lh4Var, nshVar, tnVar, (byte) 0));
                                break;
                            } else {
                                qp2.o("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                                break;
                            }
                        }
                    } else {
                        km ef3Var = new ef3();
                        int iOrdinal = jf3.b.ordinal();
                        if (iOrdinal == 0) {
                            e8dVar.b.E();
                            break;
                        } else if (iOrdinal != 1 && iOrdinal == 2) {
                            break;
                        }
                    }
                } else {
                    qb7Var.t(amkVar, str, new e8d(h8dVar, b3));
                    break;
                }
                break;
        }
    }
}
