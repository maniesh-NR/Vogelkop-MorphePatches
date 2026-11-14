package ads_mobile_sdk;

import defpackage.bwg;
import defpackage.hlo;
import defpackage.oip;
import defpackage.tso;
import defpackage.w7p;
import defpackage.wzo;

/* loaded from: classes.dex */
public final class rh implements hlo {
    public final tso a;
    public final /* synthetic */ byte b;

    public /* synthetic */ rh(tso tsoVar, byte b) {
        this.b = b;
        this.a = tsoVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.b;
        tso tsoVar = this.a;
        switch (b) {
            case 0:
                yh yhVar = (yh) tsoVar.get();
                bwg.o(yhVar);
                return yhVar;
            case 1:
                return new l61(tsoVar, false);
            case 2:
                return new qc3((p22) tsoVar.get());
            case 3:
                di1 di1Var = (di1) tsoVar.get();
                bwg.o(di1Var);
                return di1Var;
            case 4:
                fm fmVar = (fm) tsoVar.get();
                bwg.o(fmVar);
                return fmVar;
            case 5:
                return new qw((i41) tsoVar.get());
            case 6:
                return new bw2();
            case 7:
                return new ez1((vr) tsoVar.get(), (byte) 6);
            case 8:
                return new l61(tsoVar, false);
            case 9:
                return new ez1((m21) tsoVar.get(), (byte) 5);
            case 10:
                pf3 pf3Var = (pf3) tsoVar.get();
                bwg.o(pf3Var);
                return pf3Var;
            case 11:
                gh ghVar = (gh) tsoVar.get();
                bwg.o(ghVar);
                return ghVar;
            case 12:
                or2 or2Var = (or2) tsoVar.get();
                bwg.o(or2Var);
                return or2Var;
            case 13:
                return new rl0((qr0) tsoVar.get());
            case 14:
                zm zmVar = (zm) tsoVar.get();
                bwg.o(zmVar);
                return zmVar;
            case 15:
                return new ez1((es) tsoVar.get(), (byte) 6);
            case 16:
                return new l61(tsoVar, false);
            case 17:
                return new ez1((wzo) tsoVar.get(), (byte) 5);
            case 18:
                hr2 hr2Var = (hr2) tsoVar.get();
                bwg.o(hr2Var);
                return hr2Var;
            case 19:
                by2 by2Var = (by2) tsoVar.get();
                bwg.o(by2Var);
                return by2Var;
            case 20:
                bm bmVar = (bm) tsoVar.get();
                bwg.o(bmVar);
                return bmVar;
            case 21:
                return new ez1((u3) tsoVar.get(), (byte) 6);
            case 22:
                return new l61(tsoVar, false);
            case 23:
                return new ez1((cv2) tsoVar.get(), (byte) 5);
            case 24:
                wp3 wp3Var = (wp3) tsoVar.get();
                bwg.o(wp3Var);
                return wp3Var;
            case 25:
                by2 by2Var2 = (by2) tsoVar.get();
                bwg.o(by2Var2);
                return by2Var2;
            case 26:
                cd3 cd3Var = (cd3) tsoVar.get();
                bwg.o(cd3Var);
                return cd3Var;
            case 27:
                lr2 lr2Var = (lr2) tsoVar.get();
                bwg.o(lr2Var);
                return lr2Var;
            case 28:
                return new ez1((yv2) tsoVar.get(), (byte) 6);
            default:
                return new oip((w7p) tsoVar.get());
        }
    }
}
