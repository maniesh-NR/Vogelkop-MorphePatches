package defpackage;

import J.N;
import android.graphics.drawable.Drawable;
import android.os.HandlerThread;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.leanplum.utils.SizeUtil;
import com.opera.android.bar.TopToolbarContainer;
import com.opera.android.browser.chromium.TurboDelegate;
import com.opera.android.translate_web_pages.NavEntryTranslationDataHelper;
import com.opera.android.undo.UndoBar;
import com.opera.android.widget.GraphView;
import com.opera.android.widget.ThumbScroller;
import com.usercentrics.sdk.ui.components.UCButton;
import com.usercentrics.sdk.ui.components.UCImageView;
import com.usercentrics.sdk.ui.components.UCToggle;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.TaskRunnerImpl;
import org.chromium.content.browser.input.TextSuggestionPopupController;

/* loaded from: classes.dex */
public final /* synthetic */ class cbl implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cbl(bp2 bp2Var, qya qyaVar) {
        this.a = (byte) 1;
        this.b = qyaVar;
    }

    public /* synthetic */ cbl(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        View viewFindFocus;
        xy4 xy4Var;
        byte b = this.a;
        int size = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((dbl) obj).b();
                return;
            case 1:
                Objects.requireNonNull((qya) obj);
                throw null;
            case 2:
                ((TaskRunnerImpl) obj).f();
                return;
            case 3:
                gel gelVar = (gel) obj;
                View view = gelVar.d;
                int i = gelVar.h;
                s9i s9iVar = gelVar.b;
                if (s9iVar.Y() && Intrinsics.a(gelVar.c.g(), gelVar.a)) {
                    float f = i;
                    if (Math.abs((view.getTranslationX() + view.getLeft()) - gelVar.f) <= f) {
                        if (Math.abs((view.getTranslationY() + view.getTop()) - gelVar.g) <= f) {
                            view.postOnAnimation(gelVar.e);
                            return;
                        }
                    }
                    s9iVar.h0();
                    return;
                }
                return;
            case 4:
                int[][] iArr = TextInputLayout.C0;
                ((TextInputLayout) obj).e.requestLayout();
                return;
            case 5:
                cjl cjlVar = (cjl) obj;
                ua7 ua7Var = cjlVar.b;
                cjlVar.n = null;
                dfe dfeVar = cjlVar.m;
                v31 v31Var = cjlVar.a;
                if (!v31Var.isFocused() && (viewFindFocus = v31Var.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    dfeVar.h();
                    return;
                }
                pqh pqhVar = new pqh();
                pqh pqhVar2 = new pqh();
                Object[] objArr = dfeVar.a;
                int i2 = dfeVar.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    bjl bjlVar = (bjl) objArr[i3];
                    int iOrdinal = bjlVar.ordinal();
                    if (iOrdinal == 0) {
                        Boolean bool = Boolean.TRUE;
                        pqhVar.a = bool;
                        pqhVar2.a = bool;
                    } else if (iOrdinal == 1) {
                        Boolean bool2 = Boolean.FALSE;
                        pqhVar.a = bool2;
                        pqhVar2.a = bool2;
                    } else if (iOrdinal != 2 && iOrdinal != 3) {
                        h9o.p();
                        return;
                    } else if (!Intrinsics.a(pqhVar.a, Boolean.FALSE)) {
                        pqhVar2.a = Boolean.valueOf(bjlVar == bjl.c);
                    }
                }
                dfeVar.h();
                if (Intrinsics.a(pqhVar.a, Boolean.TRUE)) {
                    ((InputMethodManager) ((l4c) ua7Var.c).getValue()).restartInput((v31) ua7Var.b);
                }
                Boolean bool3 = (Boolean) pqhVar2.a;
                if (bool3 != null) {
                    if (bool3.booleanValue()) {
                        ((rii) ((oji) ua7Var.d).a).y();
                    } else {
                        ((rii) ((oji) ua7Var.d).a).i();
                    }
                }
                if (Intrinsics.a(pqhVar.a, Boolean.FALSE)) {
                    ((InputMethodManager) ((l4c) ua7Var.c).getValue()).restartInput((v31) ua7Var.b);
                    return;
                }
                return;
            case 6:
                TextSuggestionPopupController textSuggestionPopupController = (TextSuggestionPopupController) obj;
                textSuggestionPopupController.h = null;
                textSuggestionPopupController.i = null;
                return;
            case 7:
                HandlerThread handlerThread = (HandlerThread) obj;
                handlerThread.quit();
                handlerThread.join(1000L);
                return;
            case 8:
                ExecutorService executorService = (ExecutorService) obj;
                executorService.shutdownNow();
                executorService.awaitTermination(1L, TimeUnit.SECONDS);
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((IntConsumer) obj).accept(2);
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ThumbScroller thumbScroller = (ThumbScroller) obj;
                int i4 = ThumbScroller.q;
                if (thumbScroller.g == 2) {
                    thumbScroller.setVisibility(4);
                    return;
                }
                return;
            case 11:
                n1 n1Var = (n1) obj;
                n1Var.b = null;
                n1Var.run();
                return;
            case 12:
                ((oql) obj).a();
                return;
            case 13:
                ltl ltlVar = (ltl) obj;
                if (ltlVar.getView() != null && ltlVar.o && ltlVar.isResumed()) {
                    List listF = ltlVar.getParentFragmentManager().c.f();
                    if (listF.isEmpty() || am2.l(1, listF) != ltlVar) {
                        return;
                    }
                    ltlVar.o = false;
                    ltlVar.p = true;
                    w parentFragmentManager = ltlVar.getParentFragmentManager();
                    parentFragmentManager.getClass();
                    a aVar = new a(parentFragmentManager);
                    aVar.j(ltlVar);
                    aVar.h();
                    parentFragmentManager.D();
                    a aVar2 = new a(parentFragmentManager);
                    aVar2.b(new xm9(ltlVar, 7));
                    aVar2.h();
                    parentFragmentManager.D();
                    ltlVar.p = false;
                    return;
                }
                return;
            case 14:
                TopToolbarContainer topToolbarContainer = (TopToolbarContainer) obj;
                int i5 = TopToolbarContainer.j;
                topToolbarContainer.d = false;
                if (!topToolbarContainer.isAttachedToWindow() || (xy4Var = topToolbarContainer.h) == null) {
                    return;
                }
                N.M_RC1fyW(xy4Var.d.a, 2131364811);
                return;
            case 15:
                ((ode) ((c5o) obj).a).r((Object) null);
                return;
            case 16:
                GraphView graphView = (GraphView) obj;
                ArrayList arrayListB = xi5.a(graphView.getContext()).f.b();
                int measuredWidth = graphView.getMeasuredWidth() / fan.a(24.0f, graphView.getResources());
                int iMax = Math.max(0, arrayListB.size() - measuredWidth);
                while (true) {
                    if (iMax < arrayListB.size()) {
                        if (((wi5) arrayListB.get(iMax)).d != 0) {
                            size = arrayListB.size() - iMax;
                        } else {
                            iMax++;
                        }
                    }
                }
                new t59(new o28(arrayListB), Math.min(Math.max(3, size), measuredWidth)).d(graphView);
                return;
            case 17:
                yg ygVar = (yg) obj;
                NavEntryTranslationDataHelper navEntryTranslationDataHelper = (NavEntryTranslationDataHelper) ygVar.d;
                boolean zF = v3m.f(((v3m) ygVar.c).a);
                if (navEntryTranslationDataHelper.h != zF) {
                    navEntryTranslationDataHelper.h = zF;
                    if (zF) {
                        navEntryTranslationDataHelper.b();
                        return;
                    }
                    return;
                }
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                ((p8f) obj).E();
                return;
            case 19:
                ((m6m) ((n9h) obj).c).e = null;
                return;
            case SizeUtil.textSize0 /* 20 */:
                c8m c8mVar = (c8m) obj;
                long jHashCode = c8mVar.hashCode();
                if (EarlyTraceEvent.b()) {
                    tq7 tq7Var = new tq7("TtsEngine:initialize_default", jHashCode, true);
                    synchronized (EarlyTraceEvent.c) {
                        if (EarlyTraceEvent.b()) {
                            EarlyTraceEvent.e.add(tq7Var);
                        }
                    }
                }
                if (TraceEvent.b) {
                    N.MHopMqLX("TtsEngine:initialize_default", jHashCode);
                }
                new zab(c8mVar, (byte) 1).b(fe2.e);
                return;
            case 21:
                String strG = vtp.G(2, ((TurboDelegate) obj).a);
                if (strG != null) {
                    N.M4C08WKl("install_referrer", strG);
                }
                N.MdrkO_AS();
                return;
            case SizeUtil.textSize1 /* 22 */:
                ((rbm) obj).a(x23.d, (m53) null);
                return;
            case 23:
                j14.m((UCButton) obj);
                return;
            case SizeUtil.textSize2 /* 24 */:
                cdm cdmVar = (cdm) obj;
                UCImageView uCImageView = (UCImageView) cdmVar.r.getValue();
                uCImageView.setEnabled(true);
                uCImageView.setImageDrawable((Drawable) cdmVar.s.getValue());
                j14.i(uCImageView);
                return;
            case 25:
                j14.m((afc) obj);
                return;
            case 26:
                ((RecyclerView) obj).requestLayout();
                return;
            case 27:
                int i6 = UCToggle.V;
                j14.l(4, (UCToggle) obj);
                return;
            case 28:
                UndoBar undoBar = (UndoBar) ((l46) obj).b;
                undoBar.k = false;
                undoBar.a(false);
                return;
            default:
                cqp.r0(((nmm) obj).s, lmm.a);
                return;
        }
    }
}
