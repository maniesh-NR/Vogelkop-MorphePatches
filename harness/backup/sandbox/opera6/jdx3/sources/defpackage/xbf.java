package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.leanplum.messagetemplates.OperaWallpaperSheet$initializeSheetRequest$2$1;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.browser.BrowserTabState;
import com.opera.android.browser.SessionStore;
import com.opera.android.browser.TabInfo;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.oauth2.OAuth2Account;
import com.opera.android.oauth2.OperaAccessToken;
import com.opera.android.settings.SettingsManager;
import com.opera.android.startup.WelcomeActivity;
import com.opera.android.ui.catalog.widget.OperaTextView;
import com.opera.android.widget.ThemeableLottieAnimationView;
import com.opera.api.Callback;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xbf implements ijf, fi, bag, zln {
    public static xbf h;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public xbf(byte b) {
        this.a = b;
        switch (b) {
            case 7:
                rxh rxhVar = new rxh(2132017438);
                rxh rxhVar2 = new rxh(2132019043);
                rxh rxhVar3 = new rxh(2132020617);
                rxh rxhVar4 = new rxh(2132019049);
                rxh rxhVar5 = new rxh(2132020043);
                h58 h58Var = mjh.a;
                this.b = rxhVar;
                this.c = rxhVar2;
                this.d = rxhVar3;
                this.e = rxhVar4;
                this.f = rxhVar5;
                this.g = h58Var;
                break;
            case 12:
                this.b = new int[4];
                this.c = new float[4];
                this.d = new RectF();
                this.e = new Paint();
                this.f = new Paint(1);
                this.g = new Matrix();
                break;
        }
    }

    public xbf(Context context, umi umiVar, SettingsManager settingsManager, glh glhVar, pjg pjgVar) {
        this.a = (byte) 16;
        qie qieVar = new qie((byte) 19);
        this.f = qieVar;
        this.b = context.getApplicationContext();
        this.e = umiVar;
        this.c = settingsManager;
        this.d = glhVar;
        this.g = pjgVar;
        if (glhVar.e() || h != null) {
            return;
        }
        h = this;
        nml nmlVarB = umiVar.b(new jjg(this, (byte) 9));
        nmlVarB.b(umiVar.f(new exk(this, (byte) 0)));
        qieVar.n(new oml(nmlVarB), null);
    }

    public xbf(Context context, umi umiVar, e00 e00Var, k32 k32Var, kw0 kw0Var, jjg jjgVar) {
        this.a = (byte) 2;
        ode odeVar = new ode();
        this.e = odeVar;
        ode odeVar2 = new ode();
        this.f = odeVar2;
        this.g = b8h.j(odeVar, new w5f(this));
        i32 i32Var = new i32(umiVar, k32Var, (byte) 8);
        this.b = i32Var;
        i32Var.h();
        x79 x79Var = new x79();
        x79Var.a = new qie(context, (byte) 6);
        x79Var.b = e00Var;
        x79Var.c = kw0Var;
        x79Var.d = context.getApplicationContext();
        this.c = x79Var;
        this.d = jjgVar;
        odeVar.r(Collections.EMPTY_LIST);
        i32Var.f(new q2g(i32Var, new j12(new m2g(odeVar, (byte) 3), (byte) 11), (byte) 0));
        i(new m2g(odeVar2, (byte) 0));
    }

    public xbf(Context context, zg zgVar, bl blVar, aoo aooVar, ltm ltmVar) {
        this.a = (byte) 23;
        this.b = new plk(context, aooVar, ltmVar);
        this.d = blVar;
        this.c = zgVar;
        this.e = f1p.a().p((String) zgVar.b);
        this.f = (String) zgVar.c;
        this.g = aooVar;
    }

    public xbf(BrowserActivity browserActivity, qln qlnVar, SettingsManager settingsManager, OperaWallpaperSheet$initializeSheetRequest$2$1 operaWallpaperSheet$initializeSheetRequest$2$1) {
        this.a = (byte) 20;
        this.d = browserActivity;
        this.e = qlnVar;
        this.f = settingsManager;
        this.g = operaWallpaperSheet$initializeSheetRequest$2$1;
    }

    public xbf(WelcomeActivity welcomeActivity, tzn tznVar, final vzn vznVar, final tzn tznVar2, final msl mslVar, final umi umiVar, final vzn vznVar2, final vzn vznVar3, final vzn vznVar4, final wzn wznVar, xbf xbfVar) {
        this.a = (byte) 21;
        this.b = xbfVar;
        this.c = welcomeActivity;
        this.d = tznVar;
        this.e = new j4c(new esk() { // from class: zzn
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, com.opera.android.startup.WelcomeActivity] */
            public final Object get() {
                String[] strArr = OperaApplication.K;
                xbf xbfVar2 = this.a;
                ?? r4 = (WelcomeActivity) xbfVar2.c;
                OperaApplication operaApplication = (OperaApplication) r4.getApplication();
                return new yzn(r4, (mcj) vznVar.get(), tznVar2, mslVar, umiVar, new wv1(new pw3(operaApplication, OperaApplication.class, "usageReporter", "getUsageReporter()Lcom/opera/android/analytics/UsageReporter;", 0, (byte) 15), (byte) 4), new wv1(new pw3(operaApplication, OperaApplication.class, "onboardingReporter", "getOnboardingReporter()Lcom/opera/android/onboarding/OnboardingReporter;", 0, (byte) 16), (byte) 4), (j4c) xbfVar2.f, new wv1(new pw3(operaApplication, OperaApplication.class, "cmpConsentController", "getCmpConsentController()Lcom/opera/android/cmpconsent/CmpConsentController;", 0, (byte) 17), (byte) 4), vznVar2, vznVar3, vznVar4, wznVar, ((mi) ((xbf) xbfVar2.b).b).m);
            }
        }, (byte) 1);
        this.f = new j4c(new a0o(this, (byte) 0), (byte) 1);
        this.g = new j4c(new a0o(this, (byte) 1), (byte) 1);
    }

    public xbf(ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.a = (byte) 19;
        this.b = themeableLottieAnimationView;
        this.e = new rii((Object) this, (byte) 18);
        this.f = ubn.a;
        this.g = new wbn(new m2n(this, (byte) 2));
        themeableLottieAnimationView.z(new i3d("Fill / Primary", 2130969303), new i3d("Fill / On primary", 2130969273), new i3d("Fill / On surface variant", 2130969288), new i3d("Fill / Omnibox buttons", 2130969247));
        themeableLottieAnimationView.v(i3d.a("Button outline"), k3d.k, new tbn(this));
        dvb dvbVarA = i3d.a("Button outline");
        Integer[] numArr = k3d.G;
        qll qllVar = new qll(new tbn(this));
        themeableLottieAnimationView.u.add(qllVar);
        themeableLottieAnimationView.v(dvbVarA, numArr, new crk(qllVar, (byte) 12));
        ((n2d) themeableLottieAnimationView).d.b.addUpdateListener(new nl2(this, (byte) 19));
    }

    public xbf(d7l d7lVar, FrameLayout frameLayout, View view, ChromiumContainerView chromiumContainerView, k6l k6lVar, w3a w3aVar, boolean z) {
        int width;
        int i;
        this.a = (byte) 17;
        this.b = frameLayout;
        this.c = view;
        this.d = chromiumContainerView;
        this.e = k6lVar;
        boolean z2 = frameLayout.getLayoutDirection() == 1;
        int iA = z ? fan.a(24.0f, view.getResources()) : 0;
        if (z2) {
            i = -(view.getWidth() + iA);
            width = -iA;
        } else {
            int width2 = view.getWidth() + iA;
            width = view.getWidth();
            i = width2;
        }
        frameLayout.setVisibility(0);
        View view2 = new View(frameLayout.getContext());
        this.f = view2;
        view2.setBackgroundColor(f03.t(2130970976, view2.getContext(), 2131101243));
        view2.setForeground(w3aVar);
        frameLayout.addView(view2, -1, -1);
        View view3 = new View(frameLayout.getContext());
        this.g = view3;
        view3.setVisibility(z ? 0 : 4);
        view3.setBackground(sgb.F(2131233235, view3.getContext()));
        frameLayout.addView(view3, new FrameLayout.LayoutParams(iA, -1, 3));
        view3.setTranslationX(width);
        new xz2(view2, new h3l(this, d7lVar, width, i));
    }

    public xbf(db dbVar, wv1 wv1Var) {
        this.a = (byte) 13;
        this.b = dbVar;
        this.c = wv1Var;
        this.d = new ode();
        nj2 nj2Var = new nj2(this, (byte) 5);
        this.e = new ArrayList();
        dbVar.a(nj2Var);
    }

    public xbf(dya dyaVar, Context context, qie qieVar, bm8 bm8Var) {
        this.a = (byte) 6;
        z8b z8bVar = new z8b(context, qieVar);
        this.b = context;
        this.c = qieVar;
        this.d = z8bVar;
        this.e = bm8Var;
        Parcel parcelObtain = Parcel.obtain();
        int i = 0;
        dyaVar.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        dya dyaVar2 = new dya(parcelObtain);
        parcelObtain.recycle();
        this.f = dyaVar2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = dyaVar2.d;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (obj instanceof f76) {
                arrayList.add(obj);
            }
        }
        this.g = arrayList;
    }

    public xbf(esk eskVar, esk eskVar2, esk eskVar3, Function1 function1, esk eskVar4, dbf dbfVar) {
        this.a = (byte) 0;
        this.b = eskVar;
        this.c = eskVar2;
        this.d = eskVar3;
        this.f = function1;
        this.e = eskVar4;
        this.g = dbfVar;
    }

    public xbf(hjf hjfVar, umi umiVar, mi miVar) {
        final byte b = 1;
        this.a = (byte) 1;
        this.b = miVar;
        this.c = hjfVar;
        this.d = umiVar;
        final byte b2 = 0;
        this.e = new j4c(new esk(this) { // from class: jjf
            public final /* synthetic */ xbf b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b3 = b2;
                xbf xbfVar = this.b;
                switch (b3) {
                    case 0:
                        ndc ndcVar = (hjf) xbfVar.c;
                        umi umiVar2 = (umi) xbfVar.d;
                        ii iiVar = xne.b;
                        mi miVar2 = (mi) xbfVar.b;
                        SettingsManager settingsManagerA = miVar2.a();
                        dll dllVar = ndcVar.a;
                        rqd rqdVar = z7f.k;
                        return new qln(ndcVar, ndcVar, umiVar2, iiVar, settingsManagerA, dllVar, ipe.E(ndcVar.getApplicationContext()), (onn) miVar2.A.get(), (x4i) ((j4c) xbfVar.g).get());
                    case 1:
                        return new ekn((hjf) xbfVar.c, (umi) xbfVar.d);
                    default:
                        String[] strArr = OperaApplication.K;
                        fp1 fp1Var = (hjf) xbfVar.c;
                        OperaApplication operaApplication = (OperaApplication) fp1Var.getApplication();
                        return new x4i((y3i) operaApplication.G.get(), ((k3i) operaApplication.D.get()).a(), ru9.c(fp1Var), fp1Var);
                }
            }
        }, (byte) 1);
        this.f = new j4c(new esk(this) { // from class: jjf
            public final /* synthetic */ xbf b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b3 = b;
                xbf xbfVar = this.b;
                switch (b3) {
                    case 0:
                        ndc ndcVar = (hjf) xbfVar.c;
                        umi umiVar2 = (umi) xbfVar.d;
                        ii iiVar = xne.b;
                        mi miVar2 = (mi) xbfVar.b;
                        SettingsManager settingsManagerA = miVar2.a();
                        dll dllVar = ndcVar.a;
                        rqd rqdVar = z7f.k;
                        return new qln(ndcVar, ndcVar, umiVar2, iiVar, settingsManagerA, dllVar, ipe.E(ndcVar.getApplicationContext()), (onn) miVar2.A.get(), (x4i) ((j4c) xbfVar.g).get());
                    case 1:
                        return new ekn((hjf) xbfVar.c, (umi) xbfVar.d);
                    default:
                        String[] strArr = OperaApplication.K;
                        fp1 fp1Var = (hjf) xbfVar.c;
                        OperaApplication operaApplication = (OperaApplication) fp1Var.getApplication();
                        return new x4i((y3i) operaApplication.G.get(), ((k3i) operaApplication.D.get()).a(), ru9.c(fp1Var), fp1Var);
                }
            }
        }, (byte) 1);
        final byte b3 = 2;
        this.g = new j4c(new esk(this) { // from class: jjf
            public final /* synthetic */ xbf b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b32 = b3;
                xbf xbfVar = this.b;
                switch (b32) {
                    case 0:
                        ndc ndcVar = (hjf) xbfVar.c;
                        umi umiVar2 = (umi) xbfVar.d;
                        ii iiVar = xne.b;
                        mi miVar2 = (mi) xbfVar.b;
                        SettingsManager settingsManagerA = miVar2.a();
                        dll dllVar = ndcVar.a;
                        rqd rqdVar = z7f.k;
                        return new qln(ndcVar, ndcVar, umiVar2, iiVar, settingsManagerA, dllVar, ipe.E(ndcVar.getApplicationContext()), (onn) miVar2.A.get(), (x4i) ((j4c) xbfVar.g).get());
                    case 1:
                        return new ekn((hjf) xbfVar.c, (umi) xbfVar.d);
                    default:
                        String[] strArr = OperaApplication.K;
                        fp1 fp1Var = (hjf) xbfVar.c;
                        OperaApplication operaApplication = (OperaApplication) fp1Var.getApplication();
                        return new x4i((y3i) operaApplication.G.get(), ((k3i) operaApplication.D.get()).a(), ru9.c(fp1Var), fp1Var);
                }
            }
        }, (byte) 1);
    }

    public /* synthetic */ xbf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public xbf(jpk jpkVar) {
        this.a = (byte) 14;
        this.b = jpkVar;
    }

    public xbf(ng6 ng6Var, c6i c6iVar, s2 s2Var) {
        this.a = (byte) 9;
        this.b = ng6Var;
        this.c = c6iVar;
        ArrayList arrayList = ng6Var.e;
        String str = ng6Var.b;
        psk pskVar = ng6Var.c;
        this.d = arrayList;
        if (pskVar == null) {
            qp2.o("SQLiteManager was constructed with both null driver and open helper factory!");
            throw null;
        }
        qsk qskVarB = pskVar.b(new ev4(ng6Var.a, str, new s5i(this, c6iVar.a), false, false));
        this.f = qskVarB;
        this.e = new l3g(new qie((Object) qskVarB, (byte) 29), str == null ? ":memory:" : str, s2Var);
        qskVarB.setWriteAheadLoggingEnabled(ng6Var.g == w5i.b);
    }

    public xbf(ng6 ng6Var, rmg rmgVar, s2 s2Var) {
        this.a = (byte) 9;
        this.b = ng6Var;
        this.c = new r5i(-1, "", "");
        ArrayList arrayList = ng6Var.e;
        this.d = arrayList;
        ArrayList arrayListW = CollectionsKt.W(new t5i(new rmg(this, (byte) 27), (byte) 0), arrayList);
        Context context = ng6Var.a;
        String str = ng6Var.b;
        psk pskVar = ng6Var.c;
        x5i x5iVar = ng6Var.d;
        boolean z = ng6Var.f;
        w5i w5iVar = ng6Var.g;
        qsk qskVarG = ((y5i) rmgVar.b).g(new ng6(context, str, pskVar, x5iVar, arrayListW, z, w5iVar, ng6Var.h, ng6Var.i, ng6Var.j, ng6Var.k, ng6Var.l, ng6Var.m, ng6Var.n, ng6Var.o));
        this.f = qskVarG;
        qie qieVar = new qie((Object) qskVarG, (byte) 29);
        String str2 = ng6Var.b;
        this.e = new l3g(qieVar, str2 == null ? ":memory:" : str2, s2Var);
        boolean z2 = w5iVar == w5i.b;
        if (qskVarG != null) {
            qskVarG.setWriteAheadLoggingEnabled(z2);
        }
    }

    public xbf(olh olhVar, BrowserActivity browserActivity, d7l d7lVar, String str, String str2, xx1 xx1Var) {
        this.a = (byte) 8;
        this.b = browserActivity;
        this.c = d7lVar;
        this.d = str;
        this.e = str2;
        this.f = xx1Var;
        this.g = olhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xbf(pde pdeVar, k6l k6lVar, u4l u4lVar, s9i s9iVar, p9l p9lVar, StylingImageButton stylingImageButton, OperaTextView operaTextView, StylingImageButton stylingImageButton2, j1k j1kVar) {
        this.a = (byte) 11;
        this.b = k6lVar;
        this.c = u4lVar;
        this.d = s9iVar;
        this.e = p9lVar;
        this.f = operaTextView;
        this.g = j1kVar;
        final byte b = 0;
        stylingImageButton.setOnClickListener(new View.OnClickListener(this) { // from class: ozi
            public final /* synthetic */ xbf b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                xbf xbfVar = this.b;
                switch (b2) {
                    case 0:
                        ((s9i) xbfVar.d).h0();
                        break;
                    default:
                        ((j1k) xbfVar.g).invoke();
                        new ge(new tji(xbfVar, (byte) 8)).o(view);
                        break;
                }
            }
        });
        a26.T((pde) s9iVar.c, pdeVar, new f7f(this) { // from class: pzi
            public final /* synthetic */ xbf b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                xbf xbfVar = this.b;
                switch (b2) {
                    case 0:
                        xbfVar.d();
                        break;
                    default:
                        xbfVar.d();
                        break;
                }
            }
        });
        pde pdeVar2 = (pde) s9iVar.d;
        final byte b2 = 1;
        a26.T(pdeVar2, pdeVar, new f7f(this) { // from class: pzi
            public final /* synthetic */ xbf b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                xbf xbfVar = this.b;
                switch (b22) {
                    case 0:
                        xbfVar.d();
                        break;
                    default:
                        xbfVar.d();
                        break;
                }
            }
        });
        stylingImageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: ozi
            public final /* synthetic */ xbf b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                xbf xbfVar = this.b;
                switch (b22) {
                    case 0:
                        ((s9i) xbfVar.d).h0();
                        break;
                    default:
                        ((j1k) xbfVar.g).invoke();
                        new ge(new tji(xbfVar, (byte) 8)).o(view);
                        break;
                }
            }
        });
    }

    public xbf(tjg tjgVar, ode odeVar, pod podVar, mhd mhdVar, jjg jjgVar) {
        this.a = (byte) 4;
        this.b = tjgVar;
        this.c = odeVar;
        this.d = podVar;
        this.e = jjgVar;
        p12 p12Var = new p12();
        p12Var.f = new uld(p12Var);
        p12Var.g = new we7(p12Var, new vld(p12Var), (byte) 3);
        p12Var.h = new se3(p12Var);
        p12Var.a = this;
        this.f = p12Var;
        gig gigVar = (gig) odeVar.g();
        uuj uujVar = new uuj();
        uujVar.b = new h7f();
        uujVar.a = 100;
        uujVar.c = gigVar;
        this.g = uujVar;
    }

    public xbf(vzk vzkVar, iga igaVar, rc6 rc6Var, tw2 tw2Var) {
        this.a = (byte) 18;
        this.b = vzkVar;
        this.c = igaVar;
        this.d = rc6Var;
        this.e = tw2Var;
    }

    public xbf(w6j w6jVar, eyi eyiVar, epk epkVar, epk epkVar2, epk epkVar3, gpk gpkVar, epk epkVar4) {
        this.a = (byte) 15;
        ode odeVar = new ode();
        this.b = odeVar;
        this.c = b8h.j(odeVar, new r4k((byte) 19));
        this.d = b8h.j(odeVar, new r4k((byte) 20));
        this.e = w6jVar;
        this.f = new w6j(epkVar, epkVar2, epkVar3, gpkVar, epkVar4);
        this.g = eyiVar;
    }

    public static void F(xbf xbfVar, j7h j7hVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        lqm lqmVarE = i != 0 ? eti.e(i) : lqm.a;
        sko.s(((esk) xbfVar.e).get());
        new wbf(xbfVar, j7hVar, i, lqmVarE).b();
    }

    public static String w(String str) {
        int i;
        int iIndexOf;
        int i2;
        int iIndexOf2;
        String string;
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            int iIndexOf3 = strTrim.indexOf("=?", i3);
            if (iIndexOf3 == -1) {
                if (i3 == 0) {
                    return strTrim;
                }
                sb.append(strTrim.substring(i3));
                return sb.toString();
            }
            sb.append(strTrim.substring(i3, iIndexOf3));
            int i4 = iIndexOf3 + 2;
            int iIndexOf4 = strTrim.indexOf(63, i4);
            if (iIndexOf4 == -1 || (iIndexOf = strTrim.indexOf(63, (i = iIndexOf4 + 1))) == -1 || (iIndexOf2 = strTrim.indexOf("?=", (i2 = iIndexOf + 1))) == -1) {
                return strTrim;
            }
            String strSubstring = strTrim.substring(i4, iIndexOf4);
            String strSubstring2 = strTrim.substring(i, iIndexOf);
            try {
                Charset charsetForName = Charset.forName(strSubstring);
                String strSubstring3 = strTrim.substring(i2, iIndexOf2);
                if (strSubstring2.equals("Q")) {
                    string = jpo.y(strSubstring3, charsetForName);
                } else {
                    if (!strSubstring2.equals("B")) {
                        return strTrim;
                    }
                    string = null;
                    try {
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(Base64.decode(strSubstring3, 0));
                        CharsetDecoder charsetDecoderNewDecoder = charsetForName.newDecoder();
                        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                        string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(byteBufferWrap).toString();
                    } catch (IllegalArgumentException | CharacterCodingException unused) {
                    }
                }
                if (string == null) {
                    return strTrim;
                }
                sb.append(string);
                i3 = iIndexOf2 + 2;
            } catch (IllegalCharsetNameException | UnsupportedCharsetException unused2) {
                return strTrim;
            }
        }
    }

    public final void A(Callback callback) {
        db dbVar = (db) this.b;
        OperaAccessToken operaAccessToken = (OperaAccessToken) this.f;
        if (operaAccessToken != null) {
            if (!operaAccessToken.a()) {
                callback.run(operaAccessToken.a);
                return;
            }
            this.f = null;
        }
        if (!dbVar.a.f) {
            ((ArrayList) this.e).add(callback);
            return;
        }
        if (dbVar.d()) {
            callback.run(null);
            return;
        }
        eme emeVar = new eme(dbVar, new eof((Object) this, (Object) callback, (byte) 25));
        OAuth2Account oAuth2Account = dbVar.c;
        if (oAuth2Account == null) {
            emeVar.b();
        } else {
            oAuth2Account.a(1, emeVar);
        }
    }

    public final void B() {
        List list;
        List list2;
        List list3;
        List list4;
        List list5 = (List) this.c;
        if (list5 == null || (list = (List) this.d) == null || (list2 = (List) this.e) == null || (list3 = (List) this.f) == null || (list4 = (List) this.g) == null) {
            return;
        }
        ((jpk) this.b).run(new pok(list5, list, list2, list3, list4));
    }

    public final ParcelFileDescriptor C(Uri uri) {
        return "file".equals(uri.getScheme()) ? ParcelFileDescriptor.open(new File(uri.getPath()), 268435456) : ((Context) this.b).getContentResolver().openFileDescriptor(uri, "r");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r12 != r2) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0098: IGET (r12 I:int) = (r7 I:android.graphics.Point) android.graphics.Point.x int, block:B:33:0x0098 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v3, types: [float] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.graphics.Point, int] */
    /* JADX WARN: Type inference failed for: r10v5, types: [float] */
    /* JADX WARN: Type inference failed for: r11v1, types: [float] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.graphics.Point] */
    /* JADX WARN: Type inference failed for: r9v0, types: [xbf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(android.graphics.Point r10, defpackage.qnn r11, nt5 r12) throws android.content.res.Resources.NotFoundException {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f
            dya r0 = (defpackage.dya) r0
            android.graphics.PointF r0 = r0.b
            boolean r1 = r12 instanceof defpackage.ijh
            if (r1 == 0) goto L19
            r1 = r12
            ijh r1 = (defpackage.ijh) r1
            int r2 = r1.B
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L19
            int r2 = r2 - r3
            r1.B = r2
            goto L1e
        L19:
            ijh r1 = new ijh
            r1.<init>(r9, r12)
        L1e:
            java.lang.Object r12 = r1.z
            px5 r2 = px5.a
            int r3 = r1.B
            r4 = 1
            r5 = 2
            r6 = 0
            if (r3 == 0) goto L49
            if (r3 == r4) goto L43
            if (r3 != r5) goto L3d
            int r10 = r1.y
            float r11 = r1.x
            float r0 = r1.w
            float r3 = r1.v
            android.graphics.Point r7 = r1.u
            qnn r8 = r1.t
            ybh.y(r12)     // Catch: java.lang.OutOfMemoryError -> L98
            return r12
        L3d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r9)
            return r6
        L43:
            qnn r11 = r1.t
            ybh.y(r12)
            goto L63
        L49:
            ybh.y(r12)
            float r12 = r0.x
            r3 = 0
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 <= 0) goto La4
            float r12 = r0.y
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 <= 0) goto La4
            r1.t = r11
            r1.B = r4
            java.lang.Object r12 = r9.q(r10, r1)
            if (r12 == r2) goto L96
        L63:
            android.graphics.Point r12 = (android.graphics.Point) r12
            if (r12 == 0) goto La4
            int r10 = r12.x
            float r10 = (float) r10
            float r3 = r0.x
            float r10 = r10 / r3
            int r3 = r12.y
            float r3 = (float) r3
            float r0 = r0.y
            float r3 = r3 / r0
            float r0 = r10 + r3
            r7 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r7
            r7 = 0
            r8 = r11
            r11 = r0
            r0 = r3
            r3 = r10
            r10 = r7
            r7 = r12
        L7f:
            r12 = 4
            if (r10 >= r12) goto La4
            r1.t = r8     // Catch: java.lang.OutOfMemoryError -> L98
            r1.u = r7     // Catch: java.lang.OutOfMemoryError -> L98
            r1.v = r3     // Catch: java.lang.OutOfMemoryError -> L98
            r1.w = r0     // Catch: java.lang.OutOfMemoryError -> L98
            r1.x = r11     // Catch: java.lang.OutOfMemoryError -> L98
            r1.y = r10     // Catch: java.lang.OutOfMemoryError -> L98
            r1.B = r5     // Catch: java.lang.OutOfMemoryError -> L98
            java.lang.Object r9 = r9.x(r7, r11, r8, r1)     // Catch: java.lang.OutOfMemoryError -> L98
            if (r9 != r2) goto L97
        L96:
            return r2
        L97:
            return r9
        L98:
            int r12 = r7.x
            int r12 = r12 / r5
            r7.x = r12
            int r12 = r7.y
            int r12 = r12 / r5
            r7.y = r12
            int r10 = r10 + r4
            goto L7f
        La4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbf.D(android.graphics.Point, qnn, nt5):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.opera.android.widget.LottieAnimationView, com.opera.android.widget.ThemeableLottieAnimationView] */
    public final void E(s75 s75Var, Runnable runnable) {
        k2d k2dVar = (k2d) s75Var.c;
        ?? r1 = (ThemeableLottieAnimationView) this.b;
        if (s75Var.equals((s75) this.d)) {
            return;
        }
        this.d = s75Var;
        wbn wbnVar = (wbn) this.g;
        if (!wbnVar.c.equals(s75Var)) {
            wbnVar.c = s75Var;
            wbnVar.d = k2dVar.a;
        }
        r1.t(k2dVar, runnable);
        n1h.n((View) r1, s75Var.b, 0);
    }

    public final void G(h0d h0dVar) {
        xf8.E0((ode) this.d, h0dVar);
        if (h0dVar != h0d.c) {
            this.f = null;
        }
    }

    public final void a(View view) {
        zg zgVar = (zg) this.c;
        String str = (String) this.f;
        bl blVar = (bl) this.d;
        plk plkVar = (plk) this.b;
        String str2 = (String) this.e;
        if (str2 != null) {
            if (TextUtils.isEmpty(str) || ((blVar == null || !blVar.h(str)) && !plkVar.g(str))) {
                plkVar.b = view;
                int i = a2p.a[vep.A(zgVar.a)];
                if (i == 1) {
                    if (blVar == null || !blVar.k(str2)) {
                        plkVar.k(str2);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (blVar == null || !blVar.a(str2)) {
                        plkVar.a(str2);
                        return;
                    }
                    return;
                }
                if (i == 3) {
                    String str3 = (String) zgVar.d;
                    if (blVar == null || !blVar.e(str2, str3)) {
                        plkVar.e(str2, str3);
                        return;
                    }
                    aoo aooVar = (aoo) this.g;
                    if (aooVar != null) {
                        aooVar.m();
                    }
                }
            }
        }
    }

    @Override // defpackage.ijf
    public final Lazy b() {
        switch (this.a) {
            case 1:
                break;
            default:
                ((xbf) this.b).getClass();
                break;
        }
        return null;
    }

    @Override // defpackage.zln
    public final void c(xq3 xq3Var, hjm hjmVar) {
        SettingsManager settingsManager = (SettingsManager) this.f;
        xf8.F0((pde) ((qln) this.e).k.b, v08.a);
        if (ymn.n == xq3Var) {
            ymn.n = null;
        }
        if (((g7j) this.c) != settingsManager.g()) {
            settingsManager.V(1, "app_theme_accent_changed_by_user");
        }
        ((OperaWallpaperSheet$initializeSheetRequest$2$1) this.g).onFinished(hjmVar, !Intrinsics.a(r1.i(), (String) this.b));
    }

    public final void d() {
        s9i s9iVar = (s9i) this.d;
        int size = ((LinkedHashSet) ((pde) s9iVar.c).g()).size();
        OperaTextView operaTextView = (OperaTextView) this.f;
        operaTextView.setText(s9iVar.W() ? operaTextView.getResources().getString(2132021034) : operaTextView.getResources().getQuantityString(2131886173, size, Integer.valueOf(size)));
    }

    public final void e(ArrayList arrayList, HashSet hashSet) {
        umi umiVar = (umi) this.e;
        glh glhVar = (glh) this.d;
        if (glhVar.e()) {
            h = null;
            return;
        }
        if (!arrayList.isEmpty()) {
            glhVar.a(new h95(arrayList, new b10((byte) 28)), false);
        }
        if (hashSet.isEmpty()) {
            h = null;
            return;
        }
        qie qieVar = (qie) this.f;
        nml nmlVarB = umiVar.b(new ow3(this, hashSet, (byte) 11));
        nmlVarB.b(umiVar.f(new exk(this, (byte) 1)));
        qieVar.n(new oml(nmlVarB), null);
    }

    @Override // defpackage.bag
    public final v9g g(Activity activity, List list) {
        return new t9g(activity, 2132018642, activity.getString(2132018641));
    }

    public final xm5 h() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                return ((mi) obj).D;
            default:
                return ((mi) ((xbf) obj).b).h();
        }
    }

    public final void i(Callback callback) {
        i32 i32Var = (i32) this.b;
        j12 j12Var = new j12(callback, (byte) 10);
        i32Var.getClass();
        i32Var.f(new q2g(i32Var, j12Var, (byte) 1));
    }

    @Override // defpackage.zln
    public final void j() {
        ((BrowserActivity) this.d).y1();
        this.b = ((qln) this.e).i();
        this.c = ((SettingsManager) this.f).g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(DialogTitle dialogTitle, StylingTextView stylingTextView, Button button, Button button2, TextInputLayout textInputLayout, Function1 function1) {
        na2.S(dialogTitle, ((rxh) this.b).a(dialogTitle.getResources()));
        na2.S(stylingTextView, ((rxh) this.c).a(stylingTextView.getResources()));
        textInputLayout.t(((rxh) this.d).a(textInputLayout.getResources()));
        ro9 ro9Var = new ro9(textInputLayout, new mgf((Object) function1, (Object) this, (byte) 11));
        h58 h58Var = (h58) this.g;
        ArrayList arrayList = new ArrayList(k95.o(h58Var, 10));
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (w4VarE.hasNext()) {
            arrayList.add(textInputLayout.getContext().getString(((sx8) w4VarE.next()).a));
        }
        ((AutoCompleteTextView) ro9Var.d).setAdapter(new ArrayAdapter(((TextInputLayout) ro9Var.c).getContext(), 2131559350, arrayList.toArray(new String[0])));
        button.setText(((rxh) this.e).a(button.getResources()));
        button2.setText(((rxh) this.f).a(button2.getResources()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0072, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.chromium.media.PhotoCapabilities m() {
        /*
            Method dump skipped, instructions count: 192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbf.m():org.chromium.media.PhotoCapabilities");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bag
    public final v9g n(dx3 dx3Var, ArrayList arrayList) {
        return new t9g(dx3Var, dx3Var.getString(2132018640, dx3Var.getString(2132017591)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(android.graphics.Point r8, nt5 r9) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbf.q(android.graphics.Point, nt5):java.lang.Object");
    }

    public final d7l r(a9l a9lVar) {
        return new d7l(this, new ilj((vzk) this.b, a9lVar.i(), a9lVar.m(), a9lVar.a()), (tw2) this.e, (aal) this.f, (iga) this.c, (rc6) this.d, lqm.j);
    }

    @Override // defpackage.bag
    public final void s() {
        ((xx1) this.f).run(-1L);
    }

    @Override // defpackage.bag
    public final void t() {
        ((olh) this.g).c((BrowserActivity) this.b, (d7l) this.c, (String) this.d, (String) this.e, (xx1) this.f);
    }

    public final d7l u(TabInfo tabInfo, boolean z, lqm lqmVar) {
        String strE = ((iga) this.c).e();
        lsc lscVarF = wqm.f(strE, null, lqmVar);
        if (lscVarF != null) {
            return v(tabInfo, z, lqmVar, lscVarF, true, null);
        }
        qp2.n(sko.j("Initial URL not valid: ", strE));
        return null;
    }

    public final d7l v(TabInfo tabInfo, boolean z, lqm lqmVar, lsc lscVar, boolean z2, List list) {
        TabInfo tabInfo2;
        jke jkeVarI;
        int i;
        String str;
        vzk vzkVar = (vzk) this.b;
        if (list == null) {
            int iL = vzkVar.L(z);
            SessionStore sessionStore = (SessionStore) this.g;
            if (sessionStore == null || z) {
                tabInfo2 = tabInfo;
                jkeVarI = null;
            } else {
                jkeVarI = new bp(sessionStore, iL);
                tabInfo2 = tabInfo;
            }
            i = iL;
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tu3 tu3Var = (tu3) it.next();
                int size = arrayList.size() - list.size();
                String strA = tu3Var.a();
                String strA2 = tu3Var.a();
                switch (tu3Var.a) {
                    case 0:
                        str = tu3Var.c;
                        break;
                    default:
                        str = tu3Var.c;
                        break;
                }
                arrayList.add(new zy3(size, strA, strA2, str, false, null, null));
            }
            int size2 = arrayList.size() - 1;
            int iL2 = vzkVar.L(false);
            tabInfo2 = tabInfo;
            BrowserTabState browserTabState = new BrowserTabState(arrayList, size2, iL2, tabInfo2);
            SessionStore sessionStore2 = (SessionStore) this.g;
            if (sessionStore2 != null && !z) {
                sessionStore2.c(browserTabState);
            }
            jkeVarI = browserTabState.i();
            i = iL2;
        }
        lsc lscVar2 = z2 ? null : lscVar;
        d7l d7lVar = new d7l(this, jkeVarI != null ? new ilj(vzkVar, jkeVarI, z, i, tabInfo2, lscVar2) : new ilj(vzkVar, i, tabInfo, z, lscVar2), (tw2) this.e, (aal) this.f, (iga) this.c, (rc6) this.d, lqmVar);
        if (z2) {
            d7lVar.Z(lscVar);
        }
        return d7lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(android.graphics.Point r17, float r18, defpackage.qnn r19, nt5 r20) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbf.x(android.graphics.Point, float, qnn, nt5):java.lang.Object");
    }

    public final void y(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        int i10;
        Paint paint;
        RectF rectF;
        Paint paint2;
        Paint paint3;
        float f;
        float f2;
        RectF rectF2 = (RectF) this.d;
        int iMin = Math.min(i7, Math.min(i3 - i, i4 - i2) / 2);
        int i11 = i2 + i9;
        int i12 = i4 + i9;
        Paint paint4 = (Paint) this.f;
        float[] fArr = (float[]) this.c;
        int[] iArr = (int[]) this.b;
        Paint paint5 = (Paint) this.e;
        Matrix matrix = (Matrix) this.g;
        if (Color.alpha(i5) == 0) {
            rectF = rectF2;
            i10 = iMin;
            paint = paint4;
        } else {
            int iMax = Math.max(iMin + i8, i8 << 1);
            int i13 = i - i8;
            int i14 = i11 - i8;
            int i15 = i3 + i8;
            int i16 = i12 + i8;
            int iAlpha = Color.alpha(i5);
            iArr[0] = p37.m0(i5, (iAlpha * 255) / 255);
            iArr[1] = p37.m0(i5, (iAlpha * 170) / 255);
            iArr[2] = p37.m0(i5, (iAlpha * 85) / 255);
            iArr[3] = p37.m0(i5, 0);
            float f3 = iMax;
            float f4 = 1.0f - ((i8 / f3) * 2.0f);
            fArr[0] = f4;
            float f5 = 1.0f - f4;
            fArr[1] = (0.2f * f5) + f4;
            fArr[2] = (f5 * 0.5f) + f4;
            fArr[3] = 1.0f;
            paint4.setColor(i5);
            float f6 = i13 + iMax;
            float f7 = i14 + iMax;
            float f8 = i15 - iMax;
            float f9 = i16 - iMax;
            i10 = iMin;
            canvas.drawRect(f6, f7, f8, f9, paint4);
            paint = paint4;
            float fMax = Math.max(1, iMax);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            rectF = rectF2;
            float f10 = f8;
            float f11 = f7;
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, fMax, iArr, fArr, tileMode);
            paint5.setShader(radialGradient);
            if (z) {
                paint2 = paint5;
            } else {
                matrix.setTranslate(f6, f11);
                radialGradient.setLocalMatrix(matrix);
                paint2 = paint5;
                canvas.drawRect(i13, i14, f6, f11, paint2);
                f11 = f11;
            }
            matrix.setTranslate(f6, f9);
            radialGradient.setLocalMatrix(matrix);
            canvas.drawRect(i13, f9, f6, i16, paint2);
            if (!z) {
                matrix.setTranslate(f10, f11);
                radialGradient.setLocalMatrix(matrix);
                canvas.drawRect(f10, i14, i15, f11, paint2);
                f10 = f10;
            }
            matrix.setTranslate(f10, f9);
            radialGradient.setLocalMatrix(matrix);
            float f12 = f10;
            canvas.drawRect(f12, f9, i15, i16, paint2);
            Paint paint6 = paint2;
            LinearGradient linearGradient = new LinearGradient(0.0f, 1.0f, 0.0f, 0.0f, iArr, fArr, tileMode);
            paint6.setShader(linearGradient);
            if (z) {
                paint3 = paint6;
                f = f6;
                f2 = 1.0f;
            } else {
                f2 = 1.0f;
                matrix.setScale(1.0f, f3);
                float f13 = i14;
                matrix.postTranslate(0.0f, f13);
                linearGradient.setLocalMatrix(matrix);
                float f14 = f11;
                paint3 = paint6;
                canvas.drawRect(f6, f13, f12, f14, paint3);
                f = f6;
                f12 = f12;
                f11 = f14;
            }
            matrix.setScale(f2, -iMax);
            float f15 = i16;
            matrix.postTranslate(0.0f, f15);
            linearGradient.setLocalMatrix(matrix);
            float f16 = f;
            float f17 = f12;
            canvas.drawRect(f16, f9, f17, f15, paint3);
            matrix.setScale(f2, f3);
            matrix.postRotate(-90.0f);
            float f18 = i13;
            matrix.postTranslate(f18, 0.0f);
            linearGradient.setLocalMatrix(matrix);
            float f19 = f11;
            canvas.drawRect(f18, f19, f16, f9, paint3);
            matrix.setScale(f2, f3);
            matrix.postRotate(90.0f);
            float f20 = i15;
            matrix.postTranslate(f20, 0.0f);
            linearGradient.setLocalMatrix(matrix);
            canvas.drawRect(f17, f19, f20, f9, paint3);
        }
        paint.setColor(i6);
        RectF rectF3 = rectF;
        rectF3.set(i, i2, i3, i4);
        float f21 = i10;
        canvas.drawRoundRect(rectF3, f21, f21, paint);
    }

    public final void z(Callback callback) {
        OperaAccessToken operaAccessToken = (OperaAccessToken) this.g;
        if (operaAccessToken != null) {
            if (!operaAccessToken.a()) {
                callback.run(operaAccessToken.a);
                return;
            }
            this.g = null;
        }
        a55 a55Var = (a55) ((wv1) this.c).b.get();
        byte b = 1;
        a55Var.c.d(new kw4(a55Var, b, new mb(this, callback, (byte) 2), b));
    }
}
