package defpackage;

import ads_mobile_sdk.dt2;
import ads_mobile_sdk.eg1;
import ads_mobile_sdk.eq2;
import ads_mobile_sdk.fw0;
import ads_mobile_sdk.hh3;
import ads_mobile_sdk.ih1;
import ads_mobile_sdk.im3;
import ads_mobile_sdk.jp2;
import ads_mobile_sdk.kh3;
import ads_mobile_sdk.mv0;
import ads_mobile_sdk.on2;
import ads_mobile_sdk.ou0;
import ads_mobile_sdk.rg3;
import ads_mobile_sdk.s8;
import ads_mobile_sdk.tu0;
import ads_mobile_sdk.uw0;
import ads_mobile_sdk.ux2;
import ads_mobile_sdk.wk2;
import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import android.os.Trace;
import android.webkit.WebSettings;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class bd1 extends kuk implements Function1 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bd1(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(1, mt5Var);
        this.t = b;
        this.u = obj;
        this.v = obj2;
    }

    public final mt5 create(mt5 mt5Var) {
        byte b = this.t;
        Object obj = this.v;
        Object obj2 = this.u;
        switch (b) {
            case 0:
                return new bd1((cd1) obj2, obj, mt5Var, (byte) 0);
            case 1:
                return new bd1((CameraDevice) obj2, (lqh) obj, mt5Var, (byte) 1);
            case 2:
                return new bd1((dk4) obj2, (yj4) obj, mt5Var, (byte) 2);
            case 3:
                return new bd1((dk4) obj2, (pyl) obj, mt5Var, (byte) 3);
            case 4:
                return new bd1((on2) obj2, (pyl) obj, mt5Var, (byte) 4);
            case 5:
                return new bd1((im3) obj2, (nx5) obj, mt5Var, (byte) 5);
            case 6:
                return new bd1((jp2) obj2, (esg) obj, mt5Var, (byte) 6);
            case 7:
                return new bd1((on2) obj2, (s6h) obj, mt5Var, (byte) 7);
            default:
                return new bd1((String) obj2, (p5p) obj, mt5Var, (byte) 8);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.t;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (b) {
            case 0:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 1:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 2:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 3:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 4:
                return new bd1((on2) obj3, (pyl) obj2, (mt5) obj, (byte) 4).invokeSuspend(Unit.a);
            case 5:
                return new bd1((im3) obj3, (nx5) obj2, (mt5) obj, (byte) 5).invokeSuspend(Unit.a);
            case 6:
                return new bd1((jp2) obj3, (esg) obj2, (mt5) obj, (byte) 6).invokeSuspend(Unit.a);
            case 7:
                return new bd1((on2) obj3, (s6h) obj2, (mt5) obj, (byte) 7).invokeSuspend(Unit.a);
            default:
                return create((mt5) obj).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        String defaultUserAgent;
        byte b = 2;
        byte b2 = 0;
        byte b3 = 1;
        Locale locale = null;
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                cd1 cd1Var = (cd1) this.u;
                cd1Var.c();
                Object objB = cd1Var.b(this.v);
                cd1Var.c.b.setValue(objB);
                cd1Var.e.setValue(objB);
                return Unit.a;
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                CameraDevice cameraDevice = (CameraDevice) this.u;
                if (cameraDevice != null) {
                    cameraDevice.getId();
                    String str = "CXCP#CameraDevice-" + cameraDevice.getId() + "#close";
                    long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
                        Trace.beginSection(str);
                        try {
                            cameraDevice.close();
                        } catch (NullPointerException unused) {
                        }
                    } finally {
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(vep.o(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
                    }
                }
                ((lqh) this.v).a = true;
                return Unit.a;
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                StringBuilder sb = new StringBuilder();
                dk4 dk4Var = (dk4) this.u;
                sb.append(dk4Var);
                sb.append(" CameraCaptureSessionWrapper#close");
                String string = sb.toString();
                yj4 yj4Var = (yj4) this.v;
                try {
                    Trace.beginSection(string);
                    Objects.toString(dk4Var);
                    am2.y(yj4Var.a);
                    Trace.endSection();
                    return Unit.a;
                } finally {
                }
            case 3:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                StringBuilder sb2 = new StringBuilder();
                dk4 dk4Var2 = (dk4) this.u;
                sb2.append(dk4Var2);
                sb2.append(" stopRepeating");
                String string2 = sb2.toString();
                pyl pylVar = (pyl) this.v;
                try {
                    Trace.beginSection(string2);
                    sa4 sa4Var = (sa4) pylVar.c;
                    synchronized (sa4Var.k) {
                        sa4Var.toString();
                        ((ac4) sa4Var.e).l1();
                    }
                    Trace.endSection();
                    try {
                        Trace.beginSection(dk4Var2 + " abortCaptures");
                        pylVar.b();
                        Trace.endSection();
                        return Unit.a;
                    } finally {
                    }
                } finally {
                }
            case 4:
                px5 px5Var5 = px5.a;
                ybh.y(obj);
                ((on2) this.u).a(new eg1((pyl) this.v, b3));
                return Unit.a;
            case 5:
                px5 px5Var6 = px5.a;
                ybh.y(obj);
                try {
                    im3 im3Var = (im3) this.u;
                    ux2 ux2Var = im3Var.f;
                    if (ux2Var == null) {
                        ux2Var = null;
                    }
                    fw0 fw0Var = fw0.CUI_NAME_WEBVIEW_USER_AGENT;
                    l08 l08Var = l08.a;
                    kh3 kh3Var = new kh3(new eq2(), new ih1(), new dt2(), new s8());
                    if (hh3.b().a == null) {
                        wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3Var);
                        try {
                            defaultUserAgent = WebSettings.getDefaultUserAgent(im3Var.a);
                            wk2VarA.close();
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
                    } else {
                        rg3 rg3VarA = hh3.a(fw0Var, l08Var, true);
                        try {
                            defaultUserAgent = WebSettings.getDefaultUserAgent(im3Var.a);
                            rg3VarA.close();
                        } catch (Throwable th2) {
                            try {
                                rg3VarA.b(th2);
                                if (th2 instanceof iyo) {
                                    throw th2;
                                }
                                rg3VarA.a(th2);
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
                    }
                    ((im3) this.u).i.B0();
                    na2.B((nx5) this.v, h.a, null, new fsg(new k54((im3) this.u, defaultUserAgent, (mt5) null, (byte) 11), locale, (byte) 3), 2);
                    return defaultUserAgent;
                } catch (Throwable th3) {
                    ((im3) this.u).i.B0();
                    throw th3;
                }
            case 6:
                px5 px5Var7 = px5.a;
                ybh.y(obj);
                ((jp2) this.u).a(new eg1((esg) this.v, b));
                return Unit.a;
            case 7:
                px5 px5Var8 = px5.a;
                ybh.y(obj);
                ((on2) this.u).a(new eg1((s6h) this.v, b2));
                return Unit.a;
            default:
                px5 px5Var9 = px5.a;
                ybh.y(obj);
                dap dapVar = dap.a;
                String str2 = (String) dap.d((String) this.u, new cno((p5p) this.v, (byte) 10), (Function1) null, cdp.Jq).b;
                zyk zykVar = aap.a;
                rpb rpbVarD = fcp.d();
                rpbVarD.getClass();
                return new Pair(str2, (z8p) rpbVarD.a(str2, z8p.Companion.serializer()));
        }
    }
}
