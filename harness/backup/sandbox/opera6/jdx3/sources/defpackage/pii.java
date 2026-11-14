package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.pdf.PdfRenderer;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PrintAttributes;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.opera.android.StatusBarDrawingFrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class pii extends ltl {
    public CharSequence[] A;
    public ro9 B;
    public CharSequence[] C;
    public TextInputLayout D;
    public int E;
    public cii F;
    public final lii G;
    public hii H;
    public ParcelFileDescriptor I;
    public m9f J;
    public k8g K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final ArrayList r;
    public final umi s;
    public final x5f t;
    public qji u;
    public ro9 v;
    public CharSequence[] w;
    public ro9 x;
    public CharSequence[] y;
    public ro9 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public pii(umi umiVar, x5f x5fVar, boolean z) {
        u7k u7kVarJ = u7k.j(2131559278);
        u7kVarJ.s(2132019770);
        itl itlVar = (itl) u7kVarJ.a;
        byte b = 1;
        itlVar.d = true;
        super(itlVar);
        this.E = Integer.MIN_VALUE;
        ArrayList arrayList = new ArrayList(Arrays.asList(hrd.a));
        this.r = arrayList;
        Collections.sort(arrayList, new c9((byte) 28));
        this.s = umiVar;
        this.t = x5fVar;
        byte b2 = 0;
        if (z || i0l.g()) {
            this.G = new r9i(new kii(this, b2), new kii(this, b));
            return;
        }
        kii kiiVar = new kii(this, b2);
        vzk vzkVar = new vzk();
        vzkVar.a = kiiVar;
        this.G = vzkVar;
    }

    public static CharSequence[] I0(Context context, Integer... numArr) {
        CharSequence[] charSequenceArr = new CharSequence[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            charSequenceArr[i] = context.getString(numArr[i].intValue());
        }
        return charSequenceArr;
    }

    public final void G0() {
        qji qjiVar = this.u;
        if (qjiVar != null) {
            cii ciiVar = this.F;
            if (ciiVar != null) {
                qjiVar.e(ciiVar);
                this.F = null;
            }
            this.u.b();
            this.u = null;
        }
        if (isResumed()) {
            dx3 activity = getActivity();
            if (activity != null) {
                qim qimVar = activity.o;
                Objects.requireNonNull(qimVar);
                ysj ysjVar = qimVar.e;
                ysjVar.b(am2.i(2132019015, 5000, ysjVar), ijm.b);
            }
            getParentFragmentManager().U();
        }
    }

    public final void H0(Context context) {
        this.L = true;
        ow3 ow3Var = new ow3(this, context, (byte) 9);
        umi umiVar = this.s;
        nml nmlVarB = umiVar.b(ow3Var);
        nmlVarB.b(umiVar.f(new bii(this, (byte) 3)));
        nmlVarB.a(null);
    }

    public final void J0() {
        if (this.J == null) {
            return;
        }
        if (this.K != null) {
            this.G.y(null);
            this.K = null;
        }
        this.J.getClass();
        this.J = null;
    }

    public final void K0() {
        lii liiVar = this.G;
        liiVar.g(true);
        m9f m9fVar = this.J;
        m9fVar.getClass();
        int i = m9fVar.b;
        int i2 = m9fVar.a;
        k8g k8gVar = this.K;
        PdfRenderer pdfRenderer = (PdfRenderer) m9fVar.c;
        if (k8gVar == null) {
            k8g k8gVar2 = new k8g();
            k8gVar2.a = i2;
            k8gVar2.b = i;
            k8gVar2.c = new ro9(pdfRenderer);
            this.K = k8gVar2;
            liiVar.y(k8gVar2);
        } else {
            ro9 ro9Var = k8gVar.c;
            if (((PdfRenderer) ro9Var.c) != pdfRenderer) {
                ((ExecutorService) ro9Var.d).shutdownNow();
                k8gVar.c = new ro9(pdfRenderer);
                k8gVar.a = i2;
                k8gVar.b = i;
                k8gVar.notifyDataSetChanged();
            } else if (k8gVar.a != i2 || k8gVar.b != i) {
                k8gVar.a = i2;
                k8gVar.b = i;
                k8gVar.notifyItemRangeChanged(0, ro9Var.b);
            }
        }
        liiVar.q();
    }

    public final void L0() {
        boolean z = this.u != null;
        lii liiVar = this.G;
        liiVar.g(z);
        liiVar.n(getString(2132020556));
        liiVar.l(4);
        liiVar.i();
    }

    public final void M0() {
        lii liiVar = this.G;
        liiVar.g(true);
        liiVar.n(getString(2132020555));
        liiVar.l(0);
        liiVar.i();
    }

    public final void N0() {
        PrintAttributes.Margins margins;
        qji qjiVar = this.u;
        PrintAttributes.MediaSize mediaSize = (PrintAttributes.MediaSize) this.r.get(this.v.b);
        PrintAttributes.MediaSize mediaSizeAsPortrait = this.x.b == 0 ? mediaSize.asPortrait() : mediaSize.asLandscape();
        if (this.z.b == 0) {
            int i = mediaSizeAsPortrait.getWidthMils() < 1000 ? 0 : 394;
            int i2 = mediaSizeAsPortrait.getHeightMils() < 1000 ? 0 : 394;
            margins = new PrintAttributes.Margins(i, i2, i, i2);
        } else {
            margins = PrintAttributes.Margins.NO_MARGINS;
        }
        PrintAttributes printAttributesBuild = new PrintAttributes.Builder().setMediaSize(mediaSizeAsPortrait).setMinMargins(margins).setResolution(new PrintAttributes.Resolution("PDF resolution", "PDF resolution", MessageTemplateConstants.Values.CENTER_POPUP_WIDTH, MessageTemplateConstants.Values.CENTER_POPUP_WIDTH)).build();
        if (printAttributesBuild.equals(qjiVar.c())) {
            return;
        }
        qjiVar.o = 0L;
        qjiVar.p = null;
        qjiVar.e = printAttributesBuild;
        SharedPreferences sharedPreferences = (SharedPreferences) qjiVar.d.get();
        PrintAttributes printAttributes = qjiVar.e;
        sharedPreferences.edit().putString("media_size", printAttributes.getMediaSize().getId()).putBoolean("media_portrait", printAttributes.getMediaSize().isPortrait()).putInt("margin_left", printAttributes.getMinMargins().getLeftMils()).putInt("margin_top", printAttributes.getMinMargins().getTopMils()).putInt("margin_right", printAttributes.getMinMargins().getRightMils()).putInt("margin_bottom", printAttributes.getMinMargins().getBottomMils()).apply();
        byte b = qjiVar.l;
        if (b != 0) {
            if (b == 1) {
                qjiVar.h = null;
                qjiVar.g.cancel();
                qjiVar.g = new CancellationSignal();
            } else if (b == 3) {
                if (qjiVar.n) {
                    return;
                }
                pji pjiVar = qjiVar.k;
                if (pjiVar != null) {
                    qjiVar.k = null;
                    pjiVar.T();
                }
                qjiVar.g.cancel();
                qjiVar.g = new CancellationSignal();
                qjiVar.n = true;
                return;
            }
        } else if (qjiVar.j == null) {
            return;
        }
        qjiVar.g(qjiVar.e);
    }

    public final void O0(int i) {
        if (i == 0) {
            if (this.M) {
                L0();
                return;
            } else {
                M0();
                return;
            }
        }
        if (i != 1) {
            if (i == 2) {
                if (this.J != null) {
                    K0();
                    return;
                } else {
                    if (this.L) {
                        M0();
                        return;
                    }
                    return;
                }
            }
            if (i != 3) {
                return;
            }
        }
        M0();
    }

    @Override // defpackage.ltl, defpackage.ryl
    public final void onCreate(Bundle bundle) {
        b2l b2lVarR;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        byte b = 1;
        if (arguments != null && (getActivity() instanceof dx3)) {
            int i = arguments.getInt("tab_id", Integer.MIN_VALUE);
            this.E = i;
            if (i != Integer.MIN_VALUE) {
                dx3 activity = getActivity();
                int i2 = this.E;
                k6l k6lVarW = activity.W();
                qji qjiVar = null;
                if (k6lVarW != null && (b2lVarR = k6lVarW.r(i2)) != null) {
                    d7l d7lVar = (d7l) b2lVarR;
                    if (!d7lVar.m) {
                        umi umiVar = vml.d;
                        if (d7lVar.j.a0() != null) {
                            lyg lygVarC = lyg.c(d7lVar.j.a0());
                            if (!lygVarC.d()) {
                                qji qjiVar2 = new qji(activity, umiVar, b2lVarR);
                                jyg jygVar = lygVarC.b;
                                if (jygVar != null) {
                                    jygVar.m = true;
                                }
                                hh4 hh4VarD = d7lVar.j.D(new qn(lygVarC, activity, b2lVarR, qjiVar2, (byte) 18));
                                c23 c23Var = new c23(hh4VarD, qjiVar2, (byte) 3);
                                d7lVar.F(c23Var);
                                qjiVar2.c.b(new kji(hh4VarD, b2lVarR, c23Var));
                                qjiVar = qjiVar2;
                            }
                        }
                    }
                }
                this.u = qjiVar;
                if (qjiVar != null) {
                    cii ciiVar = new cii(this);
                    this.F = ciiVar;
                    qjiVar.c.b(ciiVar);
                }
            }
        }
        if (this.u != null) {
            hii hiiVar = new hii(this, getContext(), b);
            this.H = hiiVar;
            this.u.c.b(hiiVar);
        }
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        qji qjiVar = this.u;
        if (qjiVar != null) {
            cii ciiVar = this.F;
            if (ciiVar != null) {
                qjiVar.e(ciiVar);
                this.F = null;
            }
            this.u.b();
            this.u = null;
        }
        this.N = true;
        J0();
        this.s.b(new t1(getContext().getApplicationContext(), (byte) 14)).a(null);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.v = null;
        this.x = null;
        this.z = null;
        this.B = null;
        this.D = null;
        this.K = null;
        this.G.destroy();
    }

    @Override // defpackage.ltl
    public final void onResume() {
        super.onResume();
        if (this.u == null) {
            G0();
        }
    }

    @Override // defpackage.ltl
    public final int s0() {
        return 2132018253;
    }

    @Override // defpackage.ltl
    public final int t0(Context context) {
        return 2131232034;
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        ViewGroup viewGroup = (ViewGroup) statusBarDrawingFrameLayout.findViewById(2131362409);
        lii liiVar = this.G;
        Context context = liiVar.v(layoutInflater, viewGroup).getContext();
        x79 x79VarA = liiVar.A();
        za9 za9Var = new za9();
        byte b = 1;
        za9Var.a = true;
        za9Var.b = true;
        TextInputLayout textInputLayout = (TextInputLayout) x79VarA.a;
        this.x = new ro9(textInputLayout, new bii(this, (byte) 0));
        textInputLayout.t(textInputLayout.getResources().getString(2132020973));
        CharSequence[] charSequenceArrI0 = I0(context, 2132020975, 2132020974);
        this.y = charSequenceArrI0;
        ro9 ro9Var = this.x;
        ((AutoCompleteTextView) ro9Var.d).setAdapter(new th6(ro9Var, ((TextInputLayout) ro9Var.c).getContext(), charSequenceArrI0, za9Var));
        TextInputLayout textInputLayout2 = (TextInputLayout) x79VarA.b;
        this.v = new ro9(textInputLayout2, new mgf((Object) this, (Object) za9Var, (byte) 19));
        textInputLayout2.t(textInputLayout2.getResources().getString(2132020982));
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        PackageManager packageManager = context.getPackageManager();
        for (int i = 0; i < size; i++) {
            charSequenceArr[i] = ((PrintAttributes.MediaSize) arrayList.get(i)).getLabel(packageManager);
        }
        this.w = charSequenceArr;
        ro9 ro9Var2 = this.v;
        ((AutoCompleteTextView) ro9Var2.d).setAdapter(new ArrayAdapter(((TextInputLayout) ro9Var2.c).getContext(), 2131559350, charSequenceArr));
        TextInputLayout textInputLayout3 = (TextInputLayout) x79VarA.c;
        this.z = new ro9(textInputLayout3, new bii(this, b));
        textInputLayout3.t(textInputLayout3.getResources().getString(2132020970));
        CharSequence[] charSequenceArrI02 = I0(context, 2132020971, 2132020972);
        this.A = charSequenceArrI02;
        ro9 ro9Var3 = this.z;
        ((AutoCompleteTextView) ro9Var3.d).setAdapter(new ArrayAdapter(((TextInputLayout) ro9Var3.c).getContext(), 2131559350, charSequenceArrI02));
        this.D = (TextInputLayout) x79VarA.e;
        TextInputLayout textInputLayout4 = (TextInputLayout) x79VarA.d;
        this.B = new ro9(textInputLayout4, new bii(this, (byte) 2));
        textInputLayout4.t(textInputLayout4.getResources().getString(2132020977));
        CharSequence[] charSequenceArrI03 = I0(context, 2132020978, 2132020981);
        this.C = charSequenceArrI03;
        ro9 ro9Var4 = this.B;
        ((AutoCompleteTextView) ro9Var4.d).setAdapter(new ArrayAdapter(((TextInputLayout) ro9Var4.c).getContext(), 2131559350, charSequenceArrI03));
        this.D.e.setOnFocusChangeListener(new nu((byte) 1));
        qji qjiVar = this.u;
        if (qjiVar != null) {
            PrintAttributes printAttributesC = qjiVar.c();
            PrintAttributes.MediaSize mediaSize = printAttributesC.getMediaSize();
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (mediaSize.getId().equals(((PrintAttributes.MediaSize) arrayList.get(i2)).getId())) {
                    this.v.a0(i2, this.w[i2]);
                    break;
                }
                i2++;
            }
            int i3 = !mediaSize.isPortrait() ? 1 : 0;
            this.x.a0(i3, this.y[i3]);
            boolean zEquals = printAttributesC.getMinMargins().equals(PrintAttributes.Margins.NO_MARGINS);
            this.z.a0(zEquals ? 1 : 0, this.A[zEquals ? 1 : 0]);
        }
        this.B.a0(0, this.C[0]);
        qji qjiVar2 = this.u;
        if (qjiVar2 == null) {
            M0();
            return;
        }
        byte b2 = qjiVar2.l;
        if (b2 == 2 && this.J == null && !this.L) {
            H0(getContext());
        } else {
            O0(b2);
        }
    }
}
