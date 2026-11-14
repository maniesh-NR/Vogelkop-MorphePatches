package defpackage;

import org.json.JSONException;

/* loaded from: classes.dex */
public final class pi2 extends hi2 {
    public final vdf g;
    public ih4 h;
    public boolean i;

    public pi2(myk mykVar, rgh rghVar, String str, vdf vdfVar, kqd kqdVar) {
        super(mykVar, rghVar, str, kqdVar);
        this.g = vdfVar;
    }

    @Override // defpackage.hi2
    public final void a() {
        super.a();
        ih4 ih4Var = this.h;
        if (ih4Var != null) {
            ih4Var.cancel();
            this.h = null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.hi2
    public final void g(long j, String str, orb orbVar) throws JSONException {
        long j2;
        bpd bpdVarI;
        ei2 ei2VarH;
        myk mykVar;
        String strE;
        byte b = 2;
        byte b2 = 0;
        byte b3 = 1;
        char c = 65535;
        switch (str.hashCode()) {
            case -803879580:
                if (str.equals("SpawnStartSyncDataRequestMessage")) {
                    c = 0;
                    break;
                }
                break;
            case -589745335:
                if (str.equals("NotifyHostScenarioResultMessage")) {
                    c = 1;
                    break;
                }
                break;
            case 565787344:
                if (str.equals("SignInToSyncRequestMessage")) {
                    c = 2;
                    break;
                }
                break;
            case 1965232826:
                if (str.equals("ReadyForPairingRequestMessage")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (this.i && this.h == null) {
                    mi2 mi2Var = new mi2(this, j, b2);
                    mgh mghVar = new mgh((Object) null, new mi2(this, j, b3), (byte) 8);
                    new s14(this, this.c, mghVar, mi2Var);
                    this.h = mghVar;
                    break;
                }
                break;
            case 1:
                if (this.i && this.h == null) {
                    this.i = false;
                    try {
                        if (orbVar.a.isNull("error_detail")) {
                            a();
                            ii2 ii2Var = this.d;
                            if (ii2Var != null) {
                                this.d = null;
                                ii2Var.f(1);
                            }
                        } else {
                            orbVar.c("error_detail");
                            c(2);
                        }
                        break;
                    } catch (JSONException unused) {
                        c(2);
                        return;
                    }
                }
                break;
            case 2:
                if (this.i && this.h == null) {
                    try {
                        orb orbVarC = orbVar.c("start_sync_data");
                        bpdVarI = hi2.i(orbVarC.a.isNull("credential") ? null : orbVarC.c("credential"));
                        ei2VarH = hi2.h(orbVarC);
                        mykVar = this.a;
                        strE = orbVarC.e("auth_token");
                        try {
                            j2 = j;
                        } catch (JSONException unused2) {
                            j2 = j;
                        }
                    } catch (JSONException unused3) {
                        j2 = j;
                    }
                    try {
                        this.h = mykVar.d(strE, ei2VarH.a, bpdVarI != null ? (String) bpdVarI.b : null, bpdVarI != null ? (byte[]) bpdVarI.c : null, new ni2((Object) this, (Object) ei2VarH, j, (byte) 0), new mi2(this, j2, b));
                        break;
                    } catch (JSONException unused4) {
                        this.h = k(j2, vep.p("error_string", "Invalid message"), new ab(this, (byte) 22));
                        return;
                    }
                }
                break;
            case 3:
                if (!this.i && this.h == null) {
                    this.i = true;
                    i1 i1VarD = d();
                    ab abVar = new ab(this, (byte) 22);
                    orb orbVar2 = new orb();
                    orbVar2.p(hi2.e(i1VarD), "device_state");
                    orbVar2.p(String.valueOf(j), "in_response_to");
                    this.h = j("ReadyForPairingResponseMessage", orbVar2, abVar);
                    vdf vdfVar = this.g;
                    if (vdfVar != null) {
                        vdfVar.run();
                        break;
                    }
                }
                break;
        }
    }
}
