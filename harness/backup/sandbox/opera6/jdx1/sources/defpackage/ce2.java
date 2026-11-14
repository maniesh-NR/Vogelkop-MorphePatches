package defpackage;

import ads_mobile_sdk.a;
import ads_mobile_sdk.bm0;
import ads_mobile_sdk.fl0;
import ads_mobile_sdk.km3;
import ads_mobile_sdk.l7;
import ads_mobile_sdk.mk;
import ads_mobile_sdk.mm0;
import ads_mobile_sdk.qg;
import ads_mobile_sdk.rp1;
import ads_mobile_sdk.th3;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.AssetFileDescriptor;
import android.os.Binder;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewPageBoundaryInterface;

/* loaded from: classes.dex */
public final /* synthetic */ class ce2 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ce2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00ff: INVOKE (r4 I:iao) VIRTUAL call: iao.a():void A[Catch: all -> 0x0103, MD:():void (m), TRY_ENTER], block:B:68:0x00ff */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        iao iaoVarA;
        Object objApply;
        Object objA;
        byte b = this.a;
        Object objA2 = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                fe2 fe2Var = (fe2) obj;
                fe2Var.d.set(true);
                try {
                    objA2 = fe2Var.a();
                    Binder.flushPendingCommands();
                    return objA2;
                } catch (Throwable th) {
                    try {
                        fe2Var.c.set(true);
                        throw th;
                    } finally {
                        Object obj2 = PostTask.a;
                        ThreadUtils.c(new xa(fe2Var, objA2, (byte) 21));
                    }
                }
            case 1:
                Context context = (Context) obj;
                File file = new File(new File(context.getApplicationInfo().dataDir, "opera"), "etc");
                return file.isDirectory() ? file.getAbsolutePath() : new File(context.getFilesDir(), "ds").getAbsolutePath();
            case 2:
                WorkDatabase workDatabase = ((rua) obj).a;
                Long lT = workDatabase.y().t("next_alarm_manager_id");
                int iLongValue = lT != null ? (int) lT.longValue() : 0;
                workDatabase.y().w(new dsg("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            case 3:
                return new ymb((JsReplyProxyBoundaryInterface) obj);
            case 4:
                return new l3d((p2d) obj);
            case 5:
                kke kkeVar = new kke();
                kkeVar.a = (WebViewNavigationBoundaryInterface) obj;
                return kkeVar;
            case 6:
                return new dwf((WebViewPageBoundaryInterface) obj);
            case 7:
                return (AssetFileDescriptor) obj;
            case 8:
                bm0 bm0Var = (bm0) obj;
                ((a) bm0Var.c.get()).a();
                rp1 rp1Var = (rp1) bm0Var.b.get();
                synchronized (rp1Var) {
                    try {
                        th3 th3Var = rp1Var.e;
                        iao iaoVar = new iao(fl0.EVENT_ID_FALLBACK_INIT_METHOD_PROVIDER, th3Var.b, th3Var.a);
                        try {
                            iaoVar.b();
                            rp1Var.a();
                            rp1Var.c();
                            rp1Var.d();
                            rp1Var.j = true;
                        } catch (a9p e) {
                            iaoVar.a(e);
                        } catch (Throwable th2) {
                            iaoVar.a(th2);
                            throw th2;
                        }
                        iaoVar.a();
                    } catch (Throwable th3) {
                        iaoVarA.a();
                        throw th3;
                    }
                }
                return null;
            case 9:
                return (mk) ((kap) obj).get();
            case 10:
                return ((m2p) obj).a.getUrl();
            case 11:
                km3 km3Var = (km3) obj;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                km3Var.a.registerReceiver(km3Var, intentFilter);
                return null;
            case 12:
                mm0 mm0Var = (mm0) obj;
                synchronized (mm0Var) {
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(mm0Var.a);
                            try {
                                objA = mm0Var.c.a(fileInputStream);
                                fileInputStream.close();
                            } catch (Throwable th4) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                                throw th4;
                            }
                        } catch (FileNotFoundException unused) {
                            objApply = mm0Var.c.a();
                            return objApply;
                        }
                    } catch (IOException e2) {
                        objApply = mm0Var.d.apply(new u7p(e2));
                        return objApply;
                    } catch (u7p e3) {
                        objApply = mm0Var.d.apply(e3);
                        return objApply;
                    }
                }
                return objA;
            default:
                qg qgVar = (qg) obj;
                qw8 qw8Var = new qw8(qgVar, (byte) 6);
                synchronized (qgVar) {
                    th3 th3Var2 = qgVar.b;
                    fl0 fl0Var = fl0.EVENT_ID_INIT_APP_INFO_TRACKER;
                    Context context2 = qgVar.a;
                    l7 l7Var = qgVar.c;
                    l94 l94Var = new l94();
                    l94Var.c = new byh();
                    o94 o94Var = new o94(l94Var);
                    l94Var.b = o94Var;
                    l94Var.a = vep.class;
                    try {
                        qg.a(context2, l7Var, l94Var);
                        l94Var.a = "";
                    } catch (Exception e4) {
                        o94Var.a(e4);
                    }
                    f7 f7VarI = g7.i(o94Var, qw8Var, qgVar.d);
                    th3Var2.a(fl0Var, (ef9) f7VarI);
                    qgVar.f = f7VarI;
                }
                return "";
        }
    }
}
