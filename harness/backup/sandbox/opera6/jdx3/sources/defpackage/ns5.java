package defpackage;

import J.N;
import android.view.ViewGroup;
import com.opera.android.browser.chromium.contextmenu.ContextMenuHelperBridge;
import java.util.ArrayList;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class ns5 extends k73 {
    public final ContextMenuHelperBridge g;
    public final ArrayList h;

    public ns5(WebContents webContents, ViewGroup viewGroup, js5 js5Var, g1j g1jVar, jv0 jv0Var, wln wlnVar) {
        super(viewGroup, js5Var, g1jVar, jv0Var, wlnVar);
        this.g = new ContextMenuHelperBridge(webContents, this);
        this.h = new ArrayList();
    }

    @Override // defpackage.k73
    public final void t(ge5 ge5Var) {
        ContextMenuHelperBridge contextMenuHelperBridge = this.g;
        ge5 ge5Var2 = contextMenuHelperBridge.f;
        if (ge5Var2 != null) {
            contextMenuHelperBridge.f = new ge5(ge5Var2, ge5Var, (byte) 2);
            return;
        }
        long j = contextMenuHelperBridge.c;
        if (j == 0) {
            ge5Var.p((String) null, (byte[]) null);
        } else {
            contextMenuHelperBridge.f = ge5Var;
            N.M77a30vc(j);
        }
    }

    @Override // defpackage.k73
    public final void u(ge5 ge5Var) {
        ContextMenuHelperBridge contextMenuHelperBridge = this.g;
        ge5 ge5Var2 = contextMenuHelperBridge.e;
        if (ge5Var2 != null) {
            contextMenuHelperBridge.e = new ge5(ge5Var2, ge5Var, (byte) 3);
            return;
        }
        long j = contextMenuHelperBridge.c;
        if (j == 0) {
            ge5Var.n((String) null);
        } else {
            contextMenuHelperBridge.e = ge5Var;
            N.MC2MvdYg(j);
        }
    }

    @Override // defpackage.k73
    public final void v(int i, ks5 ks5Var, ls5 ls5Var) {
        ContextMenuHelperBridge contextMenuHelperBridge = this.g;
        contextMenuHelperBridge.a.add(new ms5(i, ks5Var, ls5Var));
        if (contextMenuHelperBridge.d == null) {
            contextMenuHelperBridge.a();
        }
    }

    @Override // defpackage.k73
    public final boolean y(qs5 qs5Var, boolean z) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((os5) obj).y(qs5Var, z)) {
                return true;
            }
        }
        return super.y(qs5Var, z);
    }
}
