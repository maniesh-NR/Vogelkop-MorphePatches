package defpackage;

import android.util.Base64;
import com.leanplum.internal.Constants;
import com.opera.api.Callback;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class hi2 implements ih4 {
    public final myk a;
    public final gi2 b;
    public final String c;
    public ii2 d;
    public long e = -1;
    public boolean f = true;

    public hi2(myk mykVar, gi2 gi2Var, String str, ii2 ii2Var) {
        this.a = mykVar;
        this.b = gi2Var;
        this.c = str;
        this.d = ii2Var;
        if (mykVar.j == null) {
            mykVar.j = new r72(mykVar);
        }
    }

    public static orb e(i1 i1Var) throws JSONException {
        int i;
        orb orbVar = null;
        if (i1Var == null) {
            return null;
        }
        int i2 = i1Var.b;
        String str = (String) i1Var.d;
        orb orbVar2 = new orb();
        orbVar2.p(vep.i(i2), "session_state");
        orbVar2.p(str, "user_id");
        HashSet hashSet = (HashSet) i1Var.e;
        if (hashSet != null && (i = i1Var.c) != 0) {
            orbVar = new orb();
            vpb vpbVar = new vpb();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                vpbVar.a((String) it.next());
            }
            orbVar.p(vpbVar, "enabled_types");
            orbVar.p(vep.j(i), "passphrase_type");
        }
        orb orbVar3 = new orb();
        orbVar3.p(orbVar2, "oauth2_session_state");
        orbVar3.p(orbVar, "sync_state");
        return orbVar3;
    }

    public static orb f(String str, orb orbVar, String str2, Boolean bool, HashSet hashSet) throws JSONException {
        orb orbVar2 = new orb();
        orbVar2.p(str, "auth_token");
        orbVar2.p(orbVar, "credential");
        orbVar2.p(str2, "display_name_hint");
        orbVar2.p(bool, "is_anonymous");
        vpb vpbVar = new vpb();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            vpbVar.a((String) it.next());
        }
        orbVar2.p(vpbVar, "start_types");
        return orbVar2;
    }

    public static ei2 h(orb orbVar) {
        boolean zIsNull = orbVar.a.isNull("is_anonymous");
        JSONObject jSONObject = orbVar.a;
        if (!zIsNull) {
            return jSONObject.getBoolean("is_anonymous") ? new ei2((byte) 0, null, false) : jSONObject.isNull("display_name_hint") ? new ei2((byte) 0, "Unknown", true) : new ei2((byte) 0, orbVar.e("display_name_hint"), false);
        }
        String strE = jSONObject.isNull("display_name_hint") ? null : orbVar.e("display_name_hint");
        return new ei2((byte) 0, strE != null ? strE : "Unknown", true);
    }

    public static bpd i(orb orbVar) {
        if (orbVar == null) {
            return null;
        }
        return orbVar.a.isNull("auth_password") ? new bpd(Base64.decode(orbVar.e("bootstrap_token"), 0)) : new bpd(orbVar.e("auth_password"));
    }

    public void a() {
        r72 r72Var;
        if (this.f) {
            this.f = false;
            myk mykVar = this.a;
            HashMap map = mykVar.h;
            if (!map.isEmpty() || (r72Var = mykVar.j) == null) {
                return;
            }
            ((q65) r72Var.b).S();
            ih4 ih4Var = (ih4) r72Var.c;
            if (ih4Var != null) {
                ih4Var.cancel();
                r72Var.c = null;
            }
            mykVar.j = null;
        }
    }

    public void b() {
        c(2);
    }

    public final void c(int i) {
        a();
        ii2 ii2Var = this.d;
        if (ii2Var == null) {
            return;
        }
        this.d = null;
        ii2Var.f(i);
    }

    @Override // defpackage.ih4
    public final void cancel() {
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i1 d() {
        /*
            r7 = this;
            myk r7 = r7.a
            db r0 = r7.b
            zwk r7 = r7.c
            r7.getClass()
            boolean r1 = defpackage.zwk.f()
            r2 = 0
            if (r1 == 0) goto L1c
            com.opera.android.oauth2.OAuth2Account r1 = r0.c
            if (r1 == 0) goto L1c
            long r3 = r1.g
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L1e
        L1c:
            r1 = r2
            goto L24
        L1e:
            java.lang.Object r1 = J.N.MIPULsoq(r3)
            java.lang.String r1 = (java.lang.String) r1
        L24:
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L35
            boolean r7 = r0.f()
            if (r7 == 0) goto L2f
            return r2
        L2f:
            i1 r7 = new i1
            r7.<init>(r4, r2, r2, r3)
            return r7
        L35:
            r7.getClass()
            avj r0 = cak.d
            boolean r0 = avj.b(r4)
            if (r0 != 0) goto L43
            java.lang.String[] r0 = new java.lang.String[r3]
            goto L49
        L43:
            java.lang.Object r0 = J.N.M1i2Gkbz()
            java.lang.String[] r0 = (java.lang.String[]) r0
        L49:
            int r2 = r0.length
            java.util.HashSet r3 = new java.util.HashSet
            int r2 = na2.j(r2)
            r3.<init>(r2)
            java.util.Collections.addAll(r3, r0)
            r7.getClass()
            boolean r7 = defpackage.zwk.h()
            r0 = 2
            if (r7 == 0) goto L61
            r4 = r0
        L61:
            i1 r7 = new i1
            r7.<init>(r0, r1, r3, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hi2.d():i1");
    }

    public abstract void g(long j, String str, orb orbVar);

    public final ih4 j(String str, orb orbVar, Callback callback) throws JSONException, BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.Params.NAME, orb.t(str));
            try {
                jSONObject.put(Constants.Params.DATA, orb.t(orbVar));
                String string = jSONObject.toString();
                myk mykVar = this.a;
                bf9 bf9Var = mykVar.a;
                eof eofVar = new eof((Object) mykVar, (Object) callback, (byte) 29);
                int iR = bf9Var.r();
                bxl bxlVar = bf9.A;
                if (iR < 2) {
                    eofVar.run(null);
                    return bxlVar;
                }
                lyf lyfVarJ = bf9Var.j(string);
                if (lyfVarJ == null) {
                    eofVar.run(null);
                    return bxlVar;
                }
                le9 le9Var = bf9Var.e;
                String str2 = (String) lyfVarJ.a;
                String str3 = (String) lyfVarJ.b;
                se9 se9Var = new se9(eofVar, (byte) 0);
                se9 se9Var2 = new se9(eofVar, (byte) 1);
                le9Var.getClass();
                return le9.c(new vw1(le9Var, str2, str3, this.c, se9Var, se9Var2, (byte) 2), se9Var2);
            } catch (JSONException e) {
                t3p.n(e);
                return null;
            }
        } catch (JSONException e2) {
            t3p.n(e2);
            return null;
        }
    }

    public final ih4 k(long j, orb orbVar, Callback callback) throws JSONException {
        orb orbVar2 = new orb();
        orbVar2.p(orbVar, "error_detail");
        orbVar2.p(String.valueOf(j), "in_response_to");
        return j("SignInToSyncResponseMessage", orbVar2, callback);
    }
}
