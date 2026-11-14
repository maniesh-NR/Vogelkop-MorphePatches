package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import com.appsflyer.internal.o;
import com.leanplum.internal.Constants;
import com.opera.android.esim.ui.EsimActivity;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* loaded from: classes.dex */
public class y55 implements bl, hr3, m4f, j0n, f45, lo7, oeb, jv0, kuh {
    public static vk2 i;
    public static j61 k;
    public static final y55 a = new y55();
    public static final y55 b = new y55();
    public static final y55 c = new y55();
    public static final y55 d = new y55();
    public static final y55 e = new y55();
    public static final y55 f = new y55();
    public static final y55 g = new y55();
    public static final Object h = new Object();
    public static final uac j = new uac((byte) 16);

    public static void r(orb orbVar) throws JSONException {
        String strE = orbVar.e(Constants.Params.TYPE);
        int iHashCode = strE.hashCode();
        if (iHashCode != 107998) {
            if (iHashCode != 113764) {
                if (iHashCode == 94756344 && strE.equals("close")) {
                    orbVar.e(Constants.Params.TYPE);
                    return;
                }
            } else if (strE.equals("sev")) {
                orbVar.e(Constants.Params.TYPE);
                orbVar.e("id");
                return;
            }
        } else if (strE.equals("mev")) {
            orbVar.e(Constants.Params.TYPE);
            return;
        }
        o.a("Unknown value for type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:119:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.yuh s(defpackage.orb r20) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y55.s(orb):yuh");
    }

    public static ie6 t(u2j u2jVar, nx5 nx5Var, Function0 function0) {
        l08 l08Var = l08.a;
        return new ie6(new w19(u2jVar, function0), Collections.singletonList(new r3((byte) 25, (mt5) null, l08Var)), new a36(), nx5Var);
    }

    public static u56 w() {
        u56 u56Var = new u56(2188, -1, 11);
        u56Var.p(2, -1, System.currentTimeMillis());
        return u56Var;
    }

