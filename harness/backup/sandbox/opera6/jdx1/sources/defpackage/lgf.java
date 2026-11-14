package defpackage;

import J.N;
import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.Size;
import android.view.Surface;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.favorites.PushedSpeedDialFavorite;
import com.opera.android.favorites.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class lgf {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    public lgf() {
        this.b = new AtomicBoolean(false);
        this.c = new HashMap();
        this.e = EGL14.EGL_NO_DISPLAY;
        this.f = EGL14.EGL_NO_CONTEXT;
        this.g = rs9.a;
        this.i = EGL14.EGL_NO_SURFACE;
        this.k = Collections.EMPTY_MAP;
        this.l = null;
        this.m = os9.a;
        this.a = -1;
    }

    public lgf(Context context, esk eskVar, pt3 pt3Var, ppm ppmVar, mdh mdhVar, qdh qdhVar, cul culVar, wcd wcdVar, iuh iuhVar, wok wokVar, s28 s28Var) {
        this.b = new hp2((byte) 0);
        this.c = context;
        this.e = eskVar;
        this.f = pt3Var;
        this.d = ppmVar;
        this.g = mdhVar;
        this.a = fan.a(24.0f, context.getResources());
        this.h = qdhVar;
        this.i = culVar;
        this.j = wcdVar;
        this.k = iuhVar;
        this.l = wokVar;
        this.m = s28Var;
    }

    public final void a(ip7 ip7Var, vzk vzkVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.e = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            qp2.n("Unable to get EGL14 display");
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.e, iArr, 0, iArr, 1)) {
            this.e = EGL14.EGL_NO_DISPLAY;
            qp2.n("Unable to initialize EGL14");
            return;
        }
        if (vzkVar != null) {
            vzkVar.b = iArr[0] + "." + iArr[1];
        }
        int i = ip7Var.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.e, new int[]{12324, i, 12323, i, 12322, i, 12321, ip7Var.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, ip7Var.a() ? 64 : 4, 12610, ip7Var.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            qp2.n("Unable to find a suitable EGLConfig");
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.e, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, ip7Var.a() ? 3 : 2, 12344}, 0);
        rs9.a("eglCreateContext");
        this.h = eGLConfig;
        this.f = eGLContextEglCreateContext;
        EGL14.eglQueryContext((EGLDisplay) this.e, eGLContextEglCreateContext, 12440, new int[1], 0);
    }

    public final do2 b(Surface surface) {
        try {
            EGLDisplay eGLDisplay = (EGLDisplay) this.e;
            EGLConfig eGLConfig = (EGLConfig) this.h;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceH = rs9.h(eGLDisplay, eGLConfig, surface, (int[]) this.g);
            EGLDisplay eGLDisplay2 = (EGLDisplay) this.e;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceH, 12375, iArr, 0);
            int i = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceH, 12374, iArr2, 0);
            Size size = new Size(i, iArr2[0]);
            return new do2(eGLSurfaceH, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            e.getMessage();
            return null;
        }
    }

    public final void c() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.e;
        EGLConfig eGLConfig = (EGLConfig) this.h;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = rs9.a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        rs9.a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            this.i = eGLSurfaceEglCreatePbufferSurface;
        } else {
            qp2.n("surface was null");
        }
    }

    public final lyf d(ip7 ip7Var) {
        rs9.d((AtomicBoolean) this.b, false);
        try {
            a(ip7Var, null);
            c();
            f((EGLSurface) this.i);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString((EGLDisplay) this.e, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new lyf(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            e.getMessage();
            return new lyf("", "");
        } finally {
            h();
        }
    }

    public pn2 e(ip7 ip7Var) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
        rs9.d(atomicBoolean, false);
        vzk vzkVar = new vzk();
        vzkVar.a = "0.0";
        vzkVar.b = "0.0";
        vzkVar.c = "";
        vzkVar.d = "";
        try {
            if (ip7Var.a()) {
                lyf lyfVarD = d(ip7Var);
                String str = (String) lyfVarD.a;
                str.getClass();
                String str2 = (String) lyfVarD.b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    ip7Var = ip7.d;
                }
                int[] iArr = rs9.a;
                if (ip7Var.a == 3 && str2.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                    iArr = rs9.b;
                }
                this.g = iArr;
                vzkVar.c = str;
                vzkVar.d = str2;
            }
            a(ip7Var, vzkVar);
            c();
            f((EGLSurface) this.i);
            vzkVar.a = rs9.i();
            this.k = rs9.f(ip7Var);
            int iG = rs9.g();
            this.a = iG;
            l(iG);
            this.d = Thread.currentThread();
            atomicBoolean.set(true);
            if ("".isEmpty()) {
                return new pn2((String) vzkVar.a, (String) vzkVar.b, (String) vzkVar.c, (String) vzkVar.d);
            }
            qp2.n("Missing required properties:".concat(""));
            return null;
        } catch (IllegalArgumentException | IllegalStateException e) {
            h();
            throw e;
        }
    }

    public final void f(EGLSurface eGLSurface) {
        ((EGLDisplay) this.e).getClass();
        ((EGLContext) this.f).getClass();
        if (EGL14.eglMakeCurrent((EGLDisplay) this.e, eGLSurface, eGLSurface, (EGLContext) this.f)) {
            return;
        }
        qp2.n("eglMakeCurrent failed");
    }

    public final void g(Surface surface) {
        rs9.d((AtomicBoolean) this.b, true);
        rs9.c((Thread) this.d);
        HashMap map = (HashMap) this.c;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, rs9.j);
    }

    public final void h() {
        HashMap map = (HashMap) this.c;
        Iterator it = ((Map) this.k).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((ps9) it.next()).a);
        }
        this.k = Collections.EMPTY_MAP;
        this.l = null;
        if (!Objects.equals((EGLDisplay) this.e, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.e;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (do2 do2Var : map.values()) {
                if (!Objects.equals(do2Var.a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.e, do2Var.a)) {
                    try {
                        rs9.a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        e.toString();
                    }
                }
            }
            map.clear();
            if (!Objects.equals((EGLSurface) this.i, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.e, (EGLSurface) this.i);
                this.i = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.f, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.e, (EGLContext) this.f);
                this.f = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.e);
            this.e = EGL14.EGL_NO_DISPLAY;
        }
        this.h = null;
        this.a = -1;
        this.m = os9.a;
        this.j = null;
        this.d = null;
    }

    public final void i(Surface surface, boolean z) {
        if (((Surface) this.j) == surface) {
            this.j = null;
            f((EGLSurface) this.i);
        }
        HashMap map = (HashMap) this.c;
        do2 do2Var = z ? (do2) map.remove(surface) : (do2) map.put(surface, rs9.j);
        if (do2Var == null || do2Var == rs9.j) {
            return;
        }
        try {
            EGL14.eglDestroySurface((EGLDisplay) this.e, do2Var.a);
        } catch (RuntimeException e) {
            e.getMessage();
        }
    }

    public final void j(long j, float[] fArr, Surface surface) {
        rs9.d((AtomicBoolean) this.b, true);
        rs9.c((Thread) this.d);
        HashMap map = (HashMap) this.c;
        jpo.n("The surface is not registered.", map.containsKey(surface));
        do2 do2VarB = (do2) map.get(surface);
        Objects.requireNonNull(do2VarB);
        if (do2VarB == rs9.j) {
            do2VarB = b(surface);
            if (do2VarB == null) {
                return;
            } else {
                map.put(surface, do2VarB);
            }
        }
        int i = do2VarB.c;
        int i2 = do2VarB.b;
        EGLSurface eGLSurface = do2VarB.a;
        if (surface != ((Surface) this.j)) {
            f(eGLSurface);
            this.j = surface;
            GLES20.glViewport(0, 0, i2, i);
            GLES20.glScissor(0, 0, i2, i);
        }
        ps9 ps9Var = (ps9) this.l;
        ps9Var.getClass();
        if (ps9Var instanceof qs9) {
            GLES20.glUniformMatrix4fv(((qs9) ps9Var).f, 1, false, fArr, 0);
            rs9.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        rs9.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.e, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.e, eGLSurface)) {
            return;
        }
        EGL14.eglGetError();
        i(surface, false);
    }

    public final void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean z = (((vok) ((wok) this.l).i()).a & 8) != 0;
        cbk cbkVar = new cbk();
        cbkVar.e = this;
        cbkVar.d = new ArrayList();
        cbkVar.c = str;
        cbkVar.a = z;
        String str2 = (String) cbkVar.c;
        boolean z2 = cbkVar.a;
        cbkVar.b = z2 ? 5 : 4;
        mdh mdhVar = (mdh) this.g;
        wcd wcdVar = (wcd) this.j;
        List<PushedSpeedDialFavorite> list = (List) mdhVar.h.g();
        if (list != null) {
            String lowerCase = str2.toLowerCase(Locale.getDefault());
            for (PushedSpeedDialFavorite pushedSpeedDialFavorite : list) {
                String str3 = pushedSpeedDialFavorite.e.d;
                if (str3.length() <= 25 && str3.toLowerCase(Locale.getDefault()).startsWith(lowerCase)) {
                    cbkVar.a(pushedSpeedDialFavorite, new qpm(cbkVar, pushedSpeedDialFavorite, (byte) 0), new qpm(cbkVar, pushedSpeedDialFavorite, (byte) 1), true);
                    break;
                }
            }
            cbkVar.b();
        } else {
            cbkVar.b();
        }
        pt3 pt3Var = (pt3) this.f;
        z4k z4kVar = new z4k(cbkVar, (byte) 10);
        BrowserActivity browserActivity = pt3Var.b;
        int i = BrowserActivity.E1;
        String[] strArr = OperaApplication.K;
        e eVarO = browserActivity.getApplication().o();
        eVarO.getClass();
        hq8 hq8VarG = nr8.g(new jp5(str2.toLowerCase(Locale.getDefault()), (byte) 3), eVarO.f);
        if (hq8VarG == null) {
            cbkVar.b();
        } else {
            cbkVar.a(hq8VarG, (qpm) null, new npl(z4kVar, hq8VarG, (byte) 14), false);
        }
        N.MKixbOjw(((hp2) this.b).b, str2, true, new crk(cbkVar, (byte) 26));
        if (str2.equals(wqm.G(str2))) {
            s28 s28Var = (s28) this.m;
            ilm ilmVar = new ilm(cbkVar, (byte) 3);
            if (s28Var.d) {
                ((ko7) s28Var.h).f(new q2g(s28Var, ilmVar, (byte) 22));
            } else {
                a1b a1bVar = h1b.b;
                ilmVar.run(csh.e);
            }
        } else {
            cbkVar.b();
        }
        if (z2) {
            if (!wcdVar.a.i("enable_suggested_speed_dials") || !((Boolean) wcdVar.c.get()).booleanValue() || str2.length() < 2) {
                cbkVar.b();
                return;
            }
            l2g l2gVarA = wcdVar.a(str2, vcd.a);
            if (l2gVarA == null) {
                cbkVar.b();
            } else {
                ((ArrayList) cbkVar.d).add(new w0k((Context) this.c, (esk) this.e, l2gVarA.d, l2gVarA.b, l2gVarA.a, new roj(cbkVar, l2gVarA, (byte) 9), (iuh) this.k));
                cbkVar.b();
            }
        }
    }

    public final void l(int i) {
        ps9 ps9Var = (ps9) ((Map) this.k).get((os9) this.m);
        if (ps9Var == null) {
            j9h.u((os9) this.m, "Unable to configure program for input format: ");
            return;
        }
        if (((ps9) this.l) != ps9Var) {
            this.l = ps9Var;
            ps9Var.b();
            Objects.toString((os9) this.m);
            Objects.toString((ps9) this.l);
        }
        GLES20.glActiveTexture(33984);
        rs9.b("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        rs9.b("glBindTexture");
    }
}
