package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class i31 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v31 b;

    public /* synthetic */ i31(v31 v31Var, byte b) {
        this.a = b;
        this.b = v31Var;
    }

    public final Object invoke() {
        byte b = this.a;
        int i = 0;
        v31 v31Var = this.b;
        switch (b) {
            case 0:
                nc1 nc1Var = v31Var.M;
                if (nc1Var != null) {
                    int childCount = nc1Var.getChildCount();
                    while (i < childCount) {
                        View childAt = nc1Var.getChildAt(i);
                        c6n c6nVar = childAt instanceof c6n ? (c6n) childAt : null;
                        if (c6nVar != null && c6nVar.isLayoutRequested()) {
                            c6nVar.layout(c6nVar.getLeft(), c6nVar.getTop(), c6nVar.getRight(), c6nVar.getBottom());
                        }
                        i++;
                    }
                }
                return Unit.a;
            case 1:
                if (v31Var.isAttachedToWindow()) {
                    if (v31.K0 == null) {
                        rl rlVar = new rl((byte) 2);
                        v31.K0 = rlVar;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (v31.G0 == null) {
                                v31.G0 = Class.forName("android.os.SystemProperties");
                            }
                            Method declaredMethod = v31.I0;
                            if (declaredMethod == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls = v31.G0;
                                declaredMethod = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                                v31.I0 = declaredMethod;
                            }
                            if (declaredMethod != null) {
                                declaredMethod.invoke(null, rlVar);
                            }
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    dee deeVar = v31.J0;
                    synchronized (deeVar) {
                        deeVar.a(v31Var);
                    }
                }
                return Unit.a;
            case 2:
                Boolean bool = (Boolean) v31Var.o.getValue();
                bool.getClass();
                return bool;
            case 3:
                bwc bwcVarC0 = cqp.c0((Configuration) v31Var.F.getValue());
                if (bwcVarC0.a.a.isEmpty()) {
                    bwcVarC0 = new bwc(new cwc(LocaleList.getDefault()));
                }
                int iC = bwcVarC0.c();
                ArrayList arrayList = new ArrayList(iC);
                while (i < iC) {
                    arrayList.add(new yvc(bwcVarC0.b(i)));
                    i++;
                }
                return new awc(arrayList);
            default:
                MotionEvent motionEvent = v31Var.m0;
                if (motionEvent != null) {
                    boolean zContains = Arrays.asList(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = v31Var.m0;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        i = 1;
                    }
                    if (zContains && i != 0) {
                        v31Var.n0 = SystemClock.uptimeMillis();
                        v31Var.post(v31Var.u0);
                    }
                }
                v31Var.A0.invoke();
                return Unit.a;
        }
    }
}
