package defpackage;

import J.N;
import android.content.SharedPreferences;
import com.leanplum.internal.Constants;
import com.opera.api.Callback;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final /* synthetic */ class zc9 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rma b;

    public /* synthetic */ zc9(rma rmaVar, byte b) {
        this.a = b;
        this.b = rmaVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        hu5 hu5Var;
        pwl pwlVarL;
        String string;
        pwl pwlVarL2;
        byte b = this.a;
        SecretKey secretKeyGenerateKey = null;
        rma rmaVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                String str = (String) obj;
                if (rmaVar.b == 2) {
                    rmaVar.b = 0;
                    rmaVar.i = null;
                    ((q65) rmaVar.g).S();
                    cd9 cd9Var = (cd9) rmaVar.f;
                    cd9Var.n = 1;
                    cd9Var.t = null;
                    cd9Var.y0();
                    ((q65) rmaVar.h).B0((umi) rmaVar.e, 120L, TimeUnit.SECONDS);
                    bf9 bf9Var = (bf9) rmaVar.d;
                    zc9 zc9Var = new zc9(rmaVar, b2);
                    int iR = bf9Var.r();
                    mgh mghVarC = bf9.A;
                    if (iR < 2) {
                        List<pwl> listK = bf9Var.h.k();
                        if (!listK.isEmpty() && (string = ((SharedPreferences) bf9Var.d.get()).getString("device_id", null)) != null) {
                            for (pwl pwlVar : listK) {
                                if (!pwlVar.a.equals(string) && !pwlVar.a.equals(str)) {
                                    if (bf9Var.p != null) {
                                        mghVarC = bf9Var.R(listK, false, zc9Var);
                                    } else {
                                        mghVarC = new mgh(bf9Var.R(listK, true, zc9Var), (Object) null, (byte) 8);
                                        bf9Var.p = mghVarC;
                                    }
                                }
                            }
                        }
                        ii iiVar = p36.a;
                        try {
                            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                            keyGenerator.init(Constants.Crypt.KEY_LENGTH);
                            secretKeyGenerateKey = keyGenerator.generateKey();
                        } catch (NoSuchAlgorithmException unused) {
                        }
                        bf9Var.M(secretKeyGenerateKey);
                        byte[] encoded = secretKeyGenerateKey.getEncoded();
                        hu5Var = new hu5((Object) zc9Var, (Object) str, (byte) 17);
                        if (bf9Var.r() >= 2 || bf9Var.n != null || (pwlVarL = bf9Var.l(str)) == null) {
                            hu5Var.run(Boolean.FALSE);
                        } else {
                            le9 le9Var = bf9Var.e;
                            ld9 ld9Var = new ld9(hu5Var, (byte) 1);
                            dg7 dg7Var = new dg7(hu5Var, (byte) 25);
                            le9Var.getClass();
                            mghVarC = le9.c(new uf(le9Var, encoded, pwlVarL, ld9Var, dg7Var, (byte) 4), dg7Var);
                        }
                    } else {
                        SecretKeySpec secretKeySpecX = bf9Var.x();
                        if (secretKeySpecX == null) {
                            zc9Var.run(null);
                        } else {
                            secretKeyGenerateKey = secretKeySpecX;
                            byte[] encoded2 = secretKeyGenerateKey.getEncoded();
                            hu5Var = new hu5((Object) zc9Var, (Object) str, (byte) 17);
                            if (bf9Var.r() >= 2) {
                                hu5Var.run(Boolean.FALSE);
                            } else {
                                hu5Var.run(Boolean.FALSE);
                            }
                        }
                    }
                    rmaVar.b = 3;
                    rmaVar.i = mghVarC;
                    break;
                }
                break;
            default:
                String str2 = (String) obj;
                bf9 bf9Var2 = (bf9) rmaVar.d;
                q65 q65Var = (q65) rmaVar.h;
                cd9 cd9Var2 = (cd9) rmaVar.f;
                if (rmaVar.b == 3) {
                    rmaVar.b = 0;
                    rmaVar.i = null;
                    if (str2 == null) {
                        q65Var.S();
                        cd9Var2.A0(2);
                        break;
                    } else {
                        cd9Var2.n = 1;
                        cd9Var2.t = null;
                        cd9Var2.y0();
                        fxl fxlVar = (bf9Var2.r() < 2 || (pwlVarL2 = bf9Var2.l(str2)) == null) ? null : new fxl(pwlVarL2, pwlVarL2.a.equals(((SharedPreferences) bf9Var2.d.get()).getString("device_id", null)));
                        if (fxlVar == null) {
                            bf9Var2.g(str2);
                            q65Var.S();
                            cd9Var2.A0(3);
                            break;
                        } else {
                            pwl pwlVar2 = fxlVar.a;
                            String strSubstring = String.valueOf(N.Mmz54ji0(p36.e(pwlVar2.f))).substring(0, 6);
                            rmaVar.b = 4;
                            rmaVar.i = null;
                            cd9Var2.z0(new qn(cd9Var2, strSubstring, pwlVar2.c, new hu5((Object) rmaVar, (Object) str2, (byte) 12), (byte) 10));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
