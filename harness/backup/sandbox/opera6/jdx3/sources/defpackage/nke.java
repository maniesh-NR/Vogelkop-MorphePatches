package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.NavigationEntry;
import com.opera.android.browser.NavigationHistory;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class nke extends o73 {
    public final Context j;
    public final b2l k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final HashMap o = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r1.n = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (((com.opera.android.browser.NavigationHistory) ((defpackage.iuh) r2).b).j() <= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r2.j() >= (r2.d() - 1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        r1.n = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nke(com.opera.android.BrowserActivity r2, defpackage.b2l r3, boolean r4, boolean r5) {
        /*
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.o = r0
            android.content.Context r2 = r2.getApplicationContext()
            r1.j = r2
            r1.k = r3
            r1.l = r4
            r1.m = r5
            d7l r3 = (defpackage.d7l) r3
            com.opera.android.browser.NavigationHistory r2 = r3.i()
            r3 = 1
            if (r4 == 0) goto L2c
            iuh r2 = (defpackage.iuh) r2
            java.lang.Object r2 = r2.b
            com.opera.android.browser.NavigationHistory r2 = (com.opera.android.browser.NavigationHistory) r2
            int r2 = r2.j()
            if (r2 > 0) goto L40
            goto L3d
        L2c:
            iuh r2 = (defpackage.iuh) r2
            java.lang.Object r2 = r2.b
            com.opera.android.browser.NavigationHistory r2 = (com.opera.android.browser.NavigationHistory) r2
            int r4 = r2.j()
            int r2 = r2.d()
            int r2 = r2 - r3
            if (r4 < r2) goto L40
        L3d:
            r1.n = r3
            return
        L40:
            r2 = 0
            r1.n = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nke.<init>(com.opera.android.BrowserActivity, b2l, boolean, boolean):void");
    }

    @Override // defpackage.o73
    public final int d(View view) {
        return 8388611;
    }

    @Override // defpackage.o73
    public final void m(r9i r9iVar, View view) {
        String strG;
        m66 m66Var = (m66) r9iVar.c;
        iuh iuhVar = (iuh) ((d7l) this.k).i();
        NavigationHistory navigationHistory = (NavigationHistory) iuhVar.b;
        int iJ = navigationHistory.j();
        int i = 1;
        while (true) {
            boolean z = this.l;
            iJ += z ? -1 : 1;
            if (iJ < 0 || iJ >= navigationHistory.d()) {
                break;
            }
            if (!navigationHistory.v(iJ)) {
                NavigationEntry navigationEntryI = iuhVar.i(iJ);
                if (z5i.a0(navigationEntryI.d())) {
                    strG = BrowserUtils.getDisplayString(navigationEntryI.d());
                } else {
                    String title = navigationEntryI.getTitle();
                    if (TextUtils.isEmpty(title)) {
                        String strD = navigationEntryI.d();
                        String[] strArr = wqm.a;
                        strG = aik.g(strD);
                    } else {
                        strG = title;
                    }
                }
                this.o.put(m66Var.a(0, 2, ((itd) m66Var).f.size(), strG), Integer.valueOf((z ? -1 : 1) * i));
                i++;
            }
        }
        ArrayList arrayList = ((itd) m66Var).f;
        ArrayList arrayList2 = ((itd) m66Var).f;
        ptd ptdVarA = m66Var.a(0, 0, arrayList.size(), "");
        ptdVarA.setActionView(2131558670);
        ptdVarA.setEnabled(false);
        m66Var.add(0, 0, arrayList2.size(), 2132019249).setIcon(2131232106);
        if (this.m) {
            m66Var.add(0, 1, arrayList2.size(), 2132018467).setIcon(2131231742);
        }
    }

    @Override // defpackage.o73
    public final void o(View view) {
        if (this.n) {
            return;
        }
        super.o(view);
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        Context context = this.j;
        if (itemId == 0) {
            Intent intentB = mdb.b(context);
            intentB.setAction("android.intent.action.MAIN");
            intentB.addCategory("android.intent.category.LAUNCHER");
            intentB.putExtra("DESTINATION_VIEW_ID", (int) j7c.f(2));
            intentB.setAction("ACTION_DESTINATION_VIEW");
            context.startActivity(intentB);
            return true;
        }
        if (menuItem.getItemId() != 1) {
            Integer num = (Integer) this.o.get(menuItem);
            if (num == null) {
                return false;
            }
            d7l d7lVar = (d7l) this.k;
            d7lVar.getClass();
            int iIntValue = num.intValue();
            d7lVar.q0(iIntValue, new br(d7lVar, iIntValue, (byte) 25));
            return true;
        }
        psp pspVar = wo3.K;
        uo3 uo3Var = uo3.TOOLBAR_MENU;
        pspVar.getClass();
        Bundle bundleJ = psp.j(uo3Var);
        Intent intentB2 = mdb.b(context);
        intentB2.setAction("android.intent.action.MAIN");
        intentB2.addCategory("android.intent.category.LAUNCHER");
        intentB2.putExtras(bundleJ);
        intentB2.putExtra("DESTINATION_VIEW_ID", 31);
        intentB2.setAction("ACTION_DESTINATION_VIEW");
        context.startActivity(intentB2);
        return true;
    }
}
