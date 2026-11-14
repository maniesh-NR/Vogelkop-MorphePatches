package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.leanplum.internal.Constants;
import com.opera.android.oauth2.OperaAccessToken;
import com.opera.android.vpn.app_widget.VpnProAppWidget;
import java.util.ArrayList;
import okhttp3.internal.connection.RealCall;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class yi2 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public yi2(Context context, slk slkVar, ydn ydnVar) {
        this.a = context;
        this.b = slkVar;
        this.c = ydnVar;
        this.d = new kze(Boolean.FALSE);
        this.f = new gen(this);
    }

    public yi2(ExtendedFloatingActionButton extendedFloatingActionButton, ole oleVar) {
        this.c = new ArrayList();
        this.b = extendedFloatingActionButton;
        this.a = extendedFloatingActionButton.getContext();
        this.d = oleVar;
    }

    public yi2(OperaAccessToken operaAccessToken, String str) {
        this.f = new tw2((Object) this, (byte) 11);
        this.a = new ii((byte) 20);
        this.c = str;
        this.b = dgh.h();
        this.d = operaAccessToken;
    }

    public AnimatorSet a() {
        kae kaeVarB = (kae) this.f;
        if (kaeVarB == null) {
            kaeVarB = (kae) this.e;
            if (kaeVarB == null) {
                kaeVarB = kae.b(c(), (Context) this.a);
                this.e = kaeVarB;
            }
            kaeVarB.getClass();
        }
        return b(kaeVarB);
    }

    public final AnimatorSet b(kae kaeVar) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.b;
        ArrayList arrayList = new ArrayList();
        if (kaeVar.g("opacity")) {
            arrayList.add(kaeVar.d("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (kaeVar.g("scale")) {
            arrayList.add(kaeVar.d("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(kaeVar.d("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (kaeVar.g("width")) {
            arrayList.add(kaeVar.d("width", extendedFloatingActionButton, ExtendedFloatingActionButton.j0));
        }
        if (kaeVar.g("height")) {
            arrayList.add(kaeVar.d("height", extendedFloatingActionButton, ExtendedFloatingActionButton.k0));
        }
        if (kaeVar.g("paddingStart")) {
            arrayList.add(kaeVar.d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.l0));
        }
        if (kaeVar.g("paddingEnd")) {
            arrayList.add(kaeVar.d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.m0));
        }
        if (kaeVar.g("labelOpacity")) {
            arrayList.add(kaeVar.d("labelOpacity", extendedFloatingActionButton, new s73(Float.class, "LABEL_OPACITY_PROPERTY", (byte) 0)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ui6.T(animatorSet, arrayList);
        return animatorSet;
    }

    public int c() {
        return 2130837539;
    }

    public void d(String str) {
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            orb orbVar = new orb(jSONArray.getJSONObject(i));
            String strE = orbVar.e(Constants.Params.TYPE);
            String strM = orbVar.m("username", "");
            String strM2 = orbVar.m(Constants.Params.EMAIL, "");
            orbVar.m("fullname", "");
            arrayList.add(new bvj(strE, strM, strM2));
        }
        vml.c(new jri(this, arrayList, (byte) 11));
    }

    public boolean e(Context context) {
        int i = VpnProAppWidget.b;
        int i2 = eif.a;
        Integer numI = kfo.I(context, VpnProAppWidget.class);
        return numI != null && numI.intValue() > 0;
    }

    public void f() {
        ((ole) this.d).a = null;
    }

    public abstract void g();

    public abstract void h(Animator animator);

    public abstract void i(String str);

    public abstract void j();

    public final void k() {
        if (((RealCall) this.e) != null) {
            return;
        }
        t9f t9fVar = (t9f) ((ii) this.a).get();
        fvh fvhVar = new fvh();
        fvhVar.h(((Uri) this.b).buildUpon().appendEncodedPath("api/v1/" + ((String) this.c)).build().toString());
        fvhVar.d("Authorization", "Bearer " + ((OperaAccessToken) this.d).a);
        RealCall realCallC = t9fVar.c(new kvh(fvhVar));
        this.e = realCallC;
        realCallC.enqueue((tw2) this.f);
    }

    public abstract void l(Context context, boolean z);

    public final void m(boolean z) {
        ydn ydnVar = (ydn) this.c;
        slk slkVar = (slk) this.b;
        hen henVar = (hen) this.e;
        if (!z) {
            if (henVar != null) {
                slkVar.i.p(henVar);
                ydnVar.H((hen) this.e);
                this.e = null;
                return;
            }
            return;
        }
        if (henVar != null) {
            return;
        }
        hen henVar2 = new hen(this);
        this.e = henVar2;
        slkVar.i.k(henVar2);
        ydnVar.F((hen) this.e);
    }

    public abstract boolean n();

    public abstract void o();

    public final void p() {
        Context context = (Context) this.a;
        ydn ydnVar = (ydn) this.c;
        boolean z = !i0l.g() && ydnVar.p().a() && (ydnVar.c.isEnabled() || ydnVar.p().e);
        ((kze) this.d).r(Boolean.valueOf(z));
        l(context, z);
        m(z && e(context));
    }
}
