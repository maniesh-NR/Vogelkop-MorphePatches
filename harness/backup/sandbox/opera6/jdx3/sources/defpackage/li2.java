package defpackage;

import J.N;
import android.util.Base64;
import com.opera.api.Callback;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class li2 extends hi2 {
    public final i1 g;
    public byte h;
    public ih4 i;
    public long j;
    public boolean k;

    public li2(myk mykVar, gi2 gi2Var, String str, bm8 bm8Var) throws JSONException {
        super(mykVar, gi2Var, str, bm8Var);
        this.j = -1L;
        i1 i1VarD = d();
        this.g = i1VarD;
        if (i1VarD == null) {
            m(2, "Unable to get device state");
            return;
        }
        this.h = (byte) 1;
        ji2 ji2Var = new ji2(this, (byte) 5);
        orb orbVar = new orb();
        orbVar.p(hi2.e(i1VarD), "device_state");
        this.i = j("ReadyForPairingRequestMessage", orbVar, ji2Var);
    }

    public static i1 q(orb orbVar) throws JSONException {
        int i;
        orb orbVarC = orbVar.c("oauth2_session_state");
        String strE = orbVarC.e("session_state");
        int[] iArrB = vep.B(2);
        int length = iArrB.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i = 0;
                break;
            }
            i = iArrB[i3];
            if (vep.i(i).equals(strE)) {
                break;
            }
            i3++;
        }
        if (i == 0) {
            throw new JSONException("Unknown value for session_state: ".concat(orbVarC.e("session_state")));
        }
        HashSet hashSet = null;
        String strE2 = orbVarC.a.isNull("user_id") ? null : orbVarC.e("user_id");
        if (!orbVar.a.isNull("sync_state")) {
            orb orbVarC2 = orbVar.c("sync_state");
            hashSet = new HashSet();
            vpb vpbVarB = orbVarC2.b("enabled_types");
            for (int i4 = 0; i4 < vpbVarB.a.length(); i4++) {
                hashSet.add(vpbVarB.d(i4));
            }
            String strE3 = orbVarC2.e("passphrase_type");
            int[] iArrB2 = vep.B(2);
            int length2 = iArrB2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length2) {
                    break;
                }
                int i6 = iArrB2[i5];
                if (vep.j(i6).equals(strE3)) {
                    i2 = i6;
                    break;
                }
                i5++;
            }
            if (i2 == 0) {
                throw new JSONException("Unknown value for passphrase_type: ".concat(orbVarC2.e("passphrase_type")));
            }
        }
        return new i1(i, strE2, hashSet, i2);
    }

    @Override // defpackage.hi2
    public final void a() {
        super.a();
        ih4 ih4Var = this.i;
        if (ih4Var != null) {
            ih4Var.cancel();
            this.i = null;
        }
    }

    @Override // defpackage.hi2
    public final void b() throws JSONException {
        m(2, "Aborted");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.hi2
    public final void g(long j, String str, orb orbVar) throws JSONException {
        JSONObject jSONObject = orbVar.a;
        char c = 65535;
        switch (str.hashCode()) {
            case -220057810:
                if (str.equals("SignInToSyncResponseMessage")) {
                    c = 0;
                    break;
                }
                break;
            case 213079172:
                if (str.equals("ReadyForPairingResponseMessage")) {
                    c = 1;
                    break;
                }
                break;
            case 269940506:
                if (str.equals("SpawnStartSyncDataResponseMessage")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (p(orbVar)) {
                    try {
                        orb orbVarC = jSONObject.isNull("error_detail") ? null : orbVar.c("error_detail");
                        if (this.h != 3) {
                            m(2, "Message out of order");
                            return;
                        } else if (orbVarC == null) {
                            r();
                            return;
                        } else {
                            l(2, orbVarC);
                            return;
                        }
                    } catch (JSONException e) {
                        m(2, "Invalid message");
                        throw e;
                    }
                }
                return;
            case 1:
                if (p(orbVar)) {
                    this.k = true;
                    boolean zIsNull = jSONObject.isNull("device_state");
                    i1 i1Var = this.g;
                    if (zIsNull) {
                        n(i1Var, null);
                        return;
                    }
                    try {
                        n(i1Var, q(orbVar.c("device_state")));
                        return;
                    } catch (JSONException e2) {
                        m(2, "Invalid message");
                        throw e2;
                    }
                }
                return;
            case 2:
                if (p(orbVar)) {
                    try {
                        o(jSONObject.isNull("start_sync_data") ? null : orbVar.c("start_sync_data"), jSONObject.isNull("error_detail") ? null : orbVar.c("error_detail"));
                        return;
                    } catch (JSONException e3) {
                        m(2, "Invalid message");
                        throw e3;
                    }
                }
                return;
            default:
                return;
        }
    }

    public final void l(final int i, orb orbVar) throws JSONException {
        this.h = (byte) 0;
        if (!this.k) {
            c(i);
            return;
        }
        ih4 ih4Var = this.i;
        if (ih4Var != null) {
            ih4Var.cancel();
            this.i = null;
        }
        this.k = false;
        Callback callback = new Callback() { // from class: ki2
            @Override // com.opera.api.Callback
            public final void run(Object obj) {
                li2 li2Var = this.a;
                li2Var.i = null;
                li2Var.c(i);
            }
        };
        orb orbVar2 = new orb();
        orbVar2.p(orbVar, "error_detail");
        this.i = j("NotifyHostScenarioResultMessage", orbVar2, callback);
    }

    public final void m(int i, String str) throws JSONException {
        orb orbVar = new orb();
        orbVar.p(str, "error_string");
        l(i, orbVar);
    }

    public final void n(i1 i1Var, i1 i1Var2) throws JSONException {
        fxl fxlVar;
        byte b = 2;
        if (this.h != 1) {
            m(2, "Message out of order");
            return;
        }
        if (i1Var2 == null) {
            m(2, "Other device not ready");
            return;
        }
        int i = i1Var2.b;
        int iA = vep.A(i1Var.b);
        byte b2 = 3;
        if (iA == 0) {
            int iA2 = vep.A(i);
            if (iA2 == 0) {
                ji2 ji2Var = new ji2(this, b2);
                ji2 ji2Var2 = new ji2(this, (byte) 4);
                myk mykVar = this.a;
                boolean zF = mykVar.b.f();
                bxl bxlVar = bf9.A;
                if (zF) {
                    ji2Var2.run("Already signed in");
                } else {
                    Iterator it = mykVar.a.u().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            fxlVar = null;
                            break;
                        } else {
                            fxlVar = (fxl) it.next();
                            if (fxlVar.b) {
                                break;
                            }
                        }
                    }
                    if (fxlVar == null) {
                        ji2Var2.run("Failed to find local device");
                    } else {
                        byte[] bArr = new byte[18];
                        new SecureRandom().nextBytes(bArr);
                        String strEncodeToString = Base64.encodeToString(bArr, 2);
                        pwl pwlVar = fxlVar.a;
                        String str = pwlVar.a;
                        bxl mghVar = new mgh((Object) null, ji2Var2, (byte) 8);
                        di2 di2Var = mykVar.e;
                        String str2 = pwlVar.b;
                        ay1 ay1Var = new ay1(mykVar, strEncodeToString, ji2Var, ji2Var2, mghVar);
                        zzh zzhVar = new zzh(ji2Var2, (byte) 20);
                        di2Var.getClass();
                        orb orbVarJ = o18.j("group_id", str2, "device_id", str);
                        orbVarJ.p((String) N.MsWGZerj(), "service");
                        orbVarJ.p(strEncodeToString, "password");
                        ((mgh) mghVar).b = new ai2(di2Var, zzhVar, orbVarJ, ay1Var);
                        bxlVar = mghVar;
                    }
                }
                this.i = bxlVar;
                return;
            }
            if (iA2 == 1) {
                this.h = (byte) 2;
                this.i = j("SpawnStartSyncDataRequestMessage", new orb(), new ji2(this, (byte) 5));
                return;
            }
        } else if (iA == 1) {
            int iA3 = vep.A(i);
            if (iA3 == 0) {
                this.h = (byte) 3;
                ji2 ji2Var3 = new ji2(this, (byte) 0);
                mgh mghVar2 = new mgh((Object) null, new ji2(this, b), (byte) 8);
                new s14(this, this.c, mghVar2, ji2Var3);
                this.i = mghVar2;
                return;
            }
            if (iA3 == 1) {
                String str3 = (String) i1Var.d;
                if (str3 == null || !str3.equals((String) i1Var2.d)) {
                    m(3, "Devices signed in to different accounts");
                    return;
                } else {
                    r();
                    return;
                }
            }
        }
        m(2, "Bad logic");
    }

    public final void o(orb orbVar, orb orbVar2) throws JSONException {
        String str;
        byte[] bArr;
        byte b = 2;
        if (this.h != 2) {
            m(2, "Message out of order");
            return;
        }
        if (orbVar2 != null) {
            l(2, orbVar2);
            return;
        }
        if (orbVar == null) {
            m(2, "Empty SpawnStartSyncDataResponseMessage");
            return;
        }
        bpd bpdVarI = hi2.i(orbVar.a.isNull("credential") ? null : orbVar.c("credential"));
        ei2 ei2VarH = hi2.h(orbVar);
        String strE = orbVar.e("auth_token");
        String str2 = ei2VarH.a;
        if (bpdVarI != null) {
            String str3 = (String) bpdVarI.b;
            bArr = (byte[]) bpdVarI.c;
            str = str3;
        } else {
            str = null;
            bArr = null;
        }
        this.i = this.a.d(strE, str2, str, bArr, new bi2(this, ei2VarH, b), new ji2(this, (byte) 6));
    }

    public final boolean p(orb orbVar) throws JSONException {
        try {
            if (Long.valueOf(orbVar.e("in_response_to")).longValue() != this.j) {
                return false;
            }
            this.j = -1L;
            return true;
        } catch (NumberFormatException unused) {
            throw new JSONException("Bad value for in_response_to: ".concat(orbVar.e("in_response_to")));
        }
    }

    public final void r() {
        this.h = (byte) 0;
        if (!this.k) {
            a();
            ii2 ii2Var = this.d;
            if (ii2Var == null) {
                return;
            }
            this.d = null;
            ii2Var.f(1);
            return;
        }
        ih4 ih4Var = this.i;
        if (ih4Var != null) {
            ih4Var.cancel();
            this.i = null;
        }
        this.k = false;
        ji2 ji2Var = new ji2(this, (byte) 7);
        orb orbVar = new orb();
        orbVar.p(null, "error_detail");
        this.i = j("NotifyHostScenarioResultMessage", orbVar, ji2Var);
    }
}
