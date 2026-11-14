package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class dka implements bqb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gsb b;
    public final /* synthetic */ qq6 c;

    public /* synthetic */ dka(gsb gsbVar, qq6 qq6Var, byte b) {
        this.a = b;
        this.b = gsbVar;
        this.c = qq6Var;
    }

    @Override // defpackage.bqb
    public final void n(tw7 tw7Var) {
        byte b = this.a;
        orb orbVar = null;
        qq6 qq6Var = this.c;
        gsb gsbVar = this.b;
        switch (b) {
            case 0:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        ska skaVar = (ska) ((sw7) tw7Var).a;
                        if (skaVar != null) {
                            orbVar = new orb();
                            orbVar.p(skaVar.a, Constants.Params.VALUE);
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
                                    ((ilm) qq6Var.b).run(jSONObject.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
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
                                    ((ilm) qq6Var.b).run(jSONObject2.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
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
                                    ((ilm) qq6Var.b).run(jSONObject3.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
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
                                    ((ilm) qq6Var.b).run(jSONObject4.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
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
                                    ((ilm) qq6Var.b).run(jSONObject5.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
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
                                    ((ilm) qq6Var.b).run(jSONObject6.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
                    break;
                }
                break;
            case 6:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit6 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject7 = new JSONObject();
                            try {
                                jSONObject7.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject7.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit6, Unit.a)) {
                                        try {
                                            jSONObject7.put("result", orb.t(unit6));
                                        } catch (JSONException e19) {
                                            t3p.n(e19);
                                            return;
                                        }
                                    }
                                    ((ilm) qq6Var.b).run(jSONObject7.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
                    break;
                }
                break;
            case 7:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit7 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject8 = new JSONObject();
                            try {
                                jSONObject8.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject8.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit7, Unit.a)) {
                                        try {
                                            jSONObject8.put("result", orb.t(unit7));
                                        } catch (JSONException e22) {
                                            t3p.n(e22);
                                            return;
                                        }
                                    }
                                    ((ilm) qq6Var.b).run(jSONObject8.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
                    break;
                }
                break;
            case 8:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit8 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject9 = new JSONObject();
                            try {
                                jSONObject9.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject9.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit8, Unit.a)) {
                                        try {
                                            jSONObject9.put("result", orb.t(unit8));
                                        } catch (JSONException e25) {
                                            t3p.n(e25);
                                            return;
                                        }
                                    }
                                    ((ilm) qq6Var.b).run(jSONObject9.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit9 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject10 = new JSONObject();
                            try {
                                jSONObject10.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject10.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit9, Unit.a)) {
                                        try {
                                            jSONObject10.put("result", orb.t(unit9));
                                        } catch (JSONException e28) {
                                            t3p.n(e28);
                                            return;
                                        }
                                    }
                                    ((ilm) qq6Var.b).run(jSONObject10.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit10 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject11 = new JSONObject();
                            try {
                                jSONObject11.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject11.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit10, Unit.a)) {
                                        try {
                                            jSONObject11.put("result", orb.t(unit10));
                                        } catch (JSONException e31) {
                                            t3p.n(e31);
                                            return;
                                        }
                                    }
                                    ((ilm) qq6Var.b).run(jSONObject11.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
                    break;
                }
                break;
            case 11:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit11 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject12 = new JSONObject();
                            try {
                                jSONObject12.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject12.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit11, Unit.a)) {
                                        try {
                                            jSONObject12.put("result", orb.t(unit11));
                                        } catch (JSONException e34) {
                                            t3p.n(e34);
                                            return;
                                        }
                                    }
                                    ((ilm) qq6Var.b).run(jSONObject12.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
                    break;
                }
                break;
            case 12:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit12 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject13 = new JSONObject();
                            try {
                                jSONObject13.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject13.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit12, Unit.a)) {
                                        try {
                                            jSONObject13.put("result", orb.t(unit12));
                                        } catch (JSONException e37) {
                                            t3p.n(e37);
                                            return;
                                        }
                                    }
                                    ((ilm) qq6Var.b).run(jSONObject13.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
                    break;
                }
                break;
            case 13:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        rha rhaVar = (rha) ((sw7) tw7Var).a;
                        rhaVar.getClass();
                        orb orbVar2 = new orb();
                        orbVar2.p(rhaVar.a, "oscore");
                        orbVar2.p(rhaVar.b, "oscoreWss");
                        orbVar2.p(rhaVar.c, "ftOscore");
                        orbVar2.p(rhaVar.d, "apex");
                        orbVar2.p(null, "news");
                        if (gsbVar != null) {
                            JSONObject jSONObject14 = new JSONObject();
                            try {
                                jSONObject14.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject14.put("id", orb.t(gsbVar.a));
                                    if (!orbVar2.equals(Unit.a)) {
                                        try {
                                            jSONObject14.put("result", orb.t(orbVar2));
                                        } catch (JSONException e40) {
                                            t3p.n(e40);
                                            return;
                                        }
                                    }
                                    ((ilm) qq6Var.b).run(jSONObject14.toString());
                                    break;
                                } catch (JSONException e41) {
                                    t3p.n(e41);
                                    return;
                                }
                            } catch (JSONException e42) {
                                t3p.n(e42);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
                    break;
                }
                break;
            case 14:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        sha shaVar = (sha) ((sw7) tw7Var).a;
                        shaVar.getClass();
                        orb orbVar3 = new orb();
                        orbVar3.p(shaVar.a, "id");
                        orbVar3.s(shaVar.b, "installationId");
                        orbVar3.s(shaVar.c, "countryCode");
                        orbVar3.s(shaVar.d, Constants.Keys.LOCALE);
                        vha vhaVar = shaVar.e;
                        orb orbVar4 = new orb();
                        orbVar4.p(vhaVar.a, "version");
                        orbVar4.p(vhaVar.b, Constants.Params.NAME);
                        orbVar3.s(orbVar4, "host");
                        if (gsbVar != null) {
                            JSONObject jSONObject15 = new JSONObject();
                            try {
                                jSONObject15.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject15.put("id", orb.t(gsbVar.a));
                                    if (!orbVar3.equals(Unit.a)) {
                                        try {
                                            jSONObject15.put("result", orb.t(orbVar3));
                                        } catch (JSONException e43) {
                                            t3p.n(e43);
                                            return;
                                        }
                                    }
                                    ((ilm) qq6Var.b).run(jSONObject15.toString());
                                    break;
                                } catch (JSONException e44) {
                                    t3p.n(e44);
                                    return;
                                }
                            } catch (JSONException e45) {
                                t3p.n(e45);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
                    break;
                }
                break;
            case 15:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        orb orbVarP = vep.p("id", (String) ((sw7) tw7Var).a);
                        if (gsbVar != null) {
                            JSONObject jSONObject16 = new JSONObject();
                            try {
                                jSONObject16.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject16.put("id", orb.t(gsbVar.a));
                                    if (!orbVarP.equals(Unit.a)) {
                                        try {
                                            jSONObject16.put("result", orb.t(orbVarP));
                                        } catch (JSONException e46) {
                                            t3p.n(e46);
                                            return;
                                        }
                                    }
                                    ((ilm) qq6Var.b).run(jSONObject16.toString());
                                    break;
                                } catch (JSONException e47) {
                                    t3p.n(e47);
                                    return;
                                }
                            } catch (JSONException e48) {
                                t3p.n(e48);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
                    break;
                }
                break;
            case 16:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        eia eiaVar = (eia) ((sw7) tw7Var).a;
                        if (eiaVar != null) {
                            orbVar = new orb();
                            fia fiaVar = eiaVar.a;
                            orb orbVar5 = new orb();
                            orbVar5.o(fiaVar.a, "code");
                            orbVar5.p(fiaVar.b, Constants.Params.MESSAGE);
                            orbVar.p(orbVar5, "error");
                        }
                        if (gsbVar != null) {
                            JSONObject jSONObject17 = new JSONObject();
                            try {
                                jSONObject17.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject17.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(orbVar, Unit.a)) {
                                        try {
                                            jSONObject17.put("result", orb.t(orbVar));
                                        } catch (JSONException e49) {
                                            t3p.n(e49);
                                            return;
                                        }
                                    }
                                    ((ilm) qq6Var.b).run(jSONObject17.toString());
                                    break;
                                } catch (JSONException e50) {
                                    t3p.n(e50);
                                    return;
                                }
                            } catch (JSONException e51) {
                                t3p.n(e51);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
                    break;
                }
                break;
            case 17:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        cia ciaVar = (cia) ((sw7) tw7Var).a;
                        if (ciaVar != null) {
                            orbVar = new orb();
                            dia diaVar = ciaVar.a;
                            orb orbVar6 = new orb();
                            orbVar6.o(diaVar.a, "code");
                            orbVar6.p(diaVar.b, Constants.Params.MESSAGE);
                            orbVar.p(orbVar6, "error");
                        }
                        if (gsbVar != null) {
                            JSONObject jSONObject18 = new JSONObject();
                            try {
                                jSONObject18.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject18.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(orbVar, Unit.a)) {
                                        try {
                                            jSONObject18.put("result", orb.t(orbVar));
                                        } catch (JSONException e52) {
                                            t3p.n(e52);
                                            return;
                                        }
                                    }
                                    ((ilm) qq6Var.b).run(jSONObject18.toString());
                                    break;
                                } catch (JSONException e53) {
                                    t3p.n(e53);
                                    return;
                                }
                            } catch (JSONException e54) {
                                t3p.n(e54);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
                    break;
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        lia liaVar = (lia) ((sw7) tw7Var).a;
                        if (liaVar != null) {
                            orbVar = new orb();
                            mia miaVar = liaVar.a;
                            orb orbVar7 = new orb();
                            orbVar7.o(miaVar.a, "code");
                            orbVar7.p(miaVar.b, Constants.Params.MESSAGE);
                            orbVar.p(orbVar7, "error");
                        }
                        if (gsbVar != null) {
                            JSONObject jSONObject19 = new JSONObject();
                            try {
                                jSONObject19.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject19.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(orbVar, Unit.a)) {
                                        try {
                                            jSONObject19.put("result", orb.t(orbVar));
                                        } catch (JSONException e55) {
                                            t3p.n(e55);
                                            return;
                                        }
                                    }
                                    ((ilm) qq6Var.b).run(jSONObject19.toString());
                                    break;
                                } catch (JSONException e56) {
                                    t3p.n(e56);
                                    return;
                                }
                            } catch (JSONException e57) {
                                t3p.n(e57);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
                    break;
                }
                break;
            case 19:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        orb orbVarA = ((cla) ((sw7) tw7Var).a).a();
                        orb orbVar8 = new orb();
                        orbVar8.p(orbVarA, Constants.Params.STATE);
                        if (gsbVar != null) {
                            JSONObject jSONObject20 = new JSONObject();
                            try {
                                jSONObject20.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject20.put("id", orb.t(gsbVar.a));
                                    if (!orbVar8.equals(Unit.a)) {
                                        try {
                                            jSONObject20.put("result", orb.t(orbVar8));
                                        } catch (JSONException e58) {
                                            t3p.n(e58);
                                            return;
                                        }
                                    }
                                    ((ilm) qq6Var.b).run(jSONObject20.toString());
                                    break;
                                } catch (JSONException e59) {
                                    t3p.n(e59);
                                    return;
                                }
                            } catch (JSONException e60) {
                                t3p.n(e60);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
                    break;
                }
                break;
            default:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit13 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject21 = new JSONObject();
                            try {
                                jSONObject21.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject21.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit13, Unit.a)) {
                                        try {
                                            jSONObject21.put("result", orb.t(unit13));
                                        } catch (JSONException e61) {
                                            t3p.n(e61);
                                            return;
                                        }
                                    }
                                    ((ilm) qq6Var.b).run(jSONObject21.toString());
                                    break;
                                } catch (JSONException e62) {
                                    t3p.n(e62);
                                    return;
                                }
                            } catch (JSONException e63) {
                                t3p.n(e63);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, qq6Var);
                    break;
                }
                break;
        }
    }
}
