package defpackage;

import ads_mobile_sdk.fo;
import ads_mobile_sdk.qr0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.opera.android.bar.TopToolbarContainer;
import com.opera.android.mainmenu.MainMenuSheetToggleLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class k8 implements bvl, w7e {
    public Object a;
    public Object b;

    public k8(byte b) {
        switch (b) {
            case 6:
                this.a = new ArrayList();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                this.a = c26.j(1);
                this.b = new cd5();
                break;
            case 13:
                this.a = new Rect();
                this.b = new h7f();
                break;
            default:
                this.b = new int[2];
                break;
        }
    }

    public k8(Context context) {
        this.a = context;
    }

    public k8(Context context, String str, String str2) {
        this.b = w1h.l(context, vml.d, str, new bg1[0]);
        this.a = str2;
    }

    public k8(Context context, pro proVar) {
        this.a = context.getApplicationContext();
        this.b = z4c.b(new m53(this, proVar, (byte) 5));
    }

    public k8(MainMenuSheetToggleLayout mainMenuSheetToggleLayout, crk crkVar) {
        this.a = mainMenuSheetToggleLayout;
        this.b = crkVar;
        mainMenuSheetToggleLayout.setOnClickListener(new h4i((Object) this, (byte) 24));
    }

    public /* synthetic */ k8(Object obj) {
        this.b = obj;
    }

    public /* synthetic */ k8(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public k8(String str) {
        this.b = new ay((Object) this, (byte) 5);
        this.a = str;
    }

    public k8(uul uulVar) {
        this.a = uulVar;
        this.b = new pde(new zul(0, 0));
    }

    @Override // defpackage.bvl
    public final void D(zul zulVar) {
        xf8.F0((pde) this.b, zulVar);
        uul uulVar = (uul) this.a;
        int i = ((avl) getState().g()).d;
        TopToolbarContainer topToolbarContainer = uulVar.j;
        TopToolbarContainer topToolbarContainer2 = uulVar.j;
        gbf gbfVar = (gbf) uulVar.i;
        if (gbfVar.j.p()) {
            return;
        }
        int i2 = zulVar.a;
        int i3 = zulVar.b;
        int translationY = (int) topToolbarContainer.getTranslationY();
        float f = i2;
        if (f != topToolbarContainer2.getTranslationY()) {
            topToolbarContainer2.setTranslationY(f);
            i7f i7fVar = (i7f) uulVar.h;
            g7f g7fVarC = u35.c(i7fVar, i7fVar);
            while (g7fVarC.hasNext()) {
                ((y43) g7fVarC.next()).p(f);
            }
        }
        topToolbarContainer.e = i2;
        topToolbarContainer.f = i3;
        topToolbarContainer.b();
        int i4 = i2 != 0 ? 4 : 0;
        if (i4 != topToolbarContainer2.getVisibility()) {
            topToolbarContainer2.setVisibility(i4);
        }
        if (i2 != translationY) {
            i7f i7fVar2 = gbfVar.p;
            g7f g7fVarC2 = u35.c(i7fVar2, i7fVar2);
            while (g7fVarC2.hasNext()) {
                ((cz3) g7fVarC2.next()).a();
            }
        }
    }

    @Override // defpackage.bvl
    public final void G() {
        uul uulVar = (uul) this.a;
        ((v43) uulVar.f).c(((k6l) uulVar.c).o);
    }

    public final yoo H() {
        return (yoo) ((zyk) this.b).getValue();
    }

    public final void I() {
        H().c();
    }

    public final void J(cn cnVar) {
        yoo yooVarH = H();
        esg esgVar = new esg((byte) 18, cnVar, this, false);
        yooVarH.getClass();
        yooVarH.c = new uuj(esgVar);
    }

    public final void K(Context context, vm vmVar) {
        ejo ejoVar = fko.a;
        fko.a(context);
        if (H().d()) {
            vmVar.C(new cm(103, "Ad is invalid or expired!", (byte) 0));
            return;
        }
        i06 i06Var = (this instanceof m4b ? (m4b) this : null) != null ? new i06((byte) 14) : null;
        yoo yooVarH = H();
        yooVarH.getClass();
        h4m h4mVar = new h4m(yooVarH, context, i06Var, vmVar);
        if (fko.c) {
            h4mVar.run();
        } else {
            pfp.a(h4mVar);
        }
    }

    public final void L() {
        BroadcastReceiver broadcastReceiver = (up1) this.a;
        if (broadcastReceiver != null) {
            try {
                ((xp1) this.b).k.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter M();

    public final void N() {
        q0();
    }

    public final void O() {
        if (bf2.b.decrementAndGet((bf2) this.a) == 0) {
            ((cd5) this.b).j0(new muf(new ouf(2)));
            j0();
        }
    }

    public void P() {
        yoo yooVarH = H();
        yooVarH.e = yooVarH.e.c(new mmo(yooVarH, (byte) 0));
    }

    public final void Q(Object obj) {
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList.isEmpty()) {
            this.b = obj;
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (obj2 != null) {
                h9o.t();
                return;
            }
        }
    }

    public abstract int[] R(int i);

    public abstract int S();

    public abstract Rect T(int i);

    public final MenuItem U(MenuItem menuItem) {
        if (!(menuItem instanceof msk)) {
            return menuItem;
        }
        msk mskVar = (msk) menuItem;
        hkj hkjVar = (hkj) this.b;
        if (hkjVar == null) {
            hkjVar = new hkj(0);
            this.b = hkjVar;
        }
        MenuItem menuItem2 = (MenuItem) hkjVar.get(mskVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        vtd vtdVar = new vtd((Context) this.a, mskVar);
        ((hkj) this.b).put(mskVar, vtdVar);
        return vtdVar;
    }

    public final int[] V(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public int W() {
        return 2;
    }

    public final boolean X() {
        return ((SharedPreferences) ((b59) this.b).get()).getBoolean((String) this.a, false);
    }

    public abstract boolean Y(mq mqVar);

    public final boolean Z(int i) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.b;
        d dVar = ((RecyclerView) this.a).m;
        if (dVar != null) {
            return gridLayoutManager.g.d(i, gridLayoutManager.b) == gridLayoutManager.g.d(dVar.getItemCount() - 1, gridLayoutManager.b);
        }
        return false;
    }

    public final Object a(Function1 function1, nt5 nt5Var) {
        qr0 qr0Var = (qr0) this.a;
        qr0Var.getClass();
        return ((Boolean) qr0Var.a("gads:call_all_methods_on_ui_thread:enabled", Boolean.FALSE, fo.a)).booleanValue() ? na2.Z((CoroutineContext) this.b, new wc2(function1, (mt5) null, (byte) 4), nt5Var) : function1.invoke(nt5Var);
    }

    public final boolean a0() {
        return ((Boolean) ((ay) this.b).get()).booleanValue();
    }

    public final boolean b0() {
        return ((GridLayoutManager) this.b).getOrientation() == 1;
    }

    public final void c0() {
        g7f g7fVar = new g7f((h7f) this.b);
        while (g7fVar.hasNext()) {
            ((i21) g7fVar.next()).a();
        }
    }

    public void d0(mq mqVar) {
    }

    public abstract void e0();

    public abstract void f0(mq mqVar);

    public void g0(mq mqVar) {
        boolean z;
        boolean z2;
        x5f x5fVar = (x5f) this.a;
        if (Y(mqVar)) {
            dl dlVar = mqVar.c;
            q50 q50Var = dlVar.b;
            String str = dlVar.c;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                j80 j80Var = new j80(2443, -1, 2);
                j80Var.q(0, 1, q50Var);
                j80Var.q(1, 1, str);
                qd0 qd0VarB = x56VarF.B(zpaVar);
                List list = (List) qd0VarB.n(1);
                ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 1, vep.t(qd0VarB, 1, 1)) : new hf0(qd0VarB, 1, list)).add(j80Var);
                x5fVar.U0(x56VarF);
                return;
            }
            return;
        }
        if (!(mqVar instanceof no) || mqVar.j()) {
            return;
        }
        no noVar = (no) mqVar;
        km kmVar = noVar.g;
        dl dlVar2 = noVar.c;
        kmVar.c(dlVar2);
        f5k f5kVar = (f5k) this.b;
        if (f5kVar != null) {
            z2 = f5kVar.a.h;
            z = true;
        } else {
            z = false;
            z2 = false;
        }
        bz bzVar = noVar.p;
        x5fVar.s(dlVar2.b, dlVar2.c, bzVar.i(), z, z2, bzVar.b());
    }

    @Override // defpackage.bvl
    public final pde getOffset() {
        return (pde) this.b;
    }

    public abstract int[] h0(int i);

    public abstract void i0(qim qimVar, yo7 yo7Var);

    public boolean isEnabled() {
        return owe.c.a.get();
    }

    public void j0() {
    }

    public abstract void k0(boolean z);

    public final void l0() {
        L();
        IntentFilter intentFilterM = M();
        if (intentFilterM.countActions() == 0) {
            return;
        }
        up1 up1Var = (up1) this.a;
        if (up1Var == null) {
            up1Var = new up1(this, (byte) 0);
            this.a = up1Var;
        }
        ((xp1) this.b).k.registerReceiver(up1Var, intentFilterM);
    }

    public boolean m0() {
        return false;
    }

    public void n0(i21 i21Var) {
        ((h7f) this.b).b(i21Var);
    }

    public void o0() {
        ((h7f) this.b).clear();
    }

    public final void onViewDetachedFromWindow(View view) {
        c0();
    }

    public abstract void p0(mq mqVar);

    public void q0() {
    }

    public void r0(qrl qrlVar) {
        qrlVar.run();
    }

    public final v7e w(d5o d5oVar) {
        Context context = (Context) this.a;
        Class cls = (Class) this.b;
        return new eeh(context, d5oVar.r(File.class, cls), d5oVar.r(Uri.class, cls), cls);
    }
}
