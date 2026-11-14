package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class lte extends y0j {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ndc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lte(ndc ndcVar, Object obj, byte b) {
        super(0);
        this.c = b;
        this.d = obj;
        this.e = ndcVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context, dx3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.content.Context, dx3] */
    @Override // defpackage.y0j
    public final void a(View view) {
        byte b = this.c;
        Object obj = this.d;
        ndc ndcVar = this.e;
        switch (b) {
            case 0:
                pte pteVar = (pte) ndcVar;
                if (!vtp.M(pteVar)) {
                    z77 z77VarU = sfe.U(pteVar.requireActivity());
                    tim timVarL0 = nrf.l0((String) obj, ((OperaListItem) pteVar.A.j).A.D());
                    z77VarU.getClass();
                    z77VarU.b(timVarL0, ijm.b);
                    break;
                }
                break;
            case 1:
                wii wiiVar = (wii) obj;
                iji ijiVar = (iji) ndcVar;
                byte b2 = 2;
                if (wiiVar == null) {
                    ?? r0 = ijiVar.c;
                    w8d w8dVar = new w8d(b2, ijiVar, false);
                    int[][] iArr = lg7.a;
                    if (!r9n.X((Context) r0)) {
                        f03.U(r0.j, "android.permission.WRITE_EXTERNAL_STORAGE", new dz4(w8dVar));
                        break;
                    } else {
                        w8dVar.run(Boolean.TRUE);
                        break;
                    }
                } else {
                    byte b3 = 1;
                    vii viiVar = new vii(ijiVar, b3);
                    switch (wiiVar.a) {
                        case 0:
                            iji ijiVar2 = wiiVar.b;
                            ijiVar2.F();
                            if (!ijiVar2.p().equals(ijiVar2.e.d())) {
                                viiVar.run(Boolean.FALSE);
                                break;
                            } else {
                                vml.d.e(new vdi(ijiVar2.c, ijiVar2.p, ijiVar2.p(), (byte) 2)).c(new mgf(ijiVar2, viiVar, (byte) 22)).a(null, null);
                                break;
                            }
                        default:
                            iji ijiVar3 = wiiVar.b;
                            ijiVar3.E();
                            ijiVar3.j(new wii(ijiVar3, b3));
                            boolean zEquals = ijiVar3.p().equals(ijiVar3.e.d());
                            iji ijiVar4 = viiVar.b;
                            ?? r2 = ijiVar4.c;
                            w8d w8dVar2 = new w8d(b2, ijiVar4, zEquals);
                            int[][] iArr2 = lg7.a;
                            if (!r9n.X((Context) r2)) {
                                f03.U(r2.j, "android.permission.WRITE_EXTERNAL_STORAGE", new dz4(w8dVar2));
                                break;
                            } else {
                                w8dVar2.run(Boolean.TRUE);
                                break;
                            }
                    }
                }
            default:
                try {
                    ((iji) ndcVar).c.startActivity((Intent) obj);
                    break;
                } catch (ActivityNotFoundException unused) {
                    return;
                }
        }
    }
}
