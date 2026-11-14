package defpackage;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputEditText;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.startup.ContentWrapperLayout;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.android.widget.spotlightcarousel.SpotlightCarouselLayoutManager;
import com.opera.android.widget.spotlightcarousel.SpotlightCarouselRecyclerView;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.chromium.base.ScreenStateReceiver;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.media.capture.ScreenCapture;

/* loaded from: classes.dex */
public final /* synthetic */ class mni implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mni(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [android.view.View, com.opera.android.widget.spotlightcarousel.SpotlightCarouselRecyclerView] */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        d06 d06Var;
        PopupWindow popupWindow;
        pw1 pw1Var;
        fvl fvlVar;
        View view;
        byte b = this.a;
        String string = null;
        string = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                AtomicReference atomicReference = ScreenCapture.d;
                ((ScreenCapture) obj).c = null;
                return;
            case 1:
                ScreenStateReceiver screenStateReceiver = ScreenStateReceiver.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                t8.Q(t8.a, (ScreenStateReceiver) obj, intentFilter);
                return;
            case 2:
                ((s4f) obj).invoke();
                return;
            case 3:
                ((can) obj).d();
                return;
            case 4:
                yyi yyiVar = (yyi) obj;
                yyiVar.I0();
                se seVar = yyiVar.m;
                if (seVar != null) {
                    seVar.g();
                    return;
                }
                return;
            case 5:
                tn tnVar = (tn) obj;
                if (tnVar.a) {
                    tnVar.a = false;
                    ((wci) tnVar.b).o(rjf.c);
                    return;
                }
                return;
            case 6:
                SelectionPopupControllerImpl selectionPopupControllerImpl = (SelectionPopupControllerImpl) obj;
                int iW = selectionPopupControllerImpl.w();
                if (iW == 0) {
                    selectionPopupControllerImpl.e();
                } else if (iW == 1 && (d06Var = selectionPopupControllerImpl.H) != null && (popupWindow = (PopupWindow) d06Var.a) != null) {
                    popupWindow.dismiss();
                    d06Var.a = null;
                }
                selectionPopupControllerImpl.P = null;
                return;
            case 7:
                ((m59) obj).k();
                return;
            case 8:
                j6j j6jVar = (j6j) obj;
                k6j k6jVar = j6jVar.c;
                xtb[] xtbVarArr = k6j.x;
                if (k6jVar.i0()) {
                    Rect rect = new Rect();
                    k6jVar.H0().c.getHitRect(rect);
                    i = rect.bottom;
                }
                j6jVar.a = i;
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                TextInputEditText textInputEditText = (OperaTextInputEditText) obj;
                xtb[] xtbVarArr2 = c9j.w;
                l5b l5bVar = q9n.c;
                q9n.G(textInputEditText.getContext(), textInputEditText);
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((nrl) obj).K();
                return;
            case 11:
                ((tmi) obj).invoke(Boolean.TRUE);
                return;
            case 12:
                shf shfVar = (shf) obj;
                synchronized (((ArrayDeque) shfVar.b)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) shfVar.a).edit();
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) shfVar.b).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append(",");
                    }
                    editorEdit.putString("topic_operation_queue", sb.toString()).apply();
                }
                return;
            case 13:
                oq3 oq3Var = (oq3) obj;
                oq3Var.c = false;
                SideSheetBehavior sideSheetBehavior = oq3Var.e;
                x5n x5nVar = sideSheetBehavior.i;
                if (x5nVar != null && x5nVar.f()) {
                    oq3Var.a(oq3Var.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.y(oq3Var.b);
                        return;
                    }
                    return;
                }
            case 14:
                ghf ghfVar = (ghf) obj;
                nya nyaVar = (nya) ghfVar.d;
                if (nyaVar != null) {
                    oya.a(nyaVar);
                }
                ((bnj) ghfVar.c).f(true);
                return;
            case 15:
                ((xnj) obj).invoke(null);
                return;
            case 16:
                ((juj) ((zfe) obj).c).y++;
                return;
            case 17:
                ((uyj) obj).e.invoke();
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                ((w6j) obj).b();
                return;
            case 19:
                g0k g0kVar = (g0k) obj;
                int i = g0k.l;
                Surface surface = g0kVar.h;
                if (surface != null) {
                    Iterator it2 = g0kVar.a.iterator();
                    while (it2.hasNext()) {
                        ((mi8) it2.next()).a.R0((Object) null);
                    }
                }
                SurfaceTexture surfaceTexture = g0kVar.g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                g0kVar.g = null;
                g0kVar.h = null;
                return;
            case SizeUtil.textSize0 /* 20 */:
                ?? r0 = (SpotlightCarouselRecyclerView) obj;
                SpotlightCarouselLayoutManager spotlightCarouselLayoutManager = r0.K0;
                if (spotlightCarouselLayoutManager != null) {
                    spotlightCarouselLayoutManager.startSmoothScroll(new v1k(spotlightCarouselLayoutManager.f, r0.getContext(), spotlightCarouselLayoutManager));
                    return;
                }
                return;
            case 21:
                ((c5k) obj).m();
                return;
            case SizeUtil.textSize1 /* 22 */:
                x4k x4kVar = (x4k) obj;
                x4kVar.e.B.removeOnPageChangeListener(x4kVar);
                return;
            case 23:
                j9k j9kVar = (j9k) obj;
                if (j9kVar.d()) {
                    return;
                }
                String strA0 = oup.a0(6, vtp.G(1, j9kVar.a));
                if (strA0 != null && !StringsKt.N(strA0)) {
                    string = StringsKt.l0(strA0).toString();
                }
                if (string != null) {
                    j9kVar.e(string);
                    return;
                }
                if (j9kVar.d()) {
                    return;
                }
                i9k i9kVar = new i9k(j9kVar);
                j9kVar.e = i9kVar;
                vzk vzkVar = xw1.b;
                ((i7f) vzkVar.b).b(i9kVar);
                synchronized (vzkVar.c) {
                    pw1Var = (pw1) vzkVar.d;
                }
                if (pw1Var != null) {
                    i9kVar.a(pw1Var);
                    return;
                }
                return;
            case SizeUtil.textSize2 /* 24 */:
                m9k m9kVar = (m9k) obj;
                m9kVar.h = null;
                m9kVar.R(true);
                return;
            case 25:
                o9k o9kVar = (o9k) obj;
                if (o9kVar.k) {
                    or2 or2Var = o9kVar.g;
                    if (or2Var == null) {
                        or2Var = null;
                    }
                    int measuredHeight = ((ConstraintLayout) or2Var.b).getMeasuredHeight();
                    or2 or2Var2 = o9kVar.g;
                    if (or2Var2 == null) {
                        or2Var2 = null;
                    }
                    int top = ((OperaMaterialButton) or2Var2.e).getTop();
                    or2 or2Var3 = o9kVar.g;
                    if (or2Var3 == null) {
                        or2Var3 = null;
                    }
                    ViewGroup.LayoutParams layoutParams = ((OperaMaterialButton) or2Var3.e).getLayoutParams();
                    float f = (measuredHeight - (top - ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r5.topMargin : 0))) / 3.0f;
                    PathInterpolator pathInterpolator = d0n.j;
                    or2 or2Var4 = o9kVar.g;
                    if (or2Var4 == null) {
                        or2Var4 = null;
                    }
                    uyg.c((OperaMaterialButton) or2Var4.e, f);
                    or2 or2Var5 = o9kVar.g;
                    uyg.c((ContentWrapperLayout) (or2Var5 != null ? or2Var5 : null).d, f);
                    return;
                }
                return;
            case 26:
                ((wzg) obj).c = null;
                return;
            case 27:
                ev7 ev7Var = (ev7) obj;
                ev7Var.c = false;
                c5l c5lVar = (c5l) ((oji) ev7Var.j).a;
                pde pdeVar = (pde) ev7Var.g;
                RecyclerView recyclerView = (RecyclerView) ev7Var.f;
                LinkedHashMap linkedHashMap = (LinkedHashMap) ev7Var.b;
                Iterator it3 = linkedHashMap.values().iterator();
                while (true) {
                    float f2 = 0.0f;
                    if (it3.hasNext()) {
                        sck sckVar = (sck) it3.next();
                        sckVar.b.setEmpty();
                        sckVar.c = 0.0f;
                    } else {
                        boolean z = recyclerView.getLayoutDirection() == 1;
                        oxj oxjVar = ((eyj) pdeVar.g()).j;
                        h6n it4 = new g6n(recyclerView).iterator();
                        while (true) {
                            h6n h6nVar = it4;
                            if (!h6nVar.hasNext()) {
                                linkedHashMap.values().removeIf(new zx1(new n6k((Object) ev7Var, (byte) 10), (byte) 17));
                                pde pdeVar2 = (pde) ev7Var.k;
                                j7h j7hVar = ((eyj) pdeVar.g()).i;
                                if ((j7hVar instanceof wxj) || (j7hVar instanceof xxj)) {
                                    fvlVar = fvl.c;
                                } else {
                                    if (!Intrinsics.a(j7hVar, yxj.b)) {
                                        h9o.p();
                                        return;
                                    }
                                    for (uck uckVar : ((LinkedHashMap) ev7Var.l).values()) {
                                        int bottom = uckVar.a.a.getBottom();
                                        if (i < bottom) {
                                            i = bottom;
                                        }
                                        float alpha = uckVar.a.a.getAlpha();
                                        if (f2 < alpha) {
                                            f2 = alpha;
                                        }
                                    }
                                    fvlVar = new fvl(i, f2);
                                }
                                xf8.F0(pdeVar2, fvlVar);
                                return;
                            }
                            View view2 = (View) h6nVar.next();
                            pkb pkbVarT = recyclerView.T(view2);
                            if (pkbVarT instanceof pkb) {
                                boolean z2 = pkbVarT instanceof h5l;
                                int iB = zed.b((z2 || !c5lVar.w.contains(pkbVarT)) ? 0.0f : ((i) pkbVarT).itemView.getTranslationX());
                                int iB2 = zed.b((z2 || !c5lVar.w.contains(pkbVarT)) ? 0.0f : ((i) pkbVarT).itemView.getTranslationY());
                                pkb pkbVar = pkbVarT;
                                int groupId = pkbVar.getGroupId();
                                if (groupId == 0 || pkbVar.d()) {
                                    view = view2;
                                } else {
                                    sxj sxjVar = oxjVar.b;
                                    view = view2;
                                    ev7Var.g(groupId, (view2.getLeft() - sxjVar.a(z)) + iB, (view2.getTop() - sxjVar.b) + iB2, view2.getRight() + sxjVar.b(z) + iB, view2.getBottom() + sxjVar.d + iB2, view2.getAlpha());
                                }
                                if (groupId != 0 && pkbVar.n()) {
                                    ev7Var.g(groupId, view.getLeft() + iB, view.getTop() + iB2, view.getRight() + iB, view.getBottom() + iB2, view.getAlpha());
                                }
                            }
                        }
                    }
                }
                break;
            case 28:
                kdk kdkVar = (kdk) obj;
                try {
                    try {
                        kdkVar.d.b(kdkVar.c);
                        kdkVar.d.b.getClass();
                        Method method = ngh.c;
                        if (method != null) {
                            try {
                                method.invoke(null, kdkVar);
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                            }
                        } else {
                            ngh.d.remove(kdkVar);
                        }
                        kdkVar.a.countDown();
                        synchronized (kdkVar.d.d) {
                            ldk ldkVar = kdkVar.d;
                            ldkVar.h = 3;
                            ldkVar.e();
                        }
                        return;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    kdkVar.d.b.getClass();
                    Method method2 = ngh.c;
                    if (method2 != null) {
                        try {
                            method2.invoke(null, kdkVar);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    } else {
                        ngh.d.remove(kdkVar);
                    }
                    kdkVar.a.countDown();
                    synchronized (kdkVar.d.d) {
                        ldk ldkVar2 = kdkVar.d;
                        ldkVar2.h = 3;
                        ldkVar2.e();
                        throw th;
                    }
                }
            default:
                m59 m59Var = (m59) obj;
                m59Var.e = null;
                Iterator it5 = ((HashSet) m59Var.d).iterator();
                while (it5.hasNext()) {
                    ((Runnable) it5.next()).run();
                }
                return;
        }
    }
}
