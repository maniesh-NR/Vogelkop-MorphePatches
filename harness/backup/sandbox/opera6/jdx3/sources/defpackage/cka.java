package defpackage;

import com.leanplum.internal.Constants;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class cka implements bqb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gsb b;
    public final /* synthetic */ isd c;

    public /* synthetic */ cka(gsb gsbVar, isd isdVar, byte b) {
        this.a = b;
        this.b = gsbVar;
        this.c = isdVar;
    }

    @Override // defpackage.bqb
    public final void n(tw7 tw7Var) {
        byte b = this.a;
        isd isdVar = this.c;
        gsb gsbVar = this.b;
        switch (b) {
            case 0:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        orb orbVarA = ((bla) ((sw7) tw7Var).a).a();
                        orb orbVar = new orb();
                        orbVar.p(orbVarA, Constants.Params.STATE);
                        if (gsbVar != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject.put("id", orb.t(gsbVar.a));
                                    if (!orbVar.equals(Unit.a)) {
                                        try {
                                            jSONObject.put("result", orb.t(orbVar));
                                        } catch (JSONException e) {
                                            t3p.n(e);
                                            return;
                                        }
                                    }
                                    ((ilm) isdVar.b).run(jSONObject.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, isdVar);
                    break;
                }
                break;
            case 1:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject2.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit, Unit.a)) {
                                        try {
                                            jSONObject2.put("result", orb.t(unit));
                                        } catch (JSONException e4) {
                                            t3p.n(e4);
                                            return;
                                        }
                                    }
                                    ((ilm) isdVar.b).run(jSONObject2.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, isdVar);
                    break;
                }
                break;
            case 2:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        vka vkaVar = (vka) ((sw7) tw7Var).a;
                        vkaVar.getClass();
                        orb orbVar2 = new orb();
                        orbVar2.p(vkaVar.a, "id");
                        orbVar2.s(vkaVar.b, "installationId");
                        orbVar2.s(vkaVar.c, "countryCode");
                        orbVar2.s(vkaVar.d, Constants.Keys.LOCALE);
                        wka wkaVar = vkaVar.e;
                        orb orbVar3 = new orb();
                        orbVar3.p(wkaVar.a, "version");
                        orbVar3.p(wkaVar.b, Constants.Params.NAME);
                        orbVar2.s(orbVar3, "host");
                        if (gsbVar != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject3.put("id", orb.t(gsbVar.a));
                                    if (!orbVar2.equals(Unit.a)) {
                                        try {
                                            jSONObject3.put("result", orb.t(orbVar2));
                                        } catch (JSONException e7) {
                                            t3p.n(e7);
                                            return;
                                        }
                                    }
                                    ((ilm) isdVar.b).run(jSONObject3.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, isdVar);
                    break;
                }
                break;
            case 3:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit2 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject4 = new JSONObject();
                            try {
                                jSONObject4.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject4.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit2, Unit.a)) {
                                        try {
                                            jSONObject4.put("result", orb.t(unit2));
                                        } catch (JSONException e10) {
                                            t3p.n(e10);
                                            return;
                                        }
                                    }
                                    ((ilm) isdVar.b).run(jSONObject4.toString());
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
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, isdVar);
                    break;
                }
                break;
            case 4:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit3 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject5 = new JSONObject();
                            try {
                                jSONObject5.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject5.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit3, Unit.a)) {
                                        try {
                                            jSONObject5.put("result", orb.t(unit3));
                                        } catch (JSONException e13) {
                                            t3p.n(e13);
                                            return;
                                        }
                                    }
                                    ((ilm) isdVar.b).run(jSONObject5.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, isdVar);
                    break;
                }
                break;
            case 5:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        xka xkaVar = (xka) ((sw7) tw7Var).a;
                        xkaVar.getClass();
                        orb orbVar4 = new orb();
                        orbVar4.p(xkaVar.a, "token");
                        orbVar4.p(xkaVar.b, Constants.Params.DEVICE_ID);
                        orbVar4.p(xkaVar.c, "homeCountryIso2");
                        if (gsbVar != null) {
                            JSONObject jSONObject6 = new JSONObject();
                            try {
                                jSONObject6.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject6.put("id", orb.t(gsbVar.a));
                                    if (!orbVar4.equals(Unit.a)) {
                                        try {
                                            jSONObject6.put("result", orb.t(orbVar4));
                                        } catch (JSONException e16) {
                                            t3p.n(e16);
                                            return;
                                        }
                                    }
                                    ((ilm) isdVar.b).run(jSONObject6.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, isdVar);
                    break;
                }
                break;
            case 6:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit4 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject7 = new JSONObject();
                            try {
                                jSONObject7.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject7.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit4, Unit.a)) {
                                        try {
                                            jSONObject7.put("result", orb.t(unit4));
                                        } catch (JSONException e19) {
                                            t3p.n(e19);
                                            return;
                                        }
                                    }
                                    ((ilm) isdVar.b).run(jSONObject7.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, isdVar);
                    break;
                }
                break;
            default:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit5 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject8 = new JSONObject();
                            try {
                                jSONObject8.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject8.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit5, Unit.a)) {
                                        try {
                                            jSONObject8.put("result", orb.t(unit5));
                                        } catch (JSONException e22) {
                                            t3p.n(e22);
                                            return;
                                        }
                                    }
                                    ((ilm) isdVar.b).run(jSONObject8.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, isdVar);
                    break;
                }
                break;
        }
    }
}
