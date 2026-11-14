package defpackage;

import J.N;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.impl.WorkDatabase;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.opera.android.browser.BrowserFragment;
import com.opera.android.browser.NavigationHistory;
import com.opera.android.browser.OperaPageRootView;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.qr.ScanQrCodeActivity;
import com.opera.android.settings.SettingsManager;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.components.embedder_support.view.ContentViewRenderView;

/* loaded from: classes.dex */
public final class ami implements u9j {
    public static final uli i = new uli(new lxh(2131231993), new rxh(2132021929));
    public static final uli j = new uli(new lxh(2131232316), new rxh(2132021959));
    public static final uli k = new uli(new lxh(2131232231), new rxh(2132021946));
    public static final ill l = new ill();
    public static final by6 m = new by6();
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public ami(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 16:
                WeakHashMap weakHashMap = new WeakHashMap();
                WeakHashMap weakHashMap2 = new WeakHashMap();
                WeakHashMap weakHashMap3 = new WeakHashMap();
                rii riiVar = new rii();
                tuj tujVar = new tuj(context, (byte) 1);
                Handler handler = new Handler(Looper.getMainLooper());
                this.c = weakHashMap;
                this.d = weakHashMap2;
                this.e = weakHashMap3;
                this.h = riiVar;
                this.b = tujVar;
                tujVar.i = new dgo(this, (byte) 5);
                this.f = handler;
                this.g = new iv(this);
                break;
            default:
                this.b = context;
                this.c = z4c.b(new j3i(this, (byte) 21));
                this.d = new h42(this, (byte) 2);
                this.e = new ArrayList();
                this.f = new SparseIntArray();
                this.g = v08.a;
                this.h = new AtomicBoolean(false);
                break;
        }
    }

    public ami(Context context, jl5 jl5Var, a5o a5oVar, t1h t1hVar, WorkDatabase workDatabase, h5o h5oVar, ArrayList arrayList) {
        this.a = (byte) 15;
        this.b = jl5Var;
        this.c = a5oVar;
        this.d = t1hVar;
        this.e = workDatabase;
        this.f = h5oVar;
        this.g = arrayList;
        this.h = context.getApplicationContext();
        new d7h((byte) 14);
    }

    public ami(Context context, vzk vzkVar, b59 b59Var, sy syVar, wjh wjhVar) {
        this.a = (byte) 2;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = context.getApplicationContext();
        this.e = vzkVar;
        this.f = b59Var;
        this.g = syVar;
        this.h = wjhVar;
    }

    public ami(axm axmVar, hxm hxmVar, String str, owm owmVar, s9j s9jVar, v4m v4mVar, sp4 sp4Var, z6j z6jVar, i1l i1lVar, tv tvVar, ra7 ra7Var, f77 f77Var) {
        this.a = (byte) 14;
        this.b = axmVar;
        this.c = hxmVar;
        this.d = str;
        this.e = owmVar;
        this.f = i1lVar;
        this.g = f77Var;
        this.h = new a33(s9jVar, z6jVar, v4mVar, i1lVar, sp4Var, tvVar, hxmVar, ra7Var);
    }

    public ami(ScanQrCodeActivity scanQrCodeActivity, ScanQrCodeActivity scanQrCodeActivity2, umi umiVar, ei eiVar, tsd tsdVar, lfh lfhVar, pde pdeVar, qli qliVar, pli pliVar, a7b a7bVar, qli qliVar2) {
        final byte b = 0;
        this.a = (byte) 0;
        this.b = scanQrCodeActivity;
        this.c = eiVar;
        this.d = tsdVar;
        this.e = lfhVar;
        this.f = qliVar;
        this.g = pliVar;
        gfh gfhVar = (gfh) lfhVar.j.g();
        pde pdeVar2 = lfhVar.k;
        jfh jfhVar = (jfh) pdeVar2.g();
        yli yliVarE = e(gfhVar, jfhVar);
        pde pdeVar3 = lfhVar.j;
        on7 on7Var = pn7.b;
        final byte b2 = 1;
        long jX0 = cs5.x0(1, un7.e);
        ali aliVar = new ali((byte) 4);
        knl knlVar = new knl(umiVar, jX0);
        smi smiVar = new smi(knlVar, new j3i(pdeVar3, (byte) 9));
        smiVar.s(pdeVar3, new w4i(new tmi(aliVar, smiVar, knlVar, b), (byte) 4));
        wnm wnmVarX = xf8.X(yliVarE, smiVar, pdeVar2, pdeVar, new j04(this, (byte) 15));
        tsdVar.j(scanQrCodeActivity2, new t7d(new Function1(this) { // from class: sli
            public final /* synthetic */ ami b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
            public final Object invoke(Object obj) {
                int iH;
                int iH2;
                byte b3 = b;
                byte b4 = 1;
                ami amiVar = this.b;
                switch (b3) {
                    case 0:
                        fp1 fp1Var = (ScanQrCodeActivity) amiVar.b;
                        ei eiVar2 = (ei) amiVar.c;
                        tsd tsdVar2 = (tsd) amiVar.d;
                        int iOrdinal = ddh.t(((kl5) tsdVar2.g()).b.width(), fp1Var).ordinal();
                        if (iOrdinal == 0) {
                            iH = z7h.h(fp1Var, 12.0f);
                        } else {
                            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                                h9o.p();
                                return null;
                            }
                            iH = z7h.h(fp1Var, 60.0f);
                        }
                        int i2 = iH;
                        p37.o0(eiVar2.d, i2, 0, i2, 0, 10);
                        int iWidth = ((kl5) tsdVar2.g()).b.width();
                        int iOrdinal2 = ddh.t(iWidth, fp1Var).ordinal();
                        if (iOrdinal2 == 0) {
                            iH2 = z7h.h(fp1Var, 36.0f);
                        } else {
                            if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3) {
                                h9o.p();
                                return null;
                            }
                            iH2 = z7h.h(fp1Var, 40.0f);
                        }
                        int iH3 = (iWidth - z7h.h(fp1Var, 560.0f)) / 2;
                        int i3 = iH2 < iH3 ? iH3 : iH2;
                        p37.o0((TextView) eiVar2.i, i3, 0, i3, 0, 10);
                        return Unit.a;
                    case 1:
                        ((lfh) amiVar.e).f.m(2);
                        return Unit.a;
                    default:
                        yli yliVar = (yli) obj;
                        ei eiVar3 = (ei) amiVar.c;
                        ConstraintLayout constraintLayout = eiVar3.c;
                        boolean z = yliVar.f;
                        View.OnClickListener onClickListener = yliVar.c;
                        a4h a4hVar = yliVar.e;
                        tli tliVar = yliVar.b;
                        View.OnClickListener onClickListener2 = yliVar.d;
                        tli tliVar2 = yliVar.a;
                        byte b5 = 0;
                        constraintLayout.setVisibility(z ? 0 : 8);
                        ?? r1 = (StylingImageView) eiVar3.h;
                        if (tliVar2 != null) {
                            uli uliVar = tliVar2.a;
                            r1.setVisibility(0);
                            r1.setImageDrawable(uliVar.a.f(r1.getContext()));
                            r1.setContentDescription(uliVar.b.a(r1.getResources()));
                            r1.setOnClickListener(tliVar2.b);
                        } else {
                            r1.setVisibility(8);
                        }
                        AppCompatImageView appCompatImageView = (StylingImageView) eiVar3.g;
                        if (onClickListener != null) {
                            appCompatImageView.setVisibility(0);
                            appCompatImageView.setOnClickListener(onClickListener);
                        } else {
                            appCompatImageView.setVisibility(8);
                        }
                        TextView textView = (TextView) eiVar3.i;
                        if (a4hVar.equals(vli.b)) {
                            textView.setVisibility(8);
                        } else if (a4hVar instanceof xli) {
                            textView.setVisibility(0);
                            na2.R(textView, new dkl(((xli) a4hVar).b), new zli(amiVar, b5));
                            textView.setOnClickListener(onClickListener2);
                            textView.setClickable(onClickListener2 != null);
                        } else {
                            if (!(a4hVar instanceof wli)) {
                                h9o.p();
                                return null;
                            }
                            textView.setVisibility(0);
                            na2.R(textView, new ckl(((wli) a4hVar).b), new zli(amiVar, b4));
                            textView.setOnClickListener(onClickListener2);
                            textView.setClickable(onClickListener2 != null);
                        }
                        FloatingActionButton floatingActionButton = eiVar3.e;
                        if (tliVar != null) {
                            uli uliVar2 = tliVar.a;
                            floatingActionButton.a(0, true);
                            floatingActionButton.setImageDrawable(uliVar2.a.f(floatingActionButton.getContext()));
                            floatingActionButton.setContentDescription(uliVar2.b.a(floatingActionButton.getResources()));
                            floatingActionButton.setOnClickListener(tliVar.b);
                        } else {
                            floatingActionButton.a(8, true);
                        }
                        return Unit.a;
                }
            }
        }, (byte) 10));
        ((StylingImageView) eiVar.f).setOnClickListener(new h4i(this, b2));
        pdeVar.j(scanQrCodeActivity2, new t7d(new Function1(this) { // from class: sli
            public final /* synthetic */ ami b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
            public final Object invoke(Object obj) {
                int iH;
                int iH2;
                byte b3 = b2;
                byte b4 = 1;
                ami amiVar = this.b;
                switch (b3) {
                    case 0:
                        fp1 fp1Var = (ScanQrCodeActivity) amiVar.b;
                        ei eiVar2 = (ei) amiVar.c;
                        tsd tsdVar2 = (tsd) amiVar.d;
                        int iOrdinal = ddh.t(((kl5) tsdVar2.g()).b.width(), fp1Var).ordinal();
                        if (iOrdinal == 0) {
                            iH = z7h.h(fp1Var, 12.0f);
                        } else {
                            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                                h9o.p();
                                return null;
                            }
                            iH = z7h.h(fp1Var, 60.0f);
                        }
                        int i2 = iH;
                        p37.o0(eiVar2.d, i2, 0, i2, 0, 10);
                        int iWidth = ((kl5) tsdVar2.g()).b.width();
                        int iOrdinal2 = ddh.t(iWidth, fp1Var).ordinal();
                        if (iOrdinal2 == 0) {
                            iH2 = z7h.h(fp1Var, 36.0f);
                        } else {
                            if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3) {
                                h9o.p();
                                return null;
                            }
                            iH2 = z7h.h(fp1Var, 40.0f);
                        }
                        int iH3 = (iWidth - z7h.h(fp1Var, 560.0f)) / 2;
                        int i3 = iH2 < iH3 ? iH3 : iH2;
                        p37.o0((TextView) eiVar2.i, i3, 0, i3, 0, 10);
                        return Unit.a;
                    case 1:
                        ((lfh) amiVar.e).f.m(2);
                        return Unit.a;
                    default:
                        yli yliVar = (yli) obj;
                        ei eiVar3 = (ei) amiVar.c;
                        ConstraintLayout constraintLayout = eiVar3.c;
                        boolean z = yliVar.f;
                        View.OnClickListener onClickListener = yliVar.c;
                        a4h a4hVar = yliVar.e;
                        tli tliVar = yliVar.b;
                        View.OnClickListener onClickListener2 = yliVar.d;
                        tli tliVar2 = yliVar.a;
                        byte b5 = 0;
                        constraintLayout.setVisibility(z ? 0 : 8);
                        ?? r1 = (StylingImageView) eiVar3.h;
                        if (tliVar2 != null) {
                            uli uliVar = tliVar2.a;
                            r1.setVisibility(0);
                            r1.setImageDrawable(uliVar.a.f(r1.getContext()));
                            r1.setContentDescription(uliVar.b.a(r1.getResources()));
                            r1.setOnClickListener(tliVar2.b);
                        } else {
                            r1.setVisibility(8);
                        }
                        AppCompatImageView appCompatImageView = (StylingImageView) eiVar3.g;
                        if (onClickListener != null) {
                            appCompatImageView.setVisibility(0);
                            appCompatImageView.setOnClickListener(onClickListener);
                        } else {
                            appCompatImageView.setVisibility(8);
                        }
                        TextView textView = (TextView) eiVar3.i;
                        if (a4hVar.equals(vli.b)) {
                            textView.setVisibility(8);
                        } else if (a4hVar instanceof xli) {
                            textView.setVisibility(0);
                            na2.R(textView, new dkl(((xli) a4hVar).b), new zli(amiVar, b5));
                            textView.setOnClickListener(onClickListener2);
                            textView.setClickable(onClickListener2 != null);
                        } else {
                            if (!(a4hVar instanceof wli)) {
                                h9o.p();
                                return null;
                            }
                            textView.setVisibility(0);
                            na2.R(textView, new ckl(((wli) a4hVar).b), new zli(amiVar, b4));
                            textView.setOnClickListener(onClickListener2);
                            textView.setClickable(onClickListener2 != null);
                        }
                        FloatingActionButton floatingActionButton = eiVar3.e;
                        if (tliVar != null) {
                            uli uliVar2 = tliVar.a;
                            floatingActionButton.a(0, true);
                            floatingActionButton.setImageDrawable(uliVar2.a.f(floatingActionButton.getContext()));
                            floatingActionButton.setContentDescription(uliVar2.b.a(floatingActionButton.getResources()));
                            floatingActionButton.setOnClickListener(tliVar.b);
                        } else {
                            floatingActionButton.a(8, true);
                        }
                        return Unit.a;
                }
            }
        }, (byte) 10));
        final byte b3 = 2;
        wnmVarX.j(scanQrCodeActivity2, new t7d(new Function1(this) { // from class: sli
            public final /* synthetic */ ami b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
            public final Object invoke(Object obj) {
                int iH;
                int iH2;
                byte b32 = b3;
                byte b4 = 1;
                ami amiVar = this.b;
                switch (b32) {
                    case 0:
                        fp1 fp1Var = (ScanQrCodeActivity) amiVar.b;
                        ei eiVar2 = (ei) amiVar.c;
                        tsd tsdVar2 = (tsd) amiVar.d;
                        int iOrdinal = ddh.t(((kl5) tsdVar2.g()).b.width(), fp1Var).ordinal();
                        if (iOrdinal == 0) {
                            iH = z7h.h(fp1Var, 12.0f);
                        } else {
                            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                                h9o.p();
                                return null;
                            }
                            iH = z7h.h(fp1Var, 60.0f);
                        }
                        int i2 = iH;
                        p37.o0(eiVar2.d, i2, 0, i2, 0, 10);
                        int iWidth = ((kl5) tsdVar2.g()).b.width();
                        int iOrdinal2 = ddh.t(iWidth, fp1Var).ordinal();
                        if (iOrdinal2 == 0) {
                            iH2 = z7h.h(fp1Var, 36.0f);
                        } else {
                            if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3) {
                                h9o.p();
                                return null;
                            }
                            iH2 = z7h.h(fp1Var, 40.0f);
                        }
                        int iH3 = (iWidth - z7h.h(fp1Var, 560.0f)) / 2;
                        int i3 = iH2 < iH3 ? iH3 : iH2;
                        p37.o0((TextView) eiVar2.i, i3, 0, i3, 0, 10);
                        return Unit.a;
                    case 1:
                        ((lfh) amiVar.e).f.m(2);
                        return Unit.a;
                    default:
                        yli yliVar = (yli) obj;
                        ei eiVar3 = (ei) amiVar.c;
                        ConstraintLayout constraintLayout = eiVar3.c;
                        boolean z = yliVar.f;
                        View.OnClickListener onClickListener = yliVar.c;
                        a4h a4hVar = yliVar.e;
                        tli tliVar = yliVar.b;
                        View.OnClickListener onClickListener2 = yliVar.d;
                        tli tliVar2 = yliVar.a;
                        byte b5 = 0;
                        constraintLayout.setVisibility(z ? 0 : 8);
                        ?? r1 = (StylingImageView) eiVar3.h;
                        if (tliVar2 != null) {
                            uli uliVar = tliVar2.a;
                            r1.setVisibility(0);
                            r1.setImageDrawable(uliVar.a.f(r1.getContext()));
                            r1.setContentDescription(uliVar.b.a(r1.getResources()));
                            r1.setOnClickListener(tliVar2.b);
                        } else {
                            r1.setVisibility(8);
                        }
                        AppCompatImageView appCompatImageView = (StylingImageView) eiVar3.g;
                        if (onClickListener != null) {
                            appCompatImageView.setVisibility(0);
                            appCompatImageView.setOnClickListener(onClickListener);
                        } else {
                            appCompatImageView.setVisibility(8);
                        }
                        TextView textView = (TextView) eiVar3.i;
                        if (a4hVar.equals(vli.b)) {
                            textView.setVisibility(8);
                        } else if (a4hVar instanceof xli) {
                            textView.setVisibility(0);
                            na2.R(textView, new dkl(((xli) a4hVar).b), new zli(amiVar, b5));
                            textView.setOnClickListener(onClickListener2);
                            textView.setClickable(onClickListener2 != null);
                        } else {
                            if (!(a4hVar instanceof wli)) {
                                h9o.p();
                                return null;
                            }
                            textView.setVisibility(0);
                            na2.R(textView, new ckl(((wli) a4hVar).b), new zli(amiVar, b4));
                            textView.setOnClickListener(onClickListener2);
                            textView.setClickable(onClickListener2 != null);
                        }
                        FloatingActionButton floatingActionButton = eiVar3.e;
                        if (tliVar != null) {
                            uli uliVar2 = tliVar.a;
                            floatingActionButton.a(0, true);
                            floatingActionButton.setImageDrawable(uliVar2.a.f(floatingActionButton.getContext()));
                            floatingActionButton.setContentDescription(uliVar2.b.a(floatingActionButton.getResources()));
                            floatingActionButton.setOnClickListener(tliVar.b);
                        } else {
                            floatingActionButton.a(8, true);
                        }
                        return Unit.a;
                }
            }
        }, (byte) 10));
    }

    public ami(SettingsManager settingsManager, fw3 fw3Var, Resources resources, jt3 jt3Var) {
        this.a = (byte) 4;
        this.b = settingsManager;
        this.c = fw3Var;
        this.d = resources;
        this.e = jt3Var;
        this.f = z4c.b(new oc2(this, (byte) 14));
        this.g = new v9j(this);
        this.h = Collections.singleton("toolbar_bottom_actions");
    }

    public ami(gpm gpmVar, apa apaVar, j9a j9aVar, jtf jtfVar, csk cskVar, pj5 pj5Var) {
        Set setKeySet;
        this.a = (byte) 7;
        this.b = gpmVar;
        this.c = apaVar;
        this.d = j9aVar;
        this.e = jtfVar;
        this.f = cskVar;
        this.g = pj5Var;
        Map map = (Map) pj5Var.e(boa.a);
        this.h = (map == null || (setKeySet = map.keySet()) == null) ? v08.a : setKeySet;
    }

    public ami(gqg gqgVar, gqg gqgVar2, gqg gqgVar3, gqg gqgVar4, gqg gqgVar5, gqg gqgVar6, w14 w14Var, int i2) {
        this.a = (byte) 6;
        gqgVar = (i2 & 1) != 0 ? null : gqgVar;
        gqgVar2 = (i2 & 2) != 0 ? null : gqgVar2;
        gqgVar3 = (i2 & 4) != 0 ? null : gqgVar3;
        gqgVar4 = (i2 & 8) != 0 ? null : gqgVar4;
        gqgVar5 = (i2 & 16) != 0 ? null : gqgVar5;
        gqgVar6 = (i2 & 32) != 0 ? null : gqgVar6;
        this.b = gqgVar;
        this.c = gqgVar2;
        this.d = gqgVar3;
        this.e = gqgVar4;
        this.f = gqgVar5;
        this.g = gqgVar6;
        this.h = w14Var;
    }

    public /* synthetic */ ami(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }

    public ami(ndc ndcVar, Context context, File file, umi umiVar, ii iiVar, rgh rghVar, vzk vzkVar, onn onnVar, qi5 qi5Var) {
        final byte b = 1;
        this.a = (byte) 1;
        this.g = new kze(new ArrayList());
        this.h = new kze(new ArrayList());
        this.b = context;
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        String[] strArr = aik.a;
        this.c = string == null ? "" : string;
        s14 s14Var = new s14(file, umiVar, onnVar);
        this.d = s14Var;
        this.f = vzkVar;
        final byte b2 = 0;
        vq8 vq8Var = new vq8(file, umiVar, iiVar, new hga(dj9.t(context), b2), new t1(context, (byte) 16), rghVar, qi5Var);
        this.e = vq8Var;
        xf8.X(mln.d, (kze) s14Var.f, (kze) vq8Var.j, (h42) qi5Var.c, new lf5((byte) 25)).j(ndcVar, new f7f(this) { // from class: lln
            public final /* synthetic */ ami b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b2;
                ami amiVar = this.b;
                switch (b3) {
                    case 0:
                        mln mlnVar = (mln) obj;
                        by6 by6Var = ami.m;
                        mgh mghVar = new mgh((String) amiVar.c);
                        mghVar.a(ami.l);
                        List<aln> list = mlnVar.a;
                        Set set = mlnVar.c;
                        for (aln alnVar : list) {
                            if (!alnVar.e() || set.contains(alnVar.getId())) {
                                mghVar.a(alnVar);
                            }
                        }
                        int i2 = 0;
                        boolean z = false;
                        for (aln alnVar2 : mlnVar.b) {
                            if (alnVar2.getId().equals("NETWORK_529")) {
                                mghVar.a(by6Var);
                                z = true;
                            } else if (!alnVar2.e() || set.contains(alnVar2.getId())) {
                                mghVar.a(alnVar2);
                            }
                        }
                        if (!z) {
                            mghVar.a(by6Var);
                        }
                        kze kzeVar = (kze) amiVar.g;
                        ArrayList arrayList = (ArrayList) mghVar.b;
                        Collections.sort(arrayList, new omj((byte) 20));
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            arrayList2.add(((jnn) obj2).a);
                        }
                        kzeVar.r(arrayList2);
                        amiVar.B();
                        break;
                    default:
                        amiVar.B();
                        break;
                }
            }
        });
        ((kze) vzkVar.c).j(ndcVar, new f7f(this) { // from class: lln
            public final /* synthetic */ ami b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b;
                ami amiVar = this.b;
                switch (b3) {
                    case 0:
                        mln mlnVar = (mln) obj;
                        by6 by6Var = ami.m;
                        mgh mghVar = new mgh((String) amiVar.c);
                        mghVar.a(ami.l);
                        List<aln> list = mlnVar.a;
                        Set set = mlnVar.c;
                        for (aln alnVar : list) {
                            if (!alnVar.e() || set.contains(alnVar.getId())) {
                                mghVar.a(alnVar);
                            }
                        }
                        int i2 = 0;
                        boolean z = false;
                        for (aln alnVar2 : mlnVar.b) {
                            if (alnVar2.getId().equals("NETWORK_529")) {
                                mghVar.a(by6Var);
                                z = true;
                            } else if (!alnVar2.e() || set.contains(alnVar2.getId())) {
                                mghVar.a(alnVar2);
                            }
                        }
                        if (!z) {
                            mghVar.a(by6Var);
                        }
                        kze kzeVar = (kze) amiVar.g;
                        ArrayList arrayList = (ArrayList) mghVar.b;
                        Collections.sort(arrayList, new omj((byte) 20));
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            arrayList2.add(((jnn) obj2).a);
                        }
                        kzeVar.r(arrayList2);
                        amiVar.B();
                        break;
                    default:
                        amiVar.B();
                        break;
                }
            }
        });
    }

    public ami(umi umiVar, BrowserFragment browserFragment, vp5 vp5Var, k6l k6lVar, vx vxVar) {
        this.a = (byte) 3;
        this.g = new ro9(this, 3);
        this.b = umiVar;
        this.c = browserFragment;
        this.d = vp5Var;
        this.e = k6lVar;
        this.f = vxVar;
        k6lVar.F(new vz2(this));
    }

    public ami(vwh vwhVar) {
        this.a = (byte) 13;
        this.g = new ic(this, (byte) 16);
        this.h = new pt(this, (byte) 3);
        this.b = vwhVar;
    }

    public ami(wy9 wy9Var, wy9 wy9Var2, wy9 wy9Var3, wy9 wy9Var4, f38 f38Var, f38 f38Var2) {
        this.a = (byte) 5;
        this.h = zn8.a(150, new eq6(this));
        this.b = wy9Var;
        this.c = wy9Var2;
        this.d = wy9Var3;
        this.e = wy9Var4;
        this.f = f38Var;
        this.g = f38Var2;
    }

    public static String g(xx xxVar) {
        return "providers_config_" + ((String) ((lyf) xxVar).a) + "_" + ((String) ((lyf) xxVar).b);
    }

    public static ArrayList o(gqg... gqgVarArr) {
        List<gqg> listP = e82.p(gqgVarArr);
        ArrayList arrayList = new ArrayList(k95.o(listP, 10));
        for (gqg gqgVar : listP) {
            arrayList.add(new gqg(((c30) gqgVar).b, gqgVar.n, gqgVar.o, gqgVar.p, gqgVar.q, gqgVar.r, gqgVar.s));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static void s(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.edit().remove(str.concat("_data")).remove(str.concat("_url")).remove(str.concat("_timestamp")).remove(str.concat("_request_time")).apply();
    }

    public final void A(gtj gtjVar) {
        ic icVar = (ic) this.g;
        if (TextUtils.isEmpty((String) this.f)) {
            gtjVar.f(2132021998, icVar);
        } else {
            gtjVar.g((String) this.f, icVar);
        }
        View viewFindViewById = ((na3) gtjVar.a).i.findViewById(2131364491);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setOnClickListener(icVar);
    }

    public final void B() {
        Object next;
        kze kzeVar = (kze) this.h;
        vzk vzkVar = (vzk) this.f;
        List list = (List) ((kze) this.g).g();
        vzkVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) vzkVar.d;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            String str = (String) obj;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.a(((aln) next).getId(), str)) {
                        break;
                    }
                }
            }
            aln alnVar = (aln) next;
            if (alnVar != null) {
                arrayList.add(alnVar);
            }
        }
        kzeVar.r(arrayList);
    }

    public final void C(r6j r6jVar) {
        ArrayList arrayList = (ArrayList) this.e;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f;
        Context context = (Context) this.b;
        int i2 = r6jVar.a;
        x6j x6jVar = r6jVar.b;
        q6j q6jVar = r6jVar.c;
        String strA = q6jVar.a(context);
        String strA2 = r6jVar.d.a(context);
        int i3 = r6jVar.e;
        boolean z = r6jVar.f;
        boolean z2 = r6jVar.h;
        ehc ehcVarB = a.b();
        ehcVarB.add(q6jVar.a(context));
        Iterator it = r6jVar.i.iterator();
        while (it.hasNext()) {
            ehcVarB.add(((q6j) it.next()).a(context));
        }
        l6j l6jVar = new l6j(i2, x6jVar, strA, strA2, i3, z, z2, a.a(ehcVarB));
        int i4 = sparseIntArray.get(i2, -1);
        if (i4 != -1) {
            arrayList.set(i4, l6jVar);
        } else {
            arrayList.add(l6jVar);
            sparseIntArray.put(i2, j95.h(arrayList));
        }
    }

    public final void D(aln alnVar) {
        nv6 nv6VarB = ru9.c((Context) this.b).b();
        String id = alnVar.getId();
        SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
        editor.putString("wallpaper.item_data.id", id);
        editor.putString("wallpaper.item_data.content", alnVar.toString());
        nv6VarB.w();
    }

    public final void E() {
        v9j v9jVar = (v9j) this.g;
        List listI = vtp.I((SettingsManager) this.b, (fw3) this.c);
        ArrayList arrayList = dq3.a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            pc pcVar = (pc) obj;
            if (!listI.contains(pcVar) && ((jt3) this.e).f.b(pcVar)) {
                arrayList2.add(obj);
            }
        }
        v9jVar.r(new xo3(listI, CollectionsKt.c0(new ta2((Resources) this.d), arrayList2), !r1.a.contains("toolbar_bottom_actions")));
    }

    public final void a(View view) {
        ((WeakHashMap) this.c).remove(view);
        ((WeakHashMap) this.d).remove(view);
        ((WeakHashMap) this.e).remove(view);
        ((WeakHashMap) ((tuj) this.b).g).remove(view);
    }

    public final void b(View view, ooo oooVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.c;
        if (weakHashMap.get(view) != oooVar) {
            a(view);
            if (oooVar.f()) {
                return;
            }
            weakHashMap.put(view, oooVar);
            int iE = oooVar.e();
            tuj tujVar = (tuj) this.b;
            if (iE > 0) {
                tujVar.b(view, view, oooVar.h(), oooVar.e(), oooVar.d());
            } else {
                int iH = oooVar.h();
                tujVar.b(view, view, iH, iH, oooVar.d());
            }
        }
    }

    public final fai c() {
        qie qieVar;
        qie qieVar2;
        kai kaiVar = (kai) this.b;
        if (kaiVar == null) {
            t3p.w("Cannot build without a RSA SSA PKCS1 public key");
            return null;
        }
        qie qieVar3 = (qie) this.d;
        if (qieVar3 == null || (qieVar = (qie) this.e) == null) {
            t3p.w("Cannot build without prime factors");
            return null;
        }
        qie qieVar4 = (qie) this.c;
        if (qieVar4 == null) {
            t3p.w("Cannot build without private exponent");
            return null;
        }
        qie qieVar5 = (qie) this.f;
        if (qieVar5 == null || (qieVar2 = (qie) this.g) == null) {
            t3p.w("Cannot build without prime exponents");
            return null;
        }
        qie qieVar6 = (qie) this.h;
        if (qieVar6 == null) {
            t3p.w("Cannot build without CRT coefficient");
            return null;
        }
        BigInteger bigInteger = kaiVar.f.b;
        BigInteger bigInteger2 = kaiVar.g;
        BigInteger bigInteger3 = (BigInteger) qieVar3.b;
        BigInteger bigInteger4 = (BigInteger) qieVar.b;
        BigInteger bigInteger5 = (BigInteger) qieVar4.b;
        BigInteger bigInteger6 = (BigInteger) qieVar5.b;
        BigInteger bigInteger7 = (BigInteger) qieVar2.b;
        BigInteger bigInteger8 = (BigInteger) qieVar6.b;
        if (!bigInteger3.isProbablePrime(10)) {
            t3p.w("p is not a prime");
            return null;
        }
        if (!bigInteger4.isProbablePrime(10)) {
            t3p.w("q is not a prime");
            return null;
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            t3p.w("Prime p times prime q is not equal to the public key's modulus");
            return null;
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            t3p.w("D is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            t3p.w("dP is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            t3p.w("dQ is invalid.");
            return null;
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new fai((kai) this.b, (qie) this.d, (qie) this.e, (qie) this.c, (qie) this.f, (qie) this.g, (qie) this.h);
        }
        t3p.w("qInv is invalid.");
        return null;
    }

    public final tli d(jfh jfhVar) {
        lxh lxhVar;
        rxh rxhVar;
        if (!(jfhVar instanceof hfh)) {
            if (Intrinsics.a(jfhVar, ifh.a)) {
                return null;
            }
            h9o.p();
            return null;
        }
        if (((hfh) jfhVar).a) {
            lxhVar = new lxh(2131232086);
            rxhVar = new rxh(2132021957);
        } else {
            lxhVar = new lxh(2131232085);
            rxhVar = new rxh(2132021958);
        }
        return new tli(new uli(lxhVar, rxhVar), new j5g(this, jfhVar, (byte) 9));
    }

    public final yli e(gfh gfhVar, jfh jfhVar) {
        uli uliVar;
        a4h wliVar;
        fp1 fp1Var = (ScanQrCodeActivity) this.b;
        if ((gfhVar instanceof cfh) || Intrinsics.a(gfhVar, dfh.a)) {
            return new yli(null, null, null, null, null, 63);
        }
        if (gfhVar instanceof efh) {
            return new yli(null, null, null, null, null, 31);
        }
        if (!(gfhVar instanceof ffh)) {
            h9o.p();
            return null;
        }
        hmi hmiVar = ((ffh) gfhVar).a;
        if (hmiVar == null) {
            return new yli(d(jfhVar), null, null, null, new wli(fp1Var.getString(2132020591)), 46);
        }
        fmi fmiVar = hmiVar.d;
        boolean z = fmiVar instanceof emi;
        Object obj = i;
        if (z) {
            uliVar = j;
        } else if ((fmiVar instanceof bmi) || (fmiVar instanceof dmi)) {
            uliVar = obj;
        } else {
            if (!(fmiVar instanceof cmi)) {
                h9o.p();
                return null;
            }
            uliVar = k;
        }
        tli tliVar = new tli(uliVar, new j5g(this, hmiVar, (byte) 8));
        tli tliVarD = d(jfhVar);
        h4i h4iVar = new h4i(this, gfhVar);
        j5g j5gVar = uliVar.equals(obj) ? new j5g(this, gfhVar, (byte) 7) : null;
        if (fmiVar instanceof bmi) {
            wliVar = new xli(((bmi) fmiVar).a);
        } else if (fmiVar instanceof dmi) {
            wliVar = new xli(((dmi) fmiVar).a);
        } else if (fmiVar instanceof cmi) {
            wliVar = new wli(((cmi) fmiVar).a);
        } else {
            if (!(fmiVar instanceof emi)) {
                h9o.p();
                return null;
            }
            l1o l1oVar = ((emi) fmiVar).b;
            StringBuilder sb = new StringBuilder();
            sb.append(fp1Var.getString(2132022702));
            sb.append(l1oVar.b);
            sb.append('\n');
            String str = l1oVar.c;
            if (str != null) {
                sb.append(fp1Var.getString(2132022703));
                sb.append(str);
                sb.append('\n');
            }
            wliVar = new wli(sb.toString());
        }
        return new yli(tliVarD, tliVar, h4iVar, j5gVar, wliVar, 32);
    }

    public final void f(String str, Runnable runnable) {
        s14 s14Var = (s14) this.d;
        for (aln alnVar : (List) ((kze) s14Var.f).g()) {
            if (str.equals(alnVar.getId())) {
                List listSingletonList = Collections.singletonList(alnVar.getId());
                umi umiVar = (umi) s14Var.d;
                nml nmlVarC = umiVar.c(new npl(s14Var, listSingletonList, (byte) 26));
                nmlVarC.b(umiVar.d(new npl(s14Var, runnable, (byte) 27)));
                nmlVarC.a(null);
                return;
            }
        }
    }

    public final void h(knf knfVar) {
        BrowserFragment browserFragment = (BrowserFragment) this.c;
        browserFragment.getClass();
        ViewParent parent = knfVar.getView().getParent();
        FrameLayout frameLayout = browserFragment.l;
        if (parent == frameLayout) {
            frameLayout.removeView(knfVar.getView());
        }
        knfVar.e();
    }

    public final boolean i(int i2) {
        int i3 = (i2 / 1000) * 1000;
        boolean zContains = ((Set) this.g).contains(Integer.valueOf(i3));
        return i2 == i3 ? !zContains : (zContains || ((Set) this.g).contains(Integer.valueOf(i2))) ? false : true;
    }

    @Override // defpackage.u9j
    public final void j() {
        E();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(java.lang.String r6, int r7, com.opera.api.Callback r8) {
        /*
            r5 = this;
            java.lang.String r0 = "THEME_WALLPAPER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Le
            ill r5 = defpackage.ami.l
            r8.run(r5)
            return
        Le:
            java.lang.String r0 = "NETWORK_529"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1c
            by6 r5 = defpackage.ami.m
            r8.run(r5)
            return
        L1c:
            java.lang.Object r0 = r5.e
            vq8 r0 = (vq8) r0
            java.lang.Object r1 = r5.d
            s14 r1 = (defpackage.s14) r1
            r1.getClass()
            java.lang.String r2 = "FILE_"
            boolean r2 = r6.startsWith(r2)
            r3 = 0
            if (r2 == 0) goto L32
            r0 = r1
            goto L42
        L32:
            r1 = r7 & 2
            if (r1 != 0) goto L41
            r0.getClass()
            java.lang.String r1 = "NETWORK_"
            boolean r1 = r6.startsWith(r1)
            if (r1 != 0) goto L42
        L41:
            r0 = r3
        L42:
            if (r0 != 0) goto L48
            r8.run(r3)
            return
        L48:
            aln r1 = r0.f(r6)
            if (r1 == 0) goto L59
            r7 = r7 & 1
            if (r7 == 0) goto L55
            r5.D(r1)
        L55:
            r8.run(r1)
            return
        L59:
            r1 = r7 & 1
            if (r1 == 0) goto L8b
            java.lang.Object r1 = r5.b
            android.content.Context r1 = (android.content.Context) r1
            ru9 r2 = defpackage.ru9.c(r1)
            android.content.SharedPreferences r2 = r2.a
            java.lang.String r4 = "wallpaper.item_data.id"
            java.lang.String r2 = r2.getString(r4, r3)
            ru9 r1 = defpackage.ru9.c(r1)
            android.content.SharedPreferences r1 = r1.a
            java.lang.String r4 = "wallpaper.item_data.content"
            java.lang.String r1 = r1.getString(r4, r3)
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L85
            if (r1 == 0) goto L85
            aln r3 = r0.b(r1)
        L85:
            if (r3 == 0) goto L8b
            r8.run(r3)
            return
        L8b:
            lt2 r1 = new lt2
            r2 = 6
            r1.<init>(r5, r7, r8, r2)
            r0.k(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ami.k(java.lang.String, int, com.opera.api.Callback):void");
    }

    public final List l() {
        gqg gqgVar = (gqg) this.g;
        gqg gqgVar2 = (gqg) this.f;
        gqg gqgVar3 = (gqg) this.d;
        gqg gqgVar4 = (gqg) this.e;
        gqg gqgVar5 = (gqg) this.c;
        gqg gqgVar6 = (gqg) this.b;
        int iOrdinal = ((w14) this.h).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return e82.p(new List[]{o(gqgVar6), o(gqgVar5), o(gqgVar4), o(gqgVar3), o(gqgVar2), o(gqgVar)});
            }
            if (iOrdinal != 2) {
                h9o.p();
                return null;
            }
        }
        return e82.p(new List[]{o(gqgVar5, gqgVar6), o(gqgVar4), o(gqgVar3), o(gqgVar2), o(gqgVar)});
    }

    @Override // defpackage.u9j
    public final void m(kze kzeVar) {
        a26.V((SettingsManager) this.b, kzeVar, new s9(this, (byte) 6));
    }

    public final List n() {
        return j95.i(o((gqg) this.f, (gqg) this.e, (gqg) this.d, (gqg) this.c, (gqg) this.b, (gqg) this.g));
    }

    public final ddf p(int i2) {
        Integer num = (Integer) this.h;
        if (num != null && i2 == num.intValue()) {
            return ddf.a;
        }
        this.h = Integer.valueOf(i2);
        TextView textView = (TextView) ((ei) this.c).i;
        int gravity = (textView.getGravity() & 112) | (i2 > 1 ? 8388611 : 1);
        if (gravity != textView.getGravity()) {
            textView.setGravity(gravity);
        }
        textView.setBackground(sgb.F(i2 > 1 ? 2131233098 : 2131233099, textView.getContext()));
        return ddf.b;
    }

    public final void q() {
        h42 h42Var = (h42) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            l6j l6jVar = (l6j) obj;
            if (l6jVar.g && i(l6jVar.a)) {
                arrayList2.add(obj);
            }
        }
        h42Var.n(arrayList2);
    }

    public final void r(Runnable runnable) {
        Runnable vr9Var = new vr9(runnable, 2);
        ((s14) this.d).G(vr9Var);
        ((vq8) this.e).p(vr9Var);
    }

    public final void t(ro9 ro9Var) {
        vx vxVar = (vx) this.f;
        BrowserFragment browserFragment = (BrowserFragment) this.c;
        int i2 = ((ro9) this.g).b;
        this.g = ro9Var;
        int i3 = ro9Var.b;
        ac8.a(new a03(i3));
        if (i2 == 3 || (i3 == 1 && i2 != 1)) {
            browserFragment.j0(((k6l) this.e).o, i3);
        }
        if (i3 == 1 && ((Boolean) vxVar.get()).booleanValue()) {
            ChromiumContainerView chromiumContainerView = browserFragment.p;
            yy4 yy4Var = chromiumContainerView.d;
            if (yy4Var != null) {
                yy4Var.M(chromiumContainerView.e);
            }
            ChromiumContent chromiumContent = chromiumContainerView.e;
            if (chromiumContent != null) {
                if (chromiumContent.u()) {
                    chromiumContainerView.requestFocus();
                    return;
                }
                yy4 yy4Var2 = new yy4(chromiumContainerView, vxVar);
                chromiumContainerView.d = yy4Var2;
                chromiumContainerView.e.k(yy4Var2);
            }
        }
    }

    public final String toString() {
        switch (this.a) {
            case 7:
                return "HttpRequestData(url=" + ((gpm) this.b) + ", method=" + ((apa) this.c) + ')';
            default:
                return super.toString();
        }
    }

    public final void u() {
        gtj gtjVar = (gtj) this.c;
        if (gtjVar == null) {
            ((vwh) this.b).f(new qt(this));
        } else {
            A(gtjVar);
            ((gtj) this.c).j();
        }
    }

    public final void v(knf knfVar) {
        BrowserFragment browserFragment = (BrowserFragment) this.c;
        browserFragment.getClass();
        if (knfVar.getView().getParent() == null) {
            browserFragment.l.addView(knfVar.getView());
        }
        knfVar.d();
        browserFragment.i0(false);
    }

    public final void w(ro9 ro9Var, boolean z) {
        knf knfVar;
        knf knfVar2 = (knf) ro9Var.d;
        int i2 = ro9Var.b;
        zz2 zz2Var = (zz2) this.h;
        if (zz2Var != null) {
            ro9 ro9Var2 = (ro9) zz2Var.b;
            if (ro9Var2.b == i2 && ((knf) ro9Var2.d) == knfVar2) {
                return;
            }
            zz2Var.a(true);
            this.h = null;
        }
        ro9 ro9Var3 = (ro9) this.g;
        int i3 = ro9Var3.b;
        if (i3 == i2) {
            if (i2 == 2 && knfVar2 != (knfVar = (knf) ro9Var3.d)) {
                h(knfVar);
                v(knfVar2);
            }
            t(ro9Var);
            return;
        }
        if (!z && i2 == 1 && i3 != 3) {
            z(ro9Var3, ro9Var);
            d7l d7lVar = (d7l) ((b2l) ro9Var.c);
            if (!d7lVar.j.c0()) {
                this.h = new wz2(this, (umi) this.b, (d7lVar.j.isLoading() || ((NavigationHistory) ((iuh) d7lVar.i()).b).d() == 0) ? 10000 : 1000, ro9Var, ro9Var);
                return;
            } else {
                y((ro9) this.g, ro9Var);
                t(ro9Var);
                return;
            }
        }
        if (z || i2 != 2 || i3 == 3) {
            z(ro9Var3, ro9Var);
            y((ro9) this.g, ro9Var);
            t(ro9Var);
        } else {
            z(ro9Var3, ro9Var);
            OperaPageRootView view = knfVar2.getView();
            this.h = new yz2(this, (umi) this.b, ro9Var, view.getViewTreeObserver(), view, ro9Var);
        }
    }

    public final void x(ro9 ro9Var, ro9 ro9Var2) {
        vp5 vp5Var = (vp5) this.d;
        int iA = vep.A(ro9Var2.b);
        if (iA == 0) {
            b2l b2lVar = vp5Var.a.o;
            if (b2lVar != null) {
                ((d7l) b2lVar).d();
            }
            ((SurfaceView) ((ContentViewRenderView) vp5Var.f.a).c.a).setVisibility(8);
            vp5Var.c = 8;
            vp5Var.f.setVisibility(8);
        } else if (iA == 1) {
            h((knf) ro9Var2.d);
            if (ro9Var.b == 1) {
                N.MCmjt8Ye(((ContentViewRenderView) vp5Var.f.a).a);
            }
        }
        if (vep.A(ro9Var.b) != 0) {
            return;
        }
        vp5Var.a(true);
    }

    public final void y(ro9 ro9Var, ro9 ro9Var2) {
        vp5 vp5Var = (vp5) this.d;
        int i2 = ro9Var2.b;
        int iA = vep.A(i2);
        if (iA == 0) {
            vp5Var.c = 0;
            vp5Var.f.setVisibility(vp5Var.e ? 4 : 0);
            vp5Var.a(true);
        } else if (iA == 1 && ro9Var.b == 1) {
            N.MCmjt8Ye(((ContentViewRenderView) vp5Var.f.a).a);
        }
        if (i2 != 1) {
            b2l b2lVar = vp5Var.a.o;
            if (b2lVar != null) {
                ((d7l) b2lVar).d();
            }
            ((SurfaceView) ((ContentViewRenderView) vp5Var.f.a).c.a).setVisibility(8);
        }
        int iA2 = vep.A(ro9Var.b);
        if (iA2 == 0) {
            vp5Var.c = 8;
            vp5Var.f.setVisibility(8);
        } else {
            if (iA2 != 1) {
                return;
            }
            h((knf) ro9Var.d);
        }
    }

    public final void z(ro9 ro9Var, ro9 ro9Var2) {
        vp5 vp5Var = (vp5) this.d;
        int iA = vep.A(ro9Var2.b);
        if (iA == 0) {
            b2l b2lVar = vp5Var.a.o;
            if (b2lVar != null) {
                ((d7l) b2lVar).show();
            }
            ((SurfaceView) ((ContentViewRenderView) vp5Var.f.a).c.a).setVisibility(0);
            vp5Var.c = 4;
            vp5Var.f.setVisibility(4);
        } else if (iA == 1) {
            if (ro9Var.b == 1) {
                N.MC0LrgA5(((ContentViewRenderView) vp5Var.f.a).a, 120L);
            }
            v((knf) ro9Var2.d);
        }
        if (vep.A(ro9Var.b) != 0) {
            return;
        }
        vp5Var.a(false);
    }
}
