package defpackage;

import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.SuggestionProviderBridge;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j55 extends SuggestionProviderBridge implements ClipboardManager.OnPrimaryClipChangedListener {
    public final ViewGroup d;
    public final Context e;
    public final ClipboardManager f;
    public final xpm g;
    public final pde h;
    public final tsd i;
    public final brk j;
    public final oji k;
    public boolean l;
    public int m;
    public boolean n;
    public ClipDescription o;
    public i55 p;
    public final h55 q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.ViewTreeObserver$OnWindowFocusChangeListener, h55] */
    public j55(fe5 fe5Var, ViewGroup viewGroup, Context context, ClipboardManager clipboardManager, xpm xpmVar, pde pdeVar, tsd tsdVar, brk brkVar, oji ojiVar) {
        super(0);
        this.d = viewGroup;
        this.e = context;
        this.f = clipboardManager;
        this.g = xpmVar;
        this.h = pdeVar;
        this.i = tsdVar;
        this.j = brkVar;
        this.k = ojiVar;
        this.n = true;
        this.p = new i55("", null, null, false);
        ?? r6 = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: h55
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                if (z) {
                    this.a.onPrimaryClipChanged();
                }
            }
        };
        this.q = r6;
        clipboardManager.addPrimaryClipChangedListener(this);
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(r6);
        onPrimaryClipChanged();
        tsdVar.j(fe5Var, new cl4(new bo3(this, (byte) 26), (byte) 1));
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void cancel() {
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void g(String str, boolean z, boolean z2, yv4 yv4Var) {
        ArrayList arrayListJ;
        i55 i55VarH = h(str);
        j(i55VarH, false);
        Suggestion suggestion = i55VarH.b;
        if (suggestion == null || i55VarH.d) {
            Suggestion suggestion2 = i55VarH.c;
            arrayListJ = suggestion2 != null ? j95.j(new Suggestion[]{suggestion2}) : new ArrayList();
        } else {
            arrayListJ = j95.j(new Suggestion[]{suggestion});
        }
        yv4Var.d(arrayListJ);
    }

    public final i55 h(String str) {
        Suggestion suggestion = null;
        if (!this.l && str.length() != 0 && !((Boolean) this.h.g()).booleanValue() && !((Boolean) this.j.invoke()).booleanValue()) {
            String str2 = this.g.a.G;
            String str3 = !wqm.x(str2) ? str2 : null;
            if (str3 != null) {
                suggestion = new Suggestion(14, this.e.getString(2132021705), "", str3, null, null, Integer.MAX_VALUE, "", 0, -1, null);
            }
        }
        return new i55(str, suggestion, i(str), suggestion != null && ((Boolean) this.i.g()).booleanValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.opera.android.suggestion.Suggestion i(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j55.i(java.lang.String):com.opera.android.suggestion.Suggestion");
    }

    public final void j(i55 i55Var, boolean z) {
        Suggestion suggestion = i55Var.b;
        Suggestion suggestion2 = i55Var.c;
        boolean z2 = i55Var.d;
        if (i55Var.equals(this.p)) {
            return;
        }
        i55 i55Var2 = this.p;
        this.p = i55Var;
        boolean z3 = i55Var2.d;
        oji ojiVar = this.k;
        if (z3 != z2) {
            pde pdeVar = (pde) ((mrk) ojiVar.a).F.b;
            ((f55) pdeVar.g()).getClass();
            xf8.F0(pdeVar, new f55(z2));
        }
        if (suggestion2 != null && this.n) {
            this.n = false;
            this.m++;
        }
        if (z) {
            if (((!i55Var2.d ? i55Var2.b : null) != null) != ((!z2 ? suggestion : null) != null)) {
                if (z2) {
                    suggestion = null;
                }
                mrk mrkVar = (mrk) ojiVar.a;
                if (mrkVar.c()) {
                    hqk hqkVar = mrkVar.C;
                    if (suggestion == null) {
                        hqkVar.getClass();
                        hqkVar.I(null, 3, xpk.c);
                    } else {
                        hqkVar.getClass();
                        xpk xpkVar = xpk.c;
                        hqkVar.I(null, 3, xpkVar);
                        hqkVar.I(suggestion, 3, xpkVar);
                    }
                }
            }
            if ((i55Var2.c != null) != (suggestion2 != null)) {
                ojiVar.E(suggestion2);
            }
        }
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public final void onPrimaryClipChanged() {
        this.m = 0;
        this.n = true;
        this.o = this.f.getPrimaryClipDescription();
        if (this.k.E(i(this.p.a)) && this.n) {
            this.n = false;
            this.m++;
        }
    }
}
