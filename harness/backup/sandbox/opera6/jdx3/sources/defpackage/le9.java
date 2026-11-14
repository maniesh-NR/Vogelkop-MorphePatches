package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class le9 extends s43 implements mo7 {
    public static final /* synthetic */ int g = 0;
    public final oji d;
    public Uri e;
    public final e3j f;

    public le9(Context context, umi umiVar, oji ojiVar) {
        super(umiVar);
        this.d = ojiVar;
        String[] strArr = OperaApplication.K;
        this.f = e3j.t((OperaApplication) context.getApplicationContext());
        this.e = new Uri.Builder().scheme("https").appendEncodedPath("v1").authority("flow.opera.com").build();
        e3j e3jVar = this.f;
        if (e3jVar != null) {
            e3jVar.F(this);
        }
    }

    public static zd2 c(swl swlVar, Callback callback) {
        zd2 zd2Var = new zd2(swlVar, callback);
        he2.a(zd2Var, new Void[0]);
        return zd2Var;
    }

    public static String d(String str, String str2, PublicKey publicKey, String str3) {
        String strEncodeToString;
        StringBuilder sb = new StringBuilder();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest((str2 + Base64.encodeToString(publicKey.getEncoded(), 2) + str + str3).getBytes()), 2);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "";
        }
        return p3p.n(sb, strEncodeToString, "$", str3);
    }

    public static owl e(orb orbVar, ArrayList arrayList) {
        arrayList.clear();
        owl owlVar = null;
        String strM = orbVar.m("connecting_device", null);
        vpb vpbVarB = orbVar.b("devices");
        for (int i = 0; i < vpbVarB.a.length(); i++) {
            orb orbVarC = vpbVarB.c(i);
            if (strM == null || !strM.equals(orbVarC.e("id"))) {
                arrayList.add(new pwl(orbVarC, (byte) 0));
            } else {
                owlVar = new owl(orbVarC);
                arrayList.add(owlVar);
            }
        }
        return owlVar;
    }

    @Override // defpackage.s43
    public final Uri b() {
        return this.e;
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        c3j c3jVarD = ((d3j) this.f.i()).d(26, false);
        this.e = new Uri.Builder().scheme("https").appendEncodedPath("v1").authority(c3jVarD == null ? "flow.opera.com" : (String) c3jVarD.d).build();
    }
}