    public static jy3 y(String str) {
        Object next;
        h58 h58Var = jy3.e;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (true) {
            if (!w4VarE.hasNext()) {
                next = null;
                break;
            }
            next = w4VarE.next();
            if (((jy3) next).a.equalsIgnoreCase(str)) {
                break;
            }
        }
        return (jy3) next;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void z(orb orbVar, ala alaVar, isd isdVar) {
        Unit q0iVar;
        gsb gsbVarO = kfo.O(orbVar);
        try {
            String strE = orbVar.e("method");
            byte b2 = 5;
            byte b3 = 4;
            byte b4 = 3;
            byte b5 = 0;
            switch (strE.hashCode()) {
                case -1510532554:
                    if (strE.equals("views.v1.markOnboardingSeen")) {
                        na2.B((ddc) alaVar.b, (CoroutineContext) null, (rx5) null, new mz9(alaVar, new cka(gsbVarO, isdVar, (byte) 6), (mt5) null, (byte) 6), 3);
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), isdVar);
                    break;
                case -1291477825:
                    if (strE.equals("views.v1.getCrashId")) {
                        ((wyn) alaVar.f).a(new y0a(new cka(gsbVarO, isdVar, (byte) 2), b2));
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), isdVar);
                    break;
                case -1268616645:
                    if (strE.equals("analytics.v1.reportEvent")) {
                        alaVar.d(s(orbVar.b(Constants.Params.PARAMS).c(0).c(Constants.Params.EVENT)), new cka(gsbVarO, isdVar, (byte) 7));
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), isdVar);
                    break;
                case 574274159:
                    if (strE.equals("views.v1.getIntegrityToken")) {
                        na2.B((ddc) alaVar.b, (CoroutineContext) null, (rx5) null, new mz9(alaVar, orbVar.b(Constants.Params.PARAMS).c(0).e("expectedHash"), new cka(gsbVarO, isdVar, b2), (mt5) null, (byte) 5), 3);
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), isdVar);
                    break;
                case 1256911642:
                    if (strE.equals("views.v1.installEsim")) {
                        orb orbVarC = orbVar.b(Constants.Params.PARAMS).c(0);
                        alaVar.q(orbVarC.e("smDpAddress"), orbVarC.e("activationCode"), new cka(gsbVarO, isdVar, b3));
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), isdVar);
                    break;
                case 1398036216:
                    if (strE.equals("views.v1.activateEsim")) {
                        cka ckaVar = new cka(gsbVarO, isdVar, b4);
                        alaVar.getClass();
                        try {
                            p0i p0iVar = t0i.b;
                            bp6 bp6Var = (bp6) alaVar.i;
                            bp6Var.a.i.invoke((EsimActivity) alaVar.a);
                            q0iVar = Unit.a;
                        } catch (Throwable th) {
                            p0i p0iVar2 = t0i.b;
                            q0iVar = new q0i(th);
                        }
                        Throwable thD = t0i.d(q0iVar);
                        if (thD != null) {
                            ckaVar.n(new rw7(new dqb(thD)));
                            break;
                        } else {
                            ckaVar.n(new sw7(q0iVar));
                            break;
                        }
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), isdVar);
                    break;
                case 1576433425:
                    if (strE.equals("views.v1.notifyEsimStateChanged")) {
                        v98 v98VarX = vtp.x(orbVar.b(Constants.Params.PARAMS).c(0).c(Constants.Params.STATE));
                        na2.B((ddc) alaVar.b, (CoroutineContext) null, (rx5) null, new s71(new cka(gsbVarO, isdVar, (byte) 1), alaVar, v98VarX, (mt5) null, (byte) 23), 3);
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), isdVar);
                    break;
                case 1855238694:
                    if (strE.equals("views.v1.getHostState")) {
                        na2.B((ddc) alaVar.b, (CoroutineContext) null, (rx5) null, new mz9(new cka(gsbVarO, isdVar, b5), alaVar, (mt5) null, (byte) 4), 3);
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), isdVar);
                    break;
                default:
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), isdVar);
                    break;
            }
        } catch (Throwable th2) {
            dqb dqbVar = new dqb(th2);
            try {
                orbVar.e("method");
            } catch (JSONException unused) {
            }
            kfo.F(gsbVarO, dqbVar, isdVar);
        }
    }

    @Override // defpackage.bl
    public final boolean a(String str) {
        return false;
    }

    public final int b(oj9 oj9Var) {
        String str = oj9Var.n;
        if ("audio/flac".equals(str) || "audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str) || "audio/vorbis".equals(str) || "audio/wav".equals(str) || "audio/webm".equals(str) || "audio/mp4".equals(str)) {
            return kuh.g(oj9Var.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return dzd.k(str) ? kuh.g(1, 0, 0, 0) : kuh.g(0, 0, 0, 0);
    }

    public final Rect c(Activity activity) throws Exception {
        psp pspVar = hr3.Fo;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                rect.set((Rect) obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null));
            } else {
                rect.set((Rect) obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null));
            }
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            pspVar.getClass();
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + dimensionPixelSize;
                if (i3 == point.x) {
                    rect.right = i3;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (obj2 instanceof DisplayCutout) {
                    displayCutout = (DisplayCutout) obj2;
                }
            } catch (Exception e3) {
                if (!(e3 instanceof ClassNotFoundException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof NoSuchFieldException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException) && !(e3 instanceof InstantiationException)) {
                    throw e3;
                }
                pspVar.getClass();
            }
            if (displayCutout != null) {
                if (rect.left == displayCutout.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                    rect.right = displayCutout.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutout.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                    rect.bottom = displayCutout.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    @Override // defpackage.bl
    public final boolean e(String str, String str2) {
        return false;
    }

    public final String getName() {
        return "Audio";
    }

    public final int getTrackType() {
        return 1;
    }

    @Override // defpackage.bl
    public final boolean h(String str) {
        return false;
    }

    public final String i() {
        return "expected an Int value";
    }

    @Override // defpackage.jv0
    public final void j(List list, x92 x92Var) {
    }

    @Override // defpackage.bl
    public boolean k(String str) {
        am2.v(ay3.a(wqm.I(str), lqm.p, false));
        return true;
    }

    @Override // defpackage.jv0
    public final void l(String str) {
    }

    @Override // defpackage.f45
    public final void m(pna pnaVar, kuk kukVar) {
        pnaVar.d.f(mpa.i, new x11((byte) 9, (mt5) null, (cr9) kukVar));
    }

    public final Object n(esb esbVar, float f2) {
        int iT = esbVar.t();
        if (iT != 1 && iT != 3) {
            if (iT != 7) {
                qp2.o("Cannot convert json to point. Next token is ".concat(o18.w(iT)));
                return null;
            }
            PointF pointF = new PointF(((float) esbVar.q()) * f2, ((float) esbVar.q()) * f2);
            while (esbVar.o()) {
                esbVar.H();
            }
            return pointF;
        }
        return xsb.b(esbVar, f2);
    }

    public final neb q() {
        j61 j61Var = k;
        if (j61Var != null) {
            return j61Var;
        }
        j61 j61Var2 = new j61(t8.a);
        k = j61Var2;
        return j61Var2;
    }

    public final int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    @Override // defpackage.jv0
    public final boolean u() {
        return false;
    }

    @Override // defpackage.jv0
    public final boolean v() {
        return false;
    }

    @Override // defpackage.lo7
    public final no7 x(Context context) {
        return new v1(context);
    }
}
