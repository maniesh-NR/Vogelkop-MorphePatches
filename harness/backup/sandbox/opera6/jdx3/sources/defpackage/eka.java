package defpackage;

import com.appsflyer.internal.o;
import com.leanplum.internal.Constants;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class eka implements bqb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gsb b;
    public final /* synthetic */ wub c;

    public /* synthetic */ eka(gsb gsbVar, wub wubVar, byte b) {
        this.a = b;
        this.b = gsbVar;
        this.c = wubVar;
    }

    @Override // defpackage.bqb
    public final void n(tw7 tw7Var) {
        byte b = this.a;
        wub wubVar = this.c;
        gsb gsbVar = this.b;
        switch (b) {
            case 0:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit, Unit.a)) {
                                        try {
                                            jSONObject.put("result", orb.t(unit));
                                        } catch (JSONException e) {
                                            t3p.n(e);
                                            return;
                                        }
                                    }
                                    ((ilm) wubVar.a).run(jSONObject.toString());
                                    break;
                                } catch (JSONException e2) {
                                    t3p.n(e2);
                                    return;
                                }
                            } catch (JSONException e3) {
                                t3p.n(e3);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, wubVar);
                    break;
                }
                break;
            case 1:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit2 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject2.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit2, Unit.a)) {
                                        try {
                                            jSONObject2.put("result", orb.t(unit2));
                                        } catch (JSONException e4) {
                                            t3p.n(e4);
                                            return;
                                        }
                                    }
                                    ((ilm) wubVar.a).run(jSONObject2.toString());
                                    break;
                                } catch (JSONException e5) {
                                    t3p.n(e5);
                                    return;
                                }
                            } catch (JSONException e6) {
                                t3p.n(e6);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, wubVar);
                    break;
                }
                break;
            case 2:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit3 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject3.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit3, Unit.a)) {
                                        try {
                                            jSONObject3.put("result", orb.t(unit3));
                                        } catch (JSONException e7) {
                                            t3p.n(e7);
                                            return;
                                        }
                                    }
                                    ((ilm) wubVar.a).run(jSONObject3.toString());
                                    break;
                                } catch (JSONException e8) {
                                    t3p.n(e8);
                                    return;
                                }
                            } catch (JSONException e9) {
                                t3p.n(e9);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, wubVar);
                    break;
                }
                break;
            case 3:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        hka hkaVar = (hka) ((sw7) tw7Var).a;
                        hkaVar.getClass();
                        orb orbVar = new orb();
                        ika ikaVar = hkaVar.a;
                        if (ikaVar == ika.UNDEFINED) {
                            ikaVar.getClass();
                            o.a("Undefined");
                            break;
                        } else {
                            orbVar.p(ikaVar.a, "productId");
                            orbVar.p(hkaVar.b, "huid");
                            orbVar.p(hkaVar.c, "leanplumId");
                            orbVar.p(hkaVar.d, "countryCode");
                            if (gsbVar != null) {
                                JSONObject jSONObject4 = new JSONObject();
                                try {
                                    jSONObject4.put("jsonrpc", orb.t("2.0"));
                                    try {
                                        jSONObject4.put("id", orb.t(gsbVar.a));
                                        if (!orbVar.equals(Unit.a)) {
                                            try {
                                                jSONObject4.put("result", orb.t(orbVar));
                                            } catch (JSONException e10) {
                                                t3p.n(e10);
                                                return;
                                            }
                                        }
                                        ((ilm) wubVar.a).run(jSONObject4.toString());
                                        break;
                                    } catch (JSONException e11) {
                                        t3p.n(e11);
                                        return;
                                    }
                                } catch (JSONException e12) {
                                    t3p.n(e12);
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, wubVar);
                    break;
                }
                break;
            case 4:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit4 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject5 = new JSONObject();
                            try {
                                jSONObject5.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject5.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit4, Unit.a)) {
                                        try {
                                            jSONObject5.put("result", orb.t(unit4));
                                        } catch (JSONException e13) {
                                            t3p.n(e13);
                                            return;
                                        }
                                    }
                                    ((ilm) wubVar.a).run(jSONObject5.toString());
                                    break;
                                } catch (JSONException e14) {
                                    t3p.n(e14);
                                    return;
                                }
                            } catch (JSONException e15) {
                                t3p.n(e15);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, wubVar);
                    break;
                }
                break;
            case 5:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit5 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject6 = new JSONObject();
                            try {
                                jSONObject6.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject6.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit5, Unit.a)) {
                                        try {
                                            jSONObject6.put("result", orb.t(unit5));
                                        } catch (JSONException e16) {
                                            t3p.n(e16);
                                            return;
                                        }
                                    }
                                    ((ilm) wubVar.a).run(jSONObject6.toString());
                                    break;
                                } catch (JSONException e17) {
                                    t3p.n(e17);
                                    return;
                                }
                            } catch (JSONException e18) {
                                t3p.n(e18);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, wubVar);
                    break;
                }
                break;
            case 6:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        orb orbVarA = ((dla) ((sw7) tw7Var).a).a();
                        orb orbVar2 = new orb();
                        orbVar2.p(orbVarA, Constants.Params.STATE);
                        if (gsbVar != null) {
                            JSONObject jSONObject7 = new JSONObject();
                            try {
                                jSONObject7.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject7.put("id", orb.t(gsbVar.a));
                                    if (!orbVar2.equals(Unit.a)) {
                                        try {
                                            jSONObject7.put("result", orb.t(orbVar2));
                                        } catch (JSONException e19) {
                                            t3p.n(e19);
                                            return;
                                        }
                                    }
                                    ((ilm) wubVar.a).run(jSONObject7.toString());
                                    break;
                                } catch (JSONException e20) {
                                    t3p.n(e20);
                                    return;
                                }
                            } catch (JSONException e21) {
                                t3p.n(e21);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, wubVar);
                    break;
                }
                break;
            case 7:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        tha thaVar = (tha) ((sw7) tw7Var).a;
                        thaVar.getClass();
                        orb orbVar3 = new orb();
                        orbVar3.p(thaVar.a, "id");
                        orbVar3.s(thaVar.b, "installationId");
                        orbVar3.s(thaVar.c, "countryCode");
                        orbVar3.s(thaVar.d, Constants.Keys.LOCALE);
                        wha whaVar = thaVar.e;
                        orb orbVar4 = new orb();
                        orbVar4.p(whaVar.a, "version");
                        orbVar4.p(whaVar.b, Constants.Params.NAME);
                        orbVar3.s(orbVar4, "host");
                        if (gsbVar != null) {
                            JSONObject jSONObject8 = new JSONObject();
                            try {
                                jSONObject8.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject8.put("id", orb.t(gsbVar.a));
                                    if (!orbVar3.equals(Unit.a)) {
                                        try {
                                            jSONObject8.put("result", orb.t(orbVar3));
                                        } catch (JSONException e22) {
                                            t3p.n(e22);
                                            return;
                                        }
                                    }
                                    ((ilm) wubVar.a).run(jSONObject8.toString());
                                    break;
                                } catch (JSONException e23) {
                                    t3p.n(e23);
                                    return;
                                }
                            } catch (JSONException e24) {
                                t3p.n(e24);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, wubVar);
                    break;
                }
                break;
            case 8:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit6 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject9 = new JSONObject();
                            try {
                                jSONObject9.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject9.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit6, Unit.a)) {
                                        try {
                                            jSONObject9.put("result", orb.t(unit6));
                                        } catch (JSONException e25) {
                                            t3p.n(e25);
                                            return;
                                        }
                                    }
                                    ((ilm) wubVar.a).run(jSONObject9.toString());
                                    break;
                                } catch (JSONException e26) {
                                    t3p.n(e26);
                                    return;
                                }
                            } catch (JSONException e27) {
                                t3p.n(e27);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, wubVar);
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit7 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject10 = new JSONObject();
                            try {
                                jSONObject10.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject10.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit7, Unit.a)) {
                                        try {
                                            jSONObject10.put("result", orb.t(unit7));
                                        } catch (JSONException e28) {
                                            t3p.n(e28);
                                            return;
                                        }
                                    }
                                    ((ilm) wubVar.a).run(jSONObject10.toString());
                                    break;
                                } catch (JSONException e29) {
                                    t3p.n(e29);
                                    return;
                                }
                            } catch (JSONException e30) {
                                t3p.n(e30);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, wubVar);
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Boolean bool = (Boolean) ((sw7) tw7Var).a;
                        bool.getClass();
                        if (gsbVar != null) {
                            JSONObject jSONObject11 = new JSONObject();
                            try {
                                jSONObject11.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject11.put("id", orb.t(gsbVar.a));
                                    if (!bool.equals(Unit.a)) {
                                        try {
                                            jSONObject11.put("result", orb.t(bool));
                                        } catch (JSONException e31) {
                                            t3p.n(e31);
                                            return;
                                        }
                                    }
                                    ((ilm) wubVar.a).run(jSONObject11.toString());
                                    break;
                                } catch (JSONException e32) {
                                    t3p.n(e32);
                                    return;
                                }
                            } catch (JSONException e33) {
                                t3p.n(e33);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, wubVar);
                    break;
                }
                break;
            case 11:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit8 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject12 = new JSONObject();
                            try {
                                jSONObject12.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject12.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit8, Unit.a)) {
                                        try {
                                            jSONObject12.put("result", orb.t(unit8));
                                        } catch (JSONException e34) {
                                            t3p.n(e34);
                                            return;
                                        }
                                    }
                                    ((ilm) wubVar.a).run(jSONObject12.toString());
                                    break;
                                } catch (JSONException e35) {
                                    t3p.n(e35);
                                    return;
                                }
                            } catch (JSONException e36) {
                                t3p.n(e36);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, wubVar);
                    break;
                }
                break;
            default:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit9 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject13 = new JSONObject();
                            try {
                                jSONObject13.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject13.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit9, Unit.a)) {
                                        try {
                                            jSONObject13.put("result", orb.t(unit9));
                                        } catch (JSONException e37) {
                                            t3p.n(e37);
                                            return;
                                        }
                                    }
                                    ((ilm) wubVar.a).run(jSONObject13.toString());
                                    break;
                                } catch (JSONException e38) {
                                    t3p.n(e38);
                                    return;
                                }
                            } catch (JSONException e39) {
                                t3p.n(e39);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, wubVar);
                    break;
                }
                break;
        }
    }
}
