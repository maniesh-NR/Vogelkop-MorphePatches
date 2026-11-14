package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaListItem;
import defpackage.awi;
import defpackage.ei;
import defpackage.khh;
import defpackage.l7j;
import defpackage.vzk;
import defpackage.wc7;
import defpackage.wx4;
import defpackage.yhe;
import defpackage.yvi;

/* loaded from: classes.dex */
public class OperaRadioGroup extends LinearLayout {
    public int a;
    public boolean b;
    public yvi c;
    public final wx4 d;
    public final yhe e;

    public OperaRadioGroup(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.e = new yhe((Object) this, (byte) 6);
        wx4 wx4Var = new wx4(this, (byte) 1);
        this.d = wx4Var;
        super.setOnHierarchyChangeListener(wx4Var);
        setImportantForAccessibility(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.v, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        if (resourceId != -1) {
            this.a = resourceId;
        }
        setOrientation(typedArrayObtainStyledAttributes.getInt(1, 1));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() {
        /*
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r4.getChildCount()
            if (r0 >= r2) goto L40
            android.view.View r2 = r4.getChildAt(r0)
            boolean r3 = r2 instanceof com.opera.android.custom_views.RadioButton
            if (r3 == 0) goto L23
            com.opera.android.custom_views.RadioButton r2 = (com.opera.android.custom_views.RadioButton) r2
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L3d
            java.lang.CharSequence r2 = r2.getText()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L3d
            goto L3b
        L23:
            boolean r3 = r2 instanceof com.opera.android.ui.catalog.widget.OperaListItem
            if (r3 == 0) goto L3d
            com.opera.android.ui.catalog.widget.OperaListItem r2 = (com.opera.android.ui.catalog.widget.OperaListItem) r2
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L3d
            bpd r2 = r2.A
            java.lang.String r2 = r2.D()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L3d
        L3b:
            int r1 = r1 + 1
        L3d:
            int r0 = r0 + 1
            goto L2
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.custom_views.OperaRadioGroup.a():int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (((view instanceof RadioButton) || (view instanceof OperaListItem)) && ((Checkable) view).isChecked()) {
            this.b = true;
            int i2 = this.a;
            if (i2 != -1) {
                c(i2, false);
            }
            this.b = false;
            b(view.getId());
        }
        super.addView(view, i, layoutParams);
    }

    public final void b(int i) {
        this.a = i;
        yvi yviVar = this.c;
        if (yviVar != null) {
            awi awiVar = yviVar.a;
            vzk vzkVar = awiVar.r;
            l7j l7jVar = (l7j) awi.y.get(i);
            SettingsManager settingsManager = ((wc7) vzkVar.b).a;
            settingsManager.getClass();
            settingsManager.V(l7jVar.ordinal(), "dns_over_https_mode");
            int id = ((OperaListItem) awiVar.u.c).getId();
            ei eiVar = awiVar.u;
            if (i == id) {
                eiVar.e.setVisibility(0);
            } else {
                eiVar.e.setVisibility(8);
            }
            awiVar.J0();
        }
    }

    public final void c(int i, boolean z) {
        KeyEvent.Callback callbackFindViewById = findViewById(i);
        if (callbackFindViewById instanceof Checkable) {
            ((Checkable) callbackFindViewById).setChecked(z);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return RadioGroup.class.getName();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.a;
        if (i != -1) {
            this.b = true;
            c(i, true);
            this.b = false;
            b(this.a);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getOrientation() == 0) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, a(), false, 1));
        } else {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(a(), 1, false, 1));
        }
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.d.b = onHierarchyChangeListener;
    }
}
