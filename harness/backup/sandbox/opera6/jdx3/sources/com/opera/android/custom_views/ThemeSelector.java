package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.opera.android.settings.SettingsManager;
import defpackage.bv1;
import defpackage.dll;
import defpackage.f7j;
import defpackage.hjf;
import defpackage.mu1;
import defpackage.q9n;
import defpackage.svk;
import defpackage.u8n;
import defpackage.xj;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ThemeSelector extends FrameLayout implements Checkable {
    public static final /* synthetic */ int f = 0;
    public xj a;
    public boolean b;
    public final TextView c;
    public final View d;
    public final View e;

    public ThemeSelector(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context).inflate(2131559441, (ViewGroup) this, true);
        this.c = (TextView) findViewById(2131363485);
        View viewFindViewById = findViewById(2131364210);
        this.d = viewFindViewById;
        viewFindViewById.setVisibility(8);
        View viewFindViewById2 = findViewById(2131364211);
        this.e = viewFindViewById2;
        viewFindViewById2.setVisibility(8);
        setForeground(sfe.M(new hxh(2130969436).k(context), context));
        svk svkVar = new svk(this, (byte) 6);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(getContext());
        if (dllVarV == null) {
            return;
        }
        u8n.b(dllVarV, this, svkVar);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.b;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(this.b);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        f03.g0(accessibilityNodeInfo, this.b);
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.b != z) {
            this.b = z;
            int i = z ? 0 : 8;
            this.d.setVisibility(i);
            this.e.setVisibility(i);
            xj xjVar = this.a;
            if (xjVar != null) {
                bv1 bv1Var = (bv1) xjVar.b;
                f7j f7jVar = (f7j) xjVar.c;
                f7j f7jVar2 = (f7j) bv1Var.e;
                if (f7jVar2 != f7jVar) {
                    int iIndexOf = ((ArrayList) bv1Var.d).indexOf(f7jVar2);
                    bv1Var.e = f7jVar;
                    if (iIndexOf > -1) {
                        bv1Var.notifyItemChanged(iIndexOf);
                    }
                }
                SettingsManager settingsManager = ((mu1) bv1Var.c).b.I0().b;
                settingsManager.getClass();
                settingsManager.V(f7jVar.ordinal(), "app_theme");
            }
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (this.b) {
            return;
        }
        setChecked(true);
    }
}
