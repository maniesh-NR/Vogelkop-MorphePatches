package com.usercentrics.sdk;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.leanplum.internal.ResourceQualifiers;
import com.usercentrics.sdk.PredefinedUIAlertDialogFactory;
import defpackage.h1a;
import defpackage.h3o;
import defpackage.k93;
import defpackage.odf;
import defpackage.oji;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJG\u0010%\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060#¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/usercentrics/sdk/PredefinedUIAlertDialogFactory;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "setLayoutParamsRecursively", "(Landroid/view/View;)V", "Lbz0;", "dialog", "", "isFullScreen", "Landroid/content/DialogInterface$OnShowListener;", "onShowListener", "(Lbz0;Z)Landroid/content/DialogInterface$OnShowListener;", "actualContent", "", "viewTagTranslatesToGravity", "safeAreScreenMode", "(Lbz0;Landroid/view/View;I)V", "fullScreenMode", "Landroid/view/Window;", "window", "applyEdgeToEdgeUI", "(Landroid/view/Window;)V", "applySafeInsets", "isAndroidPieOrHigher", "()Z", "Landroid/content/Context;", "context", "rootView", "cancelable", "statusBarIsCustomized", "fullscreen", "Lkotlin/Function0;", "onDismissCallback", "create", "(Landroid/content/Context;Landroid/view/View;ZZZLkotlin/jvm/functions/Function0;)Lbz0;", "reapplyContentSizing$usercentrics_ui_release", "(Lbz0;Z)V", "reapplyContentSizing", "usercentrics-ui_release"}, k = 1, mv = {1, h1a.ERROR_PRIVATE_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PredefinedUIAlertDialogFactory {

    @NotNull
    public static final PredefinedUIAlertDialogFactory INSTANCE = new PredefinedUIAlertDialogFactory();

    private PredefinedUIAlertDialogFactory() {
    }

    private final void applyEdgeToEdgeUI(Window window) {
        oji ojiVar = new oji(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        j3o j3oVar = i >= 35 ? new j3o(window, ojiVar) : i >= 30 ? new i3o(window, ojiVar) : new h3o(window, ojiVar);
        j3oVar.p(519);
        j3oVar.x();
    }

    private final void applySafeInsets(View view) {
        odf odfVar = new odf((byte) 25);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(view, odfVar);
        view.requestApplyInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g3o applySafeInsets$lambda$10(View view, g3o g3oVar) {
        r9b r9bVarI = g3oVar.a.i(ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL);
        r9b r9bVarI2 = g3oVar.a.i(519);
        view.setPadding(Math.max(r9bVarI.a, r9bVarI2.a), Math.max(r9bVarI.b, r9bVarI2.b), Math.max(r9bVarI.c, r9bVarI2.c), Math.max(r9bVarI.d, r9bVarI2.d));
        return g3oVar;
    }

    public static /* synthetic */ bz0 create$default(PredefinedUIAlertDialogFactory predefinedUIAlertDialogFactory, Context context, View view, boolean z, boolean z2, boolean z3, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        return predefinedUIAlertDialogFactory.create(context, view, z, z2, z3, function0);
    }

    private final void fullScreenMode(bz0 dialog, View actualContent, int viewTagTranslatesToGravity) {
        Window window = dialog.getWindow();
        if (window != null) {
            INSTANCE.applyEdgeToEdgeUI(window);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = viewTagTranslatesToGravity;
        actualContent.setLayoutParams(layoutParams);
        applySafeInsets(actualContent);
    }

    private final boolean isAndroidPieOrHigher() {
        return true;
    }

    private final DialogInterface.OnShowListener onShowListener(final bz0 dialog, final boolean isFullScreen) {
        return new DialogInterface.OnShowListener() { // from class: jpg
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PredefinedUIAlertDialogFactory.onShowListener$lambda$5(dialog, isFullScreen, dialogInterface);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onShowListener$lambda$5(bz0 bz0Var, boolean z, DialogInterface dialogInterface) {
        INSTANCE.reapplyContentSizing$usercentrics_ui_release(bz0Var, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reapplyContentSizing$lambda$6(int i, boolean z, bz0 bz0Var, View view) {
        boolean z2 = i == 0;
        if (z && z2) {
            INSTANCE.fullScreenMode(bz0Var, view, i);
        } else {
            INSTANCE.safeAreScreenMode(bz0Var, view, i);
        }
    }

    private final void safeAreScreenMode(bz0 dialog, View actualContent, int viewTagTranslatesToGravity) {
        int i = (int) (dialog.getContext().getResources().getDisplayMetrics().heightPixels / 1.25d);
        if (actualContent.getHeight() > i) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actualContent.getLayoutParams();
            layoutParams.height = i;
            layoutParams.gravity = viewTagTranslatesToGravity;
            actualContent.setLayoutParams(layoutParams);
        }
    }

    private final void setLayoutParamsRecursively(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof FrameLayout) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else if (parent instanceof LinearLayout) {
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        }
        view.setFitsSystemWindows(false);
        Object parent2 = view.getParent();
        View view2 = parent2 instanceof View ? (View) parent2 : null;
        if (view2 != null) {
            view2.setFitsSystemWindows(false);
        }
        Object parent3 = view.getParent();
        setLayoutParamsRecursively(parent3 instanceof View ? (View) parent3 : null);
    }

    @NotNull
    public final bz0 create(@NotNull Context context, @NotNull View rootView, boolean cancelable, boolean statusBarIsCustomized, boolean fullscreen, @NotNull Function0<Unit> onDismissCallback) {
        az0 az0Var = new az0(context, fullscreen ? 2132084399 : 2132084398);
        wy0 wy0Var = az0Var.a;
        wy0Var.k = cancelable;
        wy0Var.m = new k93(onDismissCallback, (byte) 1);
        az0Var.setView(rootView);
        bz0 bz0VarCreate = az0Var.create();
        PredefinedUIAlertDialogFactory predefinedUIAlertDialogFactory = INSTANCE;
        bz0VarCreate.setOnShowListener(predefinedUIAlertDialogFactory.onShowListener(bz0VarCreate, fullscreen));
        if (!cs5.Q(context)) {
            bz0VarCreate.show();
        }
        predefinedUIAlertDialogFactory.setLayoutParamsRecursively(rootView);
        Window window = bz0VarCreate.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.0f);
            ocp.p(window, false);
            window.getDecorView().setFitsSystemWindows(false);
            window.addFlags(512);
            if (predefinedUIAlertDialogFactory.isAndroidPieOrHigher()) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            if (!fullscreen && statusBarIsCustomized) {
                window.addFlags(Integer.MIN_VALUE);
            }
        }
        return bz0VarCreate;
    }

    public final void reapplyContentSizing$usercentrics_ui_release(@NotNull bz0 dialog, boolean isFullScreen) {
        ViewGroup viewGroup = (ViewGroup) dialog.findViewById(2131364862);
        Object tag = viewGroup != null ? viewGroup.getTag() : null;
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        int iIntValue = num != null ? num.intValue() : -1;
        if (iIntValue >= 0) {
            View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
            if (childAt != null) {
                childAt.post(new ipg(iIntValue, isFullScreen, dialog, childAt));
            }
        }
    }
}
