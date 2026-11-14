package defpackage;

import J.N;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import org.chromium.content.browser.RenderWidgetHostViewImpl;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;

/* loaded from: classes.dex */
public final class ue extends d43 {
    public final ye e;
    public final q6e f;
    public final orm g;
    public final SelectionPopupControllerImpl h;
    public final ivn i;
    public final g1j j;
    public final jv0 k;
    public final ole l;
    public final te m;
    public MenuItem n;

    /* JADX WARN: Illegal instructions before constructor call */
    public ue(Context context, ye yeVar, ivn ivnVar, g1j g1jVar, q6e q6eVar, orm ormVar, jv0 jv0Var, te teVar) {
        boolean z = yeVar instanceof SelectionPopupControllerImpl;
        super(context, new eme(z ? (SelectionPopupControllerImpl) yeVar : null), hrj.f);
        this.e = yeVar;
        this.m = teVar;
        this.f = q6eVar;
        this.g = ormVar;
        SelectionPopupControllerImpl selectionPopupControllerImpl = z ? (SelectionPopupControllerImpl) yeVar : null;
        this.h = selectionPopupControllerImpl;
        this.i = ivnVar;
        this.j = g1jVar;
        this.k = jv0Var;
        this.c.e = 2131364191;
        ole oleVar = new ole(this);
        this.l = oleVar;
        selectionPopupControllerImpl.M = new pad(context, oleVar, (byte) 2);
    }

    @Override // defpackage.d43
    public final String b() {
        return this.e.z;
    }

    public final void c(int i) {
        String strR = xih.r(1000, this.e.z);
        if (TextUtils.isEmpty(strR)) {
            return;
        }
        x5f x5fVar = (x5f) this.g;
        if (x5fVar.h) {
            x5fVar.o(14);
        }
        this.i.d(i, strR);
    }

    @Override // defpackage.d43, android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (!super.onActionItemClicked(actionMode, menuItem)) {
            SelectionPopupControllerImpl selectionPopupControllerImpl = this.e;
            if (selectionPopupControllerImpl.g()) {
                if (menuItem == this.n || menuItem.getItemId() == 2131364202) {
                    c(1);
                    selectionPopupControllerImpl.e();
                    return true;
                }
                if (menuItem.getItemId() == 2131364190) {
                    this.k.l(selectionPopupControllerImpl.z);
                    selectionPopupControllerImpl.e();
                    return true;
                }
                if (menuItem.getGroupId() == 2131364200 && menuItem.getIntent() != null && menuItem.getIntent().getComponent() != null) {
                    if (this.b.equals(menuItem.getIntent().getComponent().getPackageName()) && "android.intent.action.PROCESS_TEXT".equals(menuItem.getIntent().getAction())) {
                        if ("com.opera.android.SearchInOpera".equals(menuItem.getIntent().getComponent().getClassName())) {
                            c(3);
                        } else {
                            c(2);
                        }
                        selectionPopupControllerImpl.e();
                        return true;
                    }
                }
                if (menuItem.getItemId() != 2131361893) {
                    return selectionPopupControllerImpl.h(actionMode, menuItem);
                }
                this.j.k(selectionPopupControllerImpl.z);
                selectionPopupControllerImpl.e();
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    @Override // defpackage.d43, android.view.ActionMode.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreateActionMode(android.view.ActionMode r3, android.view.Menu r4) {
        /*
            r2 = this;
            ye r2 = r2.e
            org.chromium.content.browser.selection.SelectionPopupControllerImpl r2 = (org.chromium.content.browser.selection.SelectionPopupControllerImpl) r2
            org.chromium.ui.base.WindowAndroid r4 = r2.d
            r0 = 0
            if (r4 == 0) goto L2d
            b2b r4 = r4.f
            java.lang.Object r4 = r4.get()
            android.content.Context r4 = (android.content.Context) r4
            if (r4 != 0) goto L15
            r4 = 0
            goto L20
        L15:
            android.content.res.Resources r4 = r4.getResources()
            r1 = 2131492935(0x7f0c0047, float:1.8609336E38)
            int r4 = r4.getInteger(r1)
        L20:
            r1 = 2
            if (r4 < r1) goto L2d
            android.content.Context r2 = r2.c
            r4 = 2132017284(0x7f140084, float:1.9672842E38)
            java.lang.String r2 = r2.getString(r4)
            goto L2e
        L2d:
            r2 = r0
        L2e:
            r3.setTitle(r2)
            r3.setSubtitle(r0)
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue.onCreateActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }

    @Override // defpackage.d43, android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        super.onDestroyActionMode(actionMode);
        this.n = null;
        SelectionPopupControllerImpl selectionPopupControllerImpl = this.e;
        selectionPopupControllerImpl.n = null;
        selectionPopupControllerImpl.o.d(Boolean.valueOf(selectionPopupControllerImpl.D()));
        if (selectionPopupControllerImpl.y) {
            RenderWidgetHostViewImpl renderWidgetHostViewImplH = selectionPopupControllerImpl.e.h();
            if (renderWidgetHostViewImplH != null) {
                long j = renderWidgetHostViewImplH.a;
                if (j != 0) {
                    N.MQWja$xA(j);
                }
            }
            selectionPopupControllerImpl.r();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        this.e.m(rect);
        te teVar = this.m;
        int iMax = Math.max(0, teVar.i());
        int iMax2 = Math.max(0, teVar.d());
        if (iMax == 0 && iMax2 == 0) {
            return;
        }
        Rect rect2 = new Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect2.offset(-iArr[0], -iArr[1]);
        int iMax3 = Math.max(rect2.top, iMax);
        int iMin = Math.min(rect2.bottom, view.getHeight() - iMax2);
        int iA = fan.a(64.0f, view.getResources());
        int iMin2 = Math.min(rect.top, iMin);
        rect.top = iMin2;
        if (iMin2 - iMax3 < iA) {
            int i = rect.bottom;
            if (iMin - i >= iA) {
                rect.top = rect2.top;
                return;
            }
            int i2 = iMax3 + iA;
            rect.top = i2;
            if (i < i2) {
                rect.bottom = i2;
            }
        }
    }

    @Override // defpackage.d43, android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) throws Resources.NotFoundException {
        this.e.n(menu);
        super.onPrepareActionMode(actionMode, menu);
        String strB = b();
        this.n = null;
        if (strB != null && this.l.E(strB)) {
            Context context = this.a;
            String string = context.getResources().getString(2132020994);
            if (menu.findItem(R.id.textAssist) != null || menu.findItem(2131364709) != null) {
                MenuItem menuItemAdd = menu.add(2131364194, 2131364202, 1, string);
                this.n = menuItemAdd;
                menuItemAdd.setShowAsActionFlags(2);
                return true;
            }
            int iA = fan.a(24.0f, context.getResources());
            this.n = menu.add(2131364191, R.id.textAssist, 0, string);
            this.n.setIcon(eti.d(this.f.b(), context, iA));
        }
        return true;
    }
}
