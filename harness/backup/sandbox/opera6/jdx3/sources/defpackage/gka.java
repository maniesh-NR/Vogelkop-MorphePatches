package defpackage;

import com.appsflyer.internal.o;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class gka implements bqb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gsb b;
    public final /* synthetic */ zy9 c;

    public /* synthetic */ gka(gsb gsbVar, zy9 zy9Var, byte b) {
        this.a = b;
        this.b = gsbVar;
        this.c = zy9Var;
    }

    @Override // defpackage.bqb
    public final void n(tw7 tw7Var) {
        byte b = this.a;
        zy9 zy9Var = this.c;
        gsb gsbVar = this.b;
        switch (b) {
            case 0:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        aka akaVar = (aka) ((sw7) tw7Var).a;
                        if (akaVar != null) {
                            orbVar = new orb();
                            orbVar.p(akaVar.a.a(), "chat");
                        }
                        if (gsbVar != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(orbVar, Unit.a)) {
                                        try {
                                            jSONObject.put("result", orb.t(orbVar));
                                        } catch (JSONException e) {
                                            t3p.n(e);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
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
                                    ((ilm) zy9Var.a).run(jSONObject2.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 2:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit2 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject3.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit2, Unit.a)) {
                                        try {
                                            jSONObject3.put("result", orb.t(unit2));
                                        } catch (JSONException e7) {
                                            t3p.n(e7);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject3.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 3:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit3 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject4 = new JSONObject();
                            try {
                                jSONObject4.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject4.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit3, Unit.a)) {
                                        try {
                                            jSONObject4.put("result", orb.t(unit3));
                                        } catch (JSONException e10) {
                                            t3p.n(e10);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject4.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 4:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        vja vjaVar = (vja) ((sw7) tw7Var).a;
                        orbVar = vjaVar != null ? vjaVar.a() : null;
                        if (gsbVar != null) {
                            JSONObject jSONObject5 = new JSONObject();
                            try {
                                jSONObject5.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject5.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(orbVar, Unit.a)) {
                                        try {
                                            jSONObject5.put("result", orb.t(orbVar));
                                        } catch (JSONException e13) {
                                            t3p.n(e13);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject5.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 5:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        oja ojaVar = (oja) ((sw7) tw7Var).a;
                        switch (ojaVar.a) {
                            case 0:
                                orbVar = new orb();
                                orbVar.p((String) ojaVar.b, "accessToken");
                                break;
                            default:
                                orb orbVar = new orb();
                                pja pjaVar = (pja) ojaVar.b;
                                if (pjaVar == pja.UNDEFINED) {
                                    o.a("Undefined");
                                    break;
                                } else {
                                    orbVar.p(pjaVar.a, "error");
                                    orbVar = orbVar;
                                    break;
                                }
                        }
                        if (gsbVar != null) {
                            JSONObject jSONObject6 = new JSONObject();
                            try {
                                jSONObject6.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject6.put("id", orb.t(gsbVar.a));
                                    if (!orbVar.equals(Unit.a)) {
                                        try {
                                            jSONObject6.put("result", orb.t(orbVar));
                                        } catch (JSONException e16) {
                                            t3p.n(e16);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject6.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 6:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        orb orbVarA = ((zja) ((sw7) tw7Var).a).a();
                        if (gsbVar != null) {
                            JSONObject jSONObject7 = new JSONObject();
                            try {
                                jSONObject7.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject7.put("id", orb.t(gsbVar.a));
                                    if (!orbVarA.equals(Unit.a)) {
                                        try {
                                            jSONObject7.put("result", orb.t(orbVarA));
                                        } catch (JSONException e19) {
                                            t3p.n(e19);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject7.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 7:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit4 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject8 = new JSONObject();
                            try {
                                jSONObject8.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject8.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit4, Unit.a)) {
                                        try {
                                            jSONObject8.put("result", orb.t(unit4));
                                        } catch (JSONException e22) {
                                            t3p.n(e22);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject8.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 8:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit5 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject9 = new JSONObject();
                            try {
                                jSONObject9.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject9.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit5, Unit.a)) {
                                        try {
                                            jSONObject9.put("result", orb.t(unit5));
                                        } catch (JSONException e25) {
                                            t3p.n(e25);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject9.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            default:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit6 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject10 = new JSONObject();
                            try {
                                jSONObject10.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject10.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit6, Unit.a)) {
                                        try {
                                            jSONObject10.put("result", orb.t(unit6));
                                        } catch (JSONException e28) {
                                            t3p.n(e28);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject10.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
        }
    }
}
