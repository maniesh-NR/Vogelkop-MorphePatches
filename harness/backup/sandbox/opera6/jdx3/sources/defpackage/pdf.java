package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.opera.android.OperaApplication;
import com.opera.android.startup.WelcomeActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pdf extends y9k {
    public final mcj h;
    public final orm i;
    public final mdf j;
    public final r65 k;
    public final yl6 l;
    public final l5b m;
    public w9k n;
    public List o;

    public pdf(mcj mcjVar, orm ormVar, mdf mdfVar, r65 r65Var, yl6 yl6Var) {
        this.h = mcjVar;
        this.i = ormVar;
        this.j = mdfVar;
        this.k = r65Var;
        this.l = yl6Var;
        l5b l5bVar = new l5b((byte) 4);
        l5bVar.b = true;
        this.m = l5bVar;
    }

    @Override // defpackage.y9k
    public final void f0() {
        Context contextRequireContext = requireContext();
        nv6 nv6VarB = ru9.c(contextRequireContext).b();
        SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
        editor.putBoolean("oem.onboarding.completed", true);
        editor.remove("oem.onboarding.cmp_intro_reached");
        nv6VarB.w();
        String[] strArr = OperaApplication.K;
        ((SharedPreferences) ((ldf) ((OperaApplication) contextRequireContext.getApplicationContext()).r.m0.get()).a.get()).edit().remove("need").apply();
        WelcomeActivity welcomeActivityRequireActivity = requireActivity();
        welcomeActivityRequireActivity.N().h = true;
        welcomeActivityRequireActivity.W();
    }

    @Override // defpackage.y9k
    public final List g0(Context context) {
        return o0(context);
    }

    @Override // defpackage.y9k
    public final int h0() {
        int size = o0(requireContext()).size();
        Bundle arguments = getArguments();
        return size + (arguments != null ? arguments.getInt("key.steps_after_feature_onboarding", 0) : 0);
    }

    @Override // defpackage.y9k
    public final boolean j0() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return displayMetrics.widthPixels < displayMetrics.heightPixels;
    }

    @Override // defpackage.y9k
    public final boolean m0() {
        return h0() > 1;
    }

    public final List o0(Context context) {
        ArrayList arrayList;
        z65 z65Var;
        String[] stringArray;
        Object next;
        l08 l08Var = this.o;
        if (l08Var == null) {
            Bundle arguments = getArguments();
            if (arguments == null || (stringArray = arguments.getStringArray("key.onboarding_page_ids")) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (String str : stringArray) {
                    Iterator it = m0o.h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.a(((m0o) next).name(), str)) {
                            break;
                        }
                    }
                    m0o m0oVar = (m0o) next;
                    if (m0oVar != null) {
                        arrayList.add(m0oVar);
                    }
                }
            }
            if (arrayList == null) {
                arrayList = l08.a;
            }
            if (arrayList.isEmpty()) {
                l08Var = l08.a;
            } else {
                ArrayList<m0o> arrayList2 = arrayList;
                l08 arrayList3 = new ArrayList(k95.o(arrayList2, 10));
                for (m0o m0oVar2 : arrayList2) {
                    int iOrdinal = m0oVar2.ordinal();
                    mdf mdfVar = this.j;
                    if (iOrdinal == 1) {
                        z65Var = new z65(context, new hu5(this, this.l, (byte) 27), new hpd(mdfVar, this, (byte) 24));
                    } else if (iOrdinal == 2) {
                        sz4 sz4Var = (sz4) context.getSystemService("com.opera.android.permissions.PermissionHandlerService");
                        Objects.requireNonNull(sz4Var);
                        z65Var = new z65(context, new xx1((Object) context, (Object) sz4Var, (Object) this, (Object) mdfVar, (byte) 5), new yqd(mdfVar, (byte) 27));
                    } else {
                        if (iOrdinal != 3) {
                            uac.h(m0oVar2, " is not an onboarding page");
                            return null;
                        }
                        String[] strArr = OperaApplication.K;
                        boolean zJ = ((OperaApplication) context.getApplicationContext()).J().J();
                        r65 r65Var = this.k;
                        p10 s59Var = zJ ? new s59(((d75) r65Var.b.get()).f) : new b1i();
                        r65Var.getClass();
                        p65 p65Var = new p65(zJ, r65Var);
                        z65Var = new z65(context, s59Var, new hu5(mdfVar, p65Var, (byte) 28), new jbd(mdfVar, p65Var, this, (byte) 8), new yqd(p65Var, (byte) 29), new pn(context, (byte) 3));
                    }
                    arrayList3.add(z65Var);
                }
                l08Var = arrayList3;
            }
            this.o = l08Var;
        }
        return l08Var;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        requireActivity().T();
        requireActivity().V(false);
    }

    @Override // defpackage.y9k
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = getView();
        if (view != null) {
            WeakHashMap weakHashMap = r5n.a;
            view.requestApplyInsets();
        }
    }

    @Override // defpackage.y9k
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        q9n.f(viewOnCreateView.getRootView(), new lzb(this, (byte) 26));
        View rootView = viewOnCreateView.getRootView();
        odf odfVar = new odf((byte) 0);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(rootView, odfVar);
        return viewOnCreateView.getRootView();
    }

    public final void onResume() {
        super.onResume();
        w9k w9kVar = this.n;
        if (w9kVar != null) {
            this.n = null;
            kl0 kl0Var = kl0.d;
            mdf mdfVar = this.j;
            Context contextRequireContext = requireContext();
            String[] strArr = OperaApplication.K;
            OperaApplication operaApplication = (OperaApplication) contextRequireContext.getApplicationContext();
            synchronized (operaApplication.c) {
                operaApplication.b = null;
            }
            yl6 yl6Var = this.l;
            if (yl6Var.d().b()) {
                vml.c(new yqd(w9kVar, (byte) 28));
                mdfVar.a(kl0Var, gl0.b);
            } else {
                if (!tl6.a()) {
                    vml.c(new yqd(w9kVar, (byte) 28));
                }
                mdfVar.a(kl0Var, gl0.g);
            }
            l5b l5bVar = this.m;
            yl6Var.i(this.i, vb0.b, ac0.e, !l5bVar.b, null);
            l5bVar.b = false;
        }
    }
}
