package ads_mobile_sdk;

import defpackage.bwg;
import defpackage.hlo;
import defpackage.tso;
import java.io.File;

/* loaded from: classes.dex */
public final class za3 implements hlo {
    public final tso a;
    public final /* synthetic */ byte b;

    public /* synthetic */ za3(tso tsoVar, byte b) {
        this.b = b;
        this.a = tsoVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.b;
        tso tsoVar = this.a;
        switch (b) {
            case 0:
                return new File(new File((File) tsoVar.get(), "drgd"), "pcam.jar.tmp");
            case 1:
                mm mmVar = (mm) tsoVar.get();
                j53 j53Var = j53.a;
                o43 o43Var = o43.a;
                n63[] n63VarArr = n63.b;
                return new w32(mmVar, j53Var, o43Var, i83.b.a);
            case 2:
                d90 d90Var = (d90) tsoVar.get();
                bwg.o(d90Var);
                return d90Var;
            case 3:
                return new yp1((rr1) tsoVar.get());
            default:
                return new yr0((nx5) tsoVar.get());
        }
    }
}
