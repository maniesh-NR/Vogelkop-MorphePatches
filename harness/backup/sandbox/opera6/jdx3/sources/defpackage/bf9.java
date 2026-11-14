package defpackage;

import J.N;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.common.GoogleApiAvailability;
import com.leanplum.internal.Constants;
import com.opera.android.browser.chromium.CookieManager;
import com.opera.android.oauth2.OAuth2Account;
import com.opera.android.settings.SettingsManager;
import com.opera.android.utilities.DisplayUtil;
import com.opera.api.Callback;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.chromium.url.GURL;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bf9 implements w6f {
    public static final bxl A = new bxl((byte) 0);
    public final oji a;
    public final Context b;
    public final umi c;
    public final j4c d;
    public final le9 e;
    public final g16 f;
    public final ArrayList g;
    public final xl h;
    public final h7f i;
    public final ArrayList j;
    public final HashSet k;
    public zd2 l;
    public zd2 m;
    public zd2 n;
    public ih4 o;
    public mgh p;
    public h5k q;
    public zd2 r;
    public String s;
    public String t;
    public final ArrayList u;
    public boolean v;
    public final HashMap w;
    public final ArrayList x;
    public mgh y;
    public CookieManager z;

    public bf9(Context context, umi umiVar, db dbVar, zwk zwkVar, SettingsManager settingsManager, j4c j4cVar, t1 t1Var) {
        ge5 ge5Var = new ge5(context, umiVar, (byte) 24);
        g16 g16Var = new g16(t1Var);
        oji ojiVar = new oji(this);
        this.a = ojiVar;
        this.g = new ArrayList();
        this.i = new h7f();
        this.j = new ArrayList();
        this.k = new HashSet();
        this.b = context.getApplicationContext();
        this.c = umiVar;
        this.d = j4cVar;
        this.f = g16Var;
        this.e = new le9((Context) ge5Var.b, (umi) ge5Var.c, ojiVar);
        xl xlVar = new xl(context, umiVar);
        this.h = xlVar;
        xlVar.h();
        this.u = new ArrayList();
        this.w = new HashMap();
        this.x = new ArrayList();
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
            fs2 fs2Var = new fs2(this, dbVar, zwkVar, settingsManager, umiVar, j4cVar, t1Var);
            avj avjVar = cak.d;
            avj.g(1, fs2Var);
            a(new pc9(context, umiVar, this, settingsManager));
        }
    }

    public static char Q(int i) {
        int i2 = i % 62;
        return (char) (i2 < 26 ? i2 + 97 : i2 < 52 ? i2 + 39 : i2 - 4);
    }

    public static byte[] e(rwl rwlVar, pwl pwlVar, PrivateKey privateKey) {
        String str = rwlVar.b;
        String str2 = rwlVar.c;
        PublicKey publicKey = pwlVar.f;
        byte[] bytes = str.getBytes();
        byte[] bArrDecode = Base64.decode(str2, 0);
        if (p36.f(bytes, bArrDecode, publicKey, "SHA512withRSA/PSS") ? true : p36.f(bytes, bArrDecode, publicKey, "SHA512withRSA")) {
            return p36.b(2, Base64.decode(str, 0), privateKey);
        }
        return null;
    }

    public final void A(String str) {
        if (str.equals(this.a.u())) {
            h();
            return;
        }
        List listK = this.h.k();
        for (int i = 0; i < listK.size(); i++) {
            if (str.equals(((pwl) listK.get(i)).a)) {
                ArrayList arrayList = new ArrayList(listK);
                arrayList.remove(i);
                J(arrayList);
                return;
            }
        }
    }

    public final void B() {
        mgh mghVar;
        h5k h5kVar = this.q;
        Object obj = null;
        le9 le9Var = this.e;
        if (h5kVar != null && (mghVar = this.p) != null) {
            axl axlVar = new axl(this, (byte) 3);
            axl axlVar2 = new axl(this, (byte) 4);
            le9Var.getClass();
            mghVar.b = le9.c(new ws1(le9Var, obj, axlVar, axlVar2, (byte) 18), axlVar2);
            return;
        }
        byte b = 2;
        if (r() >= 2) {
            zd2 zd2Var = this.r;
            if (zd2Var != null) {
                zd2Var.cancel();
            }
            axl axlVar3 = new axl(this, (byte) 1);
            axl axlVar4 = new axl(this, b);
            le9Var.getClass();
            this.r = le9.c(new ws1(le9Var, obj, axlVar3, axlVar4, (byte) 18), axlVar4);
        }
    }

    public final void C() {
        String str;
        if (r() >= 1 || this.l != null || (str = this.s) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("OFA/");
        Context context = this.b;
        sb.append(r9n.t(context).versionName);
        String string = sb.toString();
        int i = u1b.c;
        x1b x1bVar = new x1b("sync");
        String str2 = Build.MODEL;
        String str3 = DisplayUtil.e(context) ? "tablet" : "mobile";
        String strConcat = "ofa:".concat(str);
        xx1 xx1Var = new xx1((Object) this, (Object) str, (Object) string, (Object) x1bVar, (byte) 13);
        axl axlVar = new axl(this, (byte) 6);
        le9 le9Var = this.e;
        le9Var.getClass();
        this.l = le9.c(new xe9(le9Var, string, str3, strConcat, x1bVar, xx1Var, axlVar), axlVar);
    }

    @Override // defpackage.w6f
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final void H(hxl hxlVar) {
        this.i.c(hxlVar);
    }

    public final ih4 E(w59 w59Var, Callback callback) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        pc9 pc9VarQ = q();
        int iR = r();
        bxl bxlVar = A;
        if (iR >= 2) {
            lyf lyfVarJ = j(w59Var.a);
            if (lyfVarJ != null) {
                lyf lyfVarJ2 = j(w59Var.b);
                if (lyfVarJ2 != null) {
                    final String str = (String) lyfVarJ.a;
                    final String str2 = (String) lyfVarJ2.a;
                    final String str3 = w59Var.c;
                    final String str4 = (String) lyfVarJ.b;
                    final String str5 = (String) lyfVarJ2.b;
                    final qe9 qe9Var = new qe9(this, pc9VarQ, lyfVarJ, lyfVarJ2, w59Var, callback, (byte) 0);
                    final j12 j12Var = new j12(callback, (byte) 4);
                    final le9 le9Var = this.e;
                    le9Var.getClass();
                    return le9.c(new swl() { // from class: be9
                        @Override // defpackage.swl
                        public final qwl run() {
                            final le9 le9Var2 = le9Var;
                            final String strR = le9Var2.d.r();
                            if (strR == null) {
                                return null;
                            }
                            final String str6 = str;
                            final String str7 = str2;
                            final String str8 = str3;
                            final String str9 = str4;
                            final String str10 = str5;
                            final qe9 qe9Var2 = qe9Var;
                            final j12 j12Var2 = j12Var;
                            return new qwl() { // from class: ce9
                                @Override // defpackage.qwl
                                public final ih4 run() throws JSONException {
                                    le9 le9Var3 = le9Var2;
                                    le9Var3.getClass();
                                    orb orbVar = new orb();
                                    orbVar.p(str6, "metadata");
                                    orbVar.p(str7, "content");
                                    String str11 = str8;
                                    if (str11 != null) {
                                        orbVar.p(str11, "content_url");
                                    }
                                    String str12 = str9;
                                    String str13 = str10;
                                    if (str12.equals(str13)) {
                                        orbVar.p(str12, "iv");
                                    }
                                    orbVar.p(str12, "iv_metadata");
                                    orbVar.p(str13, "iv_content");
                                    return new xf1(le9Var3, j12Var2, strR, orbVar, qe9Var2);
                                }
                            };
                        }
                    }, j12Var);
                }
                if (callback != null) {
                    callback.run(null);
                }
            } else if (callback != null) {
                callback.run(null);
                return bxlVar;
            }
        } else if (callback != null) {
            callback.run(null);
            return bxlVar;
        }
        return bxlVar;
    }

    public final void G(String str, Callback callback) throws JSONException, BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (q() == null) {
            callback.run(Boolean.FALSE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(Constants.Params.TYPE, orb.t("text"));
            try {
                jSONObject2.put("text", orb.t(str));
                E(new w59(jSONObject.toString(), jSONObject2.toString(), (String) null, (String) null), new j12(callback, (byte) 3));
            } catch (JSONException e) {
                t3p.n(e);
            }
        } catch (JSONException e2) {
            t3p.n(e2);
        }
    }

    public final mgh I(vz vzVar, zzh zzhVar, boolean z) {
        cxl cxlVar = new cxl(this, zzhVar, (byte) 0);
        ve9 ve9Var = new ve9(this, z, vzVar, zzhVar, (byte) 4);
        le9 le9Var = this.e;
        le9Var.getClass();
        return new mgh(le9.c(new ws1(le9Var, vzVar, cxlVar, ve9Var, (byte) 17), ve9Var), zzhVar, (byte) 8);
    }

    public final pwl J(List list) {
        pc9 pc9VarQ;
        if (list.isEmpty() && (pc9VarQ = q()) != null) {
            pc9VarQ.d();
        }
        ArrayList arrayList = this.u;
        if (arrayList.isEmpty()) {
            return K(list);
        }
        List listK = this.h.k();
        HashSet hashSet = new HashSet(listK.size());
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            hashSet.add(((pwl) it.next()).a);
        }
        pwl pwlVarK = K(list);
        String strU = this.a.u();
        Iterator it2 = list.iterator();
        ArrayList arrayList2 = null;
        while (it2.hasNext()) {
            String str = ((pwl) it2.next()).a;
            if (!hashSet.contains(str) && !str.equals(strU)) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(arrayList);
                    arrayList.clear();
                }
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    ((Callback) obj).run(str);
                }
            }
        }
        return pwlVarK;
    }

    public final pwl K(List list) {
        pwl pwlVar = null;
        this.t = null;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            pwl pwlVar2 = (pwl) it.next();
            pwlVar2.getClass();
            if (pwlVar2 instanceof owl) {
                this.t = pwlVar2.a;
                pwlVar = pwlVar2;
                break;
            }
        }
        xl xlVar = this.h;
        xlVar.getClass();
        ArrayList arrayList = new ArrayList(list);
        xlVar.m = arrayList;
        xlVar.g(arrayList);
        h7f h7fVar = this.i;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((hxl) g7fVarH.next()).z();
        }
        return pwlVar;
    }

    public final void M(SecretKey secretKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte b = 2;
        ((SharedPreferences) this.d.get()).edit().putString("shared", Base64.encodeToString(((c36) this.f.a.get()).d(secretKey.getEncoded()), 2)).apply();
        z();
        pc9 pc9VarQ = q();
        if (pc9VarQ != null) {
            qie qieVar = pc9VarQ.g;
            umi umiVar = pc9VarQ.b;
            nml nmlVarB = umiVar.b(new ec9(pc9VarQ, b));
            nmlVarB.b(umiVar.f(new dc9(pc9VarQ, (byte) 5)));
            qieVar.n(new oml(nmlVarB), null);
        }
    }

    public final void N() {
        byte b = 1;
        if (r() < 1 || this.n != null) {
            return;
        }
        zd2 zd2Var = this.m;
        if (zd2Var != null) {
            zd2Var.cancel();
            this.m = null;
        }
        mgh mghVar = this.p;
        if (mghVar != null) {
            mghVar.cancel();
            this.p = null;
        }
        ih4 ih4Var = this.o;
        if (ih4Var != null) {
            ih4Var.cancel();
            this.o = null;
        }
        zd2 zd2Var2 = this.r;
        if (zd2Var2 != null) {
            zd2Var2.cancel();
            this.r = null;
        }
        we9 we9Var = new we9(this, b);
        axl axlVar = new axl(this, (byte) 5);
        le9 le9Var = this.e;
        le9Var.getClass();
        this.n = le9.c(new vdi(le9Var, we9Var, axlVar, (byte) 9), axlVar);
    }

    public final void O(boolean z) {
        if (r() < 1 || this.n != null) {
            return;
        }
        ih4 ih4Var = this.o;
        if (ih4Var != null) {
            ih4Var.cancel();
            this.o = null;
        }
        w8d w8dVar = new w8d((byte) 3, this, z);
        axl axlVar = new axl(this, (byte) 0);
        le9 le9Var = this.e;
        le9Var.getClass();
        this.o = le9.c(new vdi(le9Var, w8dVar, axlVar, (byte) 10), axlVar);
    }

    public final void P(String str, String str2) {
        myk mykVarS = s();
        if (mykVarS != null) {
            mykVarS.c.getClass();
            avj avjVar = cak.d;
            if (avj.b(1)) {
                N.M3WWUsfl(str2);
            }
            mykVarS.a();
            OAuth2Account oAuth2Account = mykVarS.b.c;
            if (oAuth2Account != null && oAuth2Account.b() && ((SharedPreferences) oAuth2Account.a.a.get()).getString("pun_1", null) == null) {
                oAuth2Account.d(str);
                oAuth2Account.e(false);
                oAuth2Account.c(true);
                h7f h7fVar = ((db) oAuth2Account.b.c).e;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((cb) g7fVarH.next()).f();
                }
            }
        }
    }

    public final crk R(List list, boolean z, Callback callback) {
        we9 we9Var = new we9(this, (byte) 5);
        h5k h5kVar = new h5k();
        h5kVar.b = list;
        h5kVar.c = new q65(we9Var, (byte) 4);
        h5kVar.d = callback;
        h5kVar.a = z;
        this.q = h5kVar;
        ((q65) h5kVar.c).B0(this.c, 15L, TimeUnit.SECONDS);
        return new crk(this, (byte) 19);
    }

    public final void a(vwl vwlVar) {
        boolean zIsEmpty;
        synchronized (this.j) {
            zIsEmpty = this.j.isEmpty();
            this.j.add(vwlVar);
        }
        if (zIsEmpty) {
            vml.e(new we9(this, (byte) 3));
        }
    }

    @Override // defpackage.w6f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void F(hxl hxlVar) {
        if (this.i.b(hxlVar) && t()) {
            hxlVar.i();
        }
    }

    public final mgh c(String str, az4 az4Var, boolean z) {
        su suVar = new su((Object) this, (Object) az4Var, (Object) str, (byte) 25);
        ve9 ve9Var = new ve9(this, z, str, az4Var, (byte) 0);
        le9 le9Var = this.e;
        le9Var.getClass();
        return new mgh(le9.c(new ws1(le9Var, str, suVar, ve9Var, (byte) 7), ve9Var), az4Var, (byte) 8);
    }

    public final void f(Callback callback) {
        if (r() < 2) {
            callback.run(Boolean.FALSE);
            return;
        }
        cn7 cn7Var = new cn7(this, callback, (byte) 29);
        j12 j12Var = new j12(callback, (byte) 7);
        le9 le9Var = this.e;
        le9Var.getClass();
        le9.c(new a32((Object) le9Var, (Object) cn7Var, (Object) j12Var, (byte) 12), j12Var);
    }

    public final void g(String str) {
        if (r() < 2) {
            return;
        }
        rl rlVar = new rl((byte) 4);
        vk2 vk2Var = new vk2((byte) 14);
        le9 le9Var = this.e;
        le9Var.getClass();
        le9.c(new ws1(le9Var, str, rlVar, vk2Var, (byte) 16), vk2Var);
    }

    public final void h() {
        if (r() >= 2) {
            N();
        }
    }

    public final void i(String str) {
        if (str.equals(this.a.u())) {
            h();
            return;
        }
        if (r() < 2) {
            return;
        }
        npl nplVar = new npl(this, str, (byte) 5);
        vk2 vk2Var = new vk2((byte) 13);
        le9 le9Var = this.e;
        le9Var.getClass();
        le9.c(new ws1(le9Var, str, nplVar, vk2Var, (byte) 16), vk2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lyf j(java.lang.String r5) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            r4 = this;
            byte[] r5 = r5.getBytes()
            javax.crypto.spec.SecretKeySpec r4 = r4.x()
            r0 = 0
            if (r4 == 0) goto L2f
            ii r1 = defpackage.p36.a
            r1 = 12
            byte[] r1 = new byte[r1]
            java.security.SecureRandom r2 = new java.security.SecureRandom
            r2.<init>()
            r2.nextBytes(r1)
            r2 = 0
            r3 = 1
            javax.crypto.Cipher r4 = defpackage.p36.a(r3, r4, r1, r2)
            if (r4 == 0) goto L26
            byte[] r4 = r4.doFinal(r5)     // Catch: java.lang.Throwable -> L26
            goto L27
        L26:
            r4 = r0
        L27:
            if (r4 == 0) goto L2f
            lyf r5 = new lyf
            r5.<init>(r4, r1)
            goto L30
        L2f:
            r5 = r0
        L30:
            if (r5 == 0) goto L49
            lyf r4 = new lyf
            java.lang.Object r0 = r5.a
            byte[] r0 = (byte[]) r0
            r1 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            java.lang.Object r5 = r5.b
            byte[] r5 = (byte[]) r5
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r1)
            r4.<init>(r0, r5)
            return r4
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bf9.j(java.lang.String):lyf");
    }

    public final void k() {
        this.t = null;
        ((SharedPreferences) this.d.get()).edit().remove("priv").remove("pub").remove("device_id").remove("device_auth_token").remove("device_notification_token").remove("device_version_token").remove("device_capabilities").remove("shared").apply();
        vml.c(new we9(this, (byte) 2));
    }

    public final pwl l(String str) {
        List<pwl> listK;
        if (r() >= 2) {
            listK = this.h.k();
        } else {
            h5k h5kVar = this.q;
            if (h5kVar == null) {
                return null;
            }
            listK = (List) h5kVar.b;
        }
        for (pwl pwlVar : listK) {
            if (pwlVar.a.equals(str)) {
                return pwlVar;
            }
        }
        return null;
    }

    public final KeyPair m() {
        KeyPair keyPairGenerateKeyPair;
        ii iiVar = p36.a;
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException unused) {
            keyPairGenerateKeyPair = null;
        }
        if (keyPairGenerateKeyPair != null) {
            byte[] bArrD = ((c36) this.f.a.get()).d(keyPairGenerateKeyPair.getPrivate().getEncoded());
            if (bArrD != null) {
                ((SharedPreferences) this.d.get()).edit().putString("priv", Base64.encodeToString(bArrD, 2)).putString("pub", Base64.encodeToString(keyPairGenerateKeyPair.getPublic().getEncoded(), 2)).apply();
                return keyPairGenerateKeyPair;
            }
        }
        return null;
    }

    public final vwl n(Class cls) {
        synchronized (this.j) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                vwl vwlVar = (vwl) obj;
                if (cls.isAssignableFrom(vwlVar.getClass())) {
                    return vwlVar;
                }
            }
            return null;
        }
    }

    public final ih4 o(zzh zzhVar) {
        myk mykVarS = s();
        if (r() < 2 || mykVarS == null) {
            if (zzhVar != null) {
                zzhVar.run(Boolean.FALSE);
            }
            return A;
        }
        hu5 hu5Var = new hu5((Object) mykVarS, (Object) zzhVar, (byte) 14);
        hu5 hu5Var2 = new hu5((Object) this, (Object) zzhVar, (byte) 15);
        le9 le9Var = this.e;
        le9Var.getClass();
        return le9.c(new a32((Object) le9Var, (Object) hu5Var, (Object) hu5Var2, (byte) 13), hu5Var2);
    }

    public final ih4 p(Long l, Callback callback) {
        pc9 pc9VarQ = q();
        if (r() < 2 || pc9VarQ == null) {
            callback.run(Boolean.FALSE);
            return A;
        }
        hu5 hu5Var = new hu5((Object) pc9VarQ, (Object) callback, (byte) 16);
        j12 j12Var = new j12(callback, (byte) 6);
        le9 le9Var = this.e;
        le9Var.getClass();
        return le9.c(new ws1(le9Var, l, hu5Var, j12Var, (byte) 8), j12Var);
    }

    public final pc9 q() {
        return (pc9) n(pc9.class);
    }

    public final int r() {
        j4c j4cVar = this.d;
        if (((SharedPreferences) j4cVar.get()).getString("device_id", null) == null) {
            return 0;
        }
        return ((SharedPreferences) j4cVar.get()).getString("shared", null) == null ? 1 : 2;
    }

    public final myk s() {
        return (myk) n(myk.class);
    }

    public final boolean t() {
        boolean z;
        synchronized (this.j) {
            z = !this.j.isEmpty();
        }
        return z;
    }

    public final List u() {
        if (r() < 2) {
            return Collections.EMPTY_LIST;
        }
        List<pwl> listK = this.h.k();
        ArrayList arrayList = new ArrayList(listK.size());
        String string = ((SharedPreferences) this.d.get()).getString("device_id", null);
        for (pwl pwlVar : listK) {
            arrayList.add(new fxl(pwlVar, pwlVar.a.equals(string)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final boolean v(List list) {
        String string;
        if (list.isEmpty() || (string = ((SharedPreferences) this.d.get()).getString("device_id", null)) == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((pwl) it.next()).a.equals(string)) {
                return true;
            }
        }
        return false;
    }

    public final SecretKeySpec x() {
        String string = ((SharedPreferences) this.d.get()).getString("shared", null);
        if (string != null) {
            byte[] bArrB = ((c36) this.f.a.get()).b(Base64.decode(string, 0));
            if (bArrB != null) {
                ii iiVar = p36.a;
                return new SecretKeySpec(bArrB, 0, bArrB.length, "AES");
            }
        }
        return null;
    }

    public final ih4 y(Callback callback, boolean z) {
        myk mykVarS = s();
        if (mykVarS == null) {
            callback.run(af9.c);
            return A;
        }
        byte b = 8;
        if (z) {
            return new jyk(mykVarS, new j12(callback, b));
        }
        mgh mghVar = new mgh((Object) null, callback, (byte) 8);
        if (this.z == null) {
            this.z = new CookieManager();
        }
        N.M8VJflmI(new GURL(dgh.h().toString()), false, false, false, new ArrayList(), new su((Object) mghVar, (Object) mykVarS, (Object) callback, (byte) 26));
        return mghVar;
    }

    public final void z() {
        int iR = r();
        h7f h7fVar = this.i;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((hxl) g7fVarH.next()).x(iR);
        }
    }
}
