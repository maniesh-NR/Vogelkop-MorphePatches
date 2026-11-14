package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.opera.ad.interstitial.AdActivity;
import com.opera.android.BrowserActivity;
import com.opera.android.custom_views.BottomIndicatorButton;
import com.opera.android.custom_views.BottomIndicatorButtonGroup;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.settings.SettingsManager;
import com.opera.android.translate_web_pages.NavEntryTranslationDataHelper;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class w6j implements u9j, lnk, l4c, jqo {
    public final Object a;
    public Object b;
    public final Object c;
    public Object d;
    public Object e;

    public w6j(int i, h1b h1bVar, long j, Callback callback) {
        int i2;
        nya nyaVarB;
        this.c = new ArrayList();
        this.d = new SparseBooleanArray();
        mni mniVar = new mni(this, (byte) 18);
        this.e = mniVar;
        this.a = h1bVar;
        this.b = callback;
        vml.d(mniVar, j);
        AtomicInteger atomicInteger = new AtomicInteger(h1bVar.size());
        a1b a1bVarU = h1bVar.u(0);
        while (a1bVarU.hasNext()) {
            ozj ozjVar = (ozj) a1bVarU.next();
            ((SparseBooleanArray) this.d).put(ozjVar.b(), false);
            String strA = ozjVar.a();
            s2g s2gVar = new s2g((Object) this, (Object) ozjVar, (Object) atomicInteger, (byte) 6);
            if (strA.length() == 0) {
                s2gVar.run(Boolean.FALSE);
                nyaVarB = null;
                i2 = i;
            } else {
                i2 = i;
                nyaVarB = oya.b(strA, i2, i, 0, 10, new sok(s2gVar));
            }
            if (nyaVarB != null) {
                ((ArrayList) this.c).add(nyaVarB);
            }
            i = i2;
        }
    }

    public w6j(Context context, umi umiVar, qfl qflVar, p7l p7lVar) {
        this.a = context;
        this.b = umiVar;
        this.c = qflVar;
        this.d = p7lVar;
        qfl qflVar2 = new qfl((Object) this, (byte) 14);
        hlm hlmVar = (hlm) jlm.a.d(new Pair(context, umiVar));
        new rml(Unit.a, hlmVar.a).a(new qfl((Object) hlmVar, (byte) 16)).t(new qfl((Object) qflVar2, (byte) 17)).l();
    }

    public w6j(View view, emn emnVar) {
        this.a = new zjn();
        this.b = emnVar;
        this.c = view;
        this.d = new OverScroller(view.getContext(), lf1.c);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(view.getContext(), new akn(this));
        scaleGestureDetector.setQuickScaleEnabled(false);
        view.setOnTouchListener(new bmd(scaleGestureDetector, new GestureDetector(view.getContext(), new sgh(this, scaleGestureDetector, (byte) 3)), (byte) 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    /* JADX WARN: Type inference failed for: r20v1, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public w6j(BrowserActivity browserActivity, View view, View view2, BrowserActivity browserActivity2, SettingsManager settingsManager, k6l k6lVar, q6e q6eVar, v3m v3mVar, oz3 oz3Var, aal aalVar, y0f y0fVar, a4m a4mVar, pde pdeVar) {
        this.a = browserActivity;
        this.b = a4mVar;
        p8f p8fVar = new p8f((Object) browserActivity, (Object) k6lVar, (Object) q6eVar, (byte) 15);
        this.d = p8fVar;
        yg ygVar = new yg(v3mVar, k6lVar);
        r4m r4mVar = new r4m(browserActivity, browserActivity2, k6lVar, settingsManager, v3mVar, new cbl((Object) ygVar, (byte) 17), new cbl((Object) p8fVar, (byte) 18), new ghf((Object) k6lVar, (Object) aalVar, (Object) view.getResources(), (byte) 28), fan.a(1.0f, browserActivity.getResources()) + f03.w(2130971212, browserActivity, 0));
        this.e = r4mVar;
        NavEntryTranslationDataHelper navEntryTranslationDataHelper = (NavEntryTranslationDataHelper) ygVar.d;
        pje pjeVar = navEntryTranslationDataHelper.c;
        kze kzeVar = navEntryTranslationDataHelper.e;
        if (kzeVar != null) {
            kzeVar.p(pjeVar);
        }
        kze kzeVar2 = r4mVar.j;
        navEntryTranslationDataHelper.e = kzeVar2;
        kzeVar2.k(pjeVar);
        ygVar.e = r4mVar;
        jjg jjgVar = new jjg(v3mVar, (byte) 12);
        f0c f0cVar = new f0c(v3mVar);
        final ala alaVar = new ala();
        alaVar.d = new pde(Boolean.FALSE);
        int i = 2131362241;
        if (((LinearLayout) w1h.j(2131362241, view)) != null) {
            i = 2131362353;
            ?? r18 = (StylingImageView) w1h.j(2131362353, view);
            if (r18 != 0) {
                i = 2131363301;
                BottomIndicatorButtonGroup bottomIndicatorButtonGroup = (BottomIndicatorButtonGroup) w1h.j(2131363301, view);
                if (bottomIndicatorButtonGroup != null) {
                    i = 2131363461;
                    ?? r20 = (StylingImageView) w1h.j(2131363461, view);
                    if (r20 != 0) {
                        i = 2131364842;
                        BottomIndicatorButton bottomIndicatorButton = (BottomIndicatorButton) w1h.j(2131364842, view);
                        if (bottomIndicatorButton != null) {
                            i = 2131364843;
                            BottomIndicatorButton bottomIndicatorButton2 = (BottomIndicatorButton) w1h.j(2131364843, view);
                            if (bottomIndicatorButton2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                alaVar.a = new pt1(constraintLayout, (StylingImageView) r18, bottomIndicatorButtonGroup, (StylingImageView) r20, bottomIndicatorButton, bottomIndicatorButton2, constraintLayout);
                                alaVar.b = view2;
                                alaVar.c = oz3Var;
                                alaVar.g = r4mVar;
                                alaVar.e = y0fVar;
                                alaVar.f = a4mVar;
                                alaVar.k = settingsManager;
                                alaVar.l = pdeVar;
                                alaVar.h = new m3m(r20.getContext(), alaVar);
                                final byte b = 1;
                                alaVar.i = new z3m(constraintLayout.getContext(), new crk(r4mVar, (byte) 21), jjgVar, f0cVar, new k4m(alaVar, b));
                                alaVar.j = f0cVar;
                                final byte b2 = 0;
                                bottomIndicatorButton.setOnClickListener(new View.OnClickListener() { // from class: l4m
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        byte b3 = b2;
                                        ala alaVar2 = alaVar;
                                        switch (b3) {
                                            case 0:
                                                ((y0f) alaVar2.e).c(rs0.b);
                                                r4m r4mVar2 = (r4m) alaVar2.g;
                                                if (r4mVar2.c.d != 2) {
                                                    r4mVar2.d.a();
                                                    break;
                                                } else {
                                                    z3m z3mVar = (z3m) alaVar2.i;
                                                    BottomIndicatorButton bottomIndicatorButton3 = (BottomIndicatorButton) ((pt1) alaVar2.a).c;
                                                    Objects.requireNonNull(r4mVar2);
                                                    j4m j4mVar = new j4m(r4mVar2, (byte) 1);
                                                    szb szbVarW = r4mVar2.W();
                                                    z3mVar.o = j4mVar;
                                                    z3mVar.p = szbVarW;
                                                    z3mVar.q = false;
                                                    z3mVar.p(bottomIndicatorButton3);
                                                    break;
                                                }
                                            case 1:
                                                ((y0f) alaVar2.e).c(rs0.d);
                                                r4m r4mVar3 = (r4m) alaVar2.g;
                                                r4mVar3.Z(r4mVar3.f.o, 1);
                                                break;
                                            case 2:
                                                ((m3m) alaVar2.h).p((StylingImageView) ((pt1) alaVar2.a).e);
                                                break;
                                            default:
                                                ((y0f) alaVar2.e).c(rs0.l);
                                                ((r4m) alaVar2.g).e.J0(false);
                                                a4m a4mVar2 = (a4m) alaVar2.f;
                                                b2l b2lVar = a4mVar2.c.o;
                                                if (b2lVar != null && a4mVar2.W(b2lVar, true)) {
                                                    a4mVar2.Z();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                bottomIndicatorButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: m4m
                                    @Override // android.view.View.OnLongClickListener
                                    public final boolean onLongClick(View view3) {
                                        byte b3 = b2;
                                        ala alaVar2 = alaVar;
                                        switch (b3) {
                                            case 0:
                                                ((y0f) alaVar2.e).c(rs0.c);
                                                z3m z3mVar = (z3m) alaVar2.i;
                                                BottomIndicatorButton bottomIndicatorButton3 = (BottomIndicatorButton) ((pt1) alaVar2.a).c;
                                                r4m r4mVar2 = (r4m) alaVar2.g;
                                                Objects.requireNonNull(r4mVar2);
                                                j4m j4mVar = new j4m(r4mVar2, (byte) 1);
                                                szb szbVarW = r4mVar2.W();
                                                z3mVar.o = j4mVar;
                                                z3mVar.p = szbVarW;
                                                z3mVar.q = false;
                                                z3mVar.p(bottomIndicatorButton3);
                                                break;
                                            default:
                                                ((y0f) alaVar2.e).c(rs0.e);
                                                z3m z3mVar2 = (z3m) alaVar2.i;
                                                BottomIndicatorButton bottomIndicatorButton4 = (BottomIndicatorButton) ((pt1) alaVar2.a).g;
                                                r4m r4mVar3 = (r4m) alaVar2.g;
                                                Objects.requireNonNull(r4mVar3);
                                                z3mVar2.o = new j4m(r4mVar3, (byte) 0);
                                                z3mVar2.p = null;
                                                z3mVar2.q = true;
                                                z3mVar2.p(bottomIndicatorButton4);
                                                break;
                                        }
                                        return true;
                                    }
                                });
                                bottomIndicatorButton2.setOnClickListener(new View.OnClickListener() { // from class: l4m
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        byte b3 = b;
                                        ala alaVar2 = alaVar;
                                        switch (b3) {
                                            case 0:
                                                ((y0f) alaVar2.e).c(rs0.b);
                                                r4m r4mVar2 = (r4m) alaVar2.g;
                                                if (r4mVar2.c.d != 2) {
                                                    r4mVar2.d.a();
                                                    break;
                                                } else {
                                                    z3m z3mVar = (z3m) alaVar2.i;
                                                    BottomIndicatorButton bottomIndicatorButton3 = (BottomIndicatorButton) ((pt1) alaVar2.a).c;
                                                    Objects.requireNonNull(r4mVar2);
                                                    j4m j4mVar = new j4m(r4mVar2, (byte) 1);
                                                    szb szbVarW = r4mVar2.W();
                                                    z3mVar.o = j4mVar;
                                                    z3mVar.p = szbVarW;
                                                    z3mVar.q = false;
                                                    z3mVar.p(bottomIndicatorButton3);
                                                    break;
                                                }
                                            case 1:
                                                ((y0f) alaVar2.e).c(rs0.d);
                                                r4m r4mVar3 = (r4m) alaVar2.g;
                                                r4mVar3.Z(r4mVar3.f.o, 1);
                                                break;
                                            case 2:
                                                ((m3m) alaVar2.h).p((StylingImageView) ((pt1) alaVar2.a).e);
                                                break;
                                            default:
                                                ((y0f) alaVar2.e).c(rs0.l);
                                                ((r4m) alaVar2.g).e.J0(false);
                                                a4m a4mVar2 = (a4m) alaVar2.f;
                                                b2l b2lVar = a4mVar2.c.o;
                                                if (b2lVar != null && a4mVar2.W(b2lVar, true)) {
                                                    a4mVar2.Z();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                bottomIndicatorButton2.setOnLongClickListener(new View.OnLongClickListener() { // from class: m4m
                                    @Override // android.view.View.OnLongClickListener
                                    public final boolean onLongClick(View view3) {
                                        byte b3 = b;
                                        ala alaVar2 = alaVar;
                                        switch (b3) {
                                            case 0:
                                                ((y0f) alaVar2.e).c(rs0.c);
                                                z3m z3mVar = (z3m) alaVar2.i;
                                                BottomIndicatorButton bottomIndicatorButton3 = (BottomIndicatorButton) ((pt1) alaVar2.a).c;
                                                r4m r4mVar2 = (r4m) alaVar2.g;
                                                Objects.requireNonNull(r4mVar2);
                                                j4m j4mVar = new j4m(r4mVar2, (byte) 1);
                                                szb szbVarW = r4mVar2.W();
                                                z3mVar.o = j4mVar;
                                                z3mVar.p = szbVarW;
                                                z3mVar.q = false;
                                                z3mVar.p(bottomIndicatorButton3);
                                                break;
                                            default:
                                                ((y0f) alaVar2.e).c(rs0.e);
                                                z3m z3mVar2 = (z3m) alaVar2.i;
                                                BottomIndicatorButton bottomIndicatorButton4 = (BottomIndicatorButton) ((pt1) alaVar2.a).g;
                                                r4m r4mVar3 = (r4m) alaVar2.g;
                                                Objects.requireNonNull(r4mVar3);
                                                z3mVar2.o = new j4m(r4mVar3, (byte) 0);
                                                z3mVar2.p = null;
                                                z3mVar2.q = true;
                                                z3mVar2.p(bottomIndicatorButton4);
                                                break;
                                        }
                                        return true;
                                    }
                                });
                                final byte b3 = 2;
                                r20.setOnClickListener(new View.OnClickListener() { // from class: l4m
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        byte b32 = b3;
                                        ala alaVar2 = alaVar;
                                        switch (b32) {
                                            case 0:
                                                ((y0f) alaVar2.e).c(rs0.b);
                                                r4m r4mVar2 = (r4m) alaVar2.g;
                                                if (r4mVar2.c.d != 2) {
                                                    r4mVar2.d.a();
                                                    break;
                                                } else {
                                                    z3m z3mVar = (z3m) alaVar2.i;
                                                    BottomIndicatorButton bottomIndicatorButton3 = (BottomIndicatorButton) ((pt1) alaVar2.a).c;
                                                    Objects.requireNonNull(r4mVar2);
                                                    j4m j4mVar = new j4m(r4mVar2, (byte) 1);
                                                    szb szbVarW = r4mVar2.W();
                                                    z3mVar.o = j4mVar;
                                                    z3mVar.p = szbVarW;
                                                    z3mVar.q = false;
                                                    z3mVar.p(bottomIndicatorButton3);
                                                    break;
                                                }
                                            case 1:
                                                ((y0f) alaVar2.e).c(rs0.d);
                                                r4m r4mVar3 = (r4m) alaVar2.g;
                                                r4mVar3.Z(r4mVar3.f.o, 1);
                                                break;
                                            case 2:
                                                ((m3m) alaVar2.h).p((StylingImageView) ((pt1) alaVar2.a).e);
                                                break;
                                            default:
                                                ((y0f) alaVar2.e).c(rs0.l);
                                                ((r4m) alaVar2.g).e.J0(false);
                                                a4m a4mVar2 = (a4m) alaVar2.f;
                                                b2l b2lVar = a4mVar2.c.o;
                                                if (b2lVar != null && a4mVar2.W(b2lVar, true)) {
                                                    a4mVar2.Z();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                final byte b4 = 3;
                                r18.setOnClickListener(new View.OnClickListener() { // from class: l4m
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        byte b32 = b4;
                                        ala alaVar2 = alaVar;
                                        switch (b32) {
                                            case 0:
                                                ((y0f) alaVar2.e).c(rs0.b);
                                                r4m r4mVar2 = (r4m) alaVar2.g;
                                                if (r4mVar2.c.d != 2) {
                                                    r4mVar2.d.a();
                                                    break;
                                                } else {
                                                    z3m z3mVar = (z3m) alaVar2.i;
                                                    BottomIndicatorButton bottomIndicatorButton3 = (BottomIndicatorButton) ((pt1) alaVar2.a).c;
                                                    Objects.requireNonNull(r4mVar2);
                                                    j4m j4mVar = new j4m(r4mVar2, (byte) 1);
                                                    szb szbVarW = r4mVar2.W();
                                                    z3mVar.o = j4mVar;
                                                    z3mVar.p = szbVarW;
                                                    z3mVar.q = false;
                                                    z3mVar.p(bottomIndicatorButton3);
                                                    break;
                                                }
                                            case 1:
                                                ((y0f) alaVar2.e).c(rs0.d);
                                                r4m r4mVar3 = (r4m) alaVar2.g;
                                                r4mVar3.Z(r4mVar3.f.o, 1);
                                                break;
                                            case 2:
                                                ((m3m) alaVar2.h).p((StylingImageView) ((pt1) alaVar2.a).e);
                                                break;
                                            default:
                                                ((y0f) alaVar2.e).c(rs0.l);
                                                ((r4m) alaVar2.g).e.J0(false);
                                                a4m a4mVar2 = (a4m) alaVar2.f;
                                                b2l b2lVar = a4mVar2.c.o;
                                                if (b2lVar != null && a4mVar2.W(b2lVar, true)) {
                                                    a4mVar2.Z();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                r4mVar.i.j(browserActivity2, new f7f() { // from class: i4m
                                    public final void d0(Object obj) {
                                        Boolean boolValueOf;
                                        boolean zBooleanValue;
                                        Boolean boolValueOf2;
                                        byte b5 = b;
                                        ala alaVar2 = alaVar;
                                        switch (b5) {
                                            case 0:
                                                alaVar2.e();
                                                break;
                                            default:
                                                n4m n4mVar = (n4m) obj;
                                                pt1 pt1Var = (pt1) alaVar2.a;
                                                if (n4mVar != null) {
                                                    boolean z = n4mVar.i;
                                                    String str = n4mVar.c;
                                                    szb szbVar = n4mVar.d;
                                                    byte b6 = n4mVar.f;
                                                    szb szbVar2 = n4mVar.e;
                                                    d5m d5mVar = n4mVar.g;
                                                    BottomIndicatorButton bottomIndicatorButton3 = (BottomIndicatorButton) pt1Var.c;
                                                    ConstraintLayout constraintLayout2 = pt1Var.b;
                                                    BottomIndicatorButton bottomIndicatorButton4 = (BottomIndicatorButton) pt1Var.g;
                                                    if (b6 == 0) {
                                                        zBooleanValue = true;
                                                    } else {
                                                        int iOrdinal = d5mVar.a.ordinal();
                                                        if (iOrdinal == 0) {
                                                            boolValueOf = Boolean.FALSE;
                                                        } else if (iOrdinal != 1) {
                                                            boolValueOf = Boolean.FALSE;
                                                        } else {
                                                            byte b7 = ((b5m) d5mVar).b;
                                                            boolValueOf = Boolean.valueOf(b7 == 0 || b7 == 1);
                                                        }
                                                        zBooleanValue = boolValueOf.booleanValue();
                                                    }
                                                    if (bottomIndicatorButton3.a() != zBooleanValue) {
                                                        ((CircularProgressIndicator) bottomIndicatorButton3.a.c).setVisibility(zBooleanValue ? 0 : 4);
                                                        bottomIndicatorButton3.c();
                                                        bottomIndicatorButton3.b();
                                                    }
                                                    Context context = bottomIndicatorButton3.getContext();
                                                    String strG = szbVar != null ? szbVar.g(context) : context.getString(2132019377);
                                                    if (!strG.equals(bottomIndicatorButton3.b)) {
                                                        bottomIndicatorButton3.b = strG;
                                                        bottomIndicatorButton3.c();
                                                    }
                                                    int iOrdinal2 = d5mVar.a.ordinal();
                                                    if (iOrdinal2 == 0) {
                                                        boolValueOf2 = Boolean.FALSE;
                                                    } else if (iOrdinal2 != 1) {
                                                        boolValueOf2 = Boolean.FALSE;
                                                    } else {
                                                        byte b8 = ((b5m) d5mVar).b;
                                                        boolValueOf2 = Boolean.valueOf(b8 == 3 || b8 == 4);
                                                    }
                                                    boolean zBooleanValue2 = boolValueOf2.booleanValue();
                                                    if (bottomIndicatorButton4.a() != zBooleanValue2) {
                                                        ((CircularProgressIndicator) bottomIndicatorButton4.a.c).setVisibility(zBooleanValue2 ? 0 : 4);
                                                        bottomIndicatorButton4.c();
                                                        bottomIndicatorButton4.b();
                                                    }
                                                    String strG2 = szbVar2 == null ? "" : szbVar2.g(bottomIndicatorButton4.getContext());
                                                    if (!strG2.equals(bottomIndicatorButton4.b)) {
                                                        bottomIndicatorButton4.b = strG2;
                                                        bottomIndicatorButton4.c();
                                                    }
                                                    bottomIndicatorButton4.setEnabled(szbVar2 != null && b6 == 1);
                                                    BottomIndicatorButtonGroup bottomIndicatorButtonGroup2 = (BottomIndicatorButtonGroup) pt1Var.f;
                                                    if (!d5mVar.a()) {
                                                        bottomIndicatorButton3 = bottomIndicatorButton4;
                                                    }
                                                    bottomIndicatorButtonGroup2.a(bottomIndicatorButton3);
                                                    m3m m3mVar = (m3m) alaVar2.h;
                                                    m3mVar.getClass();
                                                    Set set = n4mVar.a;
                                                    boolean z2 = n4mVar.h;
                                                    m3mVar.o = str != null;
                                                    m3mVar.p = z2 && m3m.q(set, szbVar, 0);
                                                    m3mVar.q = z2 && m3m.q(set, szbVar, 1);
                                                    m3mVar.r = z2 && str != null && n4mVar.b.contains(str);
                                                    m3mVar.s = szbVar != null ? m3mVar.j.getString(szbVar.b) : "";
                                                    m3mVar.t = (szbVar == null || szbVar.equals(szbVar2)) ? false : true;
                                                    m3mVar.s();
                                                    if (z != (constraintLayout2.getVisibility() == 0)) {
                                                        constraintLayout2.setVisibility(z ? 0 : 8);
                                                        View view3 = (View) alaVar2.b;
                                                        if (view3 != null) {
                                                            view3.setVisibility(z ? 0 : 8);
                                                        }
                                                        xf8.F0((pde) alaVar2.d, Boolean.valueOf(z));
                                                    }
                                                    ijm ijmVar = ijm.b;
                                                    if (z && n4mVar.j && ((SettingsManager) alaVar2.k).i("feature_tips_notification")) {
                                                        oz3 oz3Var2 = (oz3) alaVar2.c;
                                                        kt3 kt3Var = new kt3(alaVar2, (byte) 3);
                                                        oz3Var2.getClass();
                                                        oz3Var2.b(kt3Var, ijmVar);
                                                    }
                                                    if (n4mVar.k) {
                                                        nej nejVarF = a4h.f(constraintLayout2.getContext());
                                                        xq3 xq3Var = new xq3((f0c) alaVar2.j, new k4m(alaVar2, (byte) 0), (byte) 13);
                                                        nejVarF.getClass();
                                                        nejVarF.b(xq3Var, ijmVar);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                final byte b5 = 0;
                                pdeVar.j(browserActivity2, new f7f() { // from class: i4m
                                    public final void d0(Object obj) {
                                        Boolean boolValueOf;
                                        boolean zBooleanValue;
                                        Boolean boolValueOf2;
                                        byte b52 = b5;
                                        ala alaVar2 = alaVar;
                                        switch (b52) {
                                            case 0:
                                                alaVar2.e();
                                                break;
                                            default:
                                                n4m n4mVar = (n4m) obj;
                                                pt1 pt1Var = (pt1) alaVar2.a;
                                                if (n4mVar != null) {
                                                    boolean z = n4mVar.i;
                                                    String str = n4mVar.c;
                                                    szb szbVar = n4mVar.d;
                                                    byte b6 = n4mVar.f;
                                                    szb szbVar2 = n4mVar.e;
                                                    d5m d5mVar = n4mVar.g;
                                                    BottomIndicatorButton bottomIndicatorButton3 = (BottomIndicatorButton) pt1Var.c;
                                                    ConstraintLayout constraintLayout2 = pt1Var.b;
                                                    BottomIndicatorButton bottomIndicatorButton4 = (BottomIndicatorButton) pt1Var.g;
                                                    if (b6 == 0) {
                                                        zBooleanValue = true;
                                                    } else {
                                                        int iOrdinal = d5mVar.a.ordinal();
                                                        if (iOrdinal == 0) {
                                                            boolValueOf = Boolean.FALSE;
                                                        } else if (iOrdinal != 1) {
                                                            boolValueOf = Boolean.FALSE;
                                                        } else {
                                                            byte b7 = ((b5m) d5mVar).b;
                                                            boolValueOf = Boolean.valueOf(b7 == 0 || b7 == 1);
                                                        }
                                                        zBooleanValue = boolValueOf.booleanValue();
                                                    }
                                                    if (bottomIndicatorButton3.a() != zBooleanValue) {
                                                        ((CircularProgressIndicator) bottomIndicatorButton3.a.c).setVisibility(zBooleanValue ? 0 : 4);
                                                        bottomIndicatorButton3.c();
                                                        bottomIndicatorButton3.b();
                                                    }
                                                    Context context = bottomIndicatorButton3.getContext();
                                                    String strG = szbVar != null ? szbVar.g(context) : context.getString(2132019377);
                                                    if (!strG.equals(bottomIndicatorButton3.b)) {
                                                        bottomIndicatorButton3.b = strG;
                                                        bottomIndicatorButton3.c();
                                                    }
                                                    int iOrdinal2 = d5mVar.a.ordinal();
                                                    if (iOrdinal2 == 0) {
                                                        boolValueOf2 = Boolean.FALSE;
                                                    } else if (iOrdinal2 != 1) {
                                                        boolValueOf2 = Boolean.FALSE;
                                                    } else {
                                                        byte b8 = ((b5m) d5mVar).b;
                                                        boolValueOf2 = Boolean.valueOf(b8 == 3 || b8 == 4);
                                                    }
                                                    boolean zBooleanValue2 = boolValueOf2.booleanValue();
                                                    if (bottomIndicatorButton4.a() != zBooleanValue2) {
                                                        ((CircularProgressIndicator) bottomIndicatorButton4.a.c).setVisibility(zBooleanValue2 ? 0 : 4);
                                                        bottomIndicatorButton4.c();
                                                        bottomIndicatorButton4.b();
                                                    }
                                                    String strG2 = szbVar2 == null ? "" : szbVar2.g(bottomIndicatorButton4.getContext());
                                                    if (!strG2.equals(bottomIndicatorButton4.b)) {
                                                        bottomIndicatorButton4.b = strG2;
                                                        bottomIndicatorButton4.c();
                                                    }
                                                    bottomIndicatorButton4.setEnabled(szbVar2 != null && b6 == 1);
                                                    BottomIndicatorButtonGroup bottomIndicatorButtonGroup2 = (BottomIndicatorButtonGroup) pt1Var.f;
                                                    if (!d5mVar.a()) {
                                                        bottomIndicatorButton3 = bottomIndicatorButton4;
                                                    }
                                                    bottomIndicatorButtonGroup2.a(bottomIndicatorButton3);
                                                    m3m m3mVar = (m3m) alaVar2.h;
                                                    m3mVar.getClass();
                                                    Set set = n4mVar.a;
                                                    boolean z2 = n4mVar.h;
                                                    m3mVar.o = str != null;
                                                    m3mVar.p = z2 && m3m.q(set, szbVar, 0);
                                                    m3mVar.q = z2 && m3m.q(set, szbVar, 1);
                                                    m3mVar.r = z2 && str != null && n4mVar.b.contains(str);
                                                    m3mVar.s = szbVar != null ? m3mVar.j.getString(szbVar.b) : "";
                                                    m3mVar.t = (szbVar == null || szbVar.equals(szbVar2)) ? false : true;
                                                    m3mVar.s();
                                                    if (z != (constraintLayout2.getVisibility() == 0)) {
                                                        constraintLayout2.setVisibility(z ? 0 : 8);
                                                        View view3 = (View) alaVar2.b;
                                                        if (view3 != null) {
                                                            view3.setVisibility(z ? 0 : 8);
                                                        }
                                                        xf8.F0((pde) alaVar2.d, Boolean.valueOf(z));
                                                    }
                                                    ijm ijmVar = ijm.b;
                                                    if (z && n4mVar.j && ((SettingsManager) alaVar2.k).i("feature_tips_notification")) {
                                                        oz3 oz3Var2 = (oz3) alaVar2.c;
                                                        kt3 kt3Var = new kt3(alaVar2, (byte) 3);
                                                        oz3Var2.getClass();
                                                        oz3Var2.b(kt3Var, ijmVar);
                                                    }
                                                    if (n4mVar.k) {
                                                        nej nejVarF = a4h.f(constraintLayout2.getContext());
                                                        xq3 xq3Var = new xq3((f0c) alaVar2.j, new k4m(alaVar2, (byte) 0), (byte) 13);
                                                        nejVarF.getClass();
                                                        nejVarF.b(xq3Var, ijmVar);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                svk svkVar = new svk(alaVar, (byte) 11);
                                dll dllVarS = q9n.s(constraintLayout);
                                if (dllVarS != null) {
                                    u8n.b(dllVarS, constraintLayout, svkVar);
                                }
                                this.c = (pde) alaVar.d;
                                return;
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    public w6j(SettingsManager settingsManager, zwk zwkVar) {
        this.a = settingsManager;
        this.b = zwkVar;
        this.c = z4c.b(new dnj(this, (byte) 4));
        this.d = new v9j(this);
        this.e = e82.E(new String[]{"speed_dial.enabled", "speed_dial.large_icons", "speed_dial.shape", "speed_dial.plus_button"});
    }

    public w6j(d7l d7lVar, rc6 rc6Var) {
        this.e = d7lVar;
        this.b = new SparseArray();
        this.a = rc6Var;
        this.c = new SparseArray();
    }

    public w6j(d7l d7lVar, w6j w6jVar) {
        Parcelable state;
        this.e = d7lVar;
        this.b = new SparseArray();
        this.a = (rc6) w6jVar.a;
        this.c = ((SparseArray) w6jVar.c).clone();
        for (int i = 0; i < ((SparseArray) w6jVar.b).size(); i++) {
            int iKeyAt = ((SparseArray) w6jVar.b).keyAt(i);
            knf knfVar = (knf) ((SparseArray) w6jVar.b).valueAt(i);
            if (knfVar != null && (state = knfVar.getState()) != null) {
                ((SparseArray) this.c).put(iKeyAt, state);
            }
        }
    }

    public /* synthetic */ w6j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public w6j(String str, w06 w06Var, ltm ltmVar, ArrayList arrayList, oam oamVar) {
        tmo tmoVar = new tmo(str, (byte) 0);
        this.a = tmoVar;
        i7c.b(tmoVar, null);
        this.b = ltmVar;
        this.d = arrayList;
        this.c = oamVar;
        this.e = w06Var;
    }

    public w6j(jg8 jg8Var, dj9 dj9Var, Context context) {
        this.a = context;
        this.b = dj9Var;
        this.c = jg8Var;
        final byte b = 0;
        this.d = z4c.b(new Function0(this) { // from class: con
            public final /* synthetic */ w6j b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                w6j w6jVar = this.b;
                switch (b2) {
                    case 0:
                        return i0l.c((Context) w6jVar.a);
                    default:
                        return i0l.b((Context) w6jVar.a);
                }
            }
        });
        final byte b2 = 1;
        this.e = z4c.b(new Function0(this) { // from class: con
            public final /* synthetic */ w6j b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                w6j w6jVar = this.b;
                switch (b22) {
                    case 0:
                        return i0l.c((Context) w6jVar.a);
                    default:
                        return i0l.b((Context) w6jVar.a);
                }
            }
        });
    }

    public w6j(nx5 nx5Var, t3e t3eVar) {
        this.a = nx5Var;
        this.b = t3eVar;
        this.c = z4o.f((Object) null);
    }

    public w6j(s15 s15Var, Function0 function0, Function0 function02, Function0 function03) {
        this.a = s15Var;
        this.b = function0;
        this.c = function02;
        this.d = function03;
    }

    public w6j(txi txiVar, osf osfVar, x5f x5fVar) {
        this.a = new SparseArray();
        this.b = new SparseArray();
        this.d = txiVar;
        this.c = new ole(osfVar);
        this.e = x5fVar;
    }

    public w6j(txi txiVar, x5f x5fVar, osf osfVar) {
        this.a = txiVar;
        this.b = x5fVar;
        this.c = new SparseArray();
        this.d = new SparseArray();
        this.e = new ole(osfVar);
    }

    public w6j(u7m u7mVar, HashMap map, HashMap map2, HashMap map3) {
        this.a = u7mVar;
        this.d = map2;
        this.e = map3;
        this.c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        u7mVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    public w6j(uuj uujVar, ProgressBar progressBar, AdActivity adActivity, obn obnVar, g94 g94Var) {
        this.e = uujVar;
        this.a = progressBar;
        this.b = adActivity;
        this.c = obnVar;
        this.d = g94Var;
    }

    public static gr0 d(int i) {
        if (i == 1) {
            return gr0.c;
        }
        if (i == 2) {
            return gr0.b;
        }
        if (i == 3) {
            return gr0.d;
        }
        if (i == 4) {
            return gr0.f;
        }
        if (i == 5) {
            return gr0.e;
        }
        if (i == 9) {
            return gr0.i;
        }
        if (i == 10) {
            return gr0.j;
        }
        hai.d();
        return null;
    }

    public static gr0 s(int i) {
        switch (i) {
            case 1:
                return gr0.c;
            case 2:
                return gr0.b;
            case 3:
                return gr0.d;
            case 4:
                return gr0.f;
            case 5:
                return gr0.e;
            case 6:
            default:
                qp2.o(p3p.i(i, "Cannot convert SuggestedSiteType ", " into AggroSuggestedSiteItemType"));
                return null;
            case 7:
                return gr0.g;
            case 8:
                return gr0.h;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return gr0.i;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return gr0.j;
        }
    }

    public final void a() {
        ProgressBar progressBar = (ProgressBar) this.a;
        progressBar.setProgress(100);
        progressBar.postDelayed(new i61((Object) this, (Object) progressBar, this.b, this.c, this.d, (byte) 8), 200L);
    }

    public final void a(int i) {
        ((ProgressBar) this.a).setProgress(((3 - i) * 100) / 3);
    }

    public final void b() {
        vml.a((mni) this.e);
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            oya.a((nya) obj);
        }
        Callback callback = (Callback) this.b;
        if (callback == null) {
            return;
        }
        callback.run((SparseBooleanArray) this.d);
        this.b = null;
    }

    public final void c(v1e v1eVar) {
        d3k d3kVar = (d3k) this.d;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        this.e = null;
        nak nakVar = (nak) this.c;
        List list = v1eVar.h;
        int i = dek.b;
        List list2 = list;
        boolean z = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((n01) it.next()).a != l01.e) {
                    z = true;
                    break;
                }
            }
        }
        nakVar.k((Object) null, new kek(z));
        this.d = na2.B((nx5) this.a, (CoroutineContext) null, (rx5) null, new cek(this, v1eVar, (mt5) null, (byte) 1), 3);
    }

    public final sa4 e(ac4 ac4Var, Map map, Map map2) {
        hnl hnlVar = (hnl) this.a;
        fd4 fd4Var = (fd4) this.b;
        fd4Var.getClass();
        xfk xfkVar = (xfk) this.c;
        sgk sgkVar = (sgk) this.e;
        hb4 hb4Var = (hb4) this.d;
        hb4Var.b.getClass();
        fe4 fe4Var = ge4.Oo;
        ge4 ge4VarA = hb4Var.a.a(fd4Var.a);
        fe4Var.getClass();
        return new sa4(ac4Var, hnlVar, map, map2, xfkVar, sgkVar, fe4.c(ge4VarA));
    }

    public final void f(int i, ook ookVar) {
        SparseArray sparseArray = (SparseArray) this.a;
        byte b = ookVar.d;
        if (b == 7 || b == 8 || b == 6 || b == 11) {
            return;
        }
        ((SparseArray) this.b).remove(i);
        if (((ook) sparseArray.get(i)) == null) {
            sparseArray.append(i, ookVar);
        }
    }

    public final Rect g(Rect rect, int i, int i2) {
        zjn zjnVar = (zjn) this.a;
        float fA = zjnVar.a(rect, i, i2);
        RectF rectFB = zjnVar.b(rect, i, i2);
        RectF rectF = new RectF(rectFB.left / fA, rectFB.top / fA, rectFB.right / fA, rectFB.bottom / fA);
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public final List getCues(long j) {
        u7m u7mVar = (u7m) this.a;
        Map map = (Map) this.c;
        HashMap map2 = (HashMap) this.d;
        HashMap map3 = (HashMap) this.e;
        ArrayList arrayList = new ArrayList();
        u7mVar.g(j, u7mVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        u7mVar.i(j, false, u7mVar.h, treeMap);
        u7mVar.h(j, map, map2, u7mVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                w7m w7mVar = (w7m) map2.get(pair.first);
                w7mVar.getClass();
                arrayList2.add(new x36((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, bitmapDecodeByteArray, w7mVar.c, 0, w7mVar.e, w7mVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, w7mVar.f, w7mVar.g, false, -16777216, w7mVar.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            w7m w7mVar2 = (w7m) map2.get(entry.getKey());
            w7mVar2.getClass();
            w36 w36Var = (w36) entry.getValue();
            CharSequence charSequence = w36Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (f27 f27Var : (f27[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), f27.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(f27Var), spannableStringBuilder.getSpanEnd(f27Var), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = w7mVar2.c;
            int i10 = w7mVar2.d;
            w36Var.e = f;
            w36Var.f = i10;
            w36Var.g = w7mVar2.e;
            w36Var.h = w7mVar2.b;
            w36Var.l = w7mVar2.f;
            float f2 = w7mVar2.i;
            int i11 = w7mVar2.h;
            w36Var.k = f2;
            w36Var.j = i11;
            w36Var.p = w7mVar2.j;
            arrayList2.add(w36Var.a());
        }
        return arrayList2;
    }

    public final long getEventTime(int i) {
        return ((long[]) this.b)[i];
    }

    public final int getEventTimeCount() {
        return ((long[]) this.b).length;
    }

    public final int getNextEventTimeIndex(long j) {
        long[] jArr = (long[]) this.b;
        int iB = tym.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public final Object getValue() {
        l7n l7nVar = (l7n) this.e;
        if (l7nVar != null) {
            return l7nVar;
        }
        plk plkVar = new plk((v7n) ((Function0) this.b).invoke(), (r7n) ((Function0) this.c).invoke(), (g06) ((Function0) this.d).invoke());
        s15 s15Var = (s15) this.a;
        String strB = s15Var.b();
        if (strB == null) {
            qp2.o("Local and anonymous classes can not be ViewModels");
            return null;
        }
        l7n l7nVarN = plkVar.n(s15Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        this.e = l7nVarN;
        return l7nVarN;
    }

    public final knf h() {
        String url = ((d7l) this.e).j.getUrl();
        if (!wqm.w(url)) {
            return null;
        }
        knf knfVar = (knf) this.d;
        return (knfVar == null || !TextUtils.equals(url, knfVar.getUrl())) ? i(Integer.MIN_VALUE, url) : (knf) this.d;
    }

    public final knf i(int i, String str) {
        d7l d7lVar = (d7l) this.e;
        SparseArray sparseArray = (SparseArray) this.b;
        knf knfVar = (knf) sparseArray.get(i);
        if (knfVar != null) {
            d7lVar.j.m();
            return knfVar;
        }
        Uri uri = Uri.parse(str);
        rc6 rc6Var = (rc6) this.a;
        rc6Var.getClass();
        knf knfVarA = null;
        lnf lnfVar = "operaui".equals(uri.getScheme()) ? (lnf) rc6Var.a.get(uri.getHost()) : null;
        if (lnfVar != null) {
            boolean zM = d7lVar.j.m();
            SparseArray sparseArray2 = (SparseArray) this.c;
            Parcelable parcelable = (Parcelable) sparseArray2.get(i);
            if (parcelable != null) {
                sparseArray2.remove(i);
            }
            knfVarA = lnfVar.a(uri, zM, parcelable);
        }
        if (knfVarA != null) {
            knfVarA.v(this);
        }
        sparseArray.put(i, knfVarA);
        return knfVarA;
    }

    public final boolean isInitialized() {
        return ((l7n) this.e) != null;
    }

    @Override // defpackage.u9j
    public final void j() {
        t();
    }

    public final boolean k() {
        lkn lknVar = (lkn) this.e;
        return lknVar != null && lknVar.b() > 0 && ((lkn) this.e).a() > 0 && !((lkn) this.e).getBounds().isEmpty();
    }

    public final void l(boolean z) {
        if (!z) {
            ((p7l) this.d).invoke();
            return;
        }
        Context context = (Context) this.a;
        PackageInfo packageInfoU = r9n.u(context, "com.android.vending", 0L);
        qfl qflVar = (qfl) this.c;
        if (packageInfoU != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + context.getPackageName()));
            intent.setPackage(packageInfoU.packageName);
            qflVar.invoke(intent);
            return;
        }
        Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent2.setData(Uri.parse("package:" + context.getPackageName()));
        intent2.addCategory("android.intent.category.DEFAULT");
        qflVar.invoke(intent2);
    }

    @Override // defpackage.u9j
    public final void m(kze kzeVar) {
        a26.V((SettingsManager) this.a, kzeVar, new ezg(this, (byte) 4));
        a26.V((zwk) this.b, kzeVar, new vzj(this));
    }

    public final void n(int i, xk0 xk0Var) {
        b3g b3gVar;
        if0 if0Var;
        SparseArray sparseArray = (SparseArray) this.d;
        SparseArray sparseArray2 = (SparseArray) this.c;
        int size = sparseArray2.size();
        if (size == 0) {
            return;
        }
        b3g b3gVar2 = new b3g(2);
        SparseArray sparseArray3 = new SparseArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            ook ookVar = (ook) sparseArray2.valueAt(i2);
            int iKeyAt = sparseArray2.keyAt(i2) + 1;
            gr0 gr0VarS = s(ookVar.d);
            int i3 = ookVar.f;
            byte b = ookVar.d;
            byte b2 = ookVar.e;
            sparseArray3.append(iKeyAt, new rok(gr0VarS, i3, b != b2 ? s(b2) : null));
            if (ookVar.a()) {
                b3gVar2.a(-1).b++;
            }
        }
        x5f x5fVar = (x5f) this.b;
        int i4 = i + 1;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            vk0 vk0Var = new vk0(2443, -1, 4);
            qd0 qd0VarB = x56VarF.B(zpaVar);
            List list = (List) qd0VarB.n(19);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 19, vep.t(qd0VarB, 19, 1)) : new hf0(qd0VarB, 19, list)).add(vk0Var);
            vk0Var.p(0, 1, System.currentTimeMillis());
            vk0Var.q(1, 1, xk0Var);
            if (i4 > 0) {
                String strValueOf = String.valueOf(i4);
                vk0Var.q(2, strValueOf == null ? 0 : 1, strValueOf);
            }
            int size2 = sparseArray3.size();
            int i5 = 0;
            while (i5 < size2) {
                rok rokVar = (rok) sparseArray3.valueAt(i5);
                int i6 = size2;
                wk0 wk0Var = new wk0(2443, -1, 3);
                wk0Var.q(0, 1, rokVar.a);
                b3g b3gVar3 = b3gVar2;
                wk0Var.p(1, 1, rokVar.b);
                gr0 gr0Var = rokVar.c;
                wk0Var.q(2, gr0Var == null ? 0 : 1, gr0Var);
                Map map = (Map) vk0Var.n(3);
                if (map == null || map.isEmpty()) {
                    HashMap map2 = new HashMap();
                    vk0Var.q(3, 1, map2);
                    if0Var = new if0(vk0Var, 3, map2);
                } else {
                    if0Var = new if0(vk0Var, 3, map);
                }
                if0Var.put(String.valueOf(sparseArray3.keyAt(i5)), wk0Var);
                i5++;
                b3gVar2 = b3gVar3;
                size2 = i6;
            }
            b3gVar = b3gVar2;
            x5fVar.U0(x56VarF);
        } else {
            b3gVar = b3gVar2;
        }
        ook ookVar2 = (i == -1 || xk0Var != xk0.c) ? null : (ook) sparseArray2.get(i);
        if (ookVar2 != null && ookVar2.a()) {
            b3gVar.a(-1).c++;
        }
        ((ole) this.e).C(b3gVar);
        txi txiVar = (txi) this.a;
        HashSet hashSet = new HashSet(sparseArray2.size());
        int size3 = sparseArray2.size();
        for (int i7 = 0; i7 < size3; i7++) {
            hashSet.add(sparseArray2.valueAt(i7));
        }
        HashSet hashSet2 = new HashSet(sparseArray.size());
        int size4 = sparseArray.size();
        for (int i8 = 0; i8 < size4; i8++) {
            hashSet2.add(sparseArray.valueAt(i8));
        }
        d0k d0kVar = (d0k) txiVar.b;
        if (ookVar2 != null) {
            d0kVar.n = false;
        }
        d0kVar.b.X(hashSet, hashSet2, ookVar2);
        sparseArray2.clear();
        sparseArray.clear();
    }

    public final void o(int i, hr0 hr0Var) {
        int i2;
        int i3;
        hf0 hf0Var;
        b3g b3gVar;
        int i4;
        int i5;
        if0 if0Var;
        b3g b3gVar2;
        SparseArray sparseArray = (SparseArray) this.a;
        int size = sparseArray.size();
        if (size == 0) {
            return;
        }
        int i6 = 1;
        b3g b3gVar3 = new b3g(1);
        SparseArray sparseArray2 = new SparseArray(size);
        int i7 = 0;
        while (true) {
            i2 = -1;
            if (i7 >= size) {
                break;
            }
            ook ookVar = (ook) sparseArray.valueAt(i7);
            int iKeyAt = sparseArray.keyAt(i7) + i6;
            gr0 gr0VarD = d(ookVar.d);
            int i8 = ookVar.f;
            byte b = ookVar.d;
            byte b2 = ookVar.e;
            sparseArray2.append(iKeyAt, new rok(gr0VarD, i8, b != b2 ? d(b2) : null));
            if (ookVar.a()) {
                b3gVar3.a(-1).b++;
            }
            i7++;
            i6 = 1;
        }
        x5f x5fVar = (x5f) this.e;
        int i9 = i + 1;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            sq0 sq0Var = new sq0(2443, -1, 4);
            qd0 qd0VarB = x56VarF.B(zpaVar);
            List list = (List) qd0VarB.n(18);
            if (list == null || list.isEmpty()) {
                i3 = 1;
                hf0Var = new hf0(qd0VarB, 18, vep.t(qd0VarB, 18, 1));
            } else {
                hf0Var = new hf0(qd0VarB, 18, list);
                i3 = 1;
            }
            hf0Var.add(sq0Var);
            sq0Var.p(0, i3, System.currentTimeMillis());
            sq0Var.q(i3, i3, hr0Var);
            if (i9 > 0) {
                String strValueOf = String.valueOf(i9);
                sq0Var.q(2, strValueOf == null ? 0 : 1, strValueOf);
            }
            int size2 = sparseArray2.size();
            int i10 = 0;
            while (i10 < size2) {
                rok rokVar = (rok) sparseArray2.valueAt(i10);
                fr0 fr0Var = new fr0(2443, i2, 3);
                fr0Var.q(0, 1, rokVar.a);
                b3g b3gVar4 = b3gVar3;
                int i11 = size2;
                fr0Var.p(1, 1, rokVar.b);
                gr0 gr0Var = rokVar.c;
                fr0Var.q(2, gr0Var == null ? 0 : 1, gr0Var);
                Map map = (Map) sq0Var.n(3);
                if (map == null || map.isEmpty()) {
                    HashMap map2 = new HashMap();
                    sq0Var.q(3, 1, map2);
                    if0Var = new if0(sq0Var, 3, map2);
                } else {
                    if0Var = new if0(sq0Var, 3, map);
                }
                if0Var.put(String.valueOf(sparseArray2.keyAt(i10)), fr0Var);
                i10++;
                b3gVar3 = b3gVar4;
                size2 = i11;
                i2 = -1;
            }
            b3gVar = b3gVar3;
            i4 = 0;
            x5fVar.U0(x56VarF);
            i5 = -1;
        } else {
            b3gVar = b3gVar3;
            i5 = -1;
            i4 = 0;
        }
        ook ookVar2 = i != i5 ? (ook) sparseArray.get(i) : null;
        hr0 hr0Var2 = hr0.c;
        if (ookVar2 == null || !ookVar2.a()) {
            b3gVar2 = b3gVar;
        } else {
            b3gVar2 = b3gVar;
            if (hr0Var == hr0Var2) {
                b3gVar2.a(i5).c++;
            } else if (hr0Var == hr0.d) {
                b3gVar2.a(i5).d++;
            } else if (hr0Var == hr0.e) {
                b3gVar2.a(i5).e++;
            }
        }
        ((ole) this.c).C(b3gVar2);
        txi txiVar = (txi) this.d;
        HashSet hashSet = new HashSet(sparseArray.size());
        for (int i12 = i4; i12 < sparseArray.size(); i12++) {
            hashSet.add((ook) sparseArray.valueAt(i12));
        }
        SparseArray sparseArray3 = (SparseArray) this.b;
        HashSet hashSet2 = new HashSet(sparseArray3.size());
        for (int i13 = i4; i13 < sparseArray3.size(); i13++) {
            hashSet2.add((ook) sparseArray3.valueAt(i13));
        }
        ((kok) txiVar.b).f.X(hashSet, hashSet2, hr0Var == hr0Var2 ? ookVar2 : null);
    }

    public final void p() {
        ((SparseArray) this.a).clear();
        ((SparseArray) this.b).clear();
    }

    public final void q() {
        u8g u8gVar = (u8g) this.e;
        if (u8gVar == null) {
            return;
        }
        d3k d3kVar = (d3k) this.d;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        ((nak) this.c).k((Object) null, new kek(true));
        this.d = na2.B((nx5) this.a, (CoroutineContext) null, (rx5) null, new r8h(this, u8gVar, (mt5) null, (byte) 23), 3);
    }

    public final void r(float f, float f2) {
        Object obj = this.a;
        ((zjn) obj).c(((lkn) this.e).getBounds(), ((lkn) this.e).b(), ((lkn) this.e).a(), f, f2);
        lkn lknVar = (lkn) this.e;
        zjn zjnVar = (zjn) obj;
        zjn zjnVar2 = lknVar.i;
        if (!zjnVar.equals(zjnVar2)) {
            zjnVar2.getClass();
            zjnVar2.a = zjnVar.a;
            zjnVar2.b = zjnVar.b;
            zjnVar2.c = zjnVar.c;
            lknVar.invalidateSelf();
        }
        ((emn) this.b).run();
    }

    public final void t() {
        v9j v9jVar = (v9j) this.d;
        SettingsManager settingsManager = (SettingsManager) this.a;
        v9jVar.r(new uzj(settingsManager.i("speed_dial.enabled"), settingsManager.x(), settingsManager.i("speed_dial.large_icons"), settingsManager.i("speed_dial.plus_button")));
    }
}
