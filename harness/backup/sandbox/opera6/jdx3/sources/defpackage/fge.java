package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.appsflyer.internal.j;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.browser.b;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.StylingEditText;
import com.opera.android.settings.SettingsManager;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class fge extends lj implements jbl {
    public static boolean S;
    public FadingRecyclerView A;
    public View B;
    public View C;
    public View D;
    public boolean E;
    public StylingEditText F;
    public ValueAnimator G;
    public final yfe H;
    public final age I;
    public final uv1 J;
    public MenuItem K;
    public Uri L;
    public String M;
    public Long N;
    public String O;
    public final bge P;
    public boolean Q;
    public Bundle R;
    public final BrowserActivity r;
    public final tcl s;
    public final bf9 t;
    public final SettingsManager u;
    public final x5f v;
    public final xc9 w;
    public final rc9 x;
    public final ha2 y;
    public final bc9 z;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public fge(BrowserActivity browserActivity, tcl tclVar, x5f x5fVar) {
        u7k u7kVarJ = u7k.j(2131559120);
        itl itlVar = (itl) u7kVarJ.a;
        itlVar.e = true;
        u7kVarJ.s(2132019117);
        itlVar.b = 2131755040;
        super(itlVar);
        a83 a83Var = new a83((Object) this, (byte) 11);
        this.H = new yfe(this);
        this.I = new age(this);
        this.J = new uv1(this, (byte) 1);
        this.P = new bge(this);
        this.r = browserActivity;
        this.s = tclVar;
        String[] strArr = OperaApplication.K;
        bf9 bf9VarS = ((OperaApplication) browserActivity.getApplication()).s();
        this.t = bf9VarS;
        this.u = ((OperaApplication) browserActivity.getApplication()).J();
        this.v = x5fVar;
        xc9 xc9Var = new xc9(browserActivity, tclVar);
        this.w = xc9Var;
        rc9 rc9Var = new rc9(tclVar, bf9VarS);
        this.x = rc9Var;
        ha2 ha2Var = new ha2(browserActivity.l);
        this.y = ha2Var;
        bc9 bc9Var = new bc9(browserActivity, tclVar, ha2Var, rc9Var, getLifecycle(), xc9Var, bf9VarS.a.u(), (wun) ((OperaApplication) browserActivity.getApplication()).r.o1.get(), this);
        this.z = bc9Var;
        ha2Var.G(bc9Var);
        ha2Var.registerAdapterDataObserver(a83Var);
    }

    public final boolean G0(ib9 ib9Var) {
        if (ib9Var.l != null) {
            if (ib9Var.d.equals(this.t.a.u())) {
                return true;
            }
            r rVarRequireActivity = requireActivity();
            String[] strArr = OperaApplication.K;
            if (((OperaApplication) rVarRequireActivity.getApplication()).m().a.e(ib9Var.l, 0) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H0(android.net.Uri r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fge.H0(android.net.Uri, java.lang.String):void");
    }

    public final void I0(o93 o93Var) {
        qim qimVar = this.r.o;
        Objects.requireNonNull(qimVar);
        ysj ysjVar = qimVar.e;
        ysjVar.getClass();
        ysjVar.b(o93Var, ijm.b);
    }

    public final void J0(long j) {
        rc9 rc9Var = this.x;
        rc9Var.getClass();
        ArrayList arrayList = new ArrayList(rc9Var.c);
        int size = arrayList.size();
        byte b = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hb9 hb9Var = (hb9) obj;
            if (hb9Var.b == j) {
                if (hb9Var instanceof ib9) {
                    qim qimVar = this.r.o;
                    Objects.requireNonNull(qimVar);
                    nej nejVar = qimVar.d;
                    zfe zfeVar = new zfe(this, (ib9) hb9Var, b);
                    nejVar.getClass();
                    nejVar.b(zfeVar, ijm.b);
                    return;
                }
                return;
            }
        }
    }

    public final boolean K0(ib9 ib9Var, boolean z) {
        boolean zO = false;
        if (ib9Var.l != null) {
            r rVarRequireActivity = requireActivity();
            String[] strArr = OperaApplication.K;
            rf7 rf7Var = ((OperaApplication) rVarRequireActivity.getApplication()).m().a;
            if (ib9Var.d.equals(this.t.a.u())) {
                return rf7Var.q(requireContext(), new ufe(this), ib9Var.l, ib9Var.h, z);
            }
            re7 re7VarE = rf7Var.e(ib9Var.l, 0);
            if (re7VarE != null) {
                Context contextRequireContext = requireContext();
                Uri uriG = re7VarE.g();
                if (uriG != null && rf7.n(contextRequireContext, re7VarE, true)) {
                    String strH = rf7.h(re7VarE);
                    zO = rf7Var.o(contextRequireContext, re7VarE, uriG, c5o.m().o(re7VarE.f(), strH), strH, z);
                }
                if (!zO) {
                    I0(new glj(2132018630, 2500));
                }
                return zO;
            }
        }
        return false;
    }

    @Override // defpackage.ltl
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bge bgeVar = this.P;
        bgeVar.getClass();
        bgeVar.a = System.currentTimeMillis();
    }

    @Override // defpackage.ltl, defpackage.ryl
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.R = (Bundle) this.r.c0.a.remove("flow");
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        this.y.onDestroy();
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        Editable text = this.F.getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        BrowserActivity browserActivity = this.r;
        if (!zIsEmpty) {
            Bundle bundle = new Bundle();
            bundle.putString("MESSAGE_TEXT", text.toString());
            browserActivity.c0.a.put("flow", bundle);
        }
        super.onDestroyView();
        jvj jvjVar = browserActivity.D;
        if (jvjVar == null) {
            jvjVar = null;
        }
        jvjVar.a.c(this.P);
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        this.A.y0((d) null);
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.F = null;
        if (this.K != null) {
            this.x.d.c(this.H);
            this.K = null;
        }
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        RecyclerView recyclerView = this.A;
        if (recyclerView != null) {
            recyclerView.requestFocus();
            q9n.u(this.A);
        }
        if (menuItem.getItemId() == 2131362400) {
            na2.T(getContext());
            return true;
        }
        if (menuItem.getItemId() != 2131362336) {
            if (menuItem.getItemId() != 2131363388) {
                return false;
            }
            zhj.a(new am5(), 4099).c(getContext());
            return true;
        }
        rxh rxhVar = new rxh(2132019074);
        ufe ufeVar = new ufe(this);
        z77 z77VarU = sfe.U(getContext());
        gkj gkjVar = new gkj(false, false);
        gkjVar.a = null;
        gkjVar.b = null;
        gkjVar.c = null;
        gkjVar.d = null;
        gkjVar.e = null;
        gkjVar.f = null;
        gkjVar.g = null;
        gkjVar.h = ufeVar;
        gkjVar.i = null;
        gkjVar.j = null;
        gkjVar.k = 2132018230;
        gkjVar.l = 2132018111;
        gkjVar.m = 2132019075;
        gkjVar.n = true;
        gkjVar.o = rxhVar;
        z77VarU.getClass();
        z77VarU.b(gkjVar, ijm.b);
        return true;
    }

    @Override // defpackage.ltl
    public final void onPause() {
        super.onPause();
        S = false;
    }

    @Override // defpackage.ltl
    public final void onResume() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        mgh mghVar;
        super.onResume();
        byte b = 1;
        S = true;
        xc9 xc9Var = this.w;
        xc9Var.a();
        j.d((SharedPreferences) xc9Var.c.get(), "opened_my_flow_fragment", true);
        tfe tfeVar = new tfe(this, (byte) 1);
        rc9 rc9Var = this.x;
        rc9Var.f.add(tfeVar);
        if (rc9Var.g != null) {
            return;
        }
        bf9 bf9Var = rc9Var.b;
        dg7 dg7Var = new dg7(rc9Var, (byte) 21);
        pc9 pc9VarQ = bf9Var.q();
        if (bf9Var.r() < 2 || pc9VarQ == null) {
            dg7Var.run(Boolean.FALSE);
            mghVar = bf9.A;
        } else {
            mghVar = new mgh((Object) null, dg7Var, (byte) 8);
            mgh mghVar2 = new mgh((Object) null, new su((Object) bf9Var, (Object) mghVar, (Object) dg7Var, (byte) 24), (byte) 8);
            qie qieVar = pc9VarQ.g;
            umi umiVar = pc9VarQ.b;
            nml nmlVarB = umiVar.b(new ec9(pc9VarQ, b));
            nmlVarB.b(umiVar.f(new bm8(mghVar2, (byte) 11)));
            qieVar.n(new oml(nmlVarB), null);
            mghVar.b = mghVar2;
        }
        rc9Var.g = mghVar;
    }

    public final void onStart() {
        super.onStart();
        boolean z = this.Q;
        SettingsManager settingsManager = this.u;
        bf9 bf9Var = this.t;
        if (!z && !settingsManager.r(bf9Var)) {
            gge ggeVar = new gge(bf9Var, settingsManager);
            ggeVar.getLifecycle().a(new ob((Object) this, (byte) 9));
            this.Q = true;
            zhj.a(ggeVar, 4099).c(this.r);
        }
        age ageVar = this.I;
        settingsManager.F(ageVar);
        bf9Var.F(ageVar);
        bf9Var.F(this.J);
    }

    public final void onStop() {
        super.onStop();
        RecyclerView recyclerView = this.A;
        if (recyclerView != null) {
            recyclerView.requestFocus();
            q9n.u(this.A);
        }
        SettingsManager settingsManager = this.u;
        age ageVar = this.I;
        settingsManager.H(ageVar);
        bf9 bf9Var = this.t;
        bf9Var.H(ageVar);
        bf9Var.H(this.J);
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        MenuItem menuItemFindItem = itdVar.findItem(2131362336);
        this.K = menuItemFindItem;
        if (menuItemFindItem != null) {
            rc9 rc9Var = this.x;
            menuItemFindItem.setEnabled(rc9Var.c.size() > 0);
            rc9Var.d.b(this.H);
        }
    }

    @Override // defpackage.jbl
    public final String y() {
        return "flow";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v21, types: [android.widget.TextView, com.opera.android.custom_views.StylingEditText] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.view.View, com.opera.android.custom_views.FadingRecyclerView] */
    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        WeakHashMap weakHashMap = r5n.a;
        ?? r7 = (FadingRecyclerView) ((View) m5n.f(statusBarDrawingFrameLayout, 2131364032));
        this.A = r7;
        p0(statusBarDrawingFrameLayout, r7);
        this.A.getContext();
        dge dgeVar = new dge();
        final byte b = 1;
        dgeVar.setStackFromEnd(true);
        this.A.C0(dgeVar);
        FadingRecyclerView fadingRecyclerView = this.A;
        ((RecyclerView) fadingRecyclerView).t = true;
        ha2 ha2Var = this.y;
        fadingRecyclerView.y0(ha2Var);
        this.A.m(new cge(this.A, ha2Var));
        FadingRecyclerView fadingRecyclerView2 = this.A;
        final byte b2 = 2;
        lv2 lv2Var = new lv2((byte) 2);
        final byte b3 = 0;
        lv2Var.g = false;
        fadingRecyclerView2.B0(lv2Var);
        if (ha2Var.a.size() > 0) {
            this.A.x0(ha2Var.a.size() - 1);
        }
        q9n.f(this.A, new lzb(this, (byte) 16));
        this.A.setOnTouchListener(new vfe(new GestureDetector(this.A.getContext(), new v35(this, (byte) 4)), (byte) 0));
        View view = (View) m5n.f(statusBarDrawingFrameLayout, 2131364219);
        this.B = view;
        view.setEnabled(false);
        this.B.setActivated(false);
        ?? r72 = (StylingEditText) ((View) m5n.f(statusBarDrawingFrameLayout, 2131364217));
        this.F = r72;
        r72.addTextChangedListener(new mj2(this, (byte) 10));
        this.F.setOnFocusChangeListener(new zp2(this, (byte) 5));
        Bundle bundle = this.R;
        if (bundle != null) {
            CharSequence string = bundle.getString("MESSAGE_TEXT");
            if (!TextUtils.isEmpty(string)) {
                this.F.setText(string);
            }
        }
        bq1 bq1Var = this.F;
        View view2 = this.B;
        Objects.requireNonNull(view2);
        bq1Var.setOnEditorActionListener(new ys7(new ca(view2, (byte) 4), (byte) 1));
        this.B.setOnClickListener(new View.OnClickListener(this) { // from class: wfe
            public final /* synthetic */ fge b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) throws JSONException, BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
                byte b4 = b3;
                fge fgeVar = this.b;
                switch (b4) {
                    case 0:
                        Editable text = fgeVar.F.getText();
                        String string2 = aik.t(text).toString();
                        if (!string2.isEmpty()) {
                            rc9 rc9Var = fgeVar.x;
                            hu5 hu5Var = new hu5((Object) fgeVar, (Object) text, (byte) 24);
                            tcl tclVar = rc9Var.a;
                            bf9 bf9Var = rc9Var.b;
                            if (!aib.Q(string2)) {
                                bf9Var.G(string2, hu5Var);
                                break;
                            } else {
                                new b(tclVar, string2, p6l.a, new vzk(bf9Var, "", string2, hu5Var), false);
                                break;
                            }
                        }
                        break;
                    case 1:
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("*/*");
                        fgeVar.r.D(intent, new qj2(fgeVar, (byte) 8));
                        break;
                    default:
                        ha2 ha2Var2 = fgeVar.y;
                        if (fgeVar.A != null && ha2Var2.a.size() != 0) {
                            fgeVar.A.H0(ha2Var2.a.size() - 1);
                            break;
                        }
                        break;
                }
            }
        });
        View view3 = (View) m5n.f(statusBarDrawingFrameLayout, 2131361932);
        this.C = view3;
        view3.setOnClickListener(new View.OnClickListener(this) { // from class: wfe
            public final /* synthetic */ fge b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) throws JSONException, BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
                byte b4 = b;
                fge fgeVar = this.b;
                switch (b4) {
                    case 0:
                        Editable text = fgeVar.F.getText();
                        String string2 = aik.t(text).toString();
                        if (!string2.isEmpty()) {
                            rc9 rc9Var = fgeVar.x;
                            hu5 hu5Var = new hu5((Object) fgeVar, (Object) text, (byte) 24);
                            tcl tclVar = rc9Var.a;
                            bf9 bf9Var = rc9Var.b;
                            if (!aib.Q(string2)) {
                                bf9Var.G(string2, hu5Var);
                                break;
                            } else {
                                new b(tclVar, string2, p6l.a, new vzk(bf9Var, "", string2, hu5Var), false);
                                break;
                            }
                        }
                        break;
                    case 1:
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("*/*");
                        fgeVar.r.D(intent, new qj2(fgeVar, (byte) 8));
                        break;
                    default:
                        ha2 ha2Var2 = fgeVar.y;
                        if (fgeVar.A != null && ha2Var2.a.size() != 0) {
                            fgeVar.A.H0(ha2Var2.a.size() - 1);
                            break;
                        }
                        break;
                }
            }
        });
        View view4 = (View) m5n.f(statusBarDrawingFrameLayout, 2131364139);
        this.D = view4;
        view4.setOnClickListener(new View.OnClickListener(this) { // from class: wfe
            public final /* synthetic */ fge b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) throws JSONException, BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
                byte b4 = b2;
                fge fgeVar = this.b;
                switch (b4) {
                    case 0:
                        Editable text = fgeVar.F.getText();
                        String string2 = aik.t(text).toString();
                        if (!string2.isEmpty()) {
                            rc9 rc9Var = fgeVar.x;
                            hu5 hu5Var = new hu5((Object) fgeVar, (Object) text, (byte) 24);
                            tcl tclVar = rc9Var.a;
                            bf9 bf9Var = rc9Var.b;
                            if (!aib.Q(string2)) {
                                bf9Var.G(string2, hu5Var);
                                break;
                            } else {
                                new b(tclVar, string2, p6l.a, new vzk(bf9Var, "", string2, hu5Var), false);
                                break;
                            }
                        }
                        break;
                    case 1:
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("*/*");
                        fgeVar.r.D(intent, new qj2(fgeVar, (byte) 8));
                        break;
                    default:
                        ha2 ha2Var2 = fgeVar.y;
                        if (fgeVar.A != null && ha2Var2.a.size() != 0) {
                            fgeVar.A.H0(ha2Var2.a.size() - 1);
                            break;
                        }
                        break;
                }
            }
        });
        this.A.o(new yc3(this, (byte) 3));
        atj.a((View) m5n.f(statusBarDrawingFrameLayout, 2131364220));
        CharSequence charSequence = this.O;
        if (charSequence != null) {
            this.F.setText(charSequence);
            this.O = null;
            this.F.requestFocus();
        }
        jvj jvjVar = this.r.D;
        (jvjVar != null ? jvjVar : null).a.b(this.P);
    }
}
