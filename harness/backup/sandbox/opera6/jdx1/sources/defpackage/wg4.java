package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class wg4 {
    public static final Object s = new Object();
    public static final SparseArray t = new SparseArray();
    public final yg4 c;
    public final Executor d;
    public final Handler e;
    public final HandlerThread f;
    public tah g;
    public eg4 h;
    public rg4 i;
    public ivg j;
    public i3j k;
    public final i1i l;
    public final o94 m;
    public final cf4 n;
    public final zyk o;
    public int p;
    public final Integer r;
    public final hf4 a = new hf4();
    public final Object b = new Object();
    public ListenableFuture q = q0b.c;

    public wg4(Context context, zcc zccVar) {
        ComponentCallbacks2 componentCallbacks2;
        String string;
        xg4 xg4Var;
        Bundle bundle;
        i1i nqlVar;
        o94 o94VarZ;
        this.p = 1;
        Context contextA = gt5.a(context);
        Context applicationContext = context.getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                componentCallbacks2 = null;
                break;
            } else {
                if (applicationContext instanceof Application) {
                    componentCallbacks2 = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (componentCallbacks2 instanceof xg4) {
            xg4Var = (xg4) componentCallbacks2;
        } else {
            try {
                Context contextA2 = gt5.a(context);
                Bundle bundle2 = contextA2.getPackageManager().getServiceInfo(new ComponentName(contextA2, (Class<?>) MetadataHolderService.class), 640).metaData;
                string = bundle2 != null ? bundle2.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
            }
            xg4Var = string != null ? (xg4) Class.forName(string).getDeclaredConstructor(null).newInstance(null) : null;
        }
        if (xg4Var == null) {
            qp2.n("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            throw null;
        }
        yg4 cameraXConfig = xg4Var.getCameraXConfig();
        this.c = cameraXConfig;
        ugh ughVarF = (ugh) cameraXConfig.a.b(yg4.k, null);
        if (ughVarF != null) {
            ughVarF.toString();
        } else {
            try {
                bundle = contextA.getPackageManager().getServiceInfo(new ComponentName(contextA, (Class<?>) wgh.class), 640).metaData;
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            ughVarF = bundle != null ? xgh.f(contextA, bundle) : null;
            Objects.toString(ughVarF);
        }
        if (ughVarF == null) {
            ughVarF = vgh.b;
            Objects.toString(ughVarF);
        }
        vgh.c.a.o(ughVarF);
        Executor bd4Var = (Executor) cameraXConfig.a.b(yg4.e, null);
        Handler handlerCreateAsync = (Handler) cameraXConfig.a.b(yg4.f, null);
        bd4Var = bd4Var == null ? new bd4() : bd4Var;
        this.d = bd4Var;
        if (handlerCreateAsync == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f = handlerThread;
            handlerThread.start();
            handlerCreateAsync = Handler.createAsync(handlerThread.getLooper());
            this.e = handlerCreateAsync;
        } else {
            this.f = null;
            this.e = handlerCreateAsync;
        }
        Integer num = (Integer) cameraXConfig.b(yg4.g, null);
        this.r = num;
        synchronized (s) {
            if (num != null) {
                jpo.k(num.intValue(), 3, 6, "minLogLevel");
                SparseArray sparseArray = t;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? ((Integer) sparseArray.get(num.intValue())).intValue() + 1 : 1));
                b();
            }
        }
        i1i i1iVar = (i1i) cameraXConfig.a.b(yg4.j, i1i.a);
        Objects.requireNonNull(i1iVar);
        long jA = i1iVar.a();
        if (i1iVar instanceof ff4) {
            switch (((ff4) i1iVar).b) {
                case 0:
                    nqlVar = new ff4(jA, (byte) 0);
                    break;
                default:
                    nqlVar = new ff4(jA, (byte) 1);
                    break;
            }
        } else {
            nqlVar = new nql(jA, i1iVar);
        }
        this.l = nqlVar;
        this.n = new cf4(bd4Var, new g7a(handlerCreateAsync));
        this.o = z4c.b(new vg4(contextA, (byte) 0));
        synchronized (this.b) {
            jpo.n("CameraX.initInternal() should only be called once per instance", this.p == 1);
            this.p = 2;
            o94VarZ = k1g.z(new xj(this, contextA, (byte) 24));
        }
        this.m = o94VarZ;
    }

    public static void a(Integer num) {
        synchronized (s) {
            if (num == null) {
                return;
            }
            SparseArray sparseArray = t;
            int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
            if (iIntValue == 0) {
                sparseArray.remove(num.intValue());
            } else {
                sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
            }
            b();
        }
    }

    public static void b() {
        SparseArray sparseArray = t;
        if (sparseArray.size() == 0) {
            gyg.k = (byte) 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            gyg.k = (byte) 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            gyg.k = (byte) 4;
        } else if (sparseArray.get(5) != null) {
            gyg.k = (byte) 5;
        } else if (sparseArray.get(6) != null) {
            gyg.k = (byte) 6;
        }
    }
}
