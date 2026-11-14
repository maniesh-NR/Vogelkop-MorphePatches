package defpackage;

import android.content.SharedPreferences;
import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._CacheControlCommonKt;
import okhttp3.internal._HeadersCommonKt;

/* loaded from: classes.dex */
public final /* synthetic */ class ha1 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ha1(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ ha1(Object obj, boolean z, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ ha1(boolean z, Function0 function0, Function0 function02, Function1 function1) {
        this.a = (byte) 4;
        this.b = z;
        this.c = function0;
        this.d = function02;
        this.e = function1;
    }

    public final Object invoke(Object obj) throws NumberFormatException {
        eg9 eg9Var;
        byte b = this.a;
        boolean z = false;
        z = false;
        z = false;
        boolean z2 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                j71 j71Var = (j71) obj3;
                kh3 kh3Var = (kh3) obj2;
                o3c o3cVar = (o3c) obj;
                o3cVar.a();
                uh4 uh4Var = o3cVar.a;
                if (!((Boolean) ((Function0) obj4).invoke()).booleanValue()) {
                    return Unit.a;
                }
                if (z2) {
                    long jW0 = uh4Var.w0();
                    d5o d5oVar = uh4Var.b;
                    long jD = d5oVar.D();
                    d5oVar.A().j();
                    try {
                        ((wth) d5oVar.a).N(-1.0f, 1.0f, jW0);
                        mk7.u0(o3cVar, j71Var, kh3Var);
                    } finally {
                        am2.w(d5oVar, jD);
                    }
                } else {
                    mk7.u0(o3cVar, j71Var, kh3Var);
                }
                return Unit.a;
            case 1:
                cd5 cd5Var = (cd5) obj4;
                h07 h07Var = (h07) obj3;
                dg9 dg9Var = (dg9) obj2;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    cd5Var.B0(th);
                } else {
                    r0i r0iVar = (r0i) h07Var.m();
                    if (gyg.G(3, "CXCP")) {
                        Objects.toString(r0iVar);
                    }
                    byte b2 = r0iVar.a;
                    if (b2 == 4) {
                        am2.z("Camera is not active.", cd5Var);
                    } else if (b2 == 2) {
                        cd5Var.j0(new eg9(false));
                    } else {
                        dg9Var.getClass();
                        byte b3 = r0iVar.a;
                        x61 x61Var = r0iVar.b;
                        if (b3 == 0) {
                            Integer num = x61Var != null ? (Integer) x61Var.c(CaptureResult.CONTROL_AF_STATE) : null;
                            if (z2) {
                                List list = v40.b;
                                ArrayList arrayList = dg9Var.m;
                                if (!(arrayList == null ? false : arrayList.contains(new v40(1))) || (x61Var != null && (num == null || num.intValue() == 4))) {
                                    z = true;
                                }
                            }
                            eg9Var = new eg9(z);
                        } else {
                            eg9Var = new eg9(false);
                        }
                        cd5Var.j0(eg9Var);
                    }
                }
                return Unit.a;
            case 2:
                qk0 qk0Var = (qk0) obj4;
                tk0 tk0Var = (tk0) obj3;
                sk0 sk0Var = (sk0) obj2;
                td0 td0Var = (td0) obj;
                td0Var.a.getClass();
                rk0 rk0Var = new rk0(2443, -1, 4);
                qd0 qd0Var = td0Var.b;
                List list2 = (List) qd0Var.n(27);
                ((list2 == null || list2.isEmpty()) ? new hf0(qd0Var, 27, vep.t(qd0Var, 27, 1)) : new hf0(qd0Var, 27, list2)).add(rk0Var);
                rk0Var.q(0, qk0Var == null ? 0 : 1, qk0Var);
                rk0Var.q(2, tk0Var != null ? 1 : 0, tk0Var);
                if (sk0Var != null) {
                    rk0Var.q(1, 1, sk0Var);
                }
                rk0Var.r(3, 1, z2);
                return Unit.a;
            case 3:
                vqi vqiVar = (vqi) obj4;
                iqi iqiVar = (iqi) obj3;
                s4f s4fVar = (s4f) obj2;
                jqi jqiVarB = vqiVar.c.b((jqi) obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                b59 b59Var = vqiVar.e.a;
                String string = ((SharedPreferences) b59Var.get()).getString("cache_control", null);
                e74 e74VarCommonParse = string != null ? _CacheControlCommonKt.commonParse(e74.n, _HeadersCommonKt.commonHeadersOf((String[]) Arrays.copyOf(new String[]{"Cache-Control", string}, 2))) : null;
                String string2 = ((SharedPreferences) b59Var.get()).getString("etag", null);
                eof eofVar = new eof((Object) vqiVar, (Object) s4fVar, (byte) 15);
                mni mniVar = new mni(s4fVar, (byte) 2);
                q2g q2gVar = new q2g(vqiVar, s4fVar, (byte) 29);
                if (e74VarCommonParse != null) {
                    boolean zA = Intrinsics.a(jqiVarB.a(), ((SharedPreferences) b59Var.get()).getString("cashed_request_hash", null));
                    long j = ((SharedPreferences) b59Var.get()).getLong("cache_control_time", 0L);
                    on7 on7Var = pn7.b;
                    pn7 pn7Var = new pn7(cs5.x0(e74VarCommonParse.c, un7.e));
                    pn7 pn7Var2 = new pn7(vqi.g);
                    if (pn7Var.compareTo(pn7Var2) > 0) {
                        pn7Var = pn7Var2;
                    }
                    long jF = pn7.f(pn7Var.a) + j;
                    if (z2) {
                        if (iqiVar == null) {
                            iqiVar = iqi.PULL_TO_REFRESH;
                        }
                        vqiVar.a(jqiVarB, iqiVar, string2, eofVar, mniVar, q2gVar);
                    } else {
                        e74 e74Var = e74VarCommonParse;
                        if (!zA) {
                            if (iqiVar == null) {
                                iqiVar = iqi.EXPIRED;
                            }
                            vqiVar.a(jqiVarB, iqiVar, string2, eofVar, mniVar, q2gVar);
                        } else if (jCurrentTimeMillis > jF) {
                            if (iqiVar == null) {
                                iqiVar = iqi.EXPIRED;
                            }
                            vqiVar.a(jqiVarB, iqiVar, string2, eofVar, mniVar, q2gVar);
                        } else if (e74Var.a) {
                            if (iqiVar == null) {
                                iqiVar = iqi.EXPIRED;
                            }
                            vqiVar.a(jqiVarB, iqiVar, string2, eofVar, mniVar, q2gVar);
                        }
                    }
                } else {
                    if (iqiVar == null) {
                        iqiVar = iqi.EMPTY;
                    }
                    vqiVar.a(jqiVarB, iqiVar, string2, eofVar, mniVar, q2gVar);
                }
                return Unit.a;
            default:
                return new pej(this.b, (Function0) obj4, (Function0) obj3, (qej) obj, (Function1) obj2);
        }
    }
}
