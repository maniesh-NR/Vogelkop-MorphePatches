package defpackage;

import com.appsflyer.internal.o;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class fka implements bqb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gsb b;
    public final /* synthetic */ zy9 c;

    public /* synthetic */ fka(gsb gsbVar, zy9 zy9Var, byte b) {
        this.a = b;
        this.b = gsbVar;
        this.c = zy9Var;
    }

    private final void a(tw7 tw7Var) throws JSONException {
        boolean z = tw7Var instanceof rw7;
        gsb gsbVar = this.b;
        zy9 zy9Var = this.c;
        if (z) {
            kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
            return;
        }
        if (!(tw7Var instanceof sw7)) {
            h9o.p();
            return;
        }
        List list = (List) ((sw7) tw7Var).a;
        vpb vpbVar = new vpb();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vpbVar.a((String) it.next());
        }
        orb orbVar = new orb();
        orbVar.p(vpbVar, "shortUrls");
        if (gsbVar == null) {
            return;
        }
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
                ((ilm) zy9Var.a).run(jSONObject.toString());
            } catch (JSONException e2) {
                t3p.n(e2);
            }
        } catch (JSONException e3) {
            t3p.n(e3);
        }
    }

    private final void b(tw7 tw7Var) throws JSONException {
        boolean z = tw7Var instanceof rw7;
        gsb gsbVar = this.b;
        zy9 zy9Var = this.c;
        if (z) {
            kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
            return;
        }
        if (!(tw7Var instanceof sw7)) {
            h9o.p();
            return;
        }
        Unit unit = (Unit) ((sw7) tw7Var).a;
        if (gsbVar == null) {
            return;
        }
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
                ((ilm) zy9Var.a).run(jSONObject.toString());
            } catch (JSONException e2) {
                t3p.n(e2);
            }
        } catch (JSONException e3) {
            t3p.n(e3);
        }
    }

    private final void c(tw7 tw7Var) throws JSONException {
        boolean z = tw7Var instanceof rw7;
        gsb gsbVar = this.b;
        zy9 zy9Var = this.c;
        if (z) {
            kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
            return;
        }
        if (!(tw7Var instanceof sw7)) {
            h9o.p();
            return;
        }
        orb orbVarP = vep.p("key", (String) ((sw7) tw7Var).a);
        if (gsbVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("jsonrpc", orb.t("2.0"));
            try {
                jSONObject.put("id", orb.t(gsbVar.a));
                if (!orbVarP.equals(Unit.a)) {
                    try {
                        jSONObject.put("result", orb.t(orbVarP));
                    } catch (JSONException e) {
                        t3p.n(e);
                        return;
                    }
                }
                ((ilm) zy9Var.a).run(jSONObject.toString());
            } catch (JSONException e2) {
                t3p.n(e2);
            }
        } catch (JSONException e3) {
            t3p.n(e3);
        }
    }

    private final void d(tw7 tw7Var) throws JSONException {
        boolean z = tw7Var instanceof rw7;
        gsb gsbVar = this.b;
        zy9 zy9Var = this.c;
        if (z) {
            kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
            return;
        }
        if (!(tw7Var instanceof sw7)) {
            h9o.p();
            return;
        }
        Unit unit = (Unit) ((sw7) tw7Var).a;
        if (gsbVar == null) {
            return;
        }
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
                ((ilm) zy9Var.a).run(jSONObject.toString());
            } catch (JSONException e2) {
                t3p.n(e2);
            }
        } catch (JSONException e3) {
            t3p.n(e3);
        }
    }

    private final void e(tw7 tw7Var) throws JSONException {
        boolean z = tw7Var instanceof rw7;
        gsb gsbVar = this.b;
        zy9 zy9Var = this.c;
        if (z) {
            kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
            return;
        }
        if (!(tw7Var instanceof sw7)) {
            h9o.p();
            return;
        }
        orb orbVarA = ((jka) ((sw7) tw7Var).a).a();
        if (gsbVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("jsonrpc", orb.t("2.0"));
            try {
                jSONObject.put("id", orb.t(gsbVar.a));
                if (!orbVarA.equals(Unit.a)) {
                    try {
                        jSONObject.put("result", orb.t(orbVarA));
                    } catch (JSONException e) {
                        t3p.n(e);
                        return;
                    }
                }
                ((ilm) zy9Var.a).run(jSONObject.toString());
            } catch (JSONException e2) {
                t3p.n(e2);
            }
        } catch (JSONException e3) {
            t3p.n(e3);
        }
    }

    @Override // defpackage.bqb
    public final void n(tw7 tw7Var) {
        byte b = this.a;
        orb orbVar = null;
        orb orbVar2 = null;
        orb orbVar3 = null;
        orb orbVar4 = null;
        zy9 zy9Var = this.c;
        gsb gsbVar = this.b;
        switch (b) {
            case 0:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        tka tkaVar = (tka) ((sw7) tw7Var).a;
                        if (tkaVar != null) {
                            orbVar = new orb();
                            orbVar.p(tkaVar.a, Constants.Params.VALUE);
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
                        if (((jia) ((sw7) tw7Var).a) != null) {
                            orbVar4 = new orb();
                            orb orbVar5 = new orb();
                            orbVar5.o(999L, "code");
                            orbVar5.p("", Constants.Params.MESSAGE);
                            orbVar4.p(orbVar5, "error");
                        }
                        if (gsbVar != null) {
                            JSONObject jSONObject5 = new JSONObject();
                            try {
                                jSONObject5.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject5.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(orbVar4, Unit.a)) {
                                        try {
                                            jSONObject5.put("result", orb.t(orbVar4));
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
                        Unit unit4 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject6 = new JSONObject();
                            try {
                                jSONObject6.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject6.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit4, Unit.a)) {
                                        try {
                                            jSONObject6.put("result", orb.t(unit4));
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
                        yha yhaVar = (yha) ((sw7) tw7Var).a;
                        if (yhaVar != null) {
                            orb orbVar6 = new orb();
                            orbVar6.p(yhaVar.a, "comment");
                            ehc ehcVar = yhaVar.b;
                            vpb vpbVar = ehcVar != null ? new vpb() : null;
                            if (vpbVar != null && ehcVar != null) {
                                mea meaVarListIterator = ehcVar.listIterator(0);
                                while (true) {
                                    mea meaVar = meaVarListIterator;
                                    if (meaVar.hasNext()) {
                                        zha zhaVar = (zha) meaVar.next();
                                        if (zhaVar == zha.UNDEFINED) {
                                            zhaVar.getClass();
                                            o.a("Undefined");
                                            break;
                                        } else {
                                            vpbVar.a(zhaVar.a);
                                        }
                                    }
                                }
                            }
                            orbVar6.s(vpbVar, "reason");
                            orbVar3 = orbVar6;
                        }
                        if (gsbVar != null) {
                            JSONObject jSONObject7 = new JSONObject();
                            try {
                                jSONObject7.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject7.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(orbVar3, Unit.a)) {
                                        try {
                                            jSONObject7.put("result", orb.t(orbVar3));
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
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit8 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject11 = new JSONObject();
                            try {
                                jSONObject11.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject11.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit8, Unit.a)) {
                                        try {
                                            jSONObject11.put("result", orb.t(unit8));
                                        } catch (JSONException e31) {
                                            t3p.n(e31);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject11.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 11:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        bka bkaVar = (bka) ((sw7) tw7Var).a;
                        if (bkaVar != null) {
                            orbVar2 = new orb();
                            orbVar2.p(bkaVar.a.a(), "chatItem");
                        }
                        if (gsbVar != null) {
                            JSONObject jSONObject12 = new JSONObject();
                            try {
                                jSONObject12.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject12.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(orbVar2, Unit.a)) {
                                        try {
                                            jSONObject12.put("result", orb.t(orbVar2));
                                        } catch (JSONException e34) {
                                            t3p.n(e34);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject12.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 12:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        uha uhaVar = (uha) ((sw7) tw7Var).a;
                        uhaVar.getClass();
                        orb orbVar7 = new orb();
                        orbVar7.p(uhaVar.a, "id");
                        orbVar7.s(uhaVar.b, "installationId");
                        orbVar7.s(uhaVar.c, "countryCode");
                        orbVar7.s(uhaVar.d, Constants.Keys.LOCALE);
                        xha xhaVar = uhaVar.e;
                        orb orbVar8 = new orb();
                        orbVar8.p(xhaVar.a, "version");
                        orbVar8.p(xhaVar.b, Constants.Params.NAME);
                        orbVar7.s(orbVar8, "host");
                        if (gsbVar != null) {
                            JSONObject jSONObject13 = new JSONObject();
                            try {
                                jSONObject13.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject13.put("id", orb.t(gsbVar.a));
                                    if (!orbVar7.equals(Unit.a)) {
                                        try {
                                            jSONObject13.put("result", orb.t(orbVar7));
                                        } catch (JSONException e37) {
                                            t3p.n(e37);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject13.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 13:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit9 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject14 = new JSONObject();
                            try {
                                jSONObject14.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject14.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit9, Unit.a)) {
                                        try {
                                            jSONObject14.put("result", orb.t(unit9));
                                        } catch (JSONException e40) {
                                            t3p.n(e40);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject14.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 14:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit10 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject15 = new JSONObject();
                            try {
                                jSONObject15.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject15.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit10, Unit.a)) {
                                        try {
                                            jSONObject15.put("result", orb.t(unit10));
                                        } catch (JSONException e43) {
                                            t3p.n(e43);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject15.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 15:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit11 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject16 = new JSONObject();
                            try {
                                jSONObject16.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject16.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit11, Unit.a)) {
                                        try {
                                            jSONObject16.put("result", orb.t(unit11));
                                        } catch (JSONException e46) {
                                            t3p.n(e46);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject16.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 16:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit12 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject17 = new JSONObject();
                            try {
                                jSONObject17.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject17.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit12, Unit.a)) {
                                        try {
                                            jSONObject17.put("result", orb.t(unit12));
                                        } catch (JSONException e49) {
                                            t3p.n(e49);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject17.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 17:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit13 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject18 = new JSONObject();
                            try {
                                jSONObject18.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject18.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit13, Unit.a)) {
                                        try {
                                            jSONObject18.put("result", orb.t(unit13));
                                        } catch (JSONException e52) {
                                            t3p.n(e52);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject18.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit14 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject19 = new JSONObject();
                            try {
                                jSONObject19.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject19.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit14, Unit.a)) {
                                        try {
                                            jSONObject19.put("result", orb.t(unit14));
                                        } catch (JSONException e55) {
                                            t3p.n(e55);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject19.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 19:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit15 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject20 = new JSONObject();
                            try {
                                jSONObject20.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject20.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit15, Unit.a)) {
                                        try {
                                            jSONObject20.put("result", orb.t(unit15));
                                        } catch (JSONException e58) {
                                            t3p.n(e58);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject20.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit16 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject21 = new JSONObject();
                            try {
                                jSONObject21.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject21.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit16, Unit.a)) {
                                        try {
                                            jSONObject21.put("result", orb.t(unit16));
                                        } catch (JSONException e61) {
                                            t3p.n(e61);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject21.toString());
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
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 21:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        orb orbVarA = ((ela) ((sw7) tw7Var).a).a();
                        orb orbVar9 = new orb();
                        orbVar9.p(orbVarA, Constants.Params.STATE);
                        if (gsbVar != null) {
                            JSONObject jSONObject22 = new JSONObject();
                            try {
                                jSONObject22.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject22.put("id", orb.t(gsbVar.a));
                                    if (!orbVar9.equals(Unit.a)) {
                                        try {
                                            jSONObject22.put("result", orb.t(orbVar9));
                                        } catch (JSONException e64) {
                                            t3p.n(e64);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject22.toString());
                                    break;
                                } catch (JSONException e65) {
                                    t3p.n(e65);
                                    return;
                                }
                            } catch (JSONException e66) {
                                t3p.n(e66);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case SizeUtil.textSize1 /* 22 */:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit17 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject23 = new JSONObject();
                            try {
                                jSONObject23.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject23.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit17, Unit.a)) {
                                        try {
                                            jSONObject23.put("result", orb.t(unit17));
                                        } catch (JSONException e67) {
                                            t3p.n(e67);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject23.toString());
                                    break;
                                } catch (JSONException e68) {
                                    t3p.n(e68);
                                    return;
                                }
                            } catch (JSONException e69) {
                                t3p.n(e69);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case 23:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        Unit unit18 = (Unit) ((sw7) tw7Var).a;
                        if (gsbVar != null) {
                            JSONObject jSONObject24 = new JSONObject();
                            try {
                                jSONObject24.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject24.put("id", orb.t(gsbVar.a));
                                    if (!Intrinsics.a(unit18, Unit.a)) {
                                        try {
                                            jSONObject24.put("result", orb.t(unit18));
                                        } catch (JSONException e70) {
                                            t3p.n(e70);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject24.toString());
                                    break;
                                } catch (JSONException e71) {
                                    t3p.n(e71);
                                    return;
                                }
                            } catch (JSONException e72) {
                                t3p.n(e72);
                                return;
                            }
                        }
                    }
                } else {
                    kfo.F(gsbVar, (eqb) ((rw7) tw7Var).a, zy9Var);
                    break;
                }
                break;
            case SizeUtil.textSize2 /* 24 */:
                a(tw7Var);
                break;
            case 25:
                b(tw7Var);
                break;
            case 26:
                c(tw7Var);
                break;
            case 27:
                d(tw7Var);
                break;
            case 28:
                e(tw7Var);
                break;
            default:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        List list = (List) ((sw7) tw7Var).a;
                        vpb vpbVar2 = new vpb();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            vpbVar2.a.put(((Number) it.next()).longValue());
                        }
                        orb orbVar10 = new orb();
                        orbVar10.p(vpbVar2, "chats");
                        if (gsbVar != null) {
                            JSONObject jSONObject25 = new JSONObject();
                            try {
                                jSONObject25.put("jsonrpc", orb.t("2.0"));
                                try {
                                    jSONObject25.put("id", orb.t(gsbVar.a));
                                    if (!orbVar10.equals(Unit.a)) {
                                        try {
                                            jSONObject25.put("result", orb.t(orbVar10));
                                        } catch (JSONException e73) {
                                            t3p.n(e73);
                                            return;
                                        }
                                    }
                                    ((ilm) zy9Var.a).run(jSONObject25.toString());
                                    break;
                                } catch (JSONException e74) {
                                    t3p.n(e74);
                                    return;
                                }
                            } catch (JSONException e75) {
                                t3p.n(e75);
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
