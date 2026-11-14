package defpackage;

import ads_mobile_sdk.fl0;
import ads_mobile_sdk.fm0;
import ads_mobile_sdk.jl2;
import ads_mobile_sdk.qg;
import ads_mobile_sdk.th3;
import ads_mobile_sdk.u83;
import ads_mobile_sdk.wl3;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class qw8 implements xq9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qw8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.xq9
    public final Object apply(Object obj) throws IOException {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((i82) obj2).d((oqe) obj);
            case 1:
                nbd nbdVar = (nbd) obj2;
                Map.Entry entry = (Map.Entry) obj;
                nbdVar.getClass();
                entry.getClass();
                return new mbd(entry, nbdVar);
            case 2:
                return ((vw) obj2).d((msh) obj);
            case 3:
                return (ym0) ((zbe) obj2).invoke(obj);
            case 4:
                qwf qwfVar = (qwf) obj;
                return Integer.toString(((ArrayList) obj2).contains(qwfVar) ? -qwfVar.b : qwfVar.b);
            case 5:
                return new y3m(((z3m) obj2).j, (szb) obj);
            case 6:
                qg qgVar = (qg) obj2;
                String strC = (String) obj;
                if (p37.y0(strC)) {
                    File file = new File(qgVar.a.getPackageResourcePath());
                    if (!file.exists() || !file.canRead()) {
                        return "";
                    }
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            byte[] bArr = new byte[16384];
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                            for (int i = fileInputStream.read(bArr); i != -1; i = fileInputStream.read(bArr)) {
                                messageDigest.update(bArr, 0, i);
                            }
                            strC = n63.c.g().c(messageDigest.digest());
                            fileInputStream.close();
                        } finally {
                        }
                    } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
                        return "";
                    }
                }
                return strC;
            case 7:
                return (edp) obj2;
            case 8:
                edp edpVar = (edp) obj;
                ((u83) obj2).f.set(edpVar);
                return edpVar;
            case 9:
                return Boolean.valueOf(((dkp) obj2).a((jl2) obj));
            default:
                fm0 fm0Var = (fm0) obj;
                th3 th3Var = ((wl3) obj2).d;
                switch (vep.A(fm0Var.q$1())) {
                    case 0:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        fl0 fl0Var = fl0.EVENT_ID_UNSPECIFIED;
                        th3Var.a.a(1004, -1L, null, ((int) rfp.a(fm0Var.q$1())) + "");
                        throw new kip(a4h.a("r: ", rfp.a(fm0Var.q$1())));
                    case 1:
                    case 2:
                        return fm0Var;
                    case 3:
                        fl0 fl0Var2 = fl0.EVENT_ID_UNSPECIFIED;
                        th3Var.a.a(1003, -1L, null, ((int) rfp.a(fm0Var.q$1())) + "");
                        throw new mjp(a4h.a("r: ", rfp.a(fm0Var.q$1())));
                    case 12:
                        fl0 fl0Var3 = fl0.EVENT_ID_UNSPECIFIED;
                        th3Var.a.a(1004, -1L, null, ((int) rfp.a(fm0Var.q$1())) + "");
                        throw new tgp(a4h.a("r: ", rfp.a(fm0Var.q$1())));
                    default:
                        throw new IncompatibleClassChangeError();
                }
        }
    }
}
