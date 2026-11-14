package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Handler;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.opera.api.Callback;
import java.io.File;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class ai implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ai(iy1 iy1Var, File file, Callback callback, String str, ux1 ux1Var) {
        this.a = (byte) 3;
        this.b = iy1Var;
        this.c = file;
        this.e = callback;
        this.d = str;
        this.f = ux1Var;
    }

    public /* synthetic */ ai(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ ai(String str, String str2, String str3, String str4, Long l) {
        this.a = (byte) 5;
        this.d = str;
        this.b = str2;
        this.c = str3;
        this.e = str4;
        this.f = l;
    }

    public /* synthetic */ ai(sfo sfoVar, String str, String str2, String str3, String str4) {
        this.a = (byte) 8;
        this.b = sfoVar;
        this.d = str;
        this.c = str2;
        this.e = str3;
        this.f = str4;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 2;
        boolean z = true;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.d;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                uh uhVar = (uh) obj6;
                uhVar.a = ((zh) obj4).c((String) obj5, (sh) obj3, new bi((afe) obj2, (byte) 0));
                break;
            case 1:
                hbc hbcVar = (hbc) obj;
                hac hacVar = ((t71) obj4).a;
                hbcVar.h = (mil) obj6;
                hbcVar.i = (k0b) obj5;
                hbcVar.c = (tmi) obj3;
                hbcVar.d = (lw5) obj2;
                hbcVar.e = hacVar != null ? hacVar.p : null;
                hbcVar.f = hacVar != null ? hacVar.q : null;
                hbcVar.g = hacVar != null ? (u5n) z4o.N(hacVar, mi5.t) : null;
                break;
            case 2:
                Callback callback = (Callback) obj6;
                tcc tccVar = (tcc) obj4;
                j4c j4cVar = (j4c) obj5;
                jg8 jg8Var = (jg8) obj3;
                d12 d12Var = (d12) obj2;
                String str = (String) obj;
                if (str != null) {
                    callback.run(new z92(str));
                } else {
                    ArrayList arrayList = ox1.a;
                    boolean zIsEmpty = arrayList.isEmpty();
                    arrayList.add(new Pair(callback, cqp.V(tccVar)));
                    if (zIsEmpty) {
                        na2.B((nx5) j4cVar.get(), null, null, new s3((Object) new ab(new ab(d12Var, (byte) 9), (byte) 10), (Object) jg8Var, (mt5) u5nVar, b2), 3);
                    }
                }
                break;
            case 3:
                iy1 iy1Var = (iy1) obj6;
                File file = (File) obj4;
                Callback callback2 = (Callback) obj3;
                String str2 = (String) obj5;
                ux1 ux1Var = (ux1) obj2;
                if (t0i.d(((t0i) obj).a) == null) {
                    iy1Var.d.a(file, new ay1(callback2, iy1Var, file, str2, ux1Var, (byte) 0));
                    break;
                } else {
                    iy1Var.h.o(2132019200);
                    break;
                }
            case 4:
                sae saeVar = (sae) obj6;
                pqh pqhVar = (pqh) obj4;
                mqh mqhVar = (mqh) obj5;
                spi spiVar = (spi) obj3;
                lqh lqhVar = (lqh) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                oae oaeVarJ = sae.j(saeVar.g);
                if (oaeVarJ != null) {
                    pad padVar = (pad) ((zm9) saeVar).e;
                    long j = oaeVarJ.b;
                    long j2 = oaeVarJ.a;
                    ((k1n) padVar.b).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
                    ((k1n) padVar.c).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
                    oae oaeVarA = ((oae) pqhVar.a).a(oaeVarJ);
                    pqhVar.a = oaeVarA;
                    mqhVar.a = spiVar.j(spiVar.f(oaeVarA.a));
                    lqhVar.a = !p37.T(r0 - fFloatValue);
                } else {
                    z = false;
                }
                break;
            case 5:
                String str3 = (String) obj6;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                Long l = (Long) obj2;
                hn0 hn0Var = ((jn0) ((ak0) obj).e.getValue()).a;
                hn0Var.x(0, (String) obj5);
                if (str3 != null) {
                    hn0Var.x(1, str3);
                }
                if (str4 != null) {
                    hn0Var.x(2, str4);
                }
                if (str5 != null) {
                    hn0Var.x(3, str5);
                }
                if (l != null && l.longValue() > 0) {
                    hn0Var.p(4, 1, l.longValue());
                }
                hn0Var.x(5, "armeabi-v7a");
                break;
            case 6:
                qjh qjhVar = (qjh) obj6;
                k8 k8Var = (k8) obj4;
                mcj mcjVar = (a2i) obj5;
                oop oopVar = (z1i) obj3;
                Callback callback3 = (Callback) obj2;
                vjh vjhVar = (vjh) obj;
                ujh ujhVar = vjhVar.a;
                Integer num = vjhVar.b;
                if (ujhVar == ujh.a) {
                    k8Var.i0((qim) qjhVar.b.get(), new yo7(callback3, vjhVar, qjhVar, (byte) 27));
                } else if (ujhVar == ujh.b) {
                    callback3.run(new pjh((ee0) null, eo0.d, (String) null, num));
                    if (mcjVar != null && oopVar != null) {
                        Activity activity = qjhVar.a;
                        mcj mcjVar2 = mcjVar;
                        oop oopVar2 = oopVar;
                        if (oopVar2.b) {
                            Tasks.forResult((Object) null);
                        } else {
                            Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
                            intent.putExtra("confirmation_intent", oopVar2.a);
                            intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            intent.putExtra("result_receiver", new khd((Handler) mcjVar2.b, taskCompletionSource));
                            activity.startActivity(intent);
                            taskCompletionSource.getTask();
                        }
                    }
                } else {
                    callback3.run(new pjh((ee0) null, eo0.e, (String) null, num));
                }
                break;
            case 7:
                i9f i9fVar = (i9f) obj4;
                mil milVar = (mil) obj5;
                gbc gbcVar = (gbc) obj3;
                nvj nvjVar = (nvj) obj2;
                o3c o3cVar = (o3c) obj;
                o3cVar.a();
                uh4 uh4Var = o3cVar.a;
                float fH = ((p46) obj6).c.h();
                if (fH != 0.0f) {
                    long j3 = milVar.b;
                    int i = xjl.c;
                    int i2 = i9fVar.i((int) (j3 >> 32));
                    ojl ojlVarD = gbcVar.d();
                    voh vohVarC = ojlVarD != null ? ojlVarD.a.c(i2) : new voh(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(o3cVar.o0(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = vohVarC.a + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (uh4Var.e() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long jFloatToRawIntBits = (Float.floatToRawIntBits(fFloor2) << 32) | (Float.floatToRawIntBits(vohVarC.b) & 4294967295L);
                    long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fFloor2) << 32) | (Float.floatToRawIntBits(vohVarC.d) & 4294967295L);
                    sh4 sh4Var = uh4Var.a.c;
                    zg zgVarD = uh4Var.d;
                    if (zgVarD == null) {
                        zgVarD = na2.d();
                        zgVarD.K(1);
                        uh4Var.d = zgVarD;
                    }
                    Paint paint = (Paint) zgVarD.b;
                    nvjVar.a(fH, uh4Var.e(), zgVarD);
                    if (!Intrinsics.a((kh3) zgVarD.d, null)) {
                        zgVarD.E(null);
                    }
                    if (zgVarD.a != 3) {
                        zgVarD.C(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        zgVarD.J(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (zgVarD.s() != 0) {
                        zgVarD.H(0);
                    }
                    if (zgVarD.t() != 0) {
                        zgVarD.I(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        zgVarD.F(1);
                    }
                    sh4Var.s(jFloatToRawIntBits, jFloatToRawIntBits2, zgVarD);
                }
                break;
            default:
                String str6 = (String) obj5;
                String str7 = (String) obj4;
                String str8 = (String) obj3;
                String str9 = (String) obj2;
                spa spaVar = (spa) obj;
                apa apaVar = apa.b;
                spaVar.b = z4o.i0("GET");
                z1m.s(((sfo) obj6).a, "odds/config", spaVar.a);
                if (str6 != null) {
                    ynh.g(spaVar, "product", str6);
                }
                if (str7 != null) {
                    ynh.g(spaVar, "geoip-country-code", str7);
                }
                if (str8 != null) {
                    ynh.g(spaVar, "user_id", str8);
                }
                if (str9 != null) {
                    ynh.g(spaVar, "ad_position", str9);
                }
                break;
        }
        return Unit.a;
    }
}
