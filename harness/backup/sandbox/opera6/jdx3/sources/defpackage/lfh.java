package defpackage;

import android.content.Context;
import androidx.camera.view.PreviewView;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import java.util.Collections;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class lfh {
    public static final String[] l = (String[]) j95.j(new String[]{"android.permission.CAMERA"}).toArray(new String[0]);
    public static final long m;
    public final PreviewView a;
    public final Function0 b;
    public final fe5 c;
    public final Context d;
    public ysp e;
    public final ycc f;
    public final gcl g;
    public f33 h;
    public long i;
    public final pde j;
    public final pde k;

    static {
        on7 on7Var = pn7.b;
        m = cs5.x0(MessageTemplateConstants.Values.CENTER_POPUP_WIDTH, un7.d);
    }

    public lfh(ndc ndcVar, PreviewView previewView, Function0 function0) {
        this.a = previewView;
        this.b = function0;
        pde pdeVarI0 = oup.i0(ndcVar.getLifecycle());
        fe5 fe5Var = new fe5(pdeVarI0);
        this.c = fe5Var;
        Context context = previewView.getContext();
        this.d = context;
        ycc yccVar = new ycc(context);
        yccVar.m(2);
        xug.i();
        byte b = 1;
        if (yccVar.d.s != 1) {
            yccVar.k(1, true);
            yccVar.o((oc4) null);
        }
        this.f = yccVar;
        this.g = new gcl(context, previewView);
        pde pdeVar = new pde(dfh.a);
        this.j = pdeVar;
        this.k = new pde(ifh.a);
        s6h s6hVar = new s6h();
        s6hVar.a = previewView;
        pdeVar.j(fe5Var, new cl4(new tu7((Object) s6hVar, (byte) 25), (byte) 27));
        oup.l0(fe5Var.b, new veh(this, (byte) 0), new veh(this, b), (Function1) null, (Function1) null, 12);
        pdeVarI0.k(fe5Var.c);
        fe5Var.b();
    }

    public final void a(boolean z) {
        ycc yccVar = this.f;
        yccVar.getClass();
        xug.i();
        xcc xccVar = yccVar.m;
        mc4 mc4VarJ = xccVar == null ? null : xccVar.j();
        if (mc4VarJ != null) {
            ((lr) mc4VarJ).j(z);
        }
    }

    public final void b() {
        pde pdeVar = this.j;
        fe5 fe5Var = this.c;
        Executor mainExecutor = this.d.getMainExecutor();
        ysp yspVar = this.e;
        if (yspVar == null) {
            yspVar = null;
        }
        j3e j3eVar = new j3e(Collections.singletonList(yspVar), mainExecutor, new ms7(this));
        ycc yccVar = this.f;
        yccVar.getClass();
        xug.i();
        j3e j3eVar2 = yccVar.f;
        if (j3eVar2 != j3eVar || yccVar.e != mainExecutor) {
            yccVar.e = mainExecutor;
            yccVar.f = j3eVar;
            yccVar.g.M(mainExecutor, j3eVar);
            yccVar.l(j3eVar2, j3eVar);
        }
        try {
            xug.i();
            yccVar.G = fe5Var;
            yccVar.o((oc4) null);
            pdeVar.r(new ffh(null));
            xug.i();
            PreviewView previewView = this.a;
            ycc yccVar2 = previewView.h;
            if (yccVar2 != null && yccVar2 != yccVar) {
                yccVar2.b();
                previewView.c();
            }
            previewView.h = yccVar;
            previewView.a(false);
            previewView.c.getClass();
            previewView.c();
            xug.i();
            yccVar.x.j(fe5Var, new iwa(new veh(this, (byte) 3), (byte) 19));
        } catch (IllegalStateException unused) {
            pdeVar.r(new cfh(xeh.a));
        }
    }
}
