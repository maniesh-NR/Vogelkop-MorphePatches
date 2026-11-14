package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.os.Trace;
import android.view.View;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzp;
import com.google.android.gms.internal.play_billing.zzr;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Pair;
import kotlin.coroutines.e;

/* loaded from: classes.dex */
public final class lq3 implements la, m7h, sog, zzr {
    public final /* synthetic */ byte a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public lq3(Uri uri, int i) {
        this.a = (byte) 2;
        this.b = i;
        this.c = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lq3(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public lq3(mq7 mq7Var, byte b) {
        this.a = (byte) 5;
        this.c = mq7Var;
        this.b = b;
    }

    public final tog b(tog togVar) {
        if (togVar instanceof fin) {
            return togVar;
        }
        fin finVar = new fin();
        finVar.a = null;
        nq7 nq7Var = (mq7) this.c;
        BigInteger bigInteger = xql.a;
        nq7 nq7VarL = nq7Var.l();
        cq7 cq7Var = nq7Var.a;
        nq7 nq7Var2 = (mq7) nq7VarL;
        byte[][] bArr = this.b == 0 ? xql.d : xql.f;
        int length = (bArr.length + 1) >>> 1;
        mq7[] mq7VarArr = new mq7[length];
        mq7VarArr[0] = nq7Var;
        int length2 = bArr.length;
        for (int i = 3; i < length2; i += 2) {
            int i2 = i >>> 1;
            byte[] bArr2 = bArr[i];
            mq7 mq7VarC = (mq7) cq7Var.m();
            int i3 = 0;
            for (int length3 = bArr2.length - 1; length3 >= 0; length3--) {
                i3++;
                byte b = bArr2[length3];
                if (b != 0) {
                    mq7VarC = (mq7) mq7VarC.C(i3).a(b > 0 ? nq7Var : nq7Var2);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                mq7VarC = mq7VarC.C(i3);
            }
            mq7VarArr[i2] = mq7VarC;
        }
        cq7Var.getClass();
        cq7Var.o(mq7VarArr, 0, length, (xf8) null);
        finVar.a = mq7VarArr;
        return finVar;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [kb1] */
    /* JADX WARN: Type inference failed for: r6v7, types: [kb1] */
    /* JADX WARN: Type inference failed for: r6v9, types: [kb1] */
    public final Object get() {
        ia6 ia6Var = (ia6) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new ve4((unb) ((m7h) ia6Var.d).get());
            case 1:
                return o0g.e();
            case 2:
                return new xc4((mb4) ((m7h) ia6Var.v).get());
            case 3:
                me4 me4Var = (me4) ((ole) ia6Var.a).a;
                lq3 lq3Var = (lq3) ia6Var.A;
                Context contextA = ia6Var.a();
                hnl hnlVar = (hnl) ((m7h) ia6Var.f).get();
                ve4 ve4Var = (ve4) ((m7h) ia6Var.e).get();
                Map map = me4Var.d.a;
                try {
                    Trace.beginSection("Initialize defaultCameraBackend");
                    t94 t94Var = (t94) lq3Var.get();
                    Trace.endSection();
                    if (map.containsKey(new kb4("CXCP-Camera2"))) {
                        kp5.b(kb4.a("CXCP-Camera2"), ". Use CameraBackendConfig#internalBackend field instead.", "CameraBackendConfig#cameraBackends should not contain a backend with ");
                        return null;
                    }
                    Map mapF = rbd.f(map, new Pair(new kb4("CXCP-Camera2"), new we4(t94Var)));
                    if (mapF.containsKey(new kb4("CXCP-Camera2"))) {
                        return new mb4("CXCP-Camera2", mapF, contextA, hnlVar, ve4Var);
                    }
                    StringBuilder sb = new StringBuilder("Failed to find ");
                    sb.append((Object) kb4.a("CXCP-Camera2"));
                    t14.h(sb, " in the list of available CameraPipe backends! Available values are ", mapF.keySet());
                    return null;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 4:
                return new t94((hnl) ((m7h) ia6Var.f).get(), (za4) ((m7h) ia6Var.k).get(), (fb4) ((m7h) ia6Var.n).get(), (q8h) ((m7h) ia6Var.u).get(), new ga6(ia6Var, (byte) 0), ia6Var.a());
            case 5:
                mhk mhkVar = (mhk) ia6Var.b;
                ve4 ve4Var2 = (ve4) ((m7h) ia6Var.e).get();
                unb unbVar = (unb) ((m7h) ia6Var.d).get();
                ArrayList arrayList = new ArrayList();
                ThreadFactory threadFactory = mb1.b;
                final lb1 lb1Var = new lb1(threadFactory, "CXCP-IO-", c26.j(0));
                final int i = -1;
                ScheduledExecutorService scheduledExecutorServiceA = mb1.a((kb1) new ThreadFactory() { // from class: kb1
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        int i2;
                        int i3;
                        int i4 = 0;
                        while (true) {
                            i2 = i;
                            i3 = 10;
                            if (i4 >= 10) {
                                break;
                            }
                            if (i2 >= mb1.a[i4]) {
                                i3 = i4 + 1;
                                break;
                            }
                            i4++;
                        }
                        Thread threadNewThread = lb1Var.newThread(new br(i2, runnable, (byte) 1));
                        threadNewThread.setPriority(i3);
                        return threadNewThread;
                    }
                }, 8);
                arrayList.add(scheduledExecutorServiceA);
                dx5 dx5VarI = fr3.I(scheduledExecutorServiceA);
                final lb1 lb1Var2 = new lb1(threadFactory, "CXCP-BG-", c26.j(0));
                ScheduledExecutorService scheduledExecutorServiceA2 = mb1.a((kb1) new ThreadFactory() { // from class: kb1
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        int i2;
                        int i3;
                        int i4 = 0;
                        while (true) {
                            i2 = i;
                            i3 = 10;
                            if (i4 >= 10) {
                                break;
                            }
                            if (i2 >= mb1.a[i4]) {
                                i3 = i4 + 1;
                                break;
                            }
                            i4++;
                        }
                        Thread threadNewThread = lb1Var2.newThread(new br(i2, runnable, (byte) 1));
                        threadNewThread.setPriority(i3);
                        return threadNewThread;
                    }
                }, 4);
                arrayList.add(scheduledExecutorServiceA2);
                dx5 dx5VarI2 = fr3.I(scheduledExecutorServiceA2);
                final lb1 lb1Var3 = new lb1(threadFactory, "CXCP-", c26.j(0));
                final int i2 = -3;
                ScheduledExecutorService scheduledExecutorServiceA3 = mb1.a((kb1) new ThreadFactory() { // from class: kb1
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        int i22;
                        int i3;
                        int i4 = 0;
                        while (true) {
                            i22 = i2;
                            i3 = 10;
                            if (i4 >= 10) {
                                break;
                            }
                            if (i22 >= mb1.a[i4]) {
                                i3 = i4 + 1;
                                break;
                            }
                            i4++;
                        }
                        Thread threadNewThread = lb1Var3.newThread(new br(i22, runnable, (byte) 1));
                        threadNewThread.setPriority(i3);
                        return threadNewThread;
                    }
                }, mhkVar.b);
                arrayList.add(scheduledExecutorServiceA3);
                dx5 dx5VarI3 = fr3.I(scheduledExecutorServiceA3);
                ve4Var2.a(te4.c, new bw6(arrayList, (byte) 3));
                p7l p7lVar = new p7l(mhkVar, ve4Var2);
                eek eekVar = new eek(mhkVar, ve4Var2, (byte) 17);
                pqh pqhVar = new pqh();
                pqh pqhVar2 = new pqh();
                pqhVar.a = sgb.b(e.a(new csk(unbVar), dx5VarI3).plus(new jx5("CXCP")));
                pqhVar2.a = sgb.b(e.a(new csk(unbVar), new jx5("CXCP-Dispatch")));
                ve4Var2.a(te4.b, new jri(pqhVar, pqhVar2, (byte) 25));
                return new hnl((nx5) pqhVar.a, (nx5) pqhVar2.a, scheduledExecutorServiceA, dx5VarI, scheduledExecutorServiceA2, dx5VarI2, scheduledExecutorServiceA3, dx5VarI3, p7lVar, eekVar);
            case 6:
                return new za4((m7h) ia6Var.g, (hnl) ((m7h) ia6Var.f).get(), ia6Var.a(), (PackageManager) ((m7h) ia6Var.h).get(), (db4) ((m7h) ia6Var.i).get(), (m7h) ia6Var.j, (ve4) ((m7h) ia6Var.e).get(), (unb) ((m7h) ia6Var.d).get());
            case 7:
                CameraManager cameraManager = (CameraManager) ia6Var.a().getSystemService("camera");
                alo.l(cameraManager);
                return cameraManager;
            case 8:
                PackageManager packageManager = ia6Var.a().getPackageManager();
                alo.l(packageManager);
                return packageManager;
            case 9:
                return new db4();
            case 10:
                return new vc4(ia6Var.a());
            case 11:
                return new fb4(ia6Var.a(), (hnl) ((m7h) ia6Var.f).get(), (mag) ((m7h) ia6Var.l).get(), ((me4) ((ole) ia6Var.a).a).c, (h0l) ((m7h) ia6Var.m).get());
            case 12:
                return new mag(ia6Var.a());
            case 13:
                return new h0l();
            case 14:
                return new q8h((k1i) ((m7h) ia6Var.s).get(), (ab4) ((m7h) ia6Var.t).get(), (db4) ((m7h) ia6Var.i).get(), (hnl) ((m7h) ia6Var.f).get());
            case 15:
                m7h m7hVar = (m7h) ia6Var.g;
                ole oleVar = (ole) ia6Var.a;
                c5o c5oVar = new c5o(m7hVar, (hnl) ((m7h) ia6Var.f).get());
                gb4 gb4Var = (gb4) ((m7h) ia6Var.n).get();
                db4 db4Var = (db4) ((m7h) ia6Var.i).get();
                hb4 hb4Var = (hb4) ((m7h) ia6Var.p).get();
                h0l h0lVar = (h0l) ((m7h) ia6Var.m).get();
                le4 le4Var = ((me4) oleVar.a).e;
                hnl hnlVar2 = (hnl) ((m7h) ia6Var.f).get();
                p12 p12Var = new p12();
                p12Var.a = c5oVar;
                p12Var.b = gb4Var;
                p12Var.c = db4Var;
                p12Var.d = hb4Var;
                p12Var.e = h0lVar;
                p12Var.f = le4Var;
                p12Var.g = hnlVar2;
                p12Var.h = new cd5();
                return new k1i(p12Var, (db4) ((m7h) ia6Var.i).get(), new s9i((m7h) ia6Var.g, (hnl) ((m7h) ia6Var.f).get(), (unb) ((m7h) ia6Var.d).get()), (h0l) ((m7h) ia6Var.m).get(), (c51) ((m7h) ia6Var.q).get(), (hh2) ((m7h) ia6Var.r).get(), ((me4) oleVar.a).e, (hnl) ((m7h) ia6Var.f).get());
            case 16:
                return new hb4((gb4) ((m7h) ia6Var.n).get(), (sgk) ((m7h) ia6Var.o).get());
            case 17:
                Object obj = ia6Var.a;
                return new sgk();
            case 18:
                return new c51((DevicePolicyManager) ia6Var.a().getSystemService("device_policy"));
            case 19:
                return new hh2((hnl) ((m7h) ia6Var.f).get(), (ve4) ((m7h) ia6Var.e).get(), (unb) ((m7h) ia6Var.d).get());
            case 20:
                return new ab4((hnl) ((m7h) ia6Var.f).get(), (hb4) ((m7h) ia6Var.p).get(), (k1i) ((m7h) ia6Var.s).get());
            case 21:
                Context contextA2 = ia6Var.a();
                return new xe4(contextA2);
            case 22:
                return new gg4();
            case 23:
                return new qj5();
            default:
                throw new AssertionError((int) b);
        }
    }

    @Override // defpackage.la
    public final boolean k(View view) {
        byte b = this.a;
        byte b2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((BottomSheetBehavior) obj).M(b2);
                break;
            default:
                ((OperaBottomSheetBehavior) obj).I(b2);
                break;
        }
        return true;
    }

    public final Object zza(zzp zzpVar) {
        mrp mrpVar = (mrp) this.c;
        byte b = this.b;
        try {
            if (mrpVar.I == null) {
                throw null;
            }
            mrpVar.I.zza(mrpVar.G.getPackageName(), b != 2 ? b != 3 ? b != 4 ? b != 5 ? b != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW", new lrp(zzpVar));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e) {
            mrpVar.G(28, xrp.q, zzjn.zzaQ);
            zzc.zzp("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            zzpVar.zzb(0);
            return "billingOverrideService.getBillingOverride";
        }
    }
}
