package defpackage;

import com.opera.api.Callback;
import java.util.List;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final /* synthetic */ class cxl implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bf9 b;
    public final /* synthetic */ zzh c;

    public /* synthetic */ cxl(bf9 bf9Var, zzh zzhVar, byte b) {
        this.a = b;
        this.b = bf9Var;
        this.c = zzhVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        ixl ixlVar = ixl.b;
        zzh zzhVar = this.c;
        bf9 bf9Var = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                le9 le9Var = bf9Var.e;
                byte b2 = 2;
                if (bf9Var.r() < 2) {
                    boolean zV = bf9Var.v(list);
                    mgh mghVar = bf9Var.p;
                    if (!zV) {
                        cxl cxlVar = new cxl(bf9Var, zzhVar, b2);
                        cxl cxlVar2 = new cxl(bf9Var, zzhVar, (byte) 3);
                        le9Var.getClass();
                        mghVar.b = le9.c(new vdi(le9Var, cxlVar, cxlVar2, (byte) 10), cxlVar2);
                        break;
                    } else {
                        mghVar.b = bf9Var.R(list, false, new zzh(new zzh(zzhVar, (byte) 27), (byte) 26));
                        break;
                    }
                } else {
                    pwl pwlVarJ = bf9Var.J(list);
                    SecretKeySpec secretKeySpecX = bf9Var.x();
                    if (pwlVarJ != null && secretKeySpecX != null) {
                        bf9Var.k.add(pwlVarJ.a);
                        mgh mghVar2 = bf9Var.p;
                        byte[] encoded = secretKeySpecX.getEncoded();
                        npl nplVar = new npl(bf9Var, zzhVar, (byte) 6);
                        cxl cxlVar3 = new cxl(bf9Var, zzhVar, (byte) 1);
                        le9Var.getClass();
                        mghVar2.b = le9.c(new uf(le9Var, encoded, pwlVarJ, nplVar, cxlVar3, (byte) 4), cxlVar3);
                        break;
                    } else {
                        bf9Var.p = null;
                        zzhVar.run(ixlVar);
                        break;
                    }
                }
            case 1:
                bf9Var.p = null;
                zzhVar.run(ixlVar);
                if (((q43) obj).a == 401) {
                    bf9Var.N();
                    break;
                }
                break;
            case 2:
                List list2 = (List) obj;
                if (!bf9Var.v(list2)) {
                    bf9Var.p = null;
                    zzhVar.run(ixlVar);
                    break;
                } else {
                    bf9Var.p.b = bf9Var.R(list2, false, new zzh(new zzh(zzhVar, (byte) 27), (byte) 26));
                    break;
                }
            default:
                bf9Var.p = null;
                zzhVar.run(ixlVar);
                if (((q43) obj).a == 401) {
                    bf9Var.N();
                    break;
                }
                break;
        }
    }
}
