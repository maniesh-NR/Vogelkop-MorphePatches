package ads_mobile_sdk;

import androidx.core.app.NotificationCompat;
import defpackage.fsg;
import defpackage.ogb;
import defpackage.tip;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class df2 implements rko {
    public final a2 a;
    public final if2 b;
    public final qr0 c;
    public final ux2 d;
    public final s01 e;
    public final ah3 f;
    public final nx5 g;
    public final g0 h;

    public df2(a2 a2Var, if2 if2Var, qr0 qr0Var, ux2 ux2Var, s01 s01Var, ah3 ah3Var, nx5 nx5Var, g0 g0Var) {
        this.a = a2Var;
        this.b = if2Var;
        this.c = qr0Var;
        this.d = ux2Var;
        this.e = s01Var;
        this.f = ah3Var;
        this.g = nx5Var;
        this.h = g0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:20|(1:60)(2:24|(4:26|(2:28|(2:30|31))(1:32)|33|(4:39|(2:50|(1:52)(4:53|(1:55)|56|57))(4:41|(1:48)(1:47)|(0)|(0)(0))|93|94)(2:37|38))(2:58|59))|61|(1:66)(1:65)|97|67|(1:69)(1:70)) */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0134, code lost:
    
        r13 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.df2 r11, boolean r12, nt5 r13) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.df2.a(ads_mobile_sdk.df2, boolean, nt5):java.lang.Object");
    }

    public final Object a(mt5 mt5Var) {
        ub2 ub2VarE;
        String str;
        fo foVar = fo.a;
        lf2 lf2Var = this.a.v0;
        if (lf2Var == null) {
            return Unit.a;
        }
        String str2 = lf2Var.e;
        if (a()) {
            qr0 qr0Var = this.c;
            qr0Var.getClass();
            if (((Boolean) qr0Var.a("gads:hsdp_service_end_session:enabled", Boolean.FALSE, foVar)).booleanValue() && str2.length() > 0) {
                ux2 ux2Var = this.d;
                fw0 fw0Var = fw0.CUI_NAME_HSDP_SERVICE;
                l08 l08Var = l08.a;
                kh3 kh3Var = new kh3(new eq2(), new ih1(), new dt2(), new s8());
                if (hh3.b().a == null) {
                    wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3Var);
                    try {
                        try {
                            rg3 rg3Var = hh3.b().a;
                            ub2 ub2VarE2 = rg3Var != null ? rg3Var.e() : null;
                            if (ub2VarE2 != null) {
                                tip tipVarO = w01.o();
                                tipVarO.b(5);
                                ub2VarE2.I = (w01) tipVarO.a();
                            }
                            this.e.a(str2);
                        } catch (Throwable th) {
                            try {
                                wk2VarA.b(th);
                                if (th instanceof iyo) {
                                    throw th;
                                }
                                wk2VarA.a(th);
                                if (th instanceof kql) {
                                    throw new uw0((kql) th);
                                }
                                if (th instanceof CancellationException) {
                                    throw new ou0(th);
                                }
                                if (th instanceof mv0) {
                                    throw th;
                                }
                                throw new tu0(th);
                            } finally {
                            }
                        }
                    } catch (Exception e) {
                        rg3 rg3Var2 = hh3.b().a;
                        ub2VarE = rg3Var2 != null ? rg3Var2.e() : null;
                        if (ub2VarE != null) {
                            tip tipVarO2 = w01.o();
                            tipVarO2.b(5);
                            String message = e.getMessage();
                            str = message != null ? message : "";
                            tipVarO2.b$1();
                            ((w01) tipVarO2.b).b(str);
                            ub2VarE.I = (w01) tipVarO2.a();
                        }
                        rg3 rg3VarA = hh3.a();
                        rg3VarA.e().m = false;
                        rg3VarA.a(e);
                        qr0 qr0Var2 = this.c;
                        qr0Var2.getClass();
                        boolean zBooleanValue = ((Boolean) qr0Var2.a("gads:hsdp_unsampled_crash_reporting:enabled", Boolean.FALSE, foVar)).booleanValue();
                        ah3 ah3Var = this.f;
                        if (zBooleanValue) {
                            ah3Var.a("HsdpServiceUnsampled.endSession", e);
                        } else {
                            ah3Var.a("HsdpService.endSession", (Throwable) e);
                        }
                    }
                    wk2VarA.close();
                } else {
                    rg3 rg3VarA2 = hh3.a(fw0Var, l08Var, true);
                    try {
                        try {
                            rg3 rg3Var3 = hh3.b().a;
                            ub2 ub2VarE3 = rg3Var3 != null ? rg3Var3.e() : null;
                            if (ub2VarE3 != null) {
                                tip tipVarO3 = w01.o();
                                tipVarO3.b(5);
                                ub2VarE3.I = (w01) tipVarO3.a();
                            }
                            this.e.a(str2);
                        } catch (Throwable th2) {
                            try {
                                rg3VarA2.b(th2);
                                if (th2 instanceof iyo) {
                                    throw th2;
                                }
                                rg3VarA2.a(th2);
                                if (th2 instanceof kql) {
                                    throw new uw0((kql) th2);
                                }
                                if (th2 instanceof CancellationException) {
                                    throw new ou0(th2);
                                }
                                if (th2 instanceof mv0) {
                                    throw th2;
                                }
                                throw new tu0(th2);
                            } finally {
                            }
                        }
                    } catch (Exception e2) {
                        rg3 rg3Var4 = hh3.b().a;
                        ub2VarE = rg3Var4 != null ? rg3Var4.e() : null;
                        if (ub2VarE != null) {
                            tip tipVarO4 = w01.o();
                            tipVarO4.b(5);
                            String message2 = e2.getMessage();
                            str = message2 != null ? message2 : "";
                            tipVarO4.b$1();
                            ((w01) tipVarO4.b).b(str);
                            ub2VarE.I = (w01) tipVarO4.a();
                        }
                        rg3 rg3VarA3 = hh3.a();
                        rg3VarA3.e().m = false;
                        rg3VarA3.a(e2);
                        qr0 qr0Var3 = this.c;
                        qr0Var3.getClass();
                        boolean zBooleanValue2 = ((Boolean) qr0Var3.a("gads:hsdp_unsampled_crash_reporting:enabled", Boolean.FALSE, foVar)).booleanValue();
                        ah3 ah3Var2 = this.f;
                        if (zBooleanValue2) {
                            ah3Var2.a("HsdpServiceUnsampled.endSession", e2);
                        } else {
                            ah3Var2.a("HsdpService.endSession", (Throwable) e2);
                        }
                    }
                    rg3VarA2.close();
                }
            }
        }
        return Unit.a;
    }

    public final boolean a() {
        lf2 lf2Var;
        qr0 qr0Var = this.c;
        qr0Var.getClass();
        return ((Boolean) qr0Var.a("gads:hsdp_service:enabled", Boolean.FALSE, fo.a)).booleanValue() && (lf2Var = this.a.v0) != null && lf2Var.d;
    }

    public final boolean a(int i) {
        lf2 lf2Var = this.a.v0;
        return ((lf2Var != null ? lf2Var.f : 0) & i) != 0;
    }

    public final Object i(mt5 mt5Var) {
        lf2 lf2Var = this.a.v0;
        if (lf2Var == null) {
            return Unit.a;
        }
        byte b = 3;
        mt5 mt5Var2 = null;
        if (a()) {
            byte b2 = 1;
            if (!a(1)) {
                return Unit.a;
            }
            bf2 bf2Var = new bf2(this, a(2), mt5Var2, b2);
            defpackage.na2.B(this.g, h.a, null, new fsg(bf2Var, mt5Var2, b), 2);
            return Unit.a;
        }
        qr0 qr0Var = this.c;
        qr0Var.getClass();
        if (((Boolean) qr0Var.a("gads:play_prewarm:enabled", Boolean.TRUE, fo.a)).booleanValue() && lf2Var.a) {
            String str = lf2Var.b;
            if2 if2Var = this.b;
            defpackage.na2.B(if2Var.a, h.a, null, new fsg(new ogb(if2Var, str, null), mt5Var2, b), 2);
            Unit unit = Unit.a;
            px5 px5Var = px5.a;
            return unit;
        }
        return Unit.a;
    }

    public final Object q(mt5 mt5Var) {
        lf2 lf2Var = this.a.v0;
        if (lf2Var == null) {
            return Unit.a;
        }
        byte b = 3;
        mt5 mt5Var2 = null;
        if (a()) {
            if (!a(4)) {
                return Unit.a;
            }
            defpackage.na2.B(this.g, h.a, null, new fsg(new bf2(this, a(8), mt5Var2, (byte) 0), mt5Var2, b), 2);
            return Unit.a;
        }
        if (!a(NotificationCompat.FLAG_LOCAL_ONLY)) {
            return Unit.a;
        }
        String str = a(NotificationCompat.FLAG_GROUP_SUMMARY) ? lf2Var.b : "";
        if2 if2Var = this.b;
        defpackage.na2.B(if2Var.a, h.a, null, new fsg(new ogb(if2Var, str, null), mt5Var2, b), 2);
        Unit unit = Unit.a;
        px5 px5Var = px5.a;
        return unit;
    }
}
